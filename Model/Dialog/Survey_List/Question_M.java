/*    */ package Model.Dialog.Survey_List;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ 
/*    */ public class Question_M
/*    */ {
/*  8 */   private List<Option_M> lt_opt = new ArrayList();
/*    */   private String str_name;
/*    */   private String str_point;
/*    */   private String type;
/*    */   private Object pl_sec;
/*    */   
/*    */   public List<Option_M> getOption()
/*    */   {
/* 16 */     return this.lt_opt;
/*    */   }
/*    */   
/*    */   public String getName()
/*    */   {
/* 21 */     return this.str_name;
/*    */   }
/*    */   
/*    */   public String getPoint()
/*    */   {
/* 26 */     return this.str_point;
/*    */   }
/*    */   
/*    */   public String getType()
/*    */   {
/* 31 */     return this.type;
/*    */   }
/*    */   
/*    */   public Object getObj()
/*    */   {
/* 36 */     return this.pl_sec;
/*    */   }
/*    */   
/*    */   public void setOption(List<Option_M> lt_opt)
/*    */   {
/* 41 */     this.lt_opt = lt_opt;
/*    */   }
/*    */   
/*    */   public void setName(String str_name)
/*    */   {
/* 46 */     this.str_name = str_name;
/*    */   }
/*    */   
/*    */   public void setPoint(String str_point)
/*    */   {
/* 51 */     this.str_point = str_point;
/*    */   }
/*    */   
/*    */   public void setType(String type)
/*    */   {
/* 56 */     this.type = type;
/*    */   }
/*    */   
/*    */   public void setObj(Object pl_sec)
/*    */   {
/* 61 */     this.pl_sec = pl_sec;
/*    */   }
/*    */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Question_M.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */