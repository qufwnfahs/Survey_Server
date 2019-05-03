/*     */ package Model.Dialog.Survey_List;
/*     */ 
/*     */ import Enum.Enum_Color_Ci;
/*     */ import Enum.Enum_Font_Ci;
/*     */ import Enum.Enum_Image_Ci;
/*     */ import Model.Dialog.Survey_List.Question_Management.BorderPanel;
/*     */ import Model.Dialog.Survey_List.Question_Management.ColorPanel;
/*     */ import Model.Dialog.Survey_List.Question_Management.NumberPanel;
/*     */ import Worker.ImageController;
/*     */ import java.awt.Color;
/*     */ import java.awt.Component;
/*     */ import java.awt.Cursor;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.GridBagLayout;
/*     */ import java.awt.Insets;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ import java.util.LinkedList;
/*     */ import java.util.List;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JScrollBar;
/*     */ import javax.swing.JScrollPane;
/*     */ 
/*     */ 
/*     */ public class Question_Add_Pl
/*     */   extends JPanel
/*     */   implements ActionListener
/*     */ {
/*  35 */   private GridBagLayout gbl = new GridBagLayout();
/*  36 */   private GridBagConstraints gbc = new GridBagConstraints();
/*  37 */   private GridBagLayout gbl_content = new GridBagLayout();
/*  38 */   private GridBagConstraints gbc_content = new GridBagConstraints();
/*     */   
/*     */   private BorderPanel borderPanel;
/*     */   
/*  42 */   private NumberPanel numberPanel = new NumberPanel(1);
/*  43 */   private JPanel pl_content = new JPanel();
/*  44 */   private JPanel pl_question = new JPanel();
/*     */   private ColorPanel colorPanel;
/*  46 */   private JScrollPane scroll_content = new JScrollPane(this.pl_content);
/*  47 */   private JButton bt_prev = new JButton();
/*  48 */   private JButton bt_next = new JButton();
/*     */   
/*  50 */   private Color mainColor = Enum_Color_Ci._673AB7.getColor();
/*  51 */   private Color subColor = Enum_Color_Ci._673AB7_SUB.getColor();
/*     */   
/*     */   private Card_Survey_Fr frame;
/*     */   
/*     */   private Card_Survey_Fr_Modify frame_Modify;
/*  56 */   private LinkedList link = new LinkedList();
/*     */   
/*     */   public Question_Add_Pl(Card_Survey_Fr frame)
/*     */   {
/*  60 */     this.frame = frame;
/*     */     
/*     */ 
/*  63 */     setLayout(this.gbl);
/*     */     
/*     */ 
/*  66 */     this.borderPanel = new BorderPanel(frame, 0);
/*     */     
/*  68 */     this.scroll_content.setVerticalScrollBarPolicy(20);
/*  69 */     this.scroll_content.setHorizontalScrollBarPolicy(31);
/*  70 */     this.scroll_content.getVerticalScrollBar().setUnitIncrement(16);
/*  71 */     this.scroll_content.getVerticalScrollBar().setBackground(new Color(241, 241, 241));
/*     */     
/*  73 */     this.bt_prev.setText("이전");
/*  74 */     this.bt_prev.setOpaque(true);
/*  75 */     this.bt_prev.setBackground(Enum_Color_Ci._673AB7.getColor());
/*  76 */     this.bt_prev.setForeground(Color.WHITE);
/*  77 */     this.bt_prev.setFont(Enum_Font_Ci.INFO.getFont());
/*  78 */     this.bt_prev.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.PREV.getImageIcon(), 28, 28)));
/*  79 */     this.bt_prev.setHorizontalAlignment(2);
/*  80 */     this.bt_prev.setCursor(new Cursor(12));
/*  81 */     this.bt_prev.addActionListener(this);
/*  82 */     this.bt_prev.setPreferredSize(new Dimension(110, 50));
/*     */     
/*  84 */     this.bt_next.setText("다음");
/*  85 */     this.bt_next.setOpaque(true);
/*  86 */     this.bt_next.setBackground(Enum_Color_Ci._673AB7.getColor());
/*  87 */     this.bt_next.setForeground(Color.WHITE);
/*  88 */     this.bt_next.setFont(Enum_Font_Ci.INFO.getFont());
/*  89 */     this.bt_next.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.NEXT.getImageIcon(), 28, 28)));
/*  90 */     this.bt_next.setHorizontalTextPosition(2);
/*  91 */     this.bt_next.setHorizontalAlignment(4);
/*  92 */     this.bt_next.setCursor(new Cursor(12));
/*  93 */     this.bt_next.addActionListener(this);
/*  94 */     this.bt_next.setPreferredSize(new Dimension(110, 50));
/*     */     
/*  96 */     this.colorPanel = new ColorPanel(this);
/*     */     
/*  98 */     this.pl_content.setLayout(this.gbl_content);
/*  99 */     this.pl_content.setBackground(Enum_Color_Ci._673AB7_SUB.getColor());
/*     */     
/* 101 */     this.pl_question.setLayout(this.gbl);
/* 102 */     this.pl_question.setBackground(Color.WHITE);
/*     */     
/* 104 */     this.gbc_content.anchor = 11;
/* 105 */     this.gbc_content.fill = 1;
/*     */     
/* 107 */     this.gbc_content.gridx = 0;
/* 108 */     this.gbc_content.gridy = 0;
/* 109 */     this.gbc_content.gridwidth = 3;
/* 110 */     this.gbc_content.gridheight = 1;
/* 111 */     this.gbc_content.weightx = 1.0D;
/* 112 */     this.gbc_content.weighty = 0.07D;
/* 113 */     this.gbc_content.insets = new Insets(0, 0, 0, 0);
/* 114 */     this.pl_content.add(this.colorPanel, this.gbc_content);
/*     */     
/* 116 */     this.gbc_content.gridx = 0;
/* 117 */     this.gbc_content.gridy = 1;
/* 118 */     this.gbc_content.gridwidth = 1;
/* 119 */     this.gbc_content.weightx = 0.48D;
/* 120 */     this.gbc_content.weighty = 0.93D;
/* 121 */     this.pl_content.add(new JLabel(), this.gbc_content);
/*     */     
/* 123 */     this.gbc_content.gridx = 1;
/* 124 */     this.gbc_content.gridy = 1;
/* 125 */     this.gbc_content.weightx = 0.04D;
/* 126 */     this.gbc_content.weighty = 0.93D;
/* 127 */     this.pl_content.add(this.pl_question, this.gbc_content);
/*     */     
/* 129 */     this.gbc_content.gridx = 2;
/* 130 */     this.gbc_content.gridy = 1;
/* 131 */     this.gbc_content.weightx = 0.48D;
/* 132 */     this.gbc_content.weighty = 0.93D;
/* 133 */     this.pl_content.add(new JLabel(), this.gbc_content);
/*     */     
/*     */ 
/* 136 */     this.gbc.anchor = 11;
/* 137 */     this.gbc.fill = 1;
/*     */     
/* 139 */     this.gbc.gridx = 0;
/* 140 */     this.gbc.gridy = 0;
/* 141 */     this.gbc.weightx = 1.0D;
/* 142 */     this.gbc.weighty = 0.01D;
/* 143 */     add(this.borderPanel, this.gbc);
/*     */     
/* 145 */     this.gbc.gridx = 0;
/* 146 */     this.gbc.gridy = 1;
/* 147 */     this.gbc.weighty = 0.1D;
/* 148 */     add(this.numberPanel, this.gbc);
/*     */     
/* 150 */     this.gbc.gridx = 0;
/* 151 */     this.gbc.gridy = 2;
/* 152 */     this.gbc.weighty = 0.89D;
/* 153 */     add(this.scroll_content, this.gbc);
/*     */     
/* 155 */     this.link.add(new Section_Pl(this.mainColor));
/* 156 */     this.link.add(new Question_Pl(this));
/* 157 */     this.link.add(this.bt_prev);
/* 158 */     this.link.add(this.bt_next);
/*     */     
/* 160 */     loadComponent();
/*     */   }
/*     */   
/*     */   public Question_Add_Pl(Card_Survey_Fr_Modify frame_Modify)
/*     */   {
/* 165 */     this.frame_Modify = frame_Modify;
/*     */     
/*     */ 
/* 168 */     setLayout(this.gbl);
/*     */     
/*     */ 
/* 171 */     this.borderPanel = new BorderPanel(frame_Modify, 0);
/*     */     
/* 173 */     this.scroll_content.setVerticalScrollBarPolicy(20);
/* 174 */     this.scroll_content.setHorizontalScrollBarPolicy(31);
/* 175 */     this.scroll_content.getVerticalScrollBar().setUnitIncrement(16);
/* 176 */     this.scroll_content.getVerticalScrollBar().setBackground(new Color(241, 241, 241));
/*     */     
/* 178 */     this.bt_prev.setText("이전");
/* 179 */     this.bt_prev.setOpaque(true);
/* 180 */     this.bt_prev.setBackground(Enum_Color_Ci._673AB7.getColor());
/* 181 */     this.bt_prev.setForeground(Color.WHITE);
/* 182 */     this.bt_prev.setFont(Enum_Font_Ci.INFO.getFont());
/* 183 */     this.bt_prev.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.PREV.getImageIcon(), 28, 28)));
/* 184 */     this.bt_prev.setHorizontalAlignment(2);
/* 185 */     this.bt_prev.setCursor(new Cursor(12));
/* 186 */     this.bt_prev.addActionListener(this);
/* 187 */     this.bt_prev.setPreferredSize(new Dimension(110, 50));
/*     */     
/* 189 */     this.bt_next.setText("다음");
/* 190 */     this.bt_next.setOpaque(true);
/* 191 */     this.bt_next.setBackground(Enum_Color_Ci._673AB7.getColor());
/* 192 */     this.bt_next.setForeground(Color.WHITE);
/* 193 */     this.bt_next.setFont(Enum_Font_Ci.INFO.getFont());
/* 194 */     this.bt_next.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.NEXT.getImageIcon(), 28, 28)));
/* 195 */     this.bt_next.setHorizontalTextPosition(2);
/* 196 */     this.bt_next.setHorizontalAlignment(4);
/* 197 */     this.bt_next.setCursor(new Cursor(12));
/* 198 */     this.bt_next.addActionListener(this);
/* 199 */     this.bt_next.setPreferredSize(new Dimension(110, 50));
/*     */     
/* 201 */     this.colorPanel = new ColorPanel(this);
/*     */     
/* 203 */     this.pl_content.setLayout(this.gbl_content);
/* 204 */     this.pl_content.setBackground(Enum_Color_Ci._673AB7_SUB.getColor());
/*     */     
/* 206 */     this.pl_question.setLayout(this.gbl);
/* 207 */     this.pl_question.setBackground(Color.WHITE);
/*     */     
/* 209 */     this.gbc_content.anchor = 11;
/* 210 */     this.gbc_content.fill = 1;
/*     */     
/* 212 */     this.gbc_content.gridx = 0;
/* 213 */     this.gbc_content.gridy = 0;
/* 214 */     this.gbc_content.gridwidth = 3;
/* 215 */     this.gbc_content.gridheight = 1;
/* 216 */     this.gbc_content.weightx = 1.0D;
/* 217 */     this.gbc_content.weighty = 0.07D;
/* 218 */     this.gbc_content.insets = new Insets(0, 0, 0, 0);
/* 219 */     this.pl_content.add(this.colorPanel, this.gbc_content);
/*     */     
/* 221 */     this.gbc_content.gridx = 0;
/* 222 */     this.gbc_content.gridy = 1;
/* 223 */     this.gbc_content.gridwidth = 1;
/* 224 */     this.gbc_content.weightx = 0.48D;
/* 225 */     this.gbc_content.weighty = 0.93D;
/* 226 */     this.pl_content.add(new JLabel(), this.gbc_content);
/*     */     
/* 228 */     this.gbc_content.gridx = 1;
/* 229 */     this.gbc_content.gridy = 1;
/* 230 */     this.gbc_content.weightx = 0.04D;
/* 231 */     this.gbc_content.weighty = 0.93D;
/* 232 */     this.pl_content.add(this.pl_question, this.gbc_content);
/*     */     
/* 234 */     this.gbc_content.gridx = 2;
/* 235 */     this.gbc_content.gridy = 1;
/* 236 */     this.gbc_content.weightx = 0.48D;
/* 237 */     this.gbc_content.weighty = 0.93D;
/* 238 */     this.pl_content.add(new JLabel(), this.gbc_content);
/*     */     
/*     */ 
/* 241 */     this.gbc.anchor = 11;
/* 242 */     this.gbc.fill = 1;
/*     */     
/* 244 */     this.gbc.gridx = 0;
/* 245 */     this.gbc.gridy = 0;
/* 246 */     this.gbc.weightx = 1.0D;
/* 247 */     this.gbc.weighty = 0.01D;
/* 248 */     add(this.borderPanel, this.gbc);
/*     */     
/* 250 */     this.gbc.gridx = 0;
/* 251 */     this.gbc.gridy = 1;
/* 252 */     this.gbc.weighty = 0.1D;
/* 253 */     add(this.numberPanel, this.gbc);
/*     */     
/* 255 */     this.gbc.gridx = 0;
/* 256 */     this.gbc.gridy = 2;
/* 257 */     this.gbc.weighty = 0.89D;
/* 258 */     add(this.scroll_content, this.gbc);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setData()
/*     */   {
/* 270 */     clearComponent();
/*     */     
/*     */ 
/* 273 */     this.gbc.gridx = 0;
/* 274 */     this.gbc.gridy = 0;
/* 275 */     this.gbc.fill = 0;
/* 276 */     this.gbc.anchor = 11;
/*     */     
/* 278 */     for (int i = 0; i < this.frame_Modify.getSurvey().getSection().size(); i++)
/*     */     {
/* 280 */       Section_Pl section = new Section_Pl(new Color(Integer.valueOf(this.frame_Modify.getSurvey().getMainColor()).intValue(), true));
/* 281 */       this.gbc.gridy += 1;
/* 282 */       this.gbc.ipadx = 50;
/* 283 */       this.gbc.ipady = 50;
/* 284 */       this.gbc.gridwidth = 2;
/* 285 */       this.gbc.insets = new Insets(50, 0, 0, 0);
/*     */       
/* 287 */       this.pl_question.add(section, this.gbc);
/*     */       
/* 289 */       section.changeLabel(i + 1);
/* 290 */       section.setName(((Module_Section)this.frame_Modify.getSurvey().getSection().get(i)).getName());
/*     */       
/* 292 */       this.link.add(section);
/*     */       
/* 294 */       for (int j = 0; j < ((Module_Section)this.frame_Modify.getSurvey().getSection().get(i)).getQuestion().size(); j++)
/*     */       {
/* 296 */         Question_Pl qpl = new Question_Pl(this);
/* 297 */         this.gbc.gridy += 1;
/* 298 */         this.gbc.ipadx = 0;
/* 299 */         this.gbc.ipady = 0;
/* 300 */         this.gbc.gridwidth = 2;
/* 301 */         this.gbc.insets = new Insets(0, 0, 0, 0);
/*     */         
/* 303 */         this.pl_question.add(qpl, this.gbc);
/*     */         
/* 305 */         qpl.setCurr(((Module_Question)((Module_Section)this.frame_Modify.getSurvey().getSection().get(i)).getQuestion().get(j)).getType());
/* 306 */         qpl.setName(((Module_Question)((Module_Section)this.frame_Modify.getSurvey().getSection().get(i)).getQuestion().get(j)).getName());
/* 307 */         qpl.setOption(((Module_Question)((Module_Section)this.frame_Modify.getSurvey().getSection().get(i)).getQuestion().get(j)).getOption());
/*     */         
/* 309 */         this.link.add(qpl);
/*     */       }
/*     */     }
/*     */     
/* 313 */     this.gbc.gridy += 1;
/* 314 */     this.gbc.ipadx = 0;
/* 315 */     this.gbc.ipady = 0;
/* 316 */     this.gbc.gridwidth = 1;
/* 317 */     this.gbc.insets = new Insets(70, 200, 70, 0);
/* 318 */     this.pl_question.add(this.bt_prev, this.gbc);
/*     */     
/* 320 */     this.gbc.gridx += 1;
/* 321 */     this.gbc.ipadx = 0;
/* 322 */     this.gbc.ipady = 0;
/* 323 */     this.gbc.gridwidth = 1;
/* 324 */     this.gbc.insets = new Insets(70, 0, 70, 200);
/* 325 */     this.pl_question.add(this.bt_next, this.gbc);
/*     */     
/* 327 */     this.gbc.gridx -= 1;
/*     */     
/* 329 */     this.link.add(this.bt_prev);
/* 330 */     this.link.add(this.bt_next);
/*     */   }
/*     */   
/*     */   public void setName(String name)
/*     */   {
/* 335 */     this.colorPanel.setName(name);
/*     */   }
/*     */   
/*     */   public void clearComponent()
/*     */   {
/* 340 */     Iterator it = this.link.iterator();
/*     */     
/* 342 */     while (it.hasNext())
/*     */     {
/* 344 */       Component j = (Component)it.next();
/*     */       
/* 346 */       this.pl_question.remove(j);
/*     */     }
/*     */   }
/*     */   
/*     */   public void loadComponent()
/*     */   {
/* 352 */     clearComponent();
/*     */     
/*     */ 
/* 355 */     this.gbc.gridx = 0;
/* 356 */     this.gbc.gridy = 0;
/* 357 */     this.gbc.fill = 0;
/* 358 */     this.gbc.anchor = 11;
/*     */     
/* 360 */     Iterator it = this.link.iterator();
/*     */     
/* 362 */     int sectionCount = 0;
/*     */     
/* 364 */     while (it.hasNext())
/*     */     {
/* 366 */       Object j = it.next();
/*     */       
/* 368 */       if ((j instanceof Section_Pl))
/*     */       {
/* 370 */         Section_Pl section = (Section_Pl)j;
/* 371 */         this.gbc.gridy += 1;
/* 372 */         this.gbc.ipadx = 50;
/* 373 */         this.gbc.ipady = 50;
/* 374 */         this.gbc.gridwidth = 2;
/* 375 */         this.gbc.insets = new Insets(50, 0, 0, 0);
/*     */         
/* 377 */         this.pl_question.add(section, this.gbc);
/*     */         
/* 379 */         section.changeLabel(++sectionCount);
/*     */       }
/* 381 */       else if ((j instanceof Question_Pl))
/*     */       {
/* 383 */         Question_Pl qpl = (Question_Pl)j;
/* 384 */         this.gbc.gridy += 1;
/* 385 */         this.gbc.ipadx = 0;
/* 386 */         this.gbc.ipady = 0;
/* 387 */         this.gbc.gridwidth = 2;
/* 388 */         this.gbc.insets = new Insets(0, 0, 0, 0);
/*     */         
/* 390 */         this.pl_question.add(qpl, this.gbc);
/*     */       }
/* 392 */       else if ((j instanceof JButton))
/*     */       {
/* 394 */         JButton bt = (JButton)j;
/*     */         
/* 396 */         if (bt.equals(this.bt_prev))
/*     */         {
/* 398 */           this.gbc.gridy += 1;
/* 399 */           this.gbc.ipadx = 0;
/* 400 */           this.gbc.ipady = 0;
/* 401 */           this.gbc.gridwidth = 1;
/* 402 */           this.gbc.insets = new Insets(70, 200, 70, 0);
/*     */           
/* 404 */           this.pl_question.add(bt, this.gbc);
/*     */         }
/*     */         else
/*     */         {
/* 408 */           this.gbc.gridx += 1;
/* 409 */           this.gbc.ipadx = 0;
/* 410 */           this.gbc.ipady = 0;
/* 411 */           this.gbc.gridwidth = 1;
/* 412 */           this.gbc.insets = new Insets(70, 0, 70, 200);
/*     */           
/* 414 */           this.pl_question.add(bt, this.gbc);
/*     */           
/* 416 */           this.gbc.gridx -= 1;
/*     */         }
/*     */       }
/*     */     }
/* 420 */     revalidate();
/* 421 */     repaint();
/*     */   }
/*     */   
/*     */ 
/*     */   public void loadColor(Color main, Color sub)
/*     */   {
/* 427 */     this.mainColor = main;
/* 428 */     this.subColor = sub;
/*     */     
/* 430 */     this.colorPanel.loadColor(main);
/* 431 */     this.pl_content.setBackground(sub);
/* 432 */     this.bt_next.setBackground(main);
/* 433 */     this.bt_prev.setBackground(main);
/*     */     
/* 435 */     Iterator it = this.link.iterator();
/*     */     
/* 437 */     while (it.hasNext())
/*     */     {
/* 439 */       Object j = it.next();
/*     */       
/* 441 */       if ((j instanceof Section_Pl))
/*     */       {
/* 443 */         Section_Pl section = (Section_Pl)j;
/*     */         
/* 445 */         section.changeColor(main);
/*     */       }
/*     */     }
/*     */     
/* 449 */     revalidate();
/* 450 */     repaint();
/*     */   }
/*     */   
/*     */   public void addQuestion(Question_Pl qp)
/*     */   {
/* 455 */     int index = this.link.indexOf(qp);
/*     */     
/* 457 */     Question_Pl questionP = new Question_Pl(this);
/*     */     
/* 459 */     this.link.add(index + 1, questionP);
/*     */     
/* 461 */     loadComponent();
/*     */   }
/*     */   
/*     */ 
/*     */   public void addSection(Question_Pl qp)
/*     */   {
/* 467 */     int index = this.link.indexOf(qp);
/*     */     
/* 469 */     Section_Pl surveyP = new Section_Pl(this.mainColor);
/* 470 */     Question_Pl questionP = new Question_Pl(this);
/*     */     
/* 472 */     for (int i = index; i < this.link.size(); i++)
/*     */     {
/* 474 */       if ((this.link.get(i) instanceof Section_Pl))
/*     */       {
/* 476 */         this.link.add(i + 1, surveyP);
/* 477 */         this.link.add(i + 1, questionP);
/* 478 */         loadComponent();
/* 479 */         return;
/*     */       }
/*     */     }
/*     */     
/* 483 */     this.link.add(this.link.size() - 2, surveyP);
/* 484 */     this.link.add(this.link.size() - 2, questionP);
/* 485 */     loadComponent();
/*     */   }
/*     */   
/*     */   public void deleteQuestion(Question_Pl qp)
/*     */   {
/* 490 */     int index = this.link.indexOf(qp);
/*     */     
/* 492 */     if (((this.link.get(index - 1) instanceof Section_Pl)) && (index - 1 != 0))
/*     */     {
/* 494 */       this.pl_question.remove((Section_Pl)this.link.get(index - 1));
/* 495 */       this.pl_question.remove(qp);
/* 496 */       this.link.remove(index);
/* 497 */       this.link.remove(index - 1);
/*     */       
/* 499 */       loadComponent();
/*     */     }
/* 501 */     else if ((this.link.get(index - 1) instanceof Question_Pl))
/*     */     {
/* 503 */       this.pl_question.remove(qp);
/* 504 */       this.link.remove(index);
/*     */       
/* 506 */       loadComponent();
/*     */     }
/*     */   }
/*     */   
/*     */   public void saveSurvey()
/*     */   {
/* 512 */     if (this.frame == null)
/*     */     {
/* 514 */       List<Module_Section> lt_temp = new ArrayList();
/*     */       
/*     */ 
/* 517 */       this.frame_Modify.getSurvey().setMainColor(Integer.toString(this.mainColor.getRGB()));
/* 518 */       this.frame_Modify.getSurvey().setSubColor(Integer.toString(this.subColor.getRGB()));
/*     */       
/* 520 */       Iterator it = this.link.iterator();
/*     */       
/* 522 */       int sectionCount = -1;
/* 523 */       int questionCount = -1;
/*     */       
/* 525 */       while (it.hasNext())
/*     */       {
/* 527 */         Object j = it.next();
/*     */         
/* 529 */         if ((j instanceof Section_Pl))
/*     */         {
/* 531 */           sectionCount++;
/* 532 */           questionCount = -1;
/*     */           
/* 534 */           Section_Pl section = (Section_Pl)j;
/* 535 */           Module_Section ms = new Module_Section();
/* 536 */           ms.setName(section.getName());
/* 537 */           ms.setPoint(((Module_Section)this.frame_Modify.getSurvey().getSection().get(sectionCount)).getPoint());
/*     */           
/* 539 */           lt_temp.add(ms);
/*     */         }
/* 541 */         else if ((j instanceof Question_Pl))
/*     */         {
/* 543 */           questionCount++;
/*     */           
/* 545 */           Question_Pl question = (Question_Pl)j;
/*     */           
/* 547 */           Module_Question mq = new Module_Question();
/* 548 */           mq.setName(question.getName());
/* 549 */           mq.setType(question.getType());
/* 550 */           mq.setOption(question.getOption());
/* 551 */           mq.setPoint(((Module_Question)((Module_Section)this.frame_Modify.getSurvey().getSection().get(sectionCount)).getQuestion().get(questionCount)).getPoint());
/* 552 */           mq.setOption(((Module_Question)((Module_Section)this.frame_Modify.getSurvey().getSection().get(sectionCount)).getQuestion().get(questionCount)).getOption());
/*     */           
/* 554 */           ((Module_Section)lt_temp.get(sectionCount)).getQuestion().add(mq);
/*     */         }
/*     */       }
/*     */       
/* 558 */       this.frame_Modify.clearSurvey();
/*     */       
/* 560 */       this.frame_Modify.getSurvey().setSection(lt_temp);
/*     */     }
/*     */     else
/*     */     {
/* 564 */       this.frame.clearSurvey();
/*     */       
/*     */ 
/* 567 */       this.frame.getSurvey().setMainColor(Integer.toString(this.mainColor.getRGB()));
/* 568 */       this.frame.getSurvey().setSubColor(Integer.toString(this.subColor.getRGB()));
/*     */       
/* 570 */       Iterator it = this.link.iterator();
/*     */       
/* 572 */       int sectionCount = -1;
/*     */       
/* 574 */       while (it.hasNext())
/*     */       {
/* 576 */         Object j = it.next();
/*     */         
/* 578 */         if ((j instanceof Section_Pl))
/*     */         {
/* 580 */           Section_Pl section = (Section_Pl)j;
/*     */           
/* 582 */           Module_Section ms = new Module_Section();
/* 583 */           ms.setName(section.getName());
/*     */           
/* 585 */           this.frame.getSurvey().getSection().add(ms);
/*     */           
/* 587 */           sectionCount++;
/*     */         }
/* 589 */         else if ((j instanceof Question_Pl))
/*     */         {
/* 591 */           Question_Pl question = (Question_Pl)j;
/*     */           
/* 593 */           Module_Question mq = new Module_Question();
/* 594 */           mq.setName(question.getName());
/* 595 */           mq.setType(question.getType());
/* 596 */           mq.setOption(question.getOption());
/*     */           
/* 598 */           ((Module_Section)this.frame.getSurvey().getSection().get(sectionCount)).getQuestion().add(mq);
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public void actionPerformed(ActionEvent arg0)
/*     */   {
/* 607 */     if (arg0.getSource().equals(this.bt_prev))
/*     */     {
/* 609 */       if (this.frame == null)
/*     */       {
/* 611 */         this.frame_Modify.prev();
/*     */       }
/*     */       else
/*     */       {
/* 615 */         this.frame.prev();
/*     */       }
/*     */       
/*     */     }
/* 619 */     else if (arg0.getSource().equals(this.bt_next))
/*     */     {
/* 621 */       saveSurvey();
/*     */       
/* 623 */       if (this.frame == null)
/*     */       {
/* 625 */         this.frame_Modify.next();
/*     */       }
/*     */       else
/*     */       {
/* 629 */         this.frame.next();
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Question_Add_Pl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */