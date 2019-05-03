/*     */ package Model.Dialog.Survey_List;
/*     */ 
/*     */ import Model.Dialog.Survey_List.Question_Management.BorderPanel;
/*     */ import Model.Dialog.Survey_List.Question_Management.NumberPanel;
/*     */ import Worker.ImageController;
/*     */ import Worker.Server;
/*     */ import java.awt.Color;
/*     */ import java.awt.Cursor;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.Font;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.GridBagLayout;
/*     */ import java.awt.Image;
/*     */ import java.awt.Insets;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.awt.event.ItemEvent;
/*     */ import java.awt.event.ItemListener;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JCheckBox;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JScrollPane;
/*     */ 
/*     */ 
/*     */ public class Survey_PointSet_Di
/*     */   extends JPanel
/*     */   implements ItemListener, ActionListener
/*     */ {
/*  30 */   private GridBagLayout gbl = new GridBagLayout();
/*  31 */   private GridBagConstraints gbc = new GridBagConstraints();
/*  32 */   private GridBagLayout gbl_sess = new GridBagLayout();
/*  33 */   private GridBagConstraints gbc_sess = new GridBagConstraints();
/*  34 */   private GridBagLayout gbl_tempPl = new GridBagLayout();
/*  35 */   private GridBagConstraints gbc_tempPl = new GridBagConstraints();
/*     */   
/*     */   private BorderPanel borderPanel;
/*     */   
/*     */   private NumberPanel numberPanel;
/*     */   private JCheckBox cb_enaORdna;
/*  41 */   private JPanel pl_sess = new JPanel();
/*  42 */   private JScrollPane scroll_sess = new JScrollPane(this.pl_sess);
/*  43 */   private JButton bt_prev = new JButton();
/*  44 */   private JButton bt_complete = new JButton();
/*     */   
/*     */   private Image img_prev;
/*     */   
/*     */   private Image img_next;
/*     */   private Server server;
/*     */   private Survey_Frame_Cl frame;
/*     */   
/*     */   public Survey_PointSet_Di(Server server, Survey_Frame_Cl frame)
/*     */   {
/*  54 */     setLayout(this.gbl);
/*  55 */     setBackground(new Color(0, 172, 189));
/*     */     
/*  57 */     this.server = server;
/*  58 */     this.frame = frame;
/*     */     
/*  60 */     this.img_prev = ImageController.resizeImage(
/*  61 */       new ImageIcon(getClass().getResource("/Image/outline_keyboard_arrow_left_white_36dp.png")), 28, 
/*  62 */       28);
/*  63 */     this.img_next = ImageController.resizeImage(
/*  64 */       new ImageIcon(getClass().getResource("/Image/outline_keyboard_arrow_right_white_36dp.png")), 28, 
/*  65 */       28);
/*     */     
/*  67 */     this.borderPanel = new BorderPanel(frame, 0);
/*  68 */     this.numberPanel = new NumberPanel(3);
/*     */     
/*     */ 
/*  71 */     this.cb_enaORdna = new JCheckBox("점수 설정");
/*  72 */     this.cb_enaORdna.setFont(new Font("나눔바른고딕", 0, 24));
/*  73 */     this.cb_enaORdna.addItemListener(this);
/*     */     
/*     */ 
/*  76 */     this.pl_sess.setLayout(this.gbl_sess);
/*     */     
/*     */ 
/*  79 */     this.bt_prev.setText("이전");
/*     */     
/*  81 */     this.bt_prev.setOpaque(true);
/*  82 */     this.bt_prev.setBackground(new Color(0, 172, 189));
/*  83 */     this.bt_prev.setForeground(Color.WHITE);
/*  84 */     this.bt_prev.setFont(new Font("나눔바른고딕", 0, 20));
/*  85 */     this.bt_prev.setIcon(new ImageIcon(this.img_prev));
/*  86 */     this.bt_prev.setHorizontalAlignment(2);
/*  87 */     this.bt_prev.setCursor(new Cursor(12));
/*  88 */     this.bt_prev.addActionListener(this);
/*  89 */     this.bt_prev.setPreferredSize(new Dimension(110, 50));
/*     */     
/*  91 */     this.bt_complete.setText("완료");
/*  92 */     this.bt_complete.setOpaque(true);
/*  93 */     this.bt_complete.setBackground(new Color(0, 172, 189));
/*  94 */     this.bt_complete.setForeground(Color.WHITE);
/*  95 */     this.bt_complete.setFont(new Font("나눔바른고딕", 0, 20));
/*  96 */     this.bt_complete.setIcon(new ImageIcon(this.img_next));
/*  97 */     this.bt_complete.setHorizontalTextPosition(2);
/*  98 */     this.bt_complete.setHorizontalAlignment(4);
/*  99 */     this.bt_complete.setCursor(new Cursor(12));
/* 100 */     this.bt_complete.addActionListener(this);
/* 101 */     this.bt_complete.setPreferredSize(new Dimension(110, 50));
/*     */     
/*     */ 
/* 104 */     this.gbc.anchor = 11;
/* 105 */     this.gbc.fill = 1;
/*     */     
/* 107 */     this.gbc_sess.anchor = 11;
/* 108 */     this.gbc_sess.fill = 2;
/*     */     
/* 110 */     this.gbc_tempPl.anchor = 11;
/* 111 */     this.gbc_tempPl.fill = 1;
/*     */     
/* 113 */     this.gbc.gridx = 0;
/* 114 */     this.gbc.gridy = 0;
/* 115 */     this.gbc.gridwidth = 2;
/* 116 */     this.gbc.gridheight = 1;
/* 117 */     this.gbc.weightx = 1.0D;
/* 118 */     this.gbc.weighty = 0.01D;
/* 119 */     this.gbc.insets = new Insets(0, 0, 0, 0);
/* 120 */     add(this.borderPanel, this.gbc);
/*     */     
/* 122 */     this.gbc.gridx = 0;
/* 123 */     this.gbc.gridy = 1;
/* 124 */     this.gbc.weighty = 0.1D;
/* 125 */     add(this.numberPanel, this.gbc);
/*     */     
/* 127 */     this.gbc.gridx = 0;
/* 128 */     this.gbc.gridy = 2;
/* 129 */     this.gbc.weighty = 0.02D;
/* 130 */     add(this.cb_enaORdna, this.gbc);
/*     */     
/* 132 */     this.gbc.gridx = 0;
/* 133 */     this.gbc.gridy = 3;
/* 134 */     this.gbc.weighty = 0.82D;
/* 135 */     add(this.scroll_sess, this.gbc);
/*     */     
/* 137 */     this.gbc.gridx = 0;
/* 138 */     this.gbc.gridy = 4;
/* 139 */     this.gbc.gridwidth = 1;
/* 140 */     this.gbc.weighty = 0.05D;
/* 141 */     add(this.bt_prev, this.gbc);
/*     */     
/* 143 */     this.gbc.gridx = 1;
/* 144 */     this.gbc.gridy = 4;
/* 145 */     add(this.bt_complete, this.gbc);
/*     */   }
/*     */   
/*     */   public void itemStateChanged(ItemEvent arg0) {}
/*     */   
/*     */   public void actionPerformed(ActionEvent arg0) {}
/*     */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Survey_PointSet_Di.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */