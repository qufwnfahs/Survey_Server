/*    */ package Model.Dialog.Survey_List;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ 
/*    */ public class Section_M
/*    */ {
/*  8 */   private List<Question_M> lt_que = new ArrayList();
/*    */   private String str_name;
/*    */   private String str_point;
/*    */   private Object pl_sec;
/*    */   
/*    */   public List<Question_M> getQuestion()
/*    */   {
/* 15 */     return this.lt_que;
/*    */   }
/*    */   
/*    */   public String getName()
/*    */   {
/* 20 */     return this.str_name;
/*    */   }
/*    */   
/*    */   public String getPoint()
/*    */   {
/* 25 */     return this.str_point;
/*    */   }
/*    */   
/*    */   public Object getObj()
/*    */   {
/* 30 */     return this.pl_sec;
/*    */   }
/*    */   
/*    */   public void setQuestion(List<Question_M> lt_que)
/*    */   {
/* 35 */     this.lt_que = lt_que;
/*    */   }
/*    */   
/*    */   public void setName(String str_name)
/*    */   {
/* 40 */     this.str_name = str_name;
/*    */   }
/*    */   
/*    */   public void setPoint(String str_point)
/*    */   {
/* 45 */     this.str_point = str_point;
/*    */   }
/*    */   
/*    */   public void setObj(Object pl_sec)
/*    */   {
/* 50 */     this.pl_sec = pl_sec;
/*    */   }
/*    */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Section_M.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */