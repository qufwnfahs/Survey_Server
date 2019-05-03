/*     */ package Model;
/*     */ 
/*     */ import Enum.Enum_Font_Ci;
/*     */ import java.awt.Color;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.GridBagLayout;
/*     */ import java.awt.Insets;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class Panel_One
/*     */   extends JPanel
/*     */ {
/* 167 */   private GridBagLayout gbl = new GridBagLayout();
/* 168 */   private GridBagConstraints gbc = new GridBagConstraints();
/*     */   
/* 170 */   private JLabel ll_label = new JLabel();
/* 171 */   private JLabel ll_name = new JLabel();
/*     */   
/*     */   public Panel_One() {
/* 174 */     setLayout(this.gbl);
/* 175 */     setOpaque(true);
/* 176 */     setBackground(Color.WHITE);
/*     */     
/* 178 */     this.ll_label.setFont(Enum_Font_Ci.FONT22.getFont());
/* 179 */     this.ll_label.setForeground(Color.WHITE);
/* 180 */     this.ll_label.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
/* 181 */     this.ll_label.setOpaque(true);
/* 182 */     this.ll_label.setPreferredSize(new Dimension(130, 60));
/*     */     
/* 184 */     this.ll_name.setFont(Enum_Font_Ci.FONT22.getFont());
/* 185 */     this.ll_name.setOpaque(true);
/* 186 */     this.ll_name.setBackground(Color.WHITE);
/* 187 */     this.ll_name.setPreferredSize(new Dimension(670, 60));
/*     */     
/* 189 */     this.gbc.anchor = 10;
/* 190 */     this.gbc.fill = 1;
/*     */     
/* 192 */     this.gbc.gridx = 0;
/* 193 */     this.gbc.gridy = 0;
/* 194 */     this.gbc.gridwidth = 1;
/* 195 */     this.gbc.gridheight = 1;
/* 196 */     this.gbc.weighty = 1.0D;
/* 197 */     this.gbc.insets = new Insets(0, 0, 0, 0);
/* 198 */     add(this.ll_label, this.gbc);
/*     */     
/* 200 */     this.gbc.gridx = 1;
/* 201 */     this.gbc.gridy = 0;
/* 202 */     this.gbc.insets = new Insets(0, 0, 0, 0);
/* 203 */     add(this.ll_name, this.gbc);
/*     */   }
/*     */   
/*     */   public void setName(String name) {
/* 207 */     this.ll_name.setText(name);
/*     */   }
/*     */   
/*     */   public void setLabel(int label) {
/* 211 */     this.ll_label.setText("문제 " + label);
/*     */   }
/*     */   
/*     */   public void setColor(Color color) {
/* 215 */     this.ll_label.setBackground(color);
/*     */   }
/*     */   
/*     */   public void setBord(Color color) {
/* 219 */     this.ll_name.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(2, 0, 2, 2, color), 
/* 220 */       BorderFactory.createEmptyBorder(0, 20, 0, 0)));
/*     */   }
/*     */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Panel_One.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */