/*     */ package Model.Dialog.Survey_List;
/*     */ 
/*     */ import Enum.Enum_Table_Ci;
/*     */ import Model.Dialog.Survey_List.Question_Management.BorderPanel;
/*     */ import Model.Dialog.Survey_List.Question_Management.NumberPanel;
/*     */ import Worker.DateLabelFormatter;
/*     */ import Worker.ImageController;
/*     */ import Worker.RadomKey;
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
/*     */ import javax.swing.border.Border;
/*     */ import javax.swing.event.ChangeEvent;
/*     */ import javax.swing.event.ChangeListener;
/*     */ import javax.swing.event.DocumentEvent;
/*     */ import javax.swing.event.DocumentListener;
/*     */ import javax.swing.text.Document;
/*     */ import org.jdatepicker.impl.JDatePanelImpl;
/*     */ import org.jdatepicker.impl.JDatePickerImpl;
/*     */ import org.jdatepicker.impl.UtilDateModel;
/*     */ 
/*     */ public class Survey_Add_Di
/*     */   extends JPanel
/*     */   implements ActionListener, DocumentListener, ChangeListener
/*     */ {
/*  47 */   private GridBagLayout gbl = new GridBagLayout();
/*  48 */   private GridBagConstraints gbc = new GridBagConstraints();
/*     */   
/*     */   private Image img_ll;
/*     */   
/*     */   private Image img_next;
/*     */   
/*  54 */   private JLabel idf_ll = new JLabel();
/*  55 */   private JLabel survey_name_ll = new JLabel();
/*  56 */   private JLabel survey_start_ll = new JLabel();
/*  57 */   private JLabel survey_end_ll = new JLabel();
/*     */   
/*  59 */   private JTextField idf_tf = new JTextField();
/*  60 */   private JTextField survey_name_tf = new JTextField();
/*     */   
/*  62 */   private JButton next_bt = new JButton();
/*     */   
/*     */   private Server server;
/*     */   
/*  66 */   private UtilDateModel model_start = new UtilDateModel();
/*  67 */   private UtilDateModel model_end = new UtilDateModel();
/*     */   
/*  69 */   private JDatePanelImpl datePanel_start = new JDatePanelImpl(this.model_start, new Properties());
/*  70 */   private JDatePanelImpl datePanel_end = new JDatePanelImpl(this.model_end, new Properties());
/*     */   
/*  72 */   private DateLabelFormatter formatter = new DateLabelFormatter();
/*     */   
/*  74 */   private JDatePickerImpl datePicker_start = new JDatePickerImpl(this.datePanel_start, this.formatter);
/*  75 */   private JDatePickerImpl datePicker_end = new JDatePickerImpl(this.datePanel_end, this.formatter);
/*     */   
/*     */   private Enum_Table_Ci enum_table;
/*     */   
/*  79 */   private RadomKey keyWorker = new RadomKey();
/*     */   
/*     */   private Survey_Frame_Cl frame;
/*     */   
/*     */   private BorderPanel borderPanel;
/*     */   
/*     */   private NumberPanel numberPanel;
/*     */   
/*  87 */   private Border paddingBorder = BorderFactory.createEmptyBorder(0, 20, 0, 0);
/*  88 */   private Border border = BorderFactory.createMatteBorder(2, 0, 2, 0, new Color(229, 229, 229));
/*     */   
/*     */   public Survey_Add_Di(Server server, Survey_Frame_Cl frame) throws SQLException, ParseException
/*     */   {
/*  92 */     this.server = server;
/*  93 */     this.frame = frame;
/*     */     
/*  95 */     this.img_ll = ImageController.resizeImage(new ImageIcon(getClass().getResource("/Image/outline_done_black_36dp.png")), 28, 28);
/*  96 */     this.img_next = ImageController.resizeImage(new ImageIcon(getClass().getResource("/Image/outline_keyboard_arrow_right_white_36dp.png")), 28, 28);
/*     */     
/*     */ 
/*  99 */     setLayout(this.gbl);
/* 100 */     setBackground(Color.WHITE);
/*     */     
/*     */ 
/* 103 */     this.borderPanel = new BorderPanel(frame, 0);
/* 104 */     this.numberPanel = new NumberPanel(0);
/*     */     
/*     */ 
/*     */ 
/* 108 */     this.idf_ll.setText(" 설문 코드");
/* 109 */     this.idf_ll.setIcon(new ImageIcon(this.img_ll));
/* 110 */     this.idf_ll.setFont(new Font("나눔바른고딕", 0, 20));
/* 111 */     this.idf_ll.setBackground(new Color(249, 249, 249));
/* 112 */     this.idf_ll.setOpaque(true);
/* 113 */     this.idf_ll.setBorder(BorderFactory.createCompoundBorder(this.border, this.paddingBorder));
/*     */     
/*     */ 
/* 116 */     this.survey_name_ll.setText(" 설문지 이름");
/* 117 */     this.survey_name_ll.setIcon(new ImageIcon(this.img_ll));
/* 118 */     this.survey_name_ll.setFont(new Font("나눔바른고딕", 0, 20));
/* 119 */     this.survey_name_ll.setBackground(new Color(249, 249, 249));
/* 120 */     this.survey_name_ll.setOpaque(true);
/* 121 */     this.survey_name_ll.setBorder(BorderFactory.createCompoundBorder(this.border, this.paddingBorder));
/*     */     
/*     */ 
/* 124 */     this.survey_start_ll.setText(" 설문 시작일");
/* 125 */     this.survey_start_ll.setIcon(new ImageIcon(this.img_ll));
/* 126 */     this.survey_start_ll.setFont(new Font("나눔바른고딕", 0, 20));
/* 127 */     this.survey_start_ll.setBackground(new Color(249, 249, 249));
/* 128 */     this.survey_start_ll.setOpaque(true);
/* 129 */     this.survey_start_ll.setBorder(BorderFactory.createCompoundBorder(this.border, this.paddingBorder));
/*     */     
/*     */ 
/* 132 */     this.survey_end_ll.setText(" 설문 종료일");
/* 133 */     this.survey_end_ll.setIcon(new ImageIcon(this.img_ll));
/* 134 */     this.survey_end_ll.setFont(new Font("나눔바른고딕", 0, 20));
/* 135 */     this.survey_end_ll.setBackground(new Color(249, 249, 249));
/* 136 */     this.survey_end_ll.setOpaque(true);
/* 137 */     this.survey_end_ll.setBorder(BorderFactory.createCompoundBorder(this.border, this.paddingBorder));
/*     */     
/*     */ 
/*     */ 
/* 141 */     this.idf_tf.setFont(new Font("나눔바른고딕", 0, 20));
/* 142 */     this.idf_tf.setEditable(false);
/* 143 */     this.idf_tf.setText(RadomKey.generateKey(System.currentTimeMillis()));
/* 144 */     this.idf_tf.setBackground(Color.WHITE);
/* 145 */     this.idf_tf.setBorder(BorderFactory.createCompoundBorder(this.border, this.paddingBorder));
/*     */     
/*     */ 
/* 148 */     this.survey_name_tf.setFont(new Font("나눔바른고딕", 0, 20));
/* 149 */     this.survey_name_tf.setBorder(BorderFactory.createCompoundBorder(this.border, this.paddingBorder));
/* 150 */     this.survey_name_tf.getDocument().addDocumentListener(this);
/*     */     
/*     */ 
/*     */ 
/* 154 */     this.next_bt.setText("다음");
/* 155 */     this.next_bt.setOpaque(true);
/* 156 */     this.next_bt.setBackground(new Color(12, 151, 189));
/* 157 */     this.next_bt.setForeground(Color.WHITE);
/* 158 */     this.next_bt.setFont(new Font("나눔바른고딕", 0, 20));
/* 159 */     this.next_bt.setIcon(new ImageIcon(this.img_next));
/* 160 */     this.next_bt.setHorizontalTextPosition(2);
/* 161 */     this.next_bt.setHorizontalAlignment(4);
/* 162 */     this.next_bt.setCursor(new Cursor(12));
/* 163 */     this.next_bt.addActionListener(this);
/* 164 */     this.next_bt.setPreferredSize(new Dimension(110, 50));
/*     */     
/* 166 */     this.datePicker_start.setBackground(Color.WHITE);
/* 167 */     this.datePicker_start.setBorder(BorderFactory.createCompoundBorder(this.border, BorderFactory.createEmptyBorder(0, 0, 0, 0)));
/* 168 */     this.datePicker_start.getJFormattedTextField().setFont(new Font("나눔바른고딕", 0, 18));
/* 169 */     this.datePicker_start.getJFormattedTextField().setMargin(new Insets(0, 10, 0, 0));
/* 170 */     this.model_start.addChangeListener(this);
/*     */     
/* 172 */     this.datePicker_end.setBackground(Color.WHITE);
/* 173 */     this.datePicker_end.setBorder(BorderFactory.createCompoundBorder(this.border, BorderFactory.createEmptyBorder(0, 0, 0, 0)));
/* 174 */     this.datePicker_end.getJFormattedTextField().setFont(new Font("나눔바른고딕", 0, 18));
/* 175 */     this.datePicker_end.getJFormattedTextField().setMargin(new Insets(0, 10, 0, 0));
/*     */     
/*     */ 
/* 178 */     Survey_Frame_Cl.getInfo().setCode(this.idf_tf.getText());
/*     */     
/*     */ 
/* 181 */     this.gbc.anchor = 11;
/* 182 */     this.gbc.fill = 1;
/*     */     
/* 184 */     this.gbc.gridx = 0;
/* 185 */     this.gbc.gridy = 0;
/* 186 */     this.gbc.gridwidth = 2;
/* 187 */     this.gbc.gridheight = 1;
/* 188 */     this.gbc.weightx = 1.0D;
/* 189 */     this.gbc.weighty = 0.01D;
/* 190 */     this.gbc.insets = new Insets(0, 0, 0, 0);
/* 191 */     add(this.borderPanel, this.gbc);
/*     */     
/* 193 */     this.gbc.gridx = 0;
/* 194 */     this.gbc.gridy = 1;
/* 195 */     this.gbc.weighty = 0.1D;
/* 196 */     add(this.numberPanel, this.gbc);
/*     */     
/* 198 */     this.gbc.gridx = 0;
/* 199 */     this.gbc.gridy = 2;
/* 200 */     this.gbc.gridwidth = 1;
/* 201 */     this.gbc.weightx = 0.3D;
/* 202 */     this.gbc.weighty = 0.2D;
/* 203 */     this.gbc.insets = new Insets(40, 40, 0, 0);
/* 204 */     add(this.idf_ll, this.gbc);
/*     */     
/* 206 */     this.gbc.gridx = 1;
/* 207 */     this.gbc.gridy = 2;
/* 208 */     this.gbc.weightx = 0.7D;
/* 209 */     this.gbc.insets = new Insets(40, 0, 0, 40);
/* 210 */     add(this.idf_tf, this.gbc);
/*     */     
/* 212 */     this.gbc.gridx = 0;
/* 213 */     this.gbc.gridy = 3;
/* 214 */     this.gbc.weightx = 0.3D;
/* 215 */     this.gbc.insets = new Insets(0, 40, 0, 0);
/* 216 */     add(this.survey_name_ll, this.gbc);
/*     */     
/* 218 */     this.gbc.gridx = 1;
/* 219 */     this.gbc.gridy = 3;
/* 220 */     this.gbc.weightx = 0.7D;
/* 221 */     this.gbc.insets = new Insets(0, 0, 0, 40);
/* 222 */     add(this.survey_name_tf, this.gbc);
/*     */     
/* 224 */     this.gbc.gridx = 0;
/* 225 */     this.gbc.gridy = 4;
/* 226 */     this.gbc.weightx = 0.3D;
/* 227 */     this.gbc.insets = new Insets(0, 40, 0, 0);
/* 228 */     add(this.survey_start_ll, this.gbc);
/*     */     
/* 230 */     this.gbc.gridx = 1;
/* 231 */     this.gbc.gridy = 4;
/* 232 */     this.gbc.weightx = 0.7D;
/* 233 */     this.gbc.insets = new Insets(0, 0, 0, 40);
/* 234 */     add(this.datePicker_start, this.gbc);
/*     */     
/* 236 */     this.gbc.gridx = 0;
/* 237 */     this.gbc.gridy = 5;
/* 238 */     this.gbc.weightx = 0.3D;
/* 239 */     this.gbc.insets = new Insets(0, 40, 40, 0);
/* 240 */     add(this.survey_end_ll, this.gbc);
/*     */     
/* 242 */     this.gbc.gridx = 1;
/* 243 */     this.gbc.gridy = 5;
/* 244 */     this.gbc.weightx = 0.7D;
/* 245 */     this.gbc.insets = new Insets(0, 0, 40, 40);
/* 246 */     add(this.datePicker_end, this.gbc);
/*     */     
/* 248 */     this.gbc.fill = 0;
/*     */     
/* 250 */     this.gbc.gridx = 0;
/* 251 */     this.gbc.gridy = 6;
/* 252 */     this.gbc.gridwidth = 2;
/* 253 */     this.gbc.weightx = 1.0D;
/* 254 */     this.gbc.weighty = 0.09D;
/* 255 */     this.gbc.insets = new Insets(0, 0, 0, 0);
/* 256 */     add(this.next_bt, this.gbc);
/*     */   }
/*     */   
/*     */ 
/*     */   public void actionPerformed(ActionEvent e)
/*     */   {
/* 262 */     if (e.getSource().equals(this.next_bt))
/*     */     {
/* 264 */       if (this.idf_tf.getText().trim().equals(""))
/*     */       {
/* 266 */         JOptionPane optionPane = new JOptionPane();
/* 267 */         JOptionPane.showMessageDialog(null, "'고유 코드'가 비었습니다.");
/* 268 */         return;
/*     */       }
/* 270 */       if (this.survey_name_tf.getText().trim().equals(""))
/*     */       {
/* 272 */         JOptionPane optionPane = new JOptionPane();
/* 273 */         JOptionPane.showMessageDialog(null, "'설문지 이름'이 비었습니다.");
/* 274 */         return;
/*     */       }
/* 276 */       if (this.model_start.getValue() == null)
/*     */       {
/* 278 */         JOptionPane optionPane = new JOptionPane();
/* 279 */         JOptionPane.showMessageDialog(null, "'시작 날짜'가 비었습니다.");
/* 280 */         return;
/*     */       }
/* 282 */       if (this.model_end.getValue() == null)
/*     */       {
/* 284 */         JOptionPane optionPane = new JOptionPane();
/* 285 */         JOptionPane.showMessageDialog(null, "'종료 날짜'가 비었습니다.");
/* 286 */         return;
/*     */       }
/*     */       
/* 289 */       this.frame.next();
/*     */     }
/*     */   }
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
/*     */   public void changedUpdate(DocumentEvent arg0) {}
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
/*     */   public void insertUpdate(DocumentEvent arg0)
/*     */   {
/* 320 */     Survey_Frame_Cl.getInfo().setName(this.survey_name_tf.getText());
/* 321 */     this.frame.setTitle(Survey_Frame_Cl.getInfo().getName());
/*     */   }
/*     */   
/*     */ 
/*     */   public void removeUpdate(DocumentEvent arg0)
/*     */   {
/* 327 */     Survey_Frame_Cl.getInfo().setName(this.survey_name_tf.getText());
/* 328 */     this.frame.setTitle(Survey_Frame_Cl.getInfo().getName());
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void stateChanged(ChangeEvent arg0)
/*     */   {
/* 335 */     if ((arg0.getSource().equals(this.model_start)) && (this.model_start.getValue() != null))
/*     */     {
/* 337 */       Survey_Frame_Cl.getInfo().setStart(new SimpleDateFormat("yyyy-MM-dd").format((Date)this.model_start.getValue()));
/*     */     }
/* 339 */     else if ((arg0.getSource().equals(this.model_end)) && (this.model_end.getValue() != null))
/*     */     {
/* 341 */       Survey_Frame_Cl.getInfo().setEnd(new SimpleDateFormat("yyyy-MM-dd").format((Date)this.model_end.getValue()));
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Survey_Add_Di.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */