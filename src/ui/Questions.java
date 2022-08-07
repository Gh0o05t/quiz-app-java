package ui;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ButtonGroup;
import java.util.Timer;
import java.util.TimerTask;
public class Questions extends javax.swing.JFrame {
    public static String level;
    public static String username;
    public static String answer;
    public static int i = 1, score = 0;
    public Questions() {
        initComponents();
        DBCon.connect();
        load_question();
    }
  
    public static void TimerDo(){
        Timer timer=new Timer();
        UI.counter =600;
        TimerTask task =new TimerTask(){
            public void run(){
                timeLeft1.setText("Time Left : "+Integer.toString(UI.counter));
                UI.counter--;
                if(UI.counter==-1)
                {
                    timer.cancel();
                    YScore.setText("Your Score Is : "+score+"");
                    complete.setVisible(true);
                    i=1;
                    
                }
                else if(UI.isTt)
                {
                        timer.cancel();
                        UI.isTt=false;
                }
            }
        };
    timer.scheduleAtFixedRate(task,1000, 1000);
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.ButtonGroup();
        complete = new javax.swing.JDialog();
        CorrectP = new javax.swing.JPanel();
        OKC = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        YScore = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Submit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        timeLeft1 = new javax.swing.JLabel();
        OP2 = new javax.swing.JRadioButton();
        OP3 = new javax.swing.JRadioButton();
        OP4 = new javax.swing.JRadioButton();
        OP1 = new javax.swing.JRadioButton();
        GiveUp = new javax.swing.JButton();
        Skip = new javax.swing.JButton();
        qno = new javax.swing.JLabel();
        Question = new javax.swing.JTextArea();

        complete.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        complete.setLocation(new java.awt.Point(483, 284));
        complete.setMinimumSize(new java.awt.Dimension(400, 200));
        complete.setUndecorated(true);
        complete.setResizable(false);
        complete.setSize(new java.awt.Dimension(400, 200));
        complete.setType(java.awt.Window.Type.POPUP);
        complete.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CorrectP.setBackground(new java.awt.Color(102, 45, 140));
        CorrectP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        OKC.setBackground(new java.awt.Color(51, 51, 51));
        OKC.setFont(new java.awt.Font("Gotham Black", 0, 12)); // NOI18N
        OKC.setForeground(new java.awt.Color(255, 255, 255));
        OKC.setText("OK");
        OKC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        OKC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKCActionPerformed(evt);
            }
        });
        CorrectP.add(OKC, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 100, 30));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/checked.png"))); // NOI18N
        CorrectP.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 400, 70));

        YScore.setFont(new java.awt.Font("Gotham Black", 0, 14)); // NOI18N
        YScore.setForeground(new java.awt.Color(255, 255, 255));
        YScore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        YScore.setText("Your Score is ");
        CorrectP.add(YScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 400, 50));

        jLabel3.setFont(new java.awt.Font("Gotham Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Thank You! For Playing");
        CorrectP.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 400, 50));

        complete.getContentPane().add(CorrectP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 200));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quiz");
        setBackground(new java.awt.Color(51, 51, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(307, 130));
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(752, 508));
        setMinimumSize(new java.awt.Dimension(752, 508));
        setResizable(false);
        setSize(new java.awt.Dimension(752, 508));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(752, 508));
        jPanel2.setPreferredSize(new java.awt.Dimension(752, 508));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Submit.setBackground(new java.awt.Color(76, 76, 76));
        Submit.setForeground(new java.awt.Color(255, 255, 255));
        Submit.setText("SUBMIT");
        Submit.setBorder(null);
        Submit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Submit.setFocusPainted(false);
        Submit.setPreferredSize(new java.awt.Dimension(220, 25));
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        jPanel2.add(Submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, -1, -1));

        jPanel1.setBackground(new java.awt.Color(79, 0, 188));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(752, 110));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        timeLeft1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        timeLeft1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(timeLeft1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 240, 70));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        OP2.setBackground(new java.awt.Color(255, 255, 255));
        BG.add(OP2);
        OP2.setForeground(new java.awt.Color(51, 51, 51));
        OP2.setText("OPTION 2");
        OP2.setBorder(null);
        OP2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        OP2.setPreferredSize(new java.awt.Dimension(220, 23));
        jPanel2.add(OP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, -1, -1));

        OP3.setBackground(new java.awt.Color(255, 255, 255));
        BG.add(OP3);
        OP3.setForeground(new java.awt.Color(51, 51, 51));
        OP3.setText("OPTION 3");
        OP3.setBorder(null);
        OP3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        OP3.setPreferredSize(new java.awt.Dimension(220, 23));
        jPanel2.add(OP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, -1, -1));

        OP4.setBackground(new java.awt.Color(255, 255, 255));
        BG.add(OP4);
        OP4.setForeground(new java.awt.Color(51, 51, 51));
        OP4.setText("OPTION 4");
        OP4.setBorder(null);
        OP4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        OP4.setPreferredSize(new java.awt.Dimension(220, 23));
        jPanel2.add(OP4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, -1, -1));

        OP1.setBackground(new java.awt.Color(255, 255, 255));
        BG.add(OP1);
        OP1.setForeground(new java.awt.Color(51, 51, 51));
        OP1.setText("OPTION 1");
        OP1.setBorder(null);
        OP1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        OP1.setPreferredSize(new java.awt.Dimension(220, 23));
        jPanel2.add(OP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, -1, -1));

        GiveUp.setBackground(new java.awt.Color(76, 76, 76));
        GiveUp.setForeground(new java.awt.Color(255, 255, 255));
        GiveUp.setText("Give Up!");
        GiveUp.setBorder(null);
        GiveUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GiveUp.setFocusPainted(false);
        GiveUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GiveUpMouseClicked(evt);
            }
        });
        jPanel2.add(GiveUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 140, 30));

        Skip.setBackground(new java.awt.Color(76, 76, 76));
        Skip.setForeground(new java.awt.Color(255, 255, 255));
        Skip.setText("Skip");
        Skip.setBorder(null);
        Skip.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Skip.setFocusPainted(false);
        Skip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SkipActionPerformed(evt);
            }
        });
        jPanel2.add(Skip, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, 140, 30));

        qno.setBackground(new java.awt.Color(255, 255, 255));
        qno.setForeground(new java.awt.Color(51, 51, 51));
        qno.setText("QNO");
        jPanel2.add(qno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 50, -1));

        Question.setColumns(10);
        Question.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Question.setForeground(new java.awt.Color(51, 51, 51));
        Question.setLineWrap(true);
        Question.setRows(5);
        Question.setWrapStyleWord(true);
        Question.setBorder(null);
        Question.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        Question.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(Question, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 160, 370, 230));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void GiveUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GiveUpMouseClicked
        complete.setVisible(true);
    }//GEN-LAST:event_GiveUpMouseClicked

    public void load_question() {
        String sql="select * from "+level+" where qnum = "+i+";";
            ResultSet  rs=DBCon.executeQuery(sql);
            try {
                while(rs.next())
                {
                    Question.setText(rs.getString("ques"));
                    OP1.setText(rs.getString("opt1"));
                    OP1.setActionCommand(rs.getString("opt1"));
                    OP2.setText(rs.getString("opt2"));
                    OP2.setActionCommand(rs.getString("opt2"));
                    OP3.setText(rs.getString("opt3"));
                    OP3.setActionCommand(rs.getString("opt3"));
                    OP4.setText(rs.getString("opt4"));
                    OP4.setActionCommand(rs.getString("opt4"));
                    qno.setText(rs.getString("qnum"));
                    answer = rs.getString("answer");
                    i++;
                }
                rs.close();
                DBCon.disconnect();
                    } catch (SQLException ex) {
               ex.getMessage();
                    }
    }
    
    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        // TODO add your handling code here:
        scorecontroller();
        if(i<=UI.cnt){
            load_question();
        }
        else
        {
            YScore.setText("Your Score Is : "+score+"");
            complete.setVisible(true);
            i=1;
        }
        System.out.println(score);
    }//GEN-LAST:event_SubmitActionPerformed
    
    public static void scorecontroller()    {
        if(BG.getSelection().getActionCommand().equals(answer))
        {
            score = score + 4;
        }
        else
        {
            SignUp_Page.WrongT.setText("Wrong Answer!!! Answer Was \n"+answer);
            SignUp_Page.Invalid.setVisible(true);
            score = score - 1;
        }
    }
    
    private void OKCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKCActionPerformed
        // TODO add your handling code here:
        DBCon.connect();
        String sql="insert into scorecard values('"+username+"','"+level+"','"+score+"')";
        DBCon.executeUpdate(sql);
        DBCon.disconnect();
        MenuStudent ms = new MenuStudent();
        ms.setVisible(true);
        complete.dispose();
        this.dispose();
    }//GEN-LAST:event_OKCActionPerformed

    private void SkipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SkipActionPerformed
        // TODO add your handling code here:
        if(i<=UI.cnt-1){
            i++;
            Questions q = new Questions();
            q.setVisible(true);
            this.dispose();
        }
        else
        {
            complete.setVisible(true);
        }
        System.out.println(score);
    }//GEN-LAST:event_SkipActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Questions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Questions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Questions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Questions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Questions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.ButtonGroup BG;
    private javax.swing.JPanel CorrectP;
    private javax.swing.JButton GiveUp;
    private javax.swing.JButton OKC;
    private javax.swing.JRadioButton OP1;
    private javax.swing.JRadioButton OP2;
    private javax.swing.JRadioButton OP3;
    private javax.swing.JRadioButton OP4;
    private javax.swing.JTextArea Question;
    private javax.swing.JButton Skip;
    private javax.swing.JButton Submit;
    public static javax.swing.JLabel YScore;
    public static javax.swing.JDialog complete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel qno;
    public static javax.swing.JLabel timeLeft1;
    // End of variables declaration//GEN-END:variables
   
}
