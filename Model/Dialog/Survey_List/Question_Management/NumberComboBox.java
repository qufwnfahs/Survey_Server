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
/*    */ public class NumberComboBox
/*    */   extends JComboBox
/*    */ {
/*    */   private DefaultComboBoxModel model;
/* 15 */   private String[] questionList = { "1" };
/* 16 */   private String[] questionList2 = { "2", "3", "4", "5", "6", "7", "8", "9", "10" };
/*    */   
/*    */   public NumberComboBox()
/*    */   {
/* 20 */     this.model = new DefaultComboBoxModel();
/* 21 */     setModel(this.model);
/* 22 */     setRenderer(new NumberItemRenderer());
/* 23 */     setEditor(new NumberItemEditor());
/*    */     
/* 25 */     setEditable(true);
/*    */   }
/*    */   
/*    */   public void addItems(String[] items) {
/*    */     String[] arrayOfString;
/* 30 */     int j = (arrayOfString = items).length; for (int i = 0; i < j; i++) { String anItem = arrayOfString[i];
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
/* 45 */     return new Dimension(70, 50);
/*    */   }
/*    */   
/*    */   public void addItemList(int index)
/*    */   {
/* 50 */     if (index == 1)
/*    */     {
/* 52 */       addItems(this.questionList);
/*    */     }
/*    */     else
/*    */     {
/* 56 */       addItems(this.questionList2);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Question_Management\NumberComboBox.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */