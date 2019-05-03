/*     */ package Model.Dialog.Survey_List.Question_Management;
/*     */ 
/*     */ import Enum.Enum_Color_Ci;
/*     */ import Enum.Enum_Font_Ci;
/*     */ import Enum.Enum_Image_Ci;
/*     */ import Model.Dialog.Survey_List.ColorSelect;
/*     */ import Model.Dialog.Survey_List.Question_Add_Pl;
/*     */ import Worker.ImageController;
/*     */ import java.awt.Color;
/*     */ import java.awt.Cursor;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.GridBagLayout;
/*     */ import java.awt.Insets;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ColorPanel
/*     */   extends JPanel
/*     */   implements ActionListener
/*     */ {
/*  29 */   private GridBagLayout gbl = new GridBagLayout();
/*  30 */   private GridBagConstraints gbc = new GridBagConstraints();
/*     */   
/*     */ 
/*  33 */   private JLabel ll_name = new JLabel();
/*  34 */   private JButton bt_palette = new JButton();
/*     */   
/*     */   private ColorSelect colorSelect;
/*     */   
/*     */   private Question_Add_Pl question_Add;
/*     */   
/*     */   public ColorPanel(Question_Add_Pl question_Add)
/*     */   {
/*  42 */     this.question_Add = question_Add;
/*     */     
/*     */ 
/*  45 */     setLayout(this.gbl);
/*  46 */     setMinimumSize(new Dimension(0, 270));
/*  47 */     setPreferredSize(new Dimension(0, 270));
/*  48 */     setMaximumSize(new Dimension(0, 270));
/*  49 */     setBackground(Enum_Color_Ci._673AB7.getColor());
/*     */     
/*     */ 
/*  52 */     this.ll_name.setOpaque(true);
/*  53 */     this.ll_name.setBackground(Enum_Color_Ci._673AB7.getColor());
/*  54 */     this.ll_name.setForeground(Color.WHITE);
/*  55 */     this.ll_name.setFont(Enum_Font_Ci.FONT26.getFont());
/*  56 */     this.ll_name.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE), BorderFactory.createEmptyBorder(0, 0, 10, 0)));
/*     */     
/*  58 */     this.bt_palette.setOpaque(true);
/*  59 */     this.bt_palette.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.PALETTE.getImageIcon(), 38, 38)));
/*  60 */     this.bt_palette.setBackground(Enum_Color_Ci._673AB7.getColor());
/*  61 */     this.bt_palette.setCursor(new Cursor(12));
/*  62 */     this.bt_palette.setBorder(null);
/*  63 */     this.bt_palette.addActionListener(this);
/*     */     
/*  65 */     this.colorSelect = new ColorSelect(question_Add);
/*     */     
/*     */ 
/*  68 */     this.gbc.anchor = 11;
/*  69 */     this.gbc.fill = 0;
/*     */     
/*  71 */     this.gbc.gridx = 0;
/*  72 */     this.gbc.gridy = 0;
/*  73 */     this.gbc.weightx = 0.08D;
/*  74 */     this.gbc.weighty = 1.0D;
/*  75 */     this.gbc.insets = new Insets(30, 0, 0, 0);
/*  76 */     add(this.ll_name, this.gbc);
/*     */     
/*  78 */     this.gbc.gridx = 1;
/*  79 */     this.gbc.gridy = 0;
/*  80 */     this.gbc.weightx = 0.89D;
/*  81 */     this.gbc.insets = new Insets(20, 0, 0, 0);
/*  82 */     add(new JLabel(), this.gbc);
/*     */     
/*  84 */     this.gbc.gridx = 2;
/*  85 */     this.gbc.gridy = 0;
/*  86 */     this.gbc.weightx = 0.03D;
/*  87 */     this.gbc.insets = new Insets(30, 0, 0, 20);
/*  88 */     add(this.bt_palette, this.gbc);
/*     */   }
/*     */   
/*     */   public void setName(String name)
/*     */   {
/*  93 */     this.ll_name.setText(name);
/*     */   }
/*     */   
/*     */   public void loadColor(Color main)
/*     */   {
/*  98 */     setBackground(main);
/*  99 */     this.ll_name.setBackground(main);
/* 100 */     this.bt_palette.setBackground(main);
/*     */   }
/*     */   
/*     */ 
/*     */   public void actionPerformed(ActionEvent e)
/*     */   {
/* 106 */     if (e.getSource().equals(this.bt_palette))
/*     */     {
/* 108 */       if (this.colorSelect.isVisible())
/*     */       {
/* 110 */         this.colorSelect.toFront();
/*     */       }
/*     */       else
/*     */       {
/* 114 */         this.colorSelect.setVisible(true);
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Question_Management\ColorPanel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */