/*    */ package Model.Dialog.Survey_List.Question_Management;
/*    */ 
/*    */ import java.awt.Color;
/*    */ import java.awt.Dimension;
/*    */ import java.awt.Font;
/*    */ import java.awt.Graphics;
/*    */ import java.awt.GridBagConstraints;
/*    */ import java.awt.GridBagLayout;
/*    */ import java.awt.Insets;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import javax.swing.BorderFactory;
/*    */ import javax.swing.JPanel;
/*    */ 
/*    */ 
/*    */ public class TitlePanel
/*    */   extends JPanel
/*    */ {
/*    */   public HintTextField surveyTitle;
/*    */   public HintTextArea surveySub;
/* 21 */   public List<JPanel> panelList = new ArrayList();
/*    */   
/* 23 */   public GridBagLayout gbl = new GridBagLayout();
/* 24 */   public GridBagConstraints gbc = new GridBagConstraints();
/*    */   
/*    */   public TitlePanel()
/*    */   {
/* 28 */     setBackground(Color.white);
/*    */     
/* 30 */     this.surveyTitle = new HintTextField("제목 없음", Color.BLACK);
/* 31 */     this.surveyTitle.setPreferredSize(new Dimension(772, 60));
/* 32 */     this.surveyTitle.setOpaque(false);
/* 33 */     this.surveyTitle.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(224, 224, 224)));
/* 34 */     this.surveyTitle.setFont(new Font("나눔바른고딕", 0, 30));
/*    */     
/* 36 */     this.surveySub = new HintTextArea("설명(선택사항)", Color.GRAY);
/* 37 */     this.surveySub.setColumns(47);
/* 38 */     this.surveySub.setOpaque(false);
/* 39 */     this.surveySub.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(224, 224, 224)));
/* 40 */     this.surveySub.setFont(new Font("나눔바른고딕", 0, 25));
/* 41 */     this.surveySub.setLineWrap(true);
/*    */     
/* 43 */     setLayout(this.gbl);
/*    */     
/* 45 */     this.gbc.gridx = 0;
/* 46 */     this.gbc.gridy = 0;
/* 47 */     this.gbc.gridwidth = 1;
/* 48 */     this.gbc.gridheight = 1;
/* 49 */     this.gbc.weightx = 1.0D;
/* 50 */     this.gbc.weighty = 0.01D;
/* 51 */     this.gbc.anchor = 17;
/* 52 */     this.gbc.insets = new Insets(40, 30, 0, 0);
/* 53 */     add(this.surveyTitle, this.gbc);
/*    */     
/* 55 */     this.gbc.gridx = 0;
/* 56 */     this.gbc.gridy = 1;
/* 57 */     this.gbc.gridwidth = 1;
/* 58 */     this.gbc.gridheight = 1;
/* 59 */     this.gbc.weightx = 1.0D;
/* 60 */     this.gbc.weighty = 1.0D;
/* 61 */     this.gbc.anchor = 17;
/* 62 */     this.gbc.insets = new Insets(40, 30, 60, 0);
/* 63 */     add(this.surveySub, this.gbc);
/*    */   }
/*    */   
/*    */ 
/*    */   public void paintComponent(Graphics g)
/*    */   {
/* 69 */     super.paintComponent(g);
/*    */   }
/*    */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Question_Management\TitlePanel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */