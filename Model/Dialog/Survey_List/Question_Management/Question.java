/*    */ package Model.Dialog.Survey_List.Question_Management;
/*    */ 
/*    */ import java.util.List;
/*    */ 
/*    */ public class Question
/*    */ {
/*    */   private String type;
/*    */   private String question_num;
/*    */   private String question_name;
/*    */   private int questionPoint;
/*    */   private List<Option> list_opt;
/*    */   
/*    */   public String getType()
/*    */   {
/* 15 */     return this.type;
/*    */   }
/*    */   
/*    */   public String getNum()
/*    */   {
/* 20 */     return this.question_num;
/*    */   }
/*    */   
/*    */   public String getName()
/*    */   {
/* 25 */     return this.question_name;
/*    */   }
/*    */   
/*    */   public int getPoint()
/*    */   {
/* 30 */     return this.questionPoint;
/*    */   }
/*    */   
/*    */   public List<Option> getList()
/*    */   {
/* 35 */     return this.list_opt;
/*    */   }
/*    */   
/*    */   public void setType(String type)
/*    */   {
/* 40 */     this.type = type;
/*    */   }
/*    */   
/*    */   public void setNum(String question_num)
/*    */   {
/* 45 */     this.question_num = question_num;
/*    */   }
/*    */   
/*    */   public void setName(String question_name)
/*    */   {
/* 50 */     this.question_name = question_name;
/*    */   }
/*    */   
/*    */   public void setPoint(int questionPoint)
/*    */   {
/* 55 */     this.questionPoint = questionPoint;
/*    */   }
/*    */   
/*    */   public void setList(List<Option> list_opt)
/*    */   {
/* 60 */     this.list_opt = list_opt;
/*    */   }
/*    */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Question_Management\Question.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */