/*    */ package Worker;
/*    */ 
/*    */ import java.awt.Image;
/*    */ import java.net.URL;
/*    */ import javax.swing.ImageIcon;
/*    */ 
/*    */ 
/*    */ public class ImageController
/*    */ {
/*    */   public static Image InsertImage(String imgName, int x, int y)
/*    */   {
/* 12 */     ImageIcon inst = new ImageIcon(imgName);
/*    */     
/* 14 */     Image origin = inst.getImage();
/* 15 */     Image changed = origin.getScaledInstance(x, y, 4);
/*    */     
/* 17 */     return changed;
/*    */   }
/*    */   
/*    */   public static Image resizeImage(ImageIcon img, int x, int y)
/*    */   {
/* 22 */     Image origin = img.getImage();
/* 23 */     Image changed = origin.getScaledInstance(x, y, 4);
/*    */     
/* 25 */     return changed;
/*    */   }
/*    */   
/*    */   public static Image resizeImageDirectly(URL url, int x, int y)
/*    */   {
/* 30 */     ImageIcon icon = new ImageIcon(url);
/*    */     
/* 32 */     Image origin = icon.getImage();
/* 33 */     Image changed = origin.getScaledInstance(x, y, 4);
/*    */     
/* 35 */     return changed;
/*    */   }
/*    */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Worker\ImageController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */