/*    */ package Model.Dialog.Survey_List.Question_Management;
/*    */ 
/*    */ public class Option
/*    */ {
/*    */   private String option_num;
/*    */   private String option_name;
/*    */   private int optionPoint;
/*    */   private boolean isANSWER;
/*    */   
/*    */   public String getNum()
/*    */   {
/* 12 */     return this.option_num;
/*    */   }
/*    */   
/*    */   public String getName()
/*    */   {
/* 17 */     return this.option_name;
/*    */   }
/*    */   
/*    */   public int getPoint()
/*    */   {
/* 22 */     return this.optionPoint;
/*    */   }
/*    */   
/*    */   public boolean getAnswer()
/*    */   {
/* 27 */     return this.isANSWER;
/*    */   }
/*    */   
/*    */   public void setNum(String option_num)
/*    */   {
/* 32 */     this.option_num = option_num;
/*    */   }
/*    */   
/*    */   public void setName(String option_name)
/*    */   {
/* 37 */     this.option_name = option_name;
/*    */   }
/*    */   
/*    */   public void setPoint(int optionPoint)
/*    */   {
/* 42 */     this.optionPoint = optionPoint;
/*    */   }
/*    */   
/*    */   public void setAnswer(boolean isANSWER)
/*    */   {
/* 47 */     this.isANSWER = isANSWER;
/*    */   }
/*    */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Question_Management\Option.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */