/*     */ package Model.Dialog.Survey_List;
/*     */ 
/*     */ import Enum.Enum_Color_Ci;
/*     */ import Enum.Enum_Font_Ci;
/*     */ import Model.Dialog.Survey_List.Question_Management.BorderPanel;
/*     */ import Model.Dialog.Survey_List.Question_Management.RoundButton;
/*     */ import java.awt.Color;
/*     */ import java.awt.Container;
/*     */ import java.awt.Cursor;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.GridBagLayout;
/*     */ import java.awt.Insets;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ 
/*     */ public class ColorSelect
/*     */   extends JFrame
/*     */   implements ActionListener
/*     */ {
/*  24 */   private GridBagLayout gbl = new GridBagLayout();
/*  25 */   private GridBagConstraints gbc = new GridBagConstraints();
/*     */   
/*     */ 
/*  28 */   private BorderPanel borderPanel = new BorderPanel(this, 0, 0);
/*  29 */   private JLabel ll_title = new JLabel();
/*  30 */   private RoundButton bt_c1 = new RoundButton(Enum_Color_Ci._DB4437.getColor(), Enum_Color_Ci._DB4437_SUB.getColor());
/*  31 */   private RoundButton bt_c2 = new RoundButton(Enum_Color_Ci._E91E63.getColor(), Enum_Color_Ci._E91E63_SUB.getColor());
/*  32 */   private RoundButton bt_c3 = new RoundButton(Enum_Color_Ci._9C27B0.getColor(), Enum_Color_Ci._9C27B0_SUB.getColor());
/*  33 */   private RoundButton bt_c4 = new RoundButton(Enum_Color_Ci._673AB7.getColor(), Enum_Color_Ci._673AB7_SUB.getColor());
/*  34 */   private RoundButton bt_c5 = new RoundButton(Enum_Color_Ci._3F51B5.getColor(), Enum_Color_Ci._3F51B5_SUB.getColor());
/*  35 */   private RoundButton bt_c6 = new RoundButton(Enum_Color_Ci._4285F4.getColor(), Enum_Color_Ci._4285F4_SUB.getColor());
/*  36 */   private RoundButton bt_c7 = new RoundButton(Enum_Color_Ci._03A9F4.getColor(), Enum_Color_Ci._03A9F4_SUB.getColor());
/*  37 */   private RoundButton bt_c8 = new RoundButton(Enum_Color_Ci._00BCD4.getColor(), Enum_Color_Ci._00BCD4_SUB.getColor());
/*  38 */   private RoundButton bt_c9 = new RoundButton(Enum_Color_Ci._009688.getColor(), Enum_Color_Ci._009688_SUB.getColor());
/*  39 */   private RoundButton bt_c10 = new RoundButton(Enum_Color_Ci._0F9D58.getColor(), Enum_Color_Ci._0F9D58_SUB.getColor());
/*  40 */   private RoundButton bt_c11 = new RoundButton(Enum_Color_Ci._CDDC39.getColor(), Enum_Color_Ci._CDDC39_SUB.getColor());
/*  41 */   private RoundButton bt_c12 = new RoundButton(Enum_Color_Ci._FF9800.getColor(), Enum_Color_Ci._FF9800_SUB.getColor());
/*  42 */   private RoundButton bt_c13 = new RoundButton(Enum_Color_Ci._795548.getColor(), Enum_Color_Ci._795548_SUB.getColor());
/*  43 */   private RoundButton bt_c14 = new RoundButton(Enum_Color_Ci._9E9E9E.getColor(), Enum_Color_Ci._9E9E9E_SUB.getColor());
/*  44 */   private RoundButton bt_c15 = new RoundButton(Enum_Color_Ci._607D8B.getColor(), Enum_Color_Ci._607D8B_SUB.getColor());
/*     */   
/*     */   private Question_Add_Pl question_Add;
/*     */   
/*     */ 
/*     */   public ColorSelect(Question_Add_Pl question_Add)
/*     */   {
/*  51 */     this.question_Add = question_Add;
/*     */     
/*     */ 
/*  54 */     setLayout(this.gbl);
/*  55 */     setMinimumSize(new Dimension(600, 600));
/*  56 */     setPreferredSize(new Dimension(600, 600));
/*  57 */     setMaximumSize(new Dimension(600, 600));
/*  58 */     setLocationRelativeTo(null);
/*  59 */     setUndecorated(true);
/*  60 */     getContentPane().setBackground(Color.white);
/*     */     
/*     */ 
/*  63 */     this.ll_title.setText(" 설문지 색상 변경 ");
/*  64 */     this.ll_title.setFont(Enum_Font_Ci.FONT23.getFont());
/*  65 */     this.ll_title.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK));
/*  66 */     this.ll_title.setOpaque(true);
/*  67 */     this.ll_title.setBackground(Color.WHITE);
/*     */     
/*  69 */     this.bt_c1.setCursor(new Cursor(12));
/*  70 */     this.bt_c1.setPreferredSize(new Dimension(77, 77));
/*  71 */     this.bt_c1.setFocusPainted(false);
/*  72 */     this.bt_c1.setBorder(null);
/*  73 */     this.bt_c1.setContentAreaFilled(false);
/*  74 */     this.bt_c1.addActionListener(this);
/*     */     
/*  76 */     this.bt_c2.setCursor(new Cursor(12));
/*  77 */     this.bt_c2.setPreferredSize(new Dimension(77, 77));
/*  78 */     this.bt_c2.setFocusPainted(false);
/*  79 */     this.bt_c2.setBorder(null);
/*  80 */     this.bt_c2.setContentAreaFilled(false);
/*  81 */     this.bt_c2.addActionListener(this);
/*     */     
/*  83 */     this.bt_c3.setCursor(new Cursor(12));
/*  84 */     this.bt_c3.setPreferredSize(new Dimension(77, 77));
/*  85 */     this.bt_c3.setFocusPainted(false);
/*  86 */     this.bt_c3.setBorder(null);
/*  87 */     this.bt_c3.setContentAreaFilled(false);
/*  88 */     this.bt_c3.addActionListener(this);
/*     */     
/*  90 */     this.bt_c4.setCursor(new Cursor(12));
/*  91 */     this.bt_c4.setPreferredSize(new Dimension(77, 77));
/*  92 */     this.bt_c4.setFocusPainted(false);
/*  93 */     this.bt_c4.setBorder(null);
/*  94 */     this.bt_c4.setContentAreaFilled(false);
/*  95 */     this.bt_c4.addActionListener(this);
/*     */     
/*  97 */     this.bt_c5.setCursor(new Cursor(12));
/*  98 */     this.bt_c5.setPreferredSize(new Dimension(77, 77));
/*  99 */     this.bt_c5.setFocusPainted(false);
/* 100 */     this.bt_c5.setBorder(null);
/* 101 */     this.bt_c5.setContentAreaFilled(false);
/* 102 */     this.bt_c5.addActionListener(this);
/*     */     
/* 104 */     this.bt_c6.setCursor(new Cursor(12));
/* 105 */     this.bt_c6.setPreferredSize(new Dimension(77, 77));
/* 106 */     this.bt_c6.setFocusPainted(false);
/* 107 */     this.bt_c6.setBorder(null);
/* 108 */     this.bt_c6.setContentAreaFilled(false);
/* 109 */     this.bt_c6.addActionListener(this);
/*     */     
/* 111 */     this.bt_c7.setCursor(new Cursor(12));
/* 112 */     this.bt_c7.setPreferredSize(new Dimension(77, 77));
/* 113 */     this.bt_c7.setFocusPainted(false);
/* 114 */     this.bt_c7.setBorder(null);
/* 115 */     this.bt_c7.setContentAreaFilled(false);
/* 116 */     this.bt_c7.addActionListener(this);
/*     */     
/* 118 */     this.bt_c8.setCursor(new Cursor(12));
/* 119 */     this.bt_c8.setPreferredSize(new Dimension(77, 77));
/* 120 */     this.bt_c8.setFocusPainted(false);
/* 121 */     this.bt_c8.setBorder(null);
/* 122 */     this.bt_c8.setContentAreaFilled(false);
/* 123 */     this.bt_c8.addActionListener(this);
/*     */     
/* 125 */     this.bt_c9.setCursor(new Cursor(12));
/* 126 */     this.bt_c9.setPreferredSize(new Dimension(77, 77));
/* 127 */     this.bt_c9.setFocusPainted(false);
/* 128 */     this.bt_c9.setBorder(null);
/* 129 */     this.bt_c9.setContentAreaFilled(false);
/* 130 */     this.bt_c9.addActionListener(this);
/*     */     
/* 132 */     this.bt_c10.setCursor(new Cursor(12));
/* 133 */     this.bt_c10.setPreferredSize(new Dimension(77, 77));
/* 134 */     this.bt_c10.setFocusPainted(false);
/* 135 */     this.bt_c10.setBorder(null);
/* 136 */     this.bt_c10.setContentAreaFilled(false);
/* 137 */     this.bt_c10.addActionListener(this);
/*     */     
/* 139 */     this.bt_c11.setCursor(new Cursor(12));
/* 140 */     this.bt_c11.setPreferredSize(new Dimension(77, 77));
/* 141 */     this.bt_c11.setFocusPainted(false);
/* 142 */     this.bt_c11.setBorder(null);
/* 143 */     this.bt_c11.setContentAreaFilled(false);
/* 144 */     this.bt_c11.addActionListener(this);
/*     */     
/* 146 */     this.bt_c12.setCursor(new Cursor(12));
/* 147 */     this.bt_c12.setPreferredSize(new Dimension(77, 77));
/* 148 */     this.bt_c12.setFocusPainted(false);
/* 149 */     this.bt_c12.setBorder(null);
/* 150 */     this.bt_c12.setContentAreaFilled(false);
/* 151 */     this.bt_c12.addActionListener(this);
/*     */     
/* 153 */     this.bt_c13.setCursor(new Cursor(12));
/* 154 */     this.bt_c13.setPreferredSize(new Dimension(77, 77));
/* 155 */     this.bt_c13.setFocusPainted(false);
/* 156 */     this.bt_c13.setBorder(null);
/* 157 */     this.bt_c13.setContentAreaFilled(false);
/* 158 */     this.bt_c13.addActionListener(this);
/*     */     
/* 160 */     this.bt_c14.setCursor(new Cursor(12));
/* 161 */     this.bt_c14.setPreferredSize(new Dimension(77, 77));
/* 162 */     this.bt_c14.setFocusPainted(false);
/* 163 */     this.bt_c14.setBorder(null);
/* 164 */     this.bt_c14.setContentAreaFilled(false);
/* 165 */     this.bt_c14.addActionListener(this);
/*     */     
/* 167 */     this.bt_c15.setCursor(new Cursor(12));
/* 168 */     this.bt_c15.setPreferredSize(new Dimension(77, 77));
/* 169 */     this.bt_c15.setFocusPainted(false);
/* 170 */     this.bt_c15.setBorder(null);
/* 171 */     this.bt_c15.setContentAreaFilled(false);
/* 172 */     this.bt_c15.addActionListener(this);
/*     */     
/*     */ 
/* 175 */     this.gbc.anchor = 11;
/* 176 */     this.gbc.fill = 1;
/*     */     
/* 178 */     this.gbc.gridx = 0;
/* 179 */     this.gbc.gridy = 0;
/* 180 */     this.gbc.gridwidth = 4;
/* 181 */     this.gbc.weightx = 1.0D;
/* 182 */     this.gbc.weighty = 0.02D;
/* 183 */     this.gbc.insets = new Insets(-5, 0, 0, 0);
/* 184 */     add(this.borderPanel, this.gbc);
/*     */     
/* 186 */     this.gbc.gridx = 0;
/* 187 */     this.gbc.gridy = 1;
/* 188 */     this.gbc.weighty = 0.1D;
/* 189 */     this.gbc.insets = new Insets(10, 20, 10, 20);
/* 190 */     add(this.ll_title, this.gbc);
/*     */     
/* 192 */     this.gbc.fill = 0;
/*     */     
/*     */ 
/* 195 */     this.gbc.gridx = 0;
/* 196 */     this.gbc.gridy = 2;
/* 197 */     this.gbc.weighty = 0.22D;
/* 198 */     this.gbc.gridwidth = 1;
/* 199 */     this.gbc.insets = new Insets(10, 10, 10, 10);
/* 200 */     add(this.bt_c1, this.gbc);
/*     */     
/* 202 */     this.gbc.gridx = 1;
/* 203 */     add(this.bt_c2, this.gbc);
/*     */     
/* 205 */     this.gbc.gridx = 2;
/* 206 */     add(this.bt_c3, this.gbc);
/*     */     
/* 208 */     this.gbc.gridx = 3;
/* 209 */     add(this.bt_c4, this.gbc);
/*     */     
/*     */ 
/* 212 */     this.gbc.gridx = 0;
/* 213 */     this.gbc.gridy = 3;
/* 214 */     add(this.bt_c5, this.gbc);
/*     */     
/* 216 */     this.gbc.gridx = 1;
/* 217 */     add(this.bt_c6, this.gbc);
/*     */     
/* 219 */     this.gbc.gridx = 2;
/* 220 */     add(this.bt_c7, this.gbc);
/*     */     
/* 222 */     this.gbc.gridx = 3;
/* 223 */     add(this.bt_c8, this.gbc);
/*     */     
/*     */ 
/* 226 */     this.gbc.gridx = 0;
/* 227 */     this.gbc.gridy = 4;
/* 228 */     add(this.bt_c9, this.gbc);
/*     */     
/* 230 */     this.gbc.gridx = 1;
/* 231 */     add(this.bt_c10, this.gbc);
/*     */     
/* 233 */     this.gbc.gridx = 2;
/* 234 */     add(this.bt_c11, this.gbc);
/*     */     
/* 236 */     this.gbc.gridx = 3;
/* 237 */     add(this.bt_c12, this.gbc);
/*     */     
/*     */ 
/* 240 */     this.gbc.gridx = 0;
/* 241 */     this.gbc.gridy = 5;
/* 242 */     add(this.bt_c13, this.gbc);
/*     */     
/* 244 */     this.gbc.gridx = 1;
/* 245 */     add(this.bt_c14, this.gbc);
/*     */     
/* 247 */     this.gbc.gridx = 2;
/* 248 */     add(this.bt_c15, this.gbc);
/*     */   }
/*     */   
/*     */ 
/*     */   public void actionPerformed(ActionEvent e)
/*     */   {
/* 254 */     RoundButton temp_Round = (RoundButton)e.getSource();
/*     */     
/* 256 */     this.question_Add.loadColor(temp_Round.getMain(), temp_Round.getSub());
/* 257 */     dispose();
/*     */   }
/*     */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\ColorSelect.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */