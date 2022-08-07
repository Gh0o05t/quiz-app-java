package ui;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class SignUp_Page extends javax.swing.JFrame { 
    public void insertS()  {
        String U2 = UserLog2.getText();
        String P1 = String.valueOf(UserPass2.getPassword());
        try
        {
                String q = "insert into logins values('"+U2+"','"+P1+"');";
                int x = DBCon.executeUpdate(q);
                if(x==1)
                    Correct.setVisible(true);
                else if(x==0)
                    Already.setVisible(true);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Username Already Exist!!!!");
        }
    }
    
    public void insertF()  {
        String U2 = UserLog2.getText();
        String P1 = String.valueOf(UserPass2.getPassword());
        try
        {
                String q = "insert into logint values('"+U2+"','"+P1+"');";
                DBCon.executeUpdate(q);
                Correct.setVisible(true);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Username Already Exist!!!!");
        }
    }
    
    public void loginS()    {
        String U1 = UserLog1.getText();
        String P1 = String.valueOf(UserPass1.getPassword());
        Questions.username = U1;
        MenuStudent.username = U1;
        TableView.username = U1;
        try
        {
            ResultSet rs = DBCon.executeQuery("select userid, passwords from logins where userid = '"+U1+"' and passwords = '"+P1+"';");
                    if(rs.next())
                    {  
                        MenuStudent ms = new MenuStudent();
                        ms.setVisible(true);
                        this.dispose();
                    }
                    else
                    {
                        WrongT.setText("Invalid Username or Password!!!");
                        Invalid.setVisible(true);
                    }
            rs.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    public void loginF() 
    {
        String U1 = UserLog1.getText();
        String P1 = String.valueOf(UserPass1.getPassword());
        try
        {
            String q = "select userid, password from logint where userid = '"+U1+"' and password = '"+P1+"';";
            ResultSet rs = DBCon.executeQuery(q);
                    if(rs.next())
                    {  
                        MenuFaculty ms = new MenuFaculty();
                        ms.setVisible(true);
                        this.dispose();
                    }
                    else
                    {
                        Invalid.setVisible(true);
                    }
            rs.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    public SignUp_Page()throws Exception {
        initComponents();
        String U1 = UserLog1.getText();
        String P1 = String.valueOf(UserPass1.getPassword());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Correct = new javax.swing.JDialog();
        CorrectP = new javax.swing.JPanel();
        OKC = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        statement = new javax.swing.JLabel();
        Invalid = new javax.swing.JDialog();
        InavlidP = new javax.swing.JPanel();
        OKI = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        WrongT = new javax.swing.JLabel();
        Already = new javax.swing.JDialog();
        AlreadyP = new javax.swing.JPanel();
        OKA = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        LoginStu = new javax.swing.JButton();
        LoginFac = new javax.swing.JButton();
        LogId = new javax.swing.JLabel();
        LogPass = new javax.swing.JLabel();
        UserLog1 = new javax.swing.JTextField();
        UserPass1 = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        Log = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        RegStu = new javax.swing.JButton();
        RegFac = new javax.swing.JButton();
        Reg = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        RegPass = new javax.swing.JLabel();
        UserLog2 = new javax.swing.JTextField();
        UserPass2 = new javax.swing.JPasswordField();
        RegId = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();

        Correct.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        Correct.setLocation(new java.awt.Point(483, 284));
        Correct.setMinimumSize(new java.awt.Dimension(400, 200));
        Correct.setUndecorated(true);
        Correct.setResizable(false);
        Correct.setType(java.awt.Window.Type.POPUP);
        Correct.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        statement.setFont(new java.awt.Font("Gotham Black", 0, 14)); // NOI18N
        statement.setForeground(new java.awt.Color(255, 255, 255));
        statement.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        statement.setText("User Registered Successfully, Login To Continue!");
        CorrectP.add(statement, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 400, 50));

        Correct.getContentPane().add(CorrectP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 200));

        Invalid.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        Invalid.setLocation(new java.awt.Point(483, 284));
        Invalid.setMinimumSize(new java.awt.Dimension(400, 200));
        Invalid.setUndecorated(true);
        Invalid.setResizable(false);
        Invalid.setSize(new java.awt.Dimension(400, 200));
        Invalid.setType(java.awt.Window.Type.POPUP);
        Invalid.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        InavlidP.setBackground(new java.awt.Color(102, 45, 140));
        InavlidP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        OKI.setBackground(new java.awt.Color(51, 51, 51));
        OKI.setFont(new java.awt.Font("Gotham Black", 0, 12)); // NOI18N
        OKI.setForeground(new java.awt.Color(255, 255, 255));
        OKI.setText("OK");
        OKI.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        OKI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKIActionPerformed(evt);
            }
        });
        InavlidP.add(OKI, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 100, 30));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/cross.png"))); // NOI18N
        InavlidP.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 400, 70));

        WrongT.setFont(new java.awt.Font("Gotham Black", 0, 14)); // NOI18N
        WrongT.setForeground(new java.awt.Color(255, 255, 255));
        WrongT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WrongT.setText("Invalid Username or Password!!!");
        InavlidP.add(WrongT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 400, 50));

        Invalid.getContentPane().add(InavlidP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 200));

        Already.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        Already.setLocation(new java.awt.Point(483, 284));
        Already.setUndecorated(true);
        Already.setResizable(false);
        Already.setSize(new java.awt.Dimension(400, 200));
        Already.setType(java.awt.Window.Type.POPUP);
        Already.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AlreadyP.setBackground(new java.awt.Color(102, 45, 140));
        AlreadyP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        OKA.setBackground(new java.awt.Color(51, 51, 51));
        OKA.setFont(new java.awt.Font("Gotham Black", 0, 12)); // NOI18N
        OKA.setForeground(new java.awt.Color(255, 255, 255));
        OKA.setText("OK");
        OKA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        OKA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKAActionPerformed(evt);
            }
        });
        AlreadyP.add(OKA, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 100, 30));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/cross.png"))); // NOI18N
        AlreadyP.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 400, 70));

        jLabel6.setFont(new java.awt.Font("Gotham Black", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Username Already Exists!!");
        AlreadyP.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 400, 50));

        Already.getContentPane().add(AlreadyP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 200));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SignUp_Page");
        setLocation(new java.awt.Point(307, 130));
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(752, 508));
        setMinimumSize(new java.awt.Dimension(752, 508));
        setModalExclusionType(null);
        setResizable(false);
        setSize(new java.awt.Dimension(752, 508));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(376, 508));
        jPanel1.setMinimumSize(new java.awt.Dimension(376, 508));
        jPanel1.setPreferredSize(new java.awt.Dimension(376, 508));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LoginStu.setBackground(new java.awt.Color(76, 76, 76));
        LoginStu.setFont(new java.awt.Font("Gotham Black", 0, 10)); // NOI18N
        LoginStu.setForeground(new java.awt.Color(255, 255, 255));
        LoginStu.setText("Student Login");
        LoginStu.setBorder(null);
        LoginStu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginStu.setFocusPainted(false);
        LoginStu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginStuMouseClicked(evt);
            }
        });
        jPanel1.add(LoginStu, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 376, 118, 45));

        LoginFac.setBackground(new java.awt.Color(76, 76, 76));
        LoginFac.setFont(new java.awt.Font("Gotham Black", 0, 10)); // NOI18N
        LoginFac.setForeground(new java.awt.Color(255, 255, 255));
        LoginFac.setText("Faculty Login");
        LoginFac.setBorder(null);
        LoginFac.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginFac.setFocusPainted(false);
        LoginFac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginFacMouseClicked(evt);
            }
        });
        jPanel1.add(LoginFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 376, 118, 45));

        LogId.setBackground(new java.awt.Color(255, 255, 255));
        LogId.setFont(new java.awt.Font("Gotham Black", 0, 12)); // NOI18N
        LogId.setForeground(new java.awt.Color(51, 51, 51));
        LogId.setText("USERNAME");
        jPanel1.add(LogId, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 154, -1, -1));

        LogPass.setBackground(new java.awt.Color(255, 255, 255));
        LogPass.setFont(new java.awt.Font("Gotham Black", 0, 12)); // NOI18N
        LogPass.setForeground(new java.awt.Color(51, 51, 51));
        LogPass.setText("PASSWORD");
        jPanel1.add(LogPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 257, -1, -1));

        UserLog1.setForeground(new java.awt.Color(51, 51, 51));
        UserLog1.setText("Enter The Username");
        UserLog1.setBorder(null);
        UserLog1.setCaretColor(new java.awt.Color(51, 51, 51));
        UserLog1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        UserLog1.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        UserLog1.setSelectionColor(new java.awt.Color(255, 255, 255));
        UserLog1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserLog1MouseClicked(evt);
            }
        });
        jPanel1.add(UserLog1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 173, 286, 23));

        UserPass1.setForeground(new java.awt.Color(51, 51, 51));
        UserPass1.setText("PASSWORD");
        UserPass1.setBorder(null);
        UserPass1.setCaretColor(new java.awt.Color(51, 51, 51));
        UserPass1.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        UserPass1.setSelectionColor(new java.awt.Color(255, 255, 255));
        UserPass1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserPass1MouseClicked(evt);
            }
        });
        jPanel1.add(UserPass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 276, 286, 23));

        jSeparator1.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 202, 286, -1));

        jSeparator2.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 305, 286, -1));

        Log.setBackground(new java.awt.Color(255, 255, 255));
        Log.setFont(new java.awt.Font("Gotham Black", 0, 14)); // NOI18N
        Log.setForeground(new java.awt.Color(51, 51, 51));
        Log.setText("Login");
        jPanel1.add(Log, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 85, -1, -1));

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setForeground(new java.awt.Color(51, 51, 51));
        jCheckBox1.setText("Show Password");
        jCheckBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 314, -1, -1));

        jPanel2.setBackground(new java.awt.Color(79, 0, 188));
        jPanel2.setMaximumSize(new java.awt.Dimension(376, 508));
        jPanel2.setMinimumSize(new java.awt.Dimension(376, 508));
        jPanel2.setPreferredSize(new java.awt.Dimension(376, 508));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RegStu.setBackground(new java.awt.Color(51, 51, 51));
        RegStu.setFont(new java.awt.Font("Gotham Black", 0, 10)); // NOI18N
        RegStu.setForeground(new java.awt.Color(255, 255, 255));
        RegStu.setText("Student Signup");
        RegStu.setBorder(null);
        RegStu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegStu.setFocusPainted(false);
        RegStu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegStuMouseClicked(evt);
            }
        });
        jPanel2.add(RegStu, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 376, 118, 45));

        RegFac.setBackground(new java.awt.Color(51, 51, 51));
        RegFac.setFont(new java.awt.Font("Gotham Black", 0, 10)); // NOI18N
        RegFac.setForeground(new java.awt.Color(255, 255, 255));
        RegFac.setText("Faculty Signup");
        RegFac.setBorder(null);
        RegFac.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegFac.setFocusPainted(false);
        RegFac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegFacMouseClicked(evt);
            }
        });
        jPanel2.add(RegFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 376, 118, 45));

        Reg.setBackground(new java.awt.Color(255, 69, 0));
        Reg.setFont(new java.awt.Font("Gotham Black", 0, 14)); // NOI18N
        Reg.setForeground(new java.awt.Color(255, 255, 255));
        Reg.setText("Register");
        jPanel2.add(Reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 85, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 305, 286, -1));

        jSeparator4.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 202, 286, -1));

        RegPass.setBackground(new java.awt.Color(51, 51, 51));
        RegPass.setFont(new java.awt.Font("Gotham Black", 0, 12)); // NOI18N
        RegPass.setForeground(new java.awt.Color(255, 255, 255));
        RegPass.setText("PASSWORD");
        jPanel2.add(RegPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 257, -1, -1));

        UserLog2.setBackground(new java.awt.Color(79, 0, 188));
        UserLog2.setForeground(new java.awt.Color(255, 255, 255));
        UserLog2.setText("Enter The Username");
        UserLog2.setBorder(null);
        UserLog2.setCaretColor(new java.awt.Color(255, 255, 255));
        UserLog2.setSelectedTextColor(new java.awt.Color(79, 0, 188));
        UserLog2.setSelectionColor(new java.awt.Color(255, 255, 255));
        UserLog2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserLog2MouseClicked(evt);
            }
        });
        jPanel2.add(UserLog2, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 173, 286, 23));

        UserPass2.setBackground(new java.awt.Color(79, 0, 188));
        UserPass2.setForeground(new java.awt.Color(255, 255, 255));
        UserPass2.setText("PASSWORD");
        UserPass2.setBorder(null);
        UserPass2.setCaretColor(new java.awt.Color(255, 255, 255));
        UserPass2.setSelectedTextColor(new java.awt.Color(79, 0, 188));
        UserPass2.setSelectionColor(new java.awt.Color(255, 255, 255));
        UserPass2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserPass2MouseClicked(evt);
            }
        });
        jPanel2.add(UserPass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 276, 286, 23));

        RegId.setBackground(new java.awt.Color(51, 51, 51));
        RegId.setFont(new java.awt.Font("Gotham Black", 0, 12)); // NOI18N
        RegId.setForeground(new java.awt.Color(255, 255, 255));
        RegId.setText("USERNAME");
        jPanel2.add(RegId, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 154, -1, -1));

        jCheckBox2.setBackground(new java.awt.Color(79, 0, 188));
        jCheckBox2.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("Show Password");
        jCheckBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 314, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void LoginStuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginStuMouseClicked
	loginS();
    }//GEN-LAST:event_LoginStuMouseClicked
    private void LoginFacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginFacMouseClicked
        loginF();
    }//GEN-LAST:event_LoginFacMouseClicked
    private void RegFacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegFacMouseClicked
        insertF();
    }//GEN-LAST:event_RegFacMouseClicked

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(jCheckBox1.isSelected())
            UserPass1.setEchoChar((char)0);
        else
            UserPass1.setEchoChar('*');
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if(jCheckBox2.isSelected())
            UserPass2.setEchoChar((char)0);
        else
            UserPass2.setEchoChar('*');
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void RegStuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegStuMouseClicked
        insertS();
    }//GEN-LAST:event_RegStuMouseClicked

    private void UserLog1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserLog1MouseClicked
        UserLog1.setText("");
    }//GEN-LAST:event_UserLog1MouseClicked

    private void UserLog2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserLog2MouseClicked
        UserLog2.setText("");
    }//GEN-LAST:event_UserLog2MouseClicked

    private void UserPass1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserPass1MouseClicked
        UserPass1.setText("");
    }//GEN-LAST:event_UserPass1MouseClicked

    private void UserPass2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserPass2MouseClicked
        UserPass2.setText("");
    }//GEN-LAST:event_UserPass2MouseClicked

    private void OKCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKCActionPerformed
        // TODO add your handling code here:
        Correct.dispose();
    }//GEN-LAST:event_OKCActionPerformed

    private void OKIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKIActionPerformed
        // TODO add your handling code here:
        Invalid.dispose();
    }//GEN-LAST:event_OKIActionPerformed

    private void OKAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKAActionPerformed
        // TODO add your handling code here:
        Already.dispose();
    }//GEN-LAST:event_OKAActionPerformed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SignUp_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Already;
    private javax.swing.JPanel AlreadyP;
    public static javax.swing.JDialog Correct;
    private javax.swing.JPanel CorrectP;
    private javax.swing.JPanel InavlidP;
    public static javax.swing.JDialog Invalid;
    private javax.swing.JLabel Log;
    private javax.swing.JLabel LogId;
    private javax.swing.JLabel LogPass;
    private javax.swing.JButton LoginFac;
    private javax.swing.JButton LoginStu;
    private javax.swing.JButton OKA;
    private javax.swing.JButton OKC;
    private javax.swing.JButton OKI;
    private javax.swing.JLabel Reg;
    private javax.swing.JButton RegFac;
    private javax.swing.JLabel RegId;
    private javax.swing.JLabel RegPass;
    private javax.swing.JButton RegStu;
    public static javax.swing.JTextField UserLog1;
    public static javax.swing.JTextField UserLog2;
    public static javax.swing.JPasswordField UserPass1;
    public static javax.swing.JPasswordField UserPass2;
    public static javax.swing.JLabel WrongT;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    public static javax.swing.JLabel statement;
    // End of variables declaration//GEN-END:variables
}
