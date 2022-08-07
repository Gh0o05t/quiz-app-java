package ui;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import static ui.UI.cnt;

public class MenuStudent extends javax.swing.JFrame {
    public static String username;
    public MenuStudent() {
            initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Rules1 = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Level3 = new javax.swing.JButton();
        Level2 = new javax.swing.JButton();
        Level1 = new javax.swing.JButton();
        Rules = new javax.swing.JButton();
        Scorecard = new javax.swing.JButton();
        Play = new javax.swing.JLabel();
        Menu = new javax.swing.JButton();

        Rules1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        Rules1.setMinimumSize(new java.awt.Dimension(300, 411));
        Rules1.setUndecorated(true);
        Rules1.setResizable(false);
        Rules1.setSize(new java.awt.Dimension(300, 411));

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

        javax.swing.GroupLayout Rules1Layout = new javax.swing.GroupLayout(Rules1.getContentPane());
        Rules1.getContentPane().setLayout(Rules1Layout);
        Rules1Layout.setHorizontalGroup(
            Rules1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        Rules1Layout.setVerticalGroup(
            Rules1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Rules1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MenuStudent");
        setBackground(new java.awt.Color(51, 51, 51));
        setForeground(java.awt.Color.black);
        setLocation(new java.awt.Point(307, 130));
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(736, 496));
        setMinimumSize(new java.awt.Dimension(736, 496));
        setResizable(false);

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
        Level3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Level3MouseClicked(evt);
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
        Level2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Level2MouseClicked(evt);
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
        Level1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Level1MouseClicked(evt);
            }
        });
        Level1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Level1ActionPerformed(evt);
            }
        });
        jPanel1.add(Level1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 128, 242, 120));

        Rules.setBackground(new java.awt.Color(234, 239, 242));
        Rules.setFont(new java.awt.Font("Gotham Black", 0, 36)); // NOI18N
        Rules.setForeground(new java.awt.Color(51, 51, 51));
        Rules.setText("Rules");
        Rules.setBorder(null);
        Rules.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Rules.setFocusPainted(false);
        Rules.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RulesActionPerformed(evt);
            }
        });
        jPanel1.add(Rules, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 126, 254, 370));

        Scorecard.setBackground(new java.awt.Color(79, 0, 188));
        Scorecard.setFont(new java.awt.Font("Gotham Black", 0, 36)); // NOI18N
        Scorecard.setForeground(new java.awt.Color(255, 255, 255));
        Scorecard.setText("Scorecard");
        Scorecard.setBorder(null);
        Scorecard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Scorecard.setFocusPainted(false);
        Scorecard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ScorecardMouseClicked(evt);
            }
        });
        jPanel1.add(Scorecard, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 126, 240, 370));

        Play.setBackground(new java.awt.Color(51, 51, 51));
        Play.setFont(new java.awt.Font("Gotham Black", 0, 36)); // NOI18N
        Play.setForeground(new java.awt.Color(51, 51, 51));
        Play.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Play.setText("Playground");
        Play.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(Play, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 260, 124));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Level1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Level1MouseClicked
        Questions.level= "level_1";
        Countrow();
        Questions.TimerDo();
    }//GEN-LAST:event_Level1MouseClicked

    private void Level2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Level2MouseClicked
        // TODO add your handling code here:
        Questions.level= "level_2";
        Countrow();
        Questions.TimerDo();

    }//GEN-LAST:event_Level2MouseClicked

    private void Level3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Level3MouseClicked
        // TODO add your handling code here:
        Questions.level= "level_3";
        Countrow();
        Questions.TimerDo();

    }//GEN-LAST:event_Level3MouseClicked

    private void ScorecardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScorecardMouseClicked
        // TODO add your handling code here:
        TableView tv = new TableView();
        tv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ScorecardMouseClicked

    private void MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMouseClicked
        SignUp_Page hp;
        try {
            hp = new SignUp_Page();
            Questions.score=0;
            Questions.i=1;
            hp.setVisible(true);
            this.dispose();
        } catch (Exception ex) {
            Logger.getLogger(MenuStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MenuMouseClicked

    private void RulesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RulesActionPerformed
        // TODO add your handling code here:
        MenuStudent.Rules1.setVisible(true);
    }//GEN-LAST:event_RulesActionPerformed

    private void Level1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Level1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_Level1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MenuStudent.Rules1.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    public void Countrow()  {
        try (
            ResultSet rs = DBCon.executeQuery("select count(qnum) as count from "+Questions.level+"")) {
            System.out.println("Count");
            while(rs.next())
            {
                cnt = rs.getInt("Count");
                System.out.println(cnt);
                Questions q = new Questions();
                q.setVisible(true);
                this.dispose();
            }
        } catch (SQLException ex) {
            Logger.getLogger(MenuStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
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
            java.util.logging.Logger.getLogger(MenuStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Level1;
    private javax.swing.JButton Level2;
    private javax.swing.JButton Level3;
    private javax.swing.JButton Menu;
    private javax.swing.JLabel Play;
    private javax.swing.JButton Rules;
    public static javax.swing.JDialog Rules1;
    private javax.swing.JButton Scorecard;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
