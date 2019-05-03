/*     */ package Model.Dialog.Survey_List.Point_Management;
/*     */ 
/*     */ import Model.Dialog.Survey_List.Question_Management.Option;
/*     */ import Worker.Server;
/*     */ import java.awt.Component;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.GridBagLayout;
/*     */ import java.awt.Insets;
/*     */ import java.io.PrintStream;
/*     */ import java.util.List;
/*     */ import java.util.Vector;
/*     */ import javax.swing.AbstractListModel;
/*     */ import javax.swing.JCheckBox;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JList;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JScrollPane;
/*     */ import javax.swing.JTable;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.ListCellRenderer;
/*     */ import javax.swing.UIManager;
/*     */ import javax.swing.table.DefaultTableModel;
/*     */ import javax.swing.table.JTableHeader;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Question_Set_Pl
/*     */   extends JPanel
/*     */ {
/*     */   private Server server;
/*     */   private String type;
/*     */   private List<Option> list_option;
/*  36 */   private GridBagLayout gbl = new GridBagLayout();
/*  37 */   private GridBagConstraints gbc = new GridBagConstraints();
/*     */   
/*     */   public Question_Set_Pl(Server server, String type, List<Option> list_option)
/*     */   {
/*  41 */     this.server = server;
/*  42 */     this.type = type;
/*  43 */     this.list_option = list_option;
/*     */     
/*  45 */     System.out.println(list_option.size());
/*     */     
/*  47 */     setLayout(this.gbl);
/*     */     
/*  49 */     loadComponent();
/*     */   }
/*     */   
/*     */ 
/*     */   public void loadComponent()
/*     */   {
/*  55 */     this.gbc.anchor = 11;
/*  56 */     this.gbc.fill = 1;
/*     */     
/*  58 */     this.gbc.gridx = 0;
/*  59 */     this.gbc.gridy = 0;
/*  60 */     this.gbc.gridwidth = 1;
/*  61 */     this.gbc.gridheight = 1;
/*  62 */     this.gbc.weightx = 1.0D;
/*  63 */     this.gbc.weighty = 1.0D;
/*  64 */     this.gbc.insets = new Insets(0, 0, 0, 0);
/*     */     
/*  66 */     if (this.type.equals("OpenEnded"))
/*     */     {
/*  68 */       add(new JLabel("type : OpenEnded"), this.gbc);
/*     */       
/*  70 */       for (int i = 0; i < this.list_option.size(); i++)
/*     */       {
/*  72 */         String str_point = "";
/*  73 */         str_point = str_point + ((Option)this.list_option.get(i)).getPoint();
/*     */         
/*  75 */         this.gbc.gridy += 1;
/*     */         
/*  77 */         add(new JLabel(((Option)this.list_option.get(i)).getNum() + ((Option)this.list_option.get(i)).getName()), this.gbc);
/*     */         
/*  79 */         this.gbc.gridx += 1;
/*  80 */         add(new JTextField(str_point), this.gbc);
/*     */       }
/*  82 */     } else if (this.type.equals("Multiple"))
/*     */     {
/*  84 */       add(new JLabel("type : Multiple"), this.gbc);
/*     */       
/*  86 */       for (int i = 0; i < this.list_option.size(); i++)
/*     */       {
/*  88 */         String str_point = "";
/*  89 */         str_point = str_point + ((Option)this.list_option.get(i)).getPoint();
/*     */         
/*  91 */         this.gbc.gridy += 1;
/*     */         
/*  93 */         add(new JLabel(((Option)this.list_option.get(i)).getNum() + ((Option)this.list_option.get(i)).getName()), this.gbc);
/*     */         
/*  95 */         this.gbc.gridx += 1;
/*  96 */         add(new JTextField(str_point), this.gbc);
/*     */         
/*  98 */         this.gbc.gridx = 0;
/*     */       }
/* 100 */     } else if (this.type.equals("CheckBox"))
/*     */     {
/* 102 */       add(new JLabel("type : CheckBox"), this.gbc);
/*     */       
/* 104 */       for (int i = 0; i < this.list_option.size(); i++)
/*     */       {
/* 106 */         String str_point = "";
/* 107 */         str_point = str_point + ((Option)this.list_option.get(i)).getPoint();
/*     */         
/* 109 */         this.gbc.gridy += 1;
/*     */         
/* 111 */         add(new JLabel(((Option)this.list_option.get(i)).getNum() + ((Option)this.list_option.get(i)).getName()), this.gbc);
/*     */         
/* 113 */         this.gbc.gridx += 1;
/* 114 */         add(new JTextField(str_point), this.gbc);
/*     */         
/* 116 */         JCheckBox tempCb = new JCheckBox();
/* 117 */         tempCb.setSelected(((Option)this.list_option.get(i)).getAnswer());
/*     */         
/* 119 */         this.gbc.gridx += 1;
/* 120 */         add(tempCb, this.gbc);
/*     */         
/* 122 */         this.gbc.gridx = 0;
/*     */       }
/* 124 */     } else if (this.type.equals("DropDown"))
/*     */     {
/* 126 */       add(new JLabel("type : DropDown"), this.gbc);
/*     */       
/* 128 */       for (int i = 0; i < this.list_option.size(); i++)
/*     */       {
/* 130 */         String str_point = "";
/* 131 */         str_point = str_point + ((Option)this.list_option.get(i)).getPoint();
/*     */         
/* 133 */         this.gbc.gridy += 1;
/*     */         
/* 135 */         add(new JLabel(((Option)this.list_option.get(i)).getNum() + ((Option)this.list_option.get(i)).getName()), this.gbc);
/*     */         
/* 137 */         this.gbc.gridx += 1;
/* 138 */         add(new JTextField(str_point), this.gbc);
/*     */         
/* 140 */         this.gbc.gridx = 0;
/*     */       }
/* 142 */     } else if (this.type.equals("Linear"))
/*     */     {
/* 144 */       add(new JLabel("type : Linear"), this.gbc);
/*     */       
/* 146 */       for (int i = 0; i < this.list_option.size(); i++)
/*     */       {
/* 148 */         String str_point = "";
/* 149 */         str_point = str_point + ((Option)this.list_option.get(i)).getPoint();
/*     */         
/* 151 */         this.gbc.gridy += 1;
/*     */         
/* 153 */         add(new JLabel(i + 1 + ((Option)this.list_option.get(i)).getName()), this.gbc);
/*     */         
/* 155 */         this.gbc.gridx = 0;
/*     */       }
/*     */     }
/* 158 */     else if (this.type.equals("RadioGrid"))
/*     */     {
/* 160 */       add(new JLabel("type : RadioGrid"), this.gbc);
/*     */       
/* 162 */       for (int i = 0; i < this.list_option.size(); i++)
/*     */       {
/* 164 */         int num = Integer.parseInt(((Option)this.list_option.get(i)).getNum());
/*     */         
/* 166 */         if (num / 10 == 0)
/*     */         {
/* 168 */           String str_point = "";
/* 169 */           str_point = str_point + ((Option)this.list_option.get(i)).getPoint();
/*     */           
/* 171 */           this.gbc.gridy += 1;
/*     */           
/* 173 */           add(new JLabel(((Option)this.list_option.get(i)).getNum() + ((Option)this.list_option.get(i)).getName()), this.gbc);
/*     */           
/* 175 */           this.gbc.gridx += 1;
/* 176 */           add(new JTextField(str_point), this.gbc);
/*     */           
/* 178 */           this.gbc.gridx = 0;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/* 183 */       Vector<String> vec_row = new Vector();
/* 184 */       Vector<String> vec_col = new Vector();
/*     */       
/* 186 */       for (int i = 0; i < this.list_option.size(); i++)
/*     */       {
/* 188 */         int num = Integer.parseInt(((Option)this.list_option.get(i)).getNum());
/*     */         
/* 190 */         if (num / 10 == 0)
/*     */         {
/* 192 */           vec_col.add(((Option)this.list_option.get(i)).getName());
/*     */         }
/*     */         else {
/* 195 */           vec_row.add(((Option)this.list_option.get(i)).getName());
/*     */         }
/*     */       }
/*     */       
/* 199 */       ListModel lm_row = new ListModel(vec_row);
/*     */       
/* 201 */       DefaultTableModel defaultTableModel = new DefaultTableModel(vec_col, vec_row.size());
/*     */       
/*     */ 
/* 204 */       JTable tb_option = new JTable(defaultTableModel);
/*     */       
/* 206 */       JList rowHeader = new JList(lm_row);
/* 207 */       rowHeader.setFixedCellWidth(50);
/* 208 */       rowHeader.setFixedCellHeight(tb_option.getRowHeight(0));
/* 209 */       rowHeader.setCellRenderer(new RowRenderer(tb_option));
/*     */       
/* 211 */       JScrollPane pane = new JScrollPane(tb_option);
/* 212 */       pane.setVerticalScrollBarPolicy(20);
/* 213 */       pane.setHorizontalScrollBarPolicy(30);
/* 214 */       pane.setRowHeaderView(rowHeader);
/* 215 */       pane.setPreferredSize(new Dimension(500, tb_option.getRowHeight(0) * (vec_row.size() + 2)));
/*     */       
/* 217 */       this.gbc.gridy += 1;
/* 218 */       add(pane, this.gbc);
/*     */     }
/* 220 */     else if (this.type.equals("CheckBoxGrid"))
/*     */     {
/* 222 */       add(new JLabel("type : CheckBoxGrid"), this.gbc);
/*     */       
/* 224 */       for (int i = 0; i < this.list_option.size(); i++)
/*     */       {
/* 226 */         int num = Integer.parseInt(((Option)this.list_option.get(i)).getNum());
/*     */         
/* 228 */         if (num / 10 == 0)
/*     */         {
/* 230 */           String str_point = "";
/* 231 */           str_point = str_point + ((Option)this.list_option.get(i)).getPoint();
/*     */           
/* 233 */           this.gbc.gridy += 1;
/*     */           
/* 235 */           add(new JLabel(((Option)this.list_option.get(i)).getNum() + ((Option)this.list_option.get(i)).getName()), this.gbc);
/*     */           
/* 237 */           this.gbc.gridx += 1;
/* 238 */           add(new JTextField(str_point), this.gbc);
/*     */           
/* 240 */           JCheckBox tempCb = new JCheckBox();
/* 241 */           tempCb.setSelected(((Option)this.list_option.get(i)).getAnswer());
/*     */           
/* 243 */           this.gbc.gridx += 1;
/* 244 */           add(tempCb, this.gbc);
/*     */           
/* 246 */           this.gbc.gridx = 0;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/* 251 */       Vector<String> vec_row = new Vector();
/* 252 */       Vector<String> vec_col = new Vector();
/*     */       
/* 254 */       for (int i = 0; i < this.list_option.size(); i++)
/*     */       {
/* 256 */         int num = Integer.parseInt(((Option)this.list_option.get(i)).getNum());
/*     */         
/* 258 */         if (num / 10 == 0)
/*     */         {
/* 260 */           vec_col.add(((Option)this.list_option.get(i)).getName());
/*     */         }
/*     */         else {
/* 263 */           vec_row.add(((Option)this.list_option.get(i)).getName());
/*     */         }
/*     */       }
/*     */       
/* 267 */       ListModel lm_row = new ListModel(vec_row);
/*     */       
/* 269 */       DefaultTableModel defaultTableModel = new DefaultTableModel(vec_col, vec_row.size());
/*     */       
/*     */ 
/* 272 */       JTable tb_option = new JTable(defaultTableModel);
/*     */       
/* 274 */       JList rowHeader = new JList(lm_row);
/* 275 */       rowHeader.setFixedCellWidth(50);
/* 276 */       rowHeader.setFixedCellHeight(tb_option.getRowHeight(0));
/* 277 */       rowHeader.setCellRenderer(new RowRenderer(tb_option));
/*     */       
/* 279 */       JScrollPane pane = new JScrollPane(tb_option);
/* 280 */       pane.setVerticalScrollBarPolicy(20);
/* 281 */       pane.setHorizontalScrollBarPolicy(30);
/* 282 */       pane.setRowHeaderView(rowHeader);
/* 283 */       pane.setPreferredSize(new Dimension(500, tb_option.getRowHeight(0) * (vec_row.size() + 2)));
/*     */       
/* 285 */       this.gbc.gridy += 1;
/* 286 */       add(pane, this.gbc);
/*     */     }
/*     */   }
/*     */   
/*     */   class ListModel extends AbstractListModel
/*     */   {
/*     */     Vector<String> headers;
/*     */     
/*     */     public ListModel()
/*     */     {
/* 296 */       this.headers = vec_row;
/*     */     }
/*     */     
/*     */ 
/*     */     public Object getElementAt(int index)
/*     */     {
/* 302 */       return this.headers.get(index);
/*     */     }
/*     */     
/*     */ 
/*     */     public int getSize()
/*     */     {
/* 308 */       return this.headers.size();
/*     */     }
/*     */   }
/*     */   
/*     */   class RowRenderer extends JLabel implements ListCellRenderer
/*     */   {
/*     */     public RowRenderer(JTable table)
/*     */     {
/* 316 */       JTableHeader header = table.getTableHeader();
/* 317 */       setOpaque(true);
/* 318 */       setBorder(UIManager.getBorder("TableHeader.cellBorder"));
/* 319 */       setHorizontalAlignment(0);
/* 320 */       setForeground(header.getForeground());
/* 321 */       setBackground(header.getBackground());
/* 322 */       setFont(header.getFont());
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */     public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus)
/*     */     {
/* 329 */       setText(value == null ? "" : value.toString());
/* 330 */       return this;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Point_Management\Question_Set_Pl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */