/*    */ package Model.Dialog.Survey_List;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ 
/*    */ public class Module_Option
/*    */ {
/*    */   private String number;
/*    */   private String name;
/*    */   private int point;
/*    */   private boolean isANSWER;
/* 12 */   private List<Integer> target = new ArrayList();
/*    */   
/* 14 */   public String getNumber() { return this.number; }
/* 15 */   public String getName() { return this.name; }
/* 16 */   public int getPoint() { return this.point; }
/* 17 */   public boolean getAnswer() { return this.isANSWER; }
/* 18 */   public List<Integer> getTarget() { return this.target; }
/*    */   
/* 20 */   public void setNumber(String number) { this.number = number; }
/* 21 */   public void setName(String name) { this.name = name; }
/* 22 */   public void setPoint(int point) { this.point = point; }
/* 23 */   public void setAnswer(boolean isANSWER) { this.isANSWER = isANSWER; }
/* 24 */   public void setTarget(List<Integer> j) { this.target = j; }
/*    */   
/*    */ 
/*    */   public void setPointZero()
/*    */   {
/* 29 */     this.point = 0;
/*    */   }
/*    */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Module_Option.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */