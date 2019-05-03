/*    */ package Worker;
/*    */ 
/*    */ import java.text.ParseException;
/*    */ import java.text.SimpleDateFormat;
/*    */ import java.util.Calendar;
/*    */ import javax.swing.JFormattedTextField.AbstractFormatter;
/*    */ 
/*    */ 
/*    */ public class DateLabelFormatter
/*    */   extends JFormattedTextField.AbstractFormatter
/*    */ {
/* 12 */   private String datePattern = "yyyy-MM-dd";
/* 13 */   private SimpleDateFormat dateFormatter = new SimpleDateFormat(this.datePattern);
/*    */   
/*    */   public Object stringToValue(String text)
/*    */     throws ParseException
/*    */   {
/* 18 */     return this.dateFormatter.parseObject(text);
/*    */   }
/*    */   
/*    */   public String valueToString(Object value)
/*    */     throws ParseException
/*    */   {
/* 24 */     if (value != null)
/*    */     {
/* 26 */       Calendar cal = (Calendar)value;
/* 27 */       return this.dateFormatter.format(cal.getTime());
/*    */     }
/*    */     
/* 30 */     return "";
/*    */   }
/*    */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Worker\DateLabelFormatter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */