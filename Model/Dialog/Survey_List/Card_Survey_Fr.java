/*     */ package Model.Dialog.Survey_List;
/*     */ 
/*     */ import Enum.Enum_Table_Ci;
/*     */ import Worker.Database;
/*     */ import Worker.ImageController;
/*     */ import Worker.RadomKey;
/*     */ import java.awt.CardLayout;
/*     */ import java.awt.Color;
/*     */ import java.awt.Container;
/*     */ import java.awt.Dimension;
/*     */ import java.sql.SQLException;
/*     */ import java.text.ParseException;
/*     */ import java.util.List;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JRootPane;
/*     */ 
/*     */ public class Card_Survey_Fr
/*     */   extends JFrame
/*     */ {
/*  22 */   private CardLayout card = new CardLayout();
/*     */   
/*  24 */   private Info_Add_Pl info_Add = new Info_Add_Pl(this);
/*  25 */   private Question_Add_Pl question_Add = new Question_Add_Pl(this);
/*  26 */   private Survey_Group_Management_Di group_Add = new Survey_Group_Management_Di(this);
/*  27 */   private Survey_Point_Management_Di point_Add = new Survey_Point_Management_Di(this);
/*     */   
/*     */ 
/*  30 */   private static Module_Survey module_survey = new Module_Survey();
/*  31 */   private static Module_Group module_group = new Module_Group();
/*     */   
/*     */   private String idf_cd;
/*     */   
/*     */   public Card_Survey_Fr()
/*     */     throws SQLException, ParseException
/*     */   {
/*  38 */     module_survey = new Module_Survey();
/*  39 */     module_group = new Module_Group();
/*     */     
/*     */ 
/*  42 */     setLayout(this.card);
/*  43 */     setPreferredSize(new Dimension(1500, 1000));
/*  44 */     setMinimumSize(new Dimension(1500, 1000));
/*  45 */     setMaximumSize(new Dimension(1500, 1000));
/*  46 */     setLocationRelativeTo(null);
/*  47 */     setUndecorated(true);
/*  48 */     setIconImage(ImageController.resizeImage(new ImageIcon(getClass().getResource("/Image/poker-chip.png")), 48, 48));
/*  49 */     setTitle("정다운마을 설문조사");
/*     */     
/*  51 */     getRootPane().setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
/*     */     
/*     */ 
/*  54 */     getContentPane().add("Info_Add", this.info_Add);
/*  55 */     getContentPane().add("Question_Add", this.question_Add);
/*  56 */     getContentPane().add("Group_Add", this.group_Add);
/*  57 */     getContentPane().add("Point_Add", this.point_Add);
/*     */     
/*     */ 
/*  60 */     while ((Database.find(Enum_Table_Ci.T003.getCode(), "IDF_CD", this.idf_cd)) || (this.idf_cd == null))
/*     */     {
/*  62 */       this.idf_cd = RadomKey.generateKey(System.currentTimeMillis());
/*     */     }
/*  64 */     module_survey.setCode(this.idf_cd);
/*  65 */     this.info_Add.setCode(this.idf_cd);
/*     */   }
/*     */   
/*     */   public void next()
/*     */   {
/*  70 */     this.card.next(getContentPane());
/*     */   }
/*     */   
/*     */   public void prev()
/*     */   {
/*  75 */     this.card.previous(getContentPane());
/*     */   }
/*     */   
/*     */   public Module_Survey getSurvey()
/*     */   {
/*  80 */     return module_survey;
/*     */   }
/*     */   
/*     */   public Module_Group getGroup()
/*     */   {
/*  85 */     return module_group;
/*     */   }
/*     */   
/*     */   public void setName_Question_Add(String name)
/*     */   {
/*  90 */     this.question_Add.setName(name);
/*     */   }
/*     */   
/*     */   public void creation()
/*     */   {
/*  95 */     this.point_Add.createSection();
/*     */   }
/*     */   
/*     */   public void clearSurvey()
/*     */   {
/* 100 */     module_survey.getSection().clear();
/*     */   }
/*     */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Card_Survey_Fr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */