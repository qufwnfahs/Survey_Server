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
/*     */ public class LinearQuestionPanel
/*     */   extends JPanel
/*     */   implements ActionListener
/*     */ {
/*     */   public JTextField title;
/*     */   public JTextField numberTextField;
/*     */   public JTextField number2TextField;
/*     */   public JLabel lbl1;
/*     */   public JLabel lblNum1;
/*     */   public JLabel lblNum2;
/*     */   public QuestionComboBox qcb;
/*     */   public Question_Custom_Pl cp;
/*     */   public NumberComboBox ncb1;
/*     */   public NumberComboBox ncb2;
/*  44 */   public GridBagLayout gbl = new GridBagLayout();
/*  45 */   public GridBagConstraints gbc = new GridBagConstraints();
/*     */   
/*     */   public LinearQuestionPanel(Question_Custom_Pl cp, QuestionComboBox parentQcb)
/*     */   {
/*  49 */     setPreferredSize(new Dimension(1130, 470));
/*  50 */     setBackground(Color.white);
/*  51 */     setLayout(this.gbl);
/*     */     
/*  53 */     this.cp = cp;
/*     */     
/*     */ 
/*  56 */     this.title = new JTextField();
/*  57 */     this.title.setPreferredSize(new Dimension(732, 60));
/*  58 */     this.title.setOpaque(false);
/*  59 */     this.title.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(224, 224, 224)));
/*  60 */     this.title.setFont(new Font("나눔바른고딕", 0, 25));
/*     */     
/*  62 */     this.numberTextField = new JTextField();
/*  63 */     this.numberTextField.setPreferredSize(new Dimension(472, 60));
/*  64 */     this.numberTextField.setOpaque(false);
/*  65 */     this.numberTextField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(224, 224, 224)));
/*  66 */     this.numberTextField.setFont(new Font("나눔바른고딕", 0, 22));
/*     */     
/*  68 */     this.number2TextField = new JTextField();
/*  69 */     this.number2TextField.setPreferredSize(new Dimension(472, 60));
/*  70 */     this.number2TextField.setOpaque(false);
/*  71 */     this.number2TextField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(224, 224, 224)));
/*  72 */     this.number2TextField.setFont(new Font("나눔바른고딕", 0, 22));
/*     */     
/*  74 */     this.qcb = new QuestionComboBox();
/*  75 */     this.qcb.setModel(parentQcb.getModel());
/*  76 */     this.qcb.addActionListener(this);
/*     */     
/*  78 */     this.lbl1 = new JLabel("~");
/*  79 */     this.lbl1.setFont(new Font("나눔바른고딕", 0, 25));
/*     */     
/*  81 */     this.ncb1 = new NumberComboBox();
/*  82 */     this.ncb1.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 1, new Color(240, 240, 240)));
/*  83 */     this.ncb1.addItemList(1);
/*  84 */     this.ncb1.addActionListener(this);
/*  85 */     this.ncb2 = new NumberComboBox();
/*  86 */     this.ncb2.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 1, new Color(240, 240, 240)));
/*  87 */     this.ncb2.addItemList(2);
/*  88 */     this.ncb2.addActionListener(this);
/*     */     
/*  90 */     this.lblNum1 = new JLabel("1");
/*  91 */     this.lblNum1.setForeground(Color.gray);
/*  92 */     this.lblNum1.setFont(new Font("나눔바른고딕", 0, 22));
/*  93 */     this.lblNum2 = new JLabel("2");
/*  94 */     this.lblNum2.setForeground(Color.gray);
/*  95 */     this.lblNum2.setFont(new Font("나눔바른고딕", 0, 22));
/*     */     
/*  97 */     this.gbc.anchor = 17;
/*     */     
/*  99 */     this.gbc.gridx = 0;
/* 100 */     this.gbc.gridy = 0;
/* 101 */     this.gbc.gridwidth = 2;
/* 102 */     this.gbc.gridheight = 1;
/* 103 */     this.gbc.weighty = 1.0D;
/* 104 */     this.gbc.insets = new Insets(20, 30, 0, 0);
/* 105 */     add(this.title, this.gbc);
/*     */     
/* 107 */     this.gbc.gridx = 2;
/* 108 */     this.gbc.gridy = 0;
/* 109 */     this.gbc.gridwidth = 1;
/* 110 */     this.gbc.insets = new Insets(20, 30, 0, 30);
/* 111 */     add(this.qcb, this.gbc);
/*     */     
/* 113 */     this.gbc.gridx = 0;
/* 114 */     this.gbc.gridy = 1;
/* 115 */     add(this.ncb1, this.gbc);
/*     */     
/* 117 */     this.gbc.gridx = 1;
/* 118 */     this.gbc.insets = new Insets(25, 10, 0, 0);
/* 119 */     add(this.lbl1, this.gbc);
/*     */     
/* 121 */     this.gbc.gridx = 2;
/* 122 */     this.gbc.insets = new Insets(25, 64956, 0, 0);
/* 123 */     add(this.ncb2, this.gbc);
/*     */     
/* 125 */     this.gbc.gridx = 0;
/* 126 */     this.gbc.gridy = 2;
/* 127 */     this.gbc.insets = new Insets(30, 30, 0, 0);
/* 128 */     add(this.lblNum1, this.gbc);
/*     */     
/* 130 */     this.gbc.gridx = 1;
/* 131 */     this.gbc.insets = new Insets(35, -20, 0, 0);
/* 132 */     add(this.numberTextField, this.gbc);
/*     */     
/* 134 */     this.gbc.gridx = 0;
/* 135 */     this.gbc.gridy = 3;
/* 136 */     this.gbc.insets = new Insets(20, 30, 60, 0);
/* 137 */     add(this.lblNum2, this.gbc);
/*     */     
/* 139 */     this.gbc.gridx = 1;
/* 140 */     this.gbc.insets = new Insets(-15, -20, 30, 0);
/* 141 */     add(this.number2TextField, this.gbc);
/*     */   }
/*     */   
/*     */ 
/*     */   public void paintComponent(Graphics g)
/*     */   {
/* 147 */     super.paintComponent(g);
/*     */   }
/*     */   
/*     */ 
/*     */   public void actionPerformed(ActionEvent e)
/*     */   {
/* 153 */     if (e.getSource() == this.qcb)
/*     */     {
/* 155 */       JComboBox cb = (JComboBox)e.getSource();
/*     */       
/*     */ 
/* 158 */       this.cp.changePanel(cb.getSelectedIndex());
/*     */     }
/* 160 */     else if (e.getSource() == this.ncb1)
/*     */     {
/* 162 */       JComboBox cb = (JComboBox)e.getSource();
/*     */       
/* 164 */       this.lblNum1.setText((String)cb.getSelectedItem());
/*     */     }
/* 166 */     else if (e.getSource() == this.ncb2)
/*     */     {
/* 168 */       JComboBox cb = (JComboBox)e.getSource();
/*     */       
/* 170 */       this.lblNum2.setText((String)cb.getSelectedItem());
/*     */     }
/*     */   }
/*     */   
/*     */   public void increaseSize()
/*     */   {
/* 176 */     setPreferredSize(new Dimension(1088, getHeight() + 30));
/*     */   }
/*     */   
/*     */   public void decreaseSize()
/*     */   {
/* 181 */     setPreferredSize(new Dimension(1088, getHeight() - 125));
/*     */   }
/*     */   
/*     */   public List<Option> getOption()
/*     */   {
/* 186 */     List<Option> list_opt = new ArrayList();
/*     */     
/* 188 */     Option opt = new Option();
/* 189 */     opt.setNum(String.valueOf(this.ncb1.getSelectedItem()));
/* 190 */     opt.setName(this.numberTextField.getText());
/* 191 */     opt.setPoint(0);
/*     */     
/* 193 */     list_opt.add(opt);
/*     */     
/* 195 */     Option opt2 = new Option();
/* 196 */     opt2.setNum(String.valueOf(this.ncb2.getSelectedItem()));
/* 197 */     opt2.setName(this.number2TextField.getText());
/* 198 */     opt2.setPoint(0);
/*     */     
/* 200 */     list_opt.add(opt2);
/*     */     
/* 202 */     return list_opt;
/*     */   }
/*     */   
/*     */   public List<Option_M> getOption_M()
/*     */   {
/* 207 */     List<Option_M> list_opt = new ArrayList();
/*     */     
/* 209 */     Option_M opt = new Option_M();
/* 210 */     opt.setNum(String.valueOf(this.ncb1.getSelectedItem()));
/* 211 */     opt.setName(this.numberTextField.getText());
/*     */     
/* 213 */     list_opt.add(opt);
/*     */     
/* 215 */     Option_M opt2 = new Option_M();
/* 216 */     opt2.setNum(String.valueOf(this.ncb2.getSelectedItem()));
/* 217 */     opt2.setName(this.number2TextField.getText());
/*     */     
/* 219 */     list_opt.add(opt2);
/*     */     
/* 221 */     return list_opt;
/*     */   }
/*     */   
/*     */   public List<Module_Option> getOptionBy()
/*     */   {
/* 226 */     List<Module_Option> lt_opt = new ArrayList();
/*     */     
/* 228 */     Module_Option opt = new Module_Option();
/* 229 */     opt.setNumber(String.valueOf(this.ncb1.getSelectedItem()));
/* 230 */     opt.setName(this.numberTextField.getText());
/*     */     
/* 232 */     Module_Option opt2 = new Module_Option();
/* 233 */     opt2.setNumber(String.valueOf(this.ncb2.getSelectedItem()));
/* 234 */     opt2.setName(this.number2TextField.getText());
/*     */     
/* 236 */     lt_opt.add(opt);
/* 237 */     lt_opt.add(opt2);
/*     */     
/* 239 */     return lt_opt;
/*     */   }
/*     */   
/*     */   public void setOption(List<Module_Option> option)
/*     */   {
/* 244 */     this.qcb.setSelectedIndex(4);
/*     */     
/* 246 */     this.lblNum1.setText(((Module_Option)option.get(0)).getNumber());
/* 247 */     this.lblNum2.setText(((Module_Option)option.get(1)).getNumber());
/*     */     
/* 249 */     this.numberTextField.setText(((Module_Option)option.get(0)).getName());
/* 250 */     this.number2TextField.setText(((Module_Option)option.get(1)).getName());
/*     */     
/* 252 */     int number = Integer.valueOf(((Module_Option)option.get(1)).getNumber()).intValue();
/* 253 */     this.ncb2.setSelectedIndex(number - 2);
/*     */   }
/*     */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Question_Management\LinearQuestionPanel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */