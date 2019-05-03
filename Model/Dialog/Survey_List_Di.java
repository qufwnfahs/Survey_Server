/*     */ package Model.Dialog;
/*     */ 
/*     */ import Enum.Enum_Table_Ci;
/*     */ import Model.Dialog.Survey_List.Card_Survey_Fr;
/*     */ import Model.Dialog.Survey_List.Question_Management.BorderPanel;
/*     */ import Model.Dialog.Survey_List.Survey_Info_Ci;
/*     */ import Model.Dialog.Survey_List.Survey_Modify_Di;
/*     */ import Worker.ImageController;
/*     */ import Worker.Server;
/*     */ import java.awt.CardLayout;
/*     */ import java.awt.Color;
/*     */ import java.awt.Component;
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
/*     */ import java.text.ParseException;
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
/*     */ public class Survey_List_Di extends JFrame implements java.awt.event.ActionListener, ListSelectionListener, KeyListener, java.awt.event.MouseListener
/*     */ {
/*  59 */   private CardLayout card = new CardLayout();
/*     */   
/*  61 */   private GridBagLayout gbl = new GridBagLayout();
/*  62 */   private GridBagConstraints gbc = new GridBagConstraints();
/*     */   
/*     */ 
/*  65 */   private JPanel pl_m = new JPanel();
/*     */   
/*  67 */   private JLabel title_ll = new JLabel();
/*     */   
/*  69 */   private JButton add_bt = new JButton();
/*  70 */   private JButton modify_bt = new JButton();
/*  71 */   private JButton delete_bt = new JButton();
/*  72 */   private JButton group_management_bt = new JButton();
/*  73 */   private JButton point_management_bt = new JButton();
/*  74 */   private JButton question_management_bt = new JButton();
/*  75 */   private JButton refresh_bt = new JButton();
/*  76 */   private JButton search_bt = new JButton();
/*  77 */   private JButton prev_bt = new JButton();
/*  78 */   private JButton next_bt = new JButton();
/*  79 */   private JButton reset_bt = new JButton();
/*  80 */   private JButton temp_add_bt = new JButton();
/*     */   
/*     */   private Image img_Left;
/*     */   
/*     */   private Image img_Right;
/*     */   private Image img_Search;
/*     */   private Image img_Reset;
/*     */   private Image img_Add;
/*  88 */   private JComboBox cb_searchIdx = new JComboBox();
/*     */   
/*  90 */   private JTextField tf_search = new JTextField();
/*     */   
/*  92 */   private BorderPanel borderPanel = new BorderPanel(this, 0);
/*     */   
/*  94 */   private JTable survey_tb = new JTable();
/*     */   
/*     */   private DefaultTableModel defaultTableModel;
/*     */   
/*  98 */   private List<DefaultTableModel> list_tbModel = new ArrayList();
/*  99 */   private List<DefaultListModel> list_ltModel = new ArrayList();
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
/*     */   
/* 115 */   private int[] widths = { 70, 200, 520, 130, 130, 130 };
/*     */   
/*     */ 
/* 118 */   private String[] index = { "   고유 번호", "   설문지 이름", "   시작 날짜", "   종료 날짜", "   등록 날짜" };
/*     */   
/* 120 */   private String[] index_NoSpace = { "번호", "고유 번호", "설문지 이름", "시작 날짜", "종료 날짜", "등록 날짜" };
/*     */   
/* 122 */   private JList jlist = new JList();
/*     */   
/*     */   public Survey_List_Di(Server server) throws SQLException, ParseException
/*     */   {
/* 126 */     this.server = server;
/*     */     
/* 128 */     UIManager.put("List.focusCellHighlightBorder", BorderFactory.createEmptyBorder());
/*     */     
/* 130 */     this.img_Left = ImageController.resizeImage(
/* 131 */       new ImageIcon(getClass().getResource("/Image/sharp_keyboard_arrow_left_black_36dp.png")), 34, 34);
/* 132 */     this.img_Right = ImageController.resizeImage(
/* 133 */       new ImageIcon(getClass().getResource("/Image/sharp_keyboard_arrow_right_black_36dp.png")), 34, 34);
/* 134 */     this.img_Search = ImageController.resizeImage(
/* 135 */       new ImageIcon(getClass().getResource("/Image/outline_search_white_36dp.png")), 28, 28);
/* 136 */     this.img_Reset = ImageController.resizeImage(
/* 137 */       new ImageIcon(getClass().getResource("/Image/outline_autorenew_white_36dp.png")), 28, 28);
/* 138 */     this.img_Add = ImageController.resizeImage(
/* 139 */       new ImageIcon(getClass().getResource("/Image/outline_library_add_white_36dp.png")), 28, 28);
/*     */     
/*     */ 
/* 142 */     setPreferredSize(new Dimension(1200, 900));
/* 143 */     setMinimumSize(new Dimension(1200, 900));
/* 144 */     setMaximumSize(new Dimension(1200, 900));
/* 145 */     setLocationRelativeTo(null);
/* 146 */     setUndecorated(true);
/* 147 */     setLayout(this.card);
/* 148 */     getRootPane().setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
/* 149 */     getContentPane().setBackground(Color.WHITE);
/* 150 */     setIconImage(ImageController.resizeImage(new ImageIcon(getClass().getResource("/Image/poker-chip.png")), 48, 48));
/* 151 */     setTitle("정다운마을 설문조사");
/*     */     
/*     */ 
/* 154 */     this.pl_m.setLayout(this.gbl);
/* 155 */     this.pl_m.setBackground(Color.WHITE);
/*     */     
/*     */ 
/* 158 */     getContentPane().add("One", this.pl_m);
/*     */     
/*     */ 
/*     */ 
/* 162 */     this.title_ll.setText("설문 관리");
/* 163 */     this.title_ll.setFont(new Font("나눔바른고딕", 1, 35));
/*     */     
/*     */ 
/*     */ 
/* 167 */     this.add_bt.setText("설문 등록");
/* 168 */     this.add_bt.setFont(new Font("나눔바른고딕", 0, 23));
/* 169 */     this.add_bt.addActionListener(this);
/*     */     
/*     */ 
/* 172 */     this.modify_bt.setText("설문 수정");
/* 173 */     this.modify_bt.setFont(new Font("나눔바른고딕", 0, 23));
/* 174 */     this.modify_bt.addActionListener(this);
/*     */     
/*     */ 
/* 177 */     this.group_management_bt.setText("설문 그룹 관리");
/* 178 */     this.group_management_bt.setFont(new Font("나눔바른고딕", 0, 23));
/* 179 */     this.group_management_bt.addActionListener(this);
/*     */     
/*     */ 
/* 182 */     this.refresh_bt.setText("새로고침");
/* 183 */     this.refresh_bt.setFont(new Font("나눔바른고딕", 0, 23));
/* 184 */     this.refresh_bt.addActionListener(this);
/*     */     
/*     */ 
/* 187 */     this.delete_bt.setText("설문 삭제");
/* 188 */     this.delete_bt.setFont(new Font("나눔바른고딕", 0, 23));
/* 189 */     this.delete_bt.addActionListener(this);
/*     */     
/*     */ 
/* 192 */     this.question_management_bt.setText("문항 관리");
/* 193 */     this.question_management_bt.setFont(new Font("나눔바른고딕", 0, 23));
/* 194 */     this.question_management_bt.addActionListener(this);
/*     */     
/*     */ 
/* 197 */     this.point_management_bt.setText("점수 관리");
/* 198 */     this.point_management_bt.setFont(new Font("나눔바른고딕", 0, 23));
/* 199 */     this.point_management_bt.addActionListener(this);
/*     */     
/* 201 */     this.prev_bt.setIcon(new ImageIcon(this.img_Left));
/* 202 */     this.prev_bt.setOpaque(true);
/* 203 */     this.prev_bt.setBackground(Color.WHITE);
/* 204 */     this.prev_bt.setBorder(null);
/* 205 */     this.prev_bt.setCursor(new Cursor(12));
/* 206 */     this.prev_bt.addActionListener(this);
/*     */     
/* 208 */     this.next_bt.setIcon(new ImageIcon(this.img_Right));
/* 209 */     this.next_bt.setOpaque(true);
/* 210 */     this.next_bt.setBackground(Color.WHITE);
/* 211 */     this.next_bt.setBorder(null);
/* 212 */     this.next_bt.setCursor(new Cursor(12));
/* 213 */     this.next_bt.addActionListener(this);
/*     */     
/* 215 */     this.search_bt.setText("검색");
/* 216 */     this.search_bt.setOpaque(true);
/* 217 */     this.search_bt.setBackground(new Color(12, 151, 189));
/* 218 */     this.search_bt.setForeground(Color.WHITE);
/* 219 */     this.search_bt.setFont(new Font("나눔바른고딕", 1, 20));
/* 220 */     this.search_bt.setIcon(new ImageIcon(this.img_Search));
/* 221 */     this.search_bt.setCursor(new Cursor(12));
/* 222 */     this.search_bt.addActionListener(this);
/*     */     
/* 224 */     this.reset_bt.setText("초기화");
/* 225 */     this.reset_bt.setOpaque(true);
/* 226 */     this.reset_bt.setBackground(new Color(12, 151, 189));
/* 227 */     this.reset_bt.setForeground(Color.WHITE);
/* 228 */     this.reset_bt.setFont(new Font("나눔바른고딕", 1, 20));
/* 229 */     this.reset_bt.setIcon(new ImageIcon(this.img_Reset));
/* 230 */     this.reset_bt.setCursor(new Cursor(12));
/* 231 */     this.reset_bt.addActionListener(this);
/*     */     
/* 233 */     this.temp_add_bt.setText("설문 등록");
/* 234 */     this.temp_add_bt.setOpaque(true);
/* 235 */     this.temp_add_bt.setBackground(new Color(12, 151, 189));
/* 236 */     this.temp_add_bt.setForeground(Color.WHITE);
/* 237 */     this.temp_add_bt.setFont(new Font("나눔바른고딕", 1, 20));
/* 238 */     this.temp_add_bt.setIcon(new ImageIcon(this.img_Add));
/* 239 */     this.temp_add_bt.setCursor(new Cursor(12));
/* 240 */     this.temp_add_bt.addActionListener(this);
/*     */     
/*     */ 
/* 243 */     this.defaultTableModel = new DefaultTableModel(this.index_NoSpace, 0)
/*     */     {
/*     */ 
/*     */       public boolean isCellEditable(int row, int column)
/*     */       {
/* 248 */         return false;
/*     */       }
/*     */       
/*     */ 
/* 252 */     };
/* 253 */     this.survey_tb = new JTable(this.defaultTableModel);
/* 254 */     this.survey_tb.setRowSelectionAllowed(true);
/* 255 */     this.survey_tb.setRowHeight(37);
/* 256 */     this.survey_tb.setFont(new Font("나눔바른고딕", 0, 16));
/* 257 */     this.survey_tb.setAutoResizeMode(4);
/* 258 */     this.survey_tb.addMouseListener(this);
/*     */     
/* 260 */     this.survey_tb.getTableHeader().setPreferredSize(new Dimension(0, 42));
/* 261 */     this.survey_tb.getTableHeader().setFont(new Font("나눔바른고딕", 0, 18));
/* 262 */     this.survey_tb.getTableHeader().setReorderingAllowed(false);
/* 263 */     this.survey_tb.getTableHeader().setResizingAllowed(false);
/*     */     
/* 265 */     this.rowSelectionModel = this.survey_tb.getSelectionModel();
/* 266 */     this.rowSelectionModel.setSelectionMode(0);
/* 267 */     this.rowSelectionModel.addListSelectionListener(this);
/*     */     
/* 269 */     this.tCellRenderer = new DefaultTableCellRenderer();
/* 270 */     this.tCellRenderer.setHorizontalAlignment(0);
/*     */     
/* 272 */     this.lCellRenderer = new DefaultListCellRenderer();
/* 273 */     this.lCellRenderer.setHorizontalAlignment(0);
/*     */     
/*     */ 
/* 276 */     this.cb_searchIdx = new JComboBox(this.index);
/* 277 */     this.cb_searchIdx.setFont(new Font("나눔바른고딕", 0, 20));
/* 278 */     this.cb_searchIdx.setRenderer(new CustomComboBox());
/* 279 */     this.cb_searchIdx.setPreferredSize(new Dimension(120, 50));
/* 280 */     this.cb_searchIdx.setBackground(Color.WHITE);
/*     */     
/*     */ 
/* 283 */     this.tf_search.setFont(new Font("나눔바른고딕", 0, 22));
/* 284 */     this.tf_search.setMargin(new Insets(10, 10, 10, 10));
/* 285 */     this.tf_search.addKeyListener(this);
/* 286 */     this.tf_search.setPreferredSize(new Dimension(300, 0));
/*     */     
/*     */ 
/*     */ 
/* 290 */     this.tb_scroll = new JScrollPane(this.survey_tb);
/* 291 */     this.tb_scroll.setVerticalScrollBarPolicy(21);
/* 292 */     this.tb_scroll.setHorizontalScrollBarPolicy(31);
/* 293 */     this.tb_scroll.getViewport().setBackground(Color.WHITE);
/*     */     
/* 295 */     this.jlist.setVisibleRowCount(1);
/* 296 */     this.jlist.setLayoutOrientation(2);
/* 297 */     this.jlist.setSelectionMode(1);
/* 298 */     this.jlist.setFont(new Font("나눔바른고딕", 0, 21));
/* 299 */     this.jlist.setFixedCellWidth(30);
/* 300 */     this.jlist.setSelectionBackground(Color.WHITE);
/* 301 */     this.jlist.setCursor(new Cursor(12));
/* 302 */     this.jlist.setCellRenderer(this.lCellRenderer);
/* 303 */     this.jlist.setSelectionForeground(Color.BLUE);
/* 304 */     this.jlist.addListSelectionListener(this);
/*     */     
/* 306 */     JPanel pl = new JPanel();
/* 307 */     pl.setBackground(Color.WHITE);
/* 308 */     pl.add(this.prev_bt, "East");
/* 309 */     pl.add(this.jlist, "Center");
/* 310 */     pl.add(this.next_bt, "West");
/*     */     
/*     */ 
/* 313 */     this.gbc.anchor = 11;
/* 314 */     this.gbc.fill = 1;
/*     */     
/* 316 */     this.gbc.gridx = 0;
/* 317 */     this.gbc.gridy = 0;
/* 318 */     this.gbc.gridwidth = 7;
/* 319 */     this.gbc.gridheight = 1;
/* 320 */     this.gbc.weightx = 1.0D;
/* 321 */     this.gbc.weighty = 0.01D;
/* 322 */     this.gbc.insets = new Insets(-2, -1, 0, -1);
/* 323 */     this.pl_m.add(this.borderPanel, this.gbc);
/*     */     
/* 325 */     this.gbc.gridx = 0;
/* 326 */     this.gbc.gridy = 1;
/* 327 */     this.gbc.weighty = 0.29D;
/* 328 */     this.gbc.insets = new Insets(0, 30, 0, 0);
/* 329 */     this.pl_m.add(this.title_ll, this.gbc);
/*     */     
/* 331 */     this.gbc.gridx = 0;
/* 332 */     this.gbc.gridy = 2;
/* 333 */     this.gbc.gridwidth = 1;
/* 334 */     this.gbc.weightx = 0.06D;
/* 335 */     this.gbc.weighty = 0.02D;
/* 336 */     this.gbc.insets = new Insets(0, 10, 0, 0);
/* 337 */     this.pl_m.add(this.cb_searchIdx, this.gbc);
/*     */     
/* 339 */     this.gbc.gridx = 1;
/* 340 */     this.gbc.gridy = 2;
/* 341 */     this.gbc.weightx = 0.61D;
/* 342 */     this.pl_m.add(this.tf_search, this.gbc);
/*     */     
/* 344 */     this.gbc.gridx = 2;
/* 345 */     this.gbc.gridy = 2;
/* 346 */     this.gbc.weightx = 0.02D;
/* 347 */     this.pl_m.add(this.search_bt, this.gbc);
/*     */     
/* 349 */     this.gbc.gridx = 3;
/* 350 */     this.gbc.gridy = 2;
/* 351 */     this.gbc.weightx = 0.02D;
/* 352 */     this.pl_m.add(this.reset_bt, this.gbc);
/*     */     
/* 354 */     this.gbc.gridx = 4;
/* 355 */     this.gbc.gridy = 2;
/* 356 */     this.gbc.weightx = 0.25D;
/* 357 */     this.pl_m.add(new JLabel(), this.gbc);
/*     */     
/* 359 */     this.gbc.gridx = 5;
/* 360 */     this.gbc.gridy = 2;
/* 361 */     this.gbc.weightx = 0.02D;
/* 362 */     this.gbc.insets = new Insets(0, 0, 0, 10);
/* 363 */     this.pl_m.add(this.temp_add_bt, this.gbc);
/*     */     
/* 365 */     this.gbc.gridx = 0;
/* 366 */     this.gbc.gridy = 3;
/* 367 */     this.gbc.gridwidth = 7;
/* 368 */     this.gbc.weightx = 1.0D;
/* 369 */     this.gbc.weighty = 0.64D;
/* 370 */     this.gbc.insets = new Insets(20, 10, 10, 10);
/* 371 */     this.pl_m.add(this.tb_scroll, this.gbc);
/*     */     
/* 373 */     this.gbc.gridx = 0;
/* 374 */     this.gbc.gridy = 4;
/* 375 */     this.gbc.weighty = 0.04D;
/* 376 */     this.gbc.insets = new Insets(0, 0, 0, 0);
/* 377 */     this.pl_m.add(pl, this.gbc);
/*     */     
/* 379 */     loadSurvey();
/*     */   }
/*     */   
/*     */ 
/*     */   public void actionPerformed(ActionEvent arg0)
/*     */   {
/* 385 */     if ((arg0.getSource().equals(this.modify_bt)) && (this.survey_tb.getSelectedRow() >= 0))
/*     */     {
/* 387 */       int selectedRows = this.survey_tb.getSelectedRow();
/*     */       
/* 389 */       String idf_cd = (String)this.survey_tb.getValueAt(selectedRows, 1);
/* 390 */       String survey_name = (String)this.survey_tb.getValueAt(selectedRows, 2);
/* 391 */       String survey_start = (String)this.survey_tb.getValueAt(selectedRows, 3);
/* 392 */       String survey_end = (String)this.survey_tb.getValueAt(selectedRows, 4);
/*     */       
/*     */       try
/*     */       {
/* 396 */         Survey_Modify_Di survey_modify = new Survey_Modify_Di(this.server, idf_cd, survey_name, survey_start, 
/* 397 */           survey_end);
/* 398 */         survey_modify.setVisible(true);
/*     */       }
/*     */       catch (SQLException|ParseException e) {
/* 401 */         e.printStackTrace();
/*     */       }
/* 403 */     } else if (arg0.getSource().equals(this.refresh_bt))
/*     */     {
/*     */       try
/*     */       {
/* 407 */         loadSurvey();
/*     */       }
/*     */       catch (SQLException e) {
/* 410 */         e.printStackTrace();
/*     */       }
/* 412 */     } else if ((arg0.getSource().equals(this.delete_bt)) && (this.survey_tb.getSelectedRow() >= 0))
/*     */     {
/* 414 */       int selectedRows = this.survey_tb.getSelectedRow();
/*     */       
/* 416 */       String idf_cd = (String)this.survey_tb.getValueAt(selectedRows, 1);
/* 417 */       String isGROUPED = (String)this.survey_tb.getValueAt(selectedRows, 6);
/* 418 */       String isCREATED = (String)this.survey_tb.getValueAt(selectedRows, 8);
/*     */       
/* 420 */       if (isGROUPED.equals("O"))
/*     */       {
/*     */         try
/*     */         {
/* 424 */           this.server.db_removeData(Enum_Table_Ci.T004, "IDF_CD", idf_cd);
/*     */         }
/*     */         catch (SQLException e) {
/* 427 */           e.printStackTrace();
/*     */         }
/*     */       }
/* 430 */       if (isCREATED.equals("O"))
/*     */       {
/*     */         try
/*     */         {
/* 434 */           this.server.db_removeDataAll(Enum_Table_Ci.T005, "IDF_CD", idf_cd);
/* 435 */           this.server.db_removeDataAll(Enum_Table_Ci.T006, "IDF_CD", idf_cd);
/* 436 */           this.server.db_removeDataAll(Enum_Table_Ci.T007, "IDF_CD", idf_cd);
/* 437 */           this.server.db_removeDataAll(Enum_Table_Ci.T008, "IDF_CD", idf_cd);
/*     */         }
/*     */         catch (SQLException e) {
/* 440 */           e.printStackTrace();
/*     */         }
/*     */       }
/*     */       try
/*     */       {
/* 445 */         this.server.db_removeData(Enum_Table_Ci.T003, "IDF_CD", idf_cd);
/* 446 */         loadSurvey();
/*     */       }
/*     */       catch (SQLException e) {
/* 449 */         e.printStackTrace();
/*     */       }
/* 451 */     } else if (arg0.getSource().equals(this.prev_bt))
/*     */     {
/* 453 */       if (this.jlist.getSelectedValue() != null)
/*     */       {
/* 455 */         int idx = ((Integer)this.jlist.getSelectedValue()).intValue();
/* 456 */         int idx_lt = idx / 5;
/* 457 */         int idx_si = this.jlist.getSelectedIndex();
/*     */         
/* 459 */         if (idx == 1)
/*     */         {
/* 461 */           return; }
/* 462 */         if (idx % 5 == 1)
/*     */         {
/* 464 */           this.jlist.setModel((ListModel)this.list_ltModel.get(idx_lt - 1));
/* 465 */           this.jlist.setSelectedIndex(4);
/*     */         }
/*     */         else {
/* 468 */           this.jlist.setSelectedIndex(idx_si - 1);
/*     */         }
/*     */       }
/* 471 */     } else if (arg0.getSource().equals(this.next_bt))
/*     */     {
/* 473 */       if (this.jlist.getSelectedValue() != null)
/*     */       {
/* 475 */         int idx = ((Integer)this.jlist.getSelectedValue()).intValue();
/* 476 */         int idx_lt = idx / 5;
/* 477 */         int idx_si = this.jlist.getSelectedIndex();
/*     */         
/* 479 */         if ((idx % 5 == 0) && (this.list_ltModel.size() == idx_lt))
/*     */         {
/* 481 */           return; }
/* 482 */         if (idx % 5 == 0)
/*     */         {
/* 484 */           this.jlist.setModel((ListModel)this.list_ltModel.get(idx_lt));
/* 485 */           this.jlist.setSelectedIndex(0);
/*     */         }
/*     */         else {
/* 488 */           this.jlist.setSelectedIndex(idx_si + 1);
/*     */         }
/*     */       }
/* 491 */     } else if (arg0.getSource().equals(this.search_bt))
/*     */     {
/*     */ 
/* 494 */       String temp_searchIdx = String.valueOf(this.cb_searchIdx.getSelectedItem()).trim();
/* 495 */       String temp_searchCtt = this.tf_search.getText();
/*     */       
/*     */       try
/*     */       {
/* 499 */         doSearch(temp_searchIdx, temp_searchCtt);
/*     */       }
/*     */       catch (SQLException e) {
/* 502 */         e.printStackTrace();
/*     */       }
/*     */     }
/* 505 */     else if (arg0.getSource().equals(this.reset_bt))
/*     */     {
/*     */       try
/*     */       {
/* 509 */         loadSurvey();
/*     */       }
/*     */       catch (SQLException e)
/*     */       {
/* 513 */         e.printStackTrace();
/*     */       }
/*     */     }
/* 516 */     else if (arg0.getSource().equals(this.temp_add_bt))
/*     */     {
/*     */       try
/*     */       {
/* 520 */         new Card_Survey_Fr().setVisible(true);
/*     */       }
/*     */       catch (SQLException|ParseException e)
/*     */       {
/* 524 */         e.printStackTrace();
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void valueChanged(ListSelectionEvent arg0)
/*     */   {
/* 533 */     if ((!arg0.getValueIsAdjusting()) && (this.jlist.getSelectedValue() != null))
/*     */     {
/* 535 */       int idx = ((Integer)this.jlist.getSelectedValue()).intValue();
/*     */       
/* 537 */       this.survey_tb.setModel((TableModel)this.list_tbModel.get(idx - 1));
/*     */       
/* 539 */       columnSort();
/*     */     }
/*     */   }
/*     */   
/*     */   public void loadSurvey()
/*     */     throws SQLException
/*     */   {
/* 546 */     this.defaultTableModel.setRowCount(0);
/*     */     
/*     */ 
/* 549 */     List<Map<String, String>> data = this.server.db_getData(Enum_Table_Ci.T003);
/*     */     
/*     */ 
/* 552 */     this.list_tbModel = new ArrayList();
/* 553 */     this.list_ltModel = new ArrayList();
/*     */     
/*     */ 
/* 556 */     setTableModel(data);
/* 557 */     setListModel(this.list_tbModel.size());
/*     */     
/* 559 */     this.survey_tb.setModel((TableModel)this.list_tbModel.get(0));
/* 560 */     this.jlist.setModel((ListModel)this.list_ltModel.get(0));
/*     */     
/* 562 */     this.jlist.setSelectedIndex(0);
/*     */     
/*     */ 
/* 565 */     columnSort();
/*     */   }
/*     */   
/*     */   public void loadSurvey(List<Map<String, String>> data)
/*     */     throws SQLException
/*     */   {
/* 571 */     this.defaultTableModel.setRowCount(0);
/*     */     
/*     */ 
/* 574 */     this.list_tbModel = new ArrayList();
/* 575 */     this.list_ltModel = new ArrayList();
/*     */     
/*     */ 
/* 578 */     setTableModel(data);
/* 579 */     setListModel(this.list_tbModel.size());
/*     */     
/* 581 */     this.survey_tb.setModel((TableModel)this.list_tbModel.get(0));
/* 582 */     this.jlist.setModel((ListModel)this.list_ltModel.get(0));
/*     */     
/* 584 */     this.jlist.setSelectedIndex(0);
/*     */     
/*     */ 
/* 587 */     columnSort();
/*     */   }
/*     */   
/*     */   public void columnSort()
/*     */   {
/* 592 */     TableColumnModel tcmSchedule = this.survey_tb.getColumnModel();
/* 593 */     for (int i = 0; i < this.survey_tb.getColumnModel().getColumnCount(); i++)
/*     */     {
/* 595 */       tcmSchedule.getColumn(i).setCellRenderer(this.tCellRenderer);
/* 596 */       tcmSchedule.getColumn(i).setMaxWidth(this.widths[i]);
/*     */     }
/*     */   }
/*     */   
/*     */   public void setListModel(int size)
/*     */   {
/* 602 */     DefaultListModel ltModel = new DefaultListModel();
/*     */     
/* 604 */     for (int i = 0; i < size; i++)
/*     */     {
/* 606 */       if ((i % 5 == 0) && (i != 0))
/*     */       {
/* 608 */         this.list_ltModel.add(ltModel);
/* 609 */         ltModel = new DefaultListModel();
/*     */       }
/* 611 */       ltModel.addElement(Integer.valueOf(i + 1));
/*     */     }
/* 613 */     this.list_ltModel.add(ltModel);
/*     */     
/* 615 */     this.jlist.setModel((ListModel)this.list_ltModel.get(0));
/*     */   }
/*     */   
/*     */   public void setTableModel(List<Map<String, String>> data)
/*     */   {
/* 620 */     DefaultTableModel tempModel = new DefaultTableModel(this.index_NoSpace, 0)
/*     */     {
/*     */ 
/*     */       public boolean isCellEditable(int row, int column)
/*     */       {
/* 625 */         return false;
/*     */       }
/*     */     };
/*     */     
/* 629 */     for (int i = 0; i < data.size(); i++)
/*     */     {
/* 631 */       if ((i % 15 == 0) && (i != 0))
/*     */       {
/* 633 */         this.list_tbModel.add(tempModel);
/* 634 */         tempModel = new DefaultTableModel(this.index_NoSpace, 0)
/*     */         {
/*     */ 
/*     */           public boolean isCellEditable(int row, int column)
/*     */           {
/* 639 */             return false;
/*     */           }
/*     */         };
/*     */       }
/*     */       
/* 644 */       int tempCount = 0;
/*     */       
/* 646 */       Map<String, String> dataMap = (Map)data.get(i);
/*     */       
/* 648 */       List<String> row_lt = new ArrayList();
/*     */       
/* 650 */       row_lt.add((String)dataMap.get("IDF_CD"));
/* 651 */       row_lt.add((String)dataMap.get("SURVEY_NM"));
/* 652 */       row_lt.add((String)dataMap.get("START_DT"));
/* 653 */       row_lt.add((String)dataMap.get("END_DT"));
/* 654 */       row_lt.add((String)dataMap.get("ERM_DT"));
/*     */       
/* 656 */       Object[] tempObject = new Object[row_lt.size() + 1];
/*     */       
/* 658 */       tempObject[(tempCount++)] = String.valueOf(i + 1);
/*     */       
/* 660 */       for (String str : row_lt)
/*     */       {
/* 662 */         tempObject[(tempCount++)] = str;
/*     */       }
/*     */       
/*     */ 
/* 666 */       tempModel.addRow(tempObject);
/*     */     }
/*     */     
/* 669 */     this.list_tbModel.add(tempModel);
/*     */   }
/*     */   
/*     */   public void doSearch(String searchIdx, String searchCtt) throws SQLException
/*     */   {
/* 674 */     String temp_Idx = "";
/* 675 */     String str1; switch ((str1 = searchIdx).hashCode()) {case -558119792:  if (str1.equals("고유 번호")) break; break; case 347757831:  if (str1.equals("시작 날짜")) {} break; case 1053682564:  if (str1.equals("설문지 이름")) {} break; case 1236273232:  if (str1.equals("등록 날짜")) {} break; case 1573299989:  if (!str1.equals("종료 날짜"))
/*     */       {
/*     */         break label157;
/* 678 */         temp_Idx = "IDF_CD";
/*     */         
/*     */         break label157;
/* 681 */         temp_Idx = "SURVEY_NM";
/*     */         
/*     */         break label157;
/* 684 */         temp_Idx = "START_DT";
/*     */       }
/*     */       else {
/* 687 */         temp_Idx = "END_DT";
/*     */         
/*     */         break label157;
/* 690 */         temp_Idx = "ERM_DT";
/*     */       }
/*     */       break;
/*     */     }
/*     */     label157:
/* 695 */     List<Map<String, String>> data = this.server.db_getDataDoSearch(Enum_Table_Ci.T003, temp_Idx, searchCtt);
/*     */     
/* 697 */     loadSurvey(data);
/*     */   }
/*     */   
/*     */ 
/*     */   static class CustomComboBox
/*     */     extends JLabel
/*     */     implements javax.swing.ListCellRenderer
/*     */   {
/*     */     public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus)
/*     */     {
/* 707 */       JLabel label = new JLabel()
/*     */       {
/*     */         public Dimension getPreferredSize()
/*     */         {
/* 711 */           return new Dimension(100, 80);
/*     */         }
/* 713 */       };
/* 714 */       label.setText(String.valueOf(value));
/* 715 */       label.setFont(new Font("나눔바른고딕", 0, 20));
/*     */       
/* 717 */       return label;
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public void keyPressed(KeyEvent arg0)
/*     */   {
/* 724 */     if (arg0.getKeyCode() == 10)
/*     */     {
/*     */ 
/* 727 */       String temp_searchIdx = String.valueOf(this.cb_searchIdx.getSelectedItem()).trim();
/* 728 */       String temp_searchCtt = this.tf_search.getText();
/*     */       
/*     */       try
/*     */       {
/* 732 */         doSearch(temp_searchIdx, temp_searchCtt);
/*     */       }
/*     */       catch (SQLException e) {
/* 735 */         e.printStackTrace();
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void keyReleased(KeyEvent e) {}
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void keyTyped(KeyEvent e) {}
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
/*     */ 
/*     */   public void mouseExited(MouseEvent arg0) {}
/*     */   
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
/* 781 */     if (arg0.getClickCount() == 2)
/*     */     {
/* 783 */       int row = this.survey_tb.rowAtPoint(arg0.getPoint());
/* 784 */       int col = this.survey_tb.columnAtPoint(arg0.getPoint());
/* 785 */       if ((row >= 0) && (col >= 0))
/*     */       {
/* 787 */         String IDF_CD = (String)this.survey_tb.getValueAt(row, 1);
/*     */         
/*     */         try
/*     */         {
/* 791 */           getContentPane().add("Two", new Survey_Info_Ci(this, IDF_CD));
/*     */         }
/*     */         catch (SQLException e)
/*     */         {
/* 795 */           e.printStackTrace();
/*     */         }
/* 797 */         this.card.next(getContentPane());
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void removeInCard(Component c)
/*     */   {
/* 804 */     getContentPane().remove(c);
/*     */   }
/*     */   
/*     */   public void updateList() throws SQLException
/*     */   {
/* 809 */     loadSurvey();
/*     */   }
/*     */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List_Di.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */