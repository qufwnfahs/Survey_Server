/*     */ package Model.Dialog;
/*     */ 
/*     */ import Enum.Enum_Font_Ci;
/*     */ import Model.Dialog.Survey_List.Module_Option;
/*     */ import java.awt.Color;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.GridBagLayout;
/*     */ import java.awt.Insets;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.JLabel;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class Panel_Client_Response
/*     */   extends JPanel
/*     */ {
/* 340 */   private GridBagLayout gbl = new GridBagLayout();
/* 341 */   private GridBagConstraints gbc = new GridBagConstraints();
/*     */   
/* 343 */   private String type = "";
/*     */   
/* 345 */   private JLabel ll_name = new JLabel();
/* 346 */   private JLabel ll_count = new JLabel();
/*     */   
/* 348 */   public String getType() { return this.type; }
/*     */   
/*     */   public Panel_Client_Response(String type)
/*     */   {
/* 352 */     this.type = type;
/*     */     
/* 354 */     setLayout(this.gbl);
/* 355 */     setBackground(Color.WHITE);
/* 356 */     setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(224, 224, 224)));
/*     */     
/* 358 */     this.ll_name.setOpaque(false);
/* 359 */     this.ll_name.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.BLACK), BorderFactory.createEmptyBorder(0, 0, 10, 0)));
/* 360 */     this.ll_name.setFont(Enum_Font_Ci.나눔바른고딕25.getFont());
/*     */     
/* 362 */     this.ll_count.setOpaque(false);
/* 363 */     this.ll_count.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.BLACK), BorderFactory.createEmptyBorder(0, 0, 10, 0)));
/* 364 */     this.ll_count.setFont(Enum_Font_Ci.나눔바른고딕20.getFont());
/* 365 */     this.ll_count.setForeground(Color.GRAY);
/*     */     String str;
/* 367 */     switch ((str = type).hashCode()) {case -2018804923:  if (str.equals("Linear")) {} break; case -768855440:  if (str.equals("OpenEnded")) break; break; case -368370607:  if (str.equals("DropDown")) {} break; case 175599017:  if (str.equals("CheckBoxGrid")) {} break; case 718473776:  if (str.equals("Multiple")) {} break; case 1033354689:  if (str.equals("RadioGrid")) {} break; case 1601505219:  if (!str.equals("CheckBox"))
/*     */       {
/* 369 */         return;this.gbc.anchor = 11;
/* 370 */         this.gbc.fill = 2;
/*     */         
/* 372 */         this.gbc.gridx = 0;
/* 373 */         this.gbc.gridy = 0;
/* 374 */         this.gbc.gridwidth = 1;
/* 375 */         this.gbc.gridheight = 1;
/* 376 */         this.gbc.weightx = 1.0D;
/* 377 */         this.gbc.weighty = 0.1D;
/* 378 */         this.gbc.insets = new Insets(30, 30, 0, 30);
/* 379 */         add(this.ll_name, this.gbc);
/*     */         
/* 381 */         this.gbc.gridx = 0;
/* 382 */         this.gbc.gridy = 1;
/* 383 */         this.gbc.weightx = 1.0D;
/* 384 */         this.gbc.insets = new Insets(0, 30, 20, 30);
/* 385 */         add(this.ll_count, this.gbc);
/* 386 */         return;
/* 387 */         this.gbc.anchor = 11;
/* 388 */         this.gbc.fill = 2;
/*     */         
/* 390 */         this.gbc.gridx = 0;
/* 391 */         this.gbc.gridy = 0;
/* 392 */         this.gbc.gridwidth = 1;
/* 393 */         this.gbc.gridheight = 1;
/* 394 */         this.gbc.weightx = 1.0D;
/* 395 */         this.gbc.weighty = 0.1D;
/* 396 */         this.gbc.insets = new Insets(30, 30, 0, 30);
/* 397 */         add(this.ll_name, this.gbc);
/*     */         
/* 399 */         this.gbc.gridx = 0;
/* 400 */         this.gbc.gridy = 1;
/* 401 */         this.gbc.weightx = 1.0D;
/* 402 */         this.gbc.insets = new Insets(-25, 30, 20, 30);
/* 403 */         add(this.ll_count, this.gbc);
/*     */       } else {
/* 405 */         this.gbc.anchor = 17;
/* 406 */         this.gbc.fill = 2;
/*     */         
/* 408 */         this.gbc.gridx = 0;
/* 409 */         this.gbc.gridy = 0;
/* 410 */         this.gbc.gridwidth = 1;
/* 411 */         this.gbc.gridheight = 1;
/* 412 */         this.gbc.weightx = 1.0D;
/* 413 */         this.gbc.weighty = 0.1D;
/* 414 */         this.gbc.insets = new Insets(30, 30, 0, 30);
/* 415 */         add(this.ll_name, this.gbc);
/*     */         
/* 417 */         this.gbc.gridx = 0;
/* 418 */         this.gbc.gridy = 1;
/* 419 */         this.gbc.weightx = 1.0D;
/* 420 */         this.gbc.insets = new Insets(-25, 30, 20, 30);
/* 421 */         add(this.ll_count, this.gbc);
/* 422 */         return;
/* 423 */         this.gbc.anchor = 11;
/* 424 */         this.gbc.fill = 2;
/*     */         
/* 426 */         this.gbc.gridx = 0;
/* 427 */         this.gbc.gridy = 0;
/* 428 */         this.gbc.gridwidth = 1;
/* 429 */         this.gbc.gridheight = 1;
/* 430 */         this.gbc.weightx = 1.0D;
/* 431 */         this.gbc.weighty = 0.1D;
/* 432 */         this.gbc.insets = new Insets(30, 30, 0, 30);
/* 433 */         add(this.ll_name, this.gbc);
/*     */         
/* 435 */         this.gbc.gridx = 0;
/* 436 */         this.gbc.gridy = 1;
/* 437 */         this.gbc.weightx = 1.0D;
/* 438 */         this.gbc.insets = new Insets(-25, 30, 20, 30);
/* 439 */         add(this.ll_count, this.gbc);
/* 440 */         return;
/* 441 */         this.gbc.anchor = 11;
/* 442 */         this.gbc.fill = 2;
/*     */         
/* 444 */         this.gbc.gridx = 0;
/* 445 */         this.gbc.gridy = 0;
/* 446 */         this.gbc.gridwidth = 1;
/* 447 */         this.gbc.gridheight = 1;
/* 448 */         this.gbc.weightx = 1.0D;
/* 449 */         this.gbc.weighty = 0.1D;
/* 450 */         this.gbc.insets = new Insets(30, 30, 0, 30);
/* 451 */         add(this.ll_name, this.gbc);
/*     */         
/* 453 */         this.gbc.gridx = 0;
/* 454 */         this.gbc.gridy = 1;
/* 455 */         this.gbc.weightx = 1.0D;
/* 456 */         this.gbc.insets = new Insets(-25, 30, 20, 30);
/* 457 */         add(this.ll_count, this.gbc);
/* 458 */         return;
/* 459 */         this.gbc.anchor = 11;
/* 460 */         this.gbc.fill = 2;
/*     */         
/* 462 */         this.gbc.gridx = 0;
/* 463 */         this.gbc.gridy = 0;
/* 464 */         this.gbc.gridwidth = 1;
/* 465 */         this.gbc.gridheight = 1;
/* 466 */         this.gbc.weightx = 1.0D;
/* 467 */         this.gbc.weighty = 0.1D;
/* 468 */         this.gbc.insets = new Insets(30, 30, 0, 30);
/* 469 */         add(this.ll_name, this.gbc);
/*     */         
/* 471 */         this.gbc.gridx = 0;
/* 472 */         this.gbc.gridy = 1;
/* 473 */         this.gbc.weightx = 1.0D;
/* 474 */         this.gbc.insets = new Insets(-25, 30, 20, 30);
/* 475 */         add(this.ll_count, this.gbc);
/* 476 */         return;
/* 477 */         this.gbc.anchor = 11;
/* 478 */         this.gbc.fill = 2;
/*     */         
/* 480 */         this.gbc.gridx = 0;
/* 481 */         this.gbc.gridy = 0;
/* 482 */         this.gbc.gridwidth = 1;
/* 483 */         this.gbc.gridheight = 1;
/* 484 */         this.gbc.weightx = 1.0D;
/* 485 */         this.gbc.weighty = 0.1D;
/* 486 */         this.gbc.insets = new Insets(30, 30, 0, 30);
/* 487 */         add(this.ll_name, this.gbc);
/*     */         
/* 489 */         this.gbc.gridx = 0;
/* 490 */         this.gbc.gridy = 1;
/* 491 */         this.gbc.weightx = 1.0D;
/* 492 */         this.gbc.insets = new Insets(-25, 30, 20, 30);
/* 493 */         add(this.ll_count, this.gbc);
/*     */       }
/*     */       break; }
/*     */   }
/*     */   
/*     */   public void setLabel(String type, String name, Map<String, Map<String, String>> map, List<Module_Option> lt_opt, String mainColor) {
/*     */     String str1;
/* 500 */     switch ((str1 = type).hashCode()) {case -2018804923:  if (str1.equals("Linear")) {} break; case -768855440:  if (str1.equals("OpenEnded")) break; break; case -368370607:  if (str1.equals("DropDown")) {} break; case 175599017:  if (str1.equals("CheckBoxGrid")) {} break; case 718473776:  if (str1.equals("Multiple")) {} break; case 1033354689:  if (str1.equals("RadioGrid")) {} break; case 1601505219:  if (!str1.equals("CheckBox"))
/*     */       {
/* 502 */         return;this.ll_name.setText(name);
/* 503 */         this.ll_count.setText("응답 " + map.size() + "개");
/* 504 */         setPreferredSize(new Dimension(970, 220 + map.size() * 35));
/*     */         
/* 506 */         this.gbc.anchor = 11;
/* 507 */         this.gbc.fill = 2;
/*     */         Iterator<String> keys;
/* 509 */         for (Iterator localIterator1 = map.keySet().iterator(); localIterator1.hasNext(); 
/*     */             
/*     */ 
/*     */ 
/* 513 */             keys.hasNext())
/*     */         {
/* 509 */           String key = (String)localIterator1.next();
/*     */           
/* 511 */           keys = ((Map)map.get(key)).keySet().iterator();
/*     */           
/* 513 */           continue;
/*     */           
/* 515 */           String key_b = (String)keys.next();
/*     */           
/* 517 */           JLabel ll_r = new JLabel();
/* 518 */           ll_r.setText((String)((Map)map.get(key)).get(key_b));
/* 519 */           ll_r.setFont(Enum_Font_Ci.나눔바른고딕20.getFont());
/* 520 */           ll_r.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK), BorderFactory.createEmptyBorder(10, 10, 10, 10)));
/*     */           
/* 522 */           this.gbc.gridy += 1;
/* 523 */           this.gbc.weighty = (0.8D / map.size());
/*     */           
/* 525 */           this.gbc.insets = new Insets(0, 50, 0, 50);
/*     */           
/* 527 */           add(ll_r, this.gbc);
/*     */         }
/*     */         
/* 530 */         return;
/* 531 */         this.ll_name.setText(name);
/* 532 */         this.ll_count.setText("응답 " + map.size() + "개");
/*     */         
/* 534 */         String[] itemName = new String[lt_opt.size()];
/* 535 */         int[] data = new int[itemName.length];
/* 536 */         int[] arcAngle = new int[data.length];
/* 537 */         int sum = 0;
/*     */         
/*     */ 
/* 540 */         for (int i = 0; i < lt_opt.size(); i++)
/*     */         {
/* 542 */           itemName[i] = ((Module_Option)lt_opt.get(i)).getName();
/*     */         }
/*     */         int i;
/* 545 */         for (Iterator localIterator2 = map.keySet().iterator(); localIterator2.hasNext(); 
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 550 */             i < itemName.length)
/*     */         {
/* 545 */           String key = (String)localIterator2.next();
/*     */           
/* 547 */           Object[] itCountName = ((Map)map.get(key)).values().toArray();
/*     */           
/*     */ 
/* 550 */           i = 0; continue;
/*     */           
/* 552 */           for (int j = 0; j < itCountName.length; j++)
/*     */           {
/* 554 */             if (itemName[i].equals(itCountName[j]))
/*     */             {
/* 556 */               data[i] += 1;
/*     */             }
/*     */           }
/* 550 */           i++;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 562 */         for (int i = 0; i < data.length; i++)
/*     */         {
/*     */ 
/* 565 */           sum += data[i];
/*     */         }
/*     */         
/* 568 */         for (int i = 0; i < data.length; i++)
/*     */         {
/* 570 */           arcAngle[i] = (360 * data[i] / sum);
/*     */         }
/*     */         
/* 573 */         setPreferredSize(new Dimension(970, 400 + 25 * data.length));
/*     */         
/* 575 */         this.gbc.anchor = 11;
/* 576 */         this.gbc.fill = 1;
/*     */         
/* 578 */         this.gbc.gridy += 1;
/* 579 */         this.gbc.weighty = 0.8D;
/* 580 */         this.gbc.insets = new Insets(0, 0, 60, 0);
/*     */         
/* 582 */         add(new ChartPanel(itemName, data, arcAngle), this.gbc);
/*     */       } else {
/* 584 */         this.ll_name.setText(name);
/* 585 */         this.ll_count.setText("응답 " + map.size() + "개");
/*     */         
/* 587 */         String[] itemName_box = new String[lt_opt.size()];
/* 588 */         int[] data_box = new int[itemName_box.length];
/* 589 */         int[] arcAngle_box = new int[data_box.length];
/* 590 */         int sum_box = 0;
/*     */         
/*     */ 
/* 593 */         for (int i = 0; i < lt_opt.size(); i++)
/*     */         {
/* 595 */           itemName_box[i] = ((Module_Option)lt_opt.get(i)).getName();
/*     */         }
/*     */         int i;
/* 598 */         for (Iterator localIterator3 = map.keySet().iterator(); localIterator3.hasNext(); 
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 603 */             i < itemName_box.length)
/*     */         {
/* 598 */           String key = (String)localIterator3.next();
/*     */           
/* 600 */           Object[] itCountName = ((Map)map.get(key)).values().toArray();
/*     */           
/*     */ 
/* 603 */           i = 0; continue;
/*     */           
/* 605 */           for (int j = 0; j < itCountName.length; j++)
/*     */           {
/* 607 */             if (itemName_box[i].equals(itCountName[j]))
/*     */             {
/* 609 */               data_box[i] += 1;
/*     */             }
/*     */           }
/* 603 */           i++;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 615 */         for (int i = 0; i < data_box.length; i++)
/*     */         {
/* 617 */           sum_box += data_box[i];
/*     */         }
/*     */         
/* 620 */         for (int i = 0; i < data_box.length; i++)
/*     */         {
/* 622 */           arcAngle_box[i] = (360 * data_box[i] / sum_box);
/*     */         }
/*     */         
/* 625 */         setPreferredSize(new Dimension(970, 400 + 80 * data_box.length));
/*     */         
/* 627 */         this.gbc.anchor = 11;
/* 628 */         this.gbc.fill = 1;
/*     */         
/* 630 */         this.gbc.gridy += 1;
/* 631 */         this.gbc.weighty = 0.8D;
/* 632 */         this.gbc.insets = new Insets(0, 0, 60, 0);
/*     */         
/* 634 */         add(new BoxChartPanel(new Color(Integer.valueOf(mainColor).intValue(), true), itemName_box, data_box, arcAngle_box, map.size()), this.gbc);
/* 635 */         return;
/* 636 */         this.ll_name.setText(name);
/* 637 */         this.ll_count.setText("응답 " + map.size() + "개");
/*     */         
/* 639 */         String[] itemName_drop = new String[lt_opt.size()];
/* 640 */         int[] data_drop = new int[itemName_drop.length];
/* 641 */         int[] arcAngle_drop = new int[data_drop.length];
/* 642 */         int sum_drop = 0;
/*     */         
/*     */ 
/* 645 */         for (int i = 0; i < lt_opt.size(); i++)
/*     */         {
/* 647 */           itemName_drop[i] = ((Module_Option)lt_opt.get(i)).getName();
/*     */         }
/*     */         int i;
/* 650 */         for (Iterator localIterator4 = map.keySet().iterator(); localIterator4.hasNext(); 
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 655 */             i < itemName_drop.length)
/*     */         {
/* 650 */           String key = (String)localIterator4.next();
/*     */           
/* 652 */           Object[] itCountName = ((Map)map.get(key)).values().toArray();
/*     */           
/*     */ 
/* 655 */           i = 0; continue;
/*     */           
/* 657 */           for (int j = 0; j < itCountName.length; j++)
/*     */           {
/* 659 */             if (itemName_drop[i].equals(itCountName[j]))
/*     */             {
/* 661 */               data_drop[i] += 1;
/*     */             }
/*     */           }
/* 655 */           i++;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 667 */         for (int i = 0; i < data_drop.length; i++)
/*     */         {
/* 669 */           sum_drop += data_drop[i];
/*     */         }
/*     */         
/* 672 */         for (int i = 0; i < data_drop.length; i++)
/*     */         {
/* 674 */           arcAngle_drop[i] = (360 * data_drop[i] / sum_drop);
/*     */         }
/*     */         
/* 677 */         setPreferredSize(new Dimension(970, 400 + 25 * data_drop.length));
/*     */         
/* 679 */         this.gbc.anchor = 11;
/* 680 */         this.gbc.fill = 1;
/*     */         
/* 682 */         this.gbc.gridy += 1;
/* 683 */         this.gbc.weighty = 0.8D;
/* 684 */         this.gbc.insets = new Insets(0, 0, 60, 0);
/*     */         
/* 686 */         add(new ChartPanel(itemName_drop, data_drop, arcAngle_drop), this.gbc);
/* 687 */         return;
/* 688 */         this.ll_name.setText(name);
/* 689 */         this.ll_count.setText("응답 " + map.size() + "개");
/*     */         
/* 691 */         int n1 = Integer.valueOf(((Module_Option)lt_opt.get(0)).getNumber()).intValue();
/* 692 */         int n2 = Integer.valueOf(((Module_Option)lt_opt.get(1)).getNumber()).intValue();
/*     */         
/* 694 */         String left = ((Module_Option)lt_opt.get(0)).getName();
/* 695 */         String right = ((Module_Option)lt_opt.get(1)).getName();
/*     */         
/* 697 */         String[] itemName_l = new String[n2];
/* 698 */         int[] data_l = new int[itemName_l.length];
/* 699 */         int[] arcAngle_l = new int[data_l.length];
/* 700 */         int sum_l = 0;
/*     */         
/* 702 */         for (int i = 0; i < itemName_l.length; i++)
/*     */         {
/* 704 */           itemName_l[i] = (n1++);
/*     */         }
/*     */         int i;
/* 707 */         for (Iterator localIterator5 = map.keySet().iterator(); localIterator5.hasNext(); 
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 712 */             i < itemName_l.length)
/*     */         {
/* 707 */           String key = (String)localIterator5.next();
/*     */           
/* 709 */           Object[] itCountName = ((Map)map.get(key)).values().toArray();
/*     */           
/*     */ 
/* 712 */           i = 0; continue;
/*     */           
/* 714 */           for (j = 0; j < itCountName.length; j++)
/*     */           {
/* 716 */             if (itemName_l[i].equals(itCountName[j]))
/*     */             {
/* 718 */               data_l[i] += 1;
/*     */             }
/*     */           }
/* 712 */           i++;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 723 */         setPreferredSize(new Dimension(970, 760));
/*     */         
/* 725 */         this.gbc.anchor = 11;
/* 726 */         this.gbc.fill = 1;
/*     */         
/* 728 */         this.gbc.gridy += 1;
/* 729 */         this.gbc.weighty = 0.8D;
/* 730 */         this.gbc.insets = new Insets(0, 0, 60, 0);
/*     */         
/* 732 */         add(new LinearChartPanel(new Color(Integer.valueOf(mainColor).intValue(), true), itemName_l, data_l, left, right, map.size()), this.gbc);
/* 733 */         return;
/* 734 */         this.ll_name.setText(name);
/* 735 */         this.ll_count.setText("응답 " + map.size() + "개");
/*     */         
/* 737 */         List<String> lt_row = new ArrayList();
/* 738 */         Object lt_col = new ArrayList();
/*     */         
/* 740 */         for (int i = 0; i < lt_opt.size(); i++)
/*     */         {
/* 742 */           if (((Module_Option)lt_opt.get(i)).getNumber().contains("r"))
/*     */           {
/* 744 */             lt_row.add(((Module_Option)lt_opt.get(i)).getName());
/*     */           }
/* 746 */           else if (((Module_Option)lt_opt.get(i)).getNumber().contains("c"))
/*     */           {
/* 748 */             ((List)lt_col).add(((Module_Option)lt_opt.get(i)).getName());
/*     */           }
/*     */         }
/*     */         
/* 752 */         int[][] data_r = new int[lt_row.size()][((List)lt_col).size()];
/*     */         Object[] itCountName;
/* 754 */         int i; for (int j = map.keySet().iterator(); j.hasNext(); 
/*     */             
/*     */ 
/*     */ 
/* 758 */             i < itCountName.length)
/*     */         {
/* 754 */           String key = (String)j.next();
/*     */           
/* 756 */           itCountName = ((Map)map.get(key)).values().toArray();
/*     */           
/* 758 */           i = 0; continue;
/*     */           
/* 760 */           val = Integer.valueOf(String.valueOf(itCountName[i]).replace("c", "")).intValue();
/*     */           
/* 762 */           data_r[i][val] += 1;i++;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 766 */         setPreferredSize(new Dimension(lt_row.size() * 300, 700));
/*     */         
/* 768 */         this.gbc.anchor = 11;
/* 769 */         this.gbc.fill = 1;
/*     */         
/* 771 */         this.gbc.gridy += 1;
/* 772 */         this.gbc.weighty = 0.8D;
/* 773 */         this.gbc.insets = new Insets(0, 0, 60, 0);
/*     */         
/* 775 */         add(new RadioGridChartPanel(lt_row, (List)lt_col, data_r, map.size()), this.gbc);
/* 776 */         return;
/* 777 */         this.ll_name.setText(name);
/* 778 */         this.ll_count.setText("응답 " + map.size() + "개");
/*     */         
/* 780 */         List<String> lt_row_c = new ArrayList();
/* 781 */         List<String> lt_col_c = new ArrayList();
/*     */         
/* 783 */         for (int i = 0; i < lt_opt.size(); i++)
/*     */         {
/* 785 */           if (((Module_Option)lt_opt.get(i)).getNumber().contains("r"))
/*     */           {
/* 787 */             lt_row_c.add(((Module_Option)lt_opt.get(i)).getName());
/*     */           }
/* 789 */           else if (((Module_Option)lt_opt.get(i)).getNumber().contains("c"))
/*     */           {
/* 791 */             lt_col_c.add(((Module_Option)lt_opt.get(i)).getName());
/*     */           }
/*     */         }
/*     */         
/* 795 */         int[][] data_r_c = new int[lt_row_c.size()][lt_col_c.size()];
/*     */         Iterator localIterator6;
/* 797 */         for (int val = map.keySet().iterator(); val.hasNext(); 
/*     */             
/*     */ 
/* 800 */             localIterator6.hasNext())
/*     */         {
/* 797 */           String key = (String)val.next();
/*     */           
/* 799 */           Object[] itCountName = ((Map)map.get(key)).values().toArray();
/* 800 */           localIterator6 = ((Map)map.get(key)).keySet().iterator(); continue;String key_key = (String)localIterator6.next();
/*     */           
/* 802 */           String[] arr = key_key.split("r");
/*     */           
/* 804 */           data_r_c[Integer.valueOf(arr[0]).intValue()][Integer.valueOf(arr[1]).intValue()] += 1;
/*     */         }
/*     */         
/*     */ 
/* 808 */         setPreferredSize(new Dimension(lt_row_c.size() * 300, 700));
/*     */         
/* 810 */         this.gbc.anchor = 11;
/* 811 */         this.gbc.fill = 1;
/*     */         
/* 813 */         this.gbc.gridy += 1;
/* 814 */         this.gbc.weighty = 0.8D;
/* 815 */         this.gbc.insets = new Insets(0, 0, 60, 0);
/*     */         
/* 817 */         add(new RadioGridChartPanel(lt_row_c, lt_col_c, data_r_c, map.size()), this.gbc);
/*     */       }
/*     */       break;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 서버프로그램\!\Model\Dialog\Panel_Client_Response.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */