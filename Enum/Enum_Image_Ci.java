/*    */ package Enum;
/*    */ 
/*    */ import javax.swing.ImageIcon;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum Enum_Image_Ci
/*    */ {
/* 10 */   LABEL("/Image/outline_done_black_36dp.png"), 
/* 11 */   DONE("/Image/baseline_done_white_36dp.png"), 
/* 12 */   CHECKED("/Image/checkbox.png"), 
/* 13 */   UNCHECKED("/Image/checkboxOutline.png"), 
/* 14 */   NEXT("/Image/outline_keyboard_arrow_right_white_36dp.png"), 
/* 15 */   PREV("/Image/outline_keyboard_arrow_left_white_36dp.png"), 
/* 16 */   PALETTE("/Image/palette.png"), 
/* 17 */   ADD_QUESTION("/Image/addQuestion.png"), 
/* 18 */   ADD_SECTION("/Image/addSection.png"), 
/* 19 */   REMOVE("/Image/delete.png"), 
/* 20 */   CANCEL("/Image/baseline_clear_white_36dp.png"), 
/* 21 */   BUTTON_SEARCH_IMAGE_WHITE("/Image/outline_search_white_36dp.png"), 
/* 22 */   BUTTON_PREV_IMAGE_BLACK("/Image/sharp_keyboard_arrow_left_black_36dp.png"), 
/* 23 */   BUTTON_NEXT_IMAGE_BLACK("/Image/sharp_keyboard_arrow_right_black_36dp.png"), 
/* 24 */   BUTTON_ADD_IMAGE_WHITE("/Image/outline_add_white_18dp.png"), 
/* 25 */   FRAME_LOGIN_BACKGROUND("/Image/cris-tagupa-1095254-unsplash.jpg"), 
/* 26 */   BUTTON_SURVEY_IMAGE("/Image/baseline_assignment_white_36dp.png"), 
/* 27 */   BUTTON_PREV_IMAGE("/Image/sharp_keyboard_arrow_left_black_36dp.png"), 
/* 28 */   BUTTON_NEXT_IMAGE("/Image/sharp_keyboard_arrow_right_black_36dp.png"), 
/* 29 */   BUTTON_RADIO_UNSELECTED("/Image/round_radio_button_unchecked_black_18dp.png"), 
/* 30 */   BUTTON_RADIO_SELECTED("/Image/round_radio_button_checked_black_36dp.png"), 
/* 31 */   BUTTON_RADIO_SELECTED_GREEN("/Image/radiobutton-checked-hi.png"), 
/* 32 */   BUTTON_CHECKBOX_UNSELECTED("/Image/outline_check_box_outline_blank_black_18dp.png"), 
/* 33 */   BUTTON_CHECKBOX_SELECTED("/Image/baseline_check_box_black_18dp.png"), 
/* 34 */   BUTTON_CHECKBOX_SELECTED_GREEN("/Image/checkbox-check.png"), 
/* 35 */   BUTTON_NEXT_IMAGE_WHITE("/Image/outline_keyboard_arrow_right_white_36dp.png"), 
/* 36 */   BUTTON_PREV_IMAGE_WHITE("/Image/outline_keyboard_arrow_left_white_36dp.png"), 
/* 37 */   BUTTON_RENEW_IMAGE_WHITE("/Image/outline_autorenew_white_36dp.png"), 
/* 38 */   LABEL_IMAGE_BLACK("/Image/baseline_label_black_36dp.png"), 
/* 39 */   BUTTON_DROPDOWN("/Image/dropdown.png"), 
/* 40 */   BUTTON_EXCEL("/Image/md_5b33460f04516.png");
/*    */   
/*    */   private final ImageIcon imgIcon;
/*    */   
/*    */   private Enum_Image_Ci(String fileName)
/*    */   {
/* 46 */     this.imgIcon = new ImageIcon(getClass().getResource(fileName));
/*    */   }
/*    */   
/*    */   public ImageIcon getImageIcon()
/*    */   {
/* 51 */     return this.imgIcon;
/*    */   }
/*    */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Enum\Enum_Image_Ci.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */