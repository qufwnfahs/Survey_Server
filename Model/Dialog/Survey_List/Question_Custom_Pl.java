/*     */ package Model.Dialog.Survey_List;
/*     */ 
/*     */ import Model.Dialog.Survey_List.Question_Management.CheckBoxGridQuestionPanel;
/*     */ import Model.Dialog.Survey_List.Question_Management.CheckBoxQuestionPanel;
/*     */ import Model.Dialog.Survey_List.Question_Management.DropDownQuestionPanel;
/*     */ import Model.Dialog.Survey_List.Question_Management.LinearQuestionPanel;
/*     */ import Model.Dialog.Survey_List.Question_Management.MultipleChoiceQuestionPanel;
/*     */ import Model.Dialog.Survey_List.Question_Management.OpenEndedQuestionPanel;
/*     */ import Model.Dialog.Survey_List.Question_Management.Option;
/*     */ import Model.Dialog.Survey_List.Question_Management.QuestionComboBox;
/*     */ import Model.Dialog.Survey_List.Question_Management.RadioGridQuestionPanel;
/*     */ import java.awt.CardLayout;
/*     */ import java.awt.Component;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JTextField;
/*     */ 
/*     */ public class Question_Custom_Pl
/*     */   extends JPanel
/*     */ {
/*  22 */   private CardLayout card = new CardLayout();
/*     */   
/*     */ 
/*  25 */   private QuestionComboBox qcb = new QuestionComboBox();
/*     */   
/*     */   private OpenEndedQuestionPanel openEndedQuestionPanel;
/*     */   
/*     */   private MultipleChoiceQuestionPanel multipleChoiceQuestionPanel;
/*     */   
/*     */   private CheckBoxQuestionPanel checkBoxQuestionPanel;
/*     */   private DropDownQuestionPanel dropDownQuestionPanel;
/*     */   private LinearQuestionPanel linearQuestionPanel;
/*     */   private RadioGridQuestionPanel radioGridQuestionPanel;
/*     */   private CheckBoxGridQuestionPanel checkBoxGridQuestionPanel;
/*  36 */   private String[] panelName = { "OpenEnded", "Multiple", "CheckBox", "DropDown", "Linear", "RadioGrid", "CheckBoxGrid" };
/*     */   private Question_Add_Pl question_Add;
/*  38 */   private List<JPanel> panelList = new ArrayList();
/*  39 */   private int curr = 0;
/*     */   
/*     */   public Question_Custom_Pl(Question_Add_Pl question_Add)
/*     */   {
/*  43 */     this.question_Add = question_Add;
/*     */     
/*     */ 
/*  46 */     setLayout(this.card);
/*     */     
/*     */ 
/*  49 */     this.openEndedQuestionPanel = new OpenEndedQuestionPanel(this, this.qcb);
/*  50 */     this.multipleChoiceQuestionPanel = new MultipleChoiceQuestionPanel(this, this.qcb);
/*  51 */     this.checkBoxQuestionPanel = new CheckBoxQuestionPanel(this, this.qcb);
/*  52 */     this.dropDownQuestionPanel = new DropDownQuestionPanel(this, this.qcb);
/*  53 */     this.linearQuestionPanel = new LinearQuestionPanel(this, this.qcb);
/*  54 */     this.radioGridQuestionPanel = new RadioGridQuestionPanel(this, this.qcb);
/*  55 */     this.checkBoxGridQuestionPanel = new CheckBoxGridQuestionPanel(this, this.qcb);
/*     */     
/*  57 */     add("OpenEnded", this.openEndedQuestionPanel);
/*     */     
/*  59 */     this.panelList.add(this.openEndedQuestionPanel);
/*  60 */     this.panelList.add(this.multipleChoiceQuestionPanel);
/*  61 */     this.panelList.add(this.checkBoxQuestionPanel);
/*  62 */     this.panelList.add(this.dropDownQuestionPanel);
/*  63 */     this.panelList.add(this.linearQuestionPanel);
/*  64 */     this.panelList.add(this.radioGridQuestionPanel);
/*  65 */     this.panelList.add(this.checkBoxGridQuestionPanel);
/*     */   }
/*     */   
/*     */   public void changePanel(int index)
/*     */   {
/*  70 */     if (index >= 0)
/*     */     {
/*  72 */       if (this.curr != index)
/*     */       {
/*  74 */         remove((Component)this.panelList.get(this.curr));
/*  75 */         add((Component)this.panelList.get(index));
/*     */         
/*  77 */         this.curr = index;
/*     */         
/*  79 */         revalidate();
/*  80 */         repaint();
/*  81 */         resize(getPreferredSize());
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public List getPanelList()
/*     */   {
/*  88 */     return this.panelList;
/*     */   }
/*     */   
/*     */   public int getCurrPanel()
/*     */   {
/*  93 */     return this.curr;
/*     */   }
/*     */   
/*     */   public void setCurr(String type)
/*     */   {
/*  98 */     for (int i = 0; i < this.panelName.length; i++)
/*     */     {
/* 100 */       if (type.equals(this.panelName[i]))
/*     */       {
/* 102 */         changePanel(i);
/* 103 */         break;
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public String getType()
/*     */   {
/* 110 */     return this.panelName[this.curr];
/*     */   }
/*     */   
/*     */   public String getName()
/*     */   {
/* 115 */     switch (this.curr) {
/*     */     case 0: 
/* 117 */       return this.openEndedQuestionPanel.title.getText();
/* 118 */     case 1:  return this.multipleChoiceQuestionPanel.title.getText();
/* 119 */     case 2:  return this.checkBoxQuestionPanel.title.getText();
/* 120 */     case 3:  return this.dropDownQuestionPanel.title.getText();
/* 121 */     case 4:  return this.linearQuestionPanel.title.getText();
/* 122 */     case 5:  return this.radioGridQuestionPanel.title.getText();
/* 123 */     case 6:  return this.checkBoxGridQuestionPanel.title.getText();
/*     */     }
/*     */     
/* 126 */     return null;
/*     */   }
/*     */   
/*     */   public void setName(String name)
/*     */   {
/* 131 */     switch (this.curr) {
/*     */     case 0: 
/* 133 */       this.openEndedQuestionPanel.title.setText(name);
/* 134 */       break;
/* 135 */     case 1:  this.multipleChoiceQuestionPanel.title.setText(name);
/* 136 */       break;
/* 137 */     case 2:  this.checkBoxQuestionPanel.title.setText(name);
/* 138 */       break;
/* 139 */     case 3:  this.dropDownQuestionPanel.title.setText(name);
/* 140 */       break;
/* 141 */     case 4:  this.linearQuestionPanel.title.setText(name);
/* 142 */       break;
/* 143 */     case 5:  this.radioGridQuestionPanel.title.setText(name);
/* 144 */       break;
/* 145 */     case 6:  this.checkBoxGridQuestionPanel.title.setText(name);
/*     */     }
/*     */     
/*     */   }
/*     */   
/*     */   public List<Option> getOptionList()
/*     */   {
/* 152 */     switch (this.curr) {
/*     */     case 0: 
/* 154 */       return this.openEndedQuestionPanel.getOption();
/* 155 */     case 1:  return this.multipleChoiceQuestionPanel.getOption();
/* 156 */     case 2:  return this.checkBoxQuestionPanel.getOption();
/* 157 */     case 3:  return this.dropDownQuestionPanel.getOption();
/* 158 */     case 4:  return this.linearQuestionPanel.getOption();
/* 159 */     case 5:  return this.radioGridQuestionPanel.getOption();
/* 160 */     case 6:  return this.checkBoxGridQuestionPanel.getOption();
/*     */     }
/*     */     
/* 163 */     return null;
/*     */   }
/*     */   
/*     */   public List<Option_M> getOptionList_M()
/*     */   {
/* 168 */     switch (this.curr) {
/*     */     case 0: 
/* 170 */       return this.openEndedQuestionPanel.getOption_M();
/* 171 */     case 1:  return this.multipleChoiceQuestionPanel.getOption_M();
/* 172 */     case 2:  return this.checkBoxQuestionPanel.getOption_M();
/* 173 */     case 3:  return this.dropDownQuestionPanel.getOption_M();
/* 174 */     case 4:  return this.linearQuestionPanel.getOption_M();
/* 175 */     case 5:  return this.radioGridQuestionPanel.getOption_M();
/* 176 */     case 6:  return this.checkBoxGridQuestionPanel.getOption_M();
/*     */     }
/*     */     
/* 179 */     return null;
/*     */   }
/*     */   
/*     */   public List<Module_Option> getOption()
/*     */   {
/* 184 */     switch (this.curr) {
/*     */     case 0: 
/* 186 */       return this.openEndedQuestionPanel.getOptionBy();
/* 187 */     case 1:  return this.multipleChoiceQuestionPanel.getOptionBy();
/* 188 */     case 2:  return this.checkBoxQuestionPanel.getOptionBy();
/* 189 */     case 3:  return this.dropDownQuestionPanel.getOptionBy();
/* 190 */     case 4:  return this.linearQuestionPanel.getOptionBy();
/* 191 */     case 5:  return this.radioGridQuestionPanel.getOptionBy();
/* 192 */     case 6:  return this.checkBoxGridQuestionPanel.getOptionBy();
/*     */     }
/*     */     
/* 195 */     return null;
/*     */   }
/*     */   
/*     */   public void setOption(List<Module_Option> option)
/*     */   {
/* 200 */     switch (this.curr) {
/*     */     case 0: 
/*     */       break;
/* 203 */     case 1:  this.multipleChoiceQuestionPanel.setOption(option);
/* 204 */       break;
/* 205 */     case 2:  this.checkBoxQuestionPanel.setOption(option);
/* 206 */       break;
/* 207 */     case 3:  this.dropDownQuestionPanel.setOption(option);
/* 208 */       break;
/* 209 */     case 4:  this.linearQuestionPanel.setOption(option);
/* 210 */       break;
/* 211 */     case 5:  this.radioGridQuestionPanel.setOption(option);
/* 212 */       break;
/* 213 */     case 6:  this.checkBoxGridQuestionPanel.setOption(option);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Question_Custom_Pl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */