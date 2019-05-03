/*    */ package Model.Dialog.Survey_List;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ 
/*    */ public class Module_Survey
/*    */ {
/*    */   private String name;
/*    */   private String idf_cd;
/*    */   private String start_dt;
/*    */   private String end_dt;
/*    */   private String mainColor;
/*    */   private String subColor;
/* 14 */   private List<Module_Section> lt_sec = new ArrayList();
/* 15 */   private boolean isHavePoint = false;
/*    */   
/* 17 */   public String getName() { return this.name; }
/* 18 */   public String getCode() { return this.idf_cd; }
/* 19 */   public String getStart() { return this.start_dt; }
/* 20 */   public String getEnd() { return this.end_dt; }
/* 21 */   public String getMainColor() { return this.mainColor; }
/* 22 */   public String getSubColor() { return this.subColor; }
/* 23 */   public List<Module_Section> getSection() { return this.lt_sec; }
/* 24 */   public boolean getHavePoint() { return this.isHavePoint; }
/*    */   
/* 26 */   public void setName(String name) { this.name = name; }
/* 27 */   public void setCode(String idf_cd) { this.idf_cd = idf_cd; }
/* 28 */   public void setStart(String start_dt) { this.start_dt = start_dt; }
/* 29 */   public void setEnd(String end_dt) { this.end_dt = end_dt; }
/* 30 */   public void setMainColor(String mainColor) { this.mainColor = mainColor; }
/* 31 */   public void setSubColor(String subColor) { this.subColor = subColor; }
/* 32 */   public void setSection(List<Module_Section> lt_sec) { this.lt_sec = lt_sec; }
/* 33 */   public void setHavePoint(boolean isHavePoint) { this.isHavePoint = isHavePoint; }
/*    */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Module_Survey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */