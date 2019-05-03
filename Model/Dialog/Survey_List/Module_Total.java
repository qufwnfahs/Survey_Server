/*    */ package Model.Dialog.Survey_List;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ 
/*    */ public class Module_Total
/*    */ {
/*    */   private String id;
/*  9 */   private List<Integer> lt_point = new ArrayList();
/*    */   private int total;
/* 11 */   private boolean isRED = false;
/*    */   
/* 13 */   public void setID(String id) { this.id = id; }
/* 14 */   public void setListPoint(List<Integer> lt_point) { this.lt_point = lt_point; }
/* 15 */   public void setTotal(int total) { this.total = total; }
/* 16 */   public void setRED(boolean isRED) { this.isRED = isRED; }
/*    */   
/* 18 */   public String getID() { return this.id; }
/* 19 */   public List<Integer> getListPoint() { return this.lt_point; }
/* 20 */   public int getTotal() { return this.total; }
/* 21 */   public boolean getRED() { return this.isRED; }
/*    */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Module_Total.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */