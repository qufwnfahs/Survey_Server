/*    */ package Model.Dialog.Survey_List.Question_Management;
/*    */ 
/*    */ import java.util.List;
/*    */ 
/*    */ public class Section
/*    */ {
/*    */   private String section_num;
/*    */   private String section_name;
/*    */   private String section_subName;
/*    */   private int sectionPoint;
/*    */   private List<Question> list_que;
/*    */   
/*    */   public String getNum()
/*    */   {
/* 15 */     return this.section_num;
/*    */   }
/*    */   
/*    */   public String getName()
/*    */   {
/* 20 */     return this.section_name;
/*    */   }
/*    */   
/*    */   public String getSubName()
/*    */   {
/* 25 */     return this.section_subName;
/*    */   }
/*    */   
/*    */   public int getPoint()
/*    */   {
/* 30 */     return this.sectionPoint;
/*    */   }
/*    */   
/*    */   public List<Question> getList()
/*    */   {
/* 35 */     return this.list_que;
/*    */   }
/*    */   
/*    */   public void setNum(String section_num)
/*    */   {
/* 40 */     this.section_num = section_num;
/*    */   }
/*    */   
/*    */   public void setName(String section_name)
/*    */   {
/* 45 */     this.section_name = section_name;
/*    */   }
/*    */   
/*    */   public void setSubName(String section_subName)
/*    */   {
/* 50 */     this.section_subName = section_subName;
/*    */   }
/*    */   
/*    */   public void setPoint(int sectionPoint)
/*    */   {
/* 55 */     this.sectionPoint = sectionPoint;
/*    */   }
/*    */   
/*    */   public void setList(List<Question> list_que)
/*    */   {
/* 60 */     this.list_que = list_que;
/*    */   }
/*    */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Question_Management\Section.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */