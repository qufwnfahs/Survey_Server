/*     */ package Model.Dialog;
/*     */ 
/*     */ import Enum.Enum_Table_Ci;
/*     */ import Model.Dialog.Survey_List.Survey_Group_Management_Di.Grouper;
/*     */ import Worker.ImageController;
/*     */ import Worker.Server;
/*     */ import com.google.gson.Gson;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.Font;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.GridBagLayout;
/*     */ import java.awt.Image;
/*     */ import java.awt.Insets;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.sql.SQLException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JComboBox;
/*     */ import javax.swing.JDialog;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JScrollPane;
/*     */ import javax.swing.JTable;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.ListSelectionModel;
/*     */ import javax.swing.event.ListSelectionEvent;
/*     */ import javax.swing.event.ListSelectionListener;
/*     */ import javax.swing.table.DefaultTableModel;
/*     */ 
/*     */ 
/*     */ public class User_Management_Di
/*     */   extends JDialog
/*     */   implements ListSelectionListener, ActionListener
/*     */ {
/*  42 */   private GridBagLayout gbl = new GridBagLayout();
/*  43 */   private GridBagConstraints gbc = new GridBagConstraints();
/*     */   
/*  45 */   private GridBagLayout gbl_box = new GridBagLayout();
/*  46 */   private GridBagConstraints gbc_box = new GridBagConstraints();
/*     */   
/*     */ 
/*  49 */   private JLabel title_ll = new JLabel();
/*  50 */   private JLabel user_name_ll = new JLabel();
/*  51 */   private JLabel user_phone_ll = new JLabel();
/*  52 */   private JLabel user_id_ll = new JLabel();
/*  53 */   private JLabel user_pw_ll = new JLabel();
/*  54 */   private JLabel user_group_ll = new JLabel();
/*  55 */   private JLabel user_img_ll = new JLabel();
/*     */   
/*  57 */   private JTable user_tb = new JTable();
/*     */   
/*     */   private DefaultTableModel defaultTableModel;
/*     */   
/*  61 */   private JTextField user_name_tf = new JTextField();
/*  62 */   private JTextField user_phone_tf = new JTextField();
/*  63 */   private JTextField user_id_tf = new JTextField();
/*  64 */   private JTextField user_pw_tf = new JTextField();
/*     */   
/*  66 */   private JComboBox user_group_cb = new JComboBox();
/*     */   
/*     */   private JComboBox<String> search_index_cb;
/*  69 */   private JPanel user_box_pl = new JPanel();
/*     */   
/*  71 */   private JButton user_add_bt = new JButton();
/*  72 */   private JButton user_modify_bt = new JButton();
/*  73 */   private JButton user_group_management_bt = new JButton();
/*  74 */   private JButton refresh_bt = new JButton();
/*  75 */   private JButton user_remove_bt = new JButton();
/*     */   
/*     */ 
/*     */   private JScrollPane tb_scroll;
/*     */   
/*     */ 
/*     */   private Server server;
/*     */   
/*     */ 
/*     */   private Enum_Table_Ci enum_table;
/*     */   
/*     */   private Image profile_img;
/*     */   
/*     */   private ListSelectionModel rowSelectionModel;
/*     */   
/*  90 */   private List<JTextField> user_info_lt = new ArrayList();
/*     */   
/*     */   public User_Management_Di(Server server) throws SQLException
/*     */   {
/*  94 */     this.server = server;
/*     */     
/*     */ 
/*  97 */     setPreferredSize(new Dimension(1200, 900));
/*  98 */     setMinimumSize(new Dimension(1200, 900));
/*  99 */     setMaximumSize(new Dimension(1200, 900));
/* 100 */     setLocationRelativeTo(null);
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 107 */     this.user_group_cb.setFont(new Font("나눔바른고딕", 0, 25));
/*     */     
/*     */ 
/* 110 */     this.user_box_pl.setLayout(this.gbl_box);
/* 111 */     setLayout(this.gbl);
/*     */     
/*     */ 
/* 114 */     this.user_info_lt.add(this.user_id_tf);
/* 115 */     this.user_info_lt.add(this.user_pw_tf);
/* 116 */     this.user_info_lt.add(this.user_name_tf);
/* 117 */     this.user_info_lt.add(this.user_phone_tf);
/*     */     
/*     */ 
/*     */ 
/* 121 */     this.profile_img = ImageController.resizeImage(new ImageIcon(getClass().getResource("/Image/profile_img.png")), 
/* 122 */       38, 38);
/*     */     
/*     */ 
/*     */ 
/* 126 */     this.title_ll.setText("JDU Welfare");
/* 127 */     this.title_ll.setFont(new Font("나눔바른고딕", 1, 35));
/*     */     
/*     */ 
/* 130 */     this.user_name_ll.setText("이름");
/* 131 */     this.user_name_ll.setFont(new Font("나눔바른고딕", 0, 20));
/*     */     
/*     */ 
/* 134 */     this.user_phone_ll.setText("전화번호");
/* 135 */     this.user_phone_ll.setFont(new Font("나눔바른고딕", 0, 20));
/*     */     
/*     */ 
/* 138 */     this.user_id_ll.setText("아이디");
/* 139 */     this.user_id_ll.setFont(new Font("나눔바른고딕", 0, 20));
/*     */     
/*     */ 
/* 142 */     this.user_pw_ll.setText("비밀번호");
/* 143 */     this.user_pw_ll.setFont(new Font("나눔바른고딕", 0, 20));
/*     */     
/*     */ 
/* 146 */     this.user_group_ll.setText("그룹");
/* 147 */     this.user_group_ll.setFont(new Font("나눔바른고딕", 0, 20));
/*     */     
/*     */ 
/* 150 */     this.user_img_ll.setIcon(new ImageIcon(this.profile_img));
/*     */     
/*     */ 
/*     */ 
/* 154 */     this.user_name_tf.setFont(new Font("나눔바른고딕", 0, 20));
/*     */     
/*     */ 
/* 157 */     this.user_phone_tf.setFont(new Font("나눔바른고딕", 0, 20));
/*     */     
/*     */ 
/* 160 */     this.user_id_tf.setFont(new Font("나눔바른고딕", 0, 20));
/*     */     
/*     */ 
/* 163 */     this.user_pw_tf.setFont(new Font("나눔바른고딕", 0, 20));
/*     */     
/*     */ 
/*     */ 
/* 167 */     this.user_add_bt.setText("유저 등록");
/* 168 */     this.user_add_bt.setFont(new Font("나눔바른고딕", 0, 23));
/* 169 */     this.user_add_bt.addActionListener(this);
/*     */     
/*     */ 
/* 172 */     this.user_modify_bt.setText("정보 수정");
/* 173 */     this.user_modify_bt.setFont(new Font("나눔바른고딕", 0, 23));
/* 174 */     this.user_modify_bt.addActionListener(this);
/*     */     
/*     */ 
/* 177 */     this.user_group_management_bt.setText("그룹 관리");
/* 178 */     this.user_group_management_bt.setFont(new Font("나눔바른고딕", 0, 23));
/* 179 */     this.user_group_management_bt.addActionListener(this);
/*     */     
/*     */ 
/* 182 */     this.refresh_bt.setText("새로고침");
/* 183 */     this.refresh_bt.setFont(new Font("나눔바른고딕", 0, 23));
/* 184 */     this.refresh_bt.addActionListener(this);
/*     */     
/*     */ 
/* 187 */     this.user_remove_bt.setText("유저 삭제");
/* 188 */     this.user_remove_bt.setFont(new Font("나눔바른고딕", 0, 23));
/* 189 */     this.user_remove_bt.addActionListener(this);
/*     */     
/*     */ 
/*     */ 
/* 193 */     this.search_index_cb = new JComboBox(
/* 194 */       new String[] { "ID/PW", "이름", "전화번호", "그룹", "전체 검색" });
/*     */     
/*     */ 
/* 197 */     this.defaultTableModel = new DefaultTableModel(
/* 198 */       new String[] { "No", "ID", "PW", "이름", "전화번호", "그룹" }, 0)
/*     */       {
/*     */ 
/*     */         public boolean isCellEditable(int row, int column)
/*     */         {
/*     */ 
/* 203 */           return false;
/*     */         }
/*     */         
/* 206 */       };
/* 207 */       this.user_tb = new JTable(this.defaultTableModel);
/* 208 */       this.user_tb.setRowSelectionAllowed(true);
/*     */       
/* 210 */       this.rowSelectionModel = this.user_tb.getSelectionModel();
/* 211 */       this.rowSelectionModel.setSelectionMode(0);
/* 212 */       this.rowSelectionModel.addListSelectionListener(this);
/*     */       
/*     */ 
/*     */ 
/* 216 */       this.tb_scroll = new JScrollPane(this.user_tb);
/* 217 */       this.tb_scroll.setVerticalScrollBarPolicy(22);
/* 218 */       this.tb_scroll.setHorizontalScrollBarPolicy(30);
/*     */       
/*     */ 
/* 221 */       this.gbc_box.anchor = 11;
/* 222 */       this.gbc_box.fill = 1;
/*     */       
/* 224 */       this.gbc_box.gridx = 0;
/* 225 */       this.gbc_box.gridy = 0;
/* 226 */       this.gbc_box.gridwidth = 1;
/* 227 */       this.gbc_box.gridheight = 2;
/* 228 */       this.gbc_box.weightx = 1.0D;
/* 229 */       this.gbc_box.weighty = 1.0D;
/* 230 */       this.gbc_box.insets = new Insets(0, 0, 0, 0);
/* 231 */       this.user_box_pl.add(this.user_img_ll, this.gbc_box);
/*     */       
/* 233 */       this.gbc_box.gridx = 1;
/* 234 */       this.gbc_box.gridy = 0;
/* 235 */       this.gbc_box.gridheight = 1;
/* 236 */       this.user_box_pl.add(this.user_id_ll, this.gbc_box);
/*     */       
/* 238 */       this.gbc_box.gridx = 2;
/* 239 */       this.gbc_box.gridy = 0;
/* 240 */       this.user_box_pl.add(this.user_id_tf, this.gbc_box);
/*     */       
/* 242 */       this.gbc_box.gridx = 1;
/* 243 */       this.gbc_box.gridy = 1;
/* 244 */       this.user_box_pl.add(this.user_pw_ll, this.gbc_box);
/*     */       
/* 246 */       this.gbc_box.gridx = 2;
/* 247 */       this.gbc_box.gridy = 1;
/* 248 */       this.user_box_pl.add(this.user_pw_tf, this.gbc_box);
/*     */       
/* 250 */       this.gbc_box.gridx = 0;
/* 251 */       this.gbc_box.gridy = 2;
/* 252 */       this.gbc_box.gridwidth = 1;
/* 253 */       this.user_box_pl.add(this.user_name_ll, this.gbc_box);
/*     */       
/* 255 */       this.gbc_box.gridx = 1;
/* 256 */       this.gbc_box.gridy = 2;
/* 257 */       this.gbc_box.gridwidth = 2;
/* 258 */       this.user_box_pl.add(this.user_name_tf, this.gbc_box);
/*     */       
/* 260 */       this.gbc_box.gridx = 0;
/* 261 */       this.gbc_box.gridy = 3;
/* 262 */       this.gbc_box.gridwidth = 1;
/* 263 */       this.user_box_pl.add(this.user_phone_ll, this.gbc_box);
/*     */       
/* 265 */       this.gbc_box.gridx = 1;
/* 266 */       this.gbc_box.gridy = 3;
/* 267 */       this.gbc_box.gridwidth = 2;
/* 268 */       this.user_box_pl.add(this.user_phone_tf, this.gbc_box);
/*     */       
/* 270 */       this.gbc_box.gridx = 0;
/* 271 */       this.gbc_box.gridy = 4;
/* 272 */       this.gbc_box.gridwidth = 1;
/* 273 */       this.user_box_pl.add(this.user_group_ll, this.gbc_box);
/*     */       
/* 275 */       this.gbc_box.gridx = 1;
/* 276 */       this.gbc_box.gridy = 4;
/* 277 */       this.gbc_box.gridwidth = 2;
/* 278 */       this.user_box_pl.add(this.user_group_cb, this.gbc_box);
/*     */       
/*     */ 
/* 281 */       this.gbc.anchor = 11;
/* 282 */       this.gbc.fill = 1;
/*     */       
/* 284 */       this.gbc.gridx = 0;
/* 285 */       this.gbc.gridy = 0;
/* 286 */       this.gbc.gridwidth = 1;
/* 287 */       this.gbc.gridheight = 1;
/* 288 */       this.gbc.weightx = 1.0D;
/* 289 */       this.gbc.weighty = 1.0D;
/* 290 */       this.gbc.insets = new Insets(0, 0, 0, 0);
/* 291 */       add(this.title_ll, this.gbc);
/*     */       
/* 293 */       this.gbc.gridx = 0;
/* 294 */       this.gbc.gridy = 1;
/* 295 */       this.gbc.gridwidth = 2;
/* 296 */       this.gbc.weighty = 1.0D;
/* 297 */       add(this.tb_scroll, this.gbc);
/*     */       
/* 299 */       this.gbc.gridx = 2;
/* 300 */       this.gbc.gridy = 1;
/* 301 */       this.gbc.gridwidth = 3;
/* 302 */       this.gbc.gridheight = 1;
/* 303 */       add(this.user_box_pl, this.gbc);
/*     */       
/* 305 */       this.gbc.gridx = 0;
/* 306 */       this.gbc.gridy = 2;
/* 307 */       this.gbc.gridwidth = 1;
/* 308 */       this.gbc.gridheight = 1;
/* 309 */       add(this.refresh_bt, this.gbc);
/*     */       
/* 311 */       this.gbc.gridx = 1;
/* 312 */       this.gbc.gridy = 2;
/* 313 */       add(this.user_group_management_bt, this.gbc);
/*     */       
/* 315 */       this.gbc.gridx = 2;
/* 316 */       this.gbc.gridy = 2;
/* 317 */       add(this.user_modify_bt, this.gbc);
/*     */       
/* 319 */       this.gbc.gridx = 3;
/* 320 */       this.gbc.gridy = 2;
/* 321 */       add(this.user_add_bt, this.gbc);
/*     */       
/* 323 */       this.gbc.gridx = 4;
/* 324 */       this.gbc.gridy = 2;
/* 325 */       add(this.user_remove_bt, this.gbc);
/*     */       
/* 327 */       loadUser();
/*     */     }
/*     */     
/*     */     public void loadUser() throws SQLException
/*     */     {
/* 332 */       this.user_id_tf.setText("");
/* 333 */       this.user_pw_tf.setText("");
/* 334 */       this.user_name_tf.setText("");
/* 335 */       this.user_phone_tf.setText("");
/* 336 */       this.user_group_cb.removeAllItems();
/*     */       
/*     */ 
/* 339 */       this.defaultTableModel.setRowCount(0);
/*     */       
/* 341 */       List<Map<String, String>> data = this.server.db_getData(Enum_Table_Ci.T001);
/*     */       
/* 343 */       for (int i = 0; i < data.size(); i++)
/*     */       {
/*     */ 
/* 346 */         int colSize = ((Map)data.get(i)).size();
/*     */         
/* 348 */         int tempCount = 0;
/*     */         
/* 350 */         Map<String, String> dataMap = (Map)data.get(i);
/*     */         
/* 352 */         List<String> row_lt = new ArrayList();
/*     */         
/* 354 */         row_lt.add((String)dataMap.get("id"));
/* 355 */         row_lt.add((String)dataMap.get("pw"));
/* 356 */         row_lt.add((String)dataMap.get("name"));
/* 357 */         row_lt.add((String)dataMap.get("phone"));
/* 358 */         row_lt.add((String)dataMap.get("group"));
/*     */         
/* 360 */         Object[] tempObject = new Object[colSize + 1];
/*     */         
/* 362 */         tempObject[(tempCount++)] = String.valueOf(i + 1);
/*     */         
/* 364 */         for (String str : row_lt)
/*     */         {
/* 366 */           tempObject[(tempCount++)] = str;
/*     */         }
/*     */         
/*     */ 
/* 370 */         this.defaultTableModel.addRow(tempObject);
/*     */       }
/*     */     }
/*     */     
/*     */     public void modifyUser() throws SQLException
/*     */     {
/* 376 */       int selectedRows = this.user_tb.getSelectedRow();
/*     */       
/* 378 */       if (selectedRows >= 0)
/*     */       {
/* 380 */         String[] idx_sql = 
/* 381 */           { "id", "pw", "name", "phone", "group" };
/*     */         
/*     */ 
/* 384 */         String id_original = (String)this.user_tb.getValueAt(selectedRows, 1);
/* 385 */         String pw_original = (String)this.user_tb.getValueAt(selectedRows, 2);
/* 386 */         String name_original = (String)this.user_tb.getValueAt(selectedRows, 3);
/* 387 */         String phone_original = (String)this.user_tb.getValueAt(selectedRows, 4);
/* 388 */         String group_original = (String)this.user_tb.getValueAt(selectedRows, 5);
/*     */         
/* 390 */         String[] original = 
/* 391 */           { id_original, pw_original, name_original, phone_original, group_original };
/*     */         
/*     */ 
/* 394 */         String id_beModify = this.user_id_tf.getText();
/* 395 */         String pw_beModify = this.user_pw_tf.getText();
/* 396 */         String name_beModify = this.user_name_tf.getText();
/* 397 */         String phone_beModify = this.user_phone_tf.getText();
/* 398 */         String group_beModify = String.valueOf(this.user_group_cb.getSelectedItem());
/*     */         
/* 400 */         String[] beModify = 
/* 401 */           { id_beModify, pw_beModify, name_beModify, phone_beModify, group_beModify };
/*     */         
/* 403 */         boolean dup = isItDuplicateInModify(id_beModify);
/*     */         
/* 405 */         if (dup)
/*     */         {
/* 407 */           JOptionPane.showMessageDialog(null, "아이디가 중복됩니다");
/*     */           
/* 409 */           return;
/*     */         }
/*     */         
/* 412 */         this.server.db_modifyData(Enum_Table_Ci.T001, idx_sql, original, beModify);
/*     */         
/* 414 */         List<String> jsonList = this.server.db_getJSON(Enum_Table_Ci.T004);
/*     */         
/* 416 */         Survey_Group_Management_Di.Grouper[] groupArray = null;
/*     */         
/* 418 */         for (String json : jsonList)
/*     */         {
/* 420 */           if (!json.equals("[]"))
/*     */           {
/* 422 */             groupArray = (Survey_Group_Management_Di.Grouper[])new Gson().fromJson(json, Survey_Group_Management_Di.Grouper[].class);
/*     */             
/* 424 */             for (int i = 0; i < groupArray.length; i++)
/*     */             {
/* 426 */               String groupName = groupArray[i].getName();
/* 427 */               List<String> person = groupArray[i].getPerson();
/*     */               
/* 429 */               if (groupName.equals(group_original))
/*     */               {
/* 431 */                 for (int j = 0; j < person.size(); j++)
/*     */                 {
/* 433 */                   if (((String)person.get(j)).equals(id_original + " / " + name_original))
/*     */                   {
/* 435 */                     person.remove(j);
/*     */                   }
/*     */                 }
/*     */               }
/*     */             }
/*     */             
/* 441 */             for (int i = 0; i < groupArray.length; i++)
/*     */             {
/* 443 */               String groupName = groupArray[i].getName();
/* 444 */               List<String> person = groupArray[i].getPerson();
/*     */               
/* 446 */               if (groupName.equals(group_beModify))
/*     */               {
/* 448 */                 person.add(id_beModify + " / " + name_beModify);
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/*     */         
/* 454 */         String jsonString = new Gson().toJson(groupArray);
/* 455 */         this.server.db_jsonData(Enum_Table_Ci.T004, jsonString);
/*     */         
/* 457 */         loadUser();
/*     */       }
/*     */     }
/*     */     
/*     */     public void addUser() throws SQLException
/*     */     {
/* 463 */       String[] idx_sql = 
/* 464 */         { "id", "pw", "name", "phone", "group" };
/*     */       
/*     */ 
/* 467 */       String id_beAdd = this.user_id_tf.getText();
/* 468 */       String pw_beAdd = this.user_pw_tf.getText();
/* 469 */       String name_beAdd = this.user_name_tf.getText();
/* 470 */       String phone_beAdd = this.user_phone_tf.getText();
/* 471 */       String group_beAdd = String.valueOf(this.user_group_cb.getSelectedItem());
/*     */       
/* 473 */       String[] beAdd = 
/* 474 */         { id_beAdd, pw_beAdd, name_beAdd, phone_beAdd, group_beAdd };
/*     */       
/* 476 */       boolean dup = isItDuplicateInAdd(id_beAdd);
/*     */       
/* 478 */       if (dup)
/*     */       {
/* 480 */         JOptionPane.showMessageDialog(null, "아이디가 중복됩니다");
/*     */         
/* 482 */         return;
/*     */       }
/*     */       
/* 485 */       boolean blank = isItBlank();
/*     */       
/* 487 */       if (blank)
/*     */       {
/* 489 */         JOptionPane.showMessageDialog(null, "빈칸이 있습니다.");
/*     */         
/* 491 */         return;
/*     */       }
/*     */       
/* 494 */       this.server.db_addData(Enum_Table_Ci.T001, idx_sql, beAdd);
/*     */       
/* 496 */       loadUser();
/*     */     }
/*     */     
/*     */     public void removeUser() throws SQLException
/*     */     {
/* 501 */       int selectedRows = this.user_tb.getSelectedRow();
/*     */       
/* 503 */       if (selectedRows >= 0)
/*     */       {
/* 505 */         String[] idx_sql = 
/* 506 */           { "id", "pw", "name", "phone", "group" };
/*     */         
/*     */ 
/* 509 */         String id_beRemove = (String)this.user_tb.getValueAt(selectedRows, 1);
/* 510 */         String pw_beRemove = (String)this.user_tb.getValueAt(selectedRows, 2);
/* 511 */         String name_beRemove = (String)this.user_tb.getValueAt(selectedRows, 3);
/* 512 */         String phone_beRemove = (String)this.user_tb.getValueAt(selectedRows, 4);
/* 513 */         String group_beRemove = (String)this.user_tb.getValueAt(selectedRows, 5);
/*     */         
/* 515 */         String[] beRemove = 
/* 516 */           { id_beRemove, pw_beRemove, name_beRemove, phone_beRemove, group_beRemove };
/*     */         
/* 518 */         this.server.db_removeData(Enum_Table_Ci.T001, idx_sql, beRemove);
/*     */         
/* 520 */         loadUser();
/*     */       }
/*     */     }
/*     */     
/*     */     public boolean isItBlank()
/*     */     {
/* 526 */       if (this.user_id_tf.getText().equals(""))
/*     */       {
/* 528 */         return true; }
/* 529 */       if (this.user_pw_tf.getText().equals(""))
/*     */       {
/* 531 */         return true; }
/* 532 */       if (this.user_name_tf.getText().equals(""))
/*     */       {
/* 534 */         return true; }
/* 535 */       if (this.user_phone_tf.getText().equals(""))
/*     */       {
/* 537 */         return true;
/*     */       }
/*     */       
/* 540 */       return false;
/*     */     }
/*     */     
/*     */     public boolean isItDuplicateInModify(String id_beModify)
/*     */     {
/* 545 */       for (int i = 0; i < this.user_tb.getRowCount(); i++)
/*     */       {
/* 547 */         if (i != this.user_tb.getSelectedRow())
/*     */         {
/* 549 */           String id_original = (String)this.user_tb.getValueAt(i, 1);
/*     */           
/* 551 */           if (id_beModify.equals(id_original))
/*     */           {
/* 553 */             return true;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/* 558 */       return false;
/*     */     }
/*     */     
/*     */     public boolean isItDuplicateInAdd(String id_beModify)
/*     */     {
/* 563 */       for (int i = 0; i < this.user_tb.getRowCount(); i++)
/*     */       {
/* 565 */         String id_original = (String)this.user_tb.getValueAt(i, 1);
/*     */         
/* 567 */         if (id_beModify.equals(id_original))
/*     */         {
/* 569 */           return true;
/*     */         }
/*     */       }
/*     */       
/* 573 */       return false;
/*     */     }
/*     */     
/*     */ 
/*     */     public void valueChanged(ListSelectionEvent e)
/*     */     {
/* 579 */       if ((!e.getValueIsAdjusting()) && (this.user_tb.getSelectedRow() >= 0))
/*     */       {
/*     */         try
/*     */         {
/* 583 */           loadComboBox();
/*     */         }
/*     */         catch (SQLException e1)
/*     */         {
/* 587 */           e1.printStackTrace();
/*     */         }
/*     */         
/* 590 */         String select = "";
/*     */         
/* 592 */         int selectedRows = this.user_tb.getSelectedRow();
/*     */         
/* 594 */         List<String> row_lt = new ArrayList();
/*     */         
/* 596 */         for (int i = 1; i < this.user_tb.getColumnCount(); i++)
/*     */         {
/* 598 */           select = (String)this.user_tb.getValueAt(selectedRows, i);
/*     */           
/* 600 */           if (i - 1 < this.user_info_lt.size())
/*     */           {
/* 602 */             ((JTextField)this.user_info_lt.get(i - 1)).setText(select);
/*     */           }
/*     */           else
/*     */           {
/* 606 */             this.user_group_cb.setSelectedItem(select);
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*     */ 
/*     */     public void actionPerformed(ActionEvent e)
/*     */     {
/* 615 */       if (e.getSource().equals(this.refresh_bt))
/*     */       {
/*     */         try
/*     */         {
/* 619 */           loadUser();
/*     */         }
/*     */         catch (SQLException er) {
/* 622 */           er.printStackTrace();
/*     */         }
/* 624 */       } else if (e.getSource().equals(this.user_modify_bt))
/*     */       {
/*     */         try
/*     */         {
/* 628 */           modifyUser();
/*     */         }
/*     */         catch (SQLException er) {
/* 631 */           er.printStackTrace();
/*     */         }
/* 633 */       } else if (e.getSource().equals(this.user_add_bt))
/*     */       {
/*     */         try
/*     */         {
/* 637 */           addUser();
/*     */         }
/*     */         catch (SQLException e1) {
/* 640 */           e1.printStackTrace();
/*     */         }
/* 642 */       } else if (e.getSource().equals(this.user_remove_bt))
/*     */       {
/*     */         try
/*     */         {
/* 646 */           removeUser();
/*     */         }
/*     */         catch (SQLException e1) {
/* 649 */           e1.printStackTrace();
/*     */         } } else {
/* 651 */         e.getSource().equals(this.user_group_management_bt);
/*     */       }
/*     */     }
/*     */     
/*     */ 
/*     */     public void loadComboBox()
/*     */       throws SQLException
/*     */     {
/* 659 */       this.user_group_cb.removeAllItems();
/*     */       
/* 661 */       List<Map<String, String>> map = this.server.db_getData(Enum_Table_Ci.T002);
/*     */       Iterator<String> keys;
/* 663 */       for (Iterator localIterator = map.iterator(); localIterator.hasNext(); 
/*     */           
/*     */ 
/*     */ 
/* 667 */           keys.hasNext())
/*     */       {
/* 663 */         Map<String, String> data = (Map)localIterator.next();
/*     */         
/* 665 */         keys = data.keySet().iterator();
/*     */         
/* 667 */         continue;
/*     */         
/* 669 */         String key = (String)keys.next();
/*     */         
/* 671 */         this.user_group_cb.addItem(data.get(key));
/*     */       }
/*     */     }
/*     */   }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\User_Management_Di.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */