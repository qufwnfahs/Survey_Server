/*     */ package Model;
/*     */ 
/*     */ import Enum.Enum_Font_Ci;
/*     */ import java.awt.Color;
/*     */ import java.awt.Cursor;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.GridBagLayout;
/*     */ import java.awt.Insets;
/*     */ import java.awt.event.KeyEvent;
/*     */ import java.awt.event.KeyListener;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.awt.event.MouseListener;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JTextField;
/*     */ 
/*     */ public class Point_Section
/*     */   extends JPanel
/*     */   implements MouseListener, KeyListener
/*     */ {
/*  23 */   private GridBagLayout gbl = new GridBagLayout();
/*  24 */   private GridBagConstraints gbc = new GridBagConstraints();
/*  25 */   private GridBagLayout gbl_2 = new GridBagLayout();
/*  26 */   private GridBagConstraints gbc_2 = new GridBagConstraints();
/*     */   
/*  28 */   private JLabel ll_label = new JLabel();
/*  29 */   private JLabel ll_name = new JLabel();
/*  30 */   private JPanel pl_point = new JPanel();
/*  31 */   private JLabel ll_point = new JLabel();
/*  32 */   private JTextField tf_point = new JTextField();
/*     */   
/*     */   public String getLabel() {
/*  35 */     return this.ll_label.getText();
/*     */   }
/*     */   
/*     */   public String getName() {
/*  39 */     return this.ll_name.getText();
/*     */   }
/*     */   
/*     */   public String getPoint() {
/*  43 */     return this.tf_point.getText();
/*     */   }
/*     */   
/*     */   public void setLabel(String label) {
/*  47 */     this.ll_label.setText("섹션 " + label);
/*     */   }
/*     */   
/*     */   public void setName(String name) {
/*  51 */     this.ll_name.setText(name);
/*     */   }
/*     */   
/*     */   public void setPoint(String point) {
/*  55 */     this.tf_point.setText(point);
/*     */   }
/*     */   
/*     */   public Point_Section() {
/*  59 */     setLayout(this.gbl);
/*  60 */     setPreferredSize(new Dimension(700, 60));
/*  61 */     addMouseListener(this);
/*  62 */     setCursor(new Cursor(12));
/*     */     
/*  64 */     this.ll_label.setFont(Enum_Font_Ci.FONT22.getFont());
/*  65 */     this.ll_label.setForeground(Color.WHITE);
/*  66 */     this.ll_label.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
/*  67 */     this.ll_label.setOpaque(true);
/*  68 */     this.ll_label.setPreferredSize(new Dimension(130, 60));
/*     */     
/*  70 */     this.ll_name.setFont(Enum_Font_Ci.FONT22.getFont());
/*  71 */     this.ll_name.setOpaque(true);
/*  72 */     this.ll_name.setBackground(Color.WHITE);
/*  73 */     this.ll_name.setPreferredSize(new Dimension(570, 60));
/*     */     
/*  75 */     this.pl_point.setVisible(false);
/*  76 */     this.pl_point.setLayout(this.gbl_2);
/*  77 */     this.pl_point.setBackground(Color.WHITE);
/*  78 */     this.pl_point.setPreferredSize(new Dimension(700, 60));
/*     */     
/*  80 */     this.ll_point.setText("점수 ");
/*  81 */     this.ll_point.setPreferredSize(new Dimension(50, 40));
/*  82 */     this.ll_point.setFont(Enum_Font_Ci.FONT22.getFont());
/*     */     
/*  84 */     this.tf_point.setPreferredSize(new Dimension(80, 40));
/*  85 */     this.tf_point.setHorizontalAlignment(0);
/*  86 */     this.tf_point.setFont(Enum_Font_Ci.FONT22.getFont());
/*  87 */     this.tf_point.addKeyListener(this);
/*     */     
/*  89 */     this.gbc.anchor = 10;
/*  90 */     this.gbc.fill = 1;
/*     */     
/*  92 */     this.gbc.gridx = 0;
/*  93 */     this.gbc.gridy = 0;
/*  94 */     this.gbc.gridwidth = 1;
/*  95 */     this.gbc.gridheight = 1;
/*  96 */     this.gbc.weighty = 0.5D;
/*  97 */     this.gbc.insets = new Insets(0, 0, 0, 0);
/*  98 */     add(this.ll_label, this.gbc);
/*     */     
/* 100 */     this.gbc.gridx = 1;
/* 101 */     this.gbc.gridy = 0;
/* 102 */     this.gbc.insets = new Insets(0, 0, 0, 0);
/* 103 */     add(this.ll_name, this.gbc);
/*     */     
/* 105 */     this.gbc.gridx = 0;
/* 106 */     this.gbc.gridy = 1;
/* 107 */     this.gbc.gridwidth = 2;
/* 108 */     this.gbc.weightx = 1.0D;
/* 109 */     this.gbc.insets = new Insets(0, 0, 0, 0);
/* 110 */     add(this.pl_point, this.gbc);
/*     */     
/* 112 */     this.gbc_2.anchor = 13;
/* 113 */     this.gbc_2.fill = 1;
/*     */     
/* 115 */     this.gbc_2.gridx = 0;
/* 116 */     this.gbc_2.gridy = 0;
/* 117 */     this.gbc_2.gridwidth = 1;
/* 118 */     this.gbc_2.gridheight = 1;
/* 119 */     this.gbc_2.insets = new Insets(0, 500, 0, 10);
/* 120 */     this.pl_point.add(this.ll_point, this.gbc_2);
/*     */     
/* 122 */     this.gbc_2.gridx = 1;
/* 123 */     this.gbc_2.gridy = 0;
/* 124 */     this.gbc_2.insets = new Insets(0, 0, 0, 0);
/* 125 */     this.pl_point.add(this.tf_point, this.gbc_2);
/*     */   }
/*     */   
/*     */   public void setColor(Color color) {
/* 129 */     this.ll_label.setBackground(color);
/*     */   }
/*     */   
/*     */   public void setBord(Color color) {
/* 133 */     this.ll_name.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(2, 0, 2, 2, color), 
/* 134 */       BorderFactory.createEmptyBorder(0, 20, 0, 0)));
/* 135 */     this.pl_point.setBorder(BorderFactory.createMatteBorder(0, 2, 2, 2, color));
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void mouseClicked(MouseEvent arg0) {}
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void mouseEntered(MouseEvent arg0) {}
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void mouseExited(MouseEvent arg0) {}
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void mousePressed(MouseEvent arg0)
/*     */   {
/* 158 */     if (this.pl_point.isVisible()) {
/* 159 */       this.pl_point.setVisible(false);
/* 160 */       setPreferredSize(new Dimension(700, 60));
/*     */     } else {
/* 162 */       this.pl_point.setVisible(true);
/* 163 */       setPreferredSize(new Dimension(700, 120));
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void mouseReleased(MouseEvent arg0) {}
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
/* 187 */     char c = arg0.getKeyChar();
/*     */     
/* 189 */     if ((!Character.isDigit(c)) || (this.tf_point.getText().length() > 2))
/*     */     {
/* 191 */       arg0.consume();
/* 192 */       return;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Point_Section.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */