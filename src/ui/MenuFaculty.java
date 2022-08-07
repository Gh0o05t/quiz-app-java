package ui;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MenuFaculty extends javax.swing.JFrame {
    public MenuFaculty() {
        try {
            initComponents();
        } catch (Exception ex) {
            Logger.getLogger(MenuFaculty.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Rules = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Level3 = new javax.swing.JButton();
        Level2 = new javax.swing.JButton();
        Level1 = new javax.swing.JButton();
        RulesF = new javax.swing.JButton();
        Score = new javax.swing.JButton();
        Edit = new javax.swing.JLabel();
        Menu = new javax.swing.JButton();

        Rules.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        Rules.setMinimumSize(new java.awt.Dimension(300, 411));
        Rules.setUndecorated(true);
        Rules.setResizable(false);
        Rules.setSize(new java.awt.Dimension(300, 411));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RULES");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 30, 290, 40));

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(51, 51, 51));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("1] Every Right Answer will Give You 4 Points\n\n2] Every Wrong Answer Will Reduce Your Marks By 1\n\n3] If You Don't Attempt a Question and Skip It. Niether Marks will Reduce or Increase.\n\n\t   \n\t  \n\t  All The Best");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 280, 250));

        jButton1.setBackground(new java.awt.Color(76, 76, 76));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("OK");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 90, 20));

        javax.swing.GroupLayout RulesLayout = new javax.swing.GroupLayout(Rules.getContentPane());
        Rules.getContentPane().setLayout(RulesLayout);
        RulesLayout.setHorizontalGroup(
            RulesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        RulesLayout.setVerticalGroup(
            RulesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setForeground(new java.awt.Color(0, 0, 0));
        setLocation(new java.awt.Point(307, 130));
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(736, 496));
        setMinimumSize(new java.awt.Dimension(736, 496));
        setModalExclusionType(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Gotham Black", 0, 24)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Level3.setBackground(new java.awt.Color(234, 239, 242));
        Level3.setFont(new java.awt.Font("Gotham Black", 0, 24)); // NOI18N
        Level3.setForeground(new java.awt.Color(51, 51, 51));
        Level3.setText("Subject 3");
        Level3.setBorder(null);
        Level3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Level3.setFocusPainted(false);
        Level3.setPreferredSize(new java.awt.Dimension(236, 124));
        Level3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Level3ActionPerformed(evt);
            }
        });
        jPanel1.add(Level3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 372, 242, -1));

        Level2.setBackground(new java.awt.Color(234, 239, 242));
        Level2.setFont(new java.awt.Font("Gotham Black", 0, 24)); // NOI18N
        Level2.setForeground(new java.awt.Color(51, 51, 51));
        Level2.setText("Subject 2");
        Level2.setBorder(null);
        Level2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Level2.setFocusPainted(false);
        Level2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Level2ActionPerformed(evt);
            }
        });
        jPanel1.add(Level2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 248, 242, 124));

        Level1.setBackground(new java.awt.Color(234, 239, 242));
        Level1.setFont(new java.awt.Font("Gotham Black", 0, 24)); // NOI18N
        Level1.setForeground(new java.awt.Color(51, 51, 51));
        Level1.setText("Subject 1");
        Level1.setBorder(null);
        Level1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Level1.setFocusPainted(false);
        Level1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Level1ActionPerformed(evt);
            }
        });
        jPanel1.add(Level1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 128, 242, 120));

        RulesF.setBackground(new java.awt.Color(234, 239, 242));
        RulesF.setFont(new java.awt.Font("Gotham Black", 0, 36)); // NOI18N
        RulesF.setForeground(new java.awt.Color(51, 51, 51));
        RulesF.setText("Rules");
        RulesF.setBorder(null);
        RulesF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RulesF.setFocusPainted(false);
        RulesF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RulesFActionPerformed(evt);
            }
        });
        jPanel1.add(RulesF, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 126, 254, 370));

        Score.setBackground(new java.awt.Color(79, 0, 188));
        Score.setFont(new java.awt.Font("Gotham Black", 0, 36)); // NOI18N
        Score.setForeground(new java.awt.Color(255, 255, 255));
        Score.setText("Scorecard");
        Score.setBorder(null);
        Score.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Score.setFocusPainted(false);
        Score.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScoreActionPerformed(evt);
            }
        });
        jPanel1.add(Score, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 126, 240, 370));

        Edit.setBackground(new java.awt.Color(51, 51, 51));
        Edit.setFont(new java.awt.Font("Gotham Black", 0, 36)); // NOI18N
        Edit.setForeground(new java.awt.Color(51, 51, 51));
        Edit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Edit.setText("Faculty Menu");
        Edit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 260, 124));

        Menu.setBackground(new java.awt.Color(76, 76, 76));
        Menu.setFont(new java.awt.Font("Gotham Black", 0, 18)); // NOI18N
        Menu.setForeground(new java.awt.Color(255, 255, 255));
        Menu.setText("Log Out");
        Menu.setBorder(null);
        Menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Menu.setFocusPainted(false);
        Menu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuMouseClicked(evt);
            }
        });
        jPanel1.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 100, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMouseClicked
        SignUp_Page hp;
        try {
            hp = new SignUp_Page();
            hp.setVisible(true);
            this.dispose();
        } catch (Exception ex) {
            Logger.getLogger(MenuStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MenuMouseClicked

    private void Level1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Level1ActionPerformed
        // TODO add your handling code here:
        AddQuestion.level = "level_1";
        AddQuestion aq = new AddQuestion();
        aq.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Level1ActionPerformed

    private void Level2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Level2ActionPerformed
        // TODO add your handling code here:
        AddQuestion.level = "level_2";
        AddQuestion aq = new AddQuestion();
        aq.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Level2ActionPerformed

    private void Level3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Level3ActionPerformed
        // TODO add your handling code here:
        AddQuestion.level = "level_3";
        AddQuestion aq = new AddQuestion();
        aq.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Level3ActionPerformed

    private void ScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScoreActionPerformed
        // TODO add your handling code here:
        TableView tv = new TableView();
        tv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ScoreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MenuFaculty.Rules.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void RulesFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RulesFActionPerformed
        // TODO add your handling code here:
        MenuFaculty.Rules.setVisible(true);
    }//GEN-LAST:event_RulesFActionPerformed

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
            java.util.logging.Logger.getLogger(MenuFaculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuFaculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuFaculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuFaculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuFaculty().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Edit;
    private javax.swing.JButton Level1;
    private javax.swing.JButton Level2;
    private javax.swing.JButton Level3;
    private javax.swing.JButton Menu;
    public static javax.swing.JDialog Rules;
    private javax.swing.JButton RulesF;
    private javax.swing.JButton Score;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
