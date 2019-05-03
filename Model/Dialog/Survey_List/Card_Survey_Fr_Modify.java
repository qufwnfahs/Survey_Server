/*     */ package Model.Dialog.Survey_List;
/*     */ 
/*     */ import Enum.Enum_Table_Ci;
/*     */ import Worker.Database;
/*     */ import Worker.ImageController;
/*     */ import com.google.gson.Gson;
/*     */ import java.awt.CardLayout;
/*     */ import java.awt.Color;
/*     */ import java.awt.Container;
/*     */ import java.awt.Dimension;
/*     */ import java.sql.SQLException;
/*     */ import java.text.ParseException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JRootPane;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Card_Survey_Fr_Modify
/*     */   extends JFrame
/*     */ {
/*  26 */   private CardLayout card = new CardLayout();
/*     */   
/*  28 */   private Info_Add_Pl_Modify info_Add = new Info_Add_Pl_Modify(this);
/*  29 */   private Question_Add_Pl question_Add = new Question_Add_Pl(this);
/*  30 */   private Survey_Group_Management_Di group_Add = new Survey_Group_Management_Di(this);
/*  31 */   private Survey_Point_Management_Di point_Add = new Survey_Point_Management_Di(this);
/*     */   
/*     */ 
/*  34 */   private static Module_Survey module_survey = new Module_Survey();
/*  35 */   private static Module_Group module_group = new Module_Group();
/*     */   
/*     */   private String IDF_CD;
/*     */   
/*     */   private String SURVEY_NM;
/*     */   
/*     */   private String END_DT;
/*     */   private String START_DT;
/*     */   private String COLOR_CD;
/*     */   private int POINT_BL;
/*  45 */   private List<Map<String, String>> data = new ArrayList();
/*     */   
/*     */   public Card_Survey_Fr_Modify(String IDF_CD)
/*     */     throws SQLException, ParseException
/*     */   {
/*  50 */     this.IDF_CD = IDF_CD;
/*  51 */     this.data = Database.getRow(Enum_Table_Ci.T003.getCode(), "IDF_CD", IDF_CD);
/*     */     
/*  53 */     this.SURVEY_NM = ((String)((Map)this.data.get(0)).get("SURVEY_NM"));
/*  54 */     this.START_DT = ((String)((Map)this.data.get(0)).get("START_DT"));
/*  55 */     this.END_DT = ((String)((Map)this.data.get(0)).get("END_DT"));
/*  56 */     this.COLOR_CD = ((String)((Map)this.data.get(0)).get("COLOR_CD"));
/*  57 */     module_survey = (Module_Survey)new Gson().fromJson((String)((Map)this.data.get(0)).get("QUE_JSON"), Module_Survey.class);
/*  58 */     module_group = (Module_Group)new Gson().fromJson((String)((Map)this.data.get(0)).get("GROUP_JSON"), Module_Group.class);
/*  59 */     this.POINT_BL = Integer.valueOf((String)((Map)this.data.get(0)).get("POINT_BL")).intValue();
/*     */     
/*     */ 
/*  62 */     setLayout(this.card);
/*  63 */     setPreferredSize(new Dimension(1500, 1000));
/*  64 */     setMinimumSize(new Dimension(1500, 1000));
/*  65 */     setMaximumSize(new Dimension(1500, 1000));
/*  66 */     setLocationRelativeTo(null);
/*  67 */     setUndecorated(true);
/*  68 */     setIconImage(ImageController.resizeImage(new ImageIcon(getClass().getResource("/Image/poker-chip.png")), 48, 48));
/*  69 */     setTitle("정다운마을 설문조사");
/*     */     
/*  71 */     getRootPane().setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
/*     */     
/*     */ 
/*  74 */     getContentPane().add("Info_Add", this.info_Add);
/*  75 */     getContentPane().add("Question_Add", this.question_Add);
/*  76 */     getContentPane().add("Group_Add", this.group_Add);
/*  77 */     getContentPane().add("Point_Add", this.point_Add);
/*     */     
/*  79 */     this.info_Add.setData();
/*  80 */     this.question_Add.setData();
/*  81 */     this.group_Add.setData();
/*  82 */     this.point_Add.createSection_Modify();
/*     */   }
/*     */   
/*     */   public void next()
/*     */   {
/*  87 */     this.card.next(getContentPane());
/*     */   }
/*     */   
/*     */   public void prev()
/*     */   {
/*  92 */     this.card.previous(getContentPane());
/*     */   }
/*     */   
/*     */   public Module_Survey getSurvey()
/*     */   {
/*  97 */     return module_survey;
/*     */   }
/*     */   
/*     */   public Module_Group getGroup()
/*     */   {
/* 102 */     return module_group;
/*     */   }
/*     */   
/*     */   public void setName_Question_Add(String name)
/*     */   {
/* 107 */     this.question_Add.setName(name);
/*     */   }
/*     */   
/*     */   public void creation()
/*     */   {
/* 112 */     this.point_Add.createSection_Modify();
/*     */   }
/*     */   
/*     */   public void clearSurvey()
/*     */   {
/* 117 */     module_survey.getSection().clear();
/*     */   }
/*     */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Card_Survey_Fr_Modify.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */