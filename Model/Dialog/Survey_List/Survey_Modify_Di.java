/*     */ package Model.Dialog.Survey_List;
/*     */ 
/*     */ import Enum.Enum_Table_Ci;
/*     */ import Worker.DateLabelFormatter;
/*     */ import Worker.Server;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.Font;
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
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JDialog;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JTextField;
/*     */ import org.jdatepicker.impl.JDatePanelImpl;
/*     */ import org.jdatepicker.impl.JDatePickerImpl;
/*     */ import org.jdatepicker.impl.UtilDateModel;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Survey_Modify_Di
/*     */   extends JDialog
/*     */   implements ActionListener
/*     */ {
/*  32 */   private GridBagLayout gbl = new GridBagLayout();
/*  33 */   private GridBagConstraints gbc = new GridBagConstraints();
/*     */   
/*     */ 
/*  36 */   private JLabel idf_ll = new JLabel();
/*  37 */   private JLabel survey_name_ll = new JLabel();
/*  38 */   private JLabel survey_start_ll = new JLabel();
/*  39 */   private JLabel survey_end_ll = new JLabel();
/*     */   
/*  41 */   private JTextField idf_tf = new JTextField();
/*  42 */   private JTextField survey_name_tf = new JTextField();
/*     */   
/*  44 */   private JButton confirm_bt = new JButton();
/*     */   
/*     */   private Server server;
/*     */   
/*  48 */   private UtilDateModel model_start = new UtilDateModel();
/*  49 */   private UtilDateModel model_end = new UtilDateModel();
/*     */   
/*  51 */   private JDatePanelImpl datePanel_start = new JDatePanelImpl(this.model_start, new Properties());
/*  52 */   private JDatePanelImpl datePanel_end = new JDatePanelImpl(this.model_end, new Properties());
/*     */   
/*  54 */   private DateLabelFormatter formatter = new DateLabelFormatter();
/*     */   
/*  56 */   private JDatePickerImpl datePicker_start = new JDatePickerImpl(this.datePanel_start, this.formatter);
/*  57 */   private JDatePickerImpl datePicker_end = new JDatePickerImpl(this.datePanel_end, this.formatter);
/*     */   
/*     */   private Enum_Table_Ci enum_table;
/*     */   private String idf_cd;
/*     */   private String survey_name;
/*     */   private String survey_start;
/*     */   private String survey_end;
/*     */   
/*     */   public Survey_Modify_Di(Server server, String idf_cd, String survey_name, String survey_start, String survey_end)
/*     */     throws SQLException, ParseException
/*     */   {
/*  68 */     this.server = server;
/*     */     
/*  70 */     this.idf_cd = idf_cd;
/*  71 */     this.survey_name = survey_name;
/*  72 */     this.survey_start = survey_start;
/*  73 */     this.survey_end = survey_end;
/*     */     
/*  75 */     Date date_start = new SimpleDateFormat("yyyy-MM-dd").parse(survey_start);
/*  76 */     Date date_end = new SimpleDateFormat("yyyy-MM-dd").parse(survey_end);
/*     */     
/*     */ 
/*  79 */     setPreferredSize(new Dimension(1200, 900));
/*  80 */     setMinimumSize(new Dimension(1200, 900));
/*  81 */     setMaximumSize(new Dimension(1200, 900));
/*  82 */     setLocationRelativeTo(null);
/*     */     
/*     */ 
/*  85 */     setLayout(this.gbl);
/*     */     
/*     */ 
/*     */ 
/*  89 */     this.idf_ll.setText("설문 코드");
/*  90 */     this.idf_ll.setFont(new Font("나눔바른고딕", 1, 20));
/*     */     
/*     */ 
/*  93 */     this.survey_name_ll.setText("설문지 이름");
/*  94 */     this.survey_name_ll.setFont(new Font("나눔바른고딕", 0, 20));
/*     */     
/*     */ 
/*  97 */     this.survey_start_ll.setText("설문 시작일");
/*  98 */     this.survey_start_ll.setFont(new Font("나눔바른고딕", 0, 20));
/*     */     
/*     */ 
/* 101 */     this.survey_end_ll.setText("설문 종료일");
/* 102 */     this.survey_end_ll.setFont(new Font("나눔바른고딕", 0, 20));
/*     */     
/*     */ 
/*     */ 
/* 106 */     this.idf_tf.setFont(new Font("나눔바른고딕", 0, 20));
/* 107 */     this.idf_tf.setEditable(false);
/* 108 */     this.idf_tf.setText(idf_cd);
/*     */     
/*     */ 
/* 111 */     this.survey_name_tf.setFont(new Font("나눔바른고딕", 0, 20));
/* 112 */     this.survey_name_tf.setText(survey_name);
/*     */     
/*     */ 
/*     */ 
/* 116 */     this.confirm_bt.setText("확인");
/* 117 */     this.confirm_bt.setFont(new Font("나눔바른고딕", 0, 23));
/* 118 */     this.confirm_bt.addActionListener(this);
/*     */     
/*     */ 
/* 121 */     this.gbc.anchor = 11;
/* 122 */     this.gbc.fill = 1;
/*     */     
/* 124 */     this.gbc.gridx = 0;
/* 125 */     this.gbc.gridy = 0;
/* 126 */     this.gbc.gridwidth = 1;
/* 127 */     this.gbc.gridheight = 1;
/* 128 */     this.gbc.weightx = 1.0D;
/* 129 */     this.gbc.weighty = 1.0D;
/* 130 */     this.gbc.insets = new Insets(0, 0, 0, 0);
/* 131 */     add(this.idf_ll, this.gbc);
/*     */     
/* 133 */     this.gbc.gridx = 1;
/* 134 */     this.gbc.gridy = 0;
/* 135 */     add(this.idf_tf, this.gbc);
/*     */     
/* 137 */     this.gbc.gridx = 0;
/* 138 */     this.gbc.gridy = 1;
/* 139 */     add(this.survey_name_ll, this.gbc);
/*     */     
/* 141 */     this.gbc.gridx = 1;
/* 142 */     this.gbc.gridy = 1;
/* 143 */     add(this.survey_name_tf, this.gbc);
/*     */     
/* 145 */     this.gbc.gridx = 0;
/* 146 */     this.gbc.gridy = 2;
/* 147 */     add(this.survey_start_ll, this.gbc);
/*     */     
/* 149 */     this.gbc.gridx = 1;
/* 150 */     this.gbc.gridy = 2;
/* 151 */     add(this.datePicker_start, this.gbc);
/*     */     
/* 153 */     this.gbc.gridx = 0;
/* 154 */     this.gbc.gridy = 3;
/* 155 */     add(this.survey_end_ll, this.gbc);
/*     */     
/* 157 */     this.gbc.gridx = 1;
/* 158 */     this.gbc.gridy = 3;
/* 159 */     add(this.datePicker_end, this.gbc);
/*     */     
/* 161 */     this.gbc.gridx = 0;
/* 162 */     this.gbc.gridy = 4;
/* 163 */     this.gbc.gridwidth = 2;
/* 164 */     add(this.confirm_bt, this.gbc);
/*     */     
/* 166 */     this.model_start.setValue(date_start);
/* 167 */     this.model_end.setValue(date_end);
/*     */   }
/*     */   
/*     */ 
/*     */   public void actionPerformed(ActionEvent e)
/*     */   {
/* 173 */     if (e.getSource().equals(this.confirm_bt))
/*     */     {
/* 175 */       String[] original = { this.idf_cd, this.survey_name, this.survey_start, this.survey_end };
/*     */       
/* 177 */       String idf_beModify = this.idf_tf.getText();
/* 178 */       String name_beModify = this.survey_name_tf.getText();
/* 179 */       String start_beModify = new SimpleDateFormat("yyyy-MM-dd").format((Date)this.model_start.getValue());
/* 180 */       String end_beModify = new SimpleDateFormat("yyyy-MM-dd").format((Date)this.model_end.getValue());
/*     */       
/* 182 */       String[] beModify = { idf_beModify, name_beModify, start_beModify, end_beModify };
/*     */       
/* 184 */       String[] idx_sql = { "IDF_CD", "SURVEY_NM", "START_DT", "END_DT" };
/*     */       
/*     */       try
/*     */       {
/* 188 */         this.server.db_modifyData(Enum_Table_Ci.T003, idx_sql, original, beModify);
/*     */       }
/*     */       catch (SQLException e1)
/*     */       {
/* 192 */         e1.printStackTrace();
/*     */       }
/*     */       
/* 195 */       dispose();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Survey_Modify_Di.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */