/*    */ package Model.Dialog.Survey_List.Question_Management;
/*    */ 
/*    */ import java.awt.Color;
/*    */ import java.awt.event.FocusEvent;
/*    */ import java.awt.event.FocusListener;
/*    */ import javax.swing.JTextArea;
/*    */ 
/*    */ public class HintTextArea
/*    */   extends JTextArea
/*    */   implements FocusListener
/*    */ {
/*    */   private final String hint;
/*    */   private boolean showingHint;
/*    */   private Color hintColor;
/*    */   
/*    */   public HintTextArea(String hint, Color hintColor)
/*    */   {
/* 18 */     super(hint);
/* 19 */     this.hint = hint;
/* 20 */     this.showingHint = true;
/* 21 */     this.hintColor = hintColor;
/* 22 */     super.setForeground(hintColor);
/* 23 */     super.addFocusListener(this);
/*    */   }
/*    */   
/*    */ 
/*    */   public void focusGained(FocusEvent e)
/*    */   {
/* 29 */     if (getText().isEmpty())
/*    */     {
/* 31 */       super.setText("");
/* 32 */       super.setForeground(Color.BLACK);
/* 33 */       this.showingHint = false;
/*    */     }
/*    */   }
/*    */   
/*    */ 
/*    */   public void focusLost(FocusEvent e)
/*    */   {
/* 40 */     if (getText().isEmpty())
/*    */     {
/* 42 */       super.setText(this.hint);
/* 43 */       super.setForeground(this.hintColor);
/* 44 */       this.showingHint = true;
/*    */     }
/*    */   }
/*    */   
/*    */ 
/*    */   public String getText()
/*    */   {
/* 51 */     return this.showingHint ? "" : super.getText();
/*    */   }
/*    */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Question_Management\HintTextArea.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */