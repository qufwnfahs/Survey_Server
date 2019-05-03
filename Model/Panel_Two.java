/*     */ package Model;
/*     */ 
/*     */ import Enum.Enum_Font_Ci;
/*     */ import java.awt.Color;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.GridBagLayout;
/*     */ import java.awt.Insets;
/*     */ import java.awt.event.KeyEvent;
/*     */ import java.awt.event.KeyListener;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JTextField;
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
/*     */ class Panel_Two
/*     */   extends JPanel
/*     */   implements KeyListener
/*     */ {
/* 225 */   private GridBagLayout gbl = new GridBagLayout();
/* 226 */   private GridBagConstraints gbc = new GridBagConstraints();
/*     */   
/* 228 */   private JLabel ll_type = new JLabel();
/* 229 */   private JLabel ll_point = new JLabel();
/* 230 */   private JTextField tf_point = new JTextField();
/*     */   
/*     */   public Panel_Two() {
/* 233 */     setLayout(this.gbl);
/* 234 */     setOpaque(true);
/* 235 */     setBackground(Color.WHITE);
/* 236 */     setPreferredSize(new Dimension(800, 60));
/*     */     
/* 238 */     this.ll_type = new JLabel();
/* 239 */     this.ll_type.setFont(Enum_Font_Ci.FONT22.getFont());
/*     */     
/* 241 */     this.ll_point.setText("점수 ");
/* 242 */     this.ll_point.setPreferredSize(new Dimension(50, 40));
/* 243 */     this.ll_point.setFont(Enum_Font_Ci.FONT22.getFont());
/*     */     
/* 245 */     this.tf_point.setPreferredSize(new Dimension(80, 40));
/* 246 */     this.tf_point.setHorizontalAlignment(0);
/* 247 */     this.tf_point.setFont(Enum_Font_Ci.FONT22.getFont());
/* 248 */     this.tf_point.addKeyListener(this);
/*     */     
/* 250 */     this.gbc.anchor = 13;
/* 251 */     this.gbc.fill = 1;
/*     */     
/* 253 */     this.gbc.gridx = 0;
/* 254 */     this.gbc.gridy = 0;
/* 255 */     this.gbc.gridwidth = 1;
/* 256 */     this.gbc.gridheight = 1;
/* 257 */     this.gbc.insets = new Insets(0, 20, 0, 10);
/* 258 */     add(this.ll_type, this.gbc);
/*     */     
/* 260 */     this.gbc.gridx = 1;
/* 261 */     this.gbc.gridy = 0;
/* 262 */     this.gbc.insets = new Insets(0, 440, 0, 10);
/* 263 */     add(this.ll_point, this.gbc);
/*     */     
/* 265 */     this.gbc.gridx = 2;
/* 266 */     this.gbc.gridy = 0;
/* 267 */     this.gbc.insets = new Insets(0, 0, 0, 0);
/* 268 */     add(this.tf_point, this.gbc);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void keyPressed(KeyEvent arg0) {}
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void keyReleased(KeyEvent arg0) {}
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void keyTyped(KeyEvent arg0)
/*     */   {
/* 286 */     char c = arg0.getKeyChar();
/*     */     
/* 288 */     if ((!Character.isDigit(c)) || (this.tf_point.getText().length() > 2)) {
/* 289 */       arg0.consume();
/* 290 */       return;
/*     */     }
/*     */   }
/*     */   
/*     */   public void setName(String name) {
/* 295 */     this.ll_type.setText(name);
/*     */   }
/*     */   
/*     */   public void setPoint(String point) {
/* 299 */     this.tf_point.setText(point);
/*     */   }
/*     */   
/*     */   public void setBord(Color color) {
/* 303 */     setBorder(BorderFactory.createMatteBorder(0, 2, 2, 2, color));
/*     */   }
/*     */   
/*     */   public int getPoint() {
/* 307 */     return Integer.valueOf(this.tf_point.getText()).intValue();
/*     */   }
/*     */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Panel_Two.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */