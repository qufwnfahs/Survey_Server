/*     */ package Model.Dialog;
/*     */ 
/*     */ import Enum.Enum_Font_Ci;
/*     */ import Worker.ImageController;
/*     */ import java.awt.CardLayout;
/*     */ import java.awt.Color;
/*     */ import java.awt.Container;
/*     */ import java.awt.Cursor;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.GridBagLayout;
/*     */ import java.awt.Insets;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.sql.SQLException;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JDialog;
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
/*     */ public class Survey_React_Di
/*     */   extends JDialog
/*     */   implements ActionListener
/*     */ {
/*  78 */   private GridBagLayout gbl = new GridBagLayout();
/*  79 */   private GridBagConstraints gbc = new GridBagConstraints();
/*     */   
/*  81 */   private CardLayout card = new CardLayout();
/*     */   
/*  83 */   private JLabel ll_title = new JLabel();
/*     */   
/*  85 */   private JButton bt_summary = new JButton();
/*  86 */   private JButton bt_individual = new JButton();
/*  87 */   private JButton bt_statistics = new JButton();
/*     */   
/*     */   public Panel_Summary pl_summary;
/*     */   
/*     */   public Panel_Individual pl_individual;
/*     */   public Panel_Statistics pl_statistics;
/*  93 */   private JPanel pl_card = new JPanel();
/*     */   private String IDF_CD;
/*     */   private String CT;
/*     */   
/*     */   public Survey_React_Di(String IDF_CD, String CT)
/*     */     throws SQLException
/*     */   {
/* 100 */     this.IDF_CD = IDF_CD;
/* 101 */     this.CT = CT;
/*     */     
/*     */ 
/* 104 */     setLayout(this.gbl);
/* 105 */     setPreferredSize(new Dimension(1300, 946));
/* 106 */     setMinimumSize(new Dimension(1300, 946));
/* 107 */     setMaximumSize(new Dimension(1300, 946));
/* 108 */     setLocationRelativeTo(null);
/* 109 */     setAlwaysOnTop(true);
/* 110 */     setIconImage(ImageController.resizeImage(new ImageIcon(getClass().getResource("/Image/poker-chip.png")), 48, 48));
/* 111 */     setTitle("정다운마을 설문조사");
/*     */     
/* 113 */     getContentPane().setBackground(Color.WHITE);
/*     */     
/*     */ 
/* 116 */     this.ll_title.setText("응답  " + CT + "개");
/* 117 */     this.ll_title.setFont(Enum_Font_Ci.나눔바른고딕26.getFont());
/*     */     
/* 119 */     this.bt_summary.setText("요약");
/* 120 */     this.bt_summary.setOpaque(true);
/* 121 */     this.bt_summary.setBackground(Color.WHITE);
/* 122 */     this.bt_summary.setForeground(Color.BLACK);
/* 123 */     this.bt_summary.setFont(Enum_Font_Ci.나눔바른고딕18.getFont());
/* 124 */     this.bt_summary.setCursor(new Cursor(12));
/* 125 */     this.bt_summary.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(12, 151, 189)), BorderFactory.createEmptyBorder(10, 30, 10, 30)));
/* 126 */     this.bt_summary.setFocusable(false);
/* 127 */     this.bt_summary.addActionListener(this);
/*     */     
/* 129 */     this.bt_individual.setText("개별 보기");
/* 130 */     this.bt_individual.setOpaque(true);
/* 131 */     this.bt_individual.setBackground(Color.WHITE);
/* 132 */     this.bt_individual.setForeground(Color.BLACK);
/* 133 */     this.bt_individual.setFont(Enum_Font_Ci.나눔바른고딕18.getFont());
/* 134 */     this.bt_individual.setCursor(new Cursor(12));
/* 135 */     this.bt_individual.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(1, 0, 1, 1, new Color(12, 151, 189)), BorderFactory.createEmptyBorder(10, 30, 10, 30)));
/* 136 */     this.bt_individual.setFocusable(false);
/* 137 */     this.bt_individual.addActionListener(this);
/*     */     
/* 139 */     this.bt_statistics.setText("통계");
/* 140 */     this.bt_statistics.setOpaque(true);
/* 141 */     this.bt_statistics.setBackground(Color.WHITE);
/* 142 */     this.bt_statistics.setForeground(Color.BLACK);
/* 143 */     this.bt_statistics.setFont(Enum_Font_Ci.나눔바른고딕18.getFont());
/* 144 */     this.bt_statistics.setCursor(new Cursor(12));
/* 145 */     this.bt_statistics.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(1, 0, 1, 1, new Color(12, 151, 189)), BorderFactory.createEmptyBorder(10, 30, 10, 30)));
/* 146 */     this.bt_statistics.setFocusable(false);
/* 147 */     this.bt_statistics.addActionListener(this);
/*     */     
/* 149 */     this.pl_card.setLayout(this.card);
/* 150 */     this.pl_card.setBackground(Color.WHITE);
/* 151 */     this.pl_card.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, Color.BLACK));
/*     */     
/* 153 */     this.pl_summary = new Panel_Summary(IDF_CD);
/* 154 */     this.pl_statistics = new Panel_Statistics(IDF_CD);
/* 155 */     this.pl_individual = new Panel_Individual(IDF_CD, this.pl_statistics);
/*     */     
/* 157 */     this.pl_card.add("Summary", this.pl_summary);
/* 158 */     this.pl_card.add("Individual", this.pl_individual);
/* 159 */     this.pl_card.add("Statistics", this.pl_statistics);
/*     */     
/* 161 */     this.gbc.anchor = 17;
/* 162 */     this.gbc.fill = 0;
/*     */     
/* 164 */     this.gbc.gridx = 0;
/* 165 */     this.gbc.gridy = 0;
/* 166 */     this.gbc.gridwidth = 3;
/* 167 */     this.gbc.gridheight = 1;
/* 168 */     this.gbc.insets = new Insets(30, 30, 30, 30);
/* 169 */     add(this.ll_title, this.gbc);
/*     */     
/* 171 */     this.gbc.gridy = 1;
/* 172 */     this.gbc.gridwidth = 1;
/* 173 */     this.gbc.insets = new Insets(0, 30, 30, 0);
/* 174 */     add(this.bt_summary, this.gbc);
/*     */     
/* 176 */     this.gbc.gridx = 1;
/* 177 */     this.gbc.insets = new Insets(0, 0, 30, 0);
/* 178 */     add(this.bt_individual, this.gbc);
/*     */     
/* 180 */     this.gbc.gridx = 2;
/* 181 */     this.gbc.insets = new Insets(0, 0, 30, 0);
/* 182 */     add(this.bt_statistics, this.gbc);
/*     */     
/* 184 */     this.gbc.fill = 1;
/*     */     
/* 186 */     this.gbc.gridx = 0;
/* 187 */     this.gbc.gridy = 2;
/* 188 */     this.gbc.gridwidth = 3;
/* 189 */     this.gbc.weightx = 1.0D;
/* 190 */     this.gbc.weighty = 1.0D;
/* 191 */     this.gbc.insets = new Insets(0, 10, 30, 10);
/* 192 */     add(this.pl_card, this.gbc);
/*     */   }
/*     */   
/*     */ 
/*     */   public void actionPerformed(ActionEvent arg0)
/*     */   {
/* 198 */     if (arg0.getSource().equals(this.bt_summary))
/*     */     {
/* 200 */       this.bt_summary.setForeground(Color.WHITE);
/* 201 */       this.bt_summary.setBackground(new Color(12, 151, 189));
/*     */       
/* 203 */       this.bt_individual.setBackground(Color.WHITE);
/* 204 */       this.bt_individual.setForeground(Color.BLACK);
/*     */       
/* 206 */       this.bt_statistics.setBackground(Color.WHITE);
/* 207 */       this.bt_statistics.setForeground(Color.BLACK);
/*     */       
/* 209 */       this.card.show(this.pl_card, "Summary");
/*     */     }
/* 211 */     else if (arg0.getSource().equals(this.bt_individual))
/*     */     {
/* 213 */       this.bt_individual.setForeground(Color.WHITE);
/* 214 */       this.bt_individual.setBackground(new Color(12, 151, 189));
/*     */       
/* 216 */       this.bt_summary.setBackground(Color.WHITE);
/* 217 */       this.bt_summary.setForeground(Color.BLACK);
/*     */       
/* 219 */       this.bt_statistics.setBackground(Color.WHITE);
/* 220 */       this.bt_statistics.setForeground(Color.BLACK);
/*     */       
/* 222 */       this.card.show(this.pl_card, "Individual");
/*     */     }
/* 224 */     else if (arg0.getSource().equals(this.bt_statistics))
/*     */     {
/* 226 */       this.bt_statistics.setForeground(Color.WHITE);
/* 227 */       this.bt_statistics.setBackground(new Color(12, 151, 189));
/*     */       
/* 229 */       this.bt_summary.setBackground(Color.WHITE);
/* 230 */       this.bt_summary.setForeground(Color.BLACK);
/*     */       
/* 232 */       this.bt_individual.setBackground(Color.WHITE);
/* 233 */       this.bt_individual.setForeground(Color.BLACK);
/*     */       
/* 235 */       this.card.show(this.pl_card, "Statistics");
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_React_Di.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */