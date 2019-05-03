/*     */ package Worker;
/*     */ 
/*     */ import Enum.Enum_Protocol_Ci;
/*     */ import Enum.Enum_Table_Ci;
/*     */ import Model.Dialog.Server_Log_Di;
/*     */ import Model.Dialog.Survey_List.Module_Client_Question;
/*     */ import Model.Dialog.Survey_List.Module_Client_Section;
/*     */ import Model.Dialog.Survey_List.Module_Client_Survey;
/*     */ import Model.Dialog.Survey_List.Module_Option;
/*     */ import Model.Dialog.Survey_List.Module_Question;
/*     */ import Model.Dialog.Survey_List.Module_Section;
/*     */ import Model.Dialog.Survey_List.Module_Survey;
/*     */ import Model.User;
/*     */ import com.google.gson.Gson;
/*     */ import java.io.DataInputStream;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.net.ServerSocket;
/*     */ import java.net.Socket;
/*     */ import java.sql.SQLException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.TreeMap;
/*     */ import javax.swing.JLabel;
/*     */ 
/*     */ public class Server extends Thread
/*     */ {
/*     */   private ServerSocket ss;
/*     */   private Socket cs;
/*     */   private java.net.InetSocketAddress ipep;
/*  34 */   int port = 9999;
/*     */   
/*     */ 
/*  37 */   private Database dbObject = new Database();
/*     */   
/*     */ 
/*  40 */   private static HashMap<User, DataOutputStream> client_output_hm = new HashMap();
/*     */   
/*     */   private Server_Log_Di server_log;
/*     */   private static JLabel person_ll;
/*     */   
/*     */   public Server(Server_Log_Di server_log, JLabel person_ll)
/*     */     throws SQLException
/*     */   {
/*  48 */     this.server_log = server_log;
/*  49 */     person_ll = person_ll;
/*     */   }
/*     */   
/*     */   public void run() {
/*     */     try {
/*  54 */       this.ss = new ServerSocket(this.port);
/*     */       
/*  56 */       Server_Log_Di.loadLog();
/*  57 */       Server_Log_Di.appendLog("서버 부팅... 초기화 완료");
/*     */       for (;;)
/*     */       {
/*  60 */         this.cs = this.ss.accept();
/*  61 */         Server_Log_Di.appendLog("알려지지 않은 클라이언트 접속");
/*     */         
/*  63 */         Receiver receiver = new Receiver(this.cs);
/*     */         
/*  65 */         receiver.start();
/*     */       }
/*     */     } catch (IOException e) {
/*  68 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */   
/*     */   public class Receiver extends Thread
/*     */   {
/*     */     DataInputStream in;
/*     */     DataOutputStream out;
/*  76 */     Socket socket = null;
/*     */     
/*     */     public Receiver(Socket socket) throws IOException {
/*  79 */       this.in = new DataInputStream(socket.getInputStream());
/*  80 */       this.out = new DataOutputStream(socket.getOutputStream());
/*     */       
/*  82 */       this.socket = socket;
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */     public void run()
/*     */     {
/*     */       try
/*     */       {
/*     */         for (;;)
/*     */         {
/*  93 */           String msg = this.in.readUTF();
/*     */           
/*  95 */           String[] command = msg.split("\\|");
/*     */           User u;
/*  97 */           if (command[0].equals(Enum_Protocol_Ci.LOGIN.getCode()))
/*     */           {
/*  99 */             Server_Log_Di.appendLog("[LOGIN 요청] ID : " + command[1]);
/*     */             
/* 101 */             Map<String, String> user = Database.getOneRow(Enum_Table_Ci.T001.getCode(), "ID", command[1]);
/*     */             
/* 103 */             if (user.isEmpty())
/*     */             {
/* 105 */               this.out.writeUTF(Enum_Protocol_Ci.LOGIN_FAIL.getCode());
/*     */               
/* 107 */               Server_Log_Di.appendLog("[LOGIN 실패] ID : " + command[1]);
/*     */             }
/* 109 */             else if (!((String)user.get("PW")).equals(command[2]))
/*     */             {
/* 111 */               this.out.writeUTF(Enum_Protocol_Ci.LOGIN_PASSWORDISNOTMATCH.getCode());
/*     */               
/* 113 */               Server_Log_Di.appendLog("[LOGIN 실패] ID : " + command[1]);
/*     */             }
/* 115 */             else if ((((String)user.get("ID")).equals(command[1])) && (((String)user.get("PW")).equals(command[2])))
/*     */             {
/* 117 */               u = new User(Server.this.cs.getInetAddress().toString(), (String)user.get("ID"));
/*     */               
/* 119 */               for (User ur : Server.client_output_hm.keySet())
/*     */               {
/* 121 */                 String ip = ur.getIP();
/* 122 */                 String id = ur.getID();
/*     */                 
/* 124 */                 if (u.getID().equals(id))
/*     */                 {
/* 126 */                   ((DataOutputStream)Server.client_output_hm.get(ur)).close();
/*     */                   
/* 128 */                   ((DataOutputStream)Server.client_output_hm.get(ur)).close();
/* 129 */                   Server.client_output_hm.remove(ur);
/*     */                 }
/*     */               }
/*     */               
/* 133 */               Server.client_output_hm.put(u, this.out);
/* 134 */               this.out.writeUTF(Enum_Protocol_Ci.LOGIN_CONFIRM.getCode() + "|" + (String)user.get("ID") + "|" + (String)user.get("PW") + "|" + (String)user.get("NAME") + "|" + (String)user.get("PHONE") + "|" + (String)user.get("GROUP"));
/*     */               
/* 136 */               Server_Log_Di.appendLog("[LOGIN 성공] ID : " + command[1] + ", IP : " + this.socket.getRemoteSocketAddress().toString() + " --- 접속 인원 : " + Server.client_output_hm.size());
/*     */             }
/*     */           }
/* 139 */           else if (command[0].equals(Enum_Protocol_Ci.DISCONNECT.getCode()))
/*     */           {
/* 141 */             this.out.writeUTF(Enum_Protocol_Ci.DISCONNECT.getCode());
/*     */             
/* 143 */             for (User ur : Server.client_output_hm.keySet())
/*     */             {
/* 145 */               String ip = ur.getIP();
/* 146 */               String id = ur.getID();
/*     */               
/* 148 */               if (command[1].equals(id))
/*     */               {
/* 150 */                 ((DataOutputStream)Server.client_output_hm.get(ur)).close();
/* 151 */                 Server.client_output_hm.remove(ur);
/*     */               }
/*     */             }
/*     */           }
/* 155 */           else if (command[0].equals(Enum_Protocol_Ci.CHECK.getCode()))
/*     */           {
/* 157 */             String[] idxCol = { "NAME", "PHONE" };
/* 158 */             String[] val = { command[1], command[2] };
/*     */             
/* 160 */             Map<String, String> user = Database.getUserInCheck(Enum_Table_Ci.T001.getCode(), idxCol, val);
/*     */             
/* 162 */             if (user.isEmpty())
/*     */             {
/* 164 */               this.out.writeUTF(Enum_Protocol_Ci.CHECK_FAIL.getCode());
/*     */               
/* 166 */               Server_Log_Di.appendLog("[LOGINCHECK 실패] 이름 : " + command[1] + ", PHONE : " + command[2]);
/*     */             }
/* 168 */             else if (!((String)user.get("PHONE")).equals(command[2]))
/*     */             {
/* 170 */               this.out.writeUTF(Enum_Protocol_Ci.CHECK_PHONENUMBERISNOTMATCH.getCode());
/*     */               
/* 172 */               Server_Log_Di.appendLog("[LOGINCHECK 실패] 이름 : " + command[1] + ", PHONE : " + command[2]);
/*     */             }
/* 174 */             else if ((((String)user.get("NAME")).equals(command[1])) && (((String)user.get("PHONE")).equals(command[2])))
/*     */             {
/* 176 */               this.out.writeUTF(Enum_Protocol_Ci.CHECK_CONFIRM.getCode() + "|" + (String)user.get("ID") + "|" + (String)user.get("PW"));
/*     */               
/* 178 */               Server_Log_Di.appendLog("[LOGINCHECK 성공] 이름 : " + command[1] + ", PHONE : " + command[2]);
/*     */             }
/*     */           }
/* 181 */           else if (command[0].equals(Enum_Protocol_Ci.GET_T001.getCode()))
/*     */           {
/* 183 */             List<Map<String, String>> data = Database.getData(Enum_Table_Ci.T003.getCode());
/*     */             
/* 185 */             String json = new Gson().toJson(data);
/* 186 */             this.out.writeUTF(json);
/*     */           }
/* 188 */           else if (command[0].equals(Enum_Protocol_Ci.GET_T003_BYCODE.getCode()))
/*     */           {
/* 190 */             Map<String, String> data = Database.getOneRow(Enum_Table_Ci.T003.getCode(), "IDF_CD", command[1]);
/*     */             
/* 192 */             String json = new Gson().toJson(data);
/* 193 */             this.out.writeUTF(json);
/*     */           }
/* 195 */           else if (command[0].equals(Enum_Protocol_Ci.PUSH_T010.getCode()))
/*     */           {
/* 197 */             String IDF_CD = command[1];
/* 198 */             String ID = command[2];
/* 199 */             String gson = command[3];
/*     */             
/* 201 */             String[] idxCol = { "IDF_CD", "ID" };
/* 202 */             String[] val = { IDF_CD, ID };
/*     */             
/* 204 */             if (!Database.hasClientSurvey(Enum_Table_Ci.T010.getCode(), idxCol, val))
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 211 */               String QUE_JSON = Database.getJSONData(Enum_Table_Ci.T003.getCode(), IDF_CD, "QUE_JSON");
/* 212 */               Module_Survey m_s = (Module_Survey)new Gson().fromJson(QUE_JSON, Module_Survey.class);
/* 213 */               Module_Client_Survey m_c_s = (Module_Client_Survey)new Gson().fromJson(gson, Module_Client_Survey.class);
/*     */               
/* 215 */               if (m_s.getHavePoint())
/*     */               {
/* 217 */                 for (int i = 0; i < m_s.getSection().size(); i++)
/*     */                 {
/* 219 */                   int point_s = ((Module_Section)m_s.getSection().get(i)).getPoint();
/*     */                   
/* 221 */                   int point_s_c = 0;
/*     */                   
/* 223 */                   for (int j = 0; j < ((Module_Section)m_s.getSection().get(i)).getQuestion().size(); j++)
/*     */                   {
/* 225 */                     int point_q = ((Module_Question)((Module_Section)m_s.getSection().get(i)).getQuestion().get(j)).getPoint();
/* 226 */                     String tp = ((Module_Question)((Module_Section)m_s.getSection().get(i)).getQuestion().get(j)).getType();
/*     */                     
/*     */ 
/* 229 */                     Map<String, String> map = ((Module_Client_Question)((Module_Client_Section)m_c_s.getSection().get(i)).getQuestion().get(j)).getAnswer();
/*     */                     String str1;
/* 231 */                     switch ((str1 = tp).hashCode()) {case -2018804923:  if (str1.equals("Linear")) {} case -768855440:  if ((goto 3317) || (str1.equals("OpenEnded"))) {} break; case -368370607:  if (str1.equals("DropDown")) {} break; case 175599017:  if (str1.equals("CheckBoxGrid")) {} break; case 718473776:  if (str1.equals("Multiple")) break; break; case 1033354689:  if (str1.equals("RadioGrid")) {} break; case 1601505219:  int point_option; if (!str1.equals("CheckBox"))
/*     */                       {
/*     */                         break label3317;
/* 234 */                         for (String key : map.keySet())
/*     */                         {
/* 236 */                           int idx_key = Integer.valueOf(key).intValue();
/*     */                           
/* 238 */                           point_option = ((Module_Option)((Module_Question)((Module_Section)m_s.getSection().get(i)).getQuestion().get(j)).getOption().get(idx_key)).getPoint();
/*     */                           
/* 240 */                           double temp_point = point_q / point_s * point_option / 100.0D * 100.0D;
/*     */                           
/* 242 */                           ((Module_Client_Question)((Module_Client_Section)m_c_s.getSection().get(i)).getQuestion().get(j)).setPoint((int)temp_point);
/*     */                           
/* 244 */                           point_s_c += (int)temp_point;
/*     */                         }
/*     */                       } else {
/* 247 */                         List<Module_Option> lt_temp = new ArrayList();
/* 248 */                         int ct_temp = 0;
/*     */                         
/* 250 */                         for (Module_Option m_o : ((Module_Question)((Module_Section)m_s.getSection().get(i)).getQuestion().get(j)).getOption())
/*     */                         {
/* 252 */                           if (m_o.getAnswer())
/*     */                           {
/* 254 */                             lt_temp.add(m_o); }
/*     */                         }
/*     */                         Iterator localIterator3;
/*     */                         Module_Option m_o;
/* 258 */                         for (point_option = map.keySet().iterator(); point_option.hasNext(); 
/*     */                             
/*     */ 
/*     */ 
/* 262 */                             localIterator3.hasNext())
/*     */                         {
/* 258 */                           String key = (String)point_option.next();
/*     */                           
/* 260 */                           int idx_key = Integer.valueOf(key).intValue();
/*     */                           
/* 262 */                           localIterator3 = lt_temp.iterator(); continue;m_o = (Module_Option)localIterator3.next();
/*     */                           
/* 264 */                           int temp_num = Integer.valueOf(m_o.getNumber()).intValue();
/*     */                           
/* 266 */                           if (temp_num - 1 == idx_key)
/*     */                           {
/* 268 */                             ct_temp++;
/*     */                           }
/*     */                         }
/*     */                         
/*     */ 
/* 273 */                         double temp_point = point_q / point_s * ct_temp / lt_temp.size() * 100.0D;
/*     */                         
/* 275 */                         ((Module_Client_Question)((Module_Client_Section)m_c_s.getSection().get(i)).getQuestion().get(j)).setPoint((int)temp_point);
/*     */                         
/* 277 */                         point_s_c += (int)temp_point;
/*     */                         break label3317;
/* 279 */                         int point_option; for (String key : map.keySet())
/*     */                         {
/* 281 */                           int idx_key = Integer.valueOf(key).intValue();
/*     */                           
/* 283 */                           point_option = ((Module_Option)((Module_Question)((Module_Section)m_s.getSection().get(i)).getQuestion().get(j)).getOption().get(idx_key)).getPoint();
/*     */                           
/* 285 */                           double temp_point_d = point_q / point_s * point_option / 100.0D * 100.0D;
/*     */                           
/* 287 */                           ((Module_Client_Question)((Module_Client_Section)m_c_s.getSection().get(i)).getQuestion().get(j)).setPoint((int)temp_point_d);
/*     */                           
/* 289 */                           point_s_c += (int)temp_point_d;
/*     */                         }
/*     */                         break label3317;
/* 292 */                         int min = Integer.valueOf(((Module_Option)((Module_Question)((Module_Section)m_s.getSection().get(i)).getQuestion().get(j)).getOption().get(0)).getNumber()).intValue();
/* 293 */                         int max = Integer.valueOf(((Module_Option)((Module_Question)((Module_Section)m_s.getSection().get(i)).getQuestion().get(j)).getOption().get(1)).getNumber()).intValue();
/*     */                         
/* 295 */                         for (String key : map.keySet())
/*     */                         {
/* 297 */                           int idx_key = Integer.valueOf(key).intValue();
/*     */                           
/* 299 */                           temp_point_d = point_q / point_s * (idx_key + 1) / (max - min + 1) * 100.0D;
/*     */                           
/* 301 */                           ((Module_Client_Question)((Module_Client_Section)m_c_s.getSection().get(i)).getQuestion().get(j)).setPoint((int)temp_point_d);
/*     */                           
/* 303 */                           point_s_c += (int)temp_point_d;
/*     */                         }
/*     */                         break label3317;
/* 306 */                         Object tg = new ArrayList();
/* 307 */                         List<Integer> pt = new ArrayList();
/*     */                         
/* 309 */                         for (int k = 0; k < ((Module_Question)((Module_Section)m_s.getSection().get(i)).getQuestion().get(j)).getOption().size(); k++)
/*     */                         {
/* 311 */                           if (((Module_Option)((Module_Question)((Module_Section)m_s.getSection().get(i)).getQuestion().get(j)).getOption().get(k)).getNumber().contains("r"))
/*     */                           {
/* 313 */                             ((List)tg).add(((Module_Option)((Module_Question)((Module_Section)m_s.getSection().get(i)).getQuestion().get(j)).getOption().get(k)).getTarget());
/* 314 */                             pt.add(Integer.valueOf(((Module_Option)((Module_Question)((Module_Section)m_s.getSection().get(i)).getQuestion().get(j)).getOption().get(k)).getPoint()));
/*     */                           }
/*     */                         }
/*     */                         
/* 318 */                         double temp_point_d = map.keySet().iterator(); if (temp_point_d.hasNext()) { String key = (String)temp_point_d.next();
/*     */                           
/* 320 */                           Object[] temp = map.values().toArray();
/*     */                           
/* 322 */                           double temp_point_d = 0.0D;
/*     */                           
/* 324 */                           int ctc = 0;
/*     */                           int point_temp;
/* 326 */                           for (int k = temp.length - 1; k >= 0; k--)
/*     */                           {
/* 328 */                             String temp_str = temp[k].toString().replaceAll("c", "");
/*     */                             
/* 330 */                             int select_client = Integer.valueOf(temp_str).intValue();
/* 331 */                             int target_survey = ((Integer)((List)((List)tg).get(ctc)).get(0)).intValue();
/* 332 */                             point_temp = ((Integer)pt.get(ctc)).intValue();
/*     */                             
/* 334 */                             if (select_client == target_survey)
/*     */                             {
/* 336 */                               temp_point_d += point_q / point_s * 1.0D * point_temp / 100.0D * 100.0D;
/*     */                             }
/*     */                             
/* 339 */                             ctc++;
/*     */                           }
/*     */                           
/* 342 */                           ((Module_Client_Question)((Module_Client_Section)m_c_s.getSection().get(i)).getQuestion().get(j)).setPoint((int)temp_point_d);
/*     */                           
/* 344 */                           point_s_c += (int)temp_point_d;
/*     */                           
/*     */ 
/*     */                           break label3317;
/*     */                           
/* 349 */                           List<List<Integer>> tg1 = new ArrayList();
/* 350 */                           List<Integer> pt1 = new ArrayList();
/*     */                           
/* 352 */                           for (int k = 0; k < ((Module_Question)((Module_Section)m_s.getSection().get(i)).getQuestion().get(j)).getOption().size(); k++)
/*     */                           {
/* 354 */                             if (((Module_Option)((Module_Question)((Module_Section)m_s.getSection().get(i)).getQuestion().get(j)).getOption().get(k)).getNumber().contains("r"))
/*     */                             {
/* 356 */                               tg1.add(((Module_Option)((Module_Question)((Module_Section)m_s.getSection().get(i)).getQuestion().get(j)).getOption().get(k)).getTarget());
/* 357 */                               pt1.add(Integer.valueOf(((Module_Option)((Module_Question)((Module_Section)m_s.getSection().get(i)).getQuestion().get(j)).getOption().get(k)).getPoint()));
/*     */                             }
/*     */                           }
/*     */                           
/* 361 */                           double temp_point_d = 0.0D;
/*     */                           
/* 363 */                           TreeMap<String, String> tm = new TreeMap(map);
/* 364 */                           for (int k = 0; k < tg1.size(); k++)
/*     */                           {
/* 366 */                             int istgCount = 0;
/*     */                             
/* 368 */                             for (int x = 0; x < ((List)tg1.get(k)).size(); x++)
/*     */                             {
/* 370 */                               int target_val = ((Integer)((List)tg1.get(k)).get(x)).intValue();
/*     */                               
/* 372 */                               for (String key : tm.keySet())
/*     */                               {
/* 374 */                                 String[] temp_arr = key.split("r");
/*     */                                 
/* 376 */                                 int temp_row = Integer.valueOf(temp_arr[0]).intValue();
/* 377 */                                 int temp_col = Integer.valueOf(temp_arr[1]).intValue();
/*     */                                 
/* 379 */                                 if ((temp_row == k) && (temp_col == target_val))
/*     */                                 {
/* 381 */                                   istgCount++;
/*     */                                 }
/*     */                               }
/*     */                             }
/* 385 */                             temp_point_d += point_q / point_s * istgCount / ((List)tg1.get(k)).size() * ((Integer)pt1.get(k)).intValue() / 100.0D * 100.0D;
/*     */                           }
/*     */                           
/* 388 */                           ((Module_Client_Question)((Module_Client_Section)m_c_s.getSection().get(i)).getQuestion().get(j)).setPoint((int)temp_point_d);
/*     */                           
/* 390 */                           point_s_c += (int)temp_point_d;
/*     */                         } }
/*     */                       break; }
/*     */                     label3317:
/* 394 */                     ((Module_Client_Section)m_c_s.getSection().get(i)).setPoint(point_s_c);
/*     */                   }
/*     */                 }
/*     */               }
/* 398 */               String[] data = { IDF_CD, ID, new Gson().toJson(m_c_s) };
/*     */               
/* 400 */               Database.insertData(Enum_Table_Ci.T010.getCode(), data);
/*     */               
/*     */ 
/* 403 */               String json = Database.getJSONData(Enum_Table_Ci.T003.getCode(), IDF_CD, "SURVEYD_JSON");
/* 404 */               List<String> lt = (List)new Gson().fromJson(json, List.class);
/* 405 */               lt.add(ID);
/*     */               
/* 407 */               String[] idx_sql = { "SURVEYD_JSON" };
/* 408 */               String[] beModify = { new Gson().toJson(lt) };
/*     */               
/* 410 */               Database.updateData(Enum_Table_Ci.T003.getCode(), idx_sql, beModify, IDF_CD);
/*     */               
/* 412 */               this.out.writeUTF("Client Survey PUSHED");
/*     */               
/* 414 */               Server_Log_Di.appendLog("[SURVEY PUSHED] ID : " + command[2] + ", IDF_CD : " + command[1]);
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       catch (Throwable localThrowable) {}
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public List<Map<String, String>> db_getData(Enum_Table_Ci table)
/*     */     throws SQLException
/*     */   {
/* 429 */     return Database.getData(table.getCode());
/*     */   }
/*     */   
/*     */   public List<Map<String, String>> db_getDataDoSearch(Enum_Table_Ci table, String searchIdx, String searchCtt) throws SQLException
/*     */   {
/* 434 */     return Database.getDataDoSearch(table.getCode(), searchIdx, searchCtt);
/*     */   }
/*     */   
/*     */   public List<Map<String, String>> db_getDataDoSearchBy(Enum_Table_Ci table, String group, String searchIdx, String searchCtt) throws SQLException
/*     */   {
/* 439 */     return Database.getDataDoSearchBy(table.getCode(), group, searchIdx, searchCtt);
/*     */   }
/*     */   
/*     */   public List<Map<String, String>> db_getDataDoList(Enum_Table_Ci table, String group) throws SQLException {
/* 443 */     return Database.getDataDoList(table.getCode(), group);
/*     */   }
/*     */   
/*     */   public void db_modifyData(Enum_Table_Ci table, String[] idx_sql, String[] original, String[] beModify) throws SQLException
/*     */   {
/* 448 */     this.dbObject.modifyData(table.getCode(), idx_sql, original, beModify);
/*     */   }
/*     */   
/*     */   public void db_addData(Enum_Table_Ci table, String[] idx_sql, String[] beAdd) throws SQLException {
/* 452 */     this.dbObject.addData(table.getCode(), idx_sql, beAdd);
/*     */   }
/*     */   
/*     */   public void db_addData(Enum_Table_Ci table, String idx_sql, String beAdd) throws SQLException {
/* 456 */     this.dbObject.addData(table.getCode(), idx_sql, beAdd);
/*     */   }
/*     */   
/*     */   public void db_updateGroupData(Enum_Table_Ci table, String pastName, Map<String, List<String[]>> groupData) throws SQLException
/*     */   {
/* 461 */     this.dbObject.updateGroupData(table.getCode(), pastName, groupData);
/*     */   }
/*     */   
/*     */   public void db_updateGroupDataInGroup(Enum_Table_Ci table, String pastName, String nodeName) throws SQLException {
/* 465 */     this.dbObject.updateGroupDataInGroup(table.getCode(), pastName, nodeName);
/*     */   }
/*     */   
/*     */   public void db_removeData(Enum_Table_Ci table, String[] idx_sql, String[] beRemove) throws SQLException {
/* 469 */     this.dbObject.removeData(table.getCode(), idx_sql, beRemove);
/*     */   }
/*     */   
/*     */   public void db_removeData(Enum_Table_Ci table, String idx_sql, String beRemove) throws SQLException {
/* 473 */     Database.removeData(table.getCode(), idx_sql, beRemove);
/*     */   }
/*     */   
/*     */   public void db_updateGroupDataByString(Enum_Table_Ci table, String idx_sql, List<String[]> list, String to)
/*     */     throws SQLException
/*     */   {
/* 479 */     this.dbObject.updateGroupDataByString(table.getCode(), idx_sql, list, to);
/*     */   }
/*     */   
/*     */   public void db_insertData(Enum_Table_Ci table, String[] beAdd) throws SQLException {
/* 483 */     Database.insertData(table.getCode(), beAdd);
/*     */   }
/*     */   
/*     */   public void db_removeDataAll(Enum_Table_Ci table, String idx_sql, String beRemove) throws SQLException {
/* 487 */     this.dbObject.removeDataAll(table.getCode(), idx_sql, beRemove);
/*     */   }
/*     */   
/*     */   public void db_jsonData(Enum_Table_Ci table, String idf_cd, String json, int isGROUPED) throws SQLException
/*     */   {
/* 492 */     this.dbObject.jsonData(table.getCode(), idf_cd, json, isGROUPED);
/*     */   }
/*     */   
/*     */   public void db_jsonData(Enum_Table_Ci table, String json) throws SQLException
/*     */   {
/* 497 */     this.dbObject.jsonData(table.getCode(), json);
/*     */   }
/*     */   
/*     */   public String db_getJSON(Enum_Table_Ci table, String idf_cd) throws SQLException {
/* 501 */     return this.dbObject.getJSON(table.getCode(), idf_cd);
/*     */   }
/*     */   
/*     */   public String db_getJSONP(Enum_Table_Ci table, String idf_cd) throws SQLException {
/* 505 */     return this.dbObject.getJSONP(table.getCode(), idf_cd);
/*     */   }
/*     */   
/*     */   public List<String> db_getJSON(Enum_Table_Ci table) throws SQLException
/*     */   {
/* 510 */     return Database.getJSON(table.getCode());
/*     */   }
/*     */   
/*     */   public void db_svyData(Enum_Table_Ci table, String idf_cd, String mainColor, String subColor, String json) throws SQLException
/*     */   {
/* 515 */     this.dbObject.svyData(table.getCode(), idf_cd, mainColor, subColor, json);
/*     */   }
/*     */   
/*     */   public static void setPersonLabel()
/*     */   {
/* 520 */     person_ll.setText("접속 인원 : " + client_output_hm.size() + "명");
/*     */   }
/*     */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Worker\Server.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */