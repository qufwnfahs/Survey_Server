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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class CheckBoxQuestionPanel
/*     */   extends JPanel
/*     */   implements ActionListener
/*     */ {
/*     */   public JTextField title;
/*     */   private JTextField option;
/*     */   private JCheckBox cb;
/*     */   private ImageIcon imgIcon;
/*     */   private ImageIcon imgClear;
/*     */   public JButton addOption;
/*     */   public JButton deleteOption;
/*  49 */   private int optionNum = 0;
/*     */   
/*     */   private JLabel lblIcon;
/*     */   
/*  53 */   public List<JTextField> optionList = new ArrayList();
/*  54 */   public List<JLabel> labelList = new ArrayList();
/*  55 */   public List<JButton> deleteList = new ArrayList();
/*  56 */   private List<JCheckBox> cbList = new ArrayList();
/*     */   
/*     */   public QuestionComboBox qcb;
/*     */   
/*     */   public Question_Custom_Pl cp;
/*     */   
/*  62 */   public GridBagLayout gbl = new GridBagLayout();
/*  63 */   public GridBagConstraints gbc = new GridBagConstraints();
/*     */   
/*     */ 
/*     */   public CheckBoxQuestionPanel(Question_Custom_Pl cp, QuestionComboBox parentQcb)
/*     */   {
/*  68 */     setPreferredSize(new Dimension(1130, 300));
/*  69 */     setBackground(Color.white);
/*     */     
/*  71 */     this.cp = cp;
/*     */     
/*  73 */     this.qcb = new QuestionComboBox();
/*  74 */     this.qcb.setModel(parentQcb.getModel());
/*  75 */     this.qcb.addActionListener(this);
/*     */     
/*  77 */     this.imgIcon = new ImageIcon(
/*  78 */       ImageController.resizeImage(new ImageIcon(getClass().getResource("/Image/checkboxOutline.png")), 33, 33));
/*  79 */     this.imgClear = new ImageIcon(
/*  80 */       ImageController.resizeImage(new ImageIcon(getClass().getResource("/Image/clear.png")), 33, 33));
/*  81 */     this.lblIcon = new JLabel();
/*  82 */     this.lblIcon.setIcon(this.imgIcon);
/*  83 */     this.labelList.add(this.lblIcon);
/*     */     
/*  85 */     this.deleteOption = new JButton();
/*  86 */     this.deleteOption.setIcon(this.imgClear);
/*  87 */     this.deleteOption.setPreferredSize(new Dimension(33, 33));
/*  88 */     this.deleteOption.setBackground(Color.white);
/*  89 */     this.deleteOption.setCursor(new Cursor(12));
/*  90 */     this.deleteOption.setBorder(null);
/*  91 */     this.deleteOption.addActionListener(this);
/*  92 */     this.deleteList.add(this.deleteOption);
/*     */     
/*  94 */     this.title = new JTextField();
/*  95 */     this.title.setPreferredSize(new Dimension(732, 60));
/*  96 */     this.title.setOpaque(false);
/*  97 */     this.title.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(224, 224, 224)));
/*  98 */     this.title.setFont(new Font("나눔바른고딕", 0, 25));
/*     */     
/* 100 */     this.option = new JTextField();
/* 101 */     this.option.setText(setLabel());
/* 102 */     this.option.setPreferredSize(new Dimension(712, 60));
/* 103 */     this.option.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(224, 224, 224)));
/* 104 */     this.option.setFont(new Font("나눔바른고딕", 0, 22));
/* 105 */     this.optionList.add(this.option);
/*     */     
/* 107 */     this.cb = new JCheckBox();
/* 108 */     this.cb.setIconTextGap(10);
/* 109 */     this.cb.setText("정답");
/* 110 */     this.cb.setFont(Enum_Font_Ci.FONT22.getFont());
/* 111 */     this.cb.setBackground(Color.WHITE);
/* 112 */     this.cb.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.UNCHECKED.getImageIcon(), 31, 31)));
/* 113 */     this.cb.setSelectedIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.CHECKED.getImageIcon(), 31, 31)));
/* 114 */     this.cbList.add(this.cb);
/*     */     
/* 116 */     this.addOption = new JButton();
/* 117 */     this.addOption.setPreferredSize(new Dimension(130, 50));
/* 118 */     this.addOption.setText("옵션 추가");
/* 119 */     this.addOption.setBackground(Color.white);
/* 120 */     this.addOption.setFont(new Font("나눔바른고딕", 0, 20));
/* 121 */     this.addOption.setCursor(new Cursor(12));
/* 122 */     this.addOption.addActionListener(this);
/*     */     
/* 124 */     setLayout(this.gbl);
/*     */     
/* 126 */     this.gbc.anchor = 17;
/*     */     
/* 128 */     this.gbc.gridx = 0;
/* 129 */     this.gbc.gridy = 0;
/* 130 */     this.gbc.gridwidth = 2;
/* 131 */     this.gbc.gridheight = 1;
/* 132 */     this.gbc.weighty = 1.0D;
/* 133 */     this.gbc.insets = new Insets(20, 30, 0, 0);
/* 134 */     add(this.title, this.gbc);
/*     */     
/* 136 */     this.gbc.gridx = 2;
/* 137 */     this.gbc.gridy = 0;
/* 138 */     this.gbc.gridwidth = 2;
/* 139 */     this.gbc.insets = new Insets(20, 0, 0, 30);
/* 140 */     add(this.qcb, this.gbc);
/*     */     
/* 142 */     this.gbc.gridx = 0;
/* 143 */     this.gbc.gridy = 1;
/* 144 */     this.gbc.gridwidth = 1;
/*     */     
/* 146 */     this.gbc.insets = new Insets(0, 30, 0, 0);
/* 147 */     add((Component)this.labelList.get(0), this.gbc);
/*     */     
/* 149 */     this.gbc.gridx = 1;
/* 150 */     this.gbc.insets = new Insets(0, 20, 0, 0);
/* 151 */     add((Component)this.optionList.get(0), this.gbc);
/*     */     
/* 153 */     this.gbc.gridx = 2;
/* 154 */     this.gbc.insets = new Insets(10, 20, 0, 0);
/* 155 */     add((Component)this.deleteList.get(0), this.gbc);
/*     */     
/* 157 */     this.gbc.gridx = 3;
/* 158 */     add((Component)this.cbList.get(0), this.gbc);
/*     */     
/* 160 */     this.gbc.gridy = 2;
/*     */     
/* 162 */     this.gbc.gridx = 0;
/* 163 */     this.gbc.gridwidth = 3;
/* 164 */     this.gbc.insets = new Insets(10, 85, 10, 0);
/* 165 */     add(this.addOption, this.gbc);
/*     */   }
/*     */   
/*     */ 
/*     */   public void paintComponent(Graphics g)
/*     */   {
/* 171 */     super.paintComponent(g);
/*     */   }
/*     */   
/*     */ 
/*     */   public void actionPerformed(ActionEvent e)
/*     */   {
/* 177 */     if (e.getSource() == this.qcb)
/*     */     {
/* 179 */       JComboBox cb = (JComboBox)e.getSource();
/*     */       
/*     */ 
/* 182 */       this.cp.changePanel(cb.getSelectedIndex());
/*     */     }
/* 184 */     else if (e.getSource() == this.addOption)
/*     */     {
/* 186 */       JTextField nf = new JTextField();
/* 187 */       nf.setText(setLabel());
/* 188 */       nf.setPreferredSize(new Dimension(712, 60));
/* 189 */       nf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(224, 224, 224)));
/* 190 */       nf.setFont(new Font("나눔바른고딕", 0, 22));
/* 191 */       this.optionList.add(nf);
/*     */       
/* 193 */       JLabel lbl = new JLabel();
/* 194 */       lbl.setIcon(this.imgIcon);
/* 195 */       this.labelList.add(lbl);
/*     */       
/* 197 */       JButton bt = new JButton();
/* 198 */       bt.setIcon(this.imgClear);
/* 199 */       bt.setPreferredSize(new Dimension(33, 33));
/* 200 */       bt.setBackground(Color.white);
/* 201 */       bt.setCursor(new Cursor(12));
/* 202 */       bt.setBorder(null);
/* 203 */       bt.addActionListener(this);
/* 204 */       this.deleteList.add(bt);
/*     */       
/* 206 */       JCheckBox tempCb = new JCheckBox();
/* 207 */       tempCb.setIconTextGap(10);
/* 208 */       tempCb.setText("정답");
/* 209 */       tempCb.setFont(Enum_Font_Ci.FONT22.getFont());
/* 210 */       tempCb.setBackground(Color.WHITE);
/* 211 */       tempCb.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.UNCHECKED.getImageIcon(), 31, 31)));
/* 212 */       tempCb.setSelectedIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.CHECKED.getImageIcon(), 31, 31)));
/* 213 */       this.cbList.add(tempCb);
/*     */       
/* 215 */       remove(this.addOption);
/*     */       
/* 217 */       this.gbc.gridx = 0;
/* 218 */       this.gbc.gridy = this.optionList.size();
/* 219 */       this.gbc.gridwidth = 1;
/*     */       
/* 221 */       this.gbc.insets = new Insets(0, 30, 0, 0);
/* 222 */       add(lbl, this.gbc);
/*     */       
/* 224 */       this.gbc.gridx = 1;
/* 225 */       this.gbc.insets = new Insets(0, 20, 0, 0);
/* 226 */       add(nf, this.gbc);
/*     */       
/* 228 */       this.gbc.gridx = 2;
/* 229 */       this.gbc.insets = new Insets(10, 20, 0, 0);
/* 230 */       add(bt, this.gbc);
/*     */       
/* 232 */       this.gbc.gridx = 3;
/* 233 */       add(tempCb, this.gbc);
/*     */       
/* 235 */       this.gbc.gridy += 1;
/* 236 */       this.gbc.gridx = 0;
/* 237 */       this.gbc.gridwidth = 3;
/* 238 */       this.gbc.insets = new Insets(10, 85, 10, 0);
/* 239 */       add(this.addOption, this.gbc);
/*     */       
/* 241 */       increaseSize();
/*     */       
/* 243 */       revalidate();
/* 244 */       repaint();
/*     */     }
/*     */     else
/*     */     {
/* 248 */       for (int i = 0; i < this.deleteList.size(); i++)
/*     */       {
/* 250 */         if (e.getSource() == this.deleteList.get(i))
/*     */         {
/* 252 */           if (this.deleteList.size() == 1)
/*     */           {
/* 254 */             return;
/*     */           }
/*     */           
/* 257 */           remove((Component)this.labelList.get(i));
/* 258 */           remove((Component)this.optionList.get(i));
/* 259 */           remove((Component)this.deleteList.get(i));
/* 260 */           remove((Component)this.cbList.get(i));
/* 261 */           remove(this.addOption);
/*     */           
/* 263 */           this.labelList.remove(i);
/* 264 */           this.optionList.remove(i);
/* 265 */           this.deleteList.remove(i);
/* 266 */           this.cbList.remove(i);
/*     */           
/* 268 */           for (int j = 0; j < this.deleteList.size(); j++)
/*     */           {
/* 270 */             this.gbc.gridx = 0;
/* 271 */             this.gbc.gridy = (j + 1);
/* 272 */             this.gbc.gridwidth = 1;
/*     */             
/* 274 */             this.gbc.insets = new Insets(0, 30, 0, 0);
/* 275 */             add((Component)this.labelList.get(j), this.gbc);
/*     */             
/* 277 */             this.gbc.gridx = 1;
/* 278 */             this.gbc.insets = new Insets(0, 20, 0, 0);
/* 279 */             add((Component)this.optionList.get(j), this.gbc);
/*     */             
/* 281 */             this.gbc.gridx = 2;
/* 282 */             this.gbc.insets = new Insets(10, 20, 0, 0);
/* 283 */             add((Component)this.deleteList.get(j), this.gbc);
/*     */             
/* 285 */             this.gbc.gridx = 3;
/* 286 */             add((Component)this.cbList.get(j), this.gbc);
/*     */           }
/*     */           
/* 289 */           this.gbc.gridy += 1;
/* 290 */           this.gbc.gridx = 0;
/* 291 */           this.gbc.gridwidth = 3;
/* 292 */           this.gbc.insets = new Insets(10, 85, 10, 0);
/* 293 */           add(this.addOption, this.gbc);
/*     */           
/* 295 */           decreaseSize();
/*     */           
/* 297 */           revalidate();
/* 298 */           repaint();
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void increaseSize()
/*     */   {
/* 306 */     setPreferredSize(new Dimension(1130, getHeight() + 70));
/*     */   }
/*     */   
/*     */   public void decreaseSize()
/*     */   {
/* 311 */     setPreferredSize(new Dimension(1130, getHeight() - 70));
/*     */   }
/*     */   
/*     */   public String setLabel()
/*     */   {
/* 316 */     return "옵션 " + String.valueOf(++this.optionNum);
/*     */   }
/*     */   
/*     */   public List<Option> getOption()
/*     */   {
/* 321 */     List<Option> list_opt = new ArrayList();
/*     */     
/* 323 */     for (int i = 0; i < this.optionList.size(); i++)
/*     */     {
/* 325 */       Option opt = new Option();
/* 326 */       opt.setNum(String.valueOf(i + 1));
/* 327 */       opt.setName(((JTextField)this.optionList.get(i)).getText());
/* 328 */       opt.setPoint(0);
/* 329 */       opt.setAnswer(false);
/*     */       
/* 331 */       list_opt.add(opt);
/*     */     }
/* 333 */     return list_opt;
/*     */   }
/*     */   
/*     */   public List<Option_M> getOption_M()
/*     */   {
/* 338 */     List<Option_M> list_opt = new ArrayList();
/*     */     
/* 340 */     for (int i = 0; i < this.optionList.size(); i++)
/*     */     {
/* 342 */       Option_M opt = new Option_M();
/* 343 */       opt.setNum(String.valueOf(i + 1));
/* 344 */       opt.setName(((JTextField)this.optionList.get(i)).getText());
/*     */       
/* 346 */       list_opt.add(opt);
/*     */     }
/* 348 */     return list_opt;
/*     */   }
/*     */   
/*     */   public List<Module_Option> getOptionBy()
/*     */   {
/* 353 */     List<Module_Option> lt_opt = new ArrayList();
/*     */     
/* 355 */     for (int i = 0; i < this.optionList.size(); i++)
/*     */     {
/* 357 */       Module_Option opt = new Module_Option();
/* 358 */       opt.setNumber(String.valueOf(i + 1));
/* 359 */       opt.setName(((JTextField)this.optionList.get(i)).getText());
/* 360 */       opt.setAnswer(((JCheckBox)this.cbList.get(i)).isSelected());
/*     */       
/* 362 */       lt_opt.add(opt);
/*     */     }
/* 364 */     return lt_opt;
/*     */   }
/*     */   
/*     */   public void setOption(List<Module_Option> option)
/*     */   {
/* 369 */     this.qcb.setSelectedIndex(2);
/*     */     
/* 371 */     remove((Component)this.labelList.get(0));
/* 372 */     remove((Component)this.optionList.get(0));
/* 373 */     remove((Component)this.deleteList.get(0));
/* 374 */     remove((Component)this.cbList.get(0));
/* 375 */     remove(this.addOption);
/*     */     
/* 377 */     this.labelList.clear();
/* 378 */     this.optionList.clear();
/* 379 */     this.deleteList.clear();
/* 380 */     this.cbList.clear();
/*     */     
/* 382 */     for (int i = 0; i < option.size(); i++)
/*     */     {
/* 384 */       Option_M opt = new Option_M();
/*     */       
/* 386 */       JTextField nf = new JTextField();
/* 387 */       nf.setText(((Module_Option)option.get(i)).getName());
/* 388 */       nf.setPreferredSize(new Dimension(712, 60));
/* 389 */       nf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(224, 224, 224)));
/* 390 */       nf.setFont(new Font("나눔바른고딕", 0, 22));
/* 391 */       this.optionList.add(nf);
/*     */       
/* 393 */       JLabel lbl = new JLabel();
/* 394 */       lbl.setIcon(this.imgIcon);
/* 395 */       this.labelList.add(lbl);
/*     */       
/* 397 */       JButton bt = new JButton();
/* 398 */       bt.setIcon(this.imgClear);
/* 399 */       bt.setPreferredSize(new Dimension(33, 33));
/* 400 */       bt.setBackground(Color.white);
/* 401 */       bt.setCursor(new Cursor(12));
/* 402 */       bt.setBorder(null);
/* 403 */       bt.addActionListener(this);
/* 404 */       this.deleteList.add(bt);
/*     */       
/* 406 */       JCheckBox tempCb = new JCheckBox();
/* 407 */       tempCb.setIconTextGap(10);
/* 408 */       tempCb.setText("정답");
/* 409 */       tempCb.setFont(Enum_Font_Ci.FONT22.getFont());
/* 410 */       tempCb.setBackground(Color.WHITE);
/* 411 */       tempCb.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.UNCHECKED.getImageIcon(), 31, 31)));
/* 412 */       tempCb.setSelectedIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.CHECKED.getImageIcon(), 31, 31)));
/* 413 */       tempCb.setSelected(((Module_Option)option.get(i)).getAnswer());
/* 414 */       this.cbList.add(tempCb);
/*     */       
/* 416 */       this.gbc.gridx = 0;
/* 417 */       this.gbc.gridy = this.optionList.size();
/* 418 */       this.gbc.gridwidth = 1;
/*     */       
/* 420 */       this.gbc.insets = new Insets(0, 30, 0, 0);
/* 421 */       add(lbl, this.gbc);
/*     */       
/* 423 */       this.gbc.gridx = 1;
/* 424 */       this.gbc.insets = new Insets(0, 20, 0, 0);
/* 425 */       add(nf, this.gbc);
/*     */       
/* 427 */       this.gbc.gridx = 2;
/* 428 */       this.gbc.insets = new Insets(10, 20, 0, 0);
/* 429 */       add(bt, this.gbc);
/*     */       
/* 431 */       this.gbc.gridx = 3;
/* 432 */       add(tempCb, this.gbc);
/*     */     }
/* 434 */     this.gbc.gridy += 1;
/* 435 */     this.gbc.gridx = 0;
/* 436 */     this.gbc.gridwidth = 3;
/* 437 */     this.gbc.insets = new Insets(10, 85, 10, 0);
/* 438 */     add(this.addOption, this.gbc);
/*     */     
/* 440 */     setPreferredSize(new Dimension(1130, 230 + this.optionList.size() * 70));
/*     */   }
/*     */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Question_Management\CheckBoxQuestionPanel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */