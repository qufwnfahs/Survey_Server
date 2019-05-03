/*     */ package Model.Dialog;
/*     */ 
/*     */ import Enum.Enum_Font_Ci;
/*     */ import Enum.Enum_Table_Ci;
/*     */ import Model.Dialog.Survey_List.Module_Client_Question;
/*     */ import Model.Dialog.Survey_List.Module_Client_Section;
/*     */ import Model.Dialog.Survey_List.Module_Client_Survey;
/*     */ import Model.Dialog.Survey_List.Module_Question;
/*     */ import Model.Dialog.Survey_List.Module_Section;
/*     */ import Model.Dialog.Survey_List.Module_Survey;
/*     */ import Worker.Database;
/*     */ import com.google.gson.Gson;
/*     */ import java.awt.BorderLayout;
/*     */ import java.awt.Color;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.GridBagLayout;
/*     */ import java.awt.Insets;
/*     */ import java.sql.SQLException;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JScrollBar;
/*     */ import javax.swing.JScrollPane;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class Panel_Summary
/*     */   extends JPanel
/*     */ {
/* 243 */   private GridBagLayout gbl = new GridBagLayout();
/* 244 */   private GridBagConstraints gbc = new GridBagConstraints();
/*     */   
/* 246 */   private JPanel pl_main = new JPanel();
/*     */   
/* 248 */   private JScrollPane scl_main = new JScrollPane(this.pl_main);
/*     */   
/*     */   public Panel_Summary(String IDF_CD) throws SQLException
/*     */   {
/* 252 */     setLayout(new BorderLayout());
/* 253 */     add(this.scl_main, "Center");
/*     */     
/*     */ 
/* 256 */     this.scl_main.setVerticalScrollBarPolicy(20);
/* 257 */     this.scl_main.setHorizontalScrollBarPolicy(30);
/* 258 */     this.scl_main.getVerticalScrollBar().setUnitIncrement(16);
/* 259 */     this.scl_main.getVerticalScrollBar().setBackground(new Color(241, 241, 241));
/*     */     
/* 261 */     this.pl_main.setLayout(this.gbl);
/* 262 */     this.pl_main.setBackground(Color.WHITE);
/*     */     
/* 264 */     loadSummary(IDF_CD);
/*     */   }
/*     */   
/*     */   public void loadSummary(String IDF_CD) throws SQLException
/*     */   {
/* 269 */     List<Map<String, String>> lt_client = Database.getRow(Enum_Table_Ci.T010.getCode(), "IDF_CD", IDF_CD);
/* 270 */     Map<String, String> map_survey = Database.getOneRow(Enum_Table_Ci.T003.getCode(), "IDF_CD", IDF_CD);
/* 271 */     Map<Integer, Map<String, Map<String, String>>> map_summary = new HashMap();
/*     */     
/*     */ 
/* 274 */     Module_Survey md_survey = (Module_Survey)new Gson().fromJson((String)map_survey.get("QUE_JSON"), Module_Survey.class);
/*     */     
/* 276 */     int count = 0;
/*     */     
/* 278 */     for (int i = 0; i < md_survey.getSection().size(); i++)
/*     */     {
/* 280 */       for (int j = 0; j < ((Module_Section)md_survey.getSection().get(i)).getQuestion().size(); j++)
/*     */       {
/* 282 */         map_summary.put(Integer.valueOf(count++), new HashMap());
/*     */       }
/*     */     }
/*     */     
/* 286 */     for (int i = 0; i < lt_client.size(); i++)
/*     */     {
/* 288 */       count = 0;
/*     */       
/* 290 */       Module_Client_Survey m_c_s = (Module_Client_Survey)new Gson().fromJson((String)((Map)lt_client.get(i)).get("RESPONSE_JSON"), Module_Client_Survey.class);
/*     */       
/* 292 */       for (int j = 0; j < m_c_s.getSection().size(); j++)
/*     */       {
/* 294 */         for (int k = 0; k < ((Module_Client_Section)m_c_s.getSection().get(j)).getQuestion().size(); k++)
/*     */         {
/* 296 */           ((Map)map_summary.get(Integer.valueOf(count++))).put((String)((Map)lt_client.get(i)).get("ID"), ((Module_Client_Question)((Module_Client_Section)m_c_s.getSection().get(j)).getQuestion().get(k)).getAnswer());
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 301 */     this.gbc.gridy = -1;
/*     */     
/* 303 */     count = 0;
/*     */     
/* 305 */     for (int i = 0; i < md_survey.getSection().size(); i++)
/*     */     {
/* 307 */       JLabel ll_section = new JLabel("섹션 " + (i + 1) + " : " + ((Module_Section)md_survey.getSection().get(i)).getName());
/* 308 */       ll_section.setFont(Enum_Font_Ci.나눔바른고딕22.getFont());
/* 309 */       ll_section.setOpaque(true);
/* 310 */       ll_section.setBackground(new Color(Integer.valueOf(md_survey.getMainColor()).intValue(), true));
/* 311 */       ll_section.setBorder(BorderFactory.createEmptyBorder(15, 20, 15, 20));
/* 312 */       ll_section.setForeground(Color.WHITE);
/*     */       
/* 314 */       this.gbc.anchor = 11;
/* 315 */       this.gbc.fill = 1;
/*     */       
/* 317 */       this.gbc.gridx = 0;
/* 318 */       this.gbc.gridy += 1;
/* 319 */       this.gbc.gridwidth = 1;
/* 320 */       this.gbc.weightx = 1.0D;
/* 321 */       this.gbc.weighty = 1.0D;
/* 322 */       this.gbc.insets = new Insets(0, 0, 0, 0);
/* 323 */       this.pl_main.add(ll_section, this.gbc);
/*     */       
/* 325 */       for (int j = 0; j < ((Module_Section)md_survey.getSection().get(i)).getQuestion().size(); j++)
/*     */       {
/* 327 */         Panel_Client_Response pl_c_r = new Panel_Client_Response(((Module_Question)((Module_Section)md_survey.getSection().get(i)).getQuestion().get(j)).getType());
/* 328 */         pl_c_r.setLabel(((Module_Question)((Module_Section)md_survey.getSection().get(i)).getQuestion().get(j)).getType(), "질문  " + (j + 1) + "  :  " + ((Module_Question)((Module_Section)md_survey.getSection().get(i)).getQuestion().get(j)).getName(), (Map)map_summary.get(Integer.valueOf(count++)), ((Module_Question)((Module_Section)md_survey.getSection().get(i)).getQuestion().get(j)).getOption(), md_survey.getMainColor());
/*     */         
/* 330 */         this.gbc.gridy += 1;
/* 331 */         this.pl_main.add(pl_c_r, this.gbc);
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Panel_Summary.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */