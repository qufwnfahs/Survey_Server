/*     */ package Model.Dialog.Survey_List;
/*     */ 
/*     */ import Worker.Server;
/*     */ import java.awt.CardLayout;
/*     */ import java.awt.Color;
/*     */ import java.awt.Container;
/*     */ import java.awt.Dimension;
/*     */ import java.sql.SQLException;
/*     */ import java.text.ParseException;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JRootPane;
/*     */ 
/*     */ 
/*     */ public class Survey_Frame_Cl
/*     */   extends JFrame
/*     */ {
/*  18 */   private CardLayout card = new CardLayout();
/*     */   
/*     */ 
/*     */   private Survey_Add_Di survey_Add;
/*     */   
/*     */ 
/*     */   private Survey_PointSet_Di point_Add;
/*     */   
/*  26 */   private static Info info = new Info();
/*  27 */   private static Survey_M survey = new Survey_M();
/*     */   
/*     */   public Survey_Frame_Cl(Server server) throws SQLException, ParseException
/*     */   {
/*  31 */     setLayout(this.card);
/*     */     
/*  33 */     this.survey_Add = new Survey_Add_Di(server, this);
/*     */     
/*     */ 
/*  36 */     this.point_Add = new Survey_PointSet_Di(server, this);
/*     */     
/*     */ 
/*  39 */     setPreferredSize(new Dimension(1300, 1000));
/*  40 */     setMinimumSize(new Dimension(1300, 1000));
/*  41 */     setMaximumSize(new Dimension(1300, 1000));
/*  42 */     setLocationRelativeTo(null);
/*  43 */     setUndecorated(true);
/*  44 */     getRootPane().setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
/*  45 */     getContentPane().add("Survey_Add", this.survey_Add);
/*     */     
/*     */ 
/*  48 */     getContentPane().add("Point_Add", this.point_Add);
/*     */   }
/*     */   
/*     */   public void next()
/*     */   {
/*  53 */     this.card.next(getContentPane());
/*     */   }
/*     */   
/*     */   public void prev()
/*     */   {
/*  58 */     this.card.previous(getContentPane());
/*     */   }
/*     */   
/*     */   public static Info getInfo()
/*     */   {
/*  63 */     return info;
/*     */   }
/*     */   
/*     */   public static Survey_M getSurvey()
/*     */   {
/*  68 */     return survey;
/*     */   }
/*     */   
/*     */   static class Info
/*     */   {
/*     */     private String idf_cd;
/*     */     private String survey_nm;
/*     */     private String start_dt;
/*     */     private String end_dt;
/*     */     
/*     */     public String getCode()
/*     */     {
/*  80 */       return this.idf_cd;
/*     */     }
/*     */     
/*     */     public String getName()
/*     */     {
/*  85 */       return this.survey_nm;
/*     */     }
/*     */     
/*     */     public String getStart()
/*     */     {
/*  90 */       return this.start_dt;
/*     */     }
/*     */     
/*     */     public String getEnd()
/*     */     {
/*  95 */       return this.end_dt;
/*     */     }
/*     */     
/*     */     public void setCode(String idf_cd)
/*     */     {
/* 100 */       this.idf_cd = idf_cd;
/*     */     }
/*     */     
/*     */     public void setName(String survey_nm)
/*     */     {
/* 105 */       this.survey_nm = survey_nm;
/*     */     }
/*     */     
/*     */     public void setStart(String start_dt)
/*     */     {
/* 110 */       this.start_dt = start_dt;
/*     */     }
/*     */     
/*     */     public void setEnd(String end_dt)
/*     */     {
/* 115 */       this.end_dt = end_dt;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Survey_Frame_Cl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */