/*     */ package Model.Dialog;
/*     */ 
/*     */ import Worker.ImageController;
/*     */ import java.awt.Color;
/*     */ import java.awt.Container;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.GridBagLayout;
/*     */ import java.awt.Insets;
/*     */ import java.sql.SQLException;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JDialog;
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
/*     */ public class User_Management
/*     */   extends JDialog
/*     */ {
/*  67 */   private GridBagLayout gbl = new GridBagLayout();
/*  68 */   private GridBagConstraints gbc = new GridBagConstraints();
/*     */   
/*     */   public User_Management()
/*     */     throws SQLException
/*     */   {
/*  73 */     setLayout(this.gbl);
/*  74 */     setPreferredSize(new Dimension(1300, 746));
/*  75 */     setMinimumSize(new Dimension(1300, 746));
/*  76 */     setMaximumSize(new Dimension(1300, 746));
/*  77 */     setLocationRelativeTo(null);
/*  78 */     getContentPane().setBackground(new Color(0, 172, 189));
/*  79 */     setIconImage(ImageController.resizeImage(new ImageIcon(getClass().getResource("/Image/poker-chip.png")), 48, 48));
/*  80 */     setTitle("정다운마을 설문조사");
/*     */     
/*  82 */     TreePanel tp = new TreePanel();
/*  83 */     TablePanel tap = new TablePanel();
/*     */     
/*  85 */     this.gbc.anchor = 11;
/*  86 */     this.gbc.fill = 1;
/*     */     
/*  88 */     this.gbc.gridx = 0;
/*  89 */     this.gbc.gridy = 0;
/*  90 */     this.gbc.gridwidth = 1;
/*  91 */     this.gbc.gridheight = 1;
/*  92 */     this.gbc.weightx = 0.2D;
/*  93 */     this.gbc.weighty = 1.0D;
/*  94 */     this.gbc.insets = new Insets(0, 0, 0, 0);
/*  95 */     add(tp, this.gbc);
/*     */     
/*  97 */     this.gbc.gridx = 1;
/*  98 */     this.gbc.gridy = 0;
/*  99 */     this.gbc.weightx = 0.8D;
/* 100 */     this.gbc.insets = new Insets(20, 0, 20, 20);
/* 101 */     add(tap, this.gbc);
/*     */   }
/*     */   
/*     */   public static void loadGroup() throws SQLException
/*     */   {
/* 106 */     TreePanel.loadGroup();
/* 107 */     TablePanel.loadSurvey();
/*     */   }
/*     */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\User_Management.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */