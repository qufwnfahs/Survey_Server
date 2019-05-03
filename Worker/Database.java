/*     */ package Worker;
/*     */ 
/*     */ import Enum.Enum_Table_Ci;
/*     */ import java.io.PrintStream;
/*     */ import java.sql.Connection;
/*     */ import java.sql.DriverManager;
/*     */ import java.sql.ResultSet;
/*     */ import java.sql.ResultSetMetaData;
/*     */ import java.sql.SQLException;
/*     */ import java.sql.Statement;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ public class Database
/*     */ {
/*  21 */   Connection connection = null;
/*  22 */   static Statement st = null;
/*  23 */   static ResultSet rs = null;
/*  24 */   static ResultSetMetaData metaData = null;
/*     */   private Enum_Table_Ci enum_table;
/*     */   
/*     */   public Database()
/*     */     throws SQLException
/*     */   {
/*     */     try
/*     */     {
/*  32 */       Class.forName("com.mysql.jdbc.Driver");
/*  33 */       this.connection = DriverManager.getConnection("jdbc:mysql://localhost/jdu?useUnicode=true&characterEncoding=utf8", "root", "sjm156489");
/*  34 */       st = this.connection.createStatement();
/*     */     }
/*     */     catch (Exception localException) {}
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public static void modify(String table, String[] idx_sql, String[] original, String[] beModify)
/*     */     throws SQLException
/*     */   {
/*  44 */     String value = "";
/*  45 */     String condition = "";
/*     */     
/*  47 */     for (int i = 0; i < idx_sql.length; i++)
/*     */     {
/*  49 */       value = value + "`" + idx_sql[i] + "`='" + beModify[i] + "'";
/*  50 */       condition = condition + "`" + idx_sql[i] + "`='" + original[i] + "'";
/*     */       
/*  52 */       if (i != idx_sql.length - 1)
/*     */       {
/*  54 */         value = value + ", ";
/*  55 */         condition = condition + " AND ";
/*     */       }
/*     */     }
/*     */     
/*  59 */     String sql = "UPDATE " + table + " SET " + value + " WHERE " + condition;
/*  60 */     st.executeUpdate(sql);
/*     */   }
/*     */   
/*     */   public static String getJSONData(String table, String idf_cd, String idx) throws SQLException
/*     */   {
/*  65 */     String sql = "SELECT * FROM " + table + " WHERE `IDF_CD`='" + idf_cd + "' LIMIT 1";
/*  66 */     rs = st.executeQuery(sql);
/*     */     
/*  68 */     String json = "";
/*     */     
/*  70 */     if (rs.next())
/*     */     {
/*  72 */       json = rs.getString(idx);
/*     */     }
/*     */     
/*  75 */     return json;
/*     */   }
/*     */   
/*     */   public static String getJSONData(String table, String idf_cd, String id, String idx) throws SQLException
/*     */   {
/*  80 */     String sql = "SELECT * FROM " + table + " WHERE `IDF_CD`='" + idf_cd + "' AND `ID`='" + id + "' LIMIT 1";
/*  81 */     rs = st.executeQuery(sql);
/*     */     
/*  83 */     String json = "";
/*     */     
/*  85 */     if (rs.next())
/*     */     {
/*  87 */       json = rs.getString(idx);
/*     */     }
/*     */     
/*  90 */     return json;
/*     */   }
/*     */   
/*     */   public static boolean hasClientSurvey(String table, String[] idxCol, String[] val) throws SQLException
/*     */   {
/*  95 */     String condition = "";
/*     */     
/*  97 */     for (int i = 0; i < idxCol.length; i++)
/*     */     {
/*  99 */       condition = condition + "`" + idxCol[i] + "`='" + val[i] + "'";
/*     */       
/* 101 */       if (i != idxCol.length - 1)
/*     */       {
/* 103 */         condition = condition + " AND ";
/*     */       }
/*     */     }
/*     */     
/* 107 */     String sql = "SELECT * FROM " + table + " WHERE " + condition;
/* 108 */     rs = st.executeQuery(sql);
/*     */     
/* 110 */     if (rs.next())
/*     */     {
/* 112 */       return true;
/*     */     }
/* 114 */     return false;
/*     */   }
/*     */   
/*     */   public static Map<String, String> getOneRow(String table, String idxCol, String val) throws SQLException
/*     */   {
/* 119 */     Map<String, String> map = new HashMap();
/*     */     
/* 121 */     String sql = "SELECT * FROM " + table;
/* 122 */     rs = st.executeQuery(sql);
/* 123 */     metaData = rs.getMetaData();
/*     */     
/* 125 */     int sizeOfColumn = metaData.getColumnCount();
/*     */     
/*     */ 
/* 128 */     while (rs.next())
/*     */     {
/* 130 */       if (rs.getString(idxCol).equals(val))
/*     */       {
/* 132 */         for (int idxOfColumn = 0; idxOfColumn < sizeOfColumn; idxOfColumn++)
/*     */         {
/* 134 */           String column = metaData.getColumnName(idxOfColumn + 1);
/* 135 */           map.put(column, rs.getString(column));
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 140 */     return map;
/*     */   }
/*     */   
/*     */   public static Map<String, String> getUserInCheck(String table, String[] idxCol, String[] val) throws SQLException
/*     */   {
/* 145 */     String condition = "";
/*     */     
/* 147 */     for (int i = 0; i < idxCol.length; i++)
/*     */     {
/* 149 */       condition = condition + "`" + idxCol[i] + "`='" + val[i] + "'";
/*     */       
/* 151 */       if (i != idxCol.length - 1)
/*     */       {
/* 153 */         condition = condition + " AND ";
/*     */       }
/*     */     }
/*     */     
/* 157 */     Map<String, String> map = new HashMap();
/*     */     
/* 159 */     String sql = "SELECT * FROM " + table + " WHERE " + condition;
/* 160 */     rs = st.executeQuery(sql);
/* 161 */     metaData = rs.getMetaData();
/*     */     
/* 163 */     int sizeOfColumn = metaData.getColumnCount();
/*     */     int idxOfColumn;
/* 166 */     for (; 
/* 166 */         rs.next(); 
/*     */         
/* 168 */         idxOfColumn < sizeOfColumn) { idxOfColumn = 0; continue;
/*     */       
/* 170 */       String column = metaData.getColumnName(idxOfColumn + 1);
/* 171 */       map.put(column, rs.getString(column));idxOfColumn++;
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 175 */     return map;
/*     */   }
/*     */   
/*     */   public static boolean find(String table, String indexStr, String toFind) throws SQLException
/*     */   {
/* 180 */     String sql = "SELECT * FROM " + table;
/* 181 */     rs = st.executeQuery(sql);
/*     */     
/* 183 */     while (rs.next())
/*     */     {
/* 185 */       if (rs.getString(indexStr).equals(toFind))
/*     */       {
/* 187 */         return true;
/*     */       }
/*     */     }
/* 190 */     return false;
/*     */   }
/*     */   
/*     */   public void register(String id, String pw, String name) throws SQLException
/*     */   {
/* 195 */     String sql = "INSERT INTO t_user (id, pw, name) VALUES ('" + id + "', '" + pw + "', '" + name + "')";
/* 196 */     st.executeUpdate(sql);
/*     */   }
/*     */   
/*     */   public String findUser(String table, String indexStr, String toFind) throws SQLException
/*     */   {
/* 201 */     String sql = "SELECT * FROM " + table;
/* 202 */     rs = st.executeQuery(sql);
/*     */     
/* 204 */     while (rs.next())
/*     */     {
/* 206 */       if (rs.getString(indexStr).equals(toFind))
/*     */       {
/* 208 */         System.out.println("앙 찾았다");
/*     */       }
/*     */     }
/*     */     
/* 212 */     return null;
/*     */   }
/*     */   
/*     */   public String findData(String table, String indexStr, String toFind, String needGet) throws SQLException
/*     */   {
/* 217 */     String sql = "SELECT * FROM " + table;
/* 218 */     rs = st.executeQuery(sql);
/*     */     
/* 220 */     while (rs.next())
/*     */     {
/* 222 */       if (rs.getString(indexStr).equals(toFind))
/*     */       {
/* 224 */         return rs.getString(needGet);
/*     */       }
/*     */     }
/*     */     
/* 228 */     return null;
/*     */   }
/*     */   
/*     */   public static void insertData(String table, String[] dataList) throws SQLException
/*     */   {
/* 233 */     String sql = "INSERT INTO " + table + " VALUES (";
/*     */     
/* 235 */     for (int i = 0; i < dataList.length; i++)
/*     */     {
/* 237 */       String add = "'" + dataList[i] + "', ";
/*     */       
/* 239 */       sql = sql + add;
/*     */     }
/* 241 */     sql = sql + ")";
/*     */     
/* 243 */     st.executeUpdate(sql);
/*     */   }
/*     */   
/*     */   public void modifyData(String table, String[] idx_sql, String[] original, String[] beModify) throws SQLException
/*     */   {
/* 248 */     String value = "";
/* 249 */     String condition = "";
/*     */     
/* 251 */     for (int i = 0; i < idx_sql.length; i++)
/*     */     {
/* 253 */       value = value + "`" + idx_sql[i] + "`='" + beModify[i] + "'";
/* 254 */       condition = condition + "`" + idx_sql[i] + "`='" + original[i] + "'";
/*     */       
/* 256 */       if (i != idx_sql.length - 1)
/*     */       {
/* 258 */         value = value + ", ";
/* 259 */         condition = condition + " AND ";
/*     */       }
/*     */     }
/*     */     
/* 263 */     String sql = "UPDATE " + table + " SET " + value + " WHERE " + condition + " LIMIT 1";
/* 264 */     st.executeUpdate(sql);
/*     */   }
/*     */   
/*     */   public static void updateData(String table, String[] idx_sql, String[] beModify, String IDF_CD) throws SQLException
/*     */   {
/* 269 */     String value = "";
/*     */     
/* 271 */     for (int i = 0; i < idx_sql.length; i++)
/*     */     {
/* 273 */       value = value + "`" + idx_sql[i] + "`='" + beModify[i] + "'";
/*     */       
/* 275 */       if (i != idx_sql.length - 1)
/*     */       {
/* 277 */         value = value + ", ";
/*     */       }
/*     */     }
/*     */     
/* 281 */     String sql = "UPDATE " + table + " SET " + value + " WHERE `IDF_CD`='" + IDF_CD + "' LIMIT 1";
/* 282 */     st.executeUpdate(sql);
/*     */   }
/*     */   
/*     */   public static void updateData2(String table, String[] idx_sql, String[] beModify, String IDF_CD, String ID) throws SQLException
/*     */   {
/* 287 */     String value = "";
/*     */     
/* 289 */     for (int i = 0; i < idx_sql.length; i++)
/*     */     {
/* 291 */       value = value + "`" + idx_sql[i] + "`='" + beModify[i] + "'";
/*     */       
/* 293 */       if (i != idx_sql.length - 1)
/*     */       {
/* 295 */         value = value + ", ";
/*     */       }
/*     */     }
/*     */     
/* 299 */     String sql = "UPDATE " + table + " SET " + value + " WHERE `IDF_CD`='" + IDF_CD + "' AND `ID`='" + ID + "' LIMIT 1";
/* 300 */     st.executeUpdate(sql);
/*     */   }
/*     */   
/*     */   public void addData(String table, String[] idx_sql, String[] beAdd) throws SQLException
/*     */   {
/* 305 */     String value = "(";
/* 306 */     String condition = "(";
/*     */     
/* 308 */     for (int i = 0; i < idx_sql.length; i++)
/*     */     {
/* 310 */       value = value + "'" + beAdd[i] + "'";
/* 311 */       condition = condition + "`" + idx_sql[i] + "`";
/*     */       
/* 313 */       if (i != idx_sql.length - 1)
/*     */       {
/* 315 */         value = value + ", ";
/* 316 */         condition = condition + ", ";
/*     */       }
/*     */     }
/*     */     
/* 320 */     value = value + ")";
/* 321 */     condition = condition + ")";
/*     */     
/* 323 */     String sql = "INSERT INTO " + table + " " + condition + " VALUES " + value;
/* 324 */     st.executeUpdate(sql);
/*     */   }
/*     */   
/*     */   public void addData(String table, String idx_sql, String beAdd) throws SQLException
/*     */   {
/* 329 */     String value = "(";
/* 330 */     String condition = "(";
/*     */     
/* 332 */     value = value + "'" + beAdd + "'";
/* 333 */     condition = condition + "`" + idx_sql + "`";
/*     */     
/* 335 */     value = value + ")";
/* 336 */     condition = condition + ")";
/*     */     
/* 338 */     String sql = "INSERT INTO " + table + " " + condition + " VALUES " + value;
/* 339 */     st.executeUpdate(sql);
/*     */   }
/*     */   
/*     */   public void updateGroupData(String table, String pastName, Map<String, List<String[]>> groupData) throws SQLException
/*     */   {
/* 344 */     String value = "";
/* 345 */     String condition = "";
/*     */     
/* 347 */     Iterator<String> iterator = groupData.keySet().iterator();
/*     */     
/* 349 */     List<String> listSQL = new ArrayList();
/*     */     String key;
/* 351 */     int i; for (; iterator.hasNext(); 
/*     */         
/*     */ 
/*     */ 
/* 355 */         i < ((List)groupData.get(key)).size())
/*     */     {
/* 353 */       key = (String)iterator.next();
/*     */       
/* 355 */       i = 0; continue;
/*     */       
/* 357 */       String[] userInfo = (String[])((List)groupData.get(key)).get(i);
/*     */       
/* 359 */       String sql = "UPDATE " + table + " SET " + "`group`='" + key + "'" + " WHERE " + "`id`='" + userInfo[0] + "' AND `name`='" + userInfo[1] + "' AND `group`='" + pastName + "' LIMIT 1";
/*     */       
/* 361 */       listSQL.add(sql);i++;
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 365 */     for (String sql : listSQL)
/*     */     {
/* 367 */       st.executeUpdate(sql);
/*     */     }
/*     */   }
/*     */   
/*     */   public void updateGroupDataInGroup(String table, String pastName, String nodeName) throws SQLException
/*     */   {
/* 373 */     String value = "";
/* 374 */     String condition = "";
/*     */     
/* 376 */     String sql = "UPDATE " + table + " SET " + "`group`='" + nodeName + "'" + " WHERE " + "`group`='" + pastName + "' LIMIT 1";
/* 377 */     st.executeUpdate(sql);
/*     */   }
/*     */   
/*     */   public void removeData(String table, String[] idx_sql, String[] beRemove) throws SQLException
/*     */   {
/* 382 */     String condition = "";
/*     */     
/* 384 */     for (int i = 0; i < idx_sql.length; i++)
/*     */     {
/* 386 */       condition = condition + "`" + idx_sql[i] + "`='" + beRemove[i] + "'";
/*     */       
/* 388 */       if (i != idx_sql.length - 1)
/*     */       {
/* 390 */         condition = condition + " AND ";
/*     */       }
/*     */     }
/*     */     
/* 394 */     String sql = "DELETE FROM " + table + " WHERE " + condition + " LIMIT 1";
/* 395 */     st.executeUpdate(sql);
/*     */   }
/*     */   
/*     */   public static List<Map<String, String>> getData(String table) throws SQLException
/*     */   {
/* 400 */     List<Map<String, String>> list = new ArrayList();
/*     */     
/*     */ 
/* 403 */     String sql = "SELECT * FROM " + table;
/* 404 */     rs = st.executeQuery(sql);
/* 405 */     metaData = rs.getMetaData();
/*     */     
/* 407 */     int sizeOfColumn = metaData.getColumnCount();
/*     */     
/*     */ 
/* 410 */     while (rs.next())
/*     */     {
/* 412 */       Map<String, String> map = new HashMap();
/*     */       
/* 414 */       for (int idxOfColumn = 0; idxOfColumn < sizeOfColumn; idxOfColumn++)
/*     */       {
/* 416 */         String column = metaData.getColumnName(idxOfColumn + 1);
/* 417 */         map.put(column, rs.getString(column));
/*     */       }
/*     */       
/* 420 */       list.add(map);
/*     */     }
/*     */     
/* 423 */     return list;
/*     */   }
/*     */   
/*     */   public static List<Map<String, String>> getRow(String table, String idxCol, String val) throws SQLException
/*     */   {
/* 428 */     List<Map<String, String>> list = new ArrayList();
/*     */     
/*     */ 
/* 431 */     String sql = "SELECT * FROM " + table;
/* 432 */     rs = st.executeQuery(sql);
/* 433 */     metaData = rs.getMetaData();
/*     */     
/* 435 */     int sizeOfColumn = metaData.getColumnCount();
/*     */     
/*     */ 
/* 438 */     while (rs.next())
/*     */     {
/* 440 */       if (rs.getString(idxCol).equals(val))
/*     */       {
/* 442 */         Map<String, String> map = new HashMap();
/*     */         
/* 444 */         for (int idxOfColumn = 0; idxOfColumn < sizeOfColumn; idxOfColumn++)
/*     */         {
/* 446 */           String column = metaData.getColumnName(idxOfColumn + 1);
/* 447 */           map.put(column, rs.getString(column));
/*     */         }
/*     */         
/* 450 */         list.add(map);
/*     */       }
/*     */     }
/*     */     
/* 454 */     return list;
/*     */   }
/*     */   
/*     */   public static void removeData(String code, String idx_sql, String beRemove) throws SQLException
/*     */   {
/* 459 */     String condition = "";
/*     */     
/* 461 */     condition = condition + "`" + idx_sql + "`='" + beRemove + "'";
/*     */     
/* 463 */     String sql = "DELETE FROM " + code + " WHERE " + condition + " LIMIT 1";
/* 464 */     st.executeUpdate(sql);
/*     */   }
/*     */   
/*     */   public void removeDataAll(String code, String idx_sql, String beRemove) throws SQLException
/*     */   {
/* 469 */     String condition = "";
/*     */     
/* 471 */     condition = condition + "`" + idx_sql + "`='" + beRemove + "'";
/*     */     
/* 473 */     String sql = "DELETE FROM " + code + " WHERE " + condition;
/* 474 */     st.executeUpdate(sql);
/*     */   }
/*     */   
/*     */   public void updateGroupDataByString(String table, String groupName, List<String[]> list, String to) throws SQLException
/*     */   {
/* 479 */     String value = "";
/* 480 */     String condition = "";
/*     */     
/* 482 */     List<String> listSQL = new ArrayList();
/*     */     
/* 484 */     for (String[] userInfo : list)
/*     */     {
/* 486 */       String sql = "UPDATE " + table + " SET " + "`group`='" + to + "'" + " WHERE " + "`id`='" + userInfo[0] + "' AND `name`='" + userInfo[1] + "' AND `group`='" + groupName + "' LIMIT 1";
/*     */       
/* 488 */       listSQL.add(sql);
/*     */     }
/*     */     
/* 491 */     for (String sql : listSQL)
/*     */     {
/* 493 */       System.out.println(sql);
/* 494 */       st.executeUpdate(sql);
/*     */     }
/*     */   }
/*     */   
/*     */   public void jsonData(String table, String idf_cd, String json, int isGROUPED) throws SQLException
/*     */   {
/* 500 */     String sql = "SELECT * FROM " + table + " WHERE `IDF_CD`='" + idf_cd + "'";
/* 501 */     rs = st.executeQuery(sql);
/*     */     
/* 503 */     if (rs.next())
/*     */     {
/*     */ 
/* 506 */       String sql2 = "UPDATE " + table + " SET " + "`ALLOWED`='" + json + "' WHERE `IDF_CD`='" + idf_cd + "' LIMIT 1";
/* 507 */       st.executeUpdate(sql2);
/*     */ 
/*     */     }
/*     */     else
/*     */     {
/* 512 */       String sql2 = "INSERT INTO " + table + " VALUES " + "('" + idf_cd + "', '" + json + "')";
/* 513 */       st.executeUpdate(sql2);
/*     */     }
/*     */     
/* 516 */     String sql3 = "UPDATE " + Enum_Table_Ci.T003.getCode() + " SET " + "`GROUP_BL`='" + isGROUPED + "' WHERE `IDF_CD`='" + idf_cd + "' LIMIT 1";
/* 517 */     st.executeUpdate(sql3);
/*     */   }
/*     */   
/*     */   public void jsonData(String table, String json) throws SQLException
/*     */   {
/* 522 */     String sql2 = "UPDATE " + table + " SET " + "`ALLOWED`='" + json + "'";
/* 523 */     st.executeUpdate(sql2);
/*     */   }
/*     */   
/*     */   public String getJSON(String table, String idf_cd) throws SQLException
/*     */   {
/* 528 */     String sql = "SELECT * FROM " + table + " WHERE `IDF_CD`='" + idf_cd + "' LIMIT 1";
/* 529 */     rs = st.executeQuery(sql);
/*     */     
/* 531 */     String json = "";
/*     */     
/* 533 */     if (rs.next())
/*     */     {
/* 535 */       json = rs.getString("allowed");
/*     */     }
/*     */     
/* 538 */     return json;
/*     */   }
/*     */   
/*     */   public String getJSONP(String table, String idf_cd) throws SQLException
/*     */   {
/* 543 */     String sql = "SELECT * FROM " + table + " WHERE `IDF_CD`='" + idf_cd + "' LIMIT 1";
/* 544 */     rs = st.executeQuery(sql);
/*     */     
/* 546 */     String json = "";
/*     */     
/* 548 */     if (rs.next())
/*     */     {
/* 550 */       json = rs.getString("QUESTION");
/*     */     }
/*     */     
/* 553 */     return json;
/*     */   }
/*     */   
/*     */   public static List<String> getJSON(String table) throws SQLException
/*     */   {
/* 558 */     String sql = "SELECT * FROM " + table;
/* 559 */     rs = st.executeQuery(sql);
/*     */     
/* 561 */     List<String> jsonList = new ArrayList();
/*     */     
/* 563 */     String json = "";
/*     */     
/* 565 */     if (rs.next())
/*     */     {
/* 567 */       json = rs.getString("allowed");
/* 568 */       jsonList.add(json);
/*     */     }
/*     */     
/* 571 */     return jsonList;
/*     */   }
/*     */   
/*     */   public void svyData(String table, String idf_cd, String mainColor, String subColor, String json) throws SQLException
/*     */   {
/* 576 */     String sql = "SELECT * FROM " + table + " WHERE `IDF_CD`='" + idf_cd + "'";
/* 577 */     rs = st.executeQuery(sql);
/*     */     
/* 579 */     if (rs.next())
/*     */     {
/*     */ 
/* 582 */       String sql2 = "UPDATE " + table + " SET " + "`MAINCOLOR_CD`='" + mainColor + "', `SUBCOLOR_CD`='" + subColor + "', `QUESTION`='" + json + "' WHERE `IDF_CD`='" + idf_cd + "' LIMIT 1";
/* 583 */       st.executeUpdate(sql2);
/*     */ 
/*     */     }
/*     */     else
/*     */     {
/* 588 */       String sql2 = "INSERT INTO " + table + " VALUES " + "('" + idf_cd + "', '" + mainColor + "', '" + subColor + "', '" + json + "')";
/* 589 */       st.executeUpdate(sql2);
/*     */     }
/*     */     
/* 592 */     String sql3 = "UPDATE " + Enum_Table_Ci.T003.getCode() + " SET " + "`CREATED_BL`='" + 1 + "' WHERE `IDF_CD`='" + idf_cd + "' LIMIT 1";
/* 593 */     st.executeUpdate(sql3);
/*     */   }
/*     */   
/*     */   public static List<Map<String, String>> getDataDoSearch(String table, String searchIdx, String searchCtt) throws SQLException
/*     */   {
/* 598 */     List<Map<String, String>> list = new ArrayList();
/*     */     
/*     */ 
/* 601 */     String sql = "SELECT * FROM " + table + " WHERE `" + searchIdx + "` LIKE '%" + searchCtt + "%'";
/* 602 */     rs = st.executeQuery(sql);
/* 603 */     metaData = rs.getMetaData();
/*     */     
/* 605 */     int sizeOfColumn = metaData.getColumnCount();
/*     */     
/*     */ 
/* 608 */     while (rs.next())
/*     */     {
/* 610 */       Map<String, String> map = new HashMap();
/*     */       
/* 612 */       for (int idxOfColumn = 0; idxOfColumn < sizeOfColumn; idxOfColumn++)
/*     */       {
/* 614 */         String column = metaData.getColumnName(idxOfColumn + 1);
/* 615 */         map.put(column, rs.getString(column));
/*     */       }
/*     */       
/* 618 */       if (((String)map.get(searchIdx)).contains(searchCtt))
/*     */       {
/* 620 */         list.add(map);
/*     */       }
/*     */     }
/*     */     
/* 624 */     return list;
/*     */   }
/*     */   
/*     */   public static List<Map<String, String>> getDataDoSearchBy(String table, String group, String searchIdx, String searchCtt) throws SQLException
/*     */   {
/* 629 */     List<Map<String, String>> list = new ArrayList();
/*     */     
/*     */ 
/* 632 */     String sql = "SELECT * FROM " + table + " WHERE `group`='" + group + "'";
/* 633 */     rs = st.executeQuery(sql);
/* 634 */     metaData = rs.getMetaData();
/*     */     
/* 636 */     int sizeOfColumn = metaData.getColumnCount();
/*     */     
/*     */ 
/* 639 */     while (rs.next())
/*     */     {
/* 641 */       Map<String, String> map = new HashMap();
/*     */       
/* 643 */       for (int idxOfColumn = 0; idxOfColumn < sizeOfColumn; idxOfColumn++)
/*     */       {
/* 645 */         String column = metaData.getColumnName(idxOfColumn + 1);
/* 646 */         map.put(column, rs.getString(column));
/*     */       }
/*     */       
/* 649 */       if (((String)map.get(searchIdx)).contains(searchCtt))
/*     */       {
/* 651 */         list.add(map);
/*     */       }
/*     */     }
/*     */     
/* 655 */     return list;
/*     */   }
/*     */   
/*     */   public static List<Map<String, String>> getDataDoList(String table, String group) throws SQLException
/*     */   {
/* 660 */     List<Map<String, String>> list = new ArrayList();
/*     */     
/*     */ 
/* 663 */     String sql = "SELECT * FROM " + table + " WHERE `group`='" + group + "'";
/* 664 */     rs = st.executeQuery(sql);
/* 665 */     metaData = rs.getMetaData();
/*     */     
/* 667 */     int sizeOfColumn = metaData.getColumnCount();
/*     */     
/*     */ 
/* 670 */     while (rs.next())
/*     */     {
/* 672 */       Map<String, String> map = new HashMap();
/*     */       
/* 674 */       for (int idxOfColumn = 0; idxOfColumn < sizeOfColumn; idxOfColumn++)
/*     */       {
/* 676 */         String column = metaData.getColumnName(idxOfColumn + 1);
/* 677 */         map.put(column, rs.getString(column));
/*     */       }
/*     */       
/* 680 */       list.add(map);
/*     */     }
/*     */     
/* 683 */     return list;
/*     */   }
/*     */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Worker\Database.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */