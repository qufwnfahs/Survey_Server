/*     */ package Model.Dialog.Survey_List.Question_Management;
/*     */ 
/*     */ import Enum.Enum_Font_Ci;
/*     */ import Enum.Enum_Image_Ci;
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
/*     */ import javax.swing.JCheckBox;
/*     */ import javax.swing.JComboBox;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JTextField;
/*     */ 
/*     */ 
/*     */ public class CheckBoxGridQuestionPanel
/*     */   extends JPanel
/*     */   implements ActionListener
/*     */ {
/*     */   public JTextField title;
/*     */   private JTextField rowOption;
/*     */   private JTextField colOption;
/*     */   private JCheckBox cb;
/*  40 */   public List<JLabel> rowLabelList = new ArrayList();
/*  41 */   public List<JLabel> colLabelList = new ArrayList();
/*  42 */   public List<JTextField> rowOptionList = new ArrayList();
/*  43 */   public List<JTextField> colOptionList = new ArrayList();
/*  44 */   public List<JButton> rowDeleteList = new ArrayList();
/*  45 */   public List<JButton> colDeleteList = new ArrayList();
/*  46 */   private List<JCheckBox> cbList = new ArrayList();
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
/*  68 */   public GridBagLayout gbl = new GridBagLayout();
/*  69 */   public GridBagConstraints gbc = new GridBagConstraints();
/*     */   
/*     */   public CheckBoxGridQuestionPanel(Question_Custom_Pl cp, QuestionComboBox parentQcb)
/*     */   {
/*  73 */     setPreferredSize(new Dimension(1130, 470));
/*  74 */     setBackground(Color.white);
/*  75 */     setLayout(this.gbl);
/*     */     
/*  77 */     this.cp = cp;
/*     */     
/*     */ 
/*  80 */     this.imgIcon = new ImageIcon(
/*  81 */       ImageController.resizeImage(new ImageIcon(getClass().getResource("/Image/checkboxOutline.png")), 33, 33));
/*  82 */     this.imgClear = new ImageIcon(
/*  83 */       ImageController.resizeImage(new ImageIcon(getClass().getResource("/Image/clear.png")), 33, 33));
/*  84 */     this.rowLblIcon = new JLabel("1");
/*  85 */     this.rowLblIcon.setFont(new Font("나눔바른고딕", 0, 22));
/*  86 */     this.rowLabelList.add(this.rowLblIcon);
/*  87 */     this.colLblIcon = new JLabel();
/*  88 */     this.colLblIcon.setIcon(this.imgIcon);
/*  89 */     this.colLblIcon.setPreferredSize(new Dimension(33, 33));
/*  90 */     this.colLabelList.add(this.colLblIcon);
/*     */     
/*  92 */     this.rowOption = new JTextField();
/*  93 */     this.rowOption.setPreferredSize(new Dimension(342, 60));
/*  94 */     this.rowOption.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(224, 224, 224)));
/*  95 */     this.rowOption.setFont(new Font("나눔바른고딕", 0, 22));
/*  96 */     this.rowOptionList.add(this.rowOption);
/*  97 */     this.rowOption.setText(setRowOption());
/*  98 */     this.colOption = new JTextField();
/*  99 */     this.colOption.setPreferredSize(new Dimension(342, 60));
/* 100 */     this.colOption.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(224, 224, 224)));
/* 101 */     this.colOption.setFont(new Font("나눔바른고딕", 0, 22));
/* 102 */     this.colOptionList.add(this.colOption);
/* 103 */     this.colOption.setText(setColOption());
/*     */     
/* 105 */     this.rowDeleteOption = new JButton();
/* 106 */     this.rowDeleteOption.setIcon(this.imgClear);
/* 107 */     this.rowDeleteOption.setPreferredSize(new Dimension(33, 33));
/* 108 */     this.rowDeleteOption.setBackground(Color.white);
/* 109 */     this.rowDeleteOption.setCursor(new Cursor(12));
/* 110 */     this.rowDeleteOption.setBorder(null);
/* 111 */     this.rowDeleteOption.addActionListener(this);
/* 112 */     this.rowDeleteList.add(this.rowDeleteOption);
/* 113 */     this.colDeleteOption = new JButton();
/* 114 */     this.colDeleteOption.setIcon(this.imgClear);
/* 115 */     this.colDeleteOption.setPreferredSize(new Dimension(33, 33));
/* 116 */     this.colDeleteOption.setBackground(Color.white);
/* 117 */     this.colDeleteOption.setCursor(new Cursor(12));
/* 118 */     this.colDeleteOption.setBorder(null);
/* 119 */     this.colDeleteOption.addActionListener(this);
/* 120 */     this.colDeleteList.add(this.colDeleteOption);
/*     */     
/* 122 */     this.rowAddOption = new JButton();
/* 123 */     this.rowAddOption.setPreferredSize(new Dimension(130, 50));
/* 124 */     this.rowAddOption.setText("행  추가");
/* 125 */     this.rowAddOption.setBackground(Color.white);
/* 126 */     this.rowAddOption.setFont(new Font("나눔바른고딕", 0, 20));
/* 127 */     this.rowAddOption.setCursor(new Cursor(12));
/* 128 */     this.rowAddOption.addActionListener(this);
/* 129 */     this.colAddOption = new JButton();
/* 130 */     this.colAddOption.setPreferredSize(new Dimension(130, 50));
/* 131 */     this.colAddOption.setText("열  추가");
/* 132 */     this.colAddOption.setBackground(Color.white);
/* 133 */     this.colAddOption.setFont(new Font("나눔바른고딕", 0, 20));
/* 134 */     this.colAddOption.setCursor(new Cursor(12));
/* 135 */     this.colAddOption.addActionListener(this);
/*     */     
/* 137 */     this.cb = new JCheckBox();
/* 138 */     this.cb.setIconTextGap(10);
/* 139 */     this.cb.setText("정답");
/* 140 */     this.cb.setFont(Enum_Font_Ci.FONT22.getFont());
/* 141 */     this.cb.setBackground(Color.WHITE);
/* 142 */     this.cb.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.UNCHECKED.getImageIcon(), 31, 31)));
/* 143 */     this.cb.setSelectedIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.CHECKED.getImageIcon(), 31, 31)));
/* 144 */     this.cbList.add(this.cb);
/*     */     
/* 146 */     this.title = new JTextField();
/* 147 */     this.title.setPreferredSize(new Dimension(732, 60));
/* 148 */     this.title.setOpaque(false);
/* 149 */     this.title.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(224, 224, 224)));
/* 150 */     this.title.setFont(new Font("나눔바른고딕", 0, 25));
/*     */     
/* 152 */     this.qcb = new QuestionComboBox();
/* 153 */     this.qcb.setModel(parentQcb.getModel());
/* 154 */     this.qcb.addActionListener(this);
/*     */     
/* 156 */     this.rowLbl = new JLabel("행");
/* 157 */     this.rowLbl.setForeground(Color.gray);
/* 158 */     this.rowLbl.setFont(new Font("나눔바른고딕", 0, 22));
/* 159 */     this.colLbl = new JLabel("열");
/* 160 */     this.colLbl.setForeground(Color.gray);
/* 161 */     this.colLbl.setFont(new Font("나눔바른고딕", 0, 22));
/*     */     
/* 163 */     this.gbc.anchor = 17;
/*     */     
/* 165 */     this.gbc.gridx = 0;
/* 166 */     this.gbc.gridy = 0;
/* 167 */     this.gbc.gridwidth = 4;
/* 168 */     this.gbc.gridheight = 1;
/* 169 */     this.gbc.weighty = 1.0D;
/* 170 */     this.gbc.insets = new Insets(20, 30, 0, 0);
/* 171 */     add(this.title, this.gbc);
/*     */     
/* 173 */     this.gbc.gridx = 4;
/* 174 */     this.gbc.gridy = 0;
/* 175 */     this.gbc.gridwidth = 3;
/* 176 */     this.gbc.insets = new Insets(20, 30, 0, 30);
/* 177 */     add(this.qcb, this.gbc);
/*     */     
/* 179 */     this.gbc.gridx = 0;
/* 180 */     this.gbc.gridy = 1;
/* 181 */     this.gbc.gridwidth = 3;
/* 182 */     this.gbc.insets = new Insets(0, 30, 0, 0);
/* 183 */     add(this.rowLbl, this.gbc);
/*     */     
/* 185 */     this.gbc.gridx = 3;
/* 186 */     this.gbc.gridwidth = 1;
/* 187 */     this.gbc.insets = new Insets(0, 35, 0, 0);
/* 188 */     add(this.colLbl, this.gbc);
/*     */     
/* 190 */     this.gbc.gridx = 0;
/* 191 */     this.gbc.gridy = 2;
/* 192 */     this.gbc.gridwidth = 1;
/* 193 */     this.gbc.insets = new Insets(0, 30, 0, 0);
/* 194 */     add((Component)this.rowLabelList.get(0), this.gbc);
/*     */     
/* 196 */     this.gbc.gridx = 1;
/* 197 */     add((Component)this.rowOptionList.get(0), this.gbc);
/*     */     
/* 199 */     this.gbc.gridx = 2;
/* 200 */     add((Component)this.rowDeleteList.get(0), this.gbc);
/*     */     
/* 202 */     this.gbc.gridx = 3;
/* 203 */     this.gbc.insets = new Insets(0, 30, 0, 0);
/* 204 */     add((Component)this.colLabelList.get(0), this.gbc);
/*     */     
/* 206 */     this.gbc.gridx = 4;
/* 207 */     this.gbc.insets = new Insets(0, 65341, 0, 0);
/* 208 */     add((Component)this.colOptionList.get(0), this.gbc);
/*     */     
/* 210 */     this.gbc.gridx = 5;
/* 211 */     this.gbc.insets = new Insets(0, 30, 0, 0);
/* 212 */     add((Component)this.colDeleteList.get(0), this.gbc);
/*     */     
/* 214 */     this.gbc.gridx = 6;
/* 215 */     this.gbc.insets = new Insets(0, 30, 0, 0);
/*     */     
/*     */ 
/* 218 */     this.gbc.gridx = 0;
/* 219 */     this.gbc.gridy = 3;
/* 220 */     this.gbc.gridwidth = 3;
/* 221 */     this.gbc.insets = new Insets(0, 30, 0, 0);
/* 222 */     add(this.rowAddOption, this.gbc);
/*     */     
/* 224 */     this.gbc.gridx = 3;
/* 225 */     add(this.colAddOption, this.gbc);
/*     */   }
/*     */   
/*     */ 
/*     */   public void paintComponent(Graphics g)
/*     */   {
/* 231 */     super.paintComponent(g);
/*     */   }
/*     */   
/*     */ 
/*     */   public void actionPerformed(ActionEvent e)
/*     */   {
/* 237 */     if (e.getSource() == this.qcb)
/*     */     {
/* 239 */       JComboBox cb = (JComboBox)e.getSource();
/*     */       
/*     */ 
/* 242 */       this.cp.changePanel(cb.getSelectedIndex());
/*     */     }
/* 244 */     else if (e.getSource() == this.rowAddOption)
/*     */     {
/* 246 */       JLabel lbl = new JLabel();
/* 247 */       lbl.setFont(new Font("나눔바른고딕", 0, 22));
/* 248 */       this.rowLabelList.add(lbl);
/* 249 */       lbl.setText(setRowLabel());
/*     */       
/* 251 */       JTextField nf = new JTextField();
/* 252 */       nf.setPreferredSize(new Dimension(342, 60));
/* 253 */       nf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(224, 224, 224)));
/* 254 */       nf.setFont(new Font("나눔바른고딕", 0, 22));
/* 255 */       this.rowOptionList.add(nf);
/* 256 */       nf.setText(setRowOption());
/*     */       
/* 258 */       JButton bt = new JButton();
/* 259 */       bt.setIcon(this.imgClear);
/* 260 */       bt.setPreferredSize(new Dimension(33, 33));
/* 261 */       bt.setBackground(Color.white);
/* 262 */       bt.setCursor(new Cursor(12));
/* 263 */       bt.setBorder(null);
/* 264 */       bt.addActionListener(this);
/* 265 */       this.rowDeleteList.add(bt);
/*     */       
/* 267 */       remove(this.rowAddOption);
/*     */       
/* 269 */       this.gbc.gridx = 0;
/* 270 */       this.gbc.gridy = (this.rowOptionList.size() + 1);
/* 271 */       this.gbc.gridwidth = 1;
/*     */       
/* 273 */       this.gbc.insets = new Insets(0, 30, 0, 0);
/* 274 */       add(lbl, this.gbc);
/*     */       
/* 276 */       this.gbc.gridx = 1;
/* 277 */       this.gbc.insets = new Insets(0, 30, 0, 0);
/* 278 */       add(nf, this.gbc);
/*     */       
/* 280 */       this.gbc.gridx = 2;
/* 281 */       this.gbc.insets = new Insets(0, 30, 0, 0);
/* 282 */       add(bt, this.gbc);
/*     */       
/* 284 */       this.gbc.gridy += 1;
/* 285 */       this.gbc.gridx = 0;
/* 286 */       this.gbc.gridwidth = 3;
/* 287 */       this.gbc.insets = new Insets(0, 30, 0, 0);
/* 288 */       add(this.rowAddOption, this.gbc);
/*     */       
/* 290 */       if (this.rowOptionList.size() >= this.colOptionList.size())
/*     */       {
/* 292 */         increaseSize();
/*     */       }
/*     */       
/* 295 */       revalidate();
/* 296 */       repaint();
/*     */     }
/* 298 */     else if (e.getSource() == this.colAddOption)
/*     */     {
/* 300 */       JLabel lbl = new JLabel();
/* 301 */       lbl.setIcon(this.imgIcon);
/* 302 */       lbl.setPreferredSize(new Dimension(33, 33));
/* 303 */       this.colLabelList.add(lbl);
/*     */       
/* 305 */       JTextField nf = new JTextField();
/* 306 */       nf.setPreferredSize(new Dimension(342, 60));
/* 307 */       nf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(224, 224, 224)));
/* 308 */       nf.setFont(new Font("나눔바른고딕", 0, 22));
/* 309 */       this.colOptionList.add(nf);
/* 310 */       nf.setText(setColOption());
/*     */       
/* 312 */       JButton bt = new JButton();
/* 313 */       bt.setIcon(this.imgClear);
/* 314 */       bt.setPreferredSize(new Dimension(33, 33));
/* 315 */       bt.setBackground(Color.white);
/* 316 */       bt.setCursor(new Cursor(12));
/* 317 */       bt.setBorder(null);
/* 318 */       bt.addActionListener(this);
/* 319 */       this.colDeleteList.add(bt);
/*     */       
/* 321 */       JCheckBox tempCb = new JCheckBox();
/* 322 */       tempCb.setIconTextGap(10);
/* 323 */       tempCb.setText("정답");
/* 324 */       tempCb.setFont(Enum_Font_Ci.FONT22.getFont());
/* 325 */       tempCb.setBackground(Color.WHITE);
/* 326 */       tempCb.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.UNCHECKED.getImageIcon(), 31, 31)));
/* 327 */       tempCb.setSelectedIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.CHECKED.getImageIcon(), 31, 31)));
/* 328 */       this.cbList.add(tempCb);
/*     */       
/* 330 */       remove(this.colAddOption);
/*     */       
/* 332 */       this.gbc.gridx = 3;
/* 333 */       this.gbc.gridy = (this.colOptionList.size() + 1);
/* 334 */       this.gbc.gridwidth = 1;
/*     */       
/* 336 */       this.gbc.insets = new Insets(0, 30, 0, 0);
/* 337 */       add(lbl, this.gbc);
/*     */       
/* 339 */       this.gbc.gridx = 4;
/* 340 */       this.gbc.insets = new Insets(0, 65341, 0, 0);
/* 341 */       add(nf, this.gbc);
/*     */       
/* 343 */       this.gbc.gridx = 5;
/* 344 */       this.gbc.insets = new Insets(0, 30, 0, 0);
/* 345 */       add(bt, this.gbc);
/*     */       
/* 347 */       this.gbc.gridx = 6;
/* 348 */       this.gbc.insets = new Insets(0, 30, 0, 0);
/*     */       
/*     */ 
/* 351 */       this.gbc.gridy += 1;
/* 352 */       this.gbc.gridx = 3;
/* 353 */       this.gbc.gridwidth = 3;
/* 354 */       this.gbc.insets = new Insets(0, 30, 0, 0);
/* 355 */       add(this.colAddOption, this.gbc);
/*     */       
/* 357 */       if (this.colOptionList.size() >= this.rowOptionList.size())
/*     */       {
/* 359 */         increaseSize();
/*     */       }
/*     */       
/* 362 */       revalidate();
/* 363 */       repaint();
/*     */     }
/* 365 */     else if (this.rowDeleteList.contains(e.getSource()))
/*     */     {
/* 367 */       if (this.rowDeleteList.size() == 1)
/*     */       {
/* 369 */         return;
/*     */       }
/*     */       
/* 372 */       for (int i = 0; i < this.rowDeleteList.size(); i++)
/*     */       {
/* 374 */         if (e.getSource() == this.rowDeleteList.get(i))
/*     */         {
/* 376 */           remove((Component)this.rowLabelList.get(i));
/* 377 */           remove((Component)this.rowOptionList.get(i));
/* 378 */           remove((Component)this.rowDeleteList.get(i));
/* 379 */           remove(this.rowAddOption);
/*     */           
/* 381 */           this.rowLabelList.remove(i);
/* 382 */           this.rowOptionList.remove(i);
/* 383 */           this.rowDeleteList.remove(i);
/*     */           
/* 385 */           for (int j = i; j < this.rowDeleteList.size(); j++)
/*     */           {
/* 387 */             this.gbc.gridx = 0;
/* 388 */             this.gbc.gridy = (j + 2);
/* 389 */             this.gbc.gridwidth = 1;
/* 390 */             this.gbc.insets = new Insets(0, 30, 0, 0);
/* 391 */             add((Component)this.rowLabelList.get(j), this.gbc);
/*     */             
/* 393 */             this.gbc.gridx = 1;
/* 394 */             this.gbc.insets = new Insets(0, 30, 0, 0);
/* 395 */             add((Component)this.rowOptionList.get(j), this.gbc);
/*     */             
/* 397 */             this.gbc.gridx = 2;
/* 398 */             this.gbc.insets = new Insets(0, 30, 0, 0);
/* 399 */             add((Component)this.rowDeleteList.get(j), this.gbc);
/*     */           }
/*     */           
/* 402 */           this.gbc.gridy = (this.rowOptionList.size() + 2);
/* 403 */           this.gbc.gridx = 0;
/* 404 */           this.gbc.gridwidth = 3;
/* 405 */           this.gbc.insets = new Insets(0, 30, 0, 0);
/* 406 */           add(this.rowAddOption, this.gbc);
/*     */           
/* 408 */           if (this.rowOptionList.size() >= this.colOptionList.size())
/*     */           {
/* 410 */             decreaseSize();
/*     */           }
/*     */           
/* 413 */           revalidate();
/* 414 */           repaint();
/*     */         }
/*     */       }
/*     */     }
/* 418 */     else if (this.colDeleteList.contains(e.getSource()))
/*     */     {
/* 420 */       if (this.colDeleteList.size() == 1)
/*     */       {
/* 422 */         return;
/*     */       }
/*     */       
/* 425 */       for (int i = 0; i < this.colDeleteList.size(); i++)
/*     */       {
/* 427 */         if (e.getSource() == this.colDeleteList.get(i))
/*     */         {
/* 429 */           remove((Component)this.colLabelList.get(i));
/* 430 */           remove((Component)this.colOptionList.get(i));
/* 431 */           remove((Component)this.colDeleteList.get(i));
/* 432 */           remove(this.colAddOption);
/*     */           
/* 434 */           this.colLabelList.remove(i);
/* 435 */           this.colOptionList.remove(i);
/* 436 */           this.colDeleteList.remove(i);
/*     */           
/* 438 */           for (int j = i; j < this.colDeleteList.size(); j++)
/*     */           {
/* 440 */             this.gbc.gridx = 3;
/* 441 */             this.gbc.gridy = (j + 2);
/* 442 */             this.gbc.gridwidth = 1;
/* 443 */             this.gbc.insets = new Insets(0, 30, 0, 0);
/* 444 */             ((JLabel)this.colLabelList.get(j)).setText(setColLabel());
/* 445 */             add((Component)this.colLabelList.get(j), this.gbc);
/*     */             
/* 447 */             this.gbc.gridx = 4;
/* 448 */             this.gbc.insets = new Insets(0, 65391, 0, 0);
/* 449 */             add((Component)this.colOptionList.get(j), this.gbc);
/*     */             
/* 451 */             this.gbc.gridx = 5;
/* 452 */             this.gbc.insets = new Insets(0, 30, 0, 0);
/* 453 */             add((Component)this.colDeleteList.get(j), this.gbc);
/*     */           }
/*     */           
/* 456 */           this.gbc.gridy = (this.colOptionList.size() + 2);
/* 457 */           this.gbc.gridx = 3;
/* 458 */           this.gbc.gridwidth = 3;
/* 459 */           this.gbc.insets = new Insets(0, 30, 0, 0);
/* 460 */           add(this.colAddOption, this.gbc);
/*     */           
/* 462 */           if (this.colOptionList.size() >= this.rowOptionList.size())
/*     */           {
/* 464 */             decreaseSize();
/*     */           }
/*     */           
/* 467 */           revalidate();
/* 468 */           repaint();
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public void increaseSize()
/*     */   {
/* 477 */     setPreferredSize(new Dimension(1130, getHeight() + 70));
/*     */   }
/*     */   
/*     */   public void decreaseSize()
/*     */   {
/* 482 */     setPreferredSize(new Dimension(1130, getHeight() - 70));
/*     */   }
/*     */   
/*     */   public String setRowOption()
/*     */   {
/* 487 */     return "헁 " + this.rowOptionList.size();
/*     */   }
/*     */   
/*     */   public String setColOption()
/*     */   {
/* 492 */     return "열 " + this.colOptionList.size();
/*     */   }
/*     */   
/*     */   public String setRowLabel()
/*     */   {
/* 497 */     return String.valueOf(this.rowLabelList.size());
/*     */   }
/*     */   
/*     */   public String setColLabel()
/*     */   {
/* 502 */     return String.valueOf(this.colLabelList.size());
/*     */   }
/*     */   
/*     */   public List<Option> getOption()
/*     */   {
/* 507 */     List<Option> list_opt = new ArrayList();
/*     */     
/* 509 */     for (int i = 0; i < this.rowOptionList.size(); i++)
/*     */     {
/* 511 */       Option opt = new Option();
/* 512 */       opt.setNum(String.valueOf(i + 1) + 0);
/* 513 */       opt.setName(((JTextField)this.rowOptionList.get(i)).getText());
/* 514 */       opt.setPoint(0);
/*     */       
/* 516 */       list_opt.add(opt);
/*     */     }
/*     */     
/* 519 */     for (int i = 0; i < this.colOptionList.size(); i++)
/*     */     {
/* 521 */       Option opt = new Option();
/* 522 */       opt.setNum(String.valueOf(i + 1));
/* 523 */       opt.setName(((JTextField)this.colOptionList.get(i)).getText());
/* 524 */       opt.setPoint(0);
/*     */       
/* 526 */       list_opt.add(opt);
/*     */     }
/*     */     
/* 529 */     return list_opt;
/*     */   }
/*     */   
/*     */   public List<Option_M> getOption_M()
/*     */   {
/* 534 */     List<Option_M> list_opt = new ArrayList();
/*     */     
/* 536 */     for (int i = 0; i < this.rowOptionList.size(); i++)
/*     */     {
/* 538 */       Option_M opt = new Option_M();
/* 539 */       opt.setNum(String.valueOf(i + 1) + 0);
/* 540 */       opt.setName(((JTextField)this.rowOptionList.get(i)).getText());
/*     */       
/* 542 */       list_opt.add(opt);
/*     */     }
/*     */     
/* 545 */     for (int i = 0; i < this.colOptionList.size(); i++)
/*     */     {
/* 547 */       Option_M opt = new Option_M();
/* 548 */       opt.setNum(String.valueOf(i + 1));
/* 549 */       opt.setName(((JTextField)this.colOptionList.get(i)).getText());
/*     */       
/* 551 */       list_opt.add(opt);
/*     */     }
/*     */     
/* 554 */     return list_opt;
/*     */   }
/*     */   
/*     */   public List<Module_Option> getOptionBy()
/*     */   {
/* 559 */     List<Module_Option> lt_opt = new ArrayList();
/*     */     
/* 561 */     for (int i = 0; i < this.rowOptionList.size(); i++)
/*     */     {
/* 563 */       Module_Option opt = new Module_Option();
/* 564 */       opt.setNumber(String.valueOf(i + 1) + "r");
/* 565 */       opt.setName(((JTextField)this.rowOptionList.get(i)).getText());
/*     */       
/* 567 */       lt_opt.add(opt);
/*     */     }
/*     */     
/* 570 */     for (int i = 0; i < this.colOptionList.size(); i++)
/*     */     {
/* 572 */       Module_Option opt = new Module_Option();
/* 573 */       opt.setNumber(String.valueOf(i + 1) + "c");
/* 574 */       opt.setName(((JTextField)this.colOptionList.get(i)).getText());
/* 575 */       opt.setAnswer(((JCheckBox)this.cbList.get(i)).isSelected());
/*     */       
/* 577 */       lt_opt.add(opt);
/*     */     }
/*     */     
/* 580 */     return lt_opt;
/*     */   }
/*     */   
/*     */   public void setOption(List<Module_Option> option)
/*     */   {
/* 585 */     this.qcb.setSelectedIndex(6);
/*     */     
/* 587 */     remove((Component)this.rowLabelList.get(0));
/* 588 */     remove((Component)this.rowOptionList.get(0));
/* 589 */     remove((Component)this.rowDeleteList.get(0));
/* 590 */     remove(this.rowAddOption);
/* 591 */     remove((Component)this.colLabelList.get(0));
/* 592 */     remove((Component)this.colOptionList.get(0));
/* 593 */     remove((Component)this.colDeleteList.get(0));
/* 594 */     remove(this.colAddOption);
/* 595 */     remove((Component)this.cbList.get(0));
/*     */     
/* 597 */     this.rowLabelList.clear();
/* 598 */     this.rowOptionList.clear();
/* 599 */     this.rowDeleteList.clear();
/* 600 */     this.colLabelList.clear();
/* 601 */     this.colOptionList.clear();
/* 602 */     this.colDeleteList.clear();
/* 603 */     this.cbList.clear();
/*     */     
/* 605 */     for (int i = 0; i < option.size(); i++)
/*     */     {
/* 607 */       if (((Module_Option)option.get(i)).getNumber().contains("r")) {
/* 608 */         JLabel lbl = new JLabel();
/* 609 */         lbl.setFont(new Font("나눔바른고딕", 0, 22));
/* 610 */         this.rowLabelList.add(lbl);
/* 611 */         lbl.setText(setRowLabel());
/*     */         
/* 613 */         JTextField nf = new JTextField();
/* 614 */         nf.setPreferredSize(new Dimension(342, 60));
/* 615 */         nf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(224, 224, 224)));
/* 616 */         nf.setFont(new Font("나눔바른고딕", 0, 22));
/* 617 */         this.rowOptionList.add(nf);
/* 618 */         nf.setText(((Module_Option)option.get(i)).getName());
/*     */         
/* 620 */         JButton bt = new JButton();
/* 621 */         bt.setIcon(this.imgClear);
/* 622 */         bt.setPreferredSize(new Dimension(33, 33));
/* 623 */         bt.setBackground(Color.white);
/* 624 */         bt.setCursor(new Cursor(12));
/* 625 */         bt.setBorder(null);
/* 626 */         bt.addActionListener(this);
/* 627 */         this.rowDeleteList.add(bt);
/*     */         
/* 629 */         this.gbc.gridx = 0;
/* 630 */         this.gbc.gridy = (this.rowOptionList.size() + 1);
/* 631 */         this.gbc.gridwidth = 1;
/*     */         
/* 633 */         this.gbc.insets = new Insets(0, 30, 0, 0);
/* 634 */         add(lbl, this.gbc);
/*     */         
/* 636 */         this.gbc.gridx = 1;
/* 637 */         this.gbc.insets = new Insets(0, 30, 0, 0);
/* 638 */         add(nf, this.gbc);
/*     */         
/* 640 */         this.gbc.gridx = 2;
/* 641 */         this.gbc.insets = new Insets(0, 30, 0, 0);
/* 642 */         add(bt, this.gbc);
/*     */       }
/* 644 */       else if (((Module_Option)option.get(i)).getNumber().contains("c"))
/*     */       {
/* 646 */         JLabel lbl = new JLabel();
/* 647 */         lbl.setIcon(this.imgIcon);
/* 648 */         lbl.setPreferredSize(new Dimension(33, 33));
/* 649 */         this.colLabelList.add(lbl);
/*     */         
/* 651 */         JTextField nf = new JTextField();
/* 652 */         nf.setPreferredSize(new Dimension(342, 60));
/* 653 */         nf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(224, 224, 224)));
/* 654 */         nf.setFont(new Font("나눔바른고딕", 0, 22));
/* 655 */         this.colOptionList.add(nf);
/* 656 */         nf.setText(((Module_Option)option.get(i)).getName());
/*     */         
/* 658 */         JButton bt = new JButton();
/* 659 */         bt.setIcon(this.imgClear);
/* 660 */         bt.setPreferredSize(new Dimension(33, 33));
/* 661 */         bt.setBackground(Color.white);
/* 662 */         bt.setCursor(new Cursor(12));
/* 663 */         bt.setBorder(null);
/* 664 */         bt.addActionListener(this);
/* 665 */         this.colDeleteList.add(bt);
/*     */         
/* 667 */         JCheckBox tempCb = new JCheckBox();
/* 668 */         tempCb.setIconTextGap(10);
/* 669 */         tempCb.setText("정답");
/* 670 */         tempCb.setFont(Enum_Font_Ci.FONT22.getFont());
/* 671 */         tempCb.setBackground(Color.WHITE);
/* 672 */         tempCb.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.UNCHECKED.getImageIcon(), 31, 31)));
/* 673 */         tempCb.setSelectedIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.CHECKED.getImageIcon(), 31, 31)));
/* 674 */         tempCb.setSelected(((Module_Option)option.get(i)).getAnswer());
/* 675 */         this.cbList.add(tempCb);
/*     */         
/* 677 */         this.gbc.gridx = 3;
/* 678 */         this.gbc.gridy = (this.colOptionList.size() + 1);
/* 679 */         this.gbc.gridwidth = 1;
/*     */         
/* 681 */         this.gbc.insets = new Insets(0, 30, 0, 0);
/* 682 */         add(lbl, this.gbc);
/*     */         
/* 684 */         this.gbc.gridx = 4;
/* 685 */         this.gbc.insets = new Insets(0, 65341, 0, 0);
/* 686 */         add(nf, this.gbc);
/*     */         
/* 688 */         this.gbc.gridx = 5;
/* 689 */         this.gbc.insets = new Insets(0, 30, 0, 0);
/* 690 */         add(bt, this.gbc);
/*     */         
/* 692 */         this.gbc.gridx = 6;
/* 693 */         this.gbc.insets = new Insets(0, 30, 0, 0);
/*     */       }
/*     */       
/*     */ 
/* 697 */       this.gbc.gridy = (this.rowOptionList.size() + 2);
/* 698 */       this.gbc.gridx = 0;
/* 699 */       this.gbc.gridwidth = 3;
/* 700 */       this.gbc.insets = new Insets(0, 30, 0, 0);
/* 701 */       add(this.rowAddOption, this.gbc);
/*     */       
/* 703 */       this.gbc.gridy = (this.colOptionList.size() + 2);
/* 704 */       this.gbc.gridx = 3;
/* 705 */       this.gbc.gridwidth = 4;
/* 706 */       this.gbc.insets = new Insets(0, 30, 0, 0);
/* 707 */       add(this.colAddOption, this.gbc);
/*     */       
/* 709 */       if (this.colOptionList.size() > this.rowOptionList.size())
/*     */       {
/* 711 */         setPreferredSize(new Dimension(1130, 230 + this.colOptionList.size() * 70));
/*     */       }
/*     */       else
/*     */       {
/* 715 */         setPreferredSize(new Dimension(1130, 230 + this.rowOptionList.size() * 70));
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Question_Management\CheckBoxGridQuestionPanel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */