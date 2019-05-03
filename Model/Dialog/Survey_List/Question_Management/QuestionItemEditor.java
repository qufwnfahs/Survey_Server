/*    */ package Model.Dialog.Survey_List.Question_Management;
/*    */ 
/*    */ import Worker.ImageController;
/*    */ import java.awt.Color;
/*    */ import java.awt.Component;
/*    */ import java.awt.Font;
/*    */ import java.awt.GridBagConstraints;
/*    */ import java.awt.GridBagLayout;
/*    */ import java.awt.Insets;
/*    */ import javax.swing.BorderFactory;
/*    */ import javax.swing.ImageIcon;
/*    */ import javax.swing.JLabel;
/*    */ import javax.swing.JPanel;
/*    */ import javax.swing.plaf.basic.BasicComboBoxEditor;
/*    */ 
/*    */ 
/*    */ public class QuestionItemEditor
/*    */   extends BasicComboBoxEditor
/*    */ {
/* 20 */   private JPanel panel = new JPanel();
/* 21 */   private JLabel labelItem = new JLabel();
/*    */   
/* 23 */   private String[] selectedValue = new String[2];
/*    */   
/*    */   public QuestionItemEditor()
/*    */   {
/* 27 */     this.panel.setLayout(new GridBagLayout());
/*    */     
/* 29 */     GridBagConstraints gbc = new GridBagConstraints();
/* 30 */     gbc.fill = 2;
/* 31 */     gbc.weightx = 1.0D;
/* 32 */     gbc.insets = new Insets(2, 2, 2, 2);
/*    */     
/* 34 */     this.labelItem.setOpaque(false);
/* 35 */     this.labelItem.setHorizontalAlignment(2);
/* 36 */     this.labelItem.setForeground(new Color(41, 34, 75));
/* 37 */     this.labelItem.setFont(new Font("Sanserif", 1, 22));
/* 38 */     this.labelItem.setIconTextGap(15);
/* 39 */     this.labelItem.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
/*    */     
/* 41 */     this.panel.add(this.labelItem, gbc);
/* 42 */     this.panel.setBackground(new Color(245, 245, 245));
/*    */   }
/*    */   
/*    */   public Component getEditorComponent()
/*    */   {
/* 47 */     return this.panel;
/*    */   }
/*    */   
/*    */   public Object getItem()
/*    */   {
/* 52 */     return this.selectedValue;
/*    */   }
/*    */   
/*    */   public void setItem(Object item)
/*    */   {
/* 57 */     if (item == null)
/*    */     {
/* 59 */       return;
/*    */     }
/*    */     
/* 62 */     String[] items = (String[])item;
/* 63 */     this.selectedValue[0] = items[0];
/* 64 */     this.selectedValue[1] = items[1];
/* 65 */     this.labelItem.setText(this.selectedValue[0]);
/* 66 */     this.labelItem.setIcon(new ImageIcon(ImageController.resizeImage(new ImageIcon(getClass().getResource(items[1])), 38, 38)));
/*    */   }
/*    */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Question_Management\QuestionItemEditor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */