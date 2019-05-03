/*      */ package Model.Dialog;
/*      */ 
/*      */ import Enum.Enum_Font_Ci;
/*      */ import Enum.Enum_Image_Ci;
/*      */ import Enum.Enum_Table_Ci;
/*      */ import Worker.Database;
/*      */ import Worker.ImageController;
/*      */ import com.google.gson.JsonSyntaxException;
/*      */ import java.awt.CardLayout;
/*      */ import java.awt.Color;
/*      */ import java.awt.Cursor;
/*      */ import java.awt.GridBagConstraints;
/*      */ import java.awt.GridBagLayout;
/*      */ import java.awt.Insets;
/*      */ import java.awt.event.ActionEvent;
/*      */ import java.awt.event.ActionListener;
/*      */ import java.sql.SQLException;
/*      */ import java.util.ArrayList;
/*      */ import java.util.List;
/*      */ import java.util.Map;
/*      */ import javax.swing.BorderFactory;
/*      */ import javax.swing.ImageIcon;
/*      */ import javax.swing.JButton;
/*      */ import javax.swing.JLabel;
/*      */ import javax.swing.JPanel;
/*      */ import javax.swing.JScrollBar;
/*      */ import javax.swing.JScrollPane;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ class Panel_Individual
/*      */   extends JPanel
/*      */   implements ActionListener
/*      */ {
/* 1135 */   private GridBagLayout gbl = new GridBagLayout();
/* 1136 */   private GridBagConstraints gbc = new GridBagConstraints();
/*      */   
/* 1138 */   private JLabel ll_id = new JLabel();
/* 1139 */   private JLabel ll_counting = new JLabel();
/*      */   
/* 1141 */   private JButton bt_left = new JButton();
/* 1142 */   private JButton bt_right = new JButton();
/*      */   
/*      */   private List<Map<String, String>> lt_client;
/*      */   private Map<String, String> map_survey;
/* 1146 */   private List<JPanel> lt_panel = new ArrayList();
/*      */   
/* 1148 */   private CardLayout card = new CardLayout();
/* 1149 */   private JPanel pl_card = new JPanel();
/*      */   
/* 1151 */   private JScrollPane scl_card = new JScrollPane(this.pl_card);
/*      */   
/*      */   private Panel_Statistics pl_statistics;
/*      */   
/* 1155 */   private int count = 0;
/*      */   
/*      */   public Panel_Individual(String IDF_CD, Panel_Statistics pl_statistics) throws SQLException
/*      */   {
/* 1159 */     this.pl_statistics = pl_statistics;
/*      */     
/* 1161 */     setLayout(this.gbl);
/* 1162 */     setBackground(Color.WHITE);
/* 1163 */     setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, Color.BLACK));
/*      */     
/* 1165 */     this.lt_client = Database.getRow(Enum_Table_Ci.T010.getCode(), "IDF_CD", IDF_CD);
/* 1166 */     this.map_survey = Database.getOneRow(Enum_Table_Ci.T003.getCode(), "IDF_CD", IDF_CD);
/*      */     
/* 1168 */     this.ll_id.setFont(Enum_Font_Ci.나눔바른고딕22.getFont());
/* 1169 */     this.ll_counting.setFont(Enum_Font_Ci.나눔바른고딕22.getFont());
/*      */     
/* 1171 */     this.bt_left.setOpaque(true);
/* 1172 */     this.bt_left.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.BUTTON_PREV_IMAGE_BLACK.getImageIcon(), 36, 36)));
/* 1173 */     this.bt_left.setBackground(Color.WHITE);
/* 1174 */     this.bt_left.setBorder(null);
/* 1175 */     this.bt_left.setCursor(new Cursor(12));
/* 1176 */     this.bt_left.addActionListener(this);
/* 1177 */     this.bt_right.setOpaque(true);
/* 1178 */     this.bt_right.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.BUTTON_NEXT_IMAGE_BLACK.getImageIcon(), 36, 36)));
/* 1179 */     this.bt_right.setBackground(Color.WHITE);
/* 1180 */     this.bt_right.setBorder(null);
/* 1181 */     this.bt_right.setCursor(new Cursor(12));
/* 1182 */     this.bt_right.addActionListener(this);
/*      */     
/* 1184 */     this.scl_card.setVerticalScrollBarPolicy(20);
/* 1185 */     this.scl_card.setHorizontalScrollBarPolicy(30);
/* 1186 */     this.scl_card.getVerticalScrollBar().setUnitIncrement(16);
/* 1187 */     this.scl_card.getVerticalScrollBar().setBackground(new Color(241, 241, 241));
/*      */     
/* 1189 */     this.pl_card.setLayout(this.card);
/* 1190 */     this.pl_card.setBackground(Color.WHITE);
/*      */     
/* 1192 */     this.gbc.anchor = 17;
/* 1193 */     this.gbc.fill = 0;
/*      */     
/* 1195 */     this.gbc.gridx = 0;
/* 1196 */     this.gbc.gridy = 0;
/* 1197 */     this.gbc.gridwidth = 1;
/* 1198 */     this.gbc.gridheight = 1;
/* 1199 */     this.gbc.weightx = 0.9D;
/* 1200 */     this.gbc.insets = new Insets(20, 30, 0, 0);
/* 1201 */     add(this.ll_id, this.gbc);
/*      */     
/* 1203 */     this.gbc.anchor = 11;
/*      */     
/* 1205 */     this.gbc.gridx = 1;
/* 1206 */     this.gbc.weightx = 0.025D;
/* 1207 */     this.gbc.insets = new Insets(20, 0, 0, 0);
/* 1208 */     add(this.bt_left, this.gbc);
/*      */     
/* 1210 */     this.gbc.gridx = 2;
/* 1211 */     this.gbc.weightx = 0.05D;
/* 1212 */     this.gbc.insets = new Insets(25, 0, 0, 0);
/* 1213 */     add(this.ll_counting, this.gbc);
/*      */     
/* 1215 */     this.gbc.gridx = 3;
/* 1216 */     this.gbc.weightx = 0.025D;
/* 1217 */     this.gbc.insets = new Insets(20, 0, 0, 0);
/* 1218 */     add(this.bt_right, this.gbc);
/*      */     
/* 1220 */     this.gbc.fill = 1;
/*      */     
/* 1222 */     this.gbc.gridx = 0;
/* 1223 */     this.gbc.gridy = 1;
/* 1224 */     this.gbc.gridwidth = 4;
/* 1225 */     this.gbc.weightx = 1.0D;
/* 1226 */     this.gbc.weighty = 0.7D;
/* 1227 */     add(this.scl_card, this.gbc);
/*      */     
/* 1229 */     updatePanel();
/*      */   }
/*      */   
/*      */   public void updatePanel() throws JsonSyntaxException, SQLException
/*      */   {
/* 1234 */     setLabel();
/*      */     
/* 1236 */     for (int i = 0; i < this.lt_client.size(); i++)
/*      */     {
/* 1238 */       Panel_Individual_Client p_i_c = new Panel_Individual_Client((String)((Map)this.lt_client.get(i)).get("ID"), (String)((Map)this.lt_client.get(i)).get("IDF_CD"), (Map)this.lt_client.get(i), this.map_survey, this.pl_statistics);
/* 1239 */       this.pl_card.add(p_i_c);
/*      */     }
/*      */   }
/*      */   
/*      */   public void setLabel()
/*      */   {
/* 1245 */     this.ll_id.setText((String)((Map)this.lt_client.get(this.count)).get("ID"));
/* 1246 */     this.ll_counting.setText(this.count + 1 + "   /   " + this.lt_client.size());
/*      */   }
/*      */   
/*      */ 
/*      */   public void actionPerformed(ActionEvent arg0)
/*      */   {
/* 1252 */     if (arg0.getSource().equals(this.bt_left))
/*      */     {
/* 1254 */       if (this.count == 0)
/*      */       {
/* 1256 */         this.count = (this.lt_client.size() - 1);
/*      */       }
/*      */       else
/*      */       {
/* 1260 */         this.count -= 1;
/*      */       }
/* 1262 */       setLabel();
/* 1263 */       this.card.previous(this.pl_card);
/*      */     }
/* 1265 */     else if (arg0.getSource().equals(this.bt_right))
/*      */     {
/* 1267 */       if (this.count == this.lt_client.size() - 1)
/*      */       {
/* 1269 */         this.count = 0;
/*      */       }
/*      */       else
/*      */       {
/* 1273 */         this.count += 1;
/*      */       }
/* 1275 */       setLabel();
/* 1276 */       this.card.next(this.pl_card);
/*      */     }
/*      */   }
/*      */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Panel_Individual.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */