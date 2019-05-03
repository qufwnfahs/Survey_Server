/*      */ package Model.Dialog;
/*      */ 
/*      */ import Enum.Enum_Font_Ci;
/*      */ import Enum.Enum_Image_Ci;
/*      */ import Model.Dialog.Survey_List.Module_Client_Question;
/*      */ import Model.Dialog.Survey_List.Module_Client_Section;
/*      */ import Model.Dialog.Survey_List.Module_Option;
/*      */ import Model.Dialog.Survey_List.Module_Question;
/*      */ import Worker.ImageController;
/*      */ import java.awt.Color;
/*      */ import java.awt.Cursor;
/*      */ import java.awt.Dimension;
/*      */ import java.awt.GridBagConstraints;
/*      */ import java.awt.GridBagLayout;
/*      */ import java.awt.Insets;
/*      */ import java.awt.event.KeyEvent;
/*      */ import java.awt.event.KeyListener;
/*      */ import java.sql.SQLException;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import java.util.Map;
/*      */ import java.util.Set;
/*      */ import javax.swing.BorderFactory;
/*      */ import javax.swing.ImageIcon;
/*      */ import javax.swing.JButton;
/*      */ import javax.swing.JCheckBox;
/*      */ import javax.swing.JLabel;
/*      */ import javax.swing.JPanel;
/*      */ import javax.swing.JRadioButton;
/*      */ import javax.swing.JTextField;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ class Panel_Individual_Client_Question
/*      */   extends JPanel
/*      */ {
/* 1401 */   private GridBagLayout gbl = new GridBagLayout();
/* 1402 */   private GridBagConstraints gbc = new GridBagConstraints();
/*      */   
/*      */ 
/* 1405 */   private JLabel ll_tOf = new JLabel();
/* 1406 */   private JLabel ll_quePoint = new JLabel();
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public Panel_Individual_Client_Question(final Panel_Individual_Client pic, final Module_Client_Section m_c_s, Module_Question m_q, final Module_Client_Question m_c_q, String POINT_BL)
/*      */   {
/* 1415 */     setLayout(this.gbl);
/* 1416 */     setBackground(Color.WHITE);
/*      */     String str1;
/* 1418 */     switch ((str1 = m_q.getType()).hashCode()) {case -2018804923:  if (str1.equals("Linear")) {} break; case -768855440:  if (str1.equals("OpenEnded")) break; break; case -368370607:  if (str1.equals("DropDown")) {} break; case 175599017:  if (str1.equals("CheckBoxGrid")) {} break; case 718473776:  if (str1.equals("Multiple")) {} break; case 1033354689:  if (str1.equals("RadioGrid")) {} break; case 1601505219:  if (!str1.equals("CheckBox"))
/*      */       {
/* 1420 */         return;setPreferredSize(new Dimension(0, 200));
/* 1421 */         if (POINT_BL.equals("1"))
/*      */         {
/* 1423 */           JLabel ll_name = new JLabel();
/* 1424 */           JLabel ll_OpenEnded = new JLabel();
/*      */           
/* 1426 */           ll_name.setOpaque(false);
/* 1427 */           ll_name.setFont(Enum_Font_Ci.나눔바른고딕25.getFont());
/* 1428 */           ll_name.setText("주관식 질문 : " + m_q.getName());
/* 1429 */           ll_name.setIconTextGap(18);
/* 1430 */           ll_name.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.LABEL_IMAGE_BLACK.getImageIcon(), 28, 28)));
/*      */           
/* 1432 */           ll_OpenEnded.setOpaque(false);
/* 1433 */           ll_OpenEnded.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(224, 224, 224)), BorderFactory.createEmptyBorder(0, 0, 10, 0)));
/* 1434 */           ll_OpenEnded.setFont(Enum_Font_Ci.나눔바른고딕21.getFont());
/* 1435 */           ll_OpenEnded.setText(m_c_q.getAnswer().values().toString());
/*      */           
/* 1437 */           this.gbc.anchor = 17;
/* 1438 */           this.gbc.fill = 2;
/*      */           
/* 1440 */           this.gbc.gridx = 0;
/* 1441 */           this.gbc.gridy = 0;
/* 1442 */           this.gbc.gridwidth = 1;
/* 1443 */           this.gbc.gridheight = 1;
/* 1444 */           this.gbc.weightx = 1.0D;
/* 1445 */           this.gbc.weighty = 0.5D;
/* 1446 */           this.gbc.insets = new Insets(0, 30, 0, 30);
/* 1447 */           add(ll_name, this.gbc);
/*      */           
/* 1449 */           this.gbc.gridx = 0;
/* 1450 */           this.gbc.gridy = 1;
/* 1451 */           this.gbc.weighty = 0.5D;
/* 1452 */           this.gbc.insets = new Insets(30, 30, 30, 30);
/* 1453 */           add(ll_OpenEnded, this.gbc);
/*      */         }
/*      */         else
/*      */         {
/* 1457 */           JLabel ll_name = new JLabel();
/* 1458 */           JLabel ll_OpenEnded = new JLabel();
/* 1459 */           JLabel ll_point = new JLabel();
/* 1460 */           final JTextField tf_point = new JTextField();
/*      */           
/* 1462 */           ll_name.setOpaque(false);
/* 1463 */           ll_name.setFont(Enum_Font_Ci.나눔바른고딕25.getFont());
/* 1464 */           ll_name.setText("주관식 질문 : " + m_q.getName());
/* 1465 */           ll_name.setIconTextGap(18);
/*      */           
/* 1467 */           ll_point.setText(" / " + String.valueOf(m_q.getPoint()));
/* 1468 */           ll_point.setFont(Enum_Font_Ci.나눔바른고딕25.getFont());
/*      */           
/* 1470 */           tf_point.setFont(Enum_Font_Ci.나눔바른고딕25.getFont());
/* 1471 */           tf_point.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
/* 1472 */           tf_point.setHorizontalAlignment(0);
/* 1473 */           tf_point.setOpaque(false);
/* 1474 */           tf_point.setPreferredSize(new Dimension(80, 50));
/*      */           
/* 1476 */           if (!m_c_q.getChecked())
/*      */           {
/* 1478 */             ll_name.setForeground(Color.RED);
/* 1479 */             ll_name.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.LABEL_IMAGE_BLACK.getImageIcon(), 28, 28)));
/*      */             
/* 1481 */             tf_point.addKeyListener(new KeyListener()
/*      */             {
/*      */               public void keyPressed(KeyEvent arg0) {}
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               public void keyReleased(KeyEvent arg0)
/*      */               {
/* 1491 */                 if (arg0.getKeyCode() == 10)
/*      */                 {
/* 1493 */                   m_c_q.setChecked(true);
/* 1494 */                   m_c_q.setPoint(Integer.valueOf(tf_point.getText()).intValue());
/*      */                   
/* 1496 */                   m_c_s.setPoint(m_c_s.getPoint() + Integer.valueOf(tf_point.getText()).intValue());
/*      */                   
/*      */                   try
/*      */                   {
/* 1500 */                     pic.saveSurvey();
/*      */                   }
/*      */                   catch (SQLException e) {
/* 1503 */                     e.printStackTrace();
/*      */                   }
/*      */                 }
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */               public void keyTyped(KeyEvent arg0) {}
/*      */             });
/*      */           }
/*      */           else
/*      */           {
/* 1516 */             ll_name.setForeground(Color.GREEN);
/* 1517 */             ll_name.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.LABEL_IMAGE_BLACK.getImageIcon(), 28, 28)));
/*      */             
/* 1519 */             tf_point.setText(String.valueOf(m_c_q.getPoint()));
/* 1520 */             tf_point.setEditable(false);
/*      */           }
/*      */           
/*      */ 
/* 1524 */           ll_OpenEnded.setOpaque(false);
/* 1525 */           ll_OpenEnded.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(224, 224, 224)), BorderFactory.createEmptyBorder(0, 0, 10, 0)));
/* 1526 */           ll_OpenEnded.setFont(Enum_Font_Ci.나눔바른고딕21.getFont());
/* 1527 */           ll_OpenEnded.setText(m_c_q.getAnswer().values().toString());
/*      */           
/* 1529 */           this.gbc.anchor = 17;
/* 1530 */           this.gbc.fill = 2;
/*      */           
/* 1532 */           this.gbc.gridx = 0;
/* 1533 */           this.gbc.gridy = 0;
/* 1534 */           this.gbc.gridwidth = 1;
/* 1535 */           this.gbc.gridheight = 1;
/* 1536 */           this.gbc.weightx = 1.0D;
/* 1537 */           this.gbc.weighty = 0.5D;
/* 1538 */           this.gbc.insets = new Insets(0, 30, 0, 30);
/* 1539 */           add(ll_name, this.gbc);
/*      */           
/* 1541 */           this.gbc.anchor = 13;
/* 1542 */           this.gbc.fill = 0;
/*      */           
/* 1544 */           this.gbc.gridx = 1;
/* 1545 */           this.gbc.gridy = 0;
/* 1546 */           this.gbc.insets = new Insets(0, 730, 0, 15);
/* 1547 */           add(tf_point, this.gbc);
/*      */           
/* 1549 */           this.gbc.gridx = 2;
/* 1550 */           this.gbc.gridy = 0;
/* 1551 */           this.gbc.insets = new Insets(0, 0, 0, 30);
/* 1552 */           add(ll_point, this.gbc);
/*      */           
/* 1554 */           this.gbc.anchor = 17;
/* 1555 */           this.gbc.fill = 2;
/*      */           
/* 1557 */           this.gbc.gridx = 0;
/* 1558 */           this.gbc.gridy = 1;
/* 1559 */           this.gbc.gridwidth = 3;
/* 1560 */           this.gbc.weighty = 0.5D;
/* 1561 */           this.gbc.insets = new Insets(30, 30, 30, 30);
/* 1562 */           add(ll_OpenEnded, this.gbc);
/*      */           
/* 1564 */           return;
/* 1565 */           if (POINT_BL.equals("1"))
/*      */           {
/* 1567 */             JLabel ll_name = new JLabel();
/*      */             
/* 1569 */             ll_name.setOpaque(false);
/* 1570 */             ll_name.setFont(Enum_Font_Ci.나눔바른고딕25.getFont());
/* 1571 */             ll_name.setText("객관식 질문 : " + m_q.getName());
/* 1572 */             ll_name.setIconTextGap(18);
/* 1573 */             ll_name.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.LABEL_IMAGE_BLACK.getImageIcon(), 28, 28)));
/*      */             
/* 1575 */             this.gbc.anchor = 17;
/* 1576 */             this.gbc.fill = 2;
/*      */             
/* 1578 */             this.gbc.gridx = 0;
/* 1579 */             this.gbc.gridy = 0;
/* 1580 */             this.gbc.gridwidth = 1;
/* 1581 */             this.gbc.gridheight = 1;
/* 1582 */             this.gbc.weightx = 1.0D;
/* 1583 */             this.gbc.weighty = 0.5D;
/* 1584 */             this.gbc.insets = new Insets(0, 30, 15, 30);
/* 1585 */             add(ll_name, this.gbc);
/*      */             
/* 1587 */             List<JRadioButton> lt_bt = new ArrayList();
/*      */             
/* 1589 */             for (int i = 0; i < m_q.getOption().size(); i++)
/*      */             {
/* 1591 */               JRadioButton bt_radio = new JRadioButton();
/* 1592 */               bt_radio.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.BUTTON_RADIO_UNSELECTED.getImageIcon(), 28, 28)));
/* 1593 */               bt_radio.setSelectedIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.BUTTON_RADIO_SELECTED.getImageIcon(), 28, 28)));
/* 1594 */               bt_radio.setCursor(new Cursor(12));
/* 1595 */               bt_radio.setBackground(Color.WHITE);
/* 1596 */               bt_radio.setText(((Module_Option)m_q.getOption().get(i)).getName());
/* 1597 */               bt_radio.setFont(Enum_Font_Ci.나눔바른고딕21.getFont());
/* 1598 */               bt_radio.setIconTextGap(25);
/* 1599 */               bt_radio.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
/* 1600 */               bt_radio.setEnabled(false);
/*      */               
/* 1602 */               lt_bt.add(bt_radio);
/*      */               
/* 1604 */               this.gbc.gridx = 0;
/* 1605 */               this.gbc.gridy += 1;
/* 1606 */               this.gbc.weighty = 0.5D;
/* 1607 */               this.gbc.insets = new Insets(15, 30, 15, 30);
/* 1608 */               add(bt_radio, this.gbc);
/*      */             }
/*      */             
/* 1611 */             Iterator iter = m_c_q.getAnswer().keySet().iterator();
/*      */             
/* 1613 */             while (iter.hasNext())
/*      */             {
/* 1615 */               String key = (String)iter.next();
/* 1616 */               ((JRadioButton)lt_bt.get(Integer.valueOf(key).intValue())).setSelected(true);
/*      */             }
/*      */           }
/*      */           else
/*      */           {
/* 1621 */             JLabel ll_name = new JLabel();
/* 1622 */             JLabel ll_point = new JLabel();
/*      */             
/* 1624 */             ll_name.setOpaque(false);
/* 1625 */             ll_name.setFont(Enum_Font_Ci.나눔바른고딕25.getFont());
/* 1626 */             ll_name.setText("객관식 질문 : " + m_q.getName());
/* 1627 */             ll_name.setIconTextGap(18);
/* 1628 */             ll_name.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.LABEL_IMAGE_BLACK.getImageIcon(), 28, 28)));
/*      */             
/* 1630 */             ll_point.setText(m_c_q.getPoint() + " / " + String.valueOf(m_q.getPoint()));
/* 1631 */             ll_point.setFont(Enum_Font_Ci.나눔바른고딕25.getFont());
/*      */             
/* 1633 */             this.gbc.anchor = 17;
/* 1634 */             this.gbc.fill = 2;
/*      */             
/* 1636 */             this.gbc.gridx = 0;
/* 1637 */             this.gbc.gridy = 0;
/* 1638 */             this.gbc.gridwidth = 1;
/* 1639 */             this.gbc.gridheight = 1;
/* 1640 */             this.gbc.weightx = 1.0D;
/* 1641 */             this.gbc.weighty = 0.5D;
/* 1642 */             this.gbc.insets = new Insets(0, 30, 15, 30);
/* 1643 */             add(ll_name, this.gbc);
/*      */             
/* 1645 */             this.gbc.anchor = 13;
/* 1646 */             this.gbc.fill = 0;
/*      */             
/* 1648 */             this.gbc.gridx = 1;
/* 1649 */             this.gbc.gridy = 0;
/* 1650 */             this.gbc.insets = new Insets(0, 0, 0, 30);
/* 1651 */             add(ll_point, this.gbc);
/*      */             
/* 1653 */             this.gbc.anchor = 17;
/* 1654 */             this.gbc.fill = 2;
/*      */             
/* 1656 */             List<JRadioButton> lt_bt = new ArrayList();
/*      */             
/* 1658 */             for (int i = 0; i < m_q.getOption().size(); i++)
/*      */             {
/* 1660 */               JRadioButton bt_radio = new JRadioButton();
/* 1661 */               bt_radio.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.BUTTON_RADIO_UNSELECTED.getImageIcon(), 28, 28)));
/* 1662 */               bt_radio.setSelectedIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.BUTTON_RADIO_SELECTED.getImageIcon(), 28, 28)));
/* 1663 */               bt_radio.setCursor(new Cursor(12));
/* 1664 */               bt_radio.setBackground(Color.WHITE);
/* 1665 */               bt_radio.setText(((Module_Option)m_q.getOption().get(i)).getName());
/* 1666 */               bt_radio.setFont(Enum_Font_Ci.나눔바른고딕21.getFont());
/* 1667 */               bt_radio.setIconTextGap(25);
/* 1668 */               bt_radio.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
/* 1669 */               bt_radio.setEnabled(false);
/*      */               
/* 1671 */               lt_bt.add(bt_radio);
/*      */               
/* 1673 */               this.gbc.gridx = 0;
/* 1674 */               this.gbc.gridy += 1;
/* 1675 */               this.gbc.weighty = 0.5D;
/* 1676 */               this.gbc.gridwidth = 2;
/* 1677 */               this.gbc.insets = new Insets(15, 30, 15, 30);
/* 1678 */               add(bt_radio, this.gbc);
/*      */             }
/*      */             
/* 1681 */             Iterator iter = m_c_q.getAnswer().keySet().iterator();
/*      */             
/* 1683 */             while (iter.hasNext())
/*      */             {
/* 1685 */               String key = (String)iter.next();
/* 1686 */               ((JRadioButton)lt_bt.get(Integer.valueOf(key).intValue())).setSelected(true);
/*      */             }
/*      */           }
/*      */         }
/* 1690 */       } else if (POINT_BL.equals("1"))
/*      */       {
/* 1692 */         JLabel ll_name = new JLabel();
/*      */         
/* 1694 */         ll_name.setOpaque(false);
/* 1695 */         ll_name.setFont(Enum_Font_Ci.나눔바른고딕25.getFont());
/* 1696 */         ll_name.setText("체크박스 : " + m_q.getName());
/* 1697 */         ll_name.setIconTextGap(18);
/* 1698 */         ll_name.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.LABEL_IMAGE_BLACK.getImageIcon(), 28, 28)));
/*      */         
/* 1700 */         this.gbc.anchor = 17;
/* 1701 */         this.gbc.fill = 2;
/*      */         
/* 1703 */         this.gbc.gridx = 0;
/* 1704 */         this.gbc.gridy = 0;
/* 1705 */         this.gbc.gridwidth = 1;
/* 1706 */         this.gbc.gridheight = 1;
/* 1707 */         this.gbc.weightx = 1.0D;
/* 1708 */         this.gbc.weighty = 0.5D;
/* 1709 */         this.gbc.insets = new Insets(15, 30, 15, 30);
/* 1710 */         add(ll_name, this.gbc);
/*      */         
/* 1712 */         List<JCheckBox> lt_bt = new ArrayList();
/*      */         
/* 1714 */         for (int i = 0; i < m_q.getOption().size(); i++)
/*      */         {
/* 1716 */           JCheckBox bt_cb = new JCheckBox();
/* 1717 */           bt_cb.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.BUTTON_CHECKBOX_UNSELECTED.getImageIcon(), 28, 28)));
/* 1718 */           bt_cb.setSelectedIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.BUTTON_CHECKBOX_SELECTED.getImageIcon(), 28, 28)));
/* 1719 */           bt_cb.setCursor(new Cursor(12));
/* 1720 */           bt_cb.setBackground(Color.WHITE);
/* 1721 */           bt_cb.setText(((Module_Option)m_q.getOption().get(i)).getName());
/* 1722 */           bt_cb.setFont(Enum_Font_Ci.나눔바른고딕21.getFont());
/* 1723 */           bt_cb.setIconTextGap(25);
/* 1724 */           bt_cb.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
/* 1725 */           bt_cb.setEnabled(false);
/*      */           
/* 1727 */           lt_bt.add(bt_cb);
/*      */           
/* 1729 */           this.gbc.gridx = 0;
/* 1730 */           this.gbc.gridy += 1;
/* 1731 */           this.gbc.weighty = 0.5D;
/* 1732 */           this.gbc.insets = new Insets(15, 30, 15, 30);
/* 1733 */           add(bt_cb, this.gbc);
/*      */         }
/*      */         
/* 1736 */         Iterator iter = m_c_q.getAnswer().keySet().iterator();
/*      */         
/* 1738 */         while (iter.hasNext())
/*      */         {
/* 1740 */           String key = (String)iter.next();
/* 1741 */           ((JCheckBox)lt_bt.get(Integer.valueOf(key).intValue())).setSelected(true);
/*      */         }
/*      */       }
/*      */       else
/*      */       {
/* 1746 */         JLabel ll_name = new JLabel();
/* 1747 */         JLabel ll_point = new JLabel();
/*      */         
/* 1749 */         ll_name.setOpaque(false);
/* 1750 */         ll_name.setFont(Enum_Font_Ci.나눔바른고딕25.getFont());
/* 1751 */         ll_name.setText("체크박스 : " + m_q.getName());
/* 1752 */         ll_name.setIconTextGap(18);
/* 1753 */         ll_name.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.LABEL_IMAGE_BLACK.getImageIcon(), 28, 28)));
/*      */         
/* 1755 */         ll_point.setText(m_c_q.getPoint() + " / " + String.valueOf(m_q.getPoint()));
/* 1756 */         ll_point.setFont(Enum_Font_Ci.나눔바른고딕25.getFont());
/*      */         
/* 1758 */         this.gbc.anchor = 17;
/* 1759 */         this.gbc.fill = 2;
/*      */         
/* 1761 */         this.gbc.gridx = 0;
/* 1762 */         this.gbc.gridy = 0;
/* 1763 */         this.gbc.gridwidth = 1;
/* 1764 */         this.gbc.gridheight = 1;
/* 1765 */         this.gbc.weightx = 1.0D;
/* 1766 */         this.gbc.weighty = 0.5D;
/* 1767 */         this.gbc.insets = new Insets(15, 30, 15, 30);
/* 1768 */         add(ll_name, this.gbc);
/*      */         
/* 1770 */         this.gbc.anchor = 13;
/* 1771 */         this.gbc.fill = 0;
/*      */         
/* 1773 */         this.gbc.gridx = 1;
/* 1774 */         this.gbc.gridy = 0;
/* 1775 */         this.gbc.insets = new Insets(0, 0, 0, 30);
/* 1776 */         add(ll_point, this.gbc);
/*      */         
/* 1778 */         this.gbc.anchor = 17;
/* 1779 */         this.gbc.fill = 2;
/*      */         
/* 1781 */         List<JCheckBox> lt_bt = new ArrayList();
/*      */         
/* 1783 */         for (int i = 0; i < m_q.getOption().size(); i++)
/*      */         {
/* 1785 */           JCheckBox bt_cb = new JCheckBox();
/* 1786 */           bt_cb.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.BUTTON_CHECKBOX_UNSELECTED.getImageIcon(), 28, 28)));
/* 1787 */           bt_cb.setSelectedIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.BUTTON_CHECKBOX_SELECTED.getImageIcon(), 28, 28)));
/* 1788 */           bt_cb.setCursor(new Cursor(12));
/* 1789 */           bt_cb.setBackground(Color.WHITE);
/* 1790 */           bt_cb.setText(((Module_Option)m_q.getOption().get(i)).getName());
/* 1791 */           bt_cb.setFont(Enum_Font_Ci.나눔바른고딕21.getFont());
/* 1792 */           bt_cb.setIconTextGap(25);
/* 1793 */           bt_cb.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
/* 1794 */           bt_cb.setEnabled(false);
/*      */           
/* 1796 */           lt_bt.add(bt_cb);
/*      */           
/* 1798 */           this.gbc.gridx = 0;
/* 1799 */           this.gbc.gridy += 1;
/* 1800 */           this.gbc.weighty = 0.5D;
/* 1801 */           this.gbc.insets = new Insets(15, 30, 15, 30);
/* 1802 */           add(bt_cb, this.gbc);
/*      */         }
/*      */         
/* 1805 */         Iterator iter = m_c_q.getAnswer().keySet().iterator();
/*      */         
/* 1807 */         while (iter.hasNext())
/*      */         {
/* 1809 */           String key = (String)iter.next();
/* 1810 */           ((JCheckBox)lt_bt.get(Integer.valueOf(key).intValue())).setSelected(true);
/*      */         }
/*      */         
/* 1813 */         return;
/* 1814 */         if (POINT_BL.equals("1"))
/*      */         {
/* 1816 */           JLabel ll_name = new JLabel();
/*      */           
/* 1818 */           ll_name.setOpaque(false);
/* 1819 */           ll_name.setFont(Enum_Font_Ci.나눔바른고딕25.getFont());
/* 1820 */           ll_name.setText("드롭다운 : " + m_q.getName());
/* 1821 */           ll_name.setIconTextGap(18);
/* 1822 */           ll_name.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.LABEL_IMAGE_BLACK.getImageIcon(), 28, 28)));
/*      */           
/* 1824 */           this.gbc.anchor = 17;
/* 1825 */           this.gbc.fill = 2;
/*      */           
/* 1827 */           this.gbc.gridx = 0;
/* 1828 */           this.gbc.gridy = 0;
/* 1829 */           this.gbc.gridwidth = 1;
/* 1830 */           this.gbc.gridheight = 1;
/* 1831 */           this.gbc.weightx = 1.0D;
/* 1832 */           this.gbc.weighty = 0.5D;
/* 1833 */           this.gbc.insets = new Insets(15, 30, 15, 30);
/* 1834 */           add(ll_name, this.gbc);
/*      */           
/* 1836 */           List<JCheckBox> lt_bt = new ArrayList();
/*      */           
/* 1838 */           for (int i = 0; i < m_q.getOption().size(); i++)
/*      */           {
/* 1840 */             JCheckBox bt_cb = new JCheckBox();
/* 1841 */             bt_cb.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.BUTTON_RADIO_UNSELECTED.getImageIcon(), 28, 28)));
/* 1842 */             bt_cb.setSelectedIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.BUTTON_DROPDOWN.getImageIcon(), 28, 28)));
/* 1843 */             bt_cb.setCursor(new Cursor(12));
/* 1844 */             bt_cb.setBackground(Color.WHITE);
/* 1845 */             bt_cb.setText(((Module_Option)m_q.getOption().get(i)).getName());
/* 1846 */             bt_cb.setFont(Enum_Font_Ci.나눔바른고딕21.getFont());
/* 1847 */             bt_cb.setIconTextGap(25);
/* 1848 */             bt_cb.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
/* 1849 */             bt_cb.setEnabled(false);
/*      */             
/* 1851 */             lt_bt.add(bt_cb);
/*      */             
/* 1853 */             this.gbc.gridx = 0;
/* 1854 */             this.gbc.gridy += 1;
/* 1855 */             this.gbc.weighty = 0.5D;
/* 1856 */             this.gbc.insets = new Insets(15, 30, 15, 30);
/* 1857 */             add(bt_cb, this.gbc);
/*      */           }
/*      */           
/* 1860 */           Iterator iter = m_c_q.getAnswer().keySet().iterator();
/*      */           
/* 1862 */           while (iter.hasNext())
/*      */           {
/* 1864 */             String key = (String)iter.next();
/* 1865 */             ((JCheckBox)lt_bt.get(Integer.valueOf(key).intValue())).setSelected(true);
/*      */           }
/*      */         }
/*      */         else
/*      */         {
/* 1870 */           JLabel ll_name = new JLabel();
/* 1871 */           JLabel ll_point = new JLabel();
/*      */           
/* 1873 */           ll_name.setOpaque(false);
/* 1874 */           ll_name.setFont(Enum_Font_Ci.나눔바른고딕25.getFont());
/* 1875 */           ll_name.setText("드롭다운 : " + m_q.getName());
/* 1876 */           ll_name.setIconTextGap(18);
/* 1877 */           ll_name.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.LABEL_IMAGE_BLACK.getImageIcon(), 28, 28)));
/*      */           
/* 1879 */           ll_point.setText(m_c_q.getPoint() + " / " + String.valueOf(m_q.getPoint()));
/* 1880 */           ll_point.setFont(Enum_Font_Ci.나눔바른고딕25.getFont());
/*      */           
/* 1882 */           this.gbc.anchor = 17;
/* 1883 */           this.gbc.fill = 2;
/*      */           
/* 1885 */           this.gbc.gridx = 0;
/* 1886 */           this.gbc.gridy = 0;
/* 1887 */           this.gbc.gridwidth = 1;
/* 1888 */           this.gbc.gridheight = 1;
/* 1889 */           this.gbc.weightx = 1.0D;
/* 1890 */           this.gbc.weighty = 0.5D;
/* 1891 */           this.gbc.insets = new Insets(15, 30, 15, 30);
/* 1892 */           add(ll_name, this.gbc);
/*      */           
/* 1894 */           this.gbc.anchor = 13;
/* 1895 */           this.gbc.fill = 0;
/*      */           
/* 1897 */           this.gbc.gridx = 1;
/* 1898 */           this.gbc.gridy = 0;
/* 1899 */           this.gbc.insets = new Insets(0, 0, 0, 30);
/* 1900 */           add(ll_point, this.gbc);
/*      */           
/* 1902 */           this.gbc.anchor = 17;
/* 1903 */           this.gbc.fill = 2;
/*      */           
/* 1905 */           List<JCheckBox> lt_bt = new ArrayList();
/*      */           
/* 1907 */           for (int i = 0; i < m_q.getOption().size(); i++)
/*      */           {
/* 1909 */             JCheckBox bt_cb = new JCheckBox();
/* 1910 */             bt_cb.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.BUTTON_RADIO_UNSELECTED.getImageIcon(), 28, 28)));
/* 1911 */             bt_cb.setSelectedIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.BUTTON_DROPDOWN.getImageIcon(), 28, 28)));
/* 1912 */             bt_cb.setCursor(new Cursor(12));
/* 1913 */             bt_cb.setBackground(Color.WHITE);
/* 1914 */             bt_cb.setText(((Module_Option)m_q.getOption().get(i)).getName());
/* 1915 */             bt_cb.setFont(Enum_Font_Ci.나눔바른고딕21.getFont());
/* 1916 */             bt_cb.setIconTextGap(25);
/* 1917 */             bt_cb.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
/* 1918 */             bt_cb.setEnabled(false);
/*      */             
/* 1920 */             lt_bt.add(bt_cb);
/*      */             
/* 1922 */             this.gbc.gridx = 0;
/* 1923 */             this.gbc.gridy += 1;
/* 1924 */             this.gbc.weighty = 0.5D;
/* 1925 */             this.gbc.insets = new Insets(15, 30, 15, 30);
/* 1926 */             add(bt_cb, this.gbc);
/*      */           }
/*      */           
/* 1929 */           Iterator iter = m_c_q.getAnswer().keySet().iterator();
/*      */           
/* 1931 */           while (iter.hasNext())
/*      */           {
/* 1933 */             String key = (String)iter.next();
/* 1934 */             ((JCheckBox)lt_bt.get(Integer.valueOf(key).intValue())).setSelected(true);
/*      */           }
/*      */           
/* 1937 */           return;
/* 1938 */           if (POINT_BL.equals("1"))
/*      */           {
/* 1940 */             JLabel ll_name = new JLabel();
/*      */             
/* 1942 */             ll_name.setOpaque(false);
/* 1943 */             ll_name.setFont(Enum_Font_Ci.나눔바른고딕25.getFont());
/* 1944 */             ll_name.setText("직선 질문 : " + m_q.getName());
/* 1945 */             ll_name.setIconTextGap(18);
/* 1946 */             ll_name.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.LABEL_IMAGE_BLACK.getImageIcon(), 28, 28)));
/*      */             
/* 1948 */             int min = Integer.valueOf(((Module_Option)m_q.getOption().get(0)).getNumber()).intValue();
/* 1949 */             int max = Integer.valueOf(((Module_Option)m_q.getOption().get(1)).getNumber()).intValue();
/*      */             
/* 1951 */             JLabel lbl_min = new JLabel(((Module_Option)m_q.getOption().get(0)).getName());
/* 1952 */             lbl_min.setFont(Enum_Font_Ci.나눔바른고딕21.getFont());
/* 1953 */             JLabel lbl_max = new JLabel(((Module_Option)m_q.getOption().get(1)).getName());
/* 1954 */             lbl_max.setFont(Enum_Font_Ci.나눔바른고딕21.getFont());
/*      */             
/* 1956 */             this.gbc.anchor = 17;
/* 1957 */             this.gbc.fill = 2;
/*      */             
/* 1959 */             this.gbc.gridx = 0;
/* 1960 */             this.gbc.gridy = 0;
/* 1961 */             this.gbc.gridwidth = (max + 2);
/* 1962 */             this.gbc.gridheight = 1;
/* 1963 */             this.gbc.weightx = 1.0D;
/* 1964 */             this.gbc.weighty = 1.0D;
/* 1965 */             this.gbc.insets = new Insets(30, 30, 20, 30);
/* 1966 */             add(ll_name, this.gbc);
/*      */             
/* 1968 */             this.gbc.anchor = 10;
/* 1969 */             this.gbc.fill = 0;
/*      */             
/* 1971 */             this.gbc.gridx = 0;
/* 1972 */             this.gbc.gridy = 1;
/* 1973 */             this.gbc.gridwidth = 1;
/* 1974 */             this.gbc.insets = new Insets(25, 30, 0, 30);
/*      */             
/* 1976 */             add(lbl_min, this.gbc);
/*      */             
/* 1978 */             this.gbc.gridx = (max + 1);
/* 1979 */             this.gbc.gridy = 1;
/* 1980 */             this.gbc.insets = new Insets(25, 30, 0, 30);
/* 1981 */             add(lbl_max, this.gbc);
/*      */             
/* 1983 */             List<JRadioButton> lt_bt = new ArrayList();
/*      */             
/* 1985 */             for (int i = min; i <= max; i++)
/*      */             {
/* 1987 */               JRadioButton bt_radio = new JRadioButton();
/* 1988 */               bt_radio.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.BUTTON_RADIO_UNSELECTED.getImageIcon(), 28, 28)));
/* 1989 */               bt_radio.setSelectedIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.BUTTON_RADIO_SELECTED.getImageIcon(), 28, 28)));
/* 1990 */               bt_radio.setCursor(new Cursor(12));
/* 1991 */               bt_radio.setBackground(Color.WHITE);
/* 1992 */               bt_radio.setText(String.valueOf(i));
/* 1993 */               bt_radio.setFont(Enum_Font_Ci.나눔바른고딕21.getFont());
/* 1994 */               bt_radio.setVerticalTextPosition(1);
/* 1995 */               bt_radio.setHorizontalTextPosition(0);
/* 1996 */               bt_radio.setIconTextGap(25);
/* 1997 */               bt_radio.setEnabled(false);
/*      */               
/* 1999 */               this.gbc.gridx = i;
/* 2000 */               this.gbc.gridy = 1;
/* 2001 */               this.gbc.insets = new Insets(0, 0, 30, 0);
/* 2002 */               add(bt_radio, this.gbc);
/*      */               
/* 2004 */               lt_bt.add(bt_radio);
/*      */             }
/*      */             
/* 2007 */             Iterator iter = m_c_q.getAnswer().keySet().iterator();
/*      */             
/* 2009 */             while (iter.hasNext())
/*      */             {
/* 2011 */               String key = (String)iter.next();
/* 2012 */               ((JRadioButton)lt_bt.get(Integer.valueOf(key).intValue())).setSelected(true);
/*      */             }
/*      */             
/*      */           }
/*      */           else
/*      */           {
/* 2018 */             JLabel ll_name = new JLabel();
/* 2019 */             JLabel ll_point = new JLabel();
/*      */             
/* 2021 */             ll_name.setOpaque(false);
/* 2022 */             ll_name.setFont(Enum_Font_Ci.나눔바른고딕25.getFont());
/* 2023 */             ll_name.setText("직선 질문 : " + m_q.getName());
/* 2024 */             ll_name.setIconTextGap(18);
/* 2025 */             ll_name.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.LABEL_IMAGE_BLACK.getImageIcon(), 28, 28)));
/*      */             
/* 2027 */             ll_point.setText(m_c_q.getPoint() + " / " + String.valueOf(m_q.getPoint()));
/* 2028 */             ll_point.setFont(Enum_Font_Ci.나눔바른고딕25.getFont());
/*      */             
/* 2030 */             int min = Integer.valueOf(((Module_Option)m_q.getOption().get(0)).getNumber()).intValue();
/* 2031 */             int max = Integer.valueOf(((Module_Option)m_q.getOption().get(1)).getNumber()).intValue();
/*      */             
/* 2033 */             JLabel lbl_min = new JLabel(((Module_Option)m_q.getOption().get(0)).getName());
/* 2034 */             lbl_min.setFont(Enum_Font_Ci.나눔바른고딕21.getFont());
/* 2035 */             JLabel lbl_max = new JLabel(((Module_Option)m_q.getOption().get(1)).getName());
/* 2036 */             lbl_max.setFont(Enum_Font_Ci.나눔바른고딕21.getFont());
/*      */             
/* 2038 */             this.gbc.anchor = 17;
/* 2039 */             this.gbc.fill = 2;
/*      */             
/* 2041 */             this.gbc.gridx = 0;
/* 2042 */             this.gbc.gridy = 0;
/* 2043 */             this.gbc.gridwidth = (max + 1);
/* 2044 */             this.gbc.gridheight = 1;
/* 2045 */             this.gbc.weightx = 1.0D;
/* 2046 */             this.gbc.weighty = 1.0D;
/* 2047 */             this.gbc.insets = new Insets(30, 30, 40, 30);
/* 2048 */             add(ll_name, this.gbc);
/*      */             
/* 2050 */             this.gbc.anchor = 13;
/* 2051 */             this.gbc.fill = 0;
/*      */             
/* 2053 */             this.gbc.gridx = (max + 2);
/* 2054 */             this.gbc.gridy = 0;
/* 2055 */             this.gbc.gridwidth = 1;
/* 2056 */             add(ll_point, this.gbc);
/*      */             
/* 2058 */             this.gbc.anchor = 10;
/* 2059 */             this.gbc.fill = 0;
/*      */             
/* 2061 */             this.gbc.gridx = 0;
/* 2062 */             this.gbc.gridy = 1;
/* 2063 */             this.gbc.gridwidth = 1;
/* 2064 */             this.gbc.insets = new Insets(25, 30, 0, 30);
/*      */             
/* 2066 */             add(lbl_min, this.gbc);
/*      */             
/* 2068 */             this.gbc.gridx = (max + 2);
/* 2069 */             this.gbc.gridy = 1;
/* 2070 */             this.gbc.insets = new Insets(25, 30, 0, 30);
/* 2071 */             add(lbl_max, this.gbc);
/*      */             
/* 2073 */             List<JRadioButton> lt_bt = new ArrayList();
/*      */             
/* 2075 */             for (int i = min; i <= max; i++)
/*      */             {
/* 2077 */               JRadioButton bt_radio = new JRadioButton();
/* 2078 */               bt_radio.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.BUTTON_RADIO_UNSELECTED.getImageIcon(), 28, 28)));
/* 2079 */               bt_radio.setSelectedIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.BUTTON_RADIO_SELECTED.getImageIcon(), 28, 28)));
/* 2080 */               bt_radio.setCursor(new Cursor(12));
/* 2081 */               bt_radio.setBackground(Color.WHITE);
/* 2082 */               bt_radio.setText(String.valueOf(i));
/* 2083 */               bt_radio.setFont(Enum_Font_Ci.나눔바른고딕21.getFont());
/* 2084 */               bt_radio.setVerticalTextPosition(1);
/* 2085 */               bt_radio.setHorizontalTextPosition(0);
/* 2086 */               bt_radio.setIconTextGap(25);
/* 2087 */               bt_radio.setEnabled(false);
/*      */               
/* 2089 */               this.gbc.gridx = i;
/* 2090 */               this.gbc.gridy = 1;
/* 2091 */               this.gbc.insets = new Insets(0, 0, 30, 0);
/* 2092 */               add(bt_radio, this.gbc);
/*      */               
/* 2094 */               lt_bt.add(bt_radio);
/*      */             }
/*      */             
/* 2097 */             Iterator iter = m_c_q.getAnswer().keySet().iterator();
/*      */             
/* 2099 */             while (iter.hasNext())
/*      */             {
/* 2101 */               String key = (String)iter.next();
/* 2102 */               ((JRadioButton)lt_bt.get(Integer.valueOf(key).intValue())).setSelected(true);
/*      */             }
/* 2104 */             return;
/*      */             
/* 2106 */             if (POINT_BL.equals("1"))
/*      */             {
/* 2108 */               JLabel ll_name = new JLabel();
/*      */               
/* 2110 */               ll_name.setOpaque(false);
/* 2111 */               ll_name.setFont(Enum_Font_Ci.나눔바른고딕25.getFont());
/* 2112 */               ll_name.setText("객관식 그리드 : " + m_q.getName());
/* 2113 */               ll_name.setIconTextGap(18);
/* 2114 */               ll_name.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.LABEL_IMAGE_BLACK.getImageIcon(), 28, 28)));
/*      */               
/* 2116 */               List<String> lt_col = new ArrayList();
/* 2117 */               List<String> lt_row = new ArrayList();
/*      */               
/* 2119 */               for (int i = 0; i < m_q.getOption().size(); i++)
/*      */               {
/* 2121 */                 if (((Module_Option)m_q.getOption().get(i)).getNumber().contains("r"))
/*      */                 {
/* 2123 */                   lt_row.add(((Module_Option)m_q.getOption().get(i)).getName());
/*      */                 }
/* 2125 */                 else if (((Module_Option)m_q.getOption().get(i)).getNumber().contains("c"))
/*      */                 {
/* 2127 */                   lt_col.add(((Module_Option)m_q.getOption().get(i)).getName());
/*      */                 }
/*      */               }
/*      */               
/* 2131 */               this.gbc.anchor = 17;
/* 2132 */               this.gbc.fill = 2;
/*      */               
/* 2134 */               this.gbc.gridx = 0;
/* 2135 */               this.gbc.gridy = 0;
/* 2136 */               this.gbc.gridwidth = (lt_col.size() + 2);
/* 2137 */               this.gbc.gridheight = 1;
/* 2138 */               this.gbc.weightx = 1.0D;
/* 2139 */               this.gbc.weighty = 1.0D;
/* 2140 */               this.gbc.insets = new Insets(30, 30, 40, 30);
/* 2141 */               add(ll_name, this.gbc);
/* 2142 */               this.gbc.anchor = 10;
/* 2143 */               this.gbc.fill = 0;
/*      */               
/* 2145 */               this.gbc.gridx = 0;
/* 2146 */               this.gbc.gridy = 1;
/* 2147 */               this.gbc.gridwidth = 1;
/* 2148 */               this.gbc.insets = new Insets(0, 30, 0, 0);
/*      */               
/* 2150 */               add(new JLabel(), this.gbc);
/*      */               
/* 2152 */               for (int i = 0; i < lt_col.size(); i++)
/*      */               {
/* 2154 */                 JLabel lbl = new JLabel((String)lt_col.get(i));
/* 2155 */                 lbl.setFont(Enum_Font_Ci.나눔바른고딕21.getFont());
/* 2156 */                 this.gbc.gridx = (i + 1);
/* 2157 */                 this.gbc.insets = new Insets(10, 0, 10, 0);
/*      */                 
/* 2159 */                 add(lbl, this.gbc);
/*      */               }
/*      */               
/* 2162 */               List<ArrayList<JRadioButton>> lt_b = new ArrayList();
/*      */               
/* 2164 */               for (int i = 0; i < lt_row.size(); i++)
/*      */               {
/* 2166 */                 JLabel lbl = new JLabel((String)lt_row.get(i));
/* 2167 */                 lbl.setFont(Enum_Font_Ci.나눔바른고딕21.getFont());
/*      */                 
/* 2169 */                 this.gbc.gridx = 0;
/* 2170 */                 this.gbc.gridy += 1;
/*      */                 
/* 2172 */                 add(lbl, this.gbc);
/*      */                 
/* 2174 */                 lt_b.add(new ArrayList());
/*      */                 
/* 2176 */                 for (int j = 0; j < lt_col.size(); j++)
/*      */                 {
/* 2178 */                   JRadioButton bt_radio = new JRadioButton();
/* 2179 */                   bt_radio.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.BUTTON_RADIO_UNSELECTED.getImageIcon(), 28, 28)));
/* 2180 */                   bt_radio.setSelectedIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.BUTTON_RADIO_SELECTED.getImageIcon(), 28, 28)));
/* 2181 */                   bt_radio.setCursor(new Cursor(12));
/* 2182 */                   bt_radio.setBackground(Color.WHITE);
/* 2183 */                   bt_radio.setEnabled(false);
/*      */                   
/* 2185 */                   this.gbc.gridx += 1;
/* 2186 */                   this.gbc.insets = new Insets(10, 0, 10, 0);
/*      */                   
/* 2188 */                   add(bt_radio, this.gbc);
/*      */                   
/* 2190 */                   ((ArrayList)lt_b.get(i)).add(bt_radio);
/*      */                 }
/*      */               }
/*      */               
/* 2194 */               Iterator iter = m_c_q.getAnswer().keySet().iterator();
/*      */               
/* 2196 */               while (iter.hasNext())
/*      */               {
/* 2198 */                 String key = (String)iter.next();
/* 2199 */                 String ix = key.replaceAll("r", "");
/* 2200 */                 String iy = ((String)m_c_q.getAnswer().get(key)).replaceAll("c", "");
/* 2201 */                 ((JRadioButton)((ArrayList)lt_b.get(Integer.valueOf(ix).intValue())).get(Integer.valueOf(iy).intValue())).setSelected(true);
/*      */               }
/*      */             }
/*      */             else
/*      */             {
/* 2206 */               JLabel ll_name = new JLabel();
/* 2207 */               JLabel ll_point = new JLabel();
/*      */               
/* 2209 */               ll_name.setOpaque(false);
/* 2210 */               ll_name.setFont(Enum_Font_Ci.나눔바른고딕25.getFont());
/* 2211 */               ll_name.setText("객관식 그리드 : " + m_q.getName());
/* 2212 */               ll_name.setIconTextGap(18);
/* 2213 */               ll_name.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.LABEL_IMAGE_BLACK.getImageIcon(), 28, 28)));
/*      */               
/* 2215 */               ll_point.setText(m_c_q.getPoint() + " / " + String.valueOf(m_q.getPoint()));
/* 2216 */               ll_point.setFont(Enum_Font_Ci.나눔바른고딕25.getFont());
/*      */               
/* 2218 */               List<String> lt_col = new ArrayList();
/* 2219 */               List<String> lt_row = new ArrayList();
/*      */               
/* 2221 */               for (int i = 0; i < m_q.getOption().size(); i++)
/*      */               {
/* 2223 */                 if (((Module_Option)m_q.getOption().get(i)).getNumber().contains("r"))
/*      */                 {
/* 2225 */                   lt_row.add(((Module_Option)m_q.getOption().get(i)).getName());
/*      */                 }
/* 2227 */                 else if (((Module_Option)m_q.getOption().get(i)).getNumber().contains("c"))
/*      */                 {
/* 2229 */                   lt_col.add(((Module_Option)m_q.getOption().get(i)).getName());
/*      */                 }
/*      */               }
/*      */               
/* 2233 */               this.gbc.anchor = 17;
/* 2234 */               this.gbc.fill = 2;
/*      */               
/* 2236 */               this.gbc.gridx = 0;
/* 2237 */               this.gbc.gridy = 0;
/* 2238 */               this.gbc.gridwidth = lt_col.size();
/* 2239 */               this.gbc.gridheight = 1;
/* 2240 */               this.gbc.weightx = 1.0D;
/* 2241 */               this.gbc.weighty = 1.0D;
/* 2242 */               this.gbc.insets = new Insets(30, 30, 40, 30);
/* 2243 */               add(ll_name, this.gbc);
/*      */               
/* 2245 */               this.gbc.anchor = 13;
/* 2246 */               this.gbc.fill = 0;
/*      */               
/* 2248 */               this.gbc.gridx = lt_col.size();
/* 2249 */               this.gbc.gridy = 0;
/* 2250 */               this.gbc.gridwidth = 1;
/* 2251 */               add(ll_point, this.gbc);
/*      */               
/* 2253 */               this.gbc.anchor = 10;
/* 2254 */               this.gbc.fill = 0;
/*      */               
/* 2256 */               this.gbc.gridx = 0;
/* 2257 */               this.gbc.gridy = 1;
/* 2258 */               this.gbc.gridwidth = 1;
/* 2259 */               this.gbc.insets = new Insets(0, 30, 0, 0);
/*      */               
/* 2261 */               add(new JLabel(), this.gbc);
/*      */               
/* 2263 */               List<JLabel> ll_c = new ArrayList();
/*      */               
/* 2265 */               for (int i = 0; i < lt_col.size(); i++)
/*      */               {
/* 2267 */                 JLabel lbl = new JLabel((String)lt_col.get(i));
/* 2268 */                 lbl.setFont(Enum_Font_Ci.나눔바른고딕21.getFont());
/* 2269 */                 this.gbc.gridx = (i + 1);
/* 2270 */                 this.gbc.insets = new Insets(10, 0, 10, 0);
/*      */                 
/* 2272 */                 add(lbl, this.gbc);
/*      */               }
/*      */               
/* 2275 */               List<ArrayList<JButton>> lt_b = new ArrayList();
/*      */               
/* 2277 */               for (int i = 0; i < lt_row.size(); i++)
/*      */               {
/* 2279 */                 JLabel lbl = new JLabel((String)lt_row.get(i));
/* 2280 */                 lbl.setFont(Enum_Font_Ci.나눔바른고딕21.getFont());
/*      */                 
/* 2282 */                 this.gbc.gridx = 0;
/* 2283 */                 this.gbc.gridy += 1;
/*      */                 
/* 2285 */                 add(lbl, this.gbc);
/*      */                 
/* 2287 */                 ll_c.add(lbl);
/*      */                 
/* 2289 */                 lt_b.add(new ArrayList());
/*      */                 
/* 2291 */                 for (int j = 0; j < lt_col.size(); j++)
/*      */                 {
/* 2293 */                   JButton bt_radio = new JButton();
/* 2294 */                   bt_radio.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.BUTTON_RADIO_UNSELECTED.getImageIcon(), 28, 28)));
/* 2295 */                   bt_radio.setSelectedIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.BUTTON_RADIO_SELECTED.getImageIcon(), 28, 28)));
/* 2296 */                   bt_radio.setCursor(null);
/* 2297 */                   bt_radio.setBackground(Color.WHITE);
/* 2298 */                   bt_radio.setOpaque(true);
/* 2299 */                   bt_radio.setFocusable(false);
/* 2300 */                   bt_radio.setBorder(null);
/*      */                   
/* 2302 */                   this.gbc.gridx += 1;
/* 2303 */                   this.gbc.insets = new Insets(10, 0, 10, 0);
/*      */                   
/* 2305 */                   add(bt_radio, this.gbc);
/*      */                   
/* 2307 */                   ((ArrayList)lt_b.get(i)).add(bt_radio);
/*      */                 }
/*      */               }
/*      */               
/* 2311 */               Iterator iter = m_c_q.getAnswer().keySet().iterator();
/* 2312 */               Iterator iter_q = m_q.getOption().iterator();
/*      */               
/* 2314 */               while (iter.hasNext())
/*      */               {
/* 2316 */                 String key = (String)iter.next();
/* 2317 */                 Module_Option m = (Module_Option)iter_q.next();
/*      */                 
/* 2319 */                 String ix = key.replaceAll("r", "");
/* 2320 */                 String iy = ((String)m_c_q.getAnswer().get(key)).replaceAll("c", "");
/* 2321 */                 ((JButton)((ArrayList)lt_b.get(Integer.valueOf(ix).intValue())).get(Integer.valueOf(iy).intValue())).setSelected(true);
/*      */                 
/* 2323 */                 if (m.getTarget().get(0) == Integer.valueOf(iy))
/*      */                 {
/* 2325 */                   ((JButton)((ArrayList)lt_b.get(Integer.valueOf(ix).intValue())).get(Integer.valueOf(iy).intValue())).setSelectedIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.BUTTON_RADIO_SELECTED_GREEN.getImageIcon(), 28, 28)));
/* 2326 */                   ((JLabel)ll_c.get(Integer.valueOf(ix).intValue())).setForeground(new Color(95, 191, 0));
/*      */                 }
/*      */                 else
/*      */                 {
/* 2330 */                   ((JButton)((ArrayList)lt_b.get(Integer.valueOf(ix).intValue())).get(((Integer)m.getTarget().get(0)).intValue())).setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.BUTTON_RADIO_SELECTED_GREEN.getImageIcon(), 28, 28)));
/* 2331 */                   ((JLabel)ll_c.get(Integer.valueOf(ix).intValue())).setForeground(Color.RED);
/*      */                 }
/*      */               }
/*      */               
/* 2335 */               return;
/* 2336 */               if (POINT_BL.equals("1"))
/*      */               {
/* 2338 */                 JLabel ll_name = new JLabel();
/*      */                 
/* 2340 */                 ll_name.setOpaque(false);
/* 2341 */                 ll_name.setFont(Enum_Font_Ci.나눔바른고딕25.getFont());
/* 2342 */                 ll_name.setText("체크박스 그리드 : " + m_q.getName());
/* 2343 */                 ll_name.setIconTextGap(18);
/* 2344 */                 ll_name.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.LABEL_IMAGE_BLACK.getImageIcon(), 28, 28)));
/*      */                 
/* 2346 */                 List<String> lt_col = new ArrayList();
/* 2347 */                 List<String> lt_row = new ArrayList();
/*      */                 
/* 2349 */                 for (int i = 0; i < m_q.getOption().size(); i++)
/*      */                 {
/* 2351 */                   if (((Module_Option)m_q.getOption().get(i)).getNumber().contains("r"))
/*      */                   {
/* 2353 */                     lt_row.add(((Module_Option)m_q.getOption().get(i)).getName());
/*      */                   }
/* 2355 */                   else if (((Module_Option)m_q.getOption().get(i)).getNumber().contains("c"))
/*      */                   {
/* 2357 */                     lt_col.add(((Module_Option)m_q.getOption().get(i)).getName());
/*      */                   }
/*      */                 }
/*      */                 
/* 2361 */                 this.gbc.anchor = 17;
/* 2362 */                 this.gbc.fill = 2;
/*      */                 
/* 2364 */                 this.gbc.gridx = 0;
/* 2365 */                 this.gbc.gridy = 0;
/* 2366 */                 this.gbc.gridwidth = (lt_col.size() + 2);
/* 2367 */                 this.gbc.gridheight = 1;
/* 2368 */                 this.gbc.weightx = 1.0D;
/* 2369 */                 this.gbc.weighty = 1.0D;
/* 2370 */                 this.gbc.insets = new Insets(30, 30, 40, 30);
/* 2371 */                 add(ll_name, this.gbc);
/*      */                 
/* 2373 */                 this.gbc.anchor = 10;
/* 2374 */                 this.gbc.fill = 0;
/*      */                 
/* 2376 */                 this.gbc.gridx = 0;
/* 2377 */                 this.gbc.gridy = 1;
/* 2378 */                 this.gbc.gridwidth = 1;
/* 2379 */                 this.gbc.insets = new Insets(0, 30, 0, 0);
/*      */                 
/* 2381 */                 add(new JLabel(), this.gbc);
/*      */                 
/* 2383 */                 for (int i = 0; i < lt_col.size(); i++)
/*      */                 {
/* 2385 */                   JLabel lbl = new JLabel((String)lt_col.get(i));
/* 2386 */                   lbl.setFont(Enum_Font_Ci.나눔바른고딕21.getFont());
/* 2387 */                   this.gbc.gridx = (i + 1);
/* 2388 */                   this.gbc.insets = new Insets(10, 0, 10, 0);
/*      */                   
/* 2390 */                   add(lbl, this.gbc);
/*      */                 }
/*      */                 
/* 2393 */                 List<ArrayList<JRadioButton>> lt_b = new ArrayList();
/*      */                 
/* 2395 */                 for (int i = 0; i < lt_row.size(); i++)
/*      */                 {
/* 2397 */                   JLabel lbl = new JLabel((String)lt_row.get(i));
/* 2398 */                   lbl.setFont(Enum_Font_Ci.나눔바른고딕21.getFont());
/*      */                   
/* 2400 */                   this.gbc.gridx = 0;
/* 2401 */                   this.gbc.gridy += 1;
/*      */                   
/* 2403 */                   add(lbl, this.gbc);
/*      */                   
/* 2405 */                   lt_b.add(new ArrayList());
/*      */                   
/* 2407 */                   for (int j = 0; j < lt_col.size(); j++)
/*      */                   {
/* 2409 */                     JRadioButton bt_radio = new JRadioButton();
/* 2410 */                     bt_radio.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.BUTTON_CHECKBOX_UNSELECTED.getImageIcon(), 28, 28)));
/* 2411 */                     bt_radio.setSelectedIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.BUTTON_CHECKBOX_SELECTED.getImageIcon(), 28, 28)));
/* 2412 */                     bt_radio.setCursor(new Cursor(12));
/* 2413 */                     bt_radio.setBackground(Color.WHITE);
/* 2414 */                     bt_radio.setEnabled(false);
/*      */                     
/* 2416 */                     this.gbc.gridx += 1;
/* 2417 */                     this.gbc.insets = new Insets(10, 0, 10, 0);
/*      */                     
/* 2419 */                     add(bt_radio, this.gbc);
/*      */                     
/* 2421 */                     ((ArrayList)lt_b.get(i)).add(bt_radio);
/*      */                   }
/*      */                 }
/*      */                 
/* 2425 */                 Iterator iter = m_c_q.getAnswer().keySet().iterator();
/*      */                 
/* 2427 */                 while (iter.hasNext())
/*      */                 {
/* 2429 */                   String key = (String)iter.next();
/* 2430 */                   String[] ix = key.split("r");
/* 2431 */                   ((JRadioButton)((ArrayList)lt_b.get(Integer.valueOf(ix[0]).intValue())).get(Integer.valueOf(ix[1]).intValue())).setSelected(true);
/*      */                 }
/*      */               }
/*      */               else
/*      */               {
/* 2436 */                 JLabel ll_name = new JLabel();
/* 2437 */                 JLabel ll_point = new JLabel();
/*      */                 
/* 2439 */                 ll_name.setOpaque(false);
/* 2440 */                 ll_name.setFont(Enum_Font_Ci.나눔바른고딕25.getFont());
/* 2441 */                 ll_name.setText("체크박스 그리드 : " + m_q.getName());
/* 2442 */                 ll_name.setIconTextGap(18);
/* 2443 */                 ll_name.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.LABEL_IMAGE_BLACK.getImageIcon(), 28, 28)));
/*      */                 
/* 2445 */                 ll_point.setText(m_c_q.getPoint() + " / " + String.valueOf(m_q.getPoint()));
/* 2446 */                 ll_point.setFont(Enum_Font_Ci.나눔바른고딕25.getFont());
/*      */                 
/* 2448 */                 List<String> lt_col = new ArrayList();
/* 2449 */                 List<String> lt_row = new ArrayList();
/*      */                 
/* 2451 */                 for (int i = 0; i < m_q.getOption().size(); i++)
/*      */                 {
/* 2453 */                   if (((Module_Option)m_q.getOption().get(i)).getNumber().contains("r"))
/*      */                   {
/* 2455 */                     lt_row.add(((Module_Option)m_q.getOption().get(i)).getName());
/*      */                   }
/* 2457 */                   else if (((Module_Option)m_q.getOption().get(i)).getNumber().contains("c"))
/*      */                   {
/* 2459 */                     lt_col.add(((Module_Option)m_q.getOption().get(i)).getName());
/*      */                   }
/*      */                 }
/*      */                 
/* 2463 */                 this.gbc.anchor = 17;
/* 2464 */                 this.gbc.fill = 2;
/*      */                 
/* 2466 */                 this.gbc.gridx = 0;
/* 2467 */                 this.gbc.gridy = 0;
/* 2468 */                 this.gbc.gridwidth = (lt_col.size() + 2);
/* 2469 */                 this.gbc.gridheight = 1;
/* 2470 */                 this.gbc.weightx = 1.0D;
/* 2471 */                 this.gbc.weighty = 1.0D;
/* 2472 */                 this.gbc.insets = new Insets(30, 30, 40, 30);
/* 2473 */                 add(ll_name, this.gbc);
/*      */                 
/* 2475 */                 this.gbc.anchor = 13;
/* 2476 */                 this.gbc.fill = 0;
/*      */                 
/* 2478 */                 this.gbc.gridx = lt_col.size();
/* 2479 */                 this.gbc.gridy = 0;
/* 2480 */                 this.gbc.gridwidth = 1;
/* 2481 */                 add(ll_point, this.gbc);
/*      */                 
/* 2483 */                 this.gbc.anchor = 10;
/* 2484 */                 this.gbc.fill = 0;
/*      */                 
/* 2486 */                 this.gbc.gridx = 0;
/* 2487 */                 this.gbc.gridy = 1;
/* 2488 */                 this.gbc.gridwidth = 1;
/* 2489 */                 this.gbc.insets = new Insets(0, 30, 0, 0);
/*      */                 
/* 2491 */                 add(new JLabel(), this.gbc);
/*      */                 
/* 2493 */                 List<JLabel> ll_c = new ArrayList();
/*      */                 
/* 2495 */                 for (int i = 0; i < lt_col.size(); i++)
/*      */                 {
/* 2497 */                   JLabel lbl = new JLabel((String)lt_col.get(i));
/* 2498 */                   lbl.setFont(Enum_Font_Ci.나눔바른고딕21.getFont());
/* 2499 */                   this.gbc.gridx = (i + 1);
/* 2500 */                   this.gbc.insets = new Insets(10, 0, 10, 0);
/*      */                   
/* 2502 */                   add(lbl, this.gbc);
/*      */                 }
/*      */                 
/* 2505 */                 List<ArrayList<JButton>> lt_b = new ArrayList();
/*      */                 
/* 2507 */                 ImageIcon ig = new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.BUTTON_CHECKBOX_SELECTED.getImageIcon(), 28, 28));
/* 2508 */                 for (int i = 0; i < lt_row.size(); i++)
/*      */                 {
/* 2510 */                   JLabel lbl = new JLabel((String)lt_row.get(i));
/* 2511 */                   lbl.setFont(Enum_Font_Ci.나눔바른고딕21.getFont());
/*      */                   
/* 2513 */                   this.gbc.gridx = 0;
/* 2514 */                   this.gbc.gridy += 1;
/*      */                   
/* 2516 */                   add(lbl, this.gbc);
/*      */                   
/* 2518 */                   ll_c.add(lbl);
/*      */                   
/* 2520 */                   lt_b.add(new ArrayList());
/*      */                   
/* 2522 */                   for (int j = 0; j < lt_col.size(); j++)
/*      */                   {
/* 2524 */                     JButton bt_radio = new JButton();
/* 2525 */                     bt_radio.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.BUTTON_CHECKBOX_UNSELECTED.getImageIcon(), 28, 28)));
/* 2526 */                     bt_radio.setSelectedIcon(ig);
/* 2527 */                     bt_radio.setCursor(new Cursor(12));
/* 2528 */                     bt_radio.setBackground(Color.WHITE);
/* 2529 */                     bt_radio.setBackground(Color.WHITE);
/* 2530 */                     bt_radio.setOpaque(true);
/* 2531 */                     bt_radio.setFocusable(false);
/* 2532 */                     bt_radio.setBorder(null);
/*      */                     
/* 2534 */                     this.gbc.gridx += 1;
/* 2535 */                     this.gbc.insets = new Insets(10, 0, 10, 0);
/*      */                     
/* 2537 */                     add(bt_radio, this.gbc);
/*      */                     
/* 2539 */                     ((ArrayList)lt_b.get(i)).add(bt_radio);
/*      */                   }
/*      */                 }
/*      */                 
/* 2543 */                 Iterator iter = m_c_q.getAnswer().keySet().iterator();
/* 2544 */                 Iterator iter_q = m_q.getOption().iterator();
/*      */                 String[] ix;
/* 2546 */                 int i; for (; iter.hasNext(); 
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2553 */                     i < ((Module_Option)m_q.getOption().get(Integer.valueOf(ix[0]).intValue())).getTarget().size())
/*      */                 {
/* 2548 */                   String key = (String)iter.next();
/*      */                   
/* 2550 */                   ix = key.split("r");
/* 2551 */                   ((JButton)((ArrayList)lt_b.get(Integer.valueOf(ix[0]).intValue())).get(Integer.valueOf(ix[1]).intValue())).setSelected(true);
/*      */                   
/* 2553 */                   i = 0; continue;
/*      */                   
/* 2555 */                   if (((Module_Option)m_q.getOption().get(Integer.valueOf(ix[0]).intValue())).getTarget().get(i) == Integer.valueOf(ix[1]))
/*      */                   {
/* 2557 */                     ((JButton)((ArrayList)lt_b.get(Integer.valueOf(ix[0]).intValue())).get(Integer.valueOf(ix[1]).intValue())).setSelectedIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.BUTTON_CHECKBOX_SELECTED_GREEN.getImageIcon(), 28, 28)));
/*      */                   }
/*      */                   else
/*      */                   {
/* 2561 */                     ((JButton)((ArrayList)lt_b.get(Integer.valueOf(ix[0]).intValue())).get(((Integer)((Module_Option)m_q.getOption().get(Integer.valueOf(ix[0]).intValue())).getTarget().get(i)).intValue())).setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.BUTTON_CHECKBOX_SELECTED_GREEN.getImageIcon(), 28, 28)));
/*      */                   }
/* 2553 */                   i++;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2566 */                 for (int i = 0; i < lt_b.size(); i++)
/*      */                 {
/* 2568 */                   for (int j = 0; j < ((ArrayList)lt_b.get(i)).size(); j++)
/*      */                   {
/* 2570 */                     if ((((JButton)((ArrayList)lt_b.get(i)).get(j)).isSelected()) && (((JButton)((ArrayList)lt_b.get(i)).get(j)).getSelectedIcon().equals(ig)))
/*      */                     {
/* 2572 */                       ((JLabel)ll_c.get(i)).setForeground(Color.RED);
/* 2573 */                       break;
/*      */                     }
/*      */                     
/*      */ 
/* 2577 */                     ((JLabel)ll_c.get(i)).setForeground(new Color(0, 128, 0));
/*      */                   }
/*      */                 }
/*      */               }
/*      */             }
/*      */           }
/*      */         }
/*      */       }
/*      */       break;
/*      */     }
/*      */   }
/*      */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Panel_Individual_Client_Question.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */