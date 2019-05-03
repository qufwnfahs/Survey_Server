/*     */ package Model.Dialog.Survey_List;
/*     */ 
/*     */ import Enum.Enum_Font_Ci;
/*     */ import Enum.Enum_Image_Ci;
/*     */ import Model.Dialog.Survey_List.Question_Management.BorderPanel;
/*     */ import Model.Dialog.Survey_List.Question_Management.NumberPanel;
/*     */ import Worker.DateLabelFormatter;
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
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Date;
/*     */ import java.util.Properties;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JFormattedTextField;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JTextField;
/*     */ import org.jdatepicker.impl.JDatePanelImpl;
/*     */ import org.jdatepicker.impl.JDatePickerImpl;
/*     */ import org.jdatepicker.impl.UtilDateModel;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Info_Add_Pl_Modify
/*     */   extends JPanel
/*     */   implements ActionListener
/*     */ {
/*  40 */   private GridBagLayout gbl = new GridBagLayout();
/*  41 */   private GridBagConstraints gbc = new GridBagConstraints();
/*     */   
/*     */   private BorderPanel borderPanel;
/*     */   
/*  45 */   private NumberPanel numberPanel = new NumberPanel(0);
/*  46 */   private JLabel ll_code = new JLabel();
/*  47 */   private JLabel ll_name = new JLabel();
/*  48 */   private JLabel ll_start = new JLabel();
/*  49 */   private JLabel ll_end = new JLabel();
/*  50 */   private JTextField tf_code = new JTextField();
/*  51 */   private JTextField tf_name = new JTextField();
/*  52 */   private UtilDateModel model_start = new UtilDateModel();
/*  53 */   private UtilDateModel model_end = new UtilDateModel();
/*  54 */   private JDatePanelImpl datePanel_start = new JDatePanelImpl(this.model_start, new Properties());
/*  55 */   private JDatePanelImpl datePanel_end = new JDatePanelImpl(this.model_end, new Properties());
/*  56 */   private JDatePickerImpl datePicker_start = new JDatePickerImpl(this.datePanel_start, new DateLabelFormatter());
/*  57 */   private JDatePickerImpl datePicker_end = new JDatePickerImpl(this.datePanel_end, new DateLabelFormatter());
/*  58 */   private JButton bt_next = new JButton();
/*     */   
/*     */   private Card_Survey_Fr_Modify frame;
/*     */   
/*     */   public Info_Add_Pl_Modify(Card_Survey_Fr_Modify frame)
/*     */     throws SQLException, ParseException
/*     */   {
/*  65 */     this.frame = frame;
/*     */     
/*     */ 
/*  68 */     setLayout(this.gbl);
/*  69 */     setBackground(Color.WHITE);
/*     */     
/*     */ 
/*  72 */     this.borderPanel = new BorderPanel(frame, 0);
/*     */     
/*  74 */     this.ll_code.setText(" 설문 코드");
/*  75 */     this.ll_code.setFont(Enum_Font_Ci.INFO.getFont());
/*  76 */     this.ll_code.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.LABEL.getImageIcon(), 28, 28)));
/*  77 */     this.ll_code.setBackground(new Color(249, 249, 249));
/*  78 */     this.ll_code.setOpaque(true);
/*  79 */     this.ll_code.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(2, 0, 2, 0, new Color(229, 229, 229)), BorderFactory.createEmptyBorder(0, 20, 0, 0)));
/*     */     
/*  81 */     this.ll_name.setText(" 설문지 이름");
/*  82 */     this.ll_name.setFont(Enum_Font_Ci.INFO.getFont());
/*  83 */     this.ll_name.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.LABEL.getImageIcon(), 28, 28)));
/*  84 */     this.ll_name.setBackground(new Color(249, 249, 249));
/*  85 */     this.ll_name.setOpaque(true);
/*  86 */     this.ll_name.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(2, 0, 2, 0, new Color(229, 229, 229)), BorderFactory.createEmptyBorder(0, 20, 0, 0)));
/*     */     
/*  88 */     this.ll_start.setText(" 설문 시작 날짜");
/*  89 */     this.ll_start.setFont(Enum_Font_Ci.INFO.getFont());
/*  90 */     this.ll_start.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.LABEL.getImageIcon(), 28, 28)));
/*  91 */     this.ll_start.setBackground(new Color(249, 249, 249));
/*  92 */     this.ll_start.setOpaque(true);
/*  93 */     this.ll_start.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(2, 0, 2, 0, new Color(229, 229, 229)), BorderFactory.createEmptyBorder(0, 20, 0, 0)));
/*     */     
/*  95 */     this.ll_end.setText(" 설문 종료 날짜");
/*  96 */     this.ll_end.setFont(Enum_Font_Ci.INFO.getFont());
/*  97 */     this.ll_end.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.LABEL.getImageIcon(), 28, 28)));
/*  98 */     this.ll_end.setBackground(new Color(249, 249, 249));
/*  99 */     this.ll_end.setOpaque(true);
/* 100 */     this.ll_end.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(2, 0, 2, 0, new Color(229, 229, 229)), BorderFactory.createEmptyBorder(0, 20, 0, 0)));
/*     */     
/* 102 */     this.tf_code.setText(frame.getSurvey().getCode());
/* 103 */     this.tf_code.setFont(Enum_Font_Ci.INFO.getFont());
/* 104 */     this.tf_code.setEditable(false);
/* 105 */     this.tf_code.setBackground(Color.WHITE);
/* 106 */     this.tf_code.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(2, 0, 2, 0, new Color(229, 229, 229)), BorderFactory.createEmptyBorder(0, 20, 0, 0)));
/*     */     
/* 108 */     this.tf_name.setFont(Enum_Font_Ci.INFO.getFont());
/* 109 */     this.tf_name.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(2, 0, 2, 0, new Color(229, 229, 229)), BorderFactory.createEmptyBorder(0, 20, 0, 0)));
/*     */     
/* 111 */     this.bt_next.setText("다음");
/* 112 */     this.bt_next.setFont(Enum_Font_Ci.INFO.getFont());
/* 113 */     this.bt_next.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.NEXT.getImageIcon(), 28, 28)));
/* 114 */     this.bt_next.setOpaque(true);
/* 115 */     this.bt_next.setBackground(new Color(12, 151, 189));
/* 116 */     this.bt_next.setForeground(Color.WHITE);
/* 117 */     this.bt_next.setHorizontalTextPosition(2);
/* 118 */     this.bt_next.setHorizontalAlignment(4);
/* 119 */     this.bt_next.setCursor(new Cursor(12));
/* 120 */     this.bt_next.addActionListener(this);
/* 121 */     this.bt_next.setPreferredSize(new Dimension(110, 50));
/*     */     
/* 123 */     this.datePicker_start.setBackground(Color.WHITE);
/* 124 */     this.datePicker_start.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(2, 0, 2, 0, new Color(229, 229, 229)), BorderFactory.createEmptyBorder(0, 0, 0, 0)));
/* 125 */     this.datePicker_start.getJFormattedTextField().setFont(Enum_Font_Ci.DATEPICKER.getFont());
/* 126 */     this.datePicker_start.getJFormattedTextField().setMargin(new Insets(0, 10, 0, 0));
/*     */     
/* 128 */     this.datePicker_end.setBackground(Color.WHITE);
/* 129 */     this.datePicker_end.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(2, 0, 2, 0, new Color(229, 229, 229)), BorderFactory.createEmptyBorder(0, 0, 0, 0)));
/* 130 */     this.datePicker_end.getJFormattedTextField().setFont(Enum_Font_Ci.DATEPICKER.getFont());
/* 131 */     this.datePicker_end.getJFormattedTextField().setMargin(new Insets(0, 10, 0, 0));
/*     */     
/*     */ 
/* 134 */     this.gbc.anchor = 11;
/* 135 */     this.gbc.fill = 1;
/*     */     
/* 137 */     this.gbc.gridx = 0;
/* 138 */     this.gbc.gridy = 0;
/* 139 */     this.gbc.gridwidth = 2;
/* 140 */     this.gbc.gridheight = 1;
/* 141 */     this.gbc.weightx = 1.0D;
/* 142 */     this.gbc.weighty = 0.01D;
/* 143 */     this.gbc.insets = new Insets(-5, 0, 0, -2);
/* 144 */     add(this.borderPanel, this.gbc);
/*     */     
/* 146 */     this.gbc.gridx = 0;
/* 147 */     this.gbc.gridy = 1;
/* 148 */     this.gbc.weighty = 0.1D;
/* 149 */     this.gbc.insets = new Insets(0, -5, 0, -5);
/* 150 */     add(this.numberPanel, this.gbc);
/*     */     
/* 152 */     this.gbc.gridx = 0;
/* 153 */     this.gbc.gridy = 2;
/* 154 */     this.gbc.gridwidth = 1;
/* 155 */     this.gbc.weightx = 0.3D;
/* 156 */     this.gbc.weighty = 0.2D;
/* 157 */     this.gbc.insets = new Insets(40, 40, 0, 0);
/* 158 */     add(this.ll_code, this.gbc);
/*     */     
/* 160 */     this.gbc.gridx = 1;
/* 161 */     this.gbc.gridy = 2;
/* 162 */     this.gbc.weightx = 0.7D;
/* 163 */     this.gbc.insets = new Insets(40, 0, 0, 40);
/* 164 */     add(this.tf_code, this.gbc);
/*     */     
/* 166 */     this.gbc.gridx = 0;
/* 167 */     this.gbc.gridy = 3;
/* 168 */     this.gbc.weightx = 0.3D;
/* 169 */     this.gbc.insets = new Insets(0, 40, 0, 0);
/* 170 */     add(this.ll_name, this.gbc);
/*     */     
/* 172 */     this.gbc.gridx = 1;
/* 173 */     this.gbc.gridy = 3;
/* 174 */     this.gbc.weightx = 0.7D;
/* 175 */     this.gbc.insets = new Insets(0, 0, 0, 40);
/* 176 */     add(this.tf_name, this.gbc);
/*     */     
/* 178 */     this.gbc.gridx = 0;
/* 179 */     this.gbc.gridy = 4;
/* 180 */     this.gbc.weightx = 0.3D;
/* 181 */     this.gbc.insets = new Insets(0, 40, 0, 0);
/* 182 */     add(this.ll_start, this.gbc);
/*     */     
/* 184 */     this.gbc.gridx = 1;
/* 185 */     this.gbc.gridy = 4;
/* 186 */     this.gbc.weightx = 0.7D;
/* 187 */     this.gbc.insets = new Insets(0, 0, 0, 40);
/* 188 */     add(this.datePicker_start, this.gbc);
/*     */     
/* 190 */     this.gbc.gridx = 0;
/* 191 */     this.gbc.gridy = 5;
/* 192 */     this.gbc.weightx = 0.3D;
/* 193 */     this.gbc.insets = new Insets(0, 40, 40, 0);
/* 194 */     add(this.ll_end, this.gbc);
/*     */     
/* 196 */     this.gbc.gridx = 1;
/* 197 */     this.gbc.gridy = 5;
/* 198 */     this.gbc.weightx = 0.7D;
/* 199 */     this.gbc.insets = new Insets(0, 0, 40, 40);
/* 200 */     add(this.datePicker_end, this.gbc);
/*     */     
/* 202 */     this.gbc.fill = 0;
/*     */     
/* 204 */     this.gbc.gridx = 0;
/* 205 */     this.gbc.gridy = 6;
/* 206 */     this.gbc.gridwidth = 2;
/* 207 */     this.gbc.weightx = 1.0D;
/* 208 */     this.gbc.weighty = 0.09D;
/* 209 */     this.gbc.insets = new Insets(0, 0, 0, 0);
/* 210 */     add(this.bt_next, this.gbc);
/*     */   }
/*     */   
/*     */   public void setCode(String idf_cd)
/*     */   {
/* 215 */     this.tf_code.setText(idf_cd);
/*     */   }
/*     */   
/*     */   public void setData() throws ParseException
/*     */   {
/* 220 */     this.tf_code.setText(this.frame.getSurvey().getCode());
/* 221 */     this.tf_name.setText(this.frame.getSurvey().getName());
/*     */     
/* 223 */     Date start = new SimpleDateFormat("yyyy-MM-dd").parse(this.frame.getSurvey().getStart());
/* 224 */     this.model_start.setValue(start);
/*     */     
/* 226 */     Date end = new SimpleDateFormat("yyyy-MM-dd").parse(this.frame.getSurvey().getEnd());
/* 227 */     this.model_end.setValue(end);
/*     */   }
/*     */   
/*     */ 
/*     */   public void actionPerformed(ActionEvent e)
/*     */   {
/* 233 */     if (e.getSource().equals(this.bt_next))
/*     */     {
/* 235 */       if (this.tf_name.getText().trim().equals(""))
/*     */       {
/* 237 */         JOptionPane optionPane = new JOptionPane();
/* 238 */         JOptionPane.showMessageDialog(null, "'설문지 이름'이 비었습니다.");
/* 239 */         return;
/*     */       }
/* 241 */       if (this.model_start.getValue() == null)
/*     */       {
/* 243 */         JOptionPane optionPane = new JOptionPane();
/* 244 */         JOptionPane.showMessageDialog(null, "'시작 날짜'가 비었습니다.");
/* 245 */         return;
/*     */       }
/* 247 */       if (this.model_end.getValue() == null)
/*     */       {
/* 249 */         JOptionPane optionPane = new JOptionPane();
/* 250 */         JOptionPane.showMessageDialog(null, "'종료 날짜'가 비었습니다.");
/* 251 */         return;
/*     */       }
/*     */       
/* 254 */       String name = this.tf_name.getText();
/* 255 */       String start = new SimpleDateFormat("yyyy-MM-dd").format((Date)this.model_start.getValue());
/* 256 */       String end = new SimpleDateFormat("yyyy-MM-dd").format((Date)this.model_end.getValue());
/*     */       
/*     */ 
/* 259 */       this.frame.getSurvey().setName(name);
/* 260 */       this.frame.getSurvey().setStart(start);
/* 261 */       this.frame.getSurvey().setEnd(end);
/*     */       
/*     */ 
/* 264 */       this.frame.setName_Question_Add(name);
/*     */       
/* 266 */       this.frame.next();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Info_Add_Pl_Modify.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */