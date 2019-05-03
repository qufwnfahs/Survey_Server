/*    */ package Model.Dialog.Survey_List.Question_Management;
/*    */ 
/*    */ import java.awt.Color;
/*    */ import java.awt.Component;
/*    */ import java.awt.Font;
/*    */ import java.awt.GridBagConstraints;
/*    */ import java.awt.GridBagLayout;
/*    */ import java.awt.Insets;
/*    */ import javax.swing.BorderFactory;
/*    */ import javax.swing.JLabel;
/*    */ import javax.swing.JList;
/*    */ import javax.swing.JPanel;
/*    */ import javax.swing.ListCellRenderer;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class NumberItemRenderer
/*    */   extends JPanel
/*    */   implements ListCellRenderer
/*    */ {
/* 21 */   private JLabel labelItem = new JLabel();
/*    */   
/*    */   public NumberItemRenderer()
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
/* 35 */     this.labelItem.setFont(new Font("Sanserif", 0, 22));
/* 36 */     this.labelItem.setIconTextGap(15);
/* 37 */     this.labelItem.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
/*    */     
/* 39 */     add(this.labelItem, gbc);
/* 40 */     setBackground(new Color(245, 245, 245));
/*    */   }
/*    */   
/*    */ 
/*    */   public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus)
/*    */   {
/* 46 */     String item = (String)value;
/*    */     
/* 48 */     this.labelItem.setText(item);
/*    */     
/* 50 */     if (isSelected)
/*    */     {
/* 52 */       this.labelItem.setBackground(new Color(238, 238, 238));
/* 53 */       this.labelItem.setForeground(new Color(59, 59, 59));
/*    */     }
/*    */     else
/*    */     {
/* 57 */       this.labelItem.setForeground(Color.BLACK);
/* 58 */       this.labelItem.setBackground(Color.WHITE);
/*    */     }
/*    */     
/* 61 */     return this;
/*    */   }
/*    */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Question_Management\NumberItemRenderer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */