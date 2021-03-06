/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import java.awt.Color;
import java.awt.Font;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author nicho
 */
public class Users extends javax.swing.JFrame {

    /**
     * Creates new form Users
     */
    Connection con = null;
    PreparedStatement add = null;
    Statement st=null;
    ResultSet rs = null;
    private void Displayusers(){
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/multiuserlogin", "root", "");
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM `multiuserlogin`");
            UsersTable.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        }catch (SQLException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void Reset(){
        usertxt.setText("");
        Passwordtxt.setText("");
        conPasswordtxt.setText("");
        secQues.setText("");
        secAns.setText("");
        userComboBox.setSelectedIndex(0);
    }
    public Users() {
        initComponents();
        Displayusers();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        logoutbtn = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        UsersTable = new javax.swing.JTable();
        usertxt = new javax.swing.JTextField();
        secQues = new javax.swing.JTextField();
        secAns = new javax.swing.JTextField();
        userComboBox = new javax.swing.JComboBox<>();
        conPasswordtxt = new javax.swing.JPasswordField();
        Passwordtxt = new javax.swing.JPasswordField();
        editbtn = new javax.swing.JButton();
        addbtn = new javax.swing.JButton();
        resetbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        printbtn = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(23, 31, 65));
        jPanel1.setLayout(null);

        jPanel16.setBackground(new java.awt.Color(41, 57, 80));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/User/icon/icons8_home_25px.png"))); // NOI18N
        jLabel4.setText("Home");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addGap(0, 45, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel16);
        jPanel16.setBounds(0, 179, 150, 47);

        jPanel18.setBackground(new java.awt.Color(71, 120, 197));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/User/icon/icons8_select_users_25px.png"))); // NOI18N
        jLabel5.setText("User/s");

        jPanel17.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel5)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
            .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel18);
        jPanel18.setBounds(0, 309, 150, 47);

        logoutbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/User/icon/icons8_exit_50px.png"))); // NOI18N
        logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbtnActionPerformed(evt);
            }
        });
        jPanel1.add(logoutbtn);
        logoutbtn.setBounds(50, 560, 50, 50);

        jPanel8.setBackground(new java.awt.Color(41, 57, 80));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/User/icon/icons8_books_25px.png"))); // NOI18N
        jLabel1.setText("Stock");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel8);
        jPanel8.setBounds(0, 244, 150, 47);

        jPanel20.setBackground(new java.awt.Color(41, 57, 80));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/User/icon/icons8_combo_chart_25px.png"))); // NOI18N
        jLabel9.setText("Report/s");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel9)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel20);
        jPanel20.setBounds(0, 374, 150, 47);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 640));

        jPanel2.setBackground(new java.awt.Color(71, 120, 197));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/User/icon/icons8_books_75px.png"))); // NOI18N
        jLabel7.setText("Book Store Management System");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/User/icon/icons8_user_shield_75px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 860, 100));

        jPanel3.setBackground(new java.awt.Color(120, 168, 252));
        jPanel3.setLayout(null);

        UsersTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        UsersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Password", "User Type", "Security Question", "Answer"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        UsersTable.setRowMargin(1);
        UsersTable.setShowGrid(true);
        UsersTable.getTableHeader().setReorderingAllowed(false);
        UsersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsersTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(UsersTable);
        UsersTable.getTableHeader().setOpaque(false);
        UsersTable.getTableHeader().setForeground(new Color(23,31,65));
        UsersTable.getTableHeader().setBackground(new Color(168, 194, 251));
        UsersTable.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 13));

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(50, 50, 730, 127);

        usertxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        usertxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usertxt.setToolTipText("Enter user name.");
        jPanel3.add(usertxt);
        usertxt.setBounds(50, 250, 163, 39);

        secQues.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel3.add(secQues);
        secQues.setBounds(50, 420, 317, 39);

        secAns.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        secAns.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(secAns);
        secAns.setBounds(410, 420, 163, 39);

        userComboBox.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        userComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administator", "User/s" }));
        userComboBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel3.add(userComboBox);
        userComboBox.setBounds(50, 330, 173, 30);

        conPasswordtxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        conPasswordtxt.setToolTipText("Enter confirmation password.");
        jPanel3.add(conPasswordtxt);
        conPasswordtxt.setBounds(410, 330, 163, 39);

        Passwordtxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Passwordtxt.setToolTipText("Enter password.");
        jPanel3.add(Passwordtxt);
        Passwordtxt.setBounds(410, 250, 163, 39);

        editbtn.setBackground(new java.awt.Color(71, 120, 197));
        editbtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        editbtn.setForeground(new java.awt.Color(0, 0, 0));
        editbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/User/icon/icons8_edit_43px.png"))); // NOI18N
        editbtn.setText("Edit");
        editbtn.setToolTipText("Edit user data.");
        editbtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 2, true));
        editbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editbtnMouseClicked(evt);
            }
        });
        jPanel3.add(editbtn);
        editbtn.setBounds(640, 300, 200, 50);

        addbtn.setBackground(new java.awt.Color(71, 120, 197));
        addbtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        addbtn.setForeground(new java.awt.Color(0, 0, 0));
        addbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/User/icon/icons8_add_administrator_43px.png"))); // NOI18N
        addbtn.setText("Add New User");
        addbtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 2, true));
        addbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addbtnMouseClicked(evt);
            }
        });
        jPanel3.add(addbtn);
        addbtn.setBounds(640, 240, 200, 50);

        resetbtn.setBackground(new java.awt.Color(71, 120, 197));
        resetbtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        resetbtn.setForeground(new java.awt.Color(0, 0, 0));
        resetbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/User/icon/icons8_reset_43px_1.png"))); // NOI18N
        resetbtn.setText("Reset");
        resetbtn.setToolTipText("Clear field data.");
        resetbtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 2, true));
        resetbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetbtnMouseClicked(evt);
            }
        });
        jPanel3.add(resetbtn);
        resetbtn.setBounds(640, 360, 200, 50);

        deletebtn.setBackground(new java.awt.Color(71, 120, 197));
        deletebtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        deletebtn.setForeground(new java.awt.Color(0, 0, 0));
        deletebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/User/icon/icons8_delete_43px.png"))); // NOI18N
        deletebtn.setText("Delete");
        deletebtn.setToolTipText("");
        deletebtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 2, true));
        deletebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletebtnMouseClicked(evt);
            }
        });
        jPanel3.add(deletebtn);
        deletebtn.setBounds(640, 420, 200, 50);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/User/icon/icons8_user_20px_1.png"))); // NOI18N
        jLabel10.setText("Username");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(50, 220, 100, 33);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/User/icon/icons8_stack_exchange_answer_20px.png"))); // NOI18N
        jLabel11.setText("Security Answer");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(410, 390, 143, 33);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/User/icon/icons8_change_user_20px.png"))); // NOI18N
        jLabel12.setText("User Type");
        jLabel12.setToolTipText("");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(50, 300, 110, 33);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/User/icon/icons8_password_20px.png"))); // NOI18N
        jLabel13.setText("Password");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(410, 220, 100, 33);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/User/icon/icons8_password_20px_1.png"))); // NOI18N
        jLabel14.setText("Confirm Password");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(410, 300, 160, 33);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/User/icon/icons8_security_20px.png"))); // NOI18N
        jLabel15.setText("Security Question");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(50, 390, 160, 33);

        printbtn.setBackground(new java.awt.Color(71, 120, 197));
        printbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/User/icon/icons8_print_30px_1.png"))); // NOI18N
        printbtn.setToolTipText("Print");
        printbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printbtnMouseClicked(evt);
            }
        });
        jPanel3.add(printbtn);
        printbtn.setBounds(810, 100, 30, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/User/icon/icons8_users_40px_2.png"))); // NOI18N
        jLabel16.setText("User List");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(338, 5, 130, 40);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 860, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        Adminapp a = new Adminapp();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtnActionPerformed
        // TODO add your handling code here:
        getToolkit().beep();
        int logoutResult = JOptionPane.showConfirmDialog (this, "Do you want to logout?","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(logoutResult == JOptionPane.YES_OPTION){
            LoginForm l = new LoginForm();
            l.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_logoutbtnActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        Stock s=new Stock();
        s.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void addbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbtnMouseClicked
        // TODO add your handling code here:
        if(usertxt.getText().isEmpty()||Passwordtxt.getText().isEmpty()||conPasswordtxt.getText().isEmpty()||secQues.getText().isEmpty()||secAns.getText().isEmpty())
        {
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "Empty filed Detected!");
        }else{
            if(Passwordtxt.getText().equals(conPasswordtxt.getText())){
                try{
                con = DriverManager.getConnection("jdbc:mysql://localhost/multiuserlogin", "root", "");
                PreparedStatement add=con.prepareStatement("INSERT INTO `multiuserlogin` VALUES(?,?,?,?,?)");
                add.setString(1, usertxt.getText());
                add.setString(2, new String(Passwordtxt.getPassword()));
                add.setString(3, String.valueOf(userComboBox.getSelectedItem()));
                add.setString(4, secQues.getText());
                add.setString(5, secAns.getText());

                int row = add.executeUpdate();
                getToolkit().beep();
                JOptionPane.showMessageDialog(this, "New User Added.");
                Displayusers();
                Reset();
                } catch (SQLException ex) {
                Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                getToolkit().beep();
                JOptionPane.showMessageDialog(this, "Passwords dosen't Match");
            }
        }
    }//GEN-LAST:event_addbtnMouseClicked

    private void resetbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetbtnMouseClicked
        // TODO add your handling code here:
        Reset();
    }//GEN-LAST:event_resetbtnMouseClicked

    private void printbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printbtnMouseClicked
        // TODO add your handling code here:
        try{
            UsersTable.print();
        }catch(Exception e){
        
        }
    }//GEN-LAST:event_printbtnMouseClicked

    private void UsersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsersTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)UsersTable.getModel();
        int MyIndex = UsersTable.getSelectedRow();
        usertxt.setText(model.getValueAt(MyIndex, 0).toString());
        Passwordtxt.setText(model.getValueAt(MyIndex, 1).toString());
        userComboBox.setSelectedItem(model.getValueAt(MyIndex, 2).toString());
        secQues.setText(model.getValueAt(MyIndex, 3).toString());
        secAns.setText(model.getValueAt(MyIndex, 4).toString());
        
    }//GEN-LAST:event_UsersTableMouseClicked

    private void editbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editbtnMouseClicked
        // TODO add your handling code here:
        if(usertxt.getText().isEmpty()||Passwordtxt.getText().isEmpty()||secQues.getText().isEmpty()||secAns.getText().isEmpty())
        {
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "Empty filed Detected!");
        }else{
            try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/multiuserlogin", "root", "");
            String Uname = usertxt.getText();
            String Query = "UPDATE `multiuserlogin` SET password='"+Passwordtxt.getText()+"',usertype='"+String.valueOf(userComboBox.getSelectedItem())+"',securityQ='"+secQues.getText()+"',securityAns='"+secAns.getText()+"' WHERE username='"+Uname+"'"; 
            Statement Delete = con.createStatement();
            Delete.executeUpdate(Query);
            JOptionPane.showMessageDialog(this, "User Updated!");
            Displayusers();
            Reset();
        } catch (SQLException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_editbtnMouseClicked

    private void deletebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebtnMouseClicked
        // TODO add your handling code here:
        if(usertxt.getText().isEmpty())
        {
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "Empty filed Detected Plese Enter or Select correct Username and Try Again!");
        }else if(userComboBox.getSelectedIndex()==0){
            getToolkit().beep();
            ImageIcon icon = new ImageIcon(getClass().getResource("/User/icon/icons8_stop_sign_50px.png"));
            JOptionPane.showMessageDialog(null,"Can't Delete Administator!","Override",JOptionPane.WARNING_MESSAGE, icon);
        }else{
            getToolkit().beep();
            int logoutResult = JOptionPane.showConfirmDialog (this, "Do you want to Delete User?","Confirm",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.ERROR_MESSAGE);
            if(logoutResult == JOptionPane.YES_OPTION){
                try{
                con = DriverManager.getConnection("jdbc:mysql://localhost/multiuserlogin", "root", "");
                String Uname = usertxt.getText();
                ResultSet rs1=st.executeQuery("SELECT * FROM `multiuserlogin` WHERE username='"+Uname+"'");
                if(rs1.next()){
                    String Query = "DELETE FROM `multiuserlogin` WHERE username='"+Uname+"'";
                    Statement Delete = con.createStatement();
                    Delete.executeUpdate(Query);
                    getToolkit().beep();
                    JOptionPane.showMessageDialog(this,"User Deleted.");
                    Displayusers();
                    Reset();
                    }else{
                        getToolkit().beep();
                        JOptionPane.showMessageDialog(null,"Plese Enter or Select correct Username and Try Again!");
                    }
                } catch (SQLException ex) {
                Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if(logoutResult == JOptionPane.CANCEL_OPTION){
                getToolkit().beep();
                Displayusers();
                Reset();
            }
            
        }
    }//GEN-LAST:event_deletebtnMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        Reports r = new Reports();
        r.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel9MouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Users().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Passwordtxt;
    private javax.swing.JTable UsersTable;
    private javax.swing.JButton addbtn;
    private javax.swing.JPasswordField conPasswordtxt;
    private javax.swing.JButton deletebtn;
    private javax.swing.JButton editbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutbtn;
    private javax.swing.JButton printbtn;
    private javax.swing.JButton resetbtn;
    private javax.swing.JTextField secAns;
    private javax.swing.JTextField secQues;
    private javax.swing.JComboBox<String> userComboBox;
    private javax.swing.JTextField usertxt;
    // End of variables declaration//GEN-END:variables
}
