/*    */ package Model.Dialog.Survey_List.Question_Management;
/*    */ 
/*    */ import java.awt.Color;
/*    */ import java.awt.Cursor;
/*    */ import java.awt.FlowLayout;
/*    */ import java.awt.Font;
/*    */ import java.awt.event.MouseAdapter;
/*    */ import java.awt.event.MouseEvent;
/*    */ import javax.swing.JFrame;
/*    */ import javax.swing.JLabel;
/*    */ import javax.swing.JPanel;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ButtonPanel_CloseOnly
/*    */   extends JPanel
/*    */ {
/*    */   private JLabel close;
/* 20 */   private boolean isMaximized = false;
/*    */   
/*    */   private final JFrame frame;
/*    */   
/*    */   private int isMain;
/*    */   
/*    */   public ButtonPanel_CloseOnly(final JFrame frame, final int isMain)
/*    */   {
/* 28 */     this.frame = frame;
/* 29 */     this.isMain = isMain;
/*    */     
/* 31 */     this.close = new JLabel(" X ");
/* 32 */     this.close.setFont(new Font("Sanserif", 0, 25));
/* 33 */     this.close.setOpaque(true);
/* 34 */     this.close.setBackground(new Color(32, 34, 37));
/* 35 */     this.close.setForeground(new Color(165, 166, 167));
/* 36 */     this.close.setCursor(new Cursor(12));
/*    */     
/* 38 */     setLayout(new FlowLayout(2));
/* 39 */     setBackground(new Color(32, 34, 37));
/*    */     
/* 41 */     add(this.close);
/*    */     
/* 43 */     this.close.addMouseListener(new MouseAdapter() {
/*    */       public void mouseEntered(MouseEvent e) {
/* 45 */         ButtonPanel_CloseOnly.this.close.setBackground(new Color(240, 71, 71));
/* 46 */         ButtonPanel_CloseOnly.this.close.setForeground(Color.white);
/*    */       }
/*    */       
/*    */       public void mouseExited(MouseEvent e) {
/* 50 */         ButtonPanel_CloseOnly.this.close.setBackground(new Color(32, 34, 37));
/* 51 */         ButtonPanel_CloseOnly.this.close.setForeground(new Color(165, 166, 167));
/*    */       }
/*    */       
/*    */       public void mouseReleased(MouseEvent e)
/*    */       {
/* 56 */         if (isMain == 1)
/*    */         {
/* 58 */           System.exit(0);
/*    */         }
/*    */         else
/*    */         {
/* 62 */           frame.dispose();
/*    */         }
/*    */       }
/*    */     });
/*    */   }
/*    */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Question_Management\ButtonPanel_CloseOnly.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */