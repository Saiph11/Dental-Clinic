/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dental_clinic;

import static dental_clinic.patientInformationFrame.patientInputName;
import static dental_clinic.patientInformationFrame.priority;
import java.sql.ResultSet;
import java.sql.*;
import dow.ConnectionProvider;
import java.sql.Statement;
import java.sql.Connection;
import javax.swing.JOptionPane;



public class queueNumberFrame extends javax.swing.JFrame {

    /**
     * Creates new form queueNumberFrame
     */
    public queueNumberFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        System.out.println(priority);
        
        if(priority.equals("Patient is a priority")){
            try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rsCheck = st.executeQuery("SELECT * FROM prioritypatientrecords WHERE patientName ='" + patientInputName + "'");

             
            if(rsCheck.next()){
                jPanel2.setVisible(false);
                userQueueNum.setText(rsCheck.getString("patient_pk"));
                System.out.println(rsCheck.getString("patient_pk"));
            }
               
                
                

                
        }
        catch(Exception e){
            
        }
        }else if (priority.equals("Patient is not a priority")){
            try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rsCheck = st.executeQuery("SELECT * FROM patientrecords WHERE patientName ='" + patientInputName + "'");

        
                
                if(rsCheck.next()){

                userQueueNum.setText(rsCheck.getString("patient_pk"));
                System.out.println(rsCheck.getString("patient_pk"));
            }
            }
               
    
        catch(Exception e){
            
        }
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
        userQueueNum = new javax.swing.JLabel();
        returnBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        userQueueNum.setFont(new java.awt.Font("Segoe UI", 1, 70)); // NOI18N
        userQueueNum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userQueueNum.setText("000");
        jPanel1.add(userQueueNum);
        userQueueNum.setBounds(240, 230, 230, 110);

        returnBtn.setBorderPainted(false);
        returnBtn.setContentAreaFilled(false);
        returnBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        returnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBtnActionPerformed(evt);
            }
        });
        jPanel1.add(returnBtn);
        returnBtn.setBounds(40, 50, 50, 40);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jPanel2);
        jPanel2.setBounds(440, 60, 100, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Paul Laurence Reyes\\Documents\\NU\\2nd Year\\DATA STRUCTURES AND ALGORITHMS\\Dental_UI\\queueNumber (1).png")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 710, 530);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 528));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBtnActionPerformed
this.setVisible(false);

    }//GEN-LAST:event_returnBtnActionPerformed

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
            java.util.logging.Logger.getLogger(queueNumberFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(queueNumberFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(queueNumberFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(queueNumberFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new queueNumberFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton returnBtn;
    private javax.swing.JLabel userQueueNum;
    // End of variables declaration//GEN-END:variables
}
