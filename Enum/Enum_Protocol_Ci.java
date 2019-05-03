/*    */ package Enum;
/*    */ 
/*    */ public enum Enum_Protocol_Ci
/*    */ {
/*  5 */   LOGIN("P001"), 
/*  6 */   LOGIN_FAIL("P001_FAIL"), 
/*  7 */   LOGIN_CONFIRM("P001_CONFIRM"), 
/*  8 */   LOGIN_PASSWORDISNOTMATCH("P001_PASSWORDISNOTMATCH"), 
/*  9 */   CHECK("P002"), 
/* 10 */   CHECK_FAIL("P002_FAIL"), 
/* 11 */   CHECK_CONFIRM("P002_CONFIRM"), 
/* 12 */   CHECK_PHONENUMBERISNOTMATCH("P002_NOTMATCH"), 
/* 13 */   GET_T001("P003"), 
/* 14 */   GET_T003_BYCODE("P004"), 
/* 15 */   PUSH_T010("P005"), 
/* 16 */   DISCONNECT("P006");
/*    */   
/*    */   private final String code;
/*    */   
/*    */   private Enum_Protocol_Ci(String code)
/*    */   {
/* 22 */     this.code = code;
/*    */   }
/*    */   
/*    */   public String getCode()
/*    */   {
/* 27 */     return this.code;
/*    */   }
/*    */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Enum\Enum_Protocol_Ci.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */