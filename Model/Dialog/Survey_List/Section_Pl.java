/*    */ package Model.Dialog.Survey_List;
/*    */ 
/*    */ import Enum.Enum_Color_Ci;
/*    */ import Enum.Enum_Font_Ci;
/*    */ import java.awt.Color;
/*    */ import java.awt.Dimension;
/*    */ import java.awt.GridBagConstraints;
/*    */ import java.awt.GridBagLayout;
/*    */ import java.awt.Insets;
/*    */ import javax.swing.BorderFactory;
/*    */ import javax.swing.JLabel;
/*    */ import javax.swing.JPanel;
/*    */ import javax.swing.JTextField;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Section_Pl
/*    */   extends JPanel
/*    */ {
/* 21 */   private GridBagLayout gbl = new GridBagLayout();
/* 22 */   private GridBagConstraints gbc = new GridBagConstraints();
/*    */   
/*    */ 
/* 25 */   private JLabel ll_no = new JLabel();
/* 26 */   private JTextField tf_name = new JTextField();
/*    */   
/* 28 */   private Color mainColor = Enum_Color_Ci._673AB7.getColor();
/*    */   
/*    */   public Section_Pl(Color mainColor)
/*    */   {
/* 32 */     this.mainColor = mainColor;
/*    */     
/*    */ 
/* 35 */     setLayout(this.gbl);
/* 36 */     setMinimumSize(new Dimension(1084, 300));
/* 37 */     setPreferredSize(new Dimension(1084, 300));
/* 38 */     setMaximumSize(new Dimension(1084, 300));
/* 39 */     setBackground(Color.WHITE);
/* 40 */     setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(224, 224, 224)));
/*    */     
/*    */ 
/* 43 */     this.ll_no.setOpaque(true);
/* 44 */     this.ll_no.setBackground(mainColor);
/* 45 */     this.ll_no.setForeground(Color.WHITE);
/* 46 */     this.ll_no.setPreferredSize(new Dimension(180, 55));
/* 47 */     this.ll_no.setFont(Enum_Font_Ci.FONT23.getFont());
/* 48 */     this.ll_no.setHorizontalAlignment(4);
/*    */     
/* 50 */     this.tf_name.setFont(Enum_Font_Ci.FONT26.getFont());
/* 51 */     this.tf_name.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK), BorderFactory.createEmptyBorder(0, 0, 10, 0)));
/*    */     
/*    */ 
/* 54 */     this.gbc.anchor = 17;
/* 55 */     this.gbc.fill = 0;
/*    */     
/* 57 */     this.gbc.gridx = 0;
/* 58 */     this.gbc.gridy = 0;
/* 59 */     this.gbc.gridwidth = 1;
/* 60 */     this.gbc.gridheight = 1;
/* 61 */     this.gbc.weightx = 1.0D;
/* 62 */     this.gbc.weighty = 1.0D;
/* 63 */     this.gbc.insets = new Insets(30, 0, 30, 0);
/* 64 */     add(this.ll_no, this.gbc);
/*    */     
/* 66 */     this.gbc.fill = 1;
/*    */     
/* 68 */     this.gbc.gridx = 0;
/* 69 */     this.gbc.gridy = 1;
/* 70 */     this.gbc.insets = new Insets(20, 20, 120, 20);
/* 71 */     add(this.tf_name, this.gbc);
/*    */   }
/*    */   
/*    */   public void changeLabel(int count)
/*    */   {
/* 76 */     this.ll_no.setText("섹션   " + count + "      ");
/*    */   }
/*    */   
/*    */   public String getName()
/*    */   {
/* 81 */     return this.tf_name.getText();
/*    */   }
/*    */   
/*    */   public void changeColor(Color color)
/*    */   {
/* 86 */     this.ll_no.setBackground(color);
/*    */   }
/*    */   
/*    */   public void setName(String name)
/*    */   {
/* 91 */     this.tf_name.setText(name);
/*    */   }
/*    */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Section_Pl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */