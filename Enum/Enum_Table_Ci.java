/*    */ package Enum;
/*    */ 
/*    */ public enum Enum_Table_Ci
/*    */ {
/*  5 */   T001("MOD_USER_TB"), 
/*  6 */   T002("MOD_GROUP_TB"), 
/*  7 */   T003("MOD_SVY_TB"), 
/*  8 */   T004("MOD_SVYGROUP_TB"), 
/*  9 */   T005("MOD_SVYSES_TB"), 
/* 10 */   T006("MOD_SVYQUE_TB"), 
/* 11 */   T007("MOD_SVYOPT_TB"), 
/* 12 */   T008("MOD_SVYINFO_TB"), 
/* 13 */   T009("MOD_SVYJSON_TB"), 
/* 14 */   T010("MOD_CLIENT_SVY_TB");
/*    */   
/*    */   private final String code;
/*    */   
/*    */   private Enum_Table_Ci(String code)
/*    */   {
/* 20 */     this.code = code;
/*    */   }
/*    */   
/*    */   public String getCode()
/*    */   {
/* 25 */     return this.code;
/*    */   }
/*    */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Enum\Enum_Table_Ci.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */