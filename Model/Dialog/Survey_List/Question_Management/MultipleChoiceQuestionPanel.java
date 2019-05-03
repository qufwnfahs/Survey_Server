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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class MultipleChoiceQuestionPanel
/*     */   extends JPanel
/*     */   implements ActionListener
/*     */ {
/*     */   public JTextField title;
/*     */   private JTextField option;
/*     */   private ImageIcon imgIcon;
/*     */   private ImageIcon imgClear;
/*     */   public JButton addOption;
/*     */   public JButton deleteOption;
/*  45 */   private int optionNum = 0;
/*     */   
/*     */   private JLabel lblIcon;
/*     */   
/*  49 */   public List<JTextField> optionList = new ArrayList();
/*  50 */   public List<JLabel> labelList = new ArrayList();
/*  51 */   public List<JButton> deleteList = new ArrayList();
/*     */   
/*     */   public QuestionComboBox qcb;
/*     */   
/*     */   public Question_Custom_Pl cp;
/*     */   
/*  57 */   public GridBagLayout gbl = new GridBagLayout();
/*  58 */   public GridBagConstraints gbc = new GridBagConstraints();
/*     */   
/*     */ 
/*     */   public MultipleChoiceQuestionPanel(Question_Custom_Pl cp, QuestionComboBox parentQcb)
/*     */   {
/*  63 */     setPreferredSize(new Dimension(1130, 300));
/*  64 */     setBackground(Color.white);
/*     */     
/*  66 */     this.cp = cp;
/*     */     
/*  68 */     this.qcb = new QuestionComboBox();
/*  69 */     this.qcb.setModel(parentQcb.getModel());
/*  70 */     this.qcb.addActionListener(this);
/*     */     
/*  72 */     this.imgIcon = new ImageIcon(
/*  73 */       ImageController.resizeImage(new ImageIcon(getClass().getResource("/Image/circle.png")), 33, 33));
/*  74 */     this.imgClear = new ImageIcon(
/*  75 */       ImageController.resizeImage(new ImageIcon(getClass().getResource("/Image/clear.png")), 33, 33));
/*  76 */     this.lblIcon = new JLabel();
/*  77 */     this.lblIcon.setIcon(this.imgIcon);
/*  78 */     this.labelList.add(this.lblIcon);
/*     */     
/*  80 */     this.deleteOption = new JButton();
/*  81 */     this.deleteOption.setIcon(this.imgClear);
/*  82 */     this.deleteOption.setPreferredSize(new Dimension(33, 33));
/*  83 */     this.deleteOption.setBackground(Color.white);
/*  84 */     this.deleteOption.setCursor(new Cursor(12));
/*  85 */     this.deleteOption.setBorder(null);
/*  86 */     this.deleteOption.addActionListener(this);
/*  87 */     this.deleteList.add(this.deleteOption);
/*     */     
/*  89 */     this.title = new JTextField();
/*  90 */     this.title.setPreferredSize(new Dimension(732, 60));
/*  91 */     this.title.setOpaque(false);
/*  92 */     this.title.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(224, 224, 224)));
/*  93 */     this.title.setFont(new Font("나눔바른고딕", 0, 25));
/*     */     
/*  95 */     this.option = new JTextField();
/*  96 */     this.option.setText(setLabel());
/*  97 */     this.option.setPreferredSize(new Dimension(712, 60));
/*  98 */     this.option.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(224, 224, 224)));
/*  99 */     this.option.setFont(new Font("나눔바른고딕", 0, 22));
/* 100 */     this.optionList.add(this.option);
/*     */     
/* 102 */     this.addOption = new JButton();
/* 103 */     this.addOption.setPreferredSize(new Dimension(130, 50));
/* 104 */     this.addOption.setText("옵션 추가");
/* 105 */     this.addOption.setBackground(Color.white);
/* 106 */     this.addOption.setFont(new Font("나눔바른고딕", 0, 20));
/* 107 */     this.addOption.setCursor(new Cursor(12));
/* 108 */     this.addOption.addActionListener(this);
/*     */     
/* 110 */     setLayout(this.gbl);
/*     */     
/* 112 */     this.gbc.anchor = 17;
/*     */     
/* 114 */     this.gbc.gridx = 0;
/* 115 */     this.gbc.gridy = 0;
/* 116 */     this.gbc.gridwidth = 2;
/* 117 */     this.gbc.gridheight = 1;
/* 118 */     this.gbc.weighty = 1.0D;
/* 119 */     this.gbc.insets = new Insets(20, 30, 0, 0);
/* 120 */     add(this.title, this.gbc);
/*     */     
/* 122 */     this.gbc.gridx = 2;
/* 123 */     this.gbc.gridy = 0;
/* 124 */     this.gbc.gridwidth = 1;
/* 125 */     this.gbc.insets = new Insets(20, 0, 0, 30);
/* 126 */     add(this.qcb, this.gbc);
/*     */     
/* 128 */     this.gbc.gridx = 0;
/* 129 */     this.gbc.gridy = 1;
/*     */     
/* 131 */     this.gbc.insets = new Insets(0, 30, 0, 0);
/* 132 */     add((Component)this.labelList.get(0), this.gbc);
/*     */     
/* 134 */     this.gbc.gridx = 1;
/* 135 */     this.gbc.insets = new Insets(0, 20, 0, 0);
/* 136 */     add((Component)this.optionList.get(0), this.gbc);
/*     */     
/* 138 */     this.gbc.gridx = 2;
/* 139 */     this.gbc.insets = new Insets(10, 20, 0, 0);
/* 140 */     add((Component)this.deleteList.get(0), this.gbc);
/*     */     
/* 142 */     this.gbc.gridy = 2;
/*     */     
/* 144 */     this.gbc.gridx = 0;
/* 145 */     this.gbc.gridwidth = 3;
/* 146 */     this.gbc.insets = new Insets(10, 85, 10, 0);
/* 147 */     add(this.addOption, this.gbc);
/*     */   }
/*     */   
/*     */ 
/*     */   public void paintComponent(Graphics g)
/*     */   {
/* 153 */     super.paintComponent(g);
/*     */   }
/*     */   
/*     */ 
/*     */   public void actionPerformed(ActionEvent e)
/*     */   {
/* 159 */     if (e.getSource() == this.qcb)
/*     */     {
/* 161 */       JComboBox cb = (JComboBox)e.getSource();
/*     */       
/*     */ 
/* 164 */       this.cp.changePanel(cb.getSelectedIndex());
/*     */     }
/* 166 */     else if (e.getSource() == this.addOption)
/*     */     {
/* 168 */       Option_M opt = new Option_M();
/*     */       
/* 170 */       JTextField nf = new JTextField();
/* 171 */       nf.setText(setLabel());
/* 172 */       nf.setPreferredSize(new Dimension(712, 60));
/* 173 */       nf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(224, 224, 224)));
/* 174 */       nf.setFont(new Font("나눔바른고딕", 0, 22));
/* 175 */       this.optionList.add(nf);
/*     */       
/* 177 */       JLabel lbl = new JLabel();
/* 178 */       lbl.setIcon(this.imgIcon);
/* 179 */       this.labelList.add(lbl);
/*     */       
/* 181 */       JButton bt = new JButton();
/* 182 */       bt.setIcon(this.imgClear);
/* 183 */       bt.setPreferredSize(new Dimension(33, 33));
/* 184 */       bt.setBackground(Color.white);
/* 185 */       bt.setCursor(new Cursor(12));
/* 186 */       bt.setBorder(null);
/* 187 */       bt.addActionListener(this);
/* 188 */       this.deleteList.add(bt);
/*     */       
/* 190 */       remove(this.addOption);
/*     */       
/* 192 */       this.gbc.gridx = 0;
/* 193 */       this.gbc.gridy = this.optionList.size();
/* 194 */       this.gbc.gridwidth = 1;
/*     */       
/* 196 */       this.gbc.insets = new Insets(0, 30, 0, 0);
/* 197 */       add(lbl, this.gbc);
/*     */       
/* 199 */       this.gbc.gridx = 1;
/* 200 */       this.gbc.insets = new Insets(0, 20, 0, 0);
/* 201 */       add(nf, this.gbc);
/*     */       
/* 203 */       this.gbc.gridx = 2;
/* 204 */       this.gbc.insets = new Insets(10, 20, 0, 0);
/* 205 */       add(bt, this.gbc);
/*     */       
/* 207 */       this.gbc.gridy += 1;
/* 208 */       this.gbc.gridx = 0;
/* 209 */       this.gbc.gridwidth = 3;
/* 210 */       this.gbc.insets = new Insets(10, 85, 10, 0);
/* 211 */       add(this.addOption, this.gbc);
/*     */       
/* 213 */       increaseSize();
/*     */       
/* 215 */       revalidate();
/* 216 */       repaint();
/*     */     }
/*     */     else
/*     */     {
/* 220 */       for (int i = 0; i < this.deleteList.size(); i++)
/*     */       {
/* 222 */         if (e.getSource() == this.deleteList.get(i))
/*     */         {
/* 224 */           if (this.deleteList.size() == 1)
/*     */           {
/* 226 */             return;
/*     */           }
/*     */           
/* 229 */           remove((Component)this.labelList.get(i));
/* 230 */           remove((Component)this.optionList.get(i));
/* 231 */           remove((Component)this.deleteList.get(i));
/* 232 */           remove(this.addOption);
/*     */           
/* 234 */           this.labelList.remove(i);
/* 235 */           this.optionList.remove(i);
/* 236 */           this.deleteList.remove(i);
/*     */           
/* 238 */           for (int j = 0; j < this.deleteList.size(); j++)
/*     */           {
/* 240 */             this.gbc.gridx = 0;
/* 241 */             this.gbc.gridy = (j + 1);
/* 242 */             this.gbc.gridwidth = 1;
/*     */             
/* 244 */             this.gbc.insets = new Insets(0, 30, 0, 0);
/* 245 */             add((Component)this.labelList.get(j), this.gbc);
/*     */             
/* 247 */             this.gbc.gridx = 1;
/* 248 */             this.gbc.insets = new Insets(0, 20, 0, 0);
/* 249 */             add((Component)this.optionList.get(j), this.gbc);
/*     */             
/* 251 */             this.gbc.gridx = 2;
/* 252 */             this.gbc.insets = new Insets(10, 20, 0, 0);
/* 253 */             add((Component)this.deleteList.get(j), this.gbc);
/*     */           }
/*     */           
/* 256 */           this.gbc.gridy += 1;
/* 257 */           this.gbc.gridx = 0;
/* 258 */           this.gbc.gridwidth = 3;
/* 259 */           this.gbc.insets = new Insets(10, 85, 10, 0);
/* 260 */           add(this.addOption, this.gbc);
/*     */           
/* 262 */           decreaseSize();
/*     */           
/* 264 */           revalidate();
/* 265 */           repaint();
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void increaseSize()
/*     */   {
/* 273 */     setPreferredSize(new Dimension(1130, getHeight() + 70));
/*     */   }
/*     */   
/*     */   public void decreaseSize()
/*     */   {
/* 278 */     setPreferredSize(new Dimension(1130, getHeight() - 70));
/*     */   }
/*     */   
/*     */   public String setLabel()
/*     */   {
/* 283 */     return "옵션 " + String.valueOf(++this.optionNum);
/*     */   }
/*     */   
/*     */   public List<Option> getOption()
/*     */   {
/* 288 */     List<Option> list_opt = new ArrayList();
/*     */     
/* 290 */     for (int i = 0; i < this.optionList.size(); i++)
/*     */     {
/* 292 */       Option opt = new Option();
/* 293 */       opt.setNum(String.valueOf(i + 1));
/* 294 */       opt.setName(((JTextField)this.optionList.get(i)).getText());
/* 295 */       opt.setPoint(0);
/*     */       
/* 297 */       list_opt.add(opt);
/*     */     }
/* 299 */     return list_opt;
/*     */   }
/*     */   
/*     */   public List<Option_M> getOption_M()
/*     */   {
/* 304 */     List<Option_M> list_opt = new ArrayList();
/*     */     
/* 306 */     for (int i = 0; i < this.optionList.size(); i++)
/*     */     {
/* 308 */       Option_M opt = new Option_M();
/* 309 */       opt.setNum(String.valueOf(i + 1));
/* 310 */       opt.setName(((JTextField)this.optionList.get(i)).getText());
/*     */       
/* 312 */       list_opt.add(opt);
/*     */     }
/* 314 */     return list_opt;
/*     */   }
/*     */   
/*     */   public List<Module_Option> getOptionBy()
/*     */   {
/* 319 */     List<Module_Option> lt_opt = new ArrayList();
/*     */     
/* 321 */     for (int i = 0; i < this.optionList.size(); i++)
/*     */     {
/* 323 */       Module_Option opt = new Module_Option();
/* 324 */       opt.setNumber(String.valueOf(i + 1));
/* 325 */       opt.setName(((JTextField)this.optionList.get(i)).getText());
/*     */       
/* 327 */       lt_opt.add(opt);
/*     */     }
/* 329 */     return lt_opt;
/*     */   }
/*     */   
/*     */   public void setOption(List<Module_Option> option)
/*     */   {
/* 334 */     this.qcb.setSelectedIndex(1);
/*     */     
/* 336 */     remove((Component)this.labelList.get(0));
/* 337 */     remove((Component)this.optionList.get(0));
/* 338 */     remove((Component)this.deleteList.get(0));
/* 339 */     remove(this.addOption);
/*     */     
/* 341 */     this.labelList.clear();
/* 342 */     this.optionList.clear();
/* 343 */     this.deleteList.clear();
/*     */     
/* 345 */     for (int i = 0; i < option.size(); i++)
/*     */     {
/* 347 */       Option_M opt = new Option_M();
/*     */       
/* 349 */       JTextField nf = new JTextField();
/* 350 */       nf.setText(((Module_Option)option.get(i)).getName());
/* 351 */       nf.setPreferredSize(new Dimension(712, 60));
/* 352 */       nf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(224, 224, 224)));
/* 353 */       nf.setFont(new Font("나눔바른고딕", 0, 22));
/* 354 */       this.optionList.add(nf);
/*     */       
/* 356 */       JLabel lbl = new JLabel();
/* 357 */       lbl.setIcon(this.imgIcon);
/* 358 */       this.labelList.add(lbl);
/*     */       
/* 360 */       JButton bt = new JButton();
/* 361 */       bt.setIcon(this.imgClear);
/* 362 */       bt.setPreferredSize(new Dimension(33, 33));
/* 363 */       bt.setBackground(Color.white);
/* 364 */       bt.setCursor(new Cursor(12));
/* 365 */       bt.setBorder(null);
/* 366 */       bt.addActionListener(this);
/* 367 */       this.deleteList.add(bt);
/*     */       
/* 369 */       this.gbc.gridx = 0;
/* 370 */       this.gbc.gridy = this.optionList.size();
/* 371 */       this.gbc.gridwidth = 1;
/*     */       
/* 373 */       this.gbc.insets = new Insets(0, 30, 0, 0);
/* 374 */       add(lbl, this.gbc);
/*     */       
/* 376 */       this.gbc.gridx = 1;
/* 377 */       this.gbc.insets = new Insets(0, 20, 0, 0);
/* 378 */       add(nf, this.gbc);
/*     */       
/* 380 */       this.gbc.gridx = 2;
/* 381 */       this.gbc.insets = new Insets(10, 20, 0, 0);
/* 382 */       add(bt, this.gbc);
/*     */     }
/* 384 */     this.gbc.gridy += 1;
/* 385 */     this.gbc.gridx = 0;
/* 386 */     this.gbc.gridwidth = 3;
/* 387 */     this.gbc.insets = new Insets(10, 85, 10, 0);
/* 388 */     add(this.addOption, this.gbc);
/*     */     
/* 390 */     setPreferredSize(new Dimension(1130, 230 + this.optionList.size() * 70));
/*     */   }
/*     */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Question_Management\MultipleChoiceQuestionPanel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */