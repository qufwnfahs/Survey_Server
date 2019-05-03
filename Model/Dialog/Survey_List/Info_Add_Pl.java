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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Info_Add_Pl
/*     */   extends JPanel
/*     */   implements ActionListener
/*     */ {
/*  45 */   private GridBagLayout gbl = new GridBagLayout();
/*  46 */   private GridBagConstraints gbc = new GridBagConstraints();
/*     */   
/*     */   private BorderPanel borderPanel;
/*     */   
/*  50 */   private NumberPanel numberPanel = new NumberPanel(0);
/*  51 */   private JLabel ll_code = new JLabel();
/*  52 */   private JLabel ll_name = new JLabel();
/*  53 */   private JLabel ll_start = new JLabel();
/*  54 */   private JLabel ll_end = new JLabel();
/*  55 */   private JTextField tf_code = new JTextField();
/*  56 */   private JTextField tf_name = new JTextField();
/*  57 */   private UtilDateModel model_start = new UtilDateModel();
/*  58 */   private UtilDateModel model_end = new UtilDateModel();
/*  59 */   private JDatePanelImpl datePanel_start = new JDatePanelImpl(this.model_start, new Properties());
/*  60 */   private JDatePanelImpl datePanel_end = new JDatePanelImpl(this.model_end, new Properties());
/*  61 */   private JDatePickerImpl datePicker_start = new JDatePickerImpl(this.datePanel_start, new DateLabelFormatter());
/*  62 */   private JDatePickerImpl datePicker_end = new JDatePickerImpl(this.datePanel_end, new DateLabelFormatter());
/*  63 */   private JButton bt_next = new JButton();
/*     */   
/*     */   private Card_Survey_Fr frame;
/*     */   
/*     */   public Info_Add_Pl(Card_Survey_Fr frame)
/*     */     throws SQLException, ParseException
/*     */   {
/*  70 */     this.frame = frame;
/*     */     
/*     */ 
/*  73 */     setLayout(this.gbl);
/*  74 */     setBackground(Color.WHITE);
/*     */     
/*     */ 
/*  77 */     this.borderPanel = new BorderPanel(frame, 0);
/*     */     
/*  79 */     this.ll_code.setText(" 설문 코드");
/*  80 */     this.ll_code.setFont(Enum_Font_Ci.INFO.getFont());
/*  81 */     this.ll_code.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.LABEL.getImageIcon(), 28, 28)));
/*  82 */     this.ll_code.setBackground(new Color(249, 249, 249));
/*  83 */     this.ll_code.setOpaque(true);
/*  84 */     this.ll_code.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(2, 0, 2, 0, new Color(229, 229, 229)), BorderFactory.createEmptyBorder(0, 20, 0, 0)));
/*     */     
/*  86 */     this.ll_name.setText(" 설문지 이름");
/*  87 */     this.ll_name.setFont(Enum_Font_Ci.INFO.getFont());
/*  88 */     this.ll_name.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.LABEL.getImageIcon(), 28, 28)));
/*  89 */     this.ll_name.setBackground(new Color(249, 249, 249));
/*  90 */     this.ll_name.setOpaque(true);
/*  91 */     this.ll_name.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(2, 0, 2, 0, new Color(229, 229, 229)), BorderFactory.createEmptyBorder(0, 20, 0, 0)));
/*     */     
/*  93 */     this.ll_start.setText(" 설문 시작 날짜");
/*  94 */     this.ll_start.setFont(Enum_Font_Ci.INFO.getFont());
/*  95 */     this.ll_start.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.LABEL.getImageIcon(), 28, 28)));
/*  96 */     this.ll_start.setBackground(new Color(249, 249, 249));
/*  97 */     this.ll_start.setOpaque(true);
/*  98 */     this.ll_start.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(2, 0, 2, 0, new Color(229, 229, 229)), BorderFactory.createEmptyBorder(0, 20, 0, 0)));
/*     */     
/* 100 */     this.ll_end.setText(" 설문 종료 날짜");
/* 101 */     this.ll_end.setFont(Enum_Font_Ci.INFO.getFont());
/* 102 */     this.ll_end.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.LABEL.getImageIcon(), 28, 28)));
/* 103 */     this.ll_end.setBackground(new Color(249, 249, 249));
/* 104 */     this.ll_end.setOpaque(true);
/* 105 */     this.ll_end.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(2, 0, 2, 0, new Color(229, 229, 229)), BorderFactory.createEmptyBorder(0, 20, 0, 0)));
/*     */     
/* 107 */     this.tf_code.setText(frame.getSurvey().getCode());
/* 108 */     this.tf_code.setFont(Enum_Font_Ci.INFO.getFont());
/* 109 */     this.tf_code.setEditable(false);
/* 110 */     this.tf_code.setBackground(Color.WHITE);
/* 111 */     this.tf_code.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(2, 0, 2, 0, new Color(229, 229, 229)), BorderFactory.createEmptyBorder(0, 20, 0, 0)));
/*     */     
/* 113 */     this.tf_name.setFont(Enum_Font_Ci.INFO.getFont());
/* 114 */     this.tf_name.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(2, 0, 2, 0, new Color(229, 229, 229)), BorderFactory.createEmptyBorder(0, 20, 0, 0)));
/*     */     
/* 116 */     this.bt_next.setText("다음");
/* 117 */     this.bt_next.setFont(Enum_Font_Ci.INFO.getFont());
/* 118 */     this.bt_next.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.NEXT.getImageIcon(), 28, 28)));
/* 119 */     this.bt_next.setOpaque(true);
/* 120 */     this.bt_next.setBackground(new Color(12, 151, 189));
/* 121 */     this.bt_next.setForeground(Color.WHITE);
/* 122 */     this.bt_next.setHorizontalTextPosition(2);
/* 123 */     this.bt_next.setHorizontalAlignment(4);
/* 124 */     this.bt_next.setCursor(new Cursor(12));
/* 125 */     this.bt_next.addActionListener(this);
/* 126 */     this.bt_next.setPreferredSize(new Dimension(110, 50));
/*     */     
/* 128 */     this.datePicker_start.setBackground(Color.WHITE);
/* 129 */     this.datePicker_start.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(2, 0, 2, 0, new Color(229, 229, 229)), BorderFactory.createEmptyBorder(0, 0, 0, 0)));
/* 130 */     this.datePicker_start.getJFormattedTextField().setFont(Enum_Font_Ci.DATEPICKER.getFont());
/* 131 */     this.datePicker_start.getJFormattedTextField().setMargin(new Insets(0, 10, 0, 0));
/*     */     
/* 133 */     this.datePicker_end.setBackground(Color.WHITE);
/* 134 */     this.datePicker_end.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(2, 0, 2, 0, new Color(229, 229, 229)), BorderFactory.createEmptyBorder(0, 0, 0, 0)));
/* 135 */     this.datePicker_end.getJFormattedTextField().setFont(Enum_Font_Ci.DATEPICKER.getFont());
/* 136 */     this.datePicker_end.getJFormattedTextField().setMargin(new Insets(0, 10, 0, 0));
/*     */     
/*     */ 
/* 139 */     this.gbc.anchor = 11;
/* 140 */     this.gbc.fill = 1;
/*     */     
/* 142 */     this.gbc.gridx = 0;
/* 143 */     this.gbc.gridy = 0;
/* 144 */     this.gbc.gridwidth = 2;
/* 145 */     this.gbc.gridheight = 1;
/* 146 */     this.gbc.weightx = 1.0D;
/* 147 */     this.gbc.weighty = 0.01D;
/* 148 */     this.gbc.insets = new Insets(-5, 0, 0, -2);
/* 149 */     add(this.borderPanel, this.gbc);
/*     */     
/* 151 */     this.gbc.gridx = 0;
/* 152 */     this.gbc.gridy = 1;
/* 153 */     this.gbc.weighty = 0.1D;
/* 154 */     this.gbc.insets = new Insets(0, -5, 0, -5);
/* 155 */     add(this.numberPanel, this.gbc);
/*     */     
/* 157 */     this.gbc.gridx = 0;
/* 158 */     this.gbc.gridy = 2;
/* 159 */     this.gbc.gridwidth = 1;
/* 160 */     this.gbc.weightx = 0.3D;
/* 161 */     this.gbc.weighty = 0.2D;
/* 162 */     this.gbc.insets = new Insets(40, 40, 0, 0);
/* 163 */     add(this.ll_code, this.gbc);
/*     */     
/* 165 */     this.gbc.gridx = 1;
/* 166 */     this.gbc.gridy = 2;
/* 167 */     this.gbc.weightx = 0.7D;
/* 168 */     this.gbc.insets = new Insets(40, 0, 0, 40);
/* 169 */     add(this.tf_code, this.gbc);
/*     */     
/* 171 */     this.gbc.gridx = 0;
/* 172 */     this.gbc.gridy = 3;
/* 173 */     this.gbc.weightx = 0.3D;
/* 174 */     this.gbc.insets = new Insets(0, 40, 0, 0);
/* 175 */     add(this.ll_name, this.gbc);
/*     */     
/* 177 */     this.gbc.gridx = 1;
/* 178 */     this.gbc.gridy = 3;
/* 179 */     this.gbc.weightx = 0.7D;
/* 180 */     this.gbc.insets = new Insets(0, 0, 0, 40);
/* 181 */     add(this.tf_name, this.gbc);
/*     */     
/* 183 */     this.gbc.gridx = 0;
/* 184 */     this.gbc.gridy = 4;
/* 185 */     this.gbc.weightx = 0.3D;
/* 186 */     this.gbc.insets = new Insets(0, 40, 0, 0);
/* 187 */     add(this.ll_start, this.gbc);
/*     */     
/* 189 */     this.gbc.gridx = 1;
/* 190 */     this.gbc.gridy = 4;
/* 191 */     this.gbc.weightx = 0.7D;
/* 192 */     this.gbc.insets = new Insets(0, 0, 0, 40);
/* 193 */     add(this.datePicker_start, this.gbc);
/*     */     
/* 195 */     this.gbc.gridx = 0;
/* 196 */     this.gbc.gridy = 5;
/* 197 */     this.gbc.weightx = 0.3D;
/* 198 */     this.gbc.insets = new Insets(0, 40, 40, 0);
/* 199 */     add(this.ll_end, this.gbc);
/*     */     
/* 201 */     this.gbc.gridx = 1;
/* 202 */     this.gbc.gridy = 5;
/* 203 */     this.gbc.weightx = 0.7D;
/* 204 */     this.gbc.insets = new Insets(0, 0, 40, 40);
/* 205 */     add(this.datePicker_end, this.gbc);
/*     */     
/* 207 */     this.gbc.fill = 0;
/*     */     
/* 209 */     this.gbc.gridx = 0;
/* 210 */     this.gbc.gridy = 6;
/* 211 */     this.gbc.gridwidth = 2;
/* 212 */     this.gbc.weightx = 1.0D;
/* 213 */     this.gbc.weighty = 0.09D;
/* 214 */     this.gbc.insets = new Insets(0, 0, 0, 0);
/* 215 */     add(this.bt_next, this.gbc);
/*     */   }
/*     */   
/*     */   public void setCode(String idf_cd)
/*     */   {
/* 220 */     this.tf_code.setText(idf_cd);
/*     */   }
/*     */   
/*     */ 
/*     */   public void actionPerformed(ActionEvent e)
/*     */   {
/* 226 */     if (e.getSource().equals(this.bt_next))
/*     */     {
/* 228 */       if (this.tf_name.getText().trim().equals(""))
/*     */       {
/* 230 */         JOptionPane optionPane = new JOptionPane();
/* 231 */         JOptionPane.showMessageDialog(null, "'설문지 이름'이 비었습니다.");
/* 232 */         return;
/*     */       }
/* 234 */       if (this.model_start.getValue() == null)
/*     */       {
/* 236 */         JOptionPane optionPane = new JOptionPane();
/* 237 */         JOptionPane.showMessageDialog(null, "'시작 날짜'가 비었습니다.");
/* 238 */         return;
/*     */       }
/* 240 */       if (this.model_end.getValue() == null)
/*     */       {
/* 242 */         JOptionPane optionPane = new JOptionPane();
/* 243 */         JOptionPane.showMessageDialog(null, "'종료 날짜'가 비었습니다.");
/* 244 */         return;
/*     */       }
/*     */       
/* 247 */       String name = this.tf_name.getText();
/* 248 */       String start = new SimpleDateFormat("yyyy-MM-dd").format((Date)this.model_start.getValue());
/* 249 */       String end = new SimpleDateFormat("yyyy-MM-dd").format((Date)this.model_end.getValue());
/*     */       
/*     */ 
/* 252 */       this.frame.getSurvey().setName(name);
/* 253 */       this.frame.getSurvey().setStart(start);
/* 254 */       this.frame.getSurvey().setEnd(end);
/*     */       
/*     */ 
/* 257 */       this.frame.setName_Question_Add(name);
/*     */       
/* 259 */       this.frame.next();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Info_Add_Pl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */