/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dental_clinic;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
public class dentalAdminPanel2 extends javax.swing.JFrame {

  public void Connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dental", "root", "padabaKO21");
            System.out.println("Connected!");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(patientInformationFrame.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error 1!");
        } catch (SQLException ex) {
            Logger.getLogger(patientInformationFrame.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error 2!");
        }

    }
    /**
     * Creates new form dentalAdminPanel2
     */
    public dentalAdminPanel2() {
        initComponents();
        this.setLocationRelativeTo(null);
        Connect();
    }
    
    Connection con;
    PreparedStatement pst;
    private boolean validateFields(String formType) {
        if (formType.equals("edit") && !employeeName.getText().equals("") && !employeeUsername.getText().equals("") && !employeePassword.getText().equals("") && !employeeRePassword.getText().equals("")) {
            return false;
        } else if (formType.equals("new") && !employeeName.getText().equals("") && !employeeUsername.getText().equals("") && !employeePassword.getText().equals("") && !employeeRePassword.getText().equals("")) {
            return false;
        } else {
            return true;
        }

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
        logoutBtn = new javax.swing.JButton();
        removeBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        employeeUsername = new javax.swing.JTextField();
        employeeName = new javax.swing.JTextField();
        exitBtn = new javax.swing.JButton();
        employeeRePassword = new javax.swing.JPasswordField();
        employeePassword = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        logoutBtn.setBorderPainted(false);
        logoutBtn.setContentAreaFilled(false);
        logoutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });
        jPanel1.add(logoutBtn);
        logoutBtn.setBounds(960, 610, 120, 40);

        removeBtn.setBorderPainted(false);
        removeBtn.setContentAreaFilled(false);
        removeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });
        jPanel1.add(removeBtn);
        removeBtn.setBounds(790, 610, 120, 40);

        clearBtn.setBorderPainted(false);
        clearBtn.setContentAreaFilled(false);
        clearBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        jPanel1.add(clearBtn);
        clearBtn.setBounds(960, 540, 120, 40);

        addBtn.setBorderPainted(false);
        addBtn.setContentAreaFilled(false);
        addBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        jPanel1.add(addBtn);
        addBtn.setBounds(790, 540, 120, 40);

        employeeUsername.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        employeeUsername.setBorder(null);
        jPanel1.add(employeeUsername);
        employeeUsername.setBounds(840, 260, 250, 30);

        employeeName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        employeeName.setBorder(null);
        jPanel1.add(employeeName);
        employeeName.setBounds(840, 160, 250, 30);

        exitBtn.setBorderPainted(false);
        exitBtn.setContentAreaFilled(false);
        exitBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(exitBtn);
        exitBtn.setBounds(1060, 40, 50, 60);

        employeeRePassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        employeeRePassword.setBorder(null);
        jPanel1.add(employeeRePassword);
        employeeRePassword.setBounds(840, 450, 250, 30);

        employeePassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        employeePassword.setBorder(null);
        jPanel1.add(employeePassword);
        employeePassword.setBounds(840, 350, 250, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Employee Username", "Employee Name", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(70, 190, 630, 450);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Windows10\\Downloads\\new dede.png")); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jLabel1ComponentShown(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1170, 710);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?", null, JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION){
            this.setVisible(false);
            new employeeLoginFrame().setVisible(true);
        }
        
    }//GEN-LAST:event_exitBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
    if (validateFields("new")){
        JOptionPane.showMessageDialog(null, "Fields cannot be left blank.",null, JOptionPane.ERROR_MESSAGE);
        return;
        
    }
  
        String name = employeeName.getText();
        String ID = employeeUsername.getText();
        String password = employeePassword.getText();
        String repassword = employeeRePassword.getText();
        
      
        try{
            
            pst = con.prepareStatement("INSERT INTO employeeaccounts (employeeUserName, employeeName, employeePassword) VALUES (?,?,?)");
            
                
                pst.setString(1, ID);
                pst.setString(2, name);
                pst.setString(3, password);
                 
                
                if(!password.contains(repassword)){
                    JOptionPane.showMessageDialog(null, "Passwords does not match");
                    
                }
                else{
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "User added successfully.");
                setVisible(false);
                new dentalAdminPanel2().setVisible(true);
                }
            
        }catch (SQLIntegrityConstraintViolationException e){
            JOptionPane.showMessageDialog(null,"User ID already exist.");
            employeeName.setText("");
            employeeUsername.setText("");
            employeePassword.setText("");
            employeeRePassword.setText("");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error saving user.", "Error", JOptionPane.ERROR_MESSAGE);
            employeeName.setText("");
            employeeUsername.setText("");
            employeePassword.setText("");
            employeeRePassword.setText("");
            
            
        }
        formComponentShown(null);
        
        
        
    }//GEN-LAST:event_addBtnActionPerformed

    private void jLabel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel1ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1ComponentShown

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT *FROM employeeaccounts");
            
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.setRowCount(0);
            
            while(rs.next()){
                model.addRow(new Object[]{rs.getString("employeeID"),rs.getString("employeeUserName"),rs.getString("employeeName"),rs.getString("employeePassword")});
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        clearBtn.setEnabled(false);
        
        
    }//GEN-LAST:event_formComponentShown

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
      int choice =  JOptionPane.showConfirmDialog(null,"Are you sure you want to log out?",null,JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION){
        setVisible(false);
        new employeeLoginFrame().setVisible(true);
        }
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        int selectedRow = jTable1.getSelectedRow();

            // Get values from the selected row based on column index
            String employeeIDValue = jTable1.getValueAt(selectedRow, 0).toString();
            String employeeNameValue = jTable1.getValueAt(selectedRow, 1).toString();
            String employeePasswordValue = jTable1.getValueAt(selectedRow, 2).toString();

            // Set the values in the respective text fields
            employeeUsername.setText(employeeIDValue);
            employeeName.setText(employeeNameValue);
            employeePassword.setText(employeePasswordValue);
            
            employeeUsername.setEnabled(false);
            employeeName.setEnabled(false);
            employeePassword.setEnabled(false);
            employeeRePassword.setEnabled(false);
            
            clearBtn.setEnabled(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
       employeeName.setText("");
            employeeUsername.setText("");
            employeePassword.setText("");
            employeeRePassword.setText("");
            
             employeeUsername.setEnabled(true);
            employeeName.setEnabled(true);
            employeePassword.setEnabled(true);
            employeeRePassword.setEnabled(true);
    }//GEN-LAST:event_clearBtnActionPerformed

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
        
         String name = employeeName.getText();
         String ID = employeeUsername.getText();
         String password = employeePassword.getText();
         String repassword = employeeRePassword.getText();
         
          try{
            
             pst = con.prepareStatement("DELETE FROM employeeaccounts WHERE employeeUserName = ? AND employeeName = ? AND employeePassword = ?");
            
                
                pst.setString(1, ID);
                pst.setString(2, name);
                pst.setString(3, password);
                
                int rowsDeleted = pst.executeUpdate();
        
                if (rowsDeleted > 0) {
                    JOptionPane.showMessageDialog(null, "Removed Successfully.");
                } else {
                    JOptionPane.showMessageDialog(null, "No matching record found.");
                }
          }
          catch(SQLException e){
              e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error occurred while trying to remove the record.");
          }
         
    }//GEN-LAST:event_removeBtnActionPerformed

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
            java.util.logging.Logger.getLogger(dentalAdminPanel2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dentalAdminPanel2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dentalAdminPanel2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dentalAdminPanel2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dentalAdminPanel2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JTextField employeeName;
    private javax.swing.JPasswordField employeePassword;
    private javax.swing.JPasswordField employeeRePassword;
    private javax.swing.JTextField employeeUsername;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton removeBtn;
    // End of variables declaration//GEN-END:variables
}
