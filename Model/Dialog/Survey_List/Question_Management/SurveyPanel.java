/*     */ package Model.Dialog.Survey_List.Question_Management;
/*     */ 
/*     */ import java.awt.Color;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.Font;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.GridBagLayout;
/*     */ import java.awt.Insets;
/*     */ import javax.swing.BorderFactory;
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
/*     */ public class SurveyPanel
/*     */   extends JPanel
/*     */ {
/*     */   public JLabel lblSection;
/*     */   public HintTextField surveyTitle;
/*     */   public HintTextArea surveySub;
/*  30 */   public GridBagLayout gbl = new GridBagLayout();
/*  31 */   public GridBagConstraints gbc = new GridBagConstraints();
/*     */   
/*     */   private Color main;
/*     */   
/*     */   private Color sub;
/*     */   private int point;
/*     */   
/*     */   public SurveyPanel(Color main, Color sub)
/*     */   {
/*  40 */     this.main = main;
/*  41 */     this.sub = sub;
/*     */     
/*     */ 
/*  44 */     setBackground(Color.white);
/*  45 */     setLayout(this.gbl);
/*  46 */     setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(203, 203, 203)));
/*     */     
/*     */ 
/*  49 */     this.surveyTitle = new HintTextField("제목 없는 설문지", Color.BLACK);
/*  50 */     this.surveyTitle.setPreferredSize(new Dimension(1082, 60));
/*  51 */     this.surveyTitle.setOpaque(false);
/*  52 */     this.surveyTitle.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(224, 224, 224)));
/*  53 */     this.surveyTitle.setFont(new Font("나눔바른고딕", 0, 40));
/*     */     
/*  55 */     this.surveySub = new HintTextArea("설문지 설명", Color.GRAY);
/*  56 */     this.surveySub.setColumns(49);
/*  57 */     this.surveySub.setOpaque(false);
/*  58 */     this.surveySub.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(224, 224, 224)));
/*  59 */     this.surveySub.setFont(new Font("나눔바른고딕", 0, 25));
/*  60 */     this.surveySub.setLineWrap(true);
/*     */     
/*     */ 
/*  63 */     this.lblSection = new JLabel();
/*  64 */     this.lblSection.setPreferredSize(new Dimension(250, 60));
/*  65 */     this.lblSection.setHorizontalAlignment(4);
/*  66 */     this.lblSection.setOpaque(true);
/*  67 */     this.lblSection.setBackground(main);
/*  68 */     this.lblSection.setForeground(Color.white);
/*  69 */     this.lblSection.setFont(new Font("나눔바른고딕", 1, 25));
/*  70 */     this.lblSection.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 40));
/*     */     
/*     */ 
/*  73 */     this.gbc.gridx = 0;
/*  74 */     this.gbc.gridy = 0;
/*  75 */     this.gbc.gridwidth = 1;
/*  76 */     this.gbc.gridheight = 1;
/*  77 */     this.gbc.weightx = 1.0D;
/*  78 */     this.gbc.weighty = 0.01D;
/*  79 */     this.gbc.anchor = 17;
/*  80 */     this.gbc.insets = new Insets(30, 0, 0, 0);
/*  81 */     add(this.lblSection, this.gbc);
/*     */     
/*  83 */     this.gbc.gridx = 0;
/*  84 */     this.gbc.gridy = 1;
/*  85 */     this.gbc.gridwidth = 1;
/*  86 */     this.gbc.gridheight = 1;
/*  87 */     this.gbc.weightx = 1.0D;
/*  88 */     this.gbc.weighty = 0.01D;
/*  89 */     this.gbc.anchor = 11;
/*  90 */     this.gbc.insets = new Insets(60, 0, 0, 0);
/*  91 */     add(this.surveyTitle, this.gbc);
/*     */     
/*  93 */     this.gbc.gridx = 0;
/*  94 */     this.gbc.gridy = 2;
/*  95 */     this.gbc.gridwidth = 1;
/*  96 */     this.gbc.gridheight = 1;
/*  97 */     this.gbc.weightx = 1.0D;
/*  98 */     this.gbc.weighty = 1.0D;
/*  99 */     this.gbc.anchor = 11;
/* 100 */     this.gbc.insets = new Insets(50, 0, 30, 0);
/* 101 */     add(this.surveySub, this.gbc);
/*     */   }
/*     */   
/*     */ 
/*     */   public void paintComponent(Graphics g)
/*     */   {
/* 107 */     super.paintComponent(g);
/*     */   }
/*     */   
/*     */   public void changeLabel(int index)
/*     */   {
/* 112 */     this.lblSection.setText(index + " 섹션");
/*     */   }
/*     */   
/*     */   public String getLabel()
/*     */   {
/* 117 */     return this.lblSection.getText();
/*     */   }
/*     */   
/*     */   public String getName()
/*     */   {
/* 122 */     return this.surveyTitle.getText();
/*     */   }
/*     */   
/*     */   public String getSubName()
/*     */   {
/* 127 */     return this.surveySub.getText();
/*     */   }
/*     */   
/*     */   public void setPoint(int point)
/*     */   {
/* 132 */     this.point = point;
/*     */   }
/*     */   
/*     */   public void setPointZero()
/*     */   {
/* 137 */     this.point = 0;
/*     */   }
/*     */   
/*     */   public int getPoint()
/*     */   {
/* 142 */     return this.point;
/*     */   }
/*     */   
/*     */   public void loadColor(Color main, Color sub)
/*     */   {
/* 147 */     this.lblSection.setBackground(main);
/*     */   }
/*     */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Question_Management\SurveyPanel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */