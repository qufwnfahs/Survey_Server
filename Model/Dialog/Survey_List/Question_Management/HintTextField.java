/*    */ package Model.Dialog.Survey_List.Question_Management;
/*    */ 
/*    */ import java.awt.Color;
/*    */ import java.awt.event.FocusEvent;
/*    */ import java.awt.event.FocusListener;
/*    */ import javax.swing.JTextField;
/*    */ 
/*    */ 
/*    */ public class HintTextField
/*    */   extends JTextField
/*    */   implements FocusListener
/*    */ {
/*    */   private final String hint;
/*    */   private boolean showingHint;
/*    */   private Color hintColor;
/*    */   
/*    */   public HintTextField(String hint, Color hintColor)
/*    */   {
/* 19 */     super(hint);
/* 20 */     this.hint = hint;
/* 21 */     this.showingHint = true;
/* 22 */     this.hintColor = hintColor;
/* 23 */     super.setForeground(hintColor);
/* 24 */     super.addFocusListener(this);
/*    */   }
/*    */   
/*    */   public HintTextField(String hint)
/*    */   {
/* 29 */     super(hint);
/* 30 */     this.hint = hint;
/* 31 */     this.showingHint = true;
/* 32 */     this.hintColor = Color.BLACK;
/* 33 */     super.addFocusListener(this);
/*    */   }
/*    */   
/*    */ 
/*    */   public void focusGained(FocusEvent e)
/*    */   {
/* 39 */     if (getText().isEmpty())
/*    */     {
/* 41 */       super.setText("");
/* 42 */       super.setForeground(Color.BLACK);
/* 43 */       this.showingHint = false;
/*    */     }
/*    */   }
/*    */   
/*    */ 
/*    */   public void focusLost(FocusEvent e)
/*    */   {
/* 50 */     if (getText().isEmpty())
/*    */     {
/* 52 */       super.setText(this.hint);
/* 53 */       super.setForeground(this.hintColor);
/* 54 */       this.showingHint = true;
/*    */     }
/*    */   }
/*    */   
/*    */ 
/*    */   public String getText()
/*    */   {
/* 61 */     return this.showingHint ? "" : super.getText();
/*    */   }
/*    */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Question_Management\HintTextField.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */