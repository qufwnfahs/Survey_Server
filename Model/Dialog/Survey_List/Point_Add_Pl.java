/*    */ package Model.Dialog.Survey_List;
/*    */ 
/*    */ import Enum.Enum_Color_Ci;
/*    */ import Enum.Enum_Font_Ci;
/*    */ import Enum.Enum_Image_Ci;
/*    */ import Model.Dialog.Survey_List.Question_Management.BorderPanel;
/*    */ import Model.Dialog.Survey_List.Question_Management.NumberPanel;
/*    */ import Worker.ImageController;
/*    */ import java.awt.CardLayout;
/*    */ import java.awt.Color;
/*    */ import java.awt.Cursor;
/*    */ import java.awt.Dimension;
/*    */ import java.awt.GridBagConstraints;
/*    */ import java.awt.GridBagLayout;
/*    */ import java.awt.event.ActionEvent;
/*    */ import java.awt.event.ActionListener;
/*    */ import javax.swing.ImageIcon;
/*    */ import javax.swing.JButton;
/*    */ import javax.swing.JLabel;
/*    */ import javax.swing.JPanel;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Point_Add_Pl
/*    */   extends JPanel
/*    */   implements ActionListener
/*    */ {
/* 28 */   private GridBagLayout gbl = new GridBagLayout();
/* 29 */   private GridBagConstraints gbc = new GridBagConstraints();
/* 30 */   private CardLayout card = new CardLayout();
/*    */   
/*    */   private BorderPanel borderPanel;
/*    */   
/* 34 */   private NumberPanel numberPanel = new NumberPanel(3);
/* 35 */   private JLabel ll_title = new JLabel();
/* 36 */   private JPanel pl_card = new JPanel();
/* 37 */   private JButton bt_prev = new JButton();
/* 38 */   private JButton bt_next = new JButton();
/*    */   
/*    */   private Card_Survey_Fr frame;
/*    */   
/*    */ 
/*    */   public Point_Add_Pl(Card_Survey_Fr frame)
/*    */   {
/* 45 */     this.frame = frame;
/*    */     
/*    */ 
/* 48 */     setLayout(this.gbl);
/* 49 */     setBackground(Color.WHITE);
/*    */     
/*    */ 
/* 52 */     this.borderPanel = new BorderPanel(frame, 0);
/*    */     
/* 54 */     this.ll_title.setText("점수 관리");
/* 55 */     this.ll_title.setFont(Enum_Font_Ci.FONT23.getFont());
/* 56 */     this.ll_title.setOpaque(true);
/* 57 */     this.ll_title.setBackground(Color.WHITE);
/*    */     
/* 59 */     this.pl_card.setLayout(this.card);
/*    */     
/* 61 */     this.bt_prev.setText("이전");
/* 62 */     this.bt_prev.setOpaque(true);
/* 63 */     this.bt_prev.setBackground(Enum_Color_Ci._673AB7.getColor());
/* 64 */     this.bt_prev.setForeground(Color.WHITE);
/* 65 */     this.bt_prev.setFont(Enum_Font_Ci.INFO.getFont());
/* 66 */     this.bt_prev.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.PREV.getImageIcon(), 28, 28)));
/* 67 */     this.bt_prev.setHorizontalAlignment(2);
/* 68 */     this.bt_prev.setCursor(new Cursor(12));
/* 69 */     this.bt_prev.addActionListener(this);
/* 70 */     this.bt_prev.setPreferredSize(new Dimension(110, 50));
/*    */     
/* 72 */     this.bt_next.setText("다음");
/* 73 */     this.bt_next.setOpaque(true);
/* 74 */     this.bt_next.setBackground(Enum_Color_Ci._673AB7.getColor());
/* 75 */     this.bt_next.setForeground(Color.WHITE);
/* 76 */     this.bt_next.setFont(Enum_Font_Ci.INFO.getFont());
/* 77 */     this.bt_next.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.NEXT.getImageIcon(), 28, 28)));
/* 78 */     this.bt_next.setHorizontalTextPosition(2);
/* 79 */     this.bt_next.setHorizontalAlignment(4);
/* 80 */     this.bt_next.setCursor(new Cursor(12));
/* 81 */     this.bt_next.addActionListener(this);
/* 82 */     this.bt_next.setPreferredSize(new Dimension(110, 50));
/*    */     
/*    */ 
/* 85 */     this.gbc.anchor = 11;
/* 86 */     this.gbc.fill = 0;
/*    */   }
/*    */   
/*    */   public void actionPerformed(ActionEvent e) {}
/*    */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Survey_List\Point_Add_Pl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */