/*     */ package Model.Dialog;
/*     */ 
/*     */ import java.awt.Dimension;
/*     */ import java.awt.Font;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.GridBagLayout;
/*     */ import java.awt.Insets;
/*     */ import java.io.BufferedReader;
/*     */ import java.io.BufferedWriter;
/*     */ import java.io.File;
/*     */ import java.io.FileReader;
/*     */ import java.io.FileWriter;
/*     */ import java.io.IOException;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Date;
/*     */ import java.util.Locale;
/*     */ import javax.swing.JDialog;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JScrollPane;
/*     */ import javax.swing.JTextArea;
/*     */ 
/*     */ 
/*     */ public class Server_Log_Di
/*     */   extends JDialog
/*     */ {
/*  26 */   private static SimpleDateFormat format_for_log = new SimpleDateFormat("a hh:mm:ss", Locale.KOREA);
/*  27 */   private SimpleDateFormat format_for_timer = new SimpleDateFormat("yyyy년 MM월 dd일 a hh시 mm분 ss초", Locale.KOREA);
/*  28 */   private static SimpleDateFormat format_for_txt = new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA);
/*     */   
/*     */ 
/*  31 */   private GridBagLayout gbl = new GridBagLayout();
/*  32 */   private GridBagConstraints gbc = new GridBagConstraints();
/*     */   
/*     */ 
/*  35 */   private JLabel title_ll = new JLabel();
/*  36 */   private JLabel time_ll = new JLabel();
/*     */   
/*  38 */   private static JTextArea log_ta = new JTextArea();
/*  39 */   private JScrollPane scroll = new JScrollPane(log_ta);
/*     */   
/*     */   public Server_Log_Di()
/*     */     throws IOException
/*     */   {
/*  44 */     setPreferredSize(new Dimension(700, 800));
/*  45 */     setMinimumSize(new Dimension(700, 800));
/*  46 */     setMaximumSize(new Dimension(700, 800));
/*  47 */     setLocationRelativeTo(null);
/*  48 */     setAlwaysOnTop(true);
/*     */     
/*     */ 
/*  51 */     setLayout(this.gbl);
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*  56 */     this.title_ll.setText("JDU Welfare");
/*  57 */     this.title_ll.setFont(new Font("나눔바른고딕", 1, 35));
/*     */     
/*     */ 
/*  60 */     this.time_ll.setFont(new Font("나눔바른고딕", 0, 20));
/*     */     
/*     */ 
/*     */ 
/*  64 */     log_ta.setEditable(false);
/*  65 */     log_ta.setFont(new Font("나눔바른고딕", 0, 18));
/*     */     
/*  67 */     this.scroll.setVerticalScrollBarPolicy(22);
/*  68 */     this.scroll.setHorizontalScrollBarPolicy(30);
/*     */     
/*     */ 
/*     */ 
/*  72 */     this.gbc.anchor = 11;
/*  73 */     this.gbc.fill = 1;
/*     */     
/*  75 */     this.gbc.gridx = 0;
/*  76 */     this.gbc.gridy = 0;
/*  77 */     this.gbc.gridwidth = 1;
/*  78 */     this.gbc.gridheight = 1;
/*  79 */     this.gbc.weightx = 1.0D;
/*  80 */     this.gbc.weighty = 0.1D;
/*  81 */     this.gbc.insets = new Insets(0, 30, 0, 0);
/*  82 */     add(this.title_ll, this.gbc);
/*     */     
/*  84 */     this.gbc.gridx = 0;
/*  85 */     this.gbc.gridy = 1;
/*  86 */     add(this.time_ll, this.gbc);
/*     */     
/*  88 */     this.gbc.gridx = 0;
/*  89 */     this.gbc.gridy = 2;
/*  90 */     this.gbc.weighty = 0.8D;
/*  91 */     this.gbc.insets = new Insets(10, 10, 10, 10);
/*  92 */     add(this.scroll, this.gbc);
/*     */     
/*  94 */     pack();
/*     */     
/*  96 */     new Util_Create_Log_Cl(null).start();
/*     */   }
/*     */   
/*     */   public void setTime()
/*     */   {
/* 101 */     Date time = new Date();
/*     */     
/* 103 */     String time_str = this.format_for_timer.format(time);
/* 104 */     this.time_ll.setText(time_str);
/*     */   }
/*     */   
/*     */   public static void appendLog(String log)
/*     */   {
/* 109 */     Date time = new Date();
/*     */     
/* 111 */     String time_str = format_for_log.format(time);
/* 112 */     log_ta.append("[ " + time_str + " ] " + log + "\n");
/*     */   }
/*     */   
/*     */   public static void loadLog()
/*     */     throws IOException
/*     */   {
/* 118 */     String path = "C:\\JDU\\";
/* 119 */     String fileName = "";
/*     */     
/* 121 */     Date time = new Date();
/*     */     
/* 123 */     fileName = format_for_txt.format(time);
/*     */     
/* 125 */     File file = new File(path + fileName + ".txt");
/*     */     
/* 127 */     if (!file.exists())
/*     */     {
/* 129 */       new Util_Create_Log_Cl(null).start();
/*     */     }
/*     */     else
/*     */     {
/* 133 */       BufferedReader buf = new BufferedReader(new FileReader(file));
/*     */       
/*     */       String line;
/*     */       
/* 137 */       while ((line = buf.readLine()) != null) {
/*     */         String line;
/* 139 */         log_ta.append(line + "\n");
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private static class Util_Create_Log_Cl
/*     */     extends Thread
/*     */   {
/* 147 */     String path = "C:\\JDU\\";
/* 148 */     String fileName = "";
/*     */     
/*     */     public void run()
/*     */     {
/*     */       try
/*     */       {
/*     */         for (;;)
/*     */         {
/* 156 */           Date time = new Date();
/*     */           
/* 158 */           this.fileName = Server_Log_Di.format_for_txt.format(time);
/*     */           
/* 160 */           File file = new File(this.path + this.fileName + ".txt");
/*     */           
/* 162 */           if (!file.exists())
/*     */           {
/* 164 */             file.getParentFile().mkdirs();
/*     */           }
/*     */           
/* 167 */           BufferedWriter buf = new BufferedWriter(new FileWriter(file, false));
/*     */           
/* 169 */           buf.write(Server_Log_Di.log_ta.getText());
/* 170 */           buf.flush();
/*     */           
/* 172 */           buf.close();
/*     */           
/* 174 */           Thread.sleep(10000L);
/*     */         }
/*     */       }
/*     */       catch (Throwable e)
/*     */       {
/* 179 */         e.printStackTrace();
/* 180 */         System.exit(1);
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Server_Log_Di.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */