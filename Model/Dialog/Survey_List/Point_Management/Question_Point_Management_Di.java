/*     */ package Model.Dialog.Survey_List.Point_Management;
/*     */ 
/*     */ import Enum.Enum_Table_Ci;
/*     */ import Model.Dialog.Survey_List.Question_Management.Question;
/*     */ import Model.Dialog.Survey_List.Question_Management.Section;
/*     */ import Worker.Server;
/*     */ import com.google.gson.Gson;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.Font;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.GridBagLayout;
/*     */ import java.awt.Insets;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.sql.SQLException;
/*     */ import java.util.List;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JDialog;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JScrollPane;
/*     */ import javax.swing.JTextField;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Question_Point_Management_Di
/*     */   extends JDialog
/*     */ {
/*     */   private Server server;
/*     */   private Enum_Table_Ci enum_table;
/*     */   private String idf_cd;
/*     */   private String section_num;
/*     */   private JScrollPane scl_dialog;
/*  38 */   private JLabel title_ll = new JLabel();
/*     */   
/*     */ 
/*  41 */   private GridBagLayout gbl = new GridBagLayout();
/*  42 */   private GridBagConstraints gbc = new GridBagConstraints();
/*     */   
/*     */   public Question_Point_Management_Di(Server server, String idf_cd, String section_num) throws SQLException
/*     */   {
/*  46 */     this.server = server;
/*  47 */     this.idf_cd = idf_cd;
/*  48 */     this.section_num = section_num;
/*     */     
/*  50 */     setLayout(this.gbl);
/*     */     
/*     */ 
/*  53 */     setPreferredSize(new Dimension(1415, 800));
/*  54 */     setMinimumSize(new Dimension(1415, 800));
/*  55 */     setMaximumSize(new Dimension(1415, 800));
/*  56 */     setLocationRelativeTo(null);
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*  61 */     this.title_ll.setText("JDU Welfare");
/*  62 */     this.title_ll.setFont(new Font("나눔바른고딕", 1, 35));
/*     */     
/*     */ 
/*  65 */     this.gbc.anchor = 11;
/*  66 */     this.gbc.fill = 1;
/*     */     
/*  68 */     this.gbc.gridx = 0;
/*  69 */     this.gbc.gridy = 0;
/*  70 */     this.gbc.gridwidth = 1;
/*  71 */     this.gbc.gridheight = 1;
/*  72 */     this.gbc.weightx = 1.0D;
/*  73 */     this.gbc.weighty = 1.0D;
/*  74 */     this.gbc.insets = new Insets(0, 0, 0, 0);
/*  75 */     add(this.title_ll, this.gbc);
/*     */     
/*  77 */     loadComponent();
/*     */   }
/*     */   
/*     */   public void loadComponent() throws SQLException
/*     */   {
/*  82 */     this.gbc.gridx = 0;
/*  83 */     this.gbc.gridy = 1;
/*     */     
/*     */ 
/*  86 */     String json = this.server.db_getJSONP(Enum_Table_Ci.T009, this.idf_cd);
/*     */     
/*  88 */     if (!json.equals("[]"))
/*     */     {
/*  90 */       Section[] sectionArray = (Section[])new Gson().fromJson(json, Section[].class);
/*     */       
/*  92 */       for (int i = 0; i < sectionArray.length; i++)
/*     */       {
/*  94 */         if (this.section_num.equals(sectionArray[i].getNum()))
/*     */         {
/*  96 */           List<Question> tempList = sectionArray[i].getList();
/*     */           
/*  98 */           for (int j = 0; j < tempList.size(); j++)
/*     */           {
/* 100 */             String str_head = "문제 ";
/* 101 */             String str_subject = "";
/* 102 */             String str_point = "";
/*     */             
/* 104 */             JTextField tf_point = new JTextField();
/* 105 */             JButton bt_openOpt = new JButton();
/*     */             
/* 107 */             final Question_Set_Pl pl_Opt = new Question_Set_Pl(this.server, ((Question)tempList.get(j)).getType(), ((Question)tempList.get(j)).getList());
/* 108 */             pl_Opt.setVisible(false);
/*     */             
/* 110 */             bt_openOpt.addActionListener(new ActionListener()
/*     */             {
/*     */ 
/*     */               public void actionPerformed(ActionEvent arg0)
/*     */               {
/* 115 */                 if (pl_Opt.isVisible())
/*     */                 {
/* 117 */                   pl_Opt.setVisible(false);
/*     */                 }
/*     */                 else
/*     */                 {
/* 121 */                   pl_Opt.setVisible(true);
/*     */                 }
/*     */                 
/*     */               }
/*     */               
/* 126 */             });
/* 127 */             str_head = str_head + ((Question)tempList.get(j)).getNum();
/* 128 */             str_subject = str_subject + ((Question)tempList.get(j)).getName();
/* 129 */             str_point = str_point + ((Question)tempList.get(j)).getPoint();
/*     */             
/* 131 */             add(new JLabel(str_head), this.gbc);
/*     */             
/* 133 */             this.gbc.gridx += 1;
/* 134 */             add(new JLabel(str_subject), this.gbc);
/*     */             
/* 136 */             this.gbc.gridx += 1;
/* 137 */             add(new JTextField(str_point), this.gbc);
/*     */             
/* 139 */             this.gbc.gridx += 1;
/* 140 */             add(bt_openOpt, this.gbc);
/*     */             
/* 142 */             this.gbc.gridx = 0;
/* 143 */             this.gbc.gridy += 1;
/* 144 */             add(pl_Opt, this.gbc);
/*     */             
/* 146 */             this.gbc.gridy += 1;
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Point_Management\Question_Point_Management_Di.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */