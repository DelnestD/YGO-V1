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
public class FourPlayer extends javax.swing.JFrame {

    /**
     * Creates new form Ygo2
     */
	private Player player1;
	private Player player2;
	private Player player3;
	private Player player4;
	private int lp1,lp2,lp3,lp4,sous,mons,add,res;
    public FourPlayer(Player p1,Player p2,Player p3,Player p4) {
    	this.player1 = p1;
        this.player2 = p2;
        this.player3 = p3;
        this.player4 = p4;
        lp1=player1.getLifePoint();
        lp2=player2.getLifePoint();
        lp3=player3.getLifePoint();
        lp4=player4.getLifePoint();
        initComponents();
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        pName4 = new javax.swing.JLabel();
        pLifePoint4 = new javax.swing.JLabel();
        soustraction4 = new javax.swing.JTextField();
        monster4 = new javax.swing.JTextField();
        addition4 = new javax.swing.JTextField();
        labelAddition4 = new javax.swing.JLabel();
        labelMonster4 = new javax.swing.JLabel();
        labelSoustraction4 = new javax.swing.JLabel();
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
        pLifePoint5 = new javax.swing.JLabel();
        pName5 = new javax.swing.JLabel();
        soustraction5 = new javax.swing.JTextField();
        monster5 = new javax.swing.JTextField();
        addition5 = new javax.swing.JTextField();
        labelAddition5 = new javax.swing.JLabel();
        labelMonster5 = new javax.swing.JLabel();
        labelSoustraction5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        pName4.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        pName4.setText("Player 3");

        pLifePoint4.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        pLifePoint4.setText("life - point");

        soustraction4.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        soustraction4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        soustraction4.setText("0");

        monster4.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        monster4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        monster4.setText("0");

        addition4.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        addition4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        addition4.setText("0");

        labelAddition4.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        labelAddition4.setText("+");

        labelMonster4.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        labelMonster4.setText("Monster");

        labelSoustraction4.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        labelSoustraction4.setText("-");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pName1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        pName1.setText("Player 1");

        soustraction1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        soustraction1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        soustraction1.setText("0");

        pLifePoint1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        pLifePoint1.setText("life - point");

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

        pName2.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        pName2.setText("Player 2");

        pLifePoint2.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        pLifePoint2.setText("life - point");

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

        pName3.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        pName3.setText("Player 3");

        pLifePoint3.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        pLifePoint3.setText("life - point");

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

        pLifePoint5.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        pLifePoint5.setText("life - point");

        pName5.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        pName5.setText("Player 4");

        soustraction5.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        soustraction5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        soustraction5.setText("0");

        monster5.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        monster5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        monster5.setText("0");

        addition5.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        addition5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        addition5.setText("0");

        labelAddition5.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        labelAddition5.setText("+");

        labelMonster5.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        labelMonster5.setText("Monster");

        labelSoustraction5.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        labelSoustraction5.setText("-");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
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
                    .addComponent(soustraction2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelSoustraction5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMonster5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAddition5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addition5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monster5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pLifePoint5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pName5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soustraction5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(validation)
                .addGap(354, 354, 354))
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
                            .addComponent(labelAddition3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pName5)
                        .addGap(39, 39, 39)
                        .addComponent(pLifePoint5)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(soustraction5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelSoustraction5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(monster5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMonster5))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addition5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelAddition5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(validation)
                .addGap(24, 24, 24))
        );

        jMenu5.setText("Option");

        jMenuItem4.setText("jMenuItem4");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem4);

        jMenuItem5.setText("jMenuItem5");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem5);

        jMenuItem6.setText("jMenuItem6");
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
    }// </editor-fold>                        

    private void validationActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(FourPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FourPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FourPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FourPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField addition1;
    private javax.swing.JTextField addition2;
    private javax.swing.JTextField addition3;
    private javax.swing.JTextField addition4;
    private javax.swing.JTextField addition5;
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
    private javax.swing.JLabel labelAddition4;
    private javax.swing.JLabel labelAddition5;
    private javax.swing.JLabel labelMonster1;
    private javax.swing.JLabel labelMonster2;
    private javax.swing.JLabel labelMonster3;
    private javax.swing.JLabel labelMonster4;
    private javax.swing.JLabel labelMonster5;
    private javax.swing.JLabel labelSoustraction1;
    private javax.swing.JLabel labelSoustraction2;
    private javax.swing.JLabel labelSoustraction3;
    private javax.swing.JLabel labelSoustraction4;
    private javax.swing.JLabel labelSoustraction5;
    private javax.swing.JTextField monster1;
    private javax.swing.JTextField monster2;
    private javax.swing.JTextField monster3;
    private javax.swing.JTextField monster4;
    private javax.swing.JTextField monster5;
    private javax.swing.JLabel pLifePoint1;
    private javax.swing.JLabel pLifePoint2;
    private javax.swing.JLabel pLifePoint3;
    private javax.swing.JLabel pLifePoint4;
    private javax.swing.JLabel pLifePoint5;
    private javax.swing.JLabel pName1;
    private javax.swing.JLabel pName2;
    private javax.swing.JLabel pName3;
    private javax.swing.JLabel pName4;
    private javax.swing.JLabel pName5;
    private javax.swing.JTextField soustraction1;
    private javax.swing.JTextField soustraction2;
    private javax.swing.JTextField soustraction3;
    private javax.swing.JTextField soustraction4;
    private javax.swing.JTextField soustraction5;
    private javax.swing.JButton validation;
    // End of variables declaration                   
}
