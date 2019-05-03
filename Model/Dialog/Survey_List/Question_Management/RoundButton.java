/*    */ package Model.Dialog.Survey_List.Question_Management;
/*    */ 
/*    */ import java.awt.Color;
/*    */ import java.awt.Cursor;
/*    */ import java.awt.Dimension;
/*    */ import java.awt.Graphics;
/*    */ import javax.swing.JButton;
/*    */ 
/*    */ 
/*    */ public class RoundButton
/*    */   extends JButton
/*    */ {
/*    */   public int cX;
/*    */   public int cY;
/*    */   public int cZ;
/*    */   private Color mainColor;
/*    */   private Color subColor;
/*    */   private Color ownMainColor;
/*    */   private Color ownSubColor;
/*    */   
/*    */   public RoundButton(int cX, int cY, int cZ)
/*    */   {
/* 23 */     this.cX = cX;
/* 24 */     this.cY = cY;
/* 25 */     this.cZ = cZ;
/*    */     
/* 27 */     this.mainColor = new Color(cX, cY, cZ);
/* 28 */     this.ownMainColor = this.mainColor;
/*    */     
/* 30 */     setFocusPainted(false);
/* 31 */     setBorder(null);
/* 32 */     setContentAreaFilled(false);
/* 33 */     setCursor(new Cursor(12));
/*    */   }
/*    */   
/*    */   public RoundButton(Color mainColor)
/*    */   {
/* 38 */     this.mainColor = mainColor;
/* 39 */     this.ownMainColor = mainColor;
/*    */   }
/*    */   
/*    */   public RoundButton(Color mainColor, Color subColor)
/*    */   {
/* 44 */     this.mainColor = mainColor;
/* 45 */     this.subColor = subColor;
/*    */     
/* 47 */     this.ownMainColor = mainColor;
/* 48 */     this.ownSubColor = subColor;
/*    */   }
/*    */   
/*    */   public void getDark()
/*    */   {
/* 53 */     this.mainColor = this.mainColor.darker();
/*    */   }
/*    */   
/*    */   public void getBright()
/*    */   {
/* 58 */     this.mainColor = this.ownMainColor;
/*    */   }
/*    */   
/*    */   public Color getMain()
/*    */   {
/* 63 */     return this.ownMainColor;
/*    */   }
/*    */   
/*    */   public Color getSub()
/*    */   {
/* 68 */     return this.ownSubColor;
/*    */   }
/*    */   
/*    */   public void setMain(Color mainColor)
/*    */   {
/* 73 */     this.mainColor = mainColor;
/* 74 */     this.ownMainColor = mainColor;
/*    */   }
/*    */   
/*    */ 
/*    */   protected void paintComponent(Graphics g)
/*    */   {
/* 80 */     g.setColor(this.mainColor);
/*    */     
/* 82 */     g.fillOval(0, 0, getSize().width - 1, getSize().height - 1);
/*    */     
/*    */ 
/*    */ 
/* 86 */     super.paintComponent(g);
/*    */   }
/*    */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Question_Management\RoundButton.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */