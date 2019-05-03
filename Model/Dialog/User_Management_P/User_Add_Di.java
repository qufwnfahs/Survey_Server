/*     */ package Model.Dialog.User_Management_P;
/*     */ 
/*     */ import Enum.Enum_Font_Ci;
/*     */ import Enum.Enum_Image_Ci;
/*     */ import Enum.Enum_Table_Ci;
/*     */ import Model.Dialog.User_Management;
/*     */ import Worker.Database;
/*     */ import Worker.ImageController;
/*     */ import java.awt.Color;
/*     */ import java.awt.Component;
/*     */ import java.awt.Container;
/*     */ import java.awt.Cursor;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.Font;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.GridBagLayout;
/*     */ import java.awt.Insets;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.sql.SQLException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JComboBox;
/*     */ import javax.swing.JDialog;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JList;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.ListCellRenderer;
/*     */ 
/*     */ public class User_Add_Di
/*     */   extends JDialog implements ActionListener
/*     */ {
/*  38 */   private GridBagLayout gbl = new GridBagLayout();
/*  39 */   private GridBagConstraints gbc = new GridBagConstraints();
/*     */   
/*  41 */   private JLabel ll_title = new JLabel();
/*  42 */   private JLabel ll_id = new JLabel();
/*  43 */   private JLabel ll_pw = new JLabel();
/*  44 */   private JLabel ll_name = new JLabel();
/*  45 */   private JLabel ll_phone = new JLabel();
/*  46 */   private JLabel ll_group = new JLabel();
/*     */   
/*  48 */   private JTextField tf_id = new JTextField();
/*  49 */   private JTextField tf_pw = new JTextField();
/*  50 */   private JTextField tf_name = new JTextField();
/*  51 */   private JTextField tf_phone = new JTextField();
/*     */   
/*  53 */   private JComboBox cb_group = new JComboBox();
/*     */   
/*  55 */   private JButton bt_groupAdd = new JButton();
/*  56 */   private JButton bt_cancel = new JButton();
/*  57 */   private JButton bt_add = new JButton();
/*  58 */   private JButton bt_groupDelete = new JButton();
/*  59 */   private JButton bt_remove = new JButton();
/*     */   
/*  61 */   private boolean isModifing = false;
/*     */   private String userID;
/*     */   private String userPW;
/*     */   private String userNAME;
/*     */   private String userPHONE;
/*     */   private String userGROUP;
/*     */   
/*     */   public User_Add_Di()
/*     */     throws SQLException
/*     */   {
/*  71 */     setLayout(this.gbl);
/*  72 */     setPreferredSize(new Dimension(900, 846));
/*  73 */     setMinimumSize(new Dimension(900, 846));
/*  74 */     setMaximumSize(new Dimension(900, 846));
/*  75 */     setLocationRelativeTo(null);
/*  76 */     setIconImage(ImageController.resizeImage(new ImageIcon(getClass().getResource("/Image/poker-chip.png")), 48, 48));
/*  77 */     setTitle("정다운마을 설문조사");
/*     */     
/*  79 */     getContentPane().setBackground(Color.WHITE);
/*     */     
/*     */ 
/*  82 */     this.ll_title.setText("정다운마을 설문조사");
/*  83 */     this.ll_title.setFont(Enum_Font_Ci.나눔바른고딕26.getFont());
/*  84 */     this.ll_title.setHorizontalAlignment(0);
/*     */     
/*  86 */     this.ll_id.setText("아이디");
/*  87 */     this.ll_id.setFont(Enum_Font_Ci.나눔바른고딕18.getFont());
/*     */     
/*  89 */     this.ll_pw.setText("비밀번호");
/*  90 */     this.ll_pw.setFont(Enum_Font_Ci.나눔바른고딕18.getFont());
/*     */     
/*  92 */     this.ll_name.setText("이름");
/*  93 */     this.ll_name.setFont(Enum_Font_Ci.나눔바른고딕18.getFont());
/*     */     
/*  95 */     this.ll_phone.setText("전화번호 (- 없이)");
/*  96 */     this.ll_phone.setFont(Enum_Font_Ci.나눔바른고딕18.getFont());
/*     */     
/*  98 */     this.ll_group.setText("그룹 지정 (띄어쓰기 없이)");
/*  99 */     this.ll_group.setFont(Enum_Font_Ci.나눔바른고딕18.getFont());
/*     */     
/*     */ 
/* 102 */     this.tf_id.setFont(Enum_Font_Ci.나눔바른고딕20.getFont());
/* 103 */     this.tf_id.setMargin(new Insets(10, 10, 10, 10));
/*     */     
/* 105 */     this.tf_pw.setFont(Enum_Font_Ci.나눔바른고딕20.getFont());
/* 106 */     this.tf_pw.setMargin(new Insets(10, 10, 10, 10));
/*     */     
/* 108 */     this.tf_name.setFont(Enum_Font_Ci.나눔바른고딕20.getFont());
/* 109 */     this.tf_name.setMargin(new Insets(10, 10, 10, 10));
/*     */     
/* 111 */     this.tf_phone.setFont(Enum_Font_Ci.나눔바른고딕20.getFont());
/* 112 */     this.tf_phone.setMargin(new Insets(10, 10, 10, 10));
/*     */     
/* 114 */     this.cb_group = new JComboBox();
/* 115 */     this.cb_group.setFont(new Font("나눔바른고딕", 0, 20));
/* 116 */     this.cb_group.setRenderer(new CustomComboBox());
/* 117 */     this.cb_group.setPreferredSize(new Dimension(100, 50));
/* 118 */     this.cb_group.setBackground(Color.WHITE);
/*     */     
/*     */ 
/* 121 */     this.bt_groupAdd.setText("그룹 생성");
/* 122 */     this.bt_groupAdd.setOpaque(true);
/* 123 */     this.bt_groupAdd.setBackground(new Color(12, 151, 189));
/* 124 */     this.bt_groupAdd.setForeground(Color.WHITE);
/* 125 */     this.bt_groupAdd.setFont(new Font("나눔바른고딕", 1, 20));
/* 126 */     this.bt_groupAdd.setIcon(new ImageIcon(
/* 127 */       ImageController.resizeImage(Enum_Image_Ci.BUTTON_ADD_IMAGE_WHITE.getImageIcon(), 28, 28)));
/* 128 */     this.bt_groupAdd.setCursor(new Cursor(12));
/* 129 */     this.bt_groupAdd.addActionListener(this);
/*     */     
/* 131 */     this.bt_cancel.setText("취소");
/* 132 */     this.bt_cancel.setOpaque(true);
/* 133 */     this.bt_cancel.setBackground(new Color(12, 151, 189));
/* 134 */     this.bt_cancel.setForeground(Color.WHITE);
/* 135 */     this.bt_cancel.setFont(new Font("나눔바른고딕", 1, 20));
/* 136 */     this.bt_cancel.setCursor(new Cursor(12));
/* 137 */     this.bt_cancel.addActionListener(this);
/*     */     
/* 139 */     this.bt_add.setText("등록");
/* 140 */     this.bt_add.setOpaque(true);
/* 141 */     this.bt_add.setBackground(new Color(12, 151, 189));
/* 142 */     this.bt_add.setForeground(Color.WHITE);
/* 143 */     this.bt_add.setFont(new Font("나눔바른고딕", 1, 20));
/* 144 */     this.bt_add.setCursor(new Cursor(12));
/* 145 */     this.bt_add.addActionListener(this);
/*     */     
/* 147 */     this.bt_groupDelete.setText("그룹 삭제");
/* 148 */     this.bt_groupDelete.setOpaque(true);
/* 149 */     this.bt_groupDelete.setBackground(new Color(12, 151, 189));
/* 150 */     this.bt_groupDelete.setForeground(Color.WHITE);
/* 151 */     this.bt_groupDelete.setFont(new Font("나눔바른고딕", 1, 20));
/* 152 */     this.bt_groupDelete.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.CANCEL.getImageIcon(), 28, 28)));
/* 153 */     this.bt_groupDelete.setCursor(new Cursor(12));
/* 154 */     this.bt_groupDelete.addActionListener(this);
/*     */     
/* 156 */     this.gbc.anchor = 11;
/* 157 */     this.gbc.fill = 1;
/*     */     
/* 159 */     this.gbc.gridx = 0;
/* 160 */     this.gbc.gridy = 0;
/* 161 */     this.gbc.gridwidth = 4;
/* 162 */     this.gbc.gridheight = 1;
/* 163 */     this.gbc.weightx = 1.0D;
/* 164 */     this.gbc.weighty = 1.0D;
/* 165 */     this.gbc.insets = new Insets(30, 0, 30, 0);
/* 166 */     add(this.ll_title, this.gbc);
/*     */     
/* 168 */     this.gbc.fill = 2;
/*     */     
/* 170 */     this.gbc.gridy = 1;
/* 171 */     this.gbc.insets = new Insets(10, 20, 10, 20);
/* 172 */     add(this.ll_id, this.gbc);
/*     */     
/* 174 */     this.gbc.gridy = 2;
/* 175 */     this.gbc.insets = new Insets(0, 20, 0, 20);
/* 176 */     add(this.tf_id, this.gbc);
/*     */     
/* 178 */     this.gbc.gridy = 3;
/* 179 */     this.gbc.insets = new Insets(10, 20, 10, 20);
/* 180 */     add(this.ll_pw, this.gbc);
/*     */     
/* 182 */     this.gbc.gridy = 4;
/* 183 */     this.gbc.insets = new Insets(0, 20, 0, 20);
/* 184 */     add(this.tf_pw, this.gbc);
/*     */     
/* 186 */     this.gbc.gridy = 5;
/* 187 */     this.gbc.insets = new Insets(10, 20, 10, 20);
/* 188 */     add(this.ll_name, this.gbc);
/*     */     
/* 190 */     this.gbc.gridy = 6;
/* 191 */     this.gbc.insets = new Insets(0, 20, 0, 20);
/* 192 */     add(this.tf_name, this.gbc);
/*     */     
/* 194 */     this.gbc.gridy = 7;
/* 195 */     this.gbc.insets = new Insets(10, 20, 10, 20);
/* 196 */     add(this.ll_phone, this.gbc);
/*     */     
/* 198 */     this.gbc.gridy = 8;
/* 199 */     this.gbc.insets = new Insets(0, 20, 0, 20);
/* 200 */     add(this.tf_phone, this.gbc);
/*     */     
/* 202 */     this.gbc.gridy = 9;
/* 203 */     this.gbc.gridwidth = 2;
/* 204 */     this.gbc.insets = new Insets(10, 20, 10, 20);
/* 205 */     add(this.ll_group, this.gbc);
/*     */     
/* 207 */     this.gbc.anchor = 13;
/* 208 */     this.gbc.fill = 0;
/*     */     
/* 210 */     this.gbc.gridx = 2;
/* 211 */     this.gbc.gridwidth = 1;
/* 212 */     this.gbc.insets = new Insets(-15, 0, 0, 20);
/* 213 */     add(this.bt_groupAdd, this.gbc);
/*     */     
/* 215 */     this.gbc.gridx = 3;
/* 216 */     this.gbc.gridwidth = 1;
/* 217 */     this.gbc.insets = new Insets(-15, 0, 0, 20);
/* 218 */     add(this.bt_groupDelete, this.gbc);
/*     */     
/* 220 */     this.gbc.fill = 2;
/*     */     
/* 222 */     this.gbc.gridx = 0;
/* 223 */     this.gbc.gridy = 10;
/* 224 */     this.gbc.gridwidth = 4;
/* 225 */     this.gbc.insets = new Insets(0, 20, 0, 20);
/* 226 */     add(this.cb_group, this.gbc);
/*     */     
/* 228 */     this.gbc.anchor = 13;
/* 229 */     this.gbc.fill = 0;
/*     */     
/* 231 */     this.gbc.gridy = 11;
/* 232 */     this.gbc.gridwidth = 2;
/* 233 */     this.gbc.insets = new Insets(10, 280, 10, 20);
/* 234 */     add(this.bt_cancel, this.gbc);
/*     */     
/* 236 */     this.gbc.anchor = 17;
/*     */     
/* 238 */     this.gbc.gridx = 2;
/* 239 */     this.gbc.insets = new Insets(10, 20, 10, 20);
/* 240 */     add(this.bt_add, this.gbc);
/*     */     
/* 242 */     loadComboBox();
/*     */   }
/*     */   
/*     */   public User_Add_Di(String id, String pw, String name, String phone, String group) throws SQLException {
/* 246 */     this.isModifing = true;
/*     */     
/* 248 */     this.userID = id;
/* 249 */     this.userPW = pw;
/* 250 */     this.userNAME = name;
/* 251 */     this.userPHONE = phone;
/* 252 */     this.userGROUP = group;
/*     */     
/*     */ 
/* 255 */     setLayout(this.gbl);
/* 256 */     setPreferredSize(new Dimension(900, 846));
/* 257 */     setMinimumSize(new Dimension(900, 846));
/* 258 */     setMaximumSize(new Dimension(900, 846));
/* 259 */     setLocationRelativeTo(null);
/* 260 */     getContentPane().setBackground(Color.WHITE);
/*     */     
/*     */ 
/* 263 */     this.ll_title.setText("정다운마을 설문조사");
/* 264 */     this.ll_title.setFont(Enum_Font_Ci.나눔바른고딕26.getFont());
/* 265 */     this.ll_title.setHorizontalAlignment(0);
/*     */     
/* 267 */     this.ll_id.setText("아이디");
/* 268 */     this.ll_id.setFont(Enum_Font_Ci.나눔바른고딕18.getFont());
/*     */     
/* 270 */     this.ll_pw.setText("비밀번호");
/* 271 */     this.ll_pw.setFont(Enum_Font_Ci.나눔바른고딕18.getFont());
/*     */     
/* 273 */     this.ll_name.setText("이름");
/* 274 */     this.ll_name.setFont(Enum_Font_Ci.나눔바른고딕18.getFont());
/*     */     
/* 276 */     this.ll_phone.setText("전화번호 (- 없이)");
/* 277 */     this.ll_phone.setFont(Enum_Font_Ci.나눔바른고딕18.getFont());
/*     */     
/* 279 */     this.ll_group.setText("그룹 지정 (띄어쓰기 없이)");
/* 280 */     this.ll_group.setFont(Enum_Font_Ci.나눔바른고딕18.getFont());
/*     */     
/*     */ 
/* 283 */     this.tf_id.setFont(Enum_Font_Ci.나눔바른고딕20.getFont());
/* 284 */     this.tf_id.setMargin(new Insets(10, 10, 10, 10));
/* 285 */     this.tf_id.setText(id);
/*     */     
/* 287 */     this.tf_pw.setFont(Enum_Font_Ci.나눔바른고딕20.getFont());
/* 288 */     this.tf_pw.setMargin(new Insets(10, 10, 10, 10));
/* 289 */     this.tf_pw.setText(pw);
/*     */     
/* 291 */     this.tf_name.setFont(Enum_Font_Ci.나눔바른고딕20.getFont());
/* 292 */     this.tf_name.setMargin(new Insets(10, 10, 10, 10));
/* 293 */     this.tf_name.setText(name);
/*     */     
/* 295 */     this.tf_phone.setFont(Enum_Font_Ci.나눔바른고딕20.getFont());
/* 296 */     this.tf_phone.setMargin(new Insets(10, 10, 10, 10));
/* 297 */     this.tf_phone.setText(phone);
/*     */     
/* 299 */     this.cb_group = new JComboBox();
/* 300 */     this.cb_group.setFont(new Font("나눔바른고딕", 0, 20));
/* 301 */     this.cb_group.setRenderer(new CustomComboBox());
/* 302 */     this.cb_group.setPreferredSize(new Dimension(100, 50));
/* 303 */     this.cb_group.setBackground(Color.WHITE);
/*     */     
/*     */ 
/* 306 */     this.bt_groupAdd.setText("그룹 생성");
/* 307 */     this.bt_groupAdd.setOpaque(true);
/* 308 */     this.bt_groupAdd.setBackground(new Color(12, 151, 189));
/* 309 */     this.bt_groupAdd.setForeground(Color.WHITE);
/* 310 */     this.bt_groupAdd.setFont(new Font("나눔바른고딕", 1, 20));
/* 311 */     this.bt_groupAdd.setIcon(new ImageIcon(
/* 312 */       ImageController.resizeImage(Enum_Image_Ci.BUTTON_ADD_IMAGE_WHITE.getImageIcon(), 28, 28)));
/* 313 */     this.bt_groupAdd.setCursor(new Cursor(12));
/* 314 */     this.bt_groupAdd.addActionListener(this);
/*     */     
/* 316 */     this.bt_cancel.setText("취소");
/* 317 */     this.bt_cancel.setOpaque(true);
/* 318 */     this.bt_cancel.setBackground(new Color(12, 151, 189));
/* 319 */     this.bt_cancel.setForeground(Color.WHITE);
/* 320 */     this.bt_cancel.setFont(new Font("나눔바른고딕", 1, 20));
/* 321 */     this.bt_cancel.setCursor(new Cursor(12));
/* 322 */     this.bt_cancel.addActionListener(this);
/*     */     
/* 324 */     this.bt_add.setText("수정");
/* 325 */     this.bt_add.setOpaque(true);
/* 326 */     this.bt_add.setBackground(new Color(12, 151, 189));
/* 327 */     this.bt_add.setForeground(Color.WHITE);
/* 328 */     this.bt_add.setFont(new Font("나눔바른고딕", 1, 20));
/* 329 */     this.bt_add.setCursor(new Cursor(12));
/* 330 */     this.bt_add.addActionListener(this);
/*     */     
/* 332 */     this.bt_remove.setText("삭제");
/* 333 */     this.bt_remove.setOpaque(true);
/* 334 */     this.bt_remove.setBackground(new Color(12, 151, 189));
/* 335 */     this.bt_remove.setForeground(Color.WHITE);
/* 336 */     this.bt_remove.setFont(new Font("나눔바른고딕", 1, 20));
/* 337 */     this.bt_remove.setCursor(new Cursor(12));
/* 338 */     this.bt_remove.addActionListener(this);
/*     */     
/* 340 */     this.bt_groupDelete.setText("그룹 삭제");
/* 341 */     this.bt_groupDelete.setOpaque(true);
/* 342 */     this.bt_groupDelete.setBackground(new Color(12, 151, 189));
/* 343 */     this.bt_groupDelete.setForeground(Color.WHITE);
/* 344 */     this.bt_groupDelete.setFont(new Font("나눔바른고딕", 1, 20));
/* 345 */     this.bt_groupDelete.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.CANCEL.getImageIcon(), 28, 28)));
/* 346 */     this.bt_groupDelete.setCursor(new Cursor(12));
/* 347 */     this.bt_groupDelete.addActionListener(this);
/*     */     
/* 349 */     this.gbc.anchor = 11;
/* 350 */     this.gbc.fill = 1;
/*     */     
/* 352 */     this.gbc.gridx = 0;
/* 353 */     this.gbc.gridy = 0;
/* 354 */     this.gbc.gridwidth = 4;
/* 355 */     this.gbc.gridheight = 1;
/* 356 */     this.gbc.weightx = 1.0D;
/* 357 */     this.gbc.weighty = 1.0D;
/* 358 */     this.gbc.insets = new Insets(30, 0, 30, 0);
/* 359 */     add(this.ll_title, this.gbc);
/*     */     
/* 361 */     this.gbc.fill = 2;
/*     */     
/* 363 */     this.gbc.gridy = 1;
/* 364 */     this.gbc.insets = new Insets(10, 20, 10, 20);
/* 365 */     add(this.ll_id, this.gbc);
/*     */     
/* 367 */     this.gbc.gridy = 2;
/* 368 */     this.gbc.insets = new Insets(0, 20, 0, 20);
/* 369 */     add(this.tf_id, this.gbc);
/*     */     
/* 371 */     this.gbc.gridy = 3;
/* 372 */     this.gbc.insets = new Insets(10, 20, 10, 20);
/* 373 */     add(this.ll_pw, this.gbc);
/*     */     
/* 375 */     this.gbc.gridy = 4;
/* 376 */     this.gbc.insets = new Insets(0, 20, 0, 20);
/* 377 */     add(this.tf_pw, this.gbc);
/*     */     
/* 379 */     this.gbc.gridy = 5;
/* 380 */     this.gbc.insets = new Insets(10, 20, 10, 20);
/* 381 */     add(this.ll_name, this.gbc);
/*     */     
/* 383 */     this.gbc.gridy = 6;
/* 384 */     this.gbc.insets = new Insets(0, 20, 0, 20);
/* 385 */     add(this.tf_name, this.gbc);
/*     */     
/* 387 */     this.gbc.gridy = 7;
/* 388 */     this.gbc.insets = new Insets(10, 20, 10, 20);
/* 389 */     add(this.ll_phone, this.gbc);
/*     */     
/* 391 */     this.gbc.gridy = 8;
/* 392 */     this.gbc.insets = new Insets(0, 20, 0, 20);
/* 393 */     add(this.tf_phone, this.gbc);
/*     */     
/* 395 */     this.gbc.gridy = 9;
/* 396 */     this.gbc.gridwidth = 2;
/* 397 */     this.gbc.insets = new Insets(10, 20, 10, 20);
/* 398 */     add(this.ll_group, this.gbc);
/*     */     
/* 400 */     this.gbc.anchor = 13;
/* 401 */     this.gbc.fill = 0;
/*     */     
/* 403 */     this.gbc.gridx = 2;
/* 404 */     this.gbc.gridwidth = 1;
/* 405 */     this.gbc.insets = new Insets(-15, 0, 0, 20);
/* 406 */     add(this.bt_groupAdd, this.gbc);
/*     */     
/* 408 */     this.gbc.gridx = 3;
/* 409 */     this.gbc.gridwidth = 1;
/* 410 */     this.gbc.insets = new Insets(-15, 0, 0, 20);
/* 411 */     add(this.bt_groupDelete, this.gbc);
/*     */     
/* 413 */     this.gbc.fill = 2;
/*     */     
/* 415 */     this.gbc.gridx = 0;
/* 416 */     this.gbc.gridy = 10;
/* 417 */     this.gbc.gridwidth = 4;
/* 418 */     this.gbc.insets = new Insets(0, 20, 0, 20);
/* 419 */     add(this.cb_group, this.gbc);
/*     */     
/* 421 */     this.gbc.anchor = 13;
/* 422 */     this.gbc.fill = 0;
/*     */     
/* 424 */     this.gbc.gridy = 11;
/* 425 */     this.gbc.gridwidth = 2;
/* 426 */     this.gbc.insets = new Insets(10, 240, 10, 20);
/* 427 */     add(this.bt_cancel, this.gbc);
/*     */     
/* 429 */     this.gbc.anchor = 17;
/*     */     
/* 431 */     this.gbc.gridx = 2;
/* 432 */     this.gbc.insets = new Insets(10, 20, 10, 20);
/* 433 */     add(this.bt_add, this.gbc);
/*     */     
/* 435 */     this.gbc.gridx = 3;
/* 436 */     this.gbc.insets = new Insets(10, -110, 10, 20);
/* 437 */     add(this.bt_remove, this.gbc);
/*     */     
/* 439 */     loadComboBox();
/*     */     
/* 441 */     this.cb_group.setSelectedItem(group);
/*     */   }
/*     */   
/*     */   public void loadComboBox() throws SQLException {
/* 445 */     this.cb_group.removeAllItems();
/*     */     
/* 447 */     List<Map<String, String>> user = Database.getData(Enum_Table_Ci.T001.getCode());
/* 448 */     List<Map<String, String>> group = Database.getData(Enum_Table_Ci.T002.getCode());
/*     */     
/* 450 */     List<String> temp = new ArrayList();
/*     */     
/* 452 */     for (int i = 0; i < group.size(); i++) {
/* 453 */       if (!temp.contains(((Map)group.get(i)).get("GROUP"))) {
/* 454 */         temp.add((String)((Map)group.get(i)).get("GROUP"));
/*     */       }
/*     */     }
/*     */     
/* 458 */     for (String str : temp) {
/* 459 */       this.cb_group.addItem(str);
/*     */     }
/*     */   }
/*     */   
/*     */   static class CustomComboBox
/*     */     extends JLabel implements ListCellRenderer
/*     */   {
/*     */     public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus)
/*     */     {
/* 468 */       JLabel label = new JLabel() {
/*     */         public Dimension getPreferredSize() {
/* 470 */           return new Dimension(100, 50);
/*     */         }
/* 472 */       };
/* 473 */       label.setText(String.valueOf(value));
/* 474 */       label.setFont(new Font("나눔바른고딕", 0, 20));
/* 475 */       label.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0), 
/* 476 */         BorderFactory.createMatteBorder(0, 0, 0, 0, Color.BLACK)));
/*     */       
/* 478 */       return label;
/*     */     }
/*     */   }
/*     */   
/*     */   public void actionPerformed(ActionEvent arg0)
/*     */   {
/* 484 */     if (arg0.getSource().equals(this.bt_add)) {
/* 485 */       if (this.tf_id.getText().trim().isEmpty()) {
/* 486 */         JOptionPane.showMessageDialog(null, "빈 칸을 채우십시오.");
/* 487 */       } else if (this.tf_pw.getText().trim().isEmpty()) {
/* 488 */         JOptionPane.showMessageDialog(null, "빈 칸을 채우십시오.");
/* 489 */       } else if (this.tf_name.getText().trim().isEmpty()) {
/* 490 */         JOptionPane.showMessageDialog(null, "빈 칸을 채우십시오.");
/* 491 */       } else if (this.tf_phone.getText().trim().isEmpty()) {
/* 492 */         JOptionPane.showMessageDialog(null, "빈 칸을 채우십시오.");
/*     */       }
/* 494 */       else if (!this.isModifing) {
/* 495 */         String id = this.tf_id.getText();
/* 496 */         String pw = this.tf_pw.getText();
/* 497 */         String name = this.tf_name.getText();
/* 498 */         String phone = this.tf_phone.getText();
/* 499 */         String group = String.valueOf(this.cb_group.getSelectedItem());
/*     */         
/* 501 */         String[] dataList = { id, pw, name, phone, group };
/*     */         try
/*     */         {
/* 504 */           Database.insertData(Enum_Table_Ci.T001.getCode(), dataList);
/*     */           
/* 506 */           loadComboBox();
/* 507 */           User_Management.loadGroup();
/*     */         } catch (SQLException e) {
/* 509 */           e.printStackTrace();
/*     */         }
/*     */         
/* 512 */         JOptionPane.showMessageDialog(null, "등록되었습니다.");
/*     */         
/* 514 */         dispose();
/*     */       }
/*     */       else {
/* 517 */         String id = this.tf_id.getText();
/* 518 */         String pw = this.tf_pw.getText();
/* 519 */         String name = this.tf_name.getText();
/* 520 */         String phone = this.tf_phone.getText();
/* 521 */         String group = String.valueOf(this.cb_group.getSelectedItem());
/*     */         
/* 523 */         String[] idx_sql = { "ID", "PW", "NAME", "PHONE", "GROUP" };
/* 524 */         String[] original = { this.userID, this.userPW, this.userNAME, this.userPHONE, this.userGROUP };
/* 525 */         String[] beModify = { id, pw, name, phone, group };
/*     */         try
/*     */         {
/* 528 */           Database.modify(Enum_Table_Ci.T001.getCode(), idx_sql, original, beModify);
/*     */           
/* 530 */           loadComboBox();
/* 531 */           User_Management.loadGroup();
/*     */         } catch (SQLException e) {
/* 533 */           e.printStackTrace();
/*     */         }
/*     */         
/* 536 */         JOptionPane.showMessageDialog(null, "수정되었습니다.");
/*     */         
/* 538 */         dispose();
/*     */       }
/*     */     }
/* 541 */     else if (arg0.getSource().equals(this.bt_cancel)) {
/* 542 */       dispose();
/* 543 */     } else if (arg0.getSource().equals(this.bt_groupAdd)) {
/* 544 */       String gr_name = JOptionPane.showInputDialog(null, "생성할 그룹명을 입력하세요.");
/* 545 */       String[] dataList = { gr_name };
/*     */       
/* 547 */       if (gr_name != null) {
/*     */         try {
/* 549 */           Database.insertData(Enum_Table_Ci.T002.getCode(), dataList);
/*     */           
/* 551 */           loadComboBox();
/* 552 */           User_Management.loadGroup();
/*     */         } catch (SQLException e) {
/* 554 */           e.printStackTrace();
/*     */         }
/*     */       }
/* 557 */     } else if (arg0.getSource().equals(this.bt_groupDelete)) {
/* 558 */       String gr_name = JOptionPane.showInputDialog(null, "삭제할 그룹명을 입력하세요.");
/* 559 */       String[] idx_sql = { "GROUP" };
/* 560 */       String[] original = { gr_name };
/* 561 */       String[] beModify = { "기본그룹" };
/*     */       
/* 563 */       if (gr_name != null) {
/*     */         try {
/* 565 */           Database.removeData(Enum_Table_Ci.T002.getCode(), "GROUP", gr_name);
/* 566 */           Database.modify(Enum_Table_Ci.T001.getCode(), idx_sql, original, beModify);
/*     */           
/* 568 */           loadComboBox();
/* 569 */           User_Management.loadGroup();
/*     */         } catch (SQLException e) {
/* 571 */           e.printStackTrace();
/*     */         }
/*     */       }
/*     */     }
/* 575 */     else if (arg0.getSource().equals(this.bt_remove))
/*     */     {
/* 577 */       String id = this.userID;
/*     */       
/* 579 */       int beRemove = JOptionPane.showConfirmDialog(null, "삭제하시겠습니까?");
/*     */       
/* 581 */       if (beRemove == 0)
/*     */       {
/*     */         try
/*     */         {
/* 585 */           Database.removeData(Enum_Table_Ci.T001.getCode(), "ID", id);
/*     */           
/* 587 */           loadComboBox();
/* 588 */           User_Management.loadGroup();
/*     */         }
/*     */         catch (SQLException e)
/*     */         {
/* 592 */           e.printStackTrace();
/*     */         }
/*     */         
/* 595 */         dispose();
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\User_Management_P\User_Add_Di.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */