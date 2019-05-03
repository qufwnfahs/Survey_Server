/*    */ package Worker;
/*    */ 
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class RadomKey
/*    */ {
/*    */   public static String generateKey(long date)
/*    */   {
/* 11 */     Random oRandom = new Random();
/*    */     
/* 13 */     oRandom.setSeed(date);
/*    */     
/* 15 */     StringBuffer key = new StringBuffer();
/*    */     
/* 17 */     while (key.length() < 16)
/*    */     {
/*    */ 
/* 20 */       int iKey = Math.abs(oRandom.nextInt() % 74) + 48;
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 28 */       if (((iKey >= 48) && (iKey <= 57)) || ((iKey >= 65) && (iKey <= 90)) || (
/*    */       
/* 30 */         (iKey >= 97) && (iKey <= 122)))
/*    */       {
/* 32 */         key.append((char)iKey);
/*    */       }
/*    */     }
/* 35 */     return key.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Worker\RadomKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */