/*     */ package Model.Dialog;
/*     */ 
/*     */ import Enum.Enum_Table_Ci;
/*     */ import Worker.Database;
/*     */ import java.awt.Color;
/*     */ import java.awt.Font;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.GridBagLayout;
/*     */ import java.awt.Insets;
/*     */ import java.sql.SQLException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Enumeration;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JTree;
/*     */ import javax.swing.event.TreeSelectionEvent;
/*     */ import javax.swing.event.TreeSelectionListener;
/*     */ import javax.swing.tree.DefaultMutableTreeNode;
/*     */ import javax.swing.tree.DefaultTreeModel;
/*     */ import javax.swing.tree.TreeModel;
/*     */ import javax.swing.tree.TreeNode;
/*     */ import javax.swing.tree.TreePath;
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
/*     */ class TreePanel
/*     */   extends JPanel
/*     */   implements TreeSelectionListener
/*     */ {
/* 636 */   private GridBagLayout gbl = new GridBagLayout();
/* 637 */   private GridBagConstraints gbc = new GridBagConstraints();
/*     */   
/* 639 */   private JLabel title_ll = new JLabel();
/*     */   
/*     */   private static JTree tree;
/*     */   private TreeRenderer renderer;
/* 643 */   private static DefaultMutableTreeNode root = new DefaultMutableTreeNode();
/* 644 */   private static DefaultTreeModel dtm = new DefaultTreeModel(root);
/*     */   
/*     */   public TreePanel() throws SQLException
/*     */   {
/* 648 */     setLayout(this.gbl);
/* 649 */     setBackground(new Color(0, 172, 189));
/*     */     
/* 651 */     this.title_ll.setText("   그룹 관리");
/* 652 */     this.title_ll.setFont(new Font("나눔바른고딕", 0, 25));
/* 653 */     this.title_ll.setOpaque(true);
/* 654 */     this.title_ll.setBackground(Color.white);
/* 655 */     this.title_ll.setBorder(BorderFactory.createMatteBorder(2, 0, 2, 1, Color.BLACK));
/*     */     
/* 657 */     tree = new JTree(dtm);
/* 658 */     this.renderer = new TreeRenderer();
/* 659 */     tree.setCellRenderer(this.renderer);
/* 660 */     tree.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.BLACK));
/* 661 */     tree.addTreeSelectionListener(this);
/*     */     
/* 663 */     this.gbc.anchor = 11;
/* 664 */     this.gbc.fill = 1;
/*     */     
/* 666 */     this.gbc.gridx = 0;
/* 667 */     this.gbc.gridy = 0;
/* 668 */     this.gbc.gridwidth = 1;
/* 669 */     this.gbc.gridheight = 1;
/* 670 */     this.gbc.weightx = 1.0D;
/* 671 */     this.gbc.weighty = 0.1D;
/* 672 */     this.gbc.insets = new Insets(20, 20, 0, 0);
/* 673 */     add(this.title_ll, this.gbc);
/*     */     
/* 675 */     this.gbc.gridx = 0;
/* 676 */     this.gbc.gridy = 1;
/* 677 */     this.gbc.weighty = 0.9D;
/* 678 */     this.gbc.insets = new Insets(0, 20, 20, 0);
/* 679 */     add(tree, this.gbc);
/*     */     
/* 681 */     loadGroup();
/*     */   }
/*     */   
/*     */   public static JTree getTree()
/*     */   {
/* 686 */     return tree;
/*     */   }
/*     */   
/*     */ 
/*     */   public void valueChanged(TreeSelectionEvent arg0)
/*     */   {
/* 692 */     if (arg0.getSource().equals(tree))
/*     */     {
/* 694 */       DefaultMutableTreeNode node = (DefaultMutableTreeNode)tree.getLastSelectedPathComponent();
/*     */       
/*     */ 
/* 697 */       if (node == null) {
/* 698 */         return;
/*     */       }
/*     */       
/* 701 */       String nodeInfo = (String)node.getUserObject();
/* 702 */       String[] split = nodeInfo.split(" ");
/*     */       
/*     */ 
/* 705 */       if (split[0].equals("전체"))
/*     */       {
/*     */         try
/*     */         {
/* 709 */           TablePanel.loadSurvey();
/*     */         } catch (SQLException e) {
/* 711 */           e.printStackTrace();
/*     */         }
/*     */       } else {
/*     */         try {
/* 715 */           List<Map<String, String>> group = Database.getDataDoList(Enum_Table_Ci.T001.getCode(), split[0]);
/* 716 */           TablePanel.loadSurvey(group);
/* 717 */           JOptionPane optionPane = new JOptionPane();
/* 718 */           JOptionPane.showMessageDialog(null, group.size() + "명이 검색되었습니다.");
/*     */         } catch (SQLException e) {
/* 720 */           e.printStackTrace();
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public static void loadGroup() throws SQLException
/*     */   {
/* 728 */     root.removeAllChildren();
/*     */     
/* 730 */     List<Map<String, String>> user = Database.getData(Enum_Table_Ci.T001.getCode());
/* 731 */     List<Map<String, String>> group = Database.getData(Enum_Table_Ci.T002.getCode());
/*     */     
/* 733 */     List<String> temp = new ArrayList();
/*     */     
/* 735 */     for (int i = 0; i < group.size(); i++)
/*     */     {
/* 737 */       if (!temp.contains(((Map)group.get(i)).get("GROUP")))
/*     */       {
/* 739 */         temp.add((String)((Map)group.get(i)).get("GROUP"));
/*     */       }
/*     */     }
/*     */     
/* 743 */     for (int i = 0; i < temp.size(); i++)
/*     */     {
/* 745 */       int count = 0;
/*     */       
/* 747 */       for (int j = 0; j < user.size(); j++)
/*     */       {
/* 749 */         if (((String)temp.get(i)).equals(((Map)user.get(j)).get("GROUP")))
/*     */         {
/* 751 */           count++;
/*     */         }
/*     */       }
/*     */       
/* 755 */       root.add(new DefaultMutableTreeNode((String)temp.get(i) + " " + count));
/*     */     }
/*     */     
/* 758 */     root.setUserObject("전체  " + user.size());
/*     */     
/* 760 */     expandAll(tree);
/*     */     
/* 762 */     dtm.reload();
/*     */   }
/*     */   
/*     */   public static void expandAll(JTree tree)
/*     */   {
/* 767 */     TreeNode root = (TreeNode)tree.getModel().getRoot();
/* 768 */     expandAll(tree, new TreePath(root));
/*     */   }
/*     */   
/*     */   private static void expandAll(JTree tree, TreePath parent)
/*     */   {
/* 773 */     TreeNode node = (TreeNode)parent.getLastPathComponent();
/* 774 */     if (node.getChildCount() >= 0) {
/* 775 */       for (Enumeration e = node.children(); e.hasMoreElements();) {
/* 776 */         TreeNode n = (TreeNode)e.nextElement();
/* 777 */         TreePath path = parent.pathByAddingChild(n);
/* 778 */         expandAll(tree, path);
/*     */       }
/*     */     }
/* 781 */     tree.expandPath(parent);
/*     */   }
/*     */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\TreePanel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */