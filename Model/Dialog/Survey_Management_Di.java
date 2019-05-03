/*     */ package Model.Dialog;
/*     */ 
/*     */ import Enum.Enum_Table_Ci;
/*     */ import Model.Dialog.Survey_List.Question_Management.BorderPanel;
/*     */ import Worker.Database;
/*     */ import Worker.ImageController;
/*     */ import Worker.Server;
/*     */ import java.awt.CardLayout;
/*     */ import java.awt.Color;
/*     */ import java.awt.Container;
/*     */ import java.awt.Cursor;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.Font;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.GridBagLayout;
/*     */ import java.awt.Image;
/*     */ import java.awt.Insets;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.KeyEvent;
/*     */ import java.awt.event.KeyListener;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.sql.SQLException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.DefaultListCellRenderer;
/*     */ import javax.swing.DefaultListModel;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JComboBox;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JList;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JRootPane;
/*     */ import javax.swing.JScrollPane;
/*     */ import javax.swing.JTable;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.JViewport;
/*     */ import javax.swing.ListModel;
/*     */ import javax.swing.ListSelectionModel;
/*     */ import javax.swing.UIManager;
/*     */ import javax.swing.event.ListSelectionEvent;
/*     */ import javax.swing.event.ListSelectionListener;
/*     */ import javax.swing.table.DefaultTableCellRenderer;
/*     */ import javax.swing.table.DefaultTableModel;
/*     */ import javax.swing.table.JTableHeader;
/*     */ import javax.swing.table.TableColumn;
/*     */ import javax.swing.table.TableColumnModel;
/*     */ import javax.swing.table.TableModel;
/*     */ 
/*     */ public class Survey_Management_Di extends JFrame implements java.awt.event.ActionListener, java.awt.event.MouseListener, KeyListener, ListSelectionListener
/*     */ {
/*  56 */   private CardLayout card = new CardLayout();
/*     */   
/*  58 */   private GridBagLayout gbl = new GridBagLayout();
/*  59 */   private GridBagConstraints gbc = new GridBagConstraints();
/*     */   
/*     */ 
/*  62 */   private JPanel pl_m = new JPanel();
/*     */   
/*  64 */   private JLabel title_ll = new JLabel();
/*     */   
/*  66 */   private JButton search_bt = new JButton();
/*  67 */   private JButton prev_bt = new JButton();
/*  68 */   private JButton next_bt = new JButton();
/*  69 */   private JButton reset_bt = new JButton();
/*     */   
/*     */   private Image img_Left;
/*     */   
/*     */   private Image img_Right;
/*     */   private Image img_Search;
/*     */   private Image img_Reset;
/*     */   private Image img_Add;
/*  77 */   private JComboBox cb_searchIdx = new JComboBox();
/*     */   
/*  79 */   private JTextField tf_search = new JTextField();
/*     */   
/*  81 */   private BorderPanel borderPanel = new BorderPanel(this, 0);
/*     */   
/*  83 */   private JTable survey_tb = new JTable();
/*     */   
/*     */   private DefaultTableModel defaultTableModel;
/*     */   
/*  87 */   private List<DefaultTableModel> list_tbModel = new ArrayList();
/*  88 */   private List<DefaultListModel> list_ltModel = new ArrayList();
/*     */   
/*     */   private ListSelectionModel rowSelectionModel;
/*     */   
/*     */   private DefaultTableCellRenderer tCellRenderer;
/*     */   
/*     */   private DefaultListCellRenderer lCellRenderer;
/*     */   
/*     */   private JScrollPane tb_scroll;
/*     */   
/*     */   private Server server;
/*     */   
/*     */   private Enum_Table_Ci enum_table;
/*     */   
/*     */   private Model.Dialog.Survey_List.Survey_Frame_Cl survey_Frame;
/* 103 */   private int[] widths = { 70, 200, 650, 130, 130 };
/*     */   
/* 105 */   private String[] index = { "   고유 번호", "   설문지 이름", "   등록 날짜" };
/* 106 */   private String[] index_NoSpace = { "번호", "고유 번호", "설문지 이름", "등록 날짜", "응답 인원" };
/*     */   
/* 108 */   private JList jlist = new JList();
/*     */   
/*     */   public Survey_Management_Di() throws SQLException {
/* 111 */     UIManager.put("List.focusCellHighlightBorder", BorderFactory.createEmptyBorder());
/*     */     
/* 113 */     this.img_Left = ImageController.resizeImage(
/* 114 */       new ImageIcon(getClass().getResource("/Image/sharp_keyboard_arrow_left_black_36dp.png")), 34, 34);
/* 115 */     this.img_Right = ImageController.resizeImage(
/* 116 */       new ImageIcon(getClass().getResource("/Image/sharp_keyboard_arrow_right_black_36dp.png")), 34, 34);
/* 117 */     this.img_Search = ImageController.resizeImage(
/* 118 */       new ImageIcon(getClass().getResource("/Image/outline_search_white_36dp.png")), 28, 28);
/* 119 */     this.img_Reset = ImageController.resizeImage(
/* 120 */       new ImageIcon(getClass().getResource("/Image/outline_autorenew_white_36dp.png")), 28, 28);
/* 121 */     this.img_Add = ImageController.resizeImage(
/* 122 */       new ImageIcon(getClass().getResource("/Image/outline_library_add_white_36dp.png")), 28, 28);
/*     */     
/*     */ 
/* 125 */     setPreferredSize(new Dimension(1200, 900));
/* 126 */     setMinimumSize(new Dimension(1200, 900));
/* 127 */     setMaximumSize(new Dimension(1200, 900));
/* 128 */     setLocationRelativeTo(null);
/* 129 */     setUndecorated(true);
/* 130 */     setLayout(this.card);
/* 131 */     getRootPane().setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
/* 132 */     getContentPane().setBackground(Color.WHITE);
/* 133 */     setIconImage(ImageController.resizeImage(new ImageIcon(getClass().getResource("/Image/poker-chip.png")), 48, 48));
/* 134 */     setTitle("정다운마을 설문조사");
/*     */     
/*     */ 
/* 137 */     this.pl_m.setLayout(this.gbl);
/* 138 */     this.pl_m.setBackground(Color.WHITE);
/*     */     
/*     */ 
/* 141 */     getContentPane().add("One", this.pl_m);
/*     */     
/*     */ 
/*     */ 
/* 145 */     this.title_ll.setText("응답 관리");
/* 146 */     this.title_ll.setFont(new Font("나눔바른고딕", 1, 35));
/*     */     
/*     */ 
/* 149 */     this.prev_bt.setIcon(new ImageIcon(this.img_Left));
/* 150 */     this.prev_bt.setOpaque(true);
/* 151 */     this.prev_bt.setBackground(Color.WHITE);
/* 152 */     this.prev_bt.setBorder(null);
/* 153 */     this.prev_bt.setCursor(new Cursor(12));
/* 154 */     this.prev_bt.addActionListener(this);
/*     */     
/* 156 */     this.next_bt.setIcon(new ImageIcon(this.img_Right));
/* 157 */     this.next_bt.setOpaque(true);
/* 158 */     this.next_bt.setBackground(Color.WHITE);
/* 159 */     this.next_bt.setBorder(null);
/* 160 */     this.next_bt.setCursor(new Cursor(12));
/* 161 */     this.next_bt.addActionListener(this);
/*     */     
/* 163 */     this.search_bt.setText("검색");
/* 164 */     this.search_bt.setOpaque(true);
/* 165 */     this.search_bt.setBackground(new Color(12, 151, 189));
/* 166 */     this.search_bt.setForeground(Color.WHITE);
/* 167 */     this.search_bt.setFont(new Font("나눔바른고딕", 1, 20));
/* 168 */     this.search_bt.setIcon(new ImageIcon(this.img_Search));
/* 169 */     this.search_bt.setCursor(new Cursor(12));
/* 170 */     this.search_bt.addActionListener(this);
/*     */     
/* 172 */     this.reset_bt.setText("초기화");
/* 173 */     this.reset_bt.setOpaque(true);
/* 174 */     this.reset_bt.setBackground(new Color(12, 151, 189));
/* 175 */     this.reset_bt.setForeground(Color.WHITE);
/* 176 */     this.reset_bt.setFont(new Font("나눔바른고딕", 1, 20));
/* 177 */     this.reset_bt.setIcon(new ImageIcon(this.img_Reset));
/* 178 */     this.reset_bt.setCursor(new Cursor(12));
/* 179 */     this.reset_bt.addActionListener(this);
/*     */     
/*     */ 
/* 182 */     this.defaultTableModel = new DefaultTableModel(this.index_NoSpace, 0)
/*     */     {
/*     */       public boolean isCellEditable(int row, int column) {
/* 185 */         return false;
/*     */       }
/*     */       
/*     */ 
/* 189 */     };
/* 190 */     this.survey_tb = new JTable(this.defaultTableModel);
/* 191 */     this.survey_tb.setRowSelectionAllowed(true);
/* 192 */     this.survey_tb.setRowHeight(37);
/* 193 */     this.survey_tb.setFont(new Font("나눔바른고딕", 0, 16));
/* 194 */     this.survey_tb.setAutoResizeMode(4);
/* 195 */     this.survey_tb.addMouseListener(this);
/*     */     
/* 197 */     this.survey_tb.getTableHeader().setPreferredSize(new Dimension(0, 42));
/* 198 */     this.survey_tb.getTableHeader().setFont(new Font("나눔바른고딕", 0, 18));
/* 199 */     this.survey_tb.getTableHeader().setReorderingAllowed(false);
/* 200 */     this.survey_tb.getTableHeader().setResizingAllowed(false);
/*     */     
/* 202 */     this.rowSelectionModel = this.survey_tb.getSelectionModel();
/* 203 */     this.rowSelectionModel.setSelectionMode(0);
/* 204 */     this.rowSelectionModel.addListSelectionListener(this);
/*     */     
/* 206 */     this.tCellRenderer = new DefaultTableCellRenderer();
/* 207 */     this.tCellRenderer.setHorizontalAlignment(0);
/*     */     
/* 209 */     this.lCellRenderer = new DefaultListCellRenderer();
/* 210 */     this.lCellRenderer.setHorizontalAlignment(0);
/*     */     
/*     */ 
/* 213 */     this.cb_searchIdx = new JComboBox(this.index);
/* 214 */     this.cb_searchIdx.setFont(new Font("나눔바른고딕", 0, 20));
/* 215 */     this.cb_searchIdx.setRenderer(new Survey_List_Di.CustomComboBox());
/* 216 */     this.cb_searchIdx.setPreferredSize(new Dimension(120, 50));
/* 217 */     this.cb_searchIdx.setBackground(Color.WHITE);
/*     */     
/*     */ 
/* 220 */     this.tf_search.setFont(new Font("나눔바른고딕", 0, 22));
/* 221 */     this.tf_search.setMargin(new Insets(10, 10, 10, 10));
/* 222 */     this.tf_search.addKeyListener(this);
/* 223 */     this.tf_search.setPreferredSize(new Dimension(300, 0));
/*     */     
/*     */ 
/*     */ 
/* 227 */     this.tb_scroll = new JScrollPane(this.survey_tb);
/* 228 */     this.tb_scroll.setVerticalScrollBarPolicy(21);
/* 229 */     this.tb_scroll.setHorizontalScrollBarPolicy(31);
/* 230 */     this.tb_scroll.getViewport().setBackground(Color.WHITE);
/*     */     
/* 232 */     this.jlist.setVisibleRowCount(1);
/* 233 */     this.jlist.setLayoutOrientation(2);
/* 234 */     this.jlist.setSelectionMode(1);
/* 235 */     this.jlist.setFont(new Font("나눔바른고딕", 0, 21));
/* 236 */     this.jlist.setFixedCellWidth(30);
/* 237 */     this.jlist.setSelectionBackground(Color.WHITE);
/* 238 */     this.jlist.setCursor(new Cursor(12));
/* 239 */     this.jlist.setCellRenderer(this.lCellRenderer);
/* 240 */     this.jlist.setSelectionForeground(Color.BLUE);
/* 241 */     this.jlist.addListSelectionListener(this);
/*     */     
/* 243 */     JPanel pl = new JPanel();
/* 244 */     pl.setBackground(Color.WHITE);
/* 245 */     pl.add(this.prev_bt, "East");
/* 246 */     pl.add(this.jlist, "Center");
/* 247 */     pl.add(this.next_bt, "West");
/*     */     
/*     */ 
/* 250 */     this.gbc.anchor = 11;
/* 251 */     this.gbc.fill = 1;
/*     */     
/* 253 */     this.gbc.gridx = 0;
/* 254 */     this.gbc.gridy = 0;
/* 255 */     this.gbc.gridwidth = 7;
/* 256 */     this.gbc.gridheight = 1;
/* 257 */     this.gbc.weightx = 1.0D;
/* 258 */     this.gbc.weighty = 0.01D;
/* 259 */     this.gbc.insets = new Insets(-2, -1, 0, -1);
/* 260 */     this.pl_m.add(this.borderPanel, this.gbc);
/*     */     
/* 262 */     this.gbc.gridx = 0;
/* 263 */     this.gbc.gridy = 1;
/* 264 */     this.gbc.weighty = 0.29D;
/* 265 */     this.gbc.insets = new Insets(0, 30, 0, 0);
/* 266 */     this.pl_m.add(this.title_ll, this.gbc);
/*     */     
/* 268 */     this.gbc.gridx = 0;
/* 269 */     this.gbc.gridy = 2;
/* 270 */     this.gbc.gridwidth = 1;
/* 271 */     this.gbc.weightx = 0.06D;
/* 272 */     this.gbc.weighty = 0.02D;
/* 273 */     this.gbc.insets = new Insets(0, 10, 0, 0);
/* 274 */     this.pl_m.add(this.cb_searchIdx, this.gbc);
/*     */     
/* 276 */     this.gbc.gridx = 1;
/* 277 */     this.gbc.gridy = 2;
/* 278 */     this.gbc.weightx = 0.61D;
/* 279 */     this.pl_m.add(this.tf_search, this.gbc);
/*     */     
/* 281 */     this.gbc.gridx = 2;
/* 282 */     this.gbc.gridy = 2;
/* 283 */     this.gbc.weightx = 0.02D;
/* 284 */     this.pl_m.add(this.search_bt, this.gbc);
/*     */     
/* 286 */     this.gbc.gridx = 3;
/* 287 */     this.gbc.gridy = 2;
/* 288 */     this.gbc.weightx = 0.02D;
/* 289 */     this.pl_m.add(this.reset_bt, this.gbc);
/*     */     
/* 291 */     this.gbc.gridx = 4;
/* 292 */     this.gbc.gridy = 2;
/* 293 */     this.gbc.weightx = 0.25D;
/* 294 */     this.pl_m.add(new JLabel(), this.gbc);
/*     */     
/* 296 */     this.gbc.gridx = 5;
/* 297 */     this.gbc.gridy = 2;
/* 298 */     this.gbc.weightx = 0.02D;
/* 299 */     this.gbc.insets = new Insets(0, 0, 0, 10);
/* 300 */     this.pl_m.add(new JLabel(), this.gbc);
/*     */     
/* 302 */     this.gbc.gridx = 0;
/* 303 */     this.gbc.gridy = 3;
/* 304 */     this.gbc.gridwidth = 7;
/* 305 */     this.gbc.weightx = 1.0D;
/* 306 */     this.gbc.weighty = 0.64D;
/* 307 */     this.gbc.insets = new Insets(20, 10, 10, 10);
/* 308 */     this.pl_m.add(this.tb_scroll, this.gbc);
/*     */     
/* 310 */     this.gbc.gridx = 0;
/* 311 */     this.gbc.gridy = 4;
/* 312 */     this.gbc.weighty = 0.04D;
/* 313 */     this.gbc.insets = new Insets(0, 0, 0, 0);
/* 314 */     this.pl_m.add(pl, this.gbc);
/*     */     
/* 316 */     loadSurvey();
/*     */   }
/*     */   
/*     */ 
/*     */   public void actionPerformed(ActionEvent arg0)
/*     */   {
/* 322 */     if (arg0.getSource().equals(this.prev_bt))
/*     */     {
/* 324 */       if (this.jlist.getSelectedValue() != null)
/*     */       {
/* 326 */         int idx = ((Integer)this.jlist.getSelectedValue()).intValue();
/* 327 */         int idx_lt = idx / 5;
/* 328 */         int idx_si = this.jlist.getSelectedIndex();
/*     */         
/* 330 */         if (idx == 1)
/*     */         {
/* 332 */           return; }
/* 333 */         if (idx % 5 == 1)
/*     */         {
/* 335 */           this.jlist.setModel((ListModel)this.list_ltModel.get(idx_lt - 1));
/* 336 */           this.jlist.setSelectedIndex(4);
/*     */         }
/*     */         else {
/* 339 */           this.jlist.setSelectedIndex(idx_si - 1);
/*     */         }
/*     */       }
/* 342 */     } else if (arg0.getSource().equals(this.next_bt))
/*     */     {
/* 344 */       if (this.jlist.getSelectedValue() != null)
/*     */       {
/* 346 */         int idx = ((Integer)this.jlist.getSelectedValue()).intValue();
/* 347 */         int idx_lt = idx / 5;
/* 348 */         int idx_si = this.jlist.getSelectedIndex();
/*     */         
/* 350 */         if ((idx % 5 == 0) && (this.list_ltModel.size() == idx_lt))
/*     */         {
/* 352 */           return; }
/* 353 */         if (idx % 5 == 0)
/*     */         {
/* 355 */           this.jlist.setModel((ListModel)this.list_ltModel.get(idx_lt));
/* 356 */           this.jlist.setSelectedIndex(0);
/*     */         }
/*     */         else {
/* 359 */           this.jlist.setSelectedIndex(idx_si + 1);
/*     */         }
/*     */       }
/* 362 */     } else if (arg0.getSource().equals(this.search_bt))
/*     */     {
/*     */ 
/* 365 */       String temp_searchIdx = String.valueOf(this.cb_searchIdx.getSelectedItem()).trim();
/* 366 */       String temp_searchCtt = this.tf_search.getText();
/*     */       
/*     */       try
/*     */       {
/* 370 */         doSearch(temp_searchIdx, temp_searchCtt);
/*     */       }
/*     */       catch (SQLException e) {
/* 373 */         e.printStackTrace();
/*     */       }
/*     */     }
/* 376 */     else if (arg0.getSource().equals(this.reset_bt))
/*     */     {
/*     */       try
/*     */       {
/* 380 */         loadSurvey();
/*     */       }
/*     */       catch (SQLException e)
/*     */       {
/* 384 */         e.printStackTrace();
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void mouseClicked(MouseEvent arg0) {}
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void mouseEntered(MouseEvent arg0) {}
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void mouseExited(MouseEvent arg0) {}
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void mousePressed(MouseEvent arg0) {}
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void mouseReleased(MouseEvent arg0)
/*     */   {
/* 416 */     if (arg0.getClickCount() == 2)
/*     */     {
/* 418 */       int row = this.survey_tb.rowAtPoint(arg0.getPoint());
/* 419 */       int col = this.survey_tb.columnAtPoint(arg0.getPoint());
/*     */       
/* 421 */       if ((row >= 0) && (col >= 0))
/*     */       {
/* 423 */         String IDF_CD = (String)this.survey_tb.getValueAt(row, 1);
/* 424 */         String CT = (String)this.survey_tb.getValueAt(row, 4);
/*     */         
/* 426 */         if (Integer.valueOf(CT).intValue() > 0)
/*     */         {
/*     */           try
/*     */           {
/* 430 */             new Survey_React_Di(IDF_CD, CT).setVisible(true);
/*     */           }
/*     */           catch (SQLException e)
/*     */           {
/* 434 */             e.printStackTrace();
/*     */           }
/*     */           
/*     */         }
/*     */         else {
/* 439 */           JOptionPane.showMessageDialog(null, "응답자가 없습니다.");
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public void keyPressed(KeyEvent arg0)
/*     */   {
/* 448 */     if (arg0.getKeyCode() == 10)
/*     */     {
/*     */ 
/* 451 */       String temp_searchIdx = String.valueOf(this.cb_searchIdx.getSelectedItem()).trim();
/* 452 */       String temp_searchCtt = this.tf_search.getText();
/*     */       
/*     */       try
/*     */       {
/* 456 */         doSearch(temp_searchIdx, temp_searchCtt);
/*     */       }
/*     */       catch (SQLException e) {
/* 459 */         e.printStackTrace();
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void keyReleased(KeyEvent arg0) {}
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void keyTyped(KeyEvent arg0) {}
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void valueChanged(ListSelectionEvent arg0)
/*     */   {
/* 479 */     if ((!arg0.getValueIsAdjusting()) && (this.jlist.getSelectedValue() != null))
/*     */     {
/* 481 */       int idx = ((Integer)this.jlist.getSelectedValue()).intValue();
/*     */       
/* 483 */       this.survey_tb.setModel((TableModel)this.list_tbModel.get(idx - 1));
/*     */       
/* 485 */       columnSort();
/*     */     }
/*     */   }
/*     */   
/*     */   public void loadSurvey()
/*     */     throws SQLException
/*     */   {
/* 492 */     this.defaultTableModel.setRowCount(0);
/*     */     
/*     */ 
/* 495 */     List<Map<String, String>> data = Database.getData(Enum_Table_Ci.T003.getCode());
/*     */     
/*     */ 
/* 498 */     this.list_tbModel = new ArrayList();
/* 499 */     this.list_ltModel = new ArrayList();
/*     */     
/*     */ 
/* 502 */     setTableModel(data);
/* 503 */     setListModel(this.list_tbModel.size());
/*     */     
/* 505 */     this.survey_tb.setModel((TableModel)this.list_tbModel.get(0));
/* 506 */     this.jlist.setModel((ListModel)this.list_ltModel.get(0));
/*     */     
/* 508 */     this.jlist.setSelectedIndex(0);
/*     */     
/*     */ 
/* 511 */     columnSort();
/*     */   }
/*     */   
/*     */   public void loadSurvey(List<Map<String, String>> data)
/*     */     throws SQLException
/*     */   {
/* 517 */     this.defaultTableModel.setRowCount(0);
/*     */     
/*     */ 
/* 520 */     this.list_tbModel = new ArrayList();
/* 521 */     this.list_ltModel = new ArrayList();
/*     */     
/*     */ 
/* 524 */     setTableModel(data);
/* 525 */     setListModel(this.list_tbModel.size());
/*     */     
/* 527 */     this.survey_tb.setModel((TableModel)this.list_tbModel.get(0));
/* 528 */     this.jlist.setModel((ListModel)this.list_ltModel.get(0));
/*     */     
/* 530 */     this.jlist.setSelectedIndex(0);
/*     */     
/*     */ 
/* 533 */     columnSort();
/*     */   }
/*     */   
/*     */   public void columnSort()
/*     */   {
/* 538 */     TableColumnModel tcmSchedule = this.survey_tb.getColumnModel();
/* 539 */     for (int i = 0; i < this.survey_tb.getColumnModel().getColumnCount(); i++)
/*     */     {
/* 541 */       tcmSchedule.getColumn(i).setCellRenderer(this.tCellRenderer);
/* 542 */       tcmSchedule.getColumn(i).setMaxWidth(this.widths[i]);
/*     */     }
/*     */   }
/*     */   
/*     */   public void setListModel(int size)
/*     */   {
/* 548 */     DefaultListModel ltModel = new DefaultListModel();
/*     */     
/* 550 */     for (int i = 0; i < size; i++)
/*     */     {
/* 552 */       if ((i % 5 == 0) && (i != 0))
/*     */       {
/* 554 */         this.list_ltModel.add(ltModel);
/* 555 */         ltModel = new DefaultListModel();
/*     */       }
/* 557 */       ltModel.addElement(Integer.valueOf(i + 1));
/*     */     }
/* 559 */     this.list_ltModel.add(ltModel);
/*     */     
/* 561 */     this.jlist.setModel((ListModel)this.list_ltModel.get(0));
/*     */   }
/*     */   
/*     */   public void setTableModel(List<Map<String, String>> data) throws SQLException
/*     */   {
/* 566 */     DefaultTableModel tempModel = new DefaultTableModel(this.index_NoSpace, 0)
/*     */     {
/*     */ 
/*     */       public boolean isCellEditable(int row, int column)
/*     */       {
/* 571 */         return false;
/*     */       }
/*     */     };
/*     */     
/* 575 */     for (int i = 0; i < data.size(); i++)
/*     */     {
/* 577 */       if ((i % 15 == 0) && (i != 0))
/*     */       {
/* 579 */         this.list_tbModel.add(tempModel);
/* 580 */         tempModel = new DefaultTableModel(this.index_NoSpace, 0)
/*     */         {
/*     */ 
/*     */           public boolean isCellEditable(int row, int column)
/*     */           {
/* 585 */             return false;
/*     */           }
/*     */         };
/*     */       }
/*     */       
/* 590 */       int tempCount = 0;
/*     */       
/* 592 */       Map<String, String> dataMap = (Map)data.get(i);
/* 593 */       int ct = Database.getRow(Enum_Table_Ci.T010.getCode(), "IDF_CD", (String)dataMap.get("IDF_CD")).size();
/*     */       
/* 595 */       List<String> row_lt = new ArrayList();
/*     */       
/* 597 */       row_lt.add((String)dataMap.get("IDF_CD"));
/* 598 */       row_lt.add((String)dataMap.get("SURVEY_NM"));
/* 599 */       row_lt.add((String)dataMap.get("ERM_DT"));
/* 600 */       row_lt.add(String.valueOf(ct));
/*     */       
/* 602 */       Object[] tempObject = new Object[row_lt.size() + 1];
/*     */       
/* 604 */       tempObject[(tempCount++)] = String.valueOf(i + 1);
/*     */       
/* 606 */       for (String str : row_lt)
/*     */       {
/* 608 */         tempObject[(tempCount++)] = str;
/*     */       }
/*     */       
/*     */ 
/* 612 */       tempModel.addRow(tempObject);
/*     */     }
/*     */     
/* 615 */     this.list_tbModel.add(tempModel);
/*     */   }
/*     */   
/*     */   public void doSearch(String searchIdx, String searchCtt) throws SQLException
/*     */   {
/* 620 */     String temp_Idx = "";
/* 621 */     String str1; switch ((str1 = searchIdx).hashCode()) {case -558119792:  if (str1.equals("고유 번호")) break; break; case 1053682564:  if (str1.equals("설문지 이름")) {} break; case 1236273232:  if (!str1.equals("등록 날짜"))
/*     */       {
/*     */         break label101;
/* 624 */         temp_Idx = "IDF_CD";
/*     */         
/*     */         break label101;
/* 627 */         temp_Idx = "SURVEY_NM";
/*     */       }
/*     */       else {
/* 630 */         temp_Idx = "START_DT";
/*     */       }
/*     */       break;
/*     */     }
/*     */     label101:
/* 635 */     List<Map<String, String>> data = this.server.db_getDataDoSearch(Enum_Table_Ci.T003, temp_Idx, searchCtt);
/*     */     
/* 637 */     loadSurvey(data);
/*     */   }
/*     */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_Management_Di.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */