public class Index extends javax.swing.JFrame {
    int perform = 0;
    double num1 = 0;
    double num2 = 0;
    double result = 0;
    public Index() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jtext1 = new javax.swing.JTextField();
        jButton0 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButtonequal = new javax.swing.JButton();
        jButtondivide = new javax.swing.JButton();
        jButtonmulti = new javax.swing.JButton();
        jButtonsubtract = new javax.swing.JButton();
        jButtonplus = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jButton1Exit = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        Squareroot = new javax.swing.JButton();
        square = new javax.swing.JButton();
        thirdsquare = new javax.swing.JButton();
        dotoprater = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator ");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 300));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtext1.setEditable(false);
        jtext1.setBackground(new java.awt.Color(255, 255, 255));
        jtext1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtext1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtext1.setText("  ");
        jPanel1.add(jtext1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 18, 320, 40));

        jButton0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton0.setText("0");
        jButton0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 60, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("1");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 60, 30));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("2");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 60, 30));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("3");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 60, 30));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("4");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 60, 30));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("5");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 60, 30));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("6");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 60, 30));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setText("7");
        jButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 151, 60, 30));

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setText("8");
        jButton8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 60, 30));

        jButton19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton19.setText("9");
        jButton19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 60, 30));

        jButtonequal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonequal.setText("=");
        jButtonequal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonequal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonequalActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonequal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 140, 30));

        jButtondivide.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtondivide.setText("/");
        jButtondivide.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtondivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtondivideActionPerformed(evt);
            }
        });
        jPanel1.add(jButtondivide, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 60, 30));

        jButtonmulti.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonmulti.setText("*");
        jButtonmulti.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonmulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonmultiActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonmulti, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 60, 30));

        jButtonsubtract.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonsubtract.setText("-");
        jButtonsubtract.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonsubtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsubtractActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonsubtract, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 60, 30));

        jButtonplus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonplus.setText("+");
        jButtonplus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonplusActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonplus, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 60, 30));

        jButtonReset.setBackground(new java.awt.Color(153, 153, 255));
        jButtonReset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonReset.setForeground(new java.awt.Color(0, 0, 204));
        jButtonReset.setText("Clear");
        jButtonReset.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 90, 30));

        jButton1Exit.setBackground(new java.awt.Color(255, 153, 153));
        jButton1Exit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1Exit.setForeground(new java.awt.Color(255, 51, 51));
        jButton1Exit.setText("Exit");
        jButton1Exit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ExitActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 100, 30));

        Back.setBackground(new java.awt.Color(0, 204, 204));
        Back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Back.setForeground(new java.awt.Color(102, 0, 102));
        Back.setText("Backspace");
        Back.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 90, 30));

        Squareroot.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Squareroot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconfinder_square_root_1772628.png"))); // NOI18N
        Squareroot.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Squareroot.setPreferredSize(new java.awt.Dimension(200, 200));
        Squareroot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SquarerootActionPerformed(evt);
            }
        });
        jPanel1.add(Squareroot, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 60, 30));

        square.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        square.setText("<HTML>\nx<sup>2<sup>\n<HTML>");
        square.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        square.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareActionPerformed(evt);
            }
        });
        jPanel1.add(square, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 60, 30));

        thirdsquare.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        thirdsquare.setText("<HTML>\nx<sup>3<sup>\n<HTML>");
        thirdsquare.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        thirdsquare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thirdsquareActionPerformed(evt);
            }
        });
        jPanel1.add(thirdsquare, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 60, 30));

        dotoprater.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        dotoprater.setText(".");
        dotoprater.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dotoprater.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dotoprater.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dotopraterActionPerformed(evt);
            }
        });
        jPanel1.add(dotoprater, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 60, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 310));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        String store = jtext1.getText()+jButton8.getText();
        jtext1.setText(store);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButtonplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonplusActionPerformed
        // TODO add your handling code here:
        perform = 1;
        num1 =Double.parseDouble(jtext1.getText());
        jtext1.setText("");
    }//GEN-LAST:event_jButtonplusActionPerformed

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
        // TODO add your handling code here:
        String store = jtext1.getText()+jButton0.getText();
        jtext1.setText(store);
    }//GEN-LAST:event_jButton0ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String store = jtext1.getText()+jButton1.getText();
        jtext1.setText(store);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String store = jtext1.getText()+jButton2.getText();
        jtext1.setText(store);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String store = jtext1.getText()+jButton3.getText();
        jtext1.setText(store);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String store = jtext1.getText()+jButton4.getText();
        jtext1.setText(store);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String store = jtext1.getText()+jButton5.getText();
        jtext1.setText(store);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        String store = jtext1.getText()+jButton6.getText();
        jtext1.setText(store);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        String store = jtext1.getText()+jButton7.getText();
        jtext1.setText(store);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed

        String store = jtext1.getText()+jButton19.getText();
        jtext1.setText(store);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButtonsubtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsubtractActionPerformed
        // TODO add your handling code here:
        perform = 2;
        num1 = Double.parseDouble(jtext1.getText());
        jtext1.setText("");
    }//GEN-LAST:event_jButtonsubtractActionPerformed

    private void jButtonmultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonmultiActionPerformed
        // TODO add your handling code here:
        perform = 3;
        num1 = Double.parseDouble(jtext1.getText());
        jtext1.setText("");
    }//GEN-LAST:event_jButtonmultiActionPerformed

    private void jButtondivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtondivideActionPerformed
        // TODO add your handling code here:
        perform = 4;
        num1 = Double.parseDouble(jtext1.getText());
        jtext1.setText("");
    }//GEN-LAST:event_jButtondivideActionPerformed

    private void jButtonequalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonequalActionPerformed
        // TODO add your handling code here:
        String answer;
        num2=Double.parseDouble(jtext1.getText());
        if(perform==1)
        {
            result = num1+num2;
            answer = Double.toString(result);
            jtext1.setText(answer);
        }
        else if(perform==2)
        {
           result = num1-num2;
            answer = Double.toString(result);
            jtext1.setText(answer);
        }
        else if(perform==3)
        {
            result = num1*num2;
            answer = Double.toString(result);
            jtext1.setText(answer);
        }
        else if(perform==4)
        {
            result = num1/num2;
            answer = Double.toString(result);
            jtext1.setText(answer);
        }
        
    }//GEN-LAST:event_jButtonequalActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        // TODO add your handling code here:
        jtext1.setText("");
        num1=0;
        num2=0;
        perform=0;
    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jButton1ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ExitActionPerformed

    private void SquarerootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SquarerootActionPerformed
        // TODO add your handling code here:
        double str=Double.parseDouble(jtext1.getText());
        double tr=Math.sqrt(str);
        jtext1.setText(Double.toString(tr));
    }//GEN-LAST:event_SquarerootActionPerformed

    private void squareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareActionPerformed
        // TODO add your handling code here:
        double sqr=Double.parseDouble(jtext1.getText());
        double re=Math.pow(sqr, 2);
        jtext1.setText(Double.toString(re));
    }//GEN-LAST:event_squareActionPerformed

    private void thirdsquareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thirdsquareActionPerformed
        // TODO add your handling code here:
        double sqr=Double.parseDouble(jtext1.getText());
        double re=Math.pow(sqr, 3);
        jtext1.setText(Double.toString(re));
    }//GEN-LAST:event_thirdsquareActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        String std=jtext1.getText();
        std= std.substring(0, std.length()-1);
        jtext1.setText(std);
        
    }//GEN-LAST:event_BackActionPerformed

    private void dotopraterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dotopraterActionPerformed
        // TODO add your handling code here:
        String store = jtext1.getText()+dotoprater.getText();
        jtext1.setText(store);
    }//GEN-LAST:event_dotopraterActionPerformed

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
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Squareroot;
    private javax.swing.JButton dotoprater;
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton1Exit;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtondivide;
    private javax.swing.JButton jButtonequal;
    private javax.swing.JButton jButtonmulti;
    private javax.swing.JButton jButtonplus;
    private javax.swing.JButton jButtonsubtract;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jtext1;
    private javax.swing.JButton square;
    private javax.swing.JButton thirdsquare;
    // End of variables declaration//GEN-END:variables
}
