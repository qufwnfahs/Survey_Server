/*    */ package Model.Dialog.Survey_List;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ 
/*    */ public class Module_Client_Section
/*    */ {
/*  8 */   public List<Module_Client_Question> M_C_Q = new ArrayList();
/*    */   public int point;
/*    */   
/* 11 */   public List<Module_Client_Question> getQuestion() { return this.M_C_Q; }
/* 12 */   public int getPoint() { return this.point; }
/*    */   
/* 14 */   public void setQuestion(List<Module_Client_Question> M_C_Q) { this.M_C_Q = M_C_Q; }
/* 15 */   public void setPoint(int point) { this.point = point; }
/*    */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Module_Client_Section.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */