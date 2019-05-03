/*    */ package Model.Dialog.Survey_List;
/*    */ 
/*    */ import java.awt.BorderLayout;
/*    */ import java.awt.Color;
/*    */ import java.util.List;
/*    */ import javax.swing.BorderFactory;
/*    */ import javax.swing.JPanel;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Question_Pl
/*    */   extends JPanel
/*    */ {
/*    */   private Question_Custom_Pl custom;
/*    */   private Question_Bottom_Pl bottom;
/*    */   private Question_Add_Pl question_Add;
/*    */   
/*    */   public Question_Pl(Question_Add_Pl question_Add)
/*    */   {
/* 35 */     this.question_Add = question_Add;
/*    */     
/*    */ 
/* 38 */     setLayout(new BorderLayout());
/* 39 */     setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(224, 224, 224)));
/*    */     
/* 41 */     this.custom = new Question_Custom_Pl(question_Add);
/* 42 */     this.bottom = new Question_Bottom_Pl(question_Add, this);
/*    */     
/* 44 */     add(this.custom, "Center");
/* 45 */     add(this.bottom, "South");
/*    */   }
/*    */   
/*    */   public void setName(String name)
/*    */   {
/* 50 */     this.custom.setName(name);
/*    */   }
/*    */   
/*    */   public void setCurr(String type)
/*    */   {
/* 55 */     this.custom.setCurr(type);
/*    */   }
/*    */   
/*    */   public String getName()
/*    */   {
/* 60 */     return this.custom.getName();
/*    */   }
/*    */   
/*    */   public String getType()
/*    */   {
/* 65 */     return this.custom.getType();
/*    */   }
/*    */   
/*    */   public List<Module_Option> getOption()
/*    */   {
/* 70 */     return this.custom.getOption();
/*    */   }
/*    */   
/*    */   public void setOption(List<Module_Option> option)
/*    */   {
/* 75 */     this.custom.setOption(option);
/*    */   }
/*    */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Question_Pl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */