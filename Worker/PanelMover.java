/*    */ package Worker;
/*    */ 
/*    */ import java.awt.Point;
/*    */ import java.awt.event.MouseEvent;
/*    */ import java.awt.event.MouseListener;
/*    */ import java.awt.event.MouseMotionListener;
/*    */ import javax.swing.JFrame;
/*    */ 
/*    */ public class PanelMover
/*    */   implements MouseListener, MouseMotionListener
/*    */ {
/*    */   private final JFrame component;
/*    */   private int pX;
/*    */   private int pY;
/*    */   
/*    */   public PanelMover(JFrame component)
/*    */   {
/* 18 */     this.component = component;
/*    */   }
/*    */   
/*    */ 
/*    */   public void mouseDragged(MouseEvent e)
/*    */   {
/* 24 */     this.component.setLocation(this.component.getLocation().x + e.getX() - this.pX, this.component.getLocation().y + e.getY() - this.pY);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public void mouseMoved(MouseEvent e) {}
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public void mouseClicked(MouseEvent e) {}
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public void mouseEntered(MouseEvent e) {}
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public void mouseExited(MouseEvent e) {}
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public void mousePressed(MouseEvent e)
/*    */   {
/* 54 */     this.pX = e.getX();
/* 55 */     this.pY = e.getY();
/*    */   }
/*    */   
/*    */   public void mouseReleased(MouseEvent e) {}
/*    */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Worker\PanelMover.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */