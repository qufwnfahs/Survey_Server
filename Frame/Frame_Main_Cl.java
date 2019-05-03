/*     */ package Frame;
/*     */ 
/*     */ import Enum.Enum_Font_Ci;
/*     */ import Model.Dialog.Server_Log_Di;
/*     */ import Model.Dialog.Survey_List.Question_Management.BorderPanel;
/*     */ import Model.Dialog.Survey_List_Di;
/*     */ import Model.Dialog.Survey_Management_Di;
/*     */ import Model.Dialog.User_Management;
/*     */ import Worker.ImageController;
/*     */ import Worker.Server;
/*     */ import java.awt.Color;
/*     */ import java.awt.Container;
/*     */ import java.awt.Cursor;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.Font;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.GridBagLayout;
/*     */ import java.awt.Image;
/*     */ import java.awt.Insets;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.io.IOException;
/*     */ import java.sql.SQLException;
/*     */ import java.text.ParseException;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Date;
/*     */ import java.util.Locale;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JRootPane;
/*     */ 
/*     */ 
/*     */ public class Frame_Main_Cl
/*     */   extends JFrame
/*     */   implements ActionListener
/*     */ {
/*  41 */   private GridBagLayout gbl = new GridBagLayout();
/*  42 */   private GridBagConstraints gbc = new GridBagConstraints();
/*     */   
/*     */ 
/*     */   private Server server;
/*     */   
/*     */ 
/*  48 */   private JLabel title_ll = new JLabel();
/*  49 */   private JLabel time_ll = new JLabel();
/*  50 */   private JLabel ampm_ll = new JLabel();
/*  51 */   private JLabel date_ll = new JLabel();
/*  52 */   private JLabel person_ll = new JLabel();
/*     */   
/*  54 */   private JButton survey_bt = new JButton();
/*  55 */   private JButton react_bt = new JButton();
/*  56 */   private JButton calculate_bt = new JButton();
/*  57 */   private JButton personal_problem_bt = new JButton();
/*  58 */   private JButton server_log_bt = new JButton();
/*  59 */   private JButton user_management_bt = new JButton();
/*     */   
/*     */   private Image img_Survey;
/*     */   
/*     */   private Image img_React;
/*     */   
/*     */   private Image img_Calculate;
/*     */   private Image img_Personal_Problem;
/*     */   private Image img_Server_Log;
/*     */   private Image img_User_Management;
/*  69 */   private BorderPanel borderPanel = new BorderPanel(this, 1);
/*     */   
/*     */   private Survey_List_Di survey_list;
/*     */   
/*     */   private Server_Log_Di server_log;
/*     */   private User_Management user_management;
/*     */   private Survey_Management_Di survey_management;
/*     */   
/*     */   public Frame_Main_Cl()
/*     */     throws SQLException, IOException, ParseException
/*     */   {
/*  80 */     this.server = new Server(this.server_log, this.person_ll);
/*  81 */     this.server.start();
/*     */     
/*     */ 
/*  84 */     this.survey_list = new Survey_List_Di(this.server);
/*  85 */     this.server_log = new Server_Log_Di();
/*  86 */     this.user_management = new User_Management();
/*  87 */     this.survey_management = new Survey_Management_Di();
/*     */     
/*     */ 
/*  90 */     setPreferredSize(new Dimension(800, 600));
/*  91 */     setMinimumSize(new Dimension(800, 600));
/*  92 */     setDefaultCloseOperation(3);
/*  93 */     setLocationRelativeTo(null);
/*  94 */     setUndecorated(true);
/*  95 */     getRootPane().setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
/*  96 */     getContentPane().setBackground(Color.WHITE);
/*  97 */     setIconImage(ImageController.resizeImage(new ImageIcon(getClass().getResource("/Image/poker-chip.png")), 48, 48));
/*  98 */     setTitle("정다운마을 설문조사");
/*     */     
/*     */ 
/* 101 */     this.img_Survey = ImageController.resizeImage(new ImageIcon(getClass().getResource("/Image/outline_description_black_36dp.png")), 40, 40);
/* 102 */     this.img_React = ImageController.resizeImage(new ImageIcon(getClass().getResource("/Image/copy.png")), 40, 40);
/* 103 */     this.img_Calculate = ImageController.resizeImage(new ImageIcon(getClass().getResource("/Image/clear.png")), 40, 40);
/* 104 */     this.img_Personal_Problem = ImageController.resizeImage(new ImageIcon(getClass().getResource("/Image/outline_help_outline_black_36dp.png")), 40, 40);
/* 105 */     this.img_Server_Log = ImageController.resizeImage(new ImageIcon(getClass().getResource("/Image/circle.png")), 40, 40);
/* 106 */     this.img_User_Management = ImageController.resizeImage(new ImageIcon(getClass().getResource("/Image/outline_assignment_ind_black_36dp.png")), 40, 40);
/*     */     
/*     */ 
/* 109 */     setLayout(this.gbl);
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 114 */     this.title_ll.setText("JDU Welfare");
/* 115 */     this.title_ll.setFont(new Font("나눔바른고딕", 1, 35));
/* 116 */     this.title_ll.setHorizontalAlignment(0);
/*     */     
/* 118 */     this.person_ll.setText("접속 인원 : 0명");
/* 119 */     this.person_ll.setFont(Enum_Font_Ci.나눔바른고딕22.getFont());
/*     */     
/*     */ 
/* 122 */     this.time_ll.setFont(new Font("나눔바른고딕", 0, 35));
/* 123 */     this.ampm_ll.setFont(new Font("나눔바른고딕", 0, 20));
/* 124 */     this.date_ll.setFont(new Font("나눔바른고딕", 0, 22));
/* 125 */     this.date_ll.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK));
/*     */     
/* 127 */     this.time_ll.setHorizontalAlignment(4);
/* 128 */     this.ampm_ll.setHorizontalAlignment(2);
/* 129 */     this.date_ll.setHorizontalAlignment(0);
/* 130 */     this.date_ll.setVerticalAlignment(1);
/*     */     
/* 132 */     new Util_Clock_Cl(null).start();
/* 133 */     new Util_Person_Cl(null).start();
/*     */     
/*     */ 
/*     */ 
/* 137 */     this.survey_bt.setText("설문 관리");
/* 138 */     this.survey_bt.setFont(new Font("나눔바른고딕", 0, 24));
/* 139 */     this.survey_bt.setIcon(new ImageIcon(this.img_Survey));
/* 140 */     this.survey_bt.setVerticalTextPosition(0);
/* 141 */     this.survey_bt.setHorizontalTextPosition(2);
/* 142 */     this.survey_bt.setOpaque(true);
/* 143 */     this.survey_bt.setBackground(Color.WHITE);
/* 144 */     this.survey_bt.setFocusPainted(false);
/* 145 */     this.survey_bt.setBorderPainted(false);
/* 146 */     this.survey_bt.setCursor(new Cursor(12));
/* 147 */     this.survey_bt.setIconTextGap(10);
/* 148 */     this.survey_bt.addActionListener(this);
/*     */     
/*     */ 
/* 151 */     this.react_bt.setText("응답 관리");
/* 152 */     this.react_bt.setFont(new Font("나눔바른고딕", 0, 22));
/* 153 */     this.react_bt.setIcon(new ImageIcon(this.img_React));
/* 154 */     this.react_bt.setVerticalTextPosition(0);
/* 155 */     this.react_bt.setHorizontalTextPosition(2);
/* 156 */     this.react_bt.setOpaque(true);
/* 157 */     this.react_bt.setBackground(Color.WHITE);
/* 158 */     this.react_bt.setFocusPainted(false);
/* 159 */     this.react_bt.setBorderPainted(false);
/* 160 */     this.react_bt.setCursor(new Cursor(12));
/* 161 */     this.react_bt.setIconTextGap(10);
/* 162 */     this.react_bt.addActionListener(this);
/*     */     
/*     */ 
/* 165 */     this.calculate_bt.setText("설문 통계");
/* 166 */     this.calculate_bt.setFont(new Font("나눔바른고딕", 0, 22));
/* 167 */     this.calculate_bt.setIcon(new ImageIcon(this.img_Calculate));
/* 168 */     this.calculate_bt.setVerticalTextPosition(0);
/* 169 */     this.calculate_bt.setHorizontalTextPosition(2);
/* 170 */     this.calculate_bt.setOpaque(true);
/* 171 */     this.calculate_bt.setBackground(Color.WHITE);
/* 172 */     this.calculate_bt.setFocusPainted(false);
/* 173 */     this.calculate_bt.setBorderPainted(false);
/* 174 */     this.calculate_bt.setCursor(new Cursor(12));
/* 175 */     this.calculate_bt.setIconTextGap(10);
/* 176 */     this.calculate_bt.addActionListener(this);
/*     */     
/*     */ 
/* 179 */     this.personal_problem_bt.setText("질의 응답");
/* 180 */     this.personal_problem_bt.setFont(new Font("나눔바른고딕", 0, 22));
/* 181 */     this.personal_problem_bt.setIcon(new ImageIcon(this.img_Personal_Problem));
/* 182 */     this.personal_problem_bt.setVerticalTextPosition(0);
/* 183 */     this.personal_problem_bt.setHorizontalTextPosition(2);
/* 184 */     this.personal_problem_bt.setOpaque(true);
/* 185 */     this.personal_problem_bt.setBackground(Color.WHITE);
/* 186 */     this.personal_problem_bt.setFocusPainted(false);
/* 187 */     this.personal_problem_bt.setBorderPainted(false);
/* 188 */     this.personal_problem_bt.setCursor(new Cursor(12));
/* 189 */     this.personal_problem_bt.setIconTextGap(10);
/* 190 */     this.personal_problem_bt.addActionListener(this);
/*     */     
/*     */ 
/* 193 */     this.server_log_bt.setText("서버 로그");
/* 194 */     this.server_log_bt.setFont(new Font("나눔바른고딕", 0, 22));
/* 195 */     this.server_log_bt.setIcon(new ImageIcon(this.img_Server_Log));
/* 196 */     this.server_log_bt.setVerticalTextPosition(0);
/* 197 */     this.server_log_bt.setHorizontalTextPosition(2);
/* 198 */     this.server_log_bt.setOpaque(true);
/* 199 */     this.server_log_bt.setBackground(Color.WHITE);
/* 200 */     this.server_log_bt.setFocusPainted(false);
/* 201 */     this.server_log_bt.setBorderPainted(false);
/* 202 */     this.server_log_bt.setCursor(new Cursor(12));
/* 203 */     this.server_log_bt.setIconTextGap(10);
/* 204 */     this.server_log_bt.addActionListener(this);
/*     */     
/*     */ 
/* 207 */     this.user_management_bt.setText("유저 관리");
/* 208 */     this.user_management_bt.setFont(new Font("나눔바른고딕", 0, 22));
/* 209 */     this.user_management_bt.setIcon(new ImageIcon(this.img_User_Management));
/* 210 */     this.user_management_bt.setVerticalTextPosition(0);
/* 211 */     this.user_management_bt.setHorizontalTextPosition(2);
/* 212 */     this.user_management_bt.setOpaque(true);
/* 213 */     this.user_management_bt.setBackground(Color.WHITE);
/* 214 */     this.user_management_bt.setFocusPainted(false);
/* 215 */     this.user_management_bt.setBorderPainted(false);
/* 216 */     this.user_management_bt.setCursor(new Cursor(12));
/* 217 */     this.user_management_bt.setIconTextGap(10);
/* 218 */     this.user_management_bt.addActionListener(this);
/*     */     
/*     */ 
/* 221 */     this.gbc.anchor = 11;
/* 222 */     this.gbc.fill = 1;
/*     */     
/* 224 */     this.gbc.gridx = 0;
/* 225 */     this.gbc.gridy = 0;
/* 226 */     this.gbc.gridwidth = 7;
/* 227 */     this.gbc.gridheight = 1;
/* 228 */     this.gbc.weightx = 1.0D;
/* 229 */     this.gbc.weighty = 0.01D;
/* 230 */     this.gbc.insets = new Insets(-2, -1, 0, -1);
/* 231 */     add(this.borderPanel, this.gbc);
/*     */     
/* 233 */     this.gbc.gridx = 0;
/* 234 */     this.gbc.gridy = 1;
/* 235 */     this.gbc.weighty = 0.41D;
/* 236 */     this.gbc.insets = new Insets(0, 0, 0, 0);
/* 237 */     add(this.title_ll, this.gbc);
/*     */     
/* 239 */     this.gbc.gridx = 0;
/* 240 */     this.gbc.gridy = 2;
/* 241 */     this.gbc.gridwidth = 3;
/* 242 */     this.gbc.weighty = 0.07D;
/* 243 */     this.gbc.insets = new Insets(0, 270, 0, 0);
/* 244 */     add(this.time_ll, this.gbc);
/*     */     
/* 246 */     this.gbc.gridx = 3;
/* 247 */     this.gbc.gridy = 2;
/* 248 */     this.gbc.insets = new Insets(0, 20, 0, 0);
/* 249 */     add(this.ampm_ll, this.gbc);
/*     */     
/* 251 */     this.gbc.anchor = 13;
/* 252 */     this.gbc.fill = 0;
/*     */     
/* 254 */     this.gbc.gridx = 6;
/* 255 */     this.gbc.gridy = 2;
/* 256 */     this.gbc.gridwidth = 1;
/* 257 */     this.gbc.insets = new Insets(0, 0, 0, 100);
/* 258 */     add(this.person_ll, this.gbc);
/*     */     
/* 260 */     this.gbc.anchor = 11;
/* 261 */     this.gbc.fill = 1;
/*     */     
/* 263 */     this.gbc.gridx = 0;
/* 264 */     this.gbc.gridy = 3;
/* 265 */     this.gbc.gridwidth = 7;
/* 266 */     this.gbc.weightx = 1.0D;
/* 267 */     this.gbc.weighty = 0.14D;
/* 268 */     this.gbc.insets = new Insets(10, 0, 0, 0);
/* 269 */     add(this.date_ll, this.gbc);
/*     */     
/* 271 */     JPanel pl_temp = new JPanel();
/*     */     
/* 273 */     GridBagLayout gbl_temp = new GridBagLayout();
/* 274 */     GridBagConstraints gbc_temp = new GridBagConstraints();
/*     */     
/* 276 */     pl_temp.setLayout(gbl_temp);
/*     */     
/*     */ 
/* 279 */     gbc_temp.anchor = 11;
/* 280 */     gbc_temp.fill = 1;
/*     */     
/* 282 */     gbc_temp.gridx = 0;
/* 283 */     gbc_temp.gridy = 0;
/* 284 */     gbc_temp.gridwidth = 1;
/* 285 */     gbc_temp.weightx = 1.0D;
/* 286 */     gbc_temp.weighty = 1.0D;
/* 287 */     pl_temp.add(this.survey_bt, gbc_temp);
/*     */     
/* 289 */     gbc_temp.gridx = 1;
/* 290 */     gbc_temp.gridy = 0;
/* 291 */     pl_temp.add(this.react_bt, gbc_temp);
/*     */     
/* 293 */     gbc_temp.gridx = 2;
/* 294 */     gbc_temp.gridy = 0;
/* 295 */     pl_temp.add(this.user_management_bt, gbc_temp);
/*     */     
/* 297 */     this.gbc.gridx = 0;
/* 298 */     this.gbc.gridy = 4;
/* 299 */     this.gbc.gridwidth = 7;
/* 300 */     this.gbc.weighty = 0.37D;
/* 301 */     add(pl_temp, this.gbc);
/*     */     
/* 303 */     pack();
/* 304 */     setVisible(true);
/*     */   }
/*     */   
/*     */   private class Util_Clock_Cl extends Thread
/*     */   {
/* 309 */     SimpleDateFormat fmt_time = new SimpleDateFormat("hh:mm:ss", Locale.KOREA);
/* 310 */     SimpleDateFormat fmt_ampm = new SimpleDateFormat("a", Locale.ENGLISH);
/* 311 */     SimpleDateFormat fmt_date = new SimpleDateFormat("yyyy년 MM월 dd일", Locale.KOREA);
/*     */     
/* 313 */     String time_str = "";
/* 314 */     String ampm_str = "";
/* 315 */     String date_str = "";
/*     */     
/*     */     private Util_Clock_Cl() {}
/*     */     
/*     */     public void run()
/*     */     {
/*     */       try {
/*     */         for (;;) {
/* 323 */           Date time = new Date();
/* 324 */           this.time_str = this.fmt_time.format(time);
/* 325 */           this.ampm_str = this.fmt_ampm.format(time);
/* 326 */           this.date_str = this.fmt_date.format(time);
/*     */           
/* 328 */           Frame_Main_Cl.this.time_ll.setText(this.time_str);
/* 329 */           Frame_Main_Cl.this.ampm_ll.setText(this.ampm_str);
/* 330 */           Frame_Main_Cl.this.date_ll.setText(this.date_str);
/*     */           
/* 332 */           Frame_Main_Cl.this.server_log.setTime();
/*     */           
/* 334 */           Thread.sleep(1000L);
/*     */         }
/*     */       }
/*     */       catch (Throwable e)
/*     */       {
/* 339 */         System.exit(1);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private class Util_Person_Cl extends Thread
/*     */   {
/*     */     private Util_Person_Cl() {}
/*     */     
/*     */     public void run()
/*     */     {
/*     */       try {
/*     */         for (;;) {
/* 352 */           Server.setPersonLabel();
/*     */           
/* 354 */           Thread.sleep(1000L);
/*     */         }
/*     */       }
/*     */       catch (Throwable e)
/*     */       {
/* 359 */         System.exit(1);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public void actionPerformed(ActionEvent e)
/*     */   {
/* 367 */     if (e.getSource().equals(this.server_log_bt))
/*     */     {
/* 369 */       this.server_log.setVisible(true);
/*     */     }
/* 371 */     else if (e.getSource().equals(this.user_management_bt))
/*     */     {
/* 373 */       this.user_management.setVisible(true);
/*     */     }
/* 375 */     else if (e.getSource().equals(this.survey_bt))
/*     */     {
/* 377 */       this.survey_list.setVisible(true);
/*     */     }
/* 379 */     else if (e.getSource().equals(this.react_bt))
/*     */     {
/* 381 */       this.survey_management.setVisible(true);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Frame\Frame_Main_Cl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */