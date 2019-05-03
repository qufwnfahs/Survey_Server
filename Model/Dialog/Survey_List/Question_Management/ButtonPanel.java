/*     */ package Model.Dialog.Survey_List.Question_Management;
/*     */ 
/*     */ import java.awt.Color;
/*     */ import java.awt.Cursor;
/*     */ import java.awt.FlowLayout;
/*     */ import java.awt.Font;
/*     */ import java.awt.GraphicsEnvironment;
/*     */ import java.awt.event.MouseAdapter;
/*     */ import java.awt.event.MouseEvent;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ButtonPanel
/*     */   extends JPanel
/*     */ {
/*     */   private JLabel close;
/*     */   private JLabel maximize;
/*     */   private JLabel minimization;
/*  22 */   private boolean isMaximized = false;
/*     */   
/*     */   private final JFrame frame;
/*     */   
/*     */   private int isMain;
/*     */   
/*     */   public ButtonPanel(final JFrame frame, final int isMain)
/*     */   {
/*  30 */     this.frame = frame;
/*  31 */     this.isMain = isMain;
/*     */     
/*  33 */     this.close = new JLabel(" X ");
/*  34 */     this.close.setFont(new Font("Sanserif", 0, 25));
/*  35 */     this.close.setOpaque(true);
/*  36 */     this.close.setBackground(new Color(32, 34, 37));
/*  37 */     this.close.setForeground(new Color(165, 166, 167));
/*  38 */     this.close.setCursor(new Cursor(12));
/*     */     
/*  40 */     this.maximize = new JLabel(" □ ");
/*  41 */     this.maximize.setFont(new Font("Sanserif", 0, 25));
/*  42 */     this.maximize.setOpaque(true);
/*  43 */     this.maximize.setBackground(new Color(32, 34, 37));
/*  44 */     this.maximize.setForeground(new Color(165, 166, 167));
/*  45 */     this.maximize.setCursor(new Cursor(12));
/*     */     
/*  47 */     this.minimization = new JLabel(" ㅡ ");
/*  48 */     this.minimization.setFont(new Font("Sanserif", 0, 25));
/*  49 */     this.minimization.setOpaque(true);
/*  50 */     this.minimization.setBackground(new Color(32, 34, 37));
/*  51 */     this.minimization.setForeground(new Color(165, 166, 167));
/*  52 */     this.minimization.setCursor(new Cursor(12));
/*     */     
/*  54 */     setLayout(new FlowLayout(2));
/*  55 */     setBackground(new Color(32, 34, 37));
/*     */     
/*  57 */     add(this.minimization);
/*  58 */     add(this.maximize);
/*  59 */     add(this.close);
/*     */     
/*  61 */     this.minimization.addMouseListener(new MouseAdapter() {
/*     */       public void mouseEntered(MouseEvent e) {
/*  63 */         ButtonPanel.this.minimization.setBackground(new Color(43, 44, 47));
/*  64 */         ButtonPanel.this.minimization.setForeground(Color.white);
/*     */       }
/*     */       
/*     */       public void mouseExited(MouseEvent e) {
/*  68 */         ButtonPanel.this.minimization.setBackground(new Color(32, 34, 37));
/*  69 */         ButtonPanel.this.minimization.setForeground(new Color(165, 166, 167));
/*     */       }
/*     */       
/*     */       public void mouseReleased(MouseEvent e) {
/*  73 */         frame.setState(1);
/*     */       }
/*     */       
/*  76 */     });
/*  77 */     this.maximize.addMouseListener(new MouseAdapter() {
/*     */       public void mouseEntered(MouseEvent e) {
/*  79 */         ButtonPanel.this.maximize.setBackground(new Color(43, 44, 47));
/*  80 */         ButtonPanel.this.maximize.setForeground(Color.white);
/*     */       }
/*     */       
/*     */       public void mouseExited(MouseEvent e) {
/*  84 */         ButtonPanel.this.maximize.setBackground(new Color(32, 34, 37));
/*  85 */         ButtonPanel.this.maximize.setForeground(new Color(165, 166, 167));
/*     */       }
/*     */       
/*     */       public void mouseReleased(MouseEvent e) {
/*  89 */         GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 106 */     });
/* 107 */     this.close.addMouseListener(new MouseAdapter() {
/*     */       public void mouseEntered(MouseEvent e) {
/* 109 */         ButtonPanel.this.close.setBackground(new Color(240, 71, 71));
/* 110 */         ButtonPanel.this.close.setForeground(Color.white);
/*     */       }
/*     */       
/*     */       public void mouseExited(MouseEvent e) {
/* 114 */         ButtonPanel.this.close.setBackground(new Color(32, 34, 37));
/* 115 */         ButtonPanel.this.close.setForeground(new Color(165, 166, 167));
/*     */       }
/*     */       
/*     */       public void mouseReleased(MouseEvent e)
/*     */       {
/* 120 */         if (isMain == 1)
/*     */         {
/* 122 */           System.exit(0);
/*     */         }
/*     */         else
/*     */         {
/* 126 */           frame.dispose();
/*     */         }
/*     */       }
/*     */     });
/*     */   }
/*     */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Question_Management\ButtonPanel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */