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
/*     */ 
/*     */ 
/*     */ public class DropDownQuestionPanel
/*     */   extends JPanel
/*     */   implements ActionListener
/*     */ {
/*     */   public JTextField title;
/*     */   private JTextField option;
/*     */   private ImageIcon imgIcon;
/*     */   private ImageIcon imgClear;
/*     */   public JButton addOption;
/*     */   public JButton deleteOption;
/*  47 */   private int optionNum = 0;
/*     */   
/*     */   private JLabel lblIcon;
/*     */   
/*  51 */   public List<JTextField> optionList = new ArrayList();
/*  52 */   public List<JLabel> labelList = new ArrayList();
/*  53 */   public List<JButton> deleteList = new ArrayList();
/*     */   
/*     */   public QuestionComboBox qcb;
/*     */   
/*     */   public Question_Custom_Pl cp;
/*     */   
/*  59 */   public GridBagLayout gbl = new GridBagLayout();
/*  60 */   public GridBagConstraints gbc = new GridBagConstraints();
/*     */   
/*     */ 
/*     */   public DropDownQuestionPanel(Question_Custom_Pl cp, QuestionComboBox parentQcb)
/*     */   {
/*  65 */     setPreferredSize(new Dimension(1130, 300));
/*  66 */     setBackground(Color.white);
/*     */     
/*  68 */     this.cp = cp;
/*     */     
/*  70 */     this.qcb = new QuestionComboBox();
/*  71 */     this.qcb.setModel(parentQcb.getModel());
/*  72 */     this.qcb.addActionListener(this);
/*     */     
/*  74 */     this.imgIcon = new ImageIcon(
/*  75 */       ImageController.resizeImage(new ImageIcon(getClass().getResource("/Image/dropdown.png")), 33, 33));
/*  76 */     this.imgClear = new ImageIcon(
/*  77 */       ImageController.resizeImage(new ImageIcon(getClass().getResource("/Image/clear.png")), 33, 33));
/*  78 */     this.lblIcon = new JLabel();
/*  79 */     this.lblIcon.setIcon(this.imgIcon);
/*  80 */     this.labelList.add(this.lblIcon);
/*     */     
/*  82 */     this.deleteOption = new JButton();
/*  83 */     this.deleteOption.setIcon(this.imgClear);
/*  84 */     this.deleteOption.setPreferredSize(new Dimension(33, 33));
/*  85 */     this.deleteOption.setBackground(Color.white);
/*  86 */     this.deleteOption.setCursor(new Cursor(12));
/*  87 */     this.deleteOption.setBorder(null);
/*  88 */     this.deleteOption.addActionListener(this);
/*  89 */     this.deleteList.add(this.deleteOption);
/*     */     
/*  91 */     this.title = new JTextField();
/*  92 */     this.title.setPreferredSize(new Dimension(732, 60));
/*  93 */     this.title.setOpaque(false);
/*  94 */     this.title.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(224, 224, 224)));
/*  95 */     this.title.setFont(new Font("나눔바른고딕", 0, 25));
/*     */     
/*  97 */     this.option = new JTextField();
/*  98 */     this.option.setText(setLabel());
/*  99 */     this.option.setPreferredSize(new Dimension(712, 60));
/* 100 */     this.option.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(224, 224, 224)));
/* 101 */     this.option.setFont(new Font("나눔바른고딕", 0, 22));
/* 102 */     this.optionList.add(this.option);
/*     */     
/* 104 */     this.addOption = new JButton();
/* 105 */     this.addOption.setPreferredSize(new Dimension(130, 50));
/* 106 */     this.addOption.setText("옵션 추가");
/* 107 */     this.addOption.setBackground(Color.white);
/* 108 */     this.addOption.setFont(new Font("나눔바른고딕", 0, 20));
/* 109 */     this.addOption.setCursor(new Cursor(12));
/* 110 */     this.addOption.addActionListener(this);
/*     */     
/* 112 */     setLayout(this.gbl);
/*     */     
/* 114 */     this.gbc.anchor = 17;
/*     */     
/* 116 */     this.gbc.gridx = 0;
/* 117 */     this.gbc.gridy = 0;
/* 118 */     this.gbc.gridwidth = 2;
/* 119 */     this.gbc.gridheight = 1;
/* 120 */     this.gbc.weighty = 1.0D;
/* 121 */     this.gbc.insets = new Insets(20, 30, 0, 0);
/* 122 */     add(this.title, this.gbc);
/*     */     
/* 124 */     this.gbc.gridx = 2;
/* 125 */     this.gbc.gridy = 0;
/* 126 */     this.gbc.gridwidth = 1;
/* 127 */     this.gbc.insets = new Insets(20, 0, 0, 30);
/* 128 */     add(this.qcb, this.gbc);
/*     */     
/* 130 */     this.gbc.gridx = 0;
/* 131 */     this.gbc.gridy = 1;
/*     */     
/* 133 */     this.gbc.insets = new Insets(0, 30, 0, 0);
/* 134 */     add((Component)this.labelList.get(0), this.gbc);
/*     */     
/* 136 */     this.gbc.gridx = 1;
/* 137 */     this.gbc.insets = new Insets(0, 20, 0, 0);
/* 138 */     add((Component)this.optionList.get(0), this.gbc);
/*     */     
/* 140 */     this.gbc.gridx = 2;
/* 141 */     this.gbc.insets = new Insets(10, 20, 0, 0);
/* 142 */     add((Component)this.deleteList.get(0), this.gbc);
/*     */     
/* 144 */     this.gbc.gridy = 2;
/*     */     
/* 146 */     this.gbc.gridx = 0;
/* 147 */     this.gbc.gridwidth = 3;
/* 148 */     this.gbc.insets = new Insets(10, 85, 10, 0);
/* 149 */     add(this.addOption, this.gbc);
/*     */   }
/*     */   
/*     */ 
/*     */   public void paintComponent(Graphics g)
/*     */   {
/* 155 */     super.paintComponent(g);
/*     */   }
/*     */   
/*     */ 
/*     */   public void actionPerformed(ActionEvent e)
/*     */   {
/* 161 */     if (e.getSource() == this.qcb)
/*     */     {
/* 163 */       JComboBox cb = (JComboBox)e.getSource();
/*     */       
/*     */ 
/* 166 */       this.cp.changePanel(cb.getSelectedIndex());
/*     */     }
/* 168 */     else if (e.getSource() == this.addOption)
/*     */     {
/* 170 */       Option_M opt = new Option_M();
/*     */       
/* 172 */       JTextField nf = new JTextField();
/* 173 */       nf.setText(setLabel());
/* 174 */       nf.setPreferredSize(new Dimension(712, 60));
/* 175 */       nf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(224, 224, 224)));
/* 176 */       nf.setFont(new Font("나눔바른고딕", 0, 22));
/* 177 */       this.optionList.add(nf);
/*     */       
/* 179 */       JLabel lbl = new JLabel();
/* 180 */       lbl.setIcon(this.imgIcon);
/* 181 */       this.labelList.add(lbl);
/*     */       
/* 183 */       JButton bt = new JButton();
/* 184 */       bt.setIcon(this.imgClear);
/* 185 */       bt.setPreferredSize(new Dimension(33, 33));
/* 186 */       bt.setBackground(Color.white);
/* 187 */       bt.setCursor(new Cursor(12));
/* 188 */       bt.setBorder(null);
/* 189 */       bt.addActionListener(this);
/* 190 */       this.deleteList.add(bt);
/*     */       
/* 192 */       remove(this.addOption);
/*     */       
/* 194 */       this.gbc.gridx = 0;
/* 195 */       this.gbc.gridy = this.optionList.size();
/* 196 */       this.gbc.gridwidth = 1;
/*     */       
/* 198 */       this.gbc.insets = new Insets(0, 30, 0, 0);
/* 199 */       add(lbl, this.gbc);
/*     */       
/* 201 */       this.gbc.gridx = 1;
/* 202 */       this.gbc.insets = new Insets(0, 20, 0, 0);
/* 203 */       add(nf, this.gbc);
/*     */       
/* 205 */       this.gbc.gridx = 2;
/* 206 */       this.gbc.insets = new Insets(10, 20, 0, 0);
/* 207 */       add(bt, this.gbc);
/*     */       
/* 209 */       this.gbc.gridy += 1;
/* 210 */       this.gbc.gridx = 0;
/* 211 */       this.gbc.gridwidth = 3;
/* 212 */       this.gbc.insets = new Insets(10, 85, 10, 0);
/* 213 */       add(this.addOption, this.gbc);
/*     */       
/* 215 */       increaseSize();
/*     */       
/* 217 */       revalidate();
/* 218 */       repaint();
/*     */     }
/*     */     else
/*     */     {
/* 222 */       for (int i = 0; i < this.deleteList.size(); i++)
/*     */       {
/* 224 */         if (e.getSource() == this.deleteList.get(i))
/*     */         {
/* 226 */           if (this.deleteList.size() == 1)
/*     */           {
/* 228 */             return;
/*     */           }
/*     */           
/* 231 */           remove((Component)this.labelList.get(i));
/* 232 */           remove((Component)this.optionList.get(i));
/* 233 */           remove((Component)this.deleteList.get(i));
/* 234 */           remove(this.addOption);
/*     */           
/* 236 */           this.labelList.remove(i);
/* 237 */           this.optionList.remove(i);
/* 238 */           this.deleteList.remove(i);
/*     */           
/* 240 */           for (int j = 0; j < this.deleteList.size(); j++)
/*     */           {
/* 242 */             this.gbc.gridx = 0;
/* 243 */             this.gbc.gridy = (j + 1);
/* 244 */             this.gbc.gridwidth = 1;
/*     */             
/* 246 */             this.gbc.insets = new Insets(0, 30, 0, 0);
/* 247 */             add((Component)this.labelList.get(j), this.gbc);
/*     */             
/* 249 */             this.gbc.gridx = 1;
/* 250 */             this.gbc.insets = new Insets(0, 20, 0, 0);
/* 251 */             add((Component)this.optionList.get(j), this.gbc);
/*     */             
/* 253 */             this.gbc.gridx = 2;
/* 254 */             this.gbc.insets = new Insets(10, 20, 0, 0);
/* 255 */             add((Component)this.deleteList.get(j), this.gbc);
/*     */           }
/*     */           
/* 258 */           this.gbc.gridy += 1;
/* 259 */           this.gbc.gridx = 0;
/* 260 */           this.gbc.gridwidth = 3;
/* 261 */           this.gbc.insets = new Insets(10, 85, 10, 0);
/* 262 */           add(this.addOption, this.gbc);
/*     */           
/* 264 */           decreaseSize();
/*     */           
/* 266 */           revalidate();
/* 267 */           repaint();
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void increaseSize()
/*     */   {
/* 275 */     setPreferredSize(new Dimension(1130, getHeight() + 70));
/*     */   }
/*     */   
/*     */   public void decreaseSize()
/*     */   {
/* 280 */     setPreferredSize(new Dimension(1130, getHeight() - 70));
/*     */   }
/*     */   
/*     */   public String setLabel()
/*     */   {
/* 285 */     return "옵션 " + String.valueOf(++this.optionNum);
/*     */   }
/*     */   
/*     */   public List<Option> getOption()
/*     */   {
/* 290 */     List<Option> list_opt = new ArrayList();
/*     */     
/* 292 */     for (int i = 0; i < this.optionList.size(); i++)
/*     */     {
/* 294 */       Option opt = new Option();
/* 295 */       opt.setNum(String.valueOf(i + 1));
/* 296 */       opt.setName(((JTextField)this.optionList.get(i)).getText());
/* 297 */       opt.setPoint(0);
/*     */       
/* 299 */       list_opt.add(opt);
/*     */     }
/* 301 */     return list_opt;
/*     */   }
/*     */   
/*     */   public List<Option_M> getOption_M()
/*     */   {
/* 306 */     List<Option_M> list_opt = new ArrayList();
/*     */     
/* 308 */     for (int i = 0; i < this.optionList.size(); i++)
/*     */     {
/* 310 */       Option_M opt = new Option_M();
/* 311 */       opt.setNum(String.valueOf(i + 1));
/* 312 */       opt.setName(((JTextField)this.optionList.get(i)).getText());
/*     */       
/* 314 */       list_opt.add(opt);
/*     */     }
/* 316 */     return list_opt;
/*     */   }
/*     */   
/*     */   public List<Module_Option> getOptionBy()
/*     */   {
/* 321 */     List<Module_Option> lt_opt = new ArrayList();
/*     */     
/* 323 */     for (int i = 0; i < this.optionList.size(); i++)
/*     */     {
/* 325 */       Module_Option opt = new Module_Option();
/* 326 */       opt.setNumber(String.valueOf(i + 1));
/* 327 */       opt.setName(((JTextField)this.optionList.get(i)).getText());
/*     */       
/* 329 */       lt_opt.add(opt);
/*     */     }
/* 331 */     return lt_opt;
/*     */   }
/*     */   
/*     */   public void setOption(List<Module_Option> option)
/*     */   {
/* 336 */     this.qcb.setSelectedIndex(3);
/*     */     
/* 338 */     remove((Component)this.labelList.get(0));
/* 339 */     remove((Component)this.optionList.get(0));
/* 340 */     remove((Component)this.deleteList.get(0));
/* 341 */     remove(this.addOption);
/*     */     
/* 343 */     this.labelList.clear();
/* 344 */     this.optionList.clear();
/* 345 */     this.deleteList.clear();
/*     */     
/* 347 */     for (int i = 0; i < option.size(); i++)
/*     */     {
/* 349 */       Option_M opt = new Option_M();
/*     */       
/* 351 */       JTextField nf = new JTextField();
/* 352 */       nf.setText(((Module_Option)option.get(i)).getName());
/* 353 */       nf.setPreferredSize(new Dimension(712, 60));
/* 354 */       nf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(224, 224, 224)));
/* 355 */       nf.setFont(new Font("나눔바른고딕", 0, 22));
/* 356 */       this.optionList.add(nf);
/*     */       
/* 358 */       JLabel lbl = new JLabel();
/* 359 */       lbl.setIcon(this.imgIcon);
/* 360 */       this.labelList.add(lbl);
/*     */       
/* 362 */       JButton bt = new JButton();
/* 363 */       bt.setIcon(this.imgClear);
/* 364 */       bt.setPreferredSize(new Dimension(33, 33));
/* 365 */       bt.setBackground(Color.white);
/* 366 */       bt.setCursor(new Cursor(12));
/* 367 */       bt.setBorder(null);
/* 368 */       bt.addActionListener(this);
/* 369 */       this.deleteList.add(bt);
/*     */       
/* 371 */       this.gbc.gridx = 0;
/* 372 */       this.gbc.gridy = this.optionList.size();
/* 373 */       this.gbc.gridwidth = 1;
/*     */       
/* 375 */       this.gbc.insets = new Insets(0, 30, 0, 0);
/* 376 */       add(lbl, this.gbc);
/*     */       
/* 378 */       this.gbc.gridx = 1;
/* 379 */       this.gbc.insets = new Insets(0, 20, 0, 0);
/* 380 */       add(nf, this.gbc);
/*     */       
/* 382 */       this.gbc.gridx = 2;
/* 383 */       this.gbc.insets = new Insets(10, 20, 0, 0);
/* 384 */       add(bt, this.gbc);
/*     */     }
/* 386 */     this.gbc.gridy += 1;
/* 387 */     this.gbc.gridx = 0;
/* 388 */     this.gbc.gridwidth = 3;
/* 389 */     this.gbc.insets = new Insets(10, 85, 10, 0);
/* 390 */     add(this.addOption, this.gbc);
/*     */     
/* 392 */     setPreferredSize(new Dimension(1130, 230 + this.optionList.size() * 70));
/*     */   }
/*     */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Question_Management\DropDownQuestionPanel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */