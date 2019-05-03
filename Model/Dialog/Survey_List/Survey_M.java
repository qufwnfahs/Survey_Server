/*    */ package Model.Dialog.Survey_List;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ 
/*    */ 
/*    */ public class Survey_M
/*    */ {
/*  8 */   private ArrayList<Section_M> lt_sec = new ArrayList();
/*    */   private String str_MainColor;
/*    */   private String str_SubColor;
/*    */   
/*    */   public ArrayList<Section_M> getSection()
/*    */   {
/* 14 */     return this.lt_sec;
/*    */   }
/*    */   
/*    */   public String getMainColor()
/*    */   {
/* 19 */     return this.str_MainColor;
/*    */   }
/*    */   
/*    */   public String getSubColor()
/*    */   {
/* 24 */     return this.str_SubColor;
/*    */   }
/*    */   
/*    */   public void setSection(ArrayList<Section_M> lt_sec)
/*    */   {
/* 29 */     this.lt_sec = lt_sec;
/*    */   }
/*    */   
/*    */   public void setMainColor(String str_Maincolor)
/*    */   {
/* 34 */     this.str_MainColor = this.str_MainColor;
/*    */   }
/*    */   
/*    */   public void setSubColor(String str_SubColor)
/*    */   {
/* 39 */     this.str_SubColor = str_SubColor;
/*    */   }
/*    */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Survey_M.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */