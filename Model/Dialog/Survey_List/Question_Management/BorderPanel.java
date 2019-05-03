/*    */ package Model.Dialog.Survey_List.Question_Management;
/*    */ 
/*    */ import Worker.PanelMover;
/*    */ import java.awt.BorderLayout;
/*    */ import java.awt.Color;
/*    */ import java.awt.Font;
/*    */ import javax.swing.JFrame;
/*    */ import javax.swing.JLabel;
/*    */ import javax.swing.JPanel;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BorderPanel
/*    */   extends JPanel
/*    */ {
/*    */   private ButtonPanel buttonPanel;
/*    */   private ButtonPanel_CloseOnly buttonPanel_CloseOnly;
/*    */   private PanelMover pm;
/*    */   private JLabel title;
/*    */   int pX;
/*    */   int pY;
/*    */   
/*    */   public BorderPanel(JFrame frame, int isMain)
/*    */   {
/* 28 */     this.buttonPanel = new ButtonPanel(frame, isMain);
/* 29 */     this.pm = new PanelMover(frame);
/*    */     
/* 31 */     this.title = new JLabel("  정다운마을 ");
/* 32 */     this.title.setForeground(new Color(165, 166, 167));
/* 33 */     this.title.setFont(new Font("1훈하얀고양이 R", 1, 28));
/*    */     
/* 35 */     setBackground(new Color(32, 34, 37));
/* 36 */     setLayout(new BorderLayout());
/*    */     
/* 38 */     add(this.title, "West");
/* 39 */     add(this.buttonPanel, "East");
/*    */     
/*    */ 
/* 42 */     addMouseListener(this.pm);
/* 43 */     addMouseMotionListener(this.pm);
/*    */   }
/*    */   
/*    */   public BorderPanel(JFrame frame, int isMain, int two)
/*    */   {
/* 48 */     this.buttonPanel_CloseOnly = new ButtonPanel_CloseOnly(frame, isMain);
/* 49 */     this.pm = new PanelMover(frame);
/*    */     
/* 51 */     this.title = new JLabel("  정다운마을 ");
/* 52 */     this.title.setForeground(new Color(165, 166, 167));
/* 53 */     this.title.setFont(new Font("1훈하얀고양이 R", 1, 28));
/*    */     
/* 55 */     setBackground(new Color(32, 34, 37));
/* 56 */     setLayout(new BorderLayout());
/*    */     
/* 58 */     add(this.title, "West");
/* 59 */     add(this.buttonPanel_CloseOnly, "East");
/*    */     
/*    */ 
/* 62 */     addMouseListener(this.pm);
/* 63 */     addMouseMotionListener(this.pm);
/*    */   }
/*    */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Question_Management\BorderPanel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */