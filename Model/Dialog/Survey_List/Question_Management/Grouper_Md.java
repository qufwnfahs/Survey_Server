/*    */ package Model.Dialog.Survey_List.Question_Management;
/*    */ 
/*    */ import java.util.List;
/*    */ 
/*    */ public class Grouper_Md
/*    */ {
/*    */   private String group_name;
/*    */   private List<Person> list_person;
/*    */   
/*    */   public String getName()
/*    */   {
/* 12 */     return this.group_name;
/*    */   }
/*    */   
/*    */   public List<Person> getPerson()
/*    */   {
/* 17 */     return this.list_person;
/*    */   }
/*    */   
/*    */   public void setName(String group_name)
/*    */   {
/* 22 */     this.group_name = group_name;
/*    */   }
/*    */   
/*    */   public void setPerson(List<Person> list_person)
/*    */   {
/* 27 */     this.list_person = list_person;
/*    */   }
/*    */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Question_Management\Grouper_Md.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */