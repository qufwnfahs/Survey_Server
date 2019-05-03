/*     */ package Model.Dialog.Survey_List;
/*     */ 
/*     */ import Enum.Enum_Image_Ci;
/*     */ import Model.Dialog.Survey_List.Question_Management.RoundButton;
/*     */ import Worker.ImageController;
/*     */ import java.awt.Color;
/*     */ import java.awt.Cursor;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.GridBagLayout;
/*     */ import java.awt.Insets;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.awt.event.MouseListener;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class Question_Bottom_Pl
/*     */   extends JPanel
/*     */   implements MouseListener, ActionListener
/*     */ {
/*  82 */   private GridBagLayout gbl = new GridBagLayout();
/*  83 */   private GridBagConstraints gbc = new GridBagConstraints();
/*     */   
/*     */ 
/*  86 */   private RoundButton bt_que = new RoundButton(255, 255, 255);
/*  87 */   private RoundButton bt_sec = new RoundButton(255, 255, 255);
/*  88 */   private RoundButton bt_remove = new RoundButton(255, 255, 255);
/*     */   
/*     */   private Question_Add_Pl question_Add;
/*     */   
/*     */   private Question_Pl question_Pl;
/*     */   
/*     */   public Question_Bottom_Pl(Question_Add_Pl question_Add, Question_Pl question_Pl)
/*     */   {
/*  96 */     this.question_Add = question_Add;
/*  97 */     this.question_Pl = question_Pl;
/*     */     
/*     */ 
/* 100 */     setLayout(this.gbl);
/* 101 */     setBackground(Color.WHITE);
/* 102 */     setBorder(BorderFactory.createMatteBorder(2, 0, 0, 0, new Color(244, 244, 244)));
/*     */     
/*     */ 
/* 105 */     this.bt_que.setPreferredSize(new Dimension(65, 65));
/* 106 */     this.bt_que.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.ADD_QUESTION.getImageIcon(), 38, 38)));
/* 107 */     this.bt_que.setFocusPainted(false);
/* 108 */     this.bt_que.setBorder(null);
/* 109 */     this.bt_que.setContentAreaFilled(false);
/* 110 */     this.bt_que.setCursor(new Cursor(12));
/* 111 */     this.bt_que.addMouseListener(this);
/* 112 */     this.bt_que.addActionListener(this);
/*     */     
/* 114 */     this.bt_sec.setPreferredSize(new Dimension(65, 65));
/* 115 */     this.bt_sec.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.ADD_SECTION.getImageIcon(), 38, 38)));
/* 116 */     this.bt_sec.setFocusPainted(false);
/* 117 */     this.bt_sec.setBorder(null);
/* 118 */     this.bt_sec.setContentAreaFilled(false);
/* 119 */     this.bt_sec.setCursor(new Cursor(12));
/* 120 */     this.bt_sec.addMouseListener(this);
/* 121 */     this.bt_sec.addActionListener(this);
/*     */     
/* 123 */     this.bt_remove.setPreferredSize(new Dimension(65, 65));
/* 124 */     this.bt_remove.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.REMOVE.getImageIcon(), 38, 38)));
/* 125 */     this.bt_remove.setFocusPainted(false);
/* 126 */     this.bt_remove.setBorder(null);
/* 127 */     this.bt_remove.setContentAreaFilled(false);
/* 128 */     this.bt_remove.setCursor(new Cursor(12));
/* 129 */     this.bt_remove.addMouseListener(this);
/* 130 */     this.bt_remove.addActionListener(this);
/*     */     
/*     */ 
/* 133 */     this.gbc.anchor = 11;
/* 134 */     this.gbc.fill = 0;
/*     */     
/* 136 */     this.gbc.gridx = 0;
/* 137 */     this.gbc.gridy = 0;
/* 138 */     this.gbc.gridwidth = 1;
/* 139 */     this.gbc.gridheight = 1;
/* 140 */     this.gbc.weightx = 0.01D;
/* 141 */     this.gbc.weighty = 1.0D;
/* 142 */     this.gbc.insets = new Insets(10, 10, 10, 10);
/* 143 */     add(this.bt_que, this.gbc);
/*     */     
/* 145 */     this.gbc.gridx = 1;
/* 146 */     this.gbc.gridy = 0;
/* 147 */     add(this.bt_sec, this.gbc);
/*     */     
/* 149 */     this.gbc.gridx = 2;
/* 150 */     this.gbc.gridy = 0;
/* 151 */     this.gbc.weightx = 0.97D;
/* 152 */     add(new JLabel(), this.gbc);
/*     */     
/* 154 */     this.gbc.gridx = 3;
/* 155 */     this.gbc.gridy = 0;
/* 156 */     this.gbc.weightx = 0.01D;
/* 157 */     add(this.bt_remove, this.gbc);
/*     */   }
/*     */   
/*     */ 
/*     */   public void actionPerformed(ActionEvent e)
/*     */   {
/* 163 */     if (e.getSource().equals(this.bt_que))
/*     */     {
/* 165 */       this.question_Add.addQuestion(this.question_Pl);
/*     */     }
/* 167 */     else if (e.getSource().equals(this.bt_sec))
/*     */     {
/* 169 */       this.question_Add.addSection(this.question_Pl);
/*     */     }
/* 171 */     else if (e.getSource().equals(this.bt_remove))
/*     */     {
/* 173 */       this.question_Add.deleteQuestion(this.question_Pl);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void mouseClicked(MouseEvent e) {}
/*     */   
/*     */ 
/*     */   public void mouseEntered(MouseEvent e)
/*     */   {
/* 184 */     RoundButton bt = (RoundButton)e.getSource();
/* 185 */     bt.getDark();
/*     */   }
/*     */   
/*     */ 
/*     */   public void mouseExited(MouseEvent e)
/*     */   {
/* 191 */     RoundButton bt = (RoundButton)e.getSource();
/* 192 */     bt.getBright();
/*     */   }
/*     */   
/*     */   public void mousePressed(MouseEvent e) {}
/*     */   
/*     */   public void mouseReleased(MouseEvent e) {}
/*     */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Question_Bottom_Pl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */