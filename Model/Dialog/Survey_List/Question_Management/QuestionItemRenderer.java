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
/*    */ import javax.swing.JList;
/*    */ import javax.swing.JPanel;
/*    */ import javax.swing.ListCellRenderer;
/*    */ 
/*    */ public class QuestionItemRenderer
/*    */   extends JPanel
/*    */   implements ListCellRenderer
/*    */ {
/* 21 */   private JLabel labelItem = new JLabel();
/*    */   
/*    */   public QuestionItemRenderer()
/*    */   {
/* 25 */     setLayout(new GridBagLayout());
/*    */     
/* 27 */     GridBagConstraints gbc = new GridBagConstraints();
/* 28 */     gbc.fill = 2;
/* 29 */     gbc.weightx = 1.0D;
/* 30 */     gbc.insets = new Insets(0, 0, 0, 0);
/* 31 */     gbc.ipady = 20;
/*    */     
/* 33 */     this.labelItem.setOpaque(true);
/* 34 */     this.labelItem.setHorizontalAlignment(2);
/* 35 */     this.labelItem.setFont(new Font("Sanserif", 1, 22));
/* 36 */     this.labelItem.setIconTextGap(15);
/* 37 */     this.labelItem.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
/*    */     
/* 39 */     add(this.labelItem, gbc);
/* 40 */     setBackground(Color.LIGHT_GRAY);
/*    */   }
/*    */   
/*    */ 
/*    */   public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus)
/*    */   {
/* 46 */     String[] item = (String[])value;
/*    */     
/* 48 */     this.labelItem.setText(item[0]);
/* 49 */     this.labelItem.setIcon(new ImageIcon(ImageController.resizeImage(new ImageIcon(getClass().getResource(item[1])), 38, 38)));
/*    */     
/* 51 */     if (isSelected)
/*    */     {
/* 53 */       this.labelItem.setBackground(new Color(238, 238, 238));
/* 54 */       this.labelItem.setForeground(new Color(59, 59, 59));
/*    */     }
/*    */     else
/*    */     {
/* 58 */       this.labelItem.setForeground(Color.BLACK);
/* 59 */       this.labelItem.setBackground(Color.WHITE);
/*    */     }
/*    */     
/* 62 */     return this;
/*    */   }
/*    */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Question_Management\QuestionItemRenderer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */