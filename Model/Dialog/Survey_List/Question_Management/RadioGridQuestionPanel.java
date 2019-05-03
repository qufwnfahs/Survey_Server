/*     */ package Model.Dialog.Survey_List.Question_Management;
/*     */ 
/*     */ import Model.Dialog.Survey_List.Module_Option;
/*     */ import Model.Dialog.Survey_List.Option_M;
/*     */ import Model.Dialog.Survey_List.Question_Custom_Pl;
/*     */ import Worker.ImageController;
/*     */ import java.awt.Color;
/*     */ import java.awt.Component;
/*     */ import java.awt.Cursor;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.Font;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.GridBagLayout;
/*     */ import java.awt.Insets;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JComboBox;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JTextField;
/*     */ 
/*     */ public class RadioGridQuestionPanel
/*     */   extends JPanel
/*     */   implements ActionListener
/*     */ {
/*     */   public JTextField title;
/*     */   private JTextField rowOption;
/*     */   private JTextField colOption;
/*  35 */   public List<JLabel> rowLabelList = new ArrayList();
/*  36 */   public List<JLabel> colLabelList = new ArrayList();
/*  37 */   public List<JTextField> rowOptionList = new ArrayList();
/*  38 */   public List<JTextField> colOptionList = new ArrayList();
/*  39 */   public List<JButton> rowDeleteList = new ArrayList();
/*  40 */   public List<JButton> colDeleteList = new ArrayList();
/*     */   
/*     */   private JLabel rowLblIcon;
/*     */   
/*     */   private JLabel colLblIcon;
/*     */   
/*     */   private JLabel rowLbl;
/*     */   
/*     */   private JLabel colLbl;
/*     */   
/*     */   public JButton rowAddOption;
/*     */   
/*     */   public JButton colAddOption;
/*     */   
/*     */   public JButton rowDeleteOption;
/*     */   
/*     */   public JButton colDeleteOption;
/*     */   
/*     */   private ImageIcon imgIcon;
/*     */   private ImageIcon imgClear;
/*     */   public QuestionComboBox qcb;
/*     */   public Question_Custom_Pl cp;
/*  62 */   public GridBagLayout gbl = new GridBagLayout();
/*  63 */   public GridBagConstraints gbc = new GridBagConstraints();
/*     */   
/*     */   public RadioGridQuestionPanel(Question_Custom_Pl cp, QuestionComboBox parentQcb) {
/*  66 */     setPreferredSize(new Dimension(1130, 470));
/*  67 */     setBackground(Color.white);
/*  68 */     setLayout(this.gbl);
/*     */     
/*  70 */     this.cp = cp;
/*     */     
/*     */ 
/*  73 */     this.imgIcon = new ImageIcon(
/*  74 */       ImageController.resizeImage(new ImageIcon(getClass().getResource("/Image/circle.png")), 33, 33));
/*  75 */     this.imgClear = new ImageIcon(
/*  76 */       ImageController.resizeImage(new ImageIcon(getClass().getResource("/Image/clear.png")), 33, 33));
/*  77 */     this.rowLblIcon = new JLabel("1");
/*  78 */     this.rowLblIcon.setFont(new Font("나눔바른고딕", 0, 22));
/*  79 */     this.rowLabelList.add(this.rowLblIcon);
/*  80 */     this.colLblIcon = new JLabel();
/*  81 */     this.colLblIcon.setIcon(this.imgIcon);
/*  82 */     this.colLblIcon.setPreferredSize(new Dimension(33, 33));
/*  83 */     this.colLabelList.add(this.colLblIcon);
/*     */     
/*  85 */     this.rowOption = new JTextField();
/*  86 */     this.rowOption.setPreferredSize(new Dimension(392, 60));
/*  87 */     this.rowOption.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(224, 224, 224)));
/*  88 */     this.rowOption.setFont(new Font("나눔바른고딕", 0, 22));
/*  89 */     this.rowOptionList.add(this.rowOption);
/*  90 */     this.rowOption.setText(setRowOption());
/*  91 */     this.colOption = new JTextField();
/*  92 */     this.colOption.setPreferredSize(new Dimension(392, 60));
/*  93 */     this.colOption.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(224, 224, 224)));
/*  94 */     this.colOption.setFont(new Font("나눔바른고딕", 0, 22));
/*  95 */     this.colOptionList.add(this.colOption);
/*  96 */     this.colOption.setText(setColOption());
/*     */     
/*  98 */     this.rowDeleteOption = new JButton();
/*  99 */     this.rowDeleteOption.setIcon(this.imgClear);
/* 100 */     this.rowDeleteOption.setPreferredSize(new Dimension(33, 33));
/* 101 */     this.rowDeleteOption.setBackground(Color.white);
/* 102 */     this.rowDeleteOption.setCursor(new Cursor(12));
/* 103 */     this.rowDeleteOption.setBorder(null);
/* 104 */     this.rowDeleteOption.addActionListener(this);
/* 105 */     this.rowDeleteList.add(this.rowDeleteOption);
/* 106 */     this.colDeleteOption = new JButton();
/* 107 */     this.colDeleteOption.setIcon(this.imgClear);
/* 108 */     this.colDeleteOption.setPreferredSize(new Dimension(33, 33));
/* 109 */     this.colDeleteOption.setBackground(Color.white);
/* 110 */     this.colDeleteOption.setCursor(new Cursor(12));
/* 111 */     this.colDeleteOption.setBorder(null);
/* 112 */     this.colDeleteOption.addActionListener(this);
/* 113 */     this.colDeleteList.add(this.colDeleteOption);
/*     */     
/* 115 */     this.rowAddOption = new JButton();
/* 116 */     this.rowAddOption.setPreferredSize(new Dimension(130, 50));
/* 117 */     this.rowAddOption.setText("행  추가");
/* 118 */     this.rowAddOption.setBackground(Color.white);
/* 119 */     this.rowAddOption.setFont(new Font("나눔바른고딕", 0, 20));
/* 120 */     this.rowAddOption.setCursor(new Cursor(12));
/* 121 */     this.rowAddOption.addActionListener(this);
/* 122 */     this.colAddOption = new JButton();
/* 123 */     this.colAddOption.setPreferredSize(new Dimension(130, 50));
/* 124 */     this.colAddOption.setText("열  추가");
/* 125 */     this.colAddOption.setBackground(Color.white);
/* 126 */     this.colAddOption.setFont(new Font("나눔바른고딕", 0, 20));
/* 127 */     this.colAddOption.setCursor(new Cursor(12));
/* 128 */     this.colAddOption.addActionListener(this);
/*     */     
/* 130 */     this.title = new JTextField();
/* 131 */     this.title.setPreferredSize(new Dimension(732, 60));
/* 132 */     this.title.setOpaque(false);
/* 133 */     this.title.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(224, 224, 224)));
/* 134 */     this.title.setFont(new Font("나눔바른고딕", 0, 25));
/*     */     
/* 136 */     this.qcb = new QuestionComboBox();
/* 137 */     this.qcb.setModel(parentQcb.getModel());
/* 138 */     this.qcb.addActionListener(this);
/*     */     
/* 140 */     this.rowLbl = new JLabel("행");
/* 141 */     this.rowLbl.setForeground(Color.gray);
/* 142 */     this.rowLbl.setFont(new Font("나눔바른고딕", 0, 22));
/* 143 */     this.colLbl = new JLabel("열");
/* 144 */     this.colLbl.setForeground(Color.gray);
/* 145 */     this.colLbl.setFont(new Font("나눔바른고딕", 0, 22));
/*     */     
/* 147 */     this.gbc.anchor = 17;
/*     */     
/* 149 */     this.gbc.gridx = 0;
/* 150 */     this.gbc.gridy = 0;
/* 151 */     this.gbc.gridwidth = 4;
/* 152 */     this.gbc.gridheight = 1;
/* 153 */     this.gbc.weighty = 1.0D;
/* 154 */     this.gbc.insets = new Insets(20, 30, 0, 0);
/* 155 */     add(this.title, this.gbc);
/*     */     
/* 157 */     this.gbc.gridx = 4;
/* 158 */     this.gbc.gridy = 0;
/* 159 */     this.gbc.gridwidth = 2;
/* 160 */     this.gbc.insets = new Insets(20, 30, 0, 30);
/* 161 */     add(this.qcb, this.gbc);
/*     */     
/* 163 */     this.gbc.gridx = 0;
/* 164 */     this.gbc.gridy = 1;
/* 165 */     this.gbc.gridwidth = 3;
/* 166 */     this.gbc.insets = new Insets(0, 30, 0, 0);
/* 167 */     add(this.rowLbl, this.gbc);
/*     */     
/* 169 */     this.gbc.gridx = 3;
/* 170 */     this.gbc.gridwidth = 1;
/* 171 */     this.gbc.insets = new Insets(0, 35, 0, 0);
/* 172 */     add(this.colLbl, this.gbc);
/*     */     
/* 174 */     this.gbc.gridx = 0;
/* 175 */     this.gbc.gridy = 2;
/* 176 */     this.gbc.gridwidth = 1;
/* 177 */     this.gbc.insets = new Insets(0, 30, 0, 0);
/* 178 */     add((Component)this.rowLabelList.get(0), this.gbc);
/*     */     
/* 180 */     this.gbc.gridx = 1;
/* 181 */     add((Component)this.rowOptionList.get(0), this.gbc);
/*     */     
/* 183 */     this.gbc.gridx = 2;
/* 184 */     add((Component)this.rowDeleteList.get(0), this.gbc);
/*     */     
/* 186 */     this.gbc.gridx = 3;
/* 187 */     this.gbc.insets = new Insets(0, 30, 0, 0);
/* 188 */     add((Component)this.colLabelList.get(0), this.gbc);
/*     */     
/* 190 */     this.gbc.gridx = 4;
/* 191 */     this.gbc.insets = new Insets(0, 65391, 0, 0);
/* 192 */     add((Component)this.colOptionList.get(0), this.gbc);
/*     */     
/* 194 */     this.gbc.gridx = 5;
/* 195 */     this.gbc.insets = new Insets(0, 30, 0, 0);
/* 196 */     add((Component)this.colDeleteList.get(0), this.gbc);
/*     */     
/* 198 */     this.gbc.gridx = 0;
/* 199 */     this.gbc.gridy = 3;
/* 200 */     this.gbc.gridwidth = 3;
/* 201 */     this.gbc.insets = new Insets(0, 30, 0, 0);
/* 202 */     add(this.rowAddOption, this.gbc);
/*     */     
/* 204 */     this.gbc.gridx = 3;
/* 205 */     add(this.colAddOption, this.gbc);
/*     */   }
/*     */   
/*     */   public void paintComponent(Graphics g)
/*     */   {
/* 210 */     super.paintComponent(g);
/*     */   }
/*     */   
/*     */   public void actionPerformed(ActionEvent e)
/*     */   {
/* 215 */     if (e.getSource() == this.qcb) {
/* 216 */       JComboBox cb = (JComboBox)e.getSource();
/*     */       
/*     */ 
/* 219 */       this.cp.changePanel(cb.getSelectedIndex());
/* 220 */     } else if (e.getSource() == this.rowAddOption) {
/* 221 */       JLabel lbl = new JLabel();
/* 222 */       lbl.setFont(new Font("나눔바른고딕", 0, 22));
/* 223 */       this.rowLabelList.add(lbl);
/* 224 */       lbl.setText(setRowLabel());
/*     */       
/* 226 */       JTextField nf = new JTextField();
/* 227 */       nf.setPreferredSize(new Dimension(392, 60));
/* 228 */       nf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(224, 224, 224)));
/* 229 */       nf.setFont(new Font("나눔바른고딕", 0, 22));
/* 230 */       this.rowOptionList.add(nf);
/* 231 */       nf.setText(setRowOption());
/*     */       
/* 233 */       JButton bt = new JButton();
/* 234 */       bt.setIcon(this.imgClear);
/* 235 */       bt.setPreferredSize(new Dimension(33, 33));
/* 236 */       bt.setBackground(Color.white);
/* 237 */       bt.setCursor(new Cursor(12));
/* 238 */       bt.setBorder(null);
/* 239 */       bt.addActionListener(this);
/* 240 */       this.rowDeleteList.add(bt);
/*     */       
/* 242 */       remove(this.rowAddOption);
/*     */       
/* 244 */       this.gbc.gridx = 0;
/* 245 */       this.gbc.gridy = (this.rowOptionList.size() + 1);
/* 246 */       this.gbc.gridwidth = 1;
/*     */       
/* 248 */       this.gbc.insets = new Insets(0, 30, 0, 0);
/* 249 */       add(lbl, this.gbc);
/*     */       
/* 251 */       this.gbc.gridx = 1;
/* 252 */       this.gbc.insets = new Insets(0, 30, 0, 0);
/* 253 */       add(nf, this.gbc);
/*     */       
/* 255 */       this.gbc.gridx = 2;
/* 256 */       this.gbc.insets = new Insets(0, 30, 0, 0);
/* 257 */       add(bt, this.gbc);
/*     */       
/* 259 */       this.gbc.gridy += 1;
/* 260 */       this.gbc.gridx = 0;
/* 261 */       this.gbc.gridwidth = 3;
/* 262 */       this.gbc.insets = new Insets(0, 30, 0, 0);
/* 263 */       add(this.rowAddOption, this.gbc);
/*     */       
/* 265 */       if (this.rowOptionList.size() >= this.colOptionList.size()) {
/* 266 */         increaseSize();
/*     */       }
/*     */       
/* 269 */       revalidate();
/* 270 */       repaint();
/* 271 */     } else if (e.getSource() == this.colAddOption) {
/* 272 */       JLabel lbl = new JLabel();
/* 273 */       lbl.setIcon(this.imgIcon);
/* 274 */       lbl.setPreferredSize(new Dimension(33, 33));
/* 275 */       this.colLabelList.add(lbl);
/*     */       
/* 277 */       JTextField nf = new JTextField();
/* 278 */       nf.setPreferredSize(new Dimension(392, 60));
/* 279 */       nf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(224, 224, 224)));
/* 280 */       nf.setFont(new Font("나눔바른고딕", 0, 22));
/* 281 */       this.colOptionList.add(nf);
/* 282 */       nf.setText(setColOption());
/*     */       
/* 284 */       JButton bt = new JButton();
/* 285 */       bt.setIcon(this.imgClear);
/* 286 */       bt.setPreferredSize(new Dimension(33, 33));
/* 287 */       bt.setBackground(Color.white);
/* 288 */       bt.setCursor(new Cursor(12));
/* 289 */       bt.setBorder(null);
/* 290 */       bt.addActionListener(this);
/* 291 */       this.colDeleteList.add(bt);
/*     */       
/* 293 */       remove(this.colAddOption);
/*     */       
/* 295 */       this.gbc.gridx = 3;
/* 296 */       this.gbc.gridy = (this.colOptionList.size() + 1);
/* 297 */       this.gbc.gridwidth = 1;
/*     */       
/* 299 */       this.gbc.insets = new Insets(0, 30, 0, 0);
/* 300 */       add(lbl, this.gbc);
/*     */       
/* 302 */       this.gbc.gridx = 4;
/* 303 */       this.gbc.insets = new Insets(0, 65391, 0, 0);
/* 304 */       add(nf, this.gbc);
/*     */       
/* 306 */       this.gbc.gridx = 5;
/* 307 */       this.gbc.insets = new Insets(0, 30, 0, 0);
/* 308 */       add(bt, this.gbc);
/*     */       
/* 310 */       this.gbc.gridy += 1;
/* 311 */       this.gbc.gridx = 3;
/* 312 */       this.gbc.gridwidth = 3;
/* 313 */       this.gbc.insets = new Insets(0, 30, 0, 0);
/* 314 */       add(this.colAddOption, this.gbc);
/*     */       
/* 316 */       if (this.colOptionList.size() >= this.rowOptionList.size()) {
/* 317 */         increaseSize();
/*     */       }
/*     */       
/* 320 */       revalidate();
/* 321 */       repaint();
/* 322 */     } else if (this.rowDeleteList.contains(e.getSource())) {
/* 323 */       if (this.rowDeleteList.size() == 1) {
/* 324 */         return;
/*     */       }
/*     */       
/* 327 */       for (int i = 0; i < this.rowDeleteList.size(); i++) {
/* 328 */         if (e.getSource() == this.rowDeleteList.get(i)) {
/* 329 */           remove((Component)this.rowLabelList.get(i));
/* 330 */           remove((Component)this.rowOptionList.get(i));
/* 331 */           remove((Component)this.rowDeleteList.get(i));
/* 332 */           remove(this.rowAddOption);
/*     */           
/* 334 */           this.rowLabelList.remove(i);
/* 335 */           this.rowOptionList.remove(i);
/* 336 */           this.rowDeleteList.remove(i);
/*     */           
/* 338 */           for (int j = i; j < this.rowDeleteList.size(); j++) {
/* 339 */             this.gbc.gridx = 0;
/* 340 */             this.gbc.gridy = (j + 2);
/* 341 */             this.gbc.gridwidth = 1;
/* 342 */             this.gbc.insets = new Insets(0, 30, 0, 0);
/* 343 */             add((Component)this.rowLabelList.get(j), this.gbc);
/*     */             
/* 345 */             this.gbc.gridx = 1;
/* 346 */             this.gbc.insets = new Insets(0, 30, 0, 0);
/* 347 */             add((Component)this.rowOptionList.get(j), this.gbc);
/*     */             
/* 349 */             this.gbc.gridx = 2;
/* 350 */             this.gbc.insets = new Insets(0, 30, 0, 0);
/* 351 */             add((Component)this.rowDeleteList.get(j), this.gbc);
/*     */           }
/*     */           
/* 354 */           this.gbc.gridy = (this.rowOptionList.size() + 2);
/* 355 */           this.gbc.gridx = 0;
/* 356 */           this.gbc.gridwidth = 3;
/* 357 */           this.gbc.insets = new Insets(0, 30, 0, 0);
/* 358 */           add(this.rowAddOption, this.gbc);
/*     */           
/* 360 */           if (this.rowOptionList.size() >= this.colOptionList.size()) {
/* 361 */             decreaseSize();
/*     */           }
/*     */           
/* 364 */           revalidate();
/* 365 */           repaint();
/*     */         }
/*     */       }
/* 368 */     } else if (this.colDeleteList.contains(e.getSource())) {
/* 369 */       if (this.colDeleteList.size() == 1) {
/* 370 */         return;
/*     */       }
/*     */       
/* 373 */       for (int i = 0; i < this.colDeleteList.size(); i++) {
/* 374 */         if (e.getSource() == this.colDeleteList.get(i)) {
/* 375 */           remove((Component)this.colLabelList.get(i));
/* 376 */           remove((Component)this.colOptionList.get(i));
/* 377 */           remove((Component)this.colDeleteList.get(i));
/* 378 */           remove(this.colAddOption);
/*     */           
/* 380 */           this.colLabelList.remove(i);
/* 381 */           this.colOptionList.remove(i);
/* 382 */           this.colDeleteList.remove(i);
/*     */           
/* 384 */           for (int j = i; j < this.colDeleteList.size(); j++) {
/* 385 */             this.gbc.gridx = 3;
/* 386 */             this.gbc.gridy = (j + 2);
/* 387 */             this.gbc.gridwidth = 1;
/* 388 */             this.gbc.insets = new Insets(0, 30, 0, 0);
/* 389 */             ((JLabel)this.colLabelList.get(j)).setText(setColLabel());
/* 390 */             add((Component)this.colLabelList.get(j), this.gbc);
/*     */             
/* 392 */             this.gbc.gridx = 4;
/* 393 */             this.gbc.insets = new Insets(0, 65391, 0, 0);
/* 394 */             add((Component)this.colOptionList.get(j), this.gbc);
/*     */             
/* 396 */             this.gbc.gridx = 5;
/* 397 */             this.gbc.insets = new Insets(0, 30, 0, 0);
/* 398 */             add((Component)this.colDeleteList.get(j), this.gbc);
/*     */           }
/*     */           
/* 401 */           this.gbc.gridy = (this.colOptionList.size() + 2);
/* 402 */           this.gbc.gridx = 3;
/* 403 */           this.gbc.gridwidth = 3;
/* 404 */           this.gbc.insets = new Insets(0, 30, 0, 0);
/* 405 */           add(this.colAddOption, this.gbc);
/*     */           
/* 407 */           if (this.colOptionList.size() >= this.rowOptionList.size()) {
/* 408 */             decreaseSize();
/*     */           }
/*     */           
/* 411 */           revalidate();
/* 412 */           repaint();
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void increaseSize()
/*     */   {
/* 420 */     setPreferredSize(new Dimension(1130, getHeight() + 70));
/*     */   }
/*     */   
/*     */   public void decreaseSize() {
/* 424 */     setPreferredSize(new Dimension(1130, getHeight() - 70));
/*     */   }
/*     */   
/*     */   public String setRowOption() {
/* 428 */     return "헁 " + this.rowOptionList.size();
/*     */   }
/*     */   
/*     */   public String setColOption() {
/* 432 */     return "열 " + this.colOptionList.size();
/*     */   }
/*     */   
/*     */   public String setRowLabel() {
/* 436 */     return String.valueOf(this.rowLabelList.size());
/*     */   }
/*     */   
/*     */   public String setColLabel() {
/* 440 */     return String.valueOf(this.colLabelList.size());
/*     */   }
/*     */   
/*     */   public List<Option> getOption() {
/* 444 */     List<Option> list_opt = new ArrayList();
/*     */     
/* 446 */     for (int i = 0; i < this.rowOptionList.size(); i++) {
/* 447 */       Option opt = new Option();
/* 448 */       opt.setNum(String.valueOf(i + 1) + 0);
/* 449 */       opt.setName(((JTextField)this.rowOptionList.get(i)).getText());
/* 450 */       opt.setPoint(0);
/*     */       
/* 452 */       list_opt.add(opt);
/*     */     }
/*     */     
/* 455 */     for (int i = 0; i < this.colOptionList.size(); i++) {
/* 456 */       Option opt = new Option();
/* 457 */       opt.setNum(String.valueOf(i + 1));
/* 458 */       opt.setName(((JTextField)this.colOptionList.get(i)).getText());
/* 459 */       opt.setPoint(0);
/*     */       
/* 461 */       list_opt.add(opt);
/*     */     }
/*     */     
/* 464 */     return list_opt;
/*     */   }
/*     */   
/*     */   public List<Option_M> getOption_M() {
/* 468 */     List<Option_M> list_opt = new ArrayList();
/*     */     
/* 470 */     for (int i = 0; i < this.rowOptionList.size(); i++) {
/* 471 */       Option_M opt = new Option_M();
/* 472 */       opt.setNum(String.valueOf(i + 1) + 0);
/* 473 */       opt.setName(((JTextField)this.rowOptionList.get(i)).getText());
/*     */       
/* 475 */       list_opt.add(opt);
/*     */     }
/*     */     
/* 478 */     for (int i = 0; i < this.colOptionList.size(); i++) {
/* 479 */       Option_M opt = new Option_M();
/* 480 */       opt.setNum(String.valueOf(i + 1));
/* 481 */       opt.setName(((JTextField)this.colOptionList.get(i)).getText());
/*     */       
/* 483 */       list_opt.add(opt);
/*     */     }
/*     */     
/* 486 */     return list_opt;
/*     */   }
/*     */   
/*     */   public List<Module_Option> getOptionBy() {
/* 490 */     List<Module_Option> lt_opt = new ArrayList();
/*     */     
/* 492 */     for (int i = 0; i < this.rowOptionList.size(); i++) {
/* 493 */       Module_Option opt = new Module_Option();
/* 494 */       opt.setNumber(String.valueOf(i + 1) + "r");
/* 495 */       opt.setName(((JTextField)this.rowOptionList.get(i)).getText());
/*     */       
/* 497 */       lt_opt.add(opt);
/*     */     }
/*     */     
/* 500 */     for (int i = 0; i < this.colOptionList.size(); i++) {
/* 501 */       Module_Option opt = new Module_Option();
/* 502 */       opt.setNumber(String.valueOf(i + 1) + "c");
/* 503 */       opt.setName(((JTextField)this.colOptionList.get(i)).getText());
/*     */       
/* 505 */       lt_opt.add(opt);
/*     */     }
/*     */     
/* 508 */     return lt_opt;
/*     */   }
/*     */   
/*     */   public void setOption(List<Module_Option> option) {
/* 512 */     this.qcb.setSelectedIndex(5);
/*     */     
/* 514 */     remove((Component)this.rowLabelList.get(0));
/* 515 */     remove((Component)this.rowOptionList.get(0));
/* 516 */     remove((Component)this.rowDeleteList.get(0));
/* 517 */     remove(this.rowAddOption);
/* 518 */     remove((Component)this.colLabelList.get(0));
/* 519 */     remove((Component)this.colOptionList.get(0));
/* 520 */     remove((Component)this.colDeleteList.get(0));
/* 521 */     remove(this.colAddOption);
/*     */     
/* 523 */     this.rowLabelList.clear();
/* 524 */     this.rowOptionList.clear();
/* 525 */     this.rowDeleteList.clear();
/* 526 */     this.colLabelList.clear();
/* 527 */     this.colOptionList.clear();
/* 528 */     this.colDeleteList.clear();
/*     */     
/* 530 */     for (int i = 0; i < option.size(); i++)
/*     */     {
/* 532 */       if (((Module_Option)option.get(i)).getNumber().contains("r")) {
/* 533 */         JLabel lbl = new JLabel();
/* 534 */         lbl.setFont(new Font("나눔바른고딕", 0, 22));
/* 535 */         this.rowLabelList.add(lbl);
/* 536 */         lbl.setText(setRowLabel());
/*     */         
/* 538 */         JTextField nf = new JTextField();
/* 539 */         nf.setPreferredSize(new Dimension(392, 60));
/* 540 */         nf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(224, 224, 224)));
/* 541 */         nf.setFont(new Font("나눔바른고딕", 0, 22));
/* 542 */         this.rowOptionList.add(nf);
/* 543 */         nf.setText(((Module_Option)option.get(i)).getName());
/*     */         
/* 545 */         JButton bt = new JButton();
/* 546 */         bt.setIcon(this.imgClear);
/* 547 */         bt.setPreferredSize(new Dimension(33, 33));
/* 548 */         bt.setBackground(Color.white);
/* 549 */         bt.setCursor(new Cursor(12));
/* 550 */         bt.setBorder(null);
/* 551 */         bt.addActionListener(this);
/* 552 */         this.rowDeleteList.add(bt);
/*     */         
/* 554 */         this.gbc.gridx = 0;
/* 555 */         this.gbc.gridy = (this.rowOptionList.size() + 1);
/* 556 */         this.gbc.gridwidth = 1;
/*     */         
/* 558 */         this.gbc.insets = new Insets(0, 30, 0, 0);
/* 559 */         add(lbl, this.gbc);
/*     */         
/* 561 */         this.gbc.gridx = 1;
/* 562 */         this.gbc.insets = new Insets(0, 30, 0, 0);
/* 563 */         add(nf, this.gbc);
/*     */         
/* 565 */         this.gbc.gridx = 2;
/* 566 */         this.gbc.insets = new Insets(0, 30, 0, 0);
/* 567 */         add(bt, this.gbc);
/*     */       }
/* 569 */       else if (((Module_Option)option.get(i)).getNumber().contains("c"))
/*     */       {
/* 571 */         JLabel lbl = new JLabel();
/* 572 */         lbl.setIcon(this.imgIcon);
/* 573 */         lbl.setPreferredSize(new Dimension(33, 33));
/* 574 */         this.colLabelList.add(lbl);
/*     */         
/* 576 */         JTextField nf = new JTextField();
/* 577 */         nf.setPreferredSize(new Dimension(392, 60));
/* 578 */         nf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(224, 224, 224)));
/* 579 */         nf.setFont(new Font("나눔바른고딕", 0, 22));
/* 580 */         this.colOptionList.add(nf);
/* 581 */         nf.setText(((Module_Option)option.get(i)).getName());
/*     */         
/* 583 */         JButton bt = new JButton();
/* 584 */         bt.setIcon(this.imgClear);
/* 585 */         bt.setPreferredSize(new Dimension(33, 33));
/* 586 */         bt.setBackground(Color.white);
/* 587 */         bt.setCursor(new Cursor(12));
/* 588 */         bt.setBorder(null);
/* 589 */         bt.addActionListener(this);
/* 590 */         this.colDeleteList.add(bt);
/*     */         
/* 592 */         this.gbc.gridx = 3;
/* 593 */         this.gbc.gridy = (this.colOptionList.size() + 1);
/* 594 */         this.gbc.gridwidth = 1;
/*     */         
/* 596 */         this.gbc.insets = new Insets(0, 30, 0, 0);
/* 597 */         add(lbl, this.gbc);
/*     */         
/* 599 */         this.gbc.gridx = 4;
/* 600 */         this.gbc.insets = new Insets(0, 65391, 0, 0);
/* 601 */         add(nf, this.gbc);
/*     */         
/* 603 */         this.gbc.gridx = 5;
/* 604 */         this.gbc.insets = new Insets(0, 30, 0, 0);
/* 605 */         add(bt, this.gbc);
/*     */       }
/*     */       
/* 608 */       this.gbc.gridy = (this.rowOptionList.size() + 2);
/* 609 */       this.gbc.gridx = 0;
/* 610 */       this.gbc.gridwidth = 3;
/* 611 */       this.gbc.insets = new Insets(0, 30, 0, 0);
/* 612 */       add(this.rowAddOption, this.gbc);
/*     */       
/* 614 */       this.gbc.gridy = (this.colOptionList.size() + 2);
/* 615 */       this.gbc.gridx = 3;
/* 616 */       this.gbc.gridwidth = 3;
/* 617 */       this.gbc.insets = new Insets(0, 30, 0, 0);
/* 618 */       add(this.colAddOption, this.gbc);
/*     */       
/* 620 */       if (this.colOptionList.size() > this.rowOptionList.size())
/*     */       {
/* 622 */         setPreferredSize(new Dimension(1130, 230 + this.colOptionList.size() * 70));
/*     */       }
/*     */       else
/*     */       {
/* 626 */         setPreferredSize(new Dimension(1130, 230 + this.rowOptionList.size() * 70));
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Question_Management\RadioGridQuestionPanel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */