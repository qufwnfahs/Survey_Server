/*     */ package Model.Dialog.Survey_List.Question_Management;
/*     */ 
/*     */ import Model.Dialog.Survey_List.Module_Option;
/*     */ import Model.Dialog.Survey_List.Option_M;
/*     */ import Model.Dialog.Survey_List.Question_Custom_Pl;
/*     */ import java.awt.Color;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.Font;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.GridBagLayout;
/*     */ import java.awt.Insets;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.JComboBox;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JTextField;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class OpenEndedQuestionPanel
/*     */   extends JPanel
/*     */   implements ActionListener
/*     */ {
/*     */   public JTextField title;
/*     */   public HintTextField answer;
/*     */   public QuestionComboBox qcb;
/*     */   private Question_Custom_Pl cp;
/*     */   
/*     */   public OpenEndedQuestionPanel(Question_Custom_Pl cp, QuestionComboBox parentQcb)
/*     */   {
/*  35 */     this.cp = cp;
/*     */     
/*  37 */     this.qcb = new QuestionComboBox();
/*  38 */     this.qcb.setModel(parentQcb.getModel());
/*  39 */     this.qcb.addActionListener(this);
/*     */     
/*  41 */     setBackground(Color.white);
/*     */     
/*  43 */     this.title = new JTextField();
/*  44 */     this.title.setPreferredSize(new Dimension(742, 60));
/*  45 */     this.title.setOpaque(false);
/*  46 */     this.title.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(224, 224, 224)));
/*  47 */     this.title.setFont(new Font("나눔바른고딕", 0, 25));
/*     */     
/*  49 */     this.answer = new HintTextField("장문형 텍스트", new Color(158, 158, 180));
/*  50 */     this.answer.setPreferredSize(new Dimension(1072, 60));
/*  51 */     this.answer.setOpaque(false);
/*  52 */     this.answer.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(224, 224, 224)));
/*  53 */     this.answer.setFont(new Font("나눔바른고딕", 0, 20));
/*  54 */     this.answer.setEditable(false);
/*  55 */     this.answer.setFocusable(false);
/*     */     
/*  57 */     GridBagLayout gbl = new GridBagLayout();
/*  58 */     GridBagConstraints gbc = new GridBagConstraints();
/*  59 */     setLayout(gbl);
/*     */     
/*  61 */     gbc.anchor = 17;
/*  62 */     gbc.fill = 0;
/*     */     
/*  64 */     gbc.gridx = 0;
/*  65 */     gbc.gridy = 0;
/*  66 */     gbc.gridwidth = 1;
/*  67 */     gbc.gridheight = 1;
/*  68 */     gbc.weightx = 0.6D;
/*  69 */     gbc.weighty = 1.0D;
/*  70 */     gbc.insets = new Insets(0, 30, 0, 0);
/*  71 */     add(this.title, gbc);
/*     */     
/*  73 */     gbc.gridx = 1;
/*  74 */     gbc.gridy = 0;
/*  75 */     gbc.weightx = 0.4D;
/*  76 */     gbc.insets = new Insets(0, 30, 0, 30);
/*  77 */     add(this.qcb, gbc);
/*     */     
/*  79 */     gbc.gridx = 0;
/*  80 */     gbc.gridy = 1;
/*  81 */     gbc.weightx = 1.0D;
/*  82 */     gbc.gridwidth = 2;
/*  83 */     gbc.insets = new Insets(-90, 30, 0, 0);
/*  84 */     add(this.answer, gbc);
/*     */   }
/*     */   
/*     */ 
/*     */   public void paintComponent(Graphics g)
/*     */   {
/*  90 */     super.paintComponent(g);
/*     */   }
/*     */   
/*     */ 
/*     */   public Dimension getPreferredSize()
/*     */   {
/*  96 */     return new Dimension(1130, 270);
/*     */   }
/*     */   
/*     */ 
/*     */   public void actionPerformed(ActionEvent e)
/*     */   {
/* 102 */     JComboBox cb = (JComboBox)e.getSource();
/*     */     
/*     */ 
/* 105 */     this.cp.changePanel(cb.getSelectedIndex());
/*     */   }
/*     */   
/*     */   public List<Option> getOption()
/*     */   {
/* 110 */     List<Option> list_opt = new ArrayList();
/*     */     
/* 112 */     Option opt = new Option();
/* 113 */     opt.setNum("1");
/* 114 */     opt.setName("장문형 텍스트");
/* 115 */     opt.setPoint(0);
/*     */     
/* 117 */     list_opt.add(opt);
/*     */     
/* 119 */     return list_opt;
/*     */   }
/*     */   
/*     */   public List<Option_M> getOption_M()
/*     */   {
/* 124 */     List<Option_M> list_opt = new ArrayList();
/*     */     
/* 126 */     Option_M opt = new Option_M();
/* 127 */     opt.setNum("1");
/* 128 */     opt.setName("장문형 텍스트");
/*     */     
/* 130 */     list_opt.add(opt);
/*     */     
/* 132 */     return list_opt;
/*     */   }
/*     */   
/*     */   public List<Module_Option> getOptionBy()
/*     */   {
/* 137 */     List<Module_Option> lt_opt = new ArrayList();
/*     */     
/* 139 */     Module_Option opt = new Module_Option();
/* 140 */     opt.setNumber("1");
/* 141 */     opt.setName("장문형 텍스트");
/*     */     
/* 143 */     lt_opt.add(opt);
/*     */     
/* 145 */     return lt_opt;
/*     */   }
/*     */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Question_Management\OpenEndedQuestionPanel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */