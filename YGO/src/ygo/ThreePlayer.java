/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ygo;

/**
 *
 * @author Teller2602
 */
@SuppressWarnings("serial")
public class ThreePlayer extends javax.swing.JFrame {

    /**
     * Creates new form Ygo2
     */
    public ThreePlayer(String p1,String p2,String p3,int lp) {
    	this.lpStart = lp;
        initComponents(p1,p2,p3);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */                     
    private void initComponents(String p1,String p2,String p3) {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        pName1 = new javax.swing.JLabel();
        soustraction1 = new javax.swing.JTextField();
        pLifePoint1 = new javax.swing.JLabel();
        monster1 = new javax.swing.JTextField();
        addition1 = new javax.swing.JTextField();
        labelSoustraction1 = new javax.swing.JLabel();
        labelMonster1 = new javax.swing.JLabel();
        labelAddition1 = new javax.swing.JLabel();
        pName2 = new javax.swing.JLabel();
        pLifePoint2 = new javax.swing.JLabel();
        soustraction2 = new javax.swing.JTextField();
        monster2 = new javax.swing.JTextField();
        addition2 = new javax.swing.JTextField();
        labelAddition2 = new javax.swing.JLabel();
        labelMonster2 = new javax.swing.JLabel();
        labelSoustraction2 = new javax.swing.JLabel();
        validation = new javax.swing.JButton();
        pName3 = new javax.swing.JLabel();
        pLifePoint3 = new javax.swing.JLabel();
        soustraction3 = new javax.swing.JTextField();
        monster3 = new javax.swing.JTextField();
        addition3 = new javax.swing.JTextField();
        labelAddition3 = new javax.swing.JLabel();
        labelMonster3 = new javax.swing.JLabel();
        labelSoustraction3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");
        player(p1,p2,p3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        soustraction1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        soustraction1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        soustraction1.setText("0");

        pLifePoint1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N

        monster1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        monster1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        monster1.setText("0");

        addition1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        addition1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        addition1.setText("0");

        labelSoustraction1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        labelSoustraction1.setText("-");

        labelMonster1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        labelMonster1.setText("Monster");

        labelAddition1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        labelAddition1.setText("+");

        pLifePoint2.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N

        soustraction2.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        soustraction2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        soustraction2.setText("0");

        monster2.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        monster2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        monster2.setText("0");

        addition2.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        addition2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        addition2.setText("0");

        labelAddition2.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        labelAddition2.setText("+");

        labelMonster2.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        labelMonster2.setText("Monster");

        labelSoustraction2.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        labelSoustraction2.setText("-");

        validation.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        validation.setText("Validation");
        validation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validationActionPerformed(evt);
            }
        });

        pLifePoint3.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N

        soustraction3.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        soustraction3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        soustraction3.setText("0");

        monster3.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        monster3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        monster3.setText("0");

        addition3.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        addition3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        addition3.setText("0");

        labelAddition3.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        labelAddition3.setText("+");

        labelMonster3.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        labelMonster3.setText("Monster");

        labelSoustraction3.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        labelSoustraction3.setText("-");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(validation)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelSoustraction1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMonster1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelAddition1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addition1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(monster1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pLifePoint1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pName1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(soustraction1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelSoustraction2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMonster2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelAddition2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addition2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(monster2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pLifePoint2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pName2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(soustraction2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelSoustraction3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMonster3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAddition3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addition3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monster3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pLifePoint3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pName3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soustraction3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pName2)
                        .addGap(39, 39, 39)
                        .addComponent(pLifePoint2)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(soustraction2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelSoustraction2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(monster2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMonster2))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addition2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelAddition2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pName1)
                        .addGap(39, 39, 39)
                        .addComponent(pLifePoint1)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(soustraction1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelSoustraction1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(monster1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMonster1))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addition1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelAddition1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pName3)
                        .addGap(39, 39, 39)
                        .addComponent(pLifePoint3)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(soustraction3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelSoustraction3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(monster3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMonster3))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addition3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelAddition3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(validation)
                .addGap(21, 21, 21))
        );

        jMenu5.setText("Option");

        jMenuItem4.setText("Return");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem4);

        jMenuItem5.setText("Restart");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem5);

        jMenuItem6.setText("Start Player");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem6);

        jMenuBar1.add(jMenu5);

        jMenu1.setText("Effect");

        jMenuItem2.setText("Dice");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Coin");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        this.setVisible(true);
    }// </editor-fold>                        

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    	@SuppressWarnings("unused")
		Ygo yugioh = new Ygo();
    	this.dispose();
    }  
    
    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    	player(player1.getName(),player2.getName(),player3.getName());
    	this.repaint();
    }    
    
    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    	res = (int) (Math.random()*3+1);
    	if(res == 1) {
    		pName1.setFont(new java.awt.Font("Tahoma", 3, 18));
    		pName2.setFont(new java.awt.Font("Tahoma", 2, 18));
    		pName3.setFont(new java.awt.Font("Tahoma", 2, 18));
    	}else if(res == 2){
    		pName1.setFont(new java.awt.Font("Tahoma", 2, 18));
    		pName2.setFont(new java.awt.Font("Tahoma", 3, 18));
    		pName3.setFont(new java.awt.Font("Tahoma", 2, 18));
    	}else {
    		pName1.setFont(new java.awt.Font("Tahoma", 2, 18));
    		pName2.setFont(new java.awt.Font("Tahoma", 2, 18));
    		pName3.setFont(new java.awt.Font("Tahoma", 3, 18));
    	}
    	this.repaint();
    }    
    
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    	@SuppressWarnings("unused")
		Dice dice = new Dice();
    }      
    
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    	@SuppressWarnings("unused")
		Coin coin = new Coin();
    }                                          

    private void validationActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    	changeLP1();
    	changeLP2();
    	changeLP3();
    	if(player1.getLifePoint()<=0) {
    		@SuppressWarnings("unused")
			Winner win = new Winner(player1.getName());
    	}else if(player2.getLifePoint()<=0) {
    		@SuppressWarnings("unused")
			Winner win2 = new Winner(player2.getName());
    	}else if(player3.getLifePoint()<=0) {
    		@SuppressWarnings("unused")
			Winner win3 = new Winner(player3.getName());
    	}
    }
    private void changeLP1() {
    	sous = Integer.parseInt(soustraction1.getText());
    	add = Integer.parseInt(addition1.getText());
        if(sous>0) {
        	mons = Integer.parseInt(monster1.getText());
        	if(mons>0) {
        		player1.soustraction(sous, mons);
        	}else if(mons == 0){
        		player1.soustraction(sous);
        	}
        }
    	if(add>0) {
    		player1.addition(add);
    	}
        pLifePoint1.setText(String.valueOf(player1.getLifePoint()));
		soustraction1.setText("0");
		monster1.setText("0");
		addition1.setText("0");
		this.repaint();
    }
    private void changeLP2() {
    	sous = Integer.parseInt(soustraction2.getText());
    	add = Integer.parseInt(addition2.getText());
        if(sous>0) {
        	mons = Integer.parseInt(monster2.getText());
        	if(mons>0) {
        		player2.soustraction(sous, mons);
        	}else if(mons == 0){
        		player2.soustraction(sous);
        	}
        }
    	if(add>0) {
    		player2.addition(add);
    	}
        pLifePoint2.setText(String.valueOf(player2.getLifePoint()));
		soustraction2.setText("0");
		monster2.setText("0");
		addition2.setText("0");
		this.repaint();
    }                                         
    private void changeLP3() {
    	sous = Integer.parseInt(soustraction3.getText());
    	add = Integer.parseInt(addition3.getText());
        if(sous>0) {
        	mons = Integer.parseInt(monster3.getText());
        	if(mons>0) {
        		player3.soustraction(sous, mons);
        	}else if(mons == 0){
        		player3.soustraction(sous);
        	}
        }
    	if(add>0) {
    		player3.addition(add);
    	}
        pLifePoint3.setText(String.valueOf(player3.getLifePoint()));
		soustraction3.setText("0");
		monster3.setText("0");
		addition3.setText("0");
		this.repaint();
    } 
    private void player(String p1,String p2,String p3) {
        player1 = new Player(p1,lpStart);
    	player2 = new Player(p2,lpStart);
    	player3 = new Player(p3,lpStart);
    	pName1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        pName1.setText(player1.getName());
        pName2.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
    	pName2.setText(player2.getName());
    	pName3.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
    	pName3.setText(player3.getName());
    	pLifePoint1.setText(String.valueOf(player1.getLifePoint()));
    	pLifePoint2.setText(String.valueOf(player2.getLifePoint()));
    	pLifePoint3.setText(String.valueOf(player3.getLifePoint()));
    	
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ThreePlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThreePlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThreePlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThreePlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField addition1;
    private javax.swing.JTextField addition2;
    private javax.swing.JTextField addition3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelAddition1;
    private javax.swing.JLabel labelAddition2;
    private javax.swing.JLabel labelAddition3;
    private javax.swing.JLabel labelMonster1;
    private javax.swing.JLabel labelMonster2;
    private javax.swing.JLabel labelMonster3;
    private javax.swing.JLabel labelSoustraction1;
    private javax.swing.JLabel labelSoustraction2;
    private javax.swing.JLabel labelSoustraction3;
    private javax.swing.JTextField monster1;
    private javax.swing.JTextField monster2;
    private javax.swing.JTextField monster3;
    private javax.swing.JLabel pLifePoint1;
    private javax.swing.JLabel pLifePoint2;
    private javax.swing.JLabel pLifePoint3;
    private javax.swing.JLabel pName1;
    private javax.swing.JLabel pName2;
    private javax.swing.JLabel pName3;
    private javax.swing.JTextField soustraction1;
    private javax.swing.JTextField soustraction2;
    private javax.swing.JTextField soustraction3;
    private javax.swing.JButton validation;
    private Player player1;
	private Player player2;
	private Player player3;
	private int lpStart,sous,mons,add,res;
    // End of variables declaration                   
}
