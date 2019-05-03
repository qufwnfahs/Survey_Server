/*     */ package Model.Dialog.Survey_List;
/*     */ 
/*     */ import Enum.Enum_Font_Ci;
/*     */ import Enum.Enum_Image_Ci;
/*     */ import Enum.Enum_Table_Ci;
/*     */ import Model.Dialog.Survey_List.Question_Management.BorderPanel;
/*     */ import Model.Dialog.Survey_List_Di;
/*     */ import Worker.Database;
/*     */ import Worker.ImageController;
/*     */ import java.awt.Color;
/*     */ import java.awt.Cursor;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.GridBagLayout;
/*     */ import java.awt.Insets;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.sql.SQLException;
/*     */ import java.text.ParseException;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ 
/*     */ public class Survey_Info_Ci
/*     */   extends JPanel
/*     */   implements ActionListener
/*     */ {
/*  33 */   private GridBagLayout gbl = new GridBagLayout();
/*  34 */   private GridBagConstraints gbc = new GridBagConstraints();
/*     */   
/*     */   private BorderPanel borderPanel;
/*     */   
/*  38 */   private JButton bt_modify = new JButton();
/*  39 */   private JButton bt_delete = new JButton();
/*  40 */   private JButton bt_back = new JButton();
/*     */   
/*  42 */   private JPanel pl_white = new JPanel();
/*     */   
/*  44 */   private JLabel ll_title = new JLabel();
/*     */   private Survey_List_Di frame;
/*     */   private String IDF_CD;
/*     */   
/*     */   public Survey_Info_Ci(Survey_List_Di frame, String IDF_CD)
/*     */     throws SQLException
/*     */   {
/*  51 */     this.frame = frame;
/*  52 */     this.IDF_CD = IDF_CD;
/*     */     
/*     */ 
/*  55 */     setLayout(this.gbl);
/*  56 */     setBackground(Color.WHITE);
/*     */     
/*     */ 
/*  59 */     List<Map<String, String>> data = Database.getRow(Enum_Table_Ci.T003.getCode(), "IDF_CD", IDF_CD);
/*     */     
/*     */ 
/*  62 */     this.borderPanel = new BorderPanel(frame, 0);
/*     */     
/*  64 */     this.ll_title.setText((String)((Map)data.get(0)).get("SURVEY_NM"));
/*  65 */     this.ll_title.setFont(Enum_Font_Ci.INFO.getFont());
/*  66 */     this.ll_title.setBackground(Color.WHITE);
/*  67 */     this.ll_title.setOpaque(true);
/*  68 */     this.ll_title.setBorder(BorderFactory.createCompoundBorder(
/*  69 */       BorderFactory.createMatteBorder(1, 0, 1, 0, Color.BLACK), 
/*  70 */       BorderFactory.createEmptyBorder(0, 20, 0, 0)));
/*  71 */     this.ll_title.setPreferredSize(new Dimension(1200, 150));
/*     */     
/*  73 */     this.pl_white = new JPanel();
/*  74 */     this.pl_white.setOpaque(true);
/*  75 */     this.pl_white.setBackground(Color.WHITE);
/*  76 */     this.pl_white.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
/*     */     
/*     */ 
/*  79 */     this.bt_modify.setText("수정");
/*  80 */     this.bt_modify.setFont(Enum_Font_Ci.INFO.getFont());
/*  81 */     this.bt_modify.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.NEXT.getImageIcon(), 28, 28)));
/*  82 */     this.bt_modify.setOpaque(true);
/*  83 */     this.bt_modify.setBackground(new Color(12, 151, 189));
/*  84 */     this.bt_modify.setForeground(Color.WHITE);
/*  85 */     this.bt_modify.setHorizontalTextPosition(2);
/*  86 */     this.bt_modify.setHorizontalAlignment(4);
/*  87 */     this.bt_modify.setCursor(new Cursor(12));
/*  88 */     this.bt_modify.addActionListener(this);
/*  89 */     this.bt_modify.setPreferredSize(new Dimension(110, 50));
/*     */     
/*  91 */     this.bt_delete.setText("삭제");
/*  92 */     this.bt_delete.setFont(Enum_Font_Ci.INFO.getFont());
/*  93 */     this.bt_delete.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.NEXT.getImageIcon(), 28, 28)));
/*  94 */     this.bt_delete.setOpaque(true);
/*  95 */     this.bt_delete.setBackground(new Color(12, 151, 189));
/*  96 */     this.bt_delete.setForeground(Color.WHITE);
/*  97 */     this.bt_delete.setHorizontalTextPosition(2);
/*  98 */     this.bt_delete.setHorizontalAlignment(4);
/*  99 */     this.bt_delete.setCursor(new Cursor(12));
/* 100 */     this.bt_delete.addActionListener(this);
/* 101 */     this.bt_delete.setPreferredSize(new Dimension(110, 50));
/*     */     
/* 103 */     this.bt_back.setText("이전");
/* 104 */     this.bt_back.setFont(Enum_Font_Ci.INFO.getFont());
/* 105 */     this.bt_back.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.NEXT.getImageIcon(), 28, 28)));
/* 106 */     this.bt_back.setOpaque(true);
/* 107 */     this.bt_back.setBackground(new Color(12, 151, 189));
/* 108 */     this.bt_back.setForeground(Color.WHITE);
/* 109 */     this.bt_back.setHorizontalTextPosition(2);
/* 110 */     this.bt_back.setHorizontalAlignment(4);
/* 111 */     this.bt_back.setCursor(new Cursor(12));
/* 112 */     this.bt_back.addActionListener(this);
/* 113 */     this.bt_back.setPreferredSize(new Dimension(110, 50));
/*     */     
/*     */ 
/* 116 */     this.gbc.anchor = 11;
/* 117 */     this.gbc.fill = 1;
/*     */     
/* 119 */     this.gbc.gridx = 0;
/* 120 */     this.gbc.gridy = 0;
/* 121 */     this.gbc.gridwidth = 3;
/* 122 */     this.gbc.gridheight = 1;
/* 123 */     this.gbc.weightx = 1.0D;
/* 124 */     this.gbc.weighty = 0.01D;
/* 125 */     this.gbc.insets = new Insets(-5, 0, 0, -2);
/* 126 */     add(this.borderPanel, this.gbc);
/*     */     
/* 128 */     this.gbc.gridx = 0;
/* 129 */     this.gbc.gridy = 1;
/* 130 */     this.gbc.weighty = 0.15D;
/* 131 */     this.gbc.insets = new Insets(30, 10, 10, 10);
/* 132 */     add(this.ll_title, this.gbc);
/*     */     
/* 134 */     this.gbc.gridx = 0;
/* 135 */     this.gbc.gridy = 2;
/* 136 */     this.gbc.weighty = 0.69D;
/* 137 */     add(this.pl_white, this.gbc);
/*     */     
/* 139 */     this.gbc.fill = 0;
/*     */     
/* 141 */     this.gbc.gridx = 0;
/* 142 */     this.gbc.gridy = 3;
/* 143 */     this.gbc.gridwidth = 1;
/* 144 */     this.gbc.weighty = 0.05D;
/* 145 */     this.gbc.insets = new Insets(25, 10, 10, 10);
/* 146 */     add(this.bt_modify, this.gbc);
/*     */     
/* 148 */     this.gbc.gridx = 1;
/* 149 */     this.gbc.gridy = 3;
/* 150 */     add(this.bt_delete, this.gbc);
/*     */     
/* 152 */     this.gbc.gridx = 2;
/* 153 */     this.gbc.gridy = 3;
/* 154 */     add(this.bt_back, this.gbc);
/*     */   }
/*     */   
/*     */ 
/*     */   public void actionPerformed(ActionEvent arg0)
/*     */   {
/* 160 */     if (arg0.getSource().equals(this.bt_back))
/*     */     {
/* 162 */       this.frame.removeInCard(this);
/*     */     }
/* 164 */     else if (arg0.getSource().equals(this.bt_delete))
/*     */     {
/* 166 */       int result = JOptionPane.showConfirmDialog(null, "정말 삭제하시겠습니까 ?", "Confirm", 0);
/*     */       
/* 168 */       if (result == 0)
/*     */       {
/*     */         try
/*     */         {
/* 172 */           Database.removeData(Enum_Table_Ci.T003.getCode(), "IDF_CD", this.IDF_CD);
/*     */         }
/*     */         catch (SQLException e)
/*     */         {
/* 176 */           e.printStackTrace();
/*     */         }
/*     */         try
/*     */         {
/* 180 */           this.frame.updateList();
/* 181 */           this.frame.removeInCard(this);
/*     */         }
/*     */         catch (SQLException e) {
/* 184 */           e.printStackTrace();
/*     */         }
/*     */       }
/*     */     }
/* 188 */     else if (arg0.getSource().equals(this.bt_modify))
/*     */     {
/*     */       try
/*     */       {
/* 192 */         new Card_Survey_Fr_Modify(this.IDF_CD).setVisible(true);
/*     */       }
/*     */       catch (SQLException|ParseException e)
/*     */       {
/* 196 */         e.printStackTrace();
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Survey_Info_Ci.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */