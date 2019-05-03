/*    */ package Model.Dialog.Survey_List;
/*    */ 
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ 
/*    */ public class Module_Client_Question
/*    */ {
/*    */   private String type;
/*  9 */   private Map<String, String> answer = new HashMap();
/*    */   private int point;
/* 11 */   private boolean isCHECKED = false;
/*    */   
/* 13 */   public Map<String, String> getAnswer() { return this.answer; }
/* 14 */   public String getType() { return this.type; }
/* 15 */   public int getPoint() { return this.point; }
/* 16 */   public boolean getChecked() { return this.isCHECKED; }
/*    */   
/* 18 */   public void setAnswer(Map<String, String> answer) { this.answer = answer; }
/* 19 */   public void setType(String type) { this.type = type; }
/* 20 */   public void setPoint(int point) { this.point = point; }
/* 21 */   public void setChecked(boolean isCHECKED) { this.isCHECKED = isCHECKED; }
/*    */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Module_Client_Question.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */