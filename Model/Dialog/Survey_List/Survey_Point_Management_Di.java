/*     */ package Model.Dialog.Survey_List;
/*     */ 
/*     */ import Enum.Enum_Color_Ci;
/*     */ import Enum.Enum_Font_Ci;
/*     */ import Enum.Enum_Image_Ci;
/*     */ import Enum.Enum_Table_Ci;
/*     */ import Model.Dialog.Survey_List.Question_Management.BorderPanel;
/*     */ import Model.Dialog.Survey_List.Question_Management.NumberPanel;
/*     */ import Model.Point_Section;
/*     */ import Worker.Database;
/*     */ import Worker.ImageController;
/*     */ import com.google.gson.Gson;
/*     */ import java.awt.Color;
/*     */ import java.awt.Cursor;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.Font;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.GridBagLayout;
/*     */ import java.awt.Insets;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.awt.event.ItemEvent;
/*     */ import java.awt.event.ItemListener;
/*     */ import java.io.PrintStream;
/*     */ import java.sql.SQLException;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JCheckBox;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JScrollPane;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Survey_Point_Management_Di
/*     */   extends JPanel
/*     */   implements ItemListener, ActionListener
/*     */ {
/*  45 */   private GridBagLayout gbl = new GridBagLayout();
/*  46 */   private GridBagConstraints gbc = new GridBagConstraints();
/*  47 */   private GridBagLayout gbl_2 = new GridBagLayout();
/*  48 */   private GridBagConstraints gbc_2 = new GridBagConstraints();
/*     */   
/*     */   private BorderPanel borderPanel;
/*     */   
/*  52 */   private NumberPanel numberPanel = new NumberPanel(3);
/*  53 */   private JLabel ll_title = new JLabel();
/*  54 */   private JCheckBox cb_enable = new JCheckBox();
/*  55 */   private JPanel pl_main = new JPanel();
/*     */   private JScrollPane scl_main;
/*  57 */   private JButton bt_question = new JButton();
/*  58 */   private JButton bt_prev = new JButton();
/*  59 */   private JButton bt_complete = new JButton();
/*     */   
/*     */   private Card_Survey_Fr frame;
/*     */   
/*     */   private Card_Survey_Fr_Modify frame_Modify;
/*  64 */   private List<Point_Section> list_point = new ArrayList();
/*     */   
/*     */   public Survey_Point_Management_Di(Card_Survey_Fr frame) throws SQLException
/*     */   {
/*  68 */     this.frame = frame;
/*     */     
/*  70 */     setLayout(this.gbl);
/*  71 */     setBackground(Color.WHITE);
/*     */     
/*     */ 
/*  74 */     this.borderPanel = new BorderPanel(frame, 0);
/*     */     
/*     */ 
/*     */ 
/*  78 */     this.ll_title.setText("   점수 관리");
/*  79 */     this.ll_title.setFont(new Font("나눔바른고딕", 0, 25));
/*  80 */     this.ll_title.setOpaque(true);
/*  81 */     this.ll_title.setBackground(Color.white);
/*  82 */     this.ll_title.setBorder(BorderFactory.createMatteBorder(2, 0, 2, 1, Color.BLACK));
/*     */     
/*  84 */     this.cb_enable.setText("점수 없음");
/*  85 */     this.cb_enable.setBackground(Color.WHITE);
/*  86 */     this.cb_enable.setFont(Enum_Font_Ci.FONT22.getFont());
/*  87 */     this.cb_enable.setIconTextGap(10);
/*  88 */     this.cb_enable.addItemListener(this);
/*     */     
/*  90 */     this.pl_main.setBackground(Enum_Color_Ci.GRAY.getColor());
/*  91 */     this.pl_main.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, Color.BLACK));
/*  92 */     this.pl_main.setVisible(false);
/*  93 */     this.pl_main.setLayout(this.gbl_2);
/*     */     
/*  95 */     this.scl_main = new JScrollPane(this.pl_main);
/*  96 */     this.scl_main.setVerticalScrollBarPolicy(22);
/*  97 */     this.scl_main.setHorizontalScrollBarPolicy(30);
/*     */     
/*  99 */     this.bt_question.setText("문제 설정");
/* 100 */     this.bt_question.setOpaque(true);
/* 101 */     this.bt_question.setBackground(Enum_Color_Ci._673AB7.getColor());
/* 102 */     this.bt_question.setForeground(Color.WHITE);
/* 103 */     this.bt_question.setFont(Enum_Font_Ci.INFO.getFont());
/* 104 */     this.bt_question.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.PREV.getImageIcon(), 28, 28)));
/* 105 */     this.bt_question.setHorizontalAlignment(2);
/* 106 */     this.bt_question.setCursor(new Cursor(12));
/* 107 */     this.bt_question.addActionListener(this);
/* 108 */     this.bt_question.setPreferredSize(new Dimension(150, 50));
/*     */     
/* 110 */     this.bt_prev.setText("이전");
/* 111 */     this.bt_prev.setOpaque(true);
/* 112 */     this.bt_prev.setBackground(Enum_Color_Ci._673AB7.getColor());
/* 113 */     this.bt_prev.setForeground(Color.WHITE);
/* 114 */     this.bt_prev.setFont(Enum_Font_Ci.INFO.getFont());
/* 115 */     this.bt_prev.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.PREV.getImageIcon(), 28, 28)));
/* 116 */     this.bt_prev.setHorizontalAlignment(2);
/* 117 */     this.bt_prev.setCursor(new Cursor(12));
/* 118 */     this.bt_prev.addActionListener(this);
/* 119 */     this.bt_prev.setPreferredSize(new Dimension(110, 50));
/*     */     
/* 121 */     this.bt_complete.setText("완료");
/* 122 */     this.bt_complete.setOpaque(true);
/* 123 */     this.bt_complete.setBackground(Enum_Color_Ci._673AB7.getColor());
/* 124 */     this.bt_complete.setForeground(Color.WHITE);
/* 125 */     this.bt_complete.setFont(Enum_Font_Ci.INFO.getFont());
/* 126 */     this.bt_complete.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.NEXT.getImageIcon(), 28, 28)));
/* 127 */     this.bt_complete.setHorizontalTextPosition(2);
/* 128 */     this.bt_complete.setHorizontalAlignment(4);
/* 129 */     this.bt_complete.setCursor(new Cursor(12));
/* 130 */     this.bt_complete.addActionListener(this);
/* 131 */     this.bt_complete.setPreferredSize(new Dimension(110, 50));
/*     */     
/*     */ 
/* 134 */     this.gbc.anchor = 11;
/* 135 */     this.gbc.fill = 1;
/*     */     
/* 137 */     this.gbc.gridx = 0;
/* 138 */     this.gbc.gridy = 0;
/* 139 */     this.gbc.gridwidth = 3;
/* 140 */     this.gbc.weightx = 1.0D;
/* 141 */     this.gbc.weighty = 0.01D;
/* 142 */     add(this.borderPanel, this.gbc);
/*     */     
/* 144 */     this.gbc.gridx = 0;
/* 145 */     this.gbc.gridy = 1;
/* 146 */     this.gbc.gridwidth = 3;
/* 147 */     this.gbc.weighty = 0.1D;
/* 148 */     add(this.numberPanel, this.gbc);
/*     */     
/* 150 */     this.gbc.anchor = 10;
/* 151 */     this.gbc.fill = 0;
/*     */     
/* 153 */     this.gbc.gridx = 0;
/* 154 */     this.gbc.gridy = 2;
/* 155 */     this.gbc.gridwidth = 3;
/* 156 */     this.gbc.weighty = 0.07D;
/* 157 */     add(this.cb_enable, this.gbc);
/*     */     
/* 159 */     this.gbc.fill = 1;
/*     */     
/* 161 */     this.gbc.gridx = 0;
/* 162 */     this.gbc.gridy = 3;
/* 163 */     this.gbc.gridwidth = 3;
/* 164 */     this.gbc.weighty = 0.75D;
/* 165 */     this.gbc.insets = new Insets(0, 20, 0, 20);
/* 166 */     add(this.scl_main, this.gbc);
/*     */     
/* 168 */     this.gbc.fill = 0;
/*     */     
/* 170 */     this.gbc.gridx = 0;
/* 171 */     this.gbc.gridy = 4;
/* 172 */     this.gbc.gridwidth = 1;
/* 173 */     this.gbc.weighty = 0.07D;
/* 174 */     this.gbc.insets = new Insets(0, 0, 0, 300);
/* 175 */     add(this.bt_question, this.gbc);
/*     */     
/* 177 */     this.gbc.gridx = 1;
/* 178 */     this.gbc.gridy = 4;
/* 179 */     this.gbc.insets = new Insets(0, 0, 0, 0);
/* 180 */     add(this.bt_prev, this.gbc);
/*     */     
/* 182 */     this.gbc.gridx = 2;
/* 183 */     this.gbc.gridy = 4;
/* 184 */     add(this.bt_complete, this.gbc);
/*     */   }
/*     */   
/*     */   public Survey_Point_Management_Di(Card_Survey_Fr_Modify frame_Modify) throws SQLException
/*     */   {
/* 189 */     this.frame_Modify = frame_Modify;
/*     */     
/* 191 */     setLayout(this.gbl);
/* 192 */     setBackground(Color.WHITE);
/*     */     
/*     */ 
/* 195 */     this.borderPanel = new BorderPanel(frame_Modify, 0);
/*     */     
/*     */ 
/*     */ 
/* 199 */     this.ll_title.setText("   점수 관리");
/* 200 */     this.ll_title.setFont(new Font("나눔바른고딕", 0, 25));
/* 201 */     this.ll_title.setOpaque(true);
/* 202 */     this.ll_title.setBackground(Color.white);
/* 203 */     this.ll_title.setBorder(BorderFactory.createMatteBorder(2, 0, 2, 1, Color.BLACK));
/*     */     
/* 205 */     this.cb_enable.setText("점수 없음");
/* 206 */     this.cb_enable.setBackground(Color.WHITE);
/* 207 */     this.cb_enable.setFont(Enum_Font_Ci.FONT22.getFont());
/* 208 */     this.cb_enable.setIconTextGap(10);
/* 209 */     this.cb_enable.addItemListener(this);
/*     */     
/* 211 */     this.pl_main.setBackground(Enum_Color_Ci.GRAY.getColor());
/* 212 */     this.pl_main.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, Color.BLACK));
/* 213 */     this.pl_main.setVisible(false);
/* 214 */     this.pl_main.setLayout(this.gbl_2);
/*     */     
/* 216 */     this.scl_main = new JScrollPane(this.pl_main);
/* 217 */     this.scl_main.setVerticalScrollBarPolicy(22);
/* 218 */     this.scl_main.setHorizontalScrollBarPolicy(30);
/*     */     
/* 220 */     this.bt_question.setText("문제 설정");
/* 221 */     this.bt_question.setOpaque(true);
/* 222 */     this.bt_question.setBackground(Enum_Color_Ci._673AB7.getColor());
/* 223 */     this.bt_question.setForeground(Color.WHITE);
/* 224 */     this.bt_question.setFont(Enum_Font_Ci.INFO.getFont());
/* 225 */     this.bt_question.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.PREV.getImageIcon(), 28, 28)));
/* 226 */     this.bt_question.setHorizontalAlignment(2);
/* 227 */     this.bt_question.setCursor(new Cursor(12));
/* 228 */     this.bt_question.addActionListener(this);
/* 229 */     this.bt_question.setPreferredSize(new Dimension(150, 50));
/*     */     
/* 231 */     this.bt_prev.setText("이전");
/* 232 */     this.bt_prev.setOpaque(true);
/* 233 */     this.bt_prev.setBackground(Enum_Color_Ci._673AB7.getColor());
/* 234 */     this.bt_prev.setForeground(Color.WHITE);
/* 235 */     this.bt_prev.setFont(Enum_Font_Ci.INFO.getFont());
/* 236 */     this.bt_prev.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.PREV.getImageIcon(), 28, 28)));
/* 237 */     this.bt_prev.setHorizontalAlignment(2);
/* 238 */     this.bt_prev.setCursor(new Cursor(12));
/* 239 */     this.bt_prev.addActionListener(this);
/* 240 */     this.bt_prev.setPreferredSize(new Dimension(110, 50));
/*     */     
/* 242 */     this.bt_complete.setText("완료");
/* 243 */     this.bt_complete.setOpaque(true);
/* 244 */     this.bt_complete.setBackground(Enum_Color_Ci._673AB7.getColor());
/* 245 */     this.bt_complete.setForeground(Color.WHITE);
/* 246 */     this.bt_complete.setFont(Enum_Font_Ci.INFO.getFont());
/* 247 */     this.bt_complete.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.NEXT.getImageIcon(), 28, 28)));
/* 248 */     this.bt_complete.setHorizontalTextPosition(2);
/* 249 */     this.bt_complete.setHorizontalAlignment(4);
/* 250 */     this.bt_complete.setCursor(new Cursor(12));
/* 251 */     this.bt_complete.addActionListener(this);
/* 252 */     this.bt_complete.setPreferredSize(new Dimension(110, 50));
/*     */     
/*     */ 
/* 255 */     this.gbc.anchor = 11;
/* 256 */     this.gbc.fill = 1;
/*     */     
/* 258 */     this.gbc.gridx = 0;
/* 259 */     this.gbc.gridy = 0;
/* 260 */     this.gbc.gridwidth = 3;
/* 261 */     this.gbc.weightx = 1.0D;
/* 262 */     this.gbc.weighty = 0.01D;
/* 263 */     add(this.borderPanel, this.gbc);
/*     */     
/* 265 */     this.gbc.gridx = 0;
/* 266 */     this.gbc.gridy = 1;
/* 267 */     this.gbc.gridwidth = 3;
/* 268 */     this.gbc.weighty = 0.1D;
/* 269 */     add(this.numberPanel, this.gbc);
/*     */     
/* 271 */     this.gbc.anchor = 10;
/* 272 */     this.gbc.fill = 0;
/*     */     
/* 274 */     this.gbc.gridx = 0;
/* 275 */     this.gbc.gridy = 2;
/* 276 */     this.gbc.gridwidth = 3;
/* 277 */     this.gbc.weighty = 0.07D;
/* 278 */     add(this.cb_enable, this.gbc);
/*     */     
/* 280 */     this.gbc.fill = 1;
/*     */     
/* 282 */     this.gbc.gridx = 0;
/* 283 */     this.gbc.gridy = 3;
/* 284 */     this.gbc.gridwidth = 3;
/* 285 */     this.gbc.weighty = 0.75D;
/* 286 */     this.gbc.insets = new Insets(0, 20, 0, 20);
/* 287 */     add(this.scl_main, this.gbc);
/*     */     
/* 289 */     this.gbc.fill = 0;
/*     */     
/* 291 */     this.gbc.gridx = 0;
/* 292 */     this.gbc.gridy = 4;
/* 293 */     this.gbc.gridwidth = 1;
/* 294 */     this.gbc.weighty = 0.07D;
/* 295 */     this.gbc.insets = new Insets(0, 0, 0, 300);
/* 296 */     add(this.bt_question, this.gbc);
/*     */     
/* 298 */     this.gbc.gridx = 1;
/* 299 */     this.gbc.gridy = 4;
/* 300 */     this.gbc.insets = new Insets(0, 0, 0, 0);
/* 301 */     add(this.bt_prev, this.gbc);
/*     */     
/* 303 */     this.gbc.gridx = 2;
/* 304 */     this.gbc.gridy = 4;
/* 305 */     add(this.bt_complete, this.gbc);
/*     */   }
/*     */   
/*     */   public void createSection()
/*     */   {
/* 310 */     this.pl_main.removeAll();
/* 311 */     this.list_point.clear();
/*     */     
/*     */ 
/* 314 */     this.gbc_2.anchor = 10;
/* 315 */     this.gbc_2.fill = 0;
/*     */     
/* 317 */     this.gbc_2.gridx = 0;
/* 318 */     this.gbc_2.gridy = 0;
/* 319 */     this.gbc_2.insets = new Insets(0, 0, 20, 0);
/*     */     
/* 321 */     List<Module_Section> lt_sec = this.frame.getSurvey().getSection();
/*     */     
/* 323 */     for (int i = 0; i < lt_sec.size(); i++)
/*     */     {
/* 325 */       Point_Section pc = new Point_Section();
/* 326 */       pc.setLabel(String.valueOf(i + 1));
/* 327 */       pc.setName(((Module_Section)lt_sec.get(i)).getName());
/* 328 */       pc.setPoint(String.valueOf(((Module_Section)lt_sec.get(i)).getPoint()));
/*     */       
/* 330 */       pc.setColor(new Color(Integer.parseInt(this.frame.getSurvey().getMainColor())));
/* 331 */       pc.setBord(new Color(Integer.parseInt(this.frame.getSurvey().getMainColor())));
/*     */       
/* 333 */       this.pl_main.add(pc, this.gbc_2);
/*     */       
/* 335 */       this.gbc_2.gridy += 1;
/*     */       
/* 337 */       this.list_point.add(pc);
/*     */     }
/*     */   }
/*     */   
/*     */   public void createSection_Modify()
/*     */   {
/* 343 */     this.pl_main.removeAll();
/* 344 */     this.list_point.clear();
/*     */     
/*     */ 
/* 347 */     this.gbc_2.anchor = 10;
/* 348 */     this.gbc_2.fill = 0;
/*     */     
/* 350 */     this.gbc_2.gridx = 0;
/* 351 */     this.gbc_2.gridy = 0;
/* 352 */     this.gbc_2.insets = new Insets(0, 0, 20, 0);
/*     */     
/* 354 */     List<Module_Section> lt_sec = this.frame_Modify.getSurvey().getSection();
/*     */     
/* 356 */     for (int i = 0; i < lt_sec.size(); i++)
/*     */     {
/* 358 */       Point_Section pc = new Point_Section();
/* 359 */       pc.setLabel(String.valueOf(i + 1));
/* 360 */       pc.setName(((Module_Section)lt_sec.get(i)).getName());
/* 361 */       pc.setPoint(String.valueOf(((Module_Section)lt_sec.get(i)).getPoint()));
/*     */       
/* 363 */       pc.setColor(new Color(Integer.parseInt(this.frame_Modify.getSurvey().getMainColor())));
/* 364 */       pc.setBord(new Color(Integer.parseInt(this.frame_Modify.getSurvey().getMainColor())));
/*     */       
/* 366 */       this.pl_main.add(pc, this.gbc_2);
/*     */       
/* 368 */       this.gbc_2.gridy += 1;
/*     */       
/* 370 */       this.list_point.add(pc);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public void itemStateChanged(ItemEvent e)
/*     */   {
/* 377 */     if (e.getStateChange() == 1)
/*     */     {
/* 379 */       this.cb_enable.setText("점수 설정");
/*     */       
/*     */ 
/* 382 */       this.pl_main.setBackground(Color.WHITE);
/* 383 */       this.pl_main.setVisible(true);
/*     */     }
/* 385 */     else if (e.getStateChange() == 2)
/*     */     {
/* 387 */       this.cb_enable.setText("점수 없음");
/*     */       
/*     */ 
/* 390 */       this.pl_main.setBackground(Enum_Color_Ci.GRAY.getColor());
/* 391 */       this.pl_main.setVisible(false);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void actionPerformed(ActionEvent arg0)
/*     */   {
/* 399 */     if (arg0.getSource().equals(this.bt_prev))
/*     */     {
/* 401 */       if (this.frame == null)
/*     */       {
/* 403 */         this.frame_Modify.prev();
/*     */       }
/*     */       else
/*     */       {
/* 407 */         this.frame.prev();
/*     */       }
/*     */     }
/* 410 */     else if (arg0.getSource().equals(this.bt_complete))
/*     */     {
/* 412 */       savePoint();
/*     */       
/*     */       try
/*     */       {
/* 416 */         saveSurvey();
/*     */       }
/*     */       catch (SQLException e)
/*     */       {
/* 420 */         e.printStackTrace();
/*     */       }
/*     */       
/* 423 */       if (this.frame == null)
/*     */       {
/* 425 */         JOptionPane optionPane = new JOptionPane();
/* 426 */         JOptionPane.showMessageDialog(null, "설문이 변경되었습니다.");
/*     */         
/* 428 */         this.frame_Modify.dispose();
/*     */       }
/*     */       else
/*     */       {
/* 432 */         JOptionPane optionPane = new JOptionPane();
/* 433 */         JOptionPane.showMessageDialog(null, "설문이 생성되었습니다.");
/*     */         
/* 435 */         this.frame.dispose();
/*     */       }
/*     */     }
/* 438 */     else if (arg0.getSource().equals(this.bt_question))
/*     */     {
/* 440 */       if (this.cb_enable.isSelected())
/*     */       {
/* 442 */         if (this.frame == null)
/*     */         {
/* 444 */           Question_Dialog qd = new Question_Dialog(this.frame_Modify);
/* 445 */           qd.setVisible(true);
/*     */         }
/*     */         else
/*     */         {
/* 449 */           Question_Dialog qd = new Question_Dialog(this.frame);
/* 450 */           qd.setVisible(true);
/*     */         }
/*     */       }
/*     */       else
/*     */       {
/* 455 */         JOptionPane optionPane = new JOptionPane();
/* 456 */         JOptionPane.showMessageDialog(null, "'점수 없음'을 체크해주세요.");
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void savePoint()
/*     */   {
/* 463 */     if (this.frame == null)
/*     */     {
/* 465 */       for (Module_Section ms : this.frame_Modify.getSurvey().getSection())
/*     */       {
/* 467 */         ms.setPoint(0);
/*     */       }
/*     */       
/* 470 */       for (int i = 0; i < this.list_point.size(); i++)
/*     */       {
/* 472 */         ((Module_Section)this.frame_Modify.getSurvey().getSection().get(i)).setPoint(Integer.valueOf(((Point_Section)this.list_point.get(i)).getPoint()).intValue());
/*     */       }
/*     */       
/* 475 */       if (this.cb_enable.isSelected())
/*     */       {
/* 477 */         this.frame_Modify.getSurvey().setHavePoint(true);
/*     */       }
/*     */     }
/*     */     else
/*     */     {
/* 482 */       for (Module_Section ms : this.frame.getSurvey().getSection())
/*     */       {
/* 484 */         ms.setPoint(0);
/*     */       }
/*     */       
/* 487 */       for (int i = 0; i < this.list_point.size(); i++)
/*     */       {
/* 489 */         ((Module_Section)this.frame.getSurvey().getSection().get(i)).setPoint(Integer.valueOf(((Point_Section)this.list_point.get(i)).getPoint()).intValue());
/*     */       }
/*     */       
/* 492 */       if (this.cb_enable.isSelected())
/*     */       {
/* 494 */         this.frame.getSurvey().setHavePoint(true);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void saveSurvey() throws SQLException
/*     */   {
/* 501 */     SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
/*     */     
/* 503 */     if (this.frame == null)
/*     */     {
/*     */ 
/* 506 */       String IDF_CD = this.frame_Modify.getSurvey().getCode();
/* 507 */       String SURVEY_NM = this.frame_Modify.getSurvey().getName();
/* 508 */       String START_DT = this.frame_Modify.getSurvey().getStart();
/* 509 */       String END_DT = this.frame_Modify.getSurvey().getEnd();
/* 510 */       String ERM_DT = sdf.format(new Date(System.currentTimeMillis()));
/* 511 */       String COLOR_CD = this.frame_Modify.getSurvey().getMainColor();
/* 512 */       String QUE_JSON = new Gson().toJson(this.frame_Modify.getSurvey());
/* 513 */       String GROUP_JSON = new Gson().toJson(this.frame_Modify.getGroup());
/* 514 */       int POINT_BL = this.cb_enable.isSelected() ? 0 : 1;
/*     */       
/* 516 */       String[] dataList = { IDF_CD, SURVEY_NM, START_DT, END_DT, ERM_DT, COLOR_CD, QUE_JSON, GROUP_JSON, String.valueOf(POINT_BL) };
/* 517 */       String[] idx_sql = { "IDF_CD", "SURVEY_NM", "START_DT", "END_DT", "ERM_DT", "COLOR_CD", "QUE_JSON", "GROUP_JSON", "POINT_BL" };
/*     */       
/*     */ 
/* 520 */       Database.updateData(Enum_Table_Ci.T003.getCode(), idx_sql, dataList, IDF_CD);
/*     */ 
/*     */     }
/*     */     else
/*     */     {
/* 525 */       String IDF_CD = this.frame.getSurvey().getCode();
/* 526 */       String SURVEY_NM = this.frame.getSurvey().getName();
/* 527 */       String START_DT = this.frame.getSurvey().getStart();
/* 528 */       String END_DT = this.frame.getSurvey().getEnd();
/* 529 */       String ERM_DT = sdf.format(new Date(System.currentTimeMillis()));
/* 530 */       String COLOR_CD = this.frame.getSurvey().getMainColor();
/* 531 */       String QUE_JSON = new Gson().toJson(this.frame.getSurvey());
/* 532 */       String GROUP_JSON = new Gson().toJson(this.frame.getGroup());
/* 533 */       int POINT_BL = this.cb_enable.isSelected() ? 0 : 1;
/* 534 */       String SURVEYD_JSON = new Gson().toJson(new ArrayList());
/*     */       
/* 536 */       String[] dataList = { IDF_CD, SURVEY_NM, START_DT, END_DT, ERM_DT, COLOR_CD, QUE_JSON, GROUP_JSON, String.valueOf(POINT_BL), SURVEYD_JSON };
/*     */       
/*     */ 
/* 539 */       Database.insertData(Enum_Table_Ci.T003.getCode(), dataList);
/*     */     }
/*     */   }
/*     */   
/*     */   public void printAll()
/*     */   {
/* 545 */     System.out.println("IDF_CD : " + this.frame.getSurvey().getCode());
/* 546 */     System.out.println("SURVEY_NM : " + this.frame.getSurvey().getName());
/* 547 */     System.out.println("START_DT : " + this.frame.getSurvey().getStart());
/* 548 */     System.out.println("END_DT : " + this.frame.getSurvey().getEnd());
/*     */     
/* 550 */     for (int i = 0; i < this.frame.getSurvey().getSection().size(); i++)
/*     */     {
/* 552 */       System.out.println("섹션 " + (i + 1) + " 이름 : " + ((Module_Section)this.frame.getSurvey().getSection().get(i)).getName());
/* 553 */       System.out.println("섹션 " + (i + 1) + " 점수 : " + ((Module_Section)this.frame.getSurvey().getSection().get(i)).getPoint());
/*     */       
/* 555 */       for (int j = 0; j < ((Module_Section)this.frame.getSurvey().getSection().get(i)).getQuestion().size(); j++)
/*     */       {
/* 557 */         System.out.println("문제 " + (i + 1) + " 이름 : " + ((Module_Question)((Module_Section)this.frame.getSurvey().getSection().get(i)).getQuestion().get(j)).getName());
/* 558 */         System.out.println("문제 " + (i + 1) + " 타입 : " + ((Module_Question)((Module_Section)this.frame.getSurvey().getSection().get(i)).getQuestion().get(j)).getType());
/* 559 */         System.out.println("문제 " + (i + 1) + " 점수 : " + ((Module_Question)((Module_Section)this.frame.getSurvey().getSection().get(i)).getQuestion().get(j)).getPoint());
/*     */         
/* 561 */         for (int k = 0; k < ((Module_Question)((Module_Section)this.frame.getSurvey().getSection().get(i)).getQuestion().get(j)).getOption().size(); k++)
/*     */         {
/* 563 */           System.out.println("옵션 " + ((Module_Option)((Module_Question)((Module_Section)this.frame.getSurvey().getSection().get(i)).getQuestion().get(j)).getOption().get(k)).getNumber() + " 이름 : " + ((Module_Option)((Module_Question)((Module_Section)this.frame.getSurvey().getSection().get(i)).getQuestion().get(j)).getOption().get(k)).getName());
/* 564 */           System.out.println("옵션 " + ((Module_Option)((Module_Question)((Module_Section)this.frame.getSurvey().getSection().get(i)).getQuestion().get(j)).getOption().get(k)).getNumber() + " 점수 : " + ((Module_Option)((Module_Question)((Module_Section)this.frame.getSurvey().getSection().get(i)).getQuestion().get(j)).getOption().get(k)).getPoint());
/* 565 */           System.out.println("옵션 " + ((Module_Option)((Module_Question)((Module_Section)this.frame.getSurvey().getSection().get(i)).getQuestion().get(j)).getOption().get(k)).getNumber() + " 정답 : " + ((Module_Option)((Module_Question)((Module_Section)this.frame.getSurvey().getSection().get(i)).getQuestion().get(j)).getOption().get(k)).getAnswer());
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void setData()
/*     */   {
/* 573 */     Module_Survey m_s = this.frame_Modify.getSurvey();
/*     */   }
/*     */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Survey_Point_Management_Di.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */