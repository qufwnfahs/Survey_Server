/*     */ package Model;
/*     */ 
/*     */ import Model.Dialog.Survey_List.Card_Survey_Fr;
/*     */ import Model.Dialog.Survey_List.Card_Survey_Fr_Modify;
/*     */ import Model.Dialog.Survey_List.Module_Question;
/*     */ import Model.Dialog.Survey_List.Module_Section;
/*     */ import Model.Dialog.Survey_List.Module_Survey;
/*     */ import java.awt.BorderLayout;
/*     */ import java.awt.Color;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.GridBagLayout;
/*     */ import java.awt.Insets;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.swing.JPanel;
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
/*     */ public class Question_Module
/*     */   extends JPanel
/*     */ {
/*  34 */   private GridBagLayout gbl = new GridBagLayout();
/*  35 */   private GridBagConstraints gbc = new GridBagConstraints();
/*     */   
/*  37 */   private List<Module_Question> lt_que = new ArrayList();
/*     */   
/*  39 */   private List<Panel_Two> list_two = new ArrayList();
/*  40 */   private List<Panel_Three> list_three = new ArrayList();
/*     */   private Card_Survey_Fr frame;
/*     */   private Card_Survey_Fr_Modify frame_Modify;
/*     */   
/*     */   public Question_Module(List<Module_Question> lt_que, Card_Survey_Fr frame)
/*     */   {
/*  46 */     setLayout(this.gbl);
/*  47 */     setBackground(Color.WHITE);
/*     */     
/*  49 */     this.lt_que = lt_que;
/*  50 */     this.frame = frame;
/*     */     
/*  52 */     this.gbc.anchor = 10;
/*  53 */     this.gbc.fill = 1;
/*     */     
/*  55 */     this.gbc.gridx = 0;
/*  56 */     this.gbc.gridy = 0;
/*  57 */     this.gbc.gridwidth = 1;
/*  58 */     this.gbc.gridheight = 1;
/*     */     
/*  60 */     for (int i = 0; i < lt_que.size(); i++)
/*     */     {
/*  62 */       Module_Question md_qu = (Module_Question)lt_que.get(i);
/*     */       
/*  64 */       JPanel pl_total = new JPanel();
/*  65 */       pl_total.setLayout(new BorderLayout());
/*     */       
/*  67 */       Panel_One pl_one = new Panel_One();
/*  68 */       pl_one.setLabel(i + 1);
/*  69 */       pl_one.setName(md_qu.getName());
/*  70 */       pl_one.setColor(new Color(Integer.parseInt(frame.getSurvey().getMainColor())));
/*  71 */       pl_one.setBord(new Color(Integer.parseInt(frame.getSurvey().getMainColor())));
/*     */       
/*  73 */       Panel_Two pl_two = new Panel_Two();
/*  74 */       pl_two.setName(md_qu.getType());
/*  75 */       pl_two.setPoint(String.valueOf(md_qu.getPoint()));
/*  76 */       pl_two.setBord(new Color(Integer.parseInt(frame.getSurvey().getMainColor())));
/*     */       
/*  78 */       Panel_Three pl_three = new Panel_Three(md_qu.getType(), md_qu);
/*  79 */       pl_three.setBord(new Color(Integer.parseInt(frame.getSurvey().getMainColor())));
/*     */       
/*  81 */       pl_total.add(pl_one, "North");
/*  82 */       pl_total.add(pl_two, "Center");
/*  83 */       pl_total.add(pl_three, "South");
/*     */       
/*  85 */       this.gbc.insets = new Insets(20, 0, 0, 0);
/*     */       
/*  87 */       add(pl_total, this.gbc);
/*  88 */       this.gbc.gridy += 1;
/*     */       
/*  90 */       this.list_two.add(pl_two);
/*  91 */       this.list_three.add(pl_three);
/*     */     }
/*     */   }
/*     */   
/*     */   public Question_Module(List<Module_Question> lt_que, Card_Survey_Fr_Modify frame_Modify) {
/*  96 */     setLayout(this.gbl);
/*  97 */     setBackground(Color.WHITE);
/*     */     
/*  99 */     this.lt_que = lt_que;
/* 100 */     this.frame_Modify = frame_Modify;
/*     */     
/* 102 */     this.gbc.anchor = 10;
/* 103 */     this.gbc.fill = 1;
/*     */     
/* 105 */     this.gbc.gridx = 0;
/* 106 */     this.gbc.gridy = 0;
/* 107 */     this.gbc.gridwidth = 1;
/* 108 */     this.gbc.gridheight = 1;
/*     */     
/* 110 */     for (int i = 0; i < lt_que.size(); i++)
/*     */     {
/* 112 */       Module_Question md_qu = (Module_Question)lt_que.get(i);
/*     */       
/* 114 */       JPanel pl_total = new JPanel();
/* 115 */       pl_total.setLayout(new BorderLayout());
/*     */       
/* 117 */       Panel_One pl_one = new Panel_One();
/* 118 */       pl_one.setLabel(i + 1);
/* 119 */       pl_one.setName(md_qu.getName());
/* 120 */       pl_one.setColor(new Color(Integer.parseInt(frame_Modify.getSurvey().getMainColor())));
/* 121 */       pl_one.setBord(new Color(Integer.parseInt(frame_Modify.getSurvey().getMainColor())));
/*     */       
/* 123 */       Panel_Two pl_two = new Panel_Two();
/* 124 */       pl_two.setName(md_qu.getType());
/* 125 */       pl_two.setPoint(String.valueOf(md_qu.getPoint()));
/* 126 */       pl_two.setBord(new Color(Integer.parseInt(frame_Modify.getSurvey().getMainColor())));
/*     */       
/* 128 */       Panel_Three pl_three = new Panel_Three(md_qu.getType(), md_qu);
/* 129 */       pl_three.setBord(new Color(Integer.parseInt(frame_Modify.getSurvey().getMainColor())));
/*     */       
/* 131 */       pl_total.add(pl_one, "North");
/* 132 */       pl_total.add(pl_two, "Center");
/* 133 */       pl_total.add(pl_three, "South");
/*     */       
/* 135 */       this.gbc.insets = new Insets(20, 0, 0, 0);
/*     */       
/* 137 */       add(pl_total, this.gbc);
/* 138 */       this.gbc.gridy += 1;
/*     */       
/* 140 */       this.list_two.add(pl_two);
/* 141 */       this.list_three.add(pl_three);
/*     */     }
/*     */   }
/*     */   
/*     */   public void savePoint(int index) {
/* 146 */     if (this.frame == null) {
/* 147 */       Module_Section ms = (Module_Section)this.frame_Modify.getSurvey().getSection().get(index);
/*     */       
/* 149 */       for (int i = 0; i < ms.getQuestion().size(); i++) {
/* 150 */         ((Module_Question)ms.getQuestion().get(i)).setPoint(((Panel_Two)this.list_two.get(i)).getPoint());
/*     */         
/* 152 */         ((Panel_Three)this.list_three.get(i)).savePoint((Module_Question)ms.getQuestion().get(i));
/*     */       }
/*     */     } else {
/* 155 */       Module_Section ms = (Module_Section)this.frame.getSurvey().getSection().get(index);
/*     */       
/* 157 */       for (int i = 0; i < ms.getQuestion().size(); i++) {
/* 158 */         ((Module_Question)ms.getQuestion().get(i)).setPoint(((Panel_Two)this.list_two.get(i)).getPoint());
/*     */         
/* 160 */         ((Panel_Three)this.list_three.get(i)).savePoint((Module_Question)ms.getQuestion().get(i));
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Question_Module.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */