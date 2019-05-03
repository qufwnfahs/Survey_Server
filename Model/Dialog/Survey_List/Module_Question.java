/*    */ package Model.Dialog.Survey_List;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ 
/*    */ public class Module_Question
/*    */ {
/*    */   private String name;
/*    */   private String type;
/*    */   private int point;
/* 11 */   private List<Module_Option> lt_opt = new ArrayList();
/*    */   
/* 13 */   public String getName() { return this.name; }
/* 14 */   public String getType() { return this.type; }
/* 15 */   public int getPoint() { return this.point; }
/* 16 */   public List<Module_Option> getOption() { return this.lt_opt; }
/*    */   
/* 18 */   public void setName(String name) { this.name = name; }
/* 19 */   public void setType(String type) { this.type = type; }
/* 20 */   public void setPoint(int point) { this.point = point; }
/* 21 */   public void setOption(List<Module_Option> lt_opt) { this.lt_opt = lt_opt; }
/*    */   
/*    */ 
/*    */   public void setPointZero()
/*    */   {
/* 26 */     this.point = 0;
/*    */     
/* 28 */     for (Module_Option mo : this.lt_opt)
/*    */     {
/* 30 */       mo.setPointZero();
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Module_Question.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */