/*     */ package Model.Dialog.Survey_List.Question_Management;
/*     */ 
/*     */ import java.awt.Color;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.Font;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.GridBagLayout;
/*     */ import java.awt.Insets;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class NumberPanel
/*     */   extends JPanel
/*     */ {
/*  18 */   private GridBagLayout gbl = new GridBagLayout();
/*  19 */   private GridBagConstraints gbc = new GridBagConstraints();
/*     */   
/*  21 */   private JLabel ll_one = new JLabel();
/*  22 */   private JLabel ll_two = new JLabel();
/*  23 */   private JLabel ll_three = new JLabel();
/*  24 */   private JLabel ll_four = new JLabel();
/*     */   
/*     */   public NumberPanel(int order)
/*     */   {
/*  28 */     setLayout(this.gbl);
/*     */     
/*  30 */     setPreferredSize(new Dimension(0, 100));
/*     */     
/*  32 */     this.ll_one.setText("①   정보 입력");
/*  33 */     this.ll_one.setBackground(new Color(71, 71, 71));
/*  34 */     this.ll_one.setForeground(new Color(119, 119, 119));
/*  35 */     this.ll_one.setFont(new Font("나눔바른고딕", 0, 25));
/*  36 */     this.ll_one.setOpaque(true);
/*  37 */     this.ll_one.setHorizontalAlignment(0);
/*     */     
/*  39 */     this.ll_two.setText("②   문항 생성");
/*  40 */     this.ll_two.setBackground(new Color(71, 71, 71));
/*  41 */     this.ll_two.setForeground(new Color(119, 119, 119));
/*  42 */     this.ll_two.setFont(new Font("나눔바른고딕", 0, 25));
/*  43 */     this.ll_two.setOpaque(true);
/*  44 */     this.ll_two.setHorizontalAlignment(0);
/*     */     
/*  46 */     this.ll_three.setText("③   참여 그룹");
/*  47 */     this.ll_three.setBackground(new Color(71, 71, 71));
/*  48 */     this.ll_three.setForeground(new Color(119, 119, 119));
/*  49 */     this.ll_three.setFont(new Font("나눔바른고딕", 0, 25));
/*  50 */     this.ll_three.setOpaque(true);
/*  51 */     this.ll_three.setHorizontalAlignment(0);
/*     */     
/*  53 */     this.ll_four.setText("④   점수 설정");
/*  54 */     this.ll_four.setBackground(new Color(71, 71, 71));
/*  55 */     this.ll_four.setForeground(new Color(119, 119, 119));
/*  56 */     this.ll_four.setFont(new Font("나눔바른고딕", 0, 25));
/*  57 */     this.ll_four.setOpaque(true);
/*  58 */     this.ll_four.setHorizontalAlignment(0);
/*     */     
/*     */ 
/*  61 */     this.gbc.anchor = 11;
/*  62 */     this.gbc.fill = 1;
/*     */     
/*  64 */     this.gbc.gridx = 0;
/*  65 */     this.gbc.gridy = 0;
/*  66 */     this.gbc.gridwidth = 1;
/*  67 */     this.gbc.gridheight = 1;
/*  68 */     this.gbc.weightx = 1.0D;
/*  69 */     this.gbc.weighty = 1.0D;
/*  70 */     this.gbc.insets = new Insets(0, -5, 0, 0);
/*  71 */     add(this.ll_one, this.gbc);
/*     */     
/*  73 */     this.gbc.gridx = 1;
/*  74 */     this.gbc.gridy = 0;
/*  75 */     add(this.ll_two, this.gbc);
/*     */     
/*  77 */     this.gbc.gridx = 2;
/*  78 */     this.gbc.gridy = 0;
/*  79 */     add(this.ll_three, this.gbc);
/*     */     
/*  81 */     this.gbc.gridx = 3;
/*  82 */     this.gbc.gridy = 0;
/*  83 */     add(this.ll_four, this.gbc);
/*     */     
/*  85 */     setOrder(order);
/*     */   }
/*     */   
/*     */   public void setOrder(int order)
/*     */   {
/*  90 */     switch (order) {
/*     */     case 0: 
/*  92 */       this.ll_one.setBorder(BorderFactory.createMatteBorder(0, 0, 6, 0, new Color(128, 199, 251)));
/*  93 */       this.ll_one.setForeground(Color.WHITE);
/*  94 */       break;
/*  95 */     case 1:  this.ll_two.setBorder(BorderFactory.createMatteBorder(0, 0, 6, 0, new Color(128, 199, 251)));
/*  96 */       this.ll_two.setForeground(Color.WHITE);
/*  97 */       break;
/*  98 */     case 2:  this.ll_three.setBorder(BorderFactory.createMatteBorder(0, 0, 6, 0, new Color(128, 199, 251)));
/*  99 */       this.ll_three.setForeground(Color.WHITE);
/* 100 */       break;
/* 101 */     case 3:  this.ll_four.setBorder(BorderFactory.createMatteBorder(0, 0, 6, 0, new Color(128, 199, 251)));
/* 102 */       this.ll_four.setForeground(Color.WHITE);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Question_Management\NumberPanel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */