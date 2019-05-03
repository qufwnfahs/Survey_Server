/*    */ package Model.Dialog.Survey_List.Question_Management;
/*    */ 
/*    */ import Worker.ImageController;
/*    */ import java.awt.Color;
/*    */ import java.awt.Cursor;
/*    */ import java.awt.Font;
/*    */ import java.awt.Image;
/*    */ import javax.swing.BorderFactory;
/*    */ import javax.swing.ImageIcon;
/*    */ import javax.swing.JLabel;
/*    */ import javax.swing.JPanel;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class PointLabelPanel
/*    */   extends JPanel
/*    */ {
/*    */   private Image imgPoint;
/*    */   public JLabel lblPoint;
/*    */   
/*    */   public PointLabelPanel()
/*    */   {
/* 24 */     setBackground(Color.WHITE);
/*    */     
/* 26 */     this.imgPoint = ImageController.resizeImage(new ImageIcon(getClass().getResource("/Image/setting.png")), 38, 38);
/*    */     
/* 28 */     this.lblPoint = new JLabel("점수 설정");
/* 29 */     this.lblPoint.setIcon(new ImageIcon(this.imgPoint));
/* 30 */     this.lblPoint.setOpaque(false);
/* 31 */     this.lblPoint.setHorizontalAlignment(2);
/* 32 */     this.lblPoint.setForeground(new Color(41, 34, 75));
/* 33 */     this.lblPoint.setFont(new Font("Sanserif", 1, 22));
/* 34 */     this.lblPoint.setIconTextGap(30);
/* 35 */     this.lblPoint.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 10));
/* 36 */     this.lblPoint.setCursor(new Cursor(12));
/*    */     
/* 38 */     add(this.lblPoint, "North");
/*    */   }
/*    */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Question_Management\PointLabelPanel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */