/*    */ package Model.Dialog.Survey_List;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ 
/*    */ public class Module_Section
/*    */ {
/*    */   private String name;
/*    */   private int point;
/* 10 */   private List<Module_Question> lt_que = new ArrayList();
/*    */   
/* 12 */   public String getName() { return this.name; }
/* 13 */   public int getPoint() { return this.point; }
/* 14 */   public List<Module_Question> getQuestion() { return this.lt_que; }
/*    */   
/* 16 */   public void setName(String name) { this.name = name; }
/* 17 */   public void setPoint(int point) { this.point = point; }
/* 18 */   public void setQuestion(List<Module_Question> lt_que) { this.lt_que = lt_que; }
/*    */   
/*    */ 
/*    */   public void setPointZeroInQuestion()
/*    */   {
/* 23 */     for (Module_Question mq : this.lt_que)
/*    */     {
/* 25 */       mq.setPointZero();
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Module_Section.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */