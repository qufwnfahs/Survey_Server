/*    */ package Model.Dialog.Survey_List.Question_Management;
/*    */ 
/*    */ import java.awt.Dimension;
/*    */ import java.awt.Graphics;
/*    */ import javax.swing.DefaultComboBoxModel;
/*    */ import javax.swing.JComboBox;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class QuestionComboBox
/*    */   extends JComboBox
/*    */ {
/*    */   private DefaultComboBoxModel model;
/* 15 */   private String[][] questionList = { { "장문형", "/Image/openended.png" }, { "객관식 질문", "/Image/radiobutton.png" }, { "체크박스", "/Image/checkbox.png" }, { "드롭다운", "/Image/dropdown.png" }, { "직선 단계", "/Image/linearscale.png" }, { "객관식 그리드", "/Image/apps.png" }, { "체크박스 그리드", "/Image/apps.png" } };
/*    */   
/*    */   public QuestionComboBox()
/*    */   {
/* 19 */     this.model = new DefaultComboBoxModel();
/* 20 */     setModel(this.model);
/* 21 */     setRenderer(new QuestionItemRenderer());
/* 22 */     setEditor(new QuestionItemEditor());
/*    */     
/* 24 */     setEditable(true);
/* 25 */     addItems(this.questionList);
/*    */   }
/*    */   
/*    */   public void addItems(String[][] items) {
/*    */     String[][] arrayOfString;
/* 30 */     int j = (arrayOfString = items).length; for (int i = 0; i < j; i++) { String[] anItem = arrayOfString[i];
/*    */       
/* 32 */       this.model.addElement(anItem);
/*    */     }
/*    */   }
/*    */   
/*    */ 
/*    */   public void paintComponent(Graphics g)
/*    */   {
/* 39 */     super.paintComponent(g);
/*    */   }
/*    */   
/*    */ 
/*    */   public Dimension getPreferredSize()
/*    */   {
/* 45 */     return new Dimension(280, 70);
/*    */   }
/*    */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Question_Management\QuestionComboBox.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */