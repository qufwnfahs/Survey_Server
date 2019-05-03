/*     */ package Model.Dialog.Survey_List;
/*     */ 
/*     */ import Enum.Enum_Color_Ci;
/*     */ import Enum.Enum_Font_Ci;
/*     */ import Enum.Enum_Image_Ci;
/*     */ import Model.Question_Module;
/*     */ import Worker.ImageController;
/*     */ import java.awt.Color;
/*     */ import java.awt.Container;
/*     */ import java.awt.Cursor;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.GridBagLayout;
/*     */ import java.awt.Insets;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JDialog;
/*     */ import javax.swing.JScrollBar;
/*     */ import javax.swing.JScrollPane;
/*     */ import javax.swing.JTabbedPane;
/*     */ 
/*     */ public class Question_Dialog extends JDialog implements java.awt.event.ActionListener
/*     */ {
/*  28 */   private GridBagLayout gbl = new GridBagLayout();
/*  29 */   private GridBagConstraints gbc = new GridBagConstraints();
/*     */   
/*  31 */   private JTabbedPane tab = new JTabbedPane();
/*  32 */   private JButton bt_confirm = new JButton();
/*  33 */   private JButton bt_cancel = new JButton();
/*     */   
/*     */   private Card_Survey_Fr frame;
/*     */   
/*     */   private Card_Survey_Fr_Modify frame_Modify;
/*  38 */   private List<Question_Module> list = new ArrayList();
/*     */   
/*     */   public Question_Dialog(Card_Survey_Fr frame) {
/*  41 */     this.frame = frame;
/*     */     
/*     */ 
/*  44 */     setPreferredSize(new Dimension(900, 1000));
/*  45 */     setMinimumSize(new Dimension(900, 1000));
/*  46 */     setMaximumSize(new Dimension(900, 1000));
/*  47 */     setLocationRelativeTo(null);
/*  48 */     setAlwaysOnTop(true);
/*  49 */     setLayout(this.gbl);
/*  50 */     getContentPane().setBackground(Color.WHITE);
/*     */     
/*  52 */     this.bt_confirm.setText("완료");
/*  53 */     this.bt_confirm.setOpaque(true);
/*  54 */     this.bt_confirm.setBackground(Enum_Color_Ci._673AB7.getColor());
/*  55 */     this.bt_confirm.setForeground(Color.WHITE);
/*  56 */     this.bt_confirm.setFont(Enum_Font_Ci.INFO.getFont());
/*  57 */     this.bt_confirm.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.DONE.getImageIcon(), 28, 28)));
/*  58 */     this.bt_confirm.setHorizontalAlignment(2);
/*  59 */     this.bt_confirm.setCursor(new Cursor(12));
/*  60 */     this.bt_confirm.addActionListener(this);
/*  61 */     this.bt_confirm.setPreferredSize(new Dimension(110, 50));
/*     */     
/*  63 */     this.bt_cancel.setText("취소");
/*  64 */     this.bt_cancel.setOpaque(true);
/*  65 */     this.bt_cancel.setBackground(Enum_Color_Ci._673AB7.getColor());
/*  66 */     this.bt_cancel.setForeground(Color.WHITE);
/*  67 */     this.bt_cancel.setFont(Enum_Font_Ci.INFO.getFont());
/*  68 */     this.bt_cancel.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.CANCEL.getImageIcon(), 28, 28)));
/*  69 */     this.bt_cancel.setHorizontalTextPosition(2);
/*  70 */     this.bt_cancel.setHorizontalAlignment(4);
/*  71 */     this.bt_cancel.setCursor(new Cursor(12));
/*  72 */     this.bt_cancel.addActionListener(this);
/*  73 */     this.bt_cancel.setPreferredSize(new Dimension(110, 50));
/*     */     
/*     */ 
/*  76 */     this.tab.setFont(Enum_Font_Ci.FONT23.getFont());
/*     */     
/*  78 */     Module_Survey md_sv = frame.getSurvey();
/*     */     
/*  80 */     for (int i = 0; i < md_sv.getSection().size(); i++)
/*     */     {
/*  82 */       Module_Section sec = (Module_Section)md_sv.getSection().get(i);
/*     */       
/*  84 */       Question_Module qu_md = new Question_Module(sec.getQuestion(), frame);
/*     */       
/*     */ 
/*  87 */       JScrollPane scp = new JScrollPane(qu_md);
/*  88 */       scp.setVerticalScrollBarPolicy(22);
/*  89 */       scp.setHorizontalScrollBarPolicy(30);
/*     */       
/*  91 */       this.tab.add(scp, "섹션 " + (i + 1));
/*     */       
/*  93 */       this.list.add(qu_md);
/*     */     }
/*     */     
/*     */ 
/*  97 */     this.gbc.anchor = 11;
/*  98 */     this.gbc.fill = 1;
/*     */     
/* 100 */     this.gbc.gridx = 0;
/* 101 */     this.gbc.gridy = 0;
/* 102 */     this.gbc.gridwidth = 2;
/* 103 */     this.gbc.weightx = 1.0D;
/* 104 */     this.gbc.weighty = 0.9D;
/* 105 */     add(this.tab, this.gbc);
/*     */     
/* 107 */     this.gbc.fill = 0;
/*     */     
/* 109 */     this.gbc.gridx = 0;
/* 110 */     this.gbc.gridy = 1;
/* 111 */     this.gbc.gridwidth = 1;
/* 112 */     this.gbc.weighty = 0.1D;
/* 113 */     this.gbc.insets = new Insets(50, 0, 0, 0);
/* 114 */     add(this.bt_confirm, this.gbc);
/*     */     
/* 116 */     this.gbc.gridx = 1;
/* 117 */     this.gbc.gridy = 1;
/* 118 */     add(this.bt_cancel, this.gbc);
/*     */   }
/*     */   
/*     */   public Question_Dialog(Card_Survey_Fr_Modify frame_Modify) {
/* 122 */     this.frame_Modify = frame_Modify;
/*     */     
/*     */ 
/* 125 */     setPreferredSize(new Dimension(900, 1000));
/* 126 */     setMinimumSize(new Dimension(900, 1000));
/* 127 */     setMaximumSize(new Dimension(900, 1000));
/* 128 */     setLocationRelativeTo(null);
/* 129 */     setAlwaysOnTop(true);
/* 130 */     setLayout(this.gbl);
/* 131 */     getContentPane().setBackground(Color.WHITE);
/*     */     
/* 133 */     this.bt_confirm.setText("완료");
/* 134 */     this.bt_confirm.setOpaque(true);
/* 135 */     this.bt_confirm.setBackground(Enum_Color_Ci._673AB7.getColor());
/* 136 */     this.bt_confirm.setForeground(Color.WHITE);
/* 137 */     this.bt_confirm.setFont(Enum_Font_Ci.INFO.getFont());
/* 138 */     this.bt_confirm.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.DONE.getImageIcon(), 28, 28)));
/* 139 */     this.bt_confirm.setHorizontalAlignment(2);
/* 140 */     this.bt_confirm.setCursor(new Cursor(12));
/* 141 */     this.bt_confirm.addActionListener(this);
/* 142 */     this.bt_confirm.setPreferredSize(new Dimension(110, 50));
/*     */     
/* 144 */     this.bt_cancel.setText("취소");
/* 145 */     this.bt_cancel.setOpaque(true);
/* 146 */     this.bt_cancel.setBackground(Enum_Color_Ci._673AB7.getColor());
/* 147 */     this.bt_cancel.setForeground(Color.WHITE);
/* 148 */     this.bt_cancel.setFont(Enum_Font_Ci.INFO.getFont());
/* 149 */     this.bt_cancel.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.CANCEL.getImageIcon(), 28, 28)));
/* 150 */     this.bt_cancel.setHorizontalTextPosition(2);
/* 151 */     this.bt_cancel.setHorizontalAlignment(4);
/* 152 */     this.bt_cancel.setCursor(new Cursor(12));
/* 153 */     this.bt_cancel.addActionListener(this);
/* 154 */     this.bt_cancel.setPreferredSize(new Dimension(110, 50));
/*     */     
/*     */ 
/* 157 */     this.tab.setFont(Enum_Font_Ci.FONT23.getFont());
/*     */     
/* 159 */     Module_Survey md_sv = frame_Modify.getSurvey();
/*     */     
/* 161 */     for (int i = 0; i < md_sv.getSection().size(); i++)
/*     */     {
/* 163 */       Module_Section sec = (Module_Section)md_sv.getSection().get(i);
/*     */       
/* 165 */       Question_Module qu_md = new Question_Module(sec.getQuestion(), frame_Modify);
/*     */       
/*     */ 
/* 168 */       JScrollPane scp = new JScrollPane(qu_md);
/* 169 */       scp.setVerticalScrollBarPolicy(22);
/* 170 */       scp.setHorizontalScrollBarPolicy(30);
/* 171 */       scp.getVerticalScrollBar().setUnitIncrement(16);
/*     */       
/* 173 */       this.tab.add(scp, "섹션 " + (i + 1));
/*     */       
/* 175 */       this.list.add(qu_md);
/*     */     }
/*     */     
/*     */ 
/* 179 */     this.gbc.anchor = 11;
/* 180 */     this.gbc.fill = 1;
/*     */     
/* 182 */     this.gbc.gridx = 0;
/* 183 */     this.gbc.gridy = 0;
/* 184 */     this.gbc.gridwidth = 2;
/* 185 */     this.gbc.weightx = 1.0D;
/* 186 */     this.gbc.weighty = 0.9D;
/* 187 */     add(this.tab, this.gbc);
/*     */     
/* 189 */     this.gbc.fill = 0;
/*     */     
/* 191 */     this.gbc.gridx = 0;
/* 192 */     this.gbc.gridy = 1;
/* 193 */     this.gbc.gridwidth = 1;
/* 194 */     this.gbc.weighty = 0.1D;
/* 195 */     this.gbc.insets = new Insets(50, 0, 0, 0);
/* 196 */     add(this.bt_confirm, this.gbc);
/*     */     
/* 198 */     this.gbc.gridx = 1;
/* 199 */     this.gbc.gridy = 1;
/* 200 */     add(this.bt_cancel, this.gbc);
/*     */   }
/*     */   
/*     */   public void actionPerformed(ActionEvent arg0)
/*     */   {
/* 205 */     if (arg0.getSource().equals(this.bt_confirm)) {
/* 206 */       savePoint();
/*     */       
/* 208 */       dispose();
/* 209 */     } else if (arg0.getSource().equals(this.bt_cancel)) {
/* 210 */       dispose();
/*     */     }
/*     */   }
/*     */   
/*     */   public void savePoint() { Object qm;
/* 215 */     if (this.frame == null) {
/* 216 */       for (Module_Section ms : this.frame_Modify.getSurvey().getSection()) {
/* 217 */         ms.setPointZeroInQuestion();
/*     */       }
/*     */       
/* 220 */       for (int i = 0; i < this.list.size(); i++) {
/* 221 */         qm = (Question_Module)this.list.get(i);
/*     */         
/* 223 */         ((Question_Module)qm).savePoint(i);
/*     */       }
/*     */     } else {
/* 226 */       for (qm = this.frame.getSurvey().getSection().iterator(); ((Iterator)qm).hasNext();) { Module_Section ms = (Module_Section)((Iterator)qm).next();
/* 227 */         ms.setPointZeroInQuestion();
/*     */       }
/*     */       
/* 230 */       for (int i = 0; i < this.list.size(); i++) {
/* 231 */         Question_Module qm = (Question_Module)this.list.get(i);
/*     */         
/* 233 */         qm.savePoint(i);
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Question_Dialog.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */