/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package airlinemanagement;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author omkar
 */
public class add_customer extends javax.swing.JFrame {

    /**
     * Creates new form add_customer
     */
    public add_customer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lpassno1 = new javax.swing.JLabel();
        taddress = new javax.swing.JTextField();
        lpnr = new javax.swing.JLabel();
        tname = new javax.swing.JTextField();
        laddress = new javax.swing.JLabel();
        rmale = new javax.swing.JRadioButton();
        lnat = new javax.swing.JLabel();
        rfemale = new javax.swing.JRadioButton();
        lname = new javax.swing.JLabel();
        tph = new javax.swing.JTextField();
        lgender = new javax.swing.JLabel();
        btnsubmit = new javax.swing.JButton();
        lph = new javax.swing.JLabel();
        tnat = new javax.swing.JTextField();
        tfcode = new javax.swing.JTextField();
        tpassno = new javax.swing.JTextField();
        lfcode = new javax.swing.JLabel();
        tpnr = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        achome = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 1, 36)); // NOI18N
        jLabel1.setText("Airline Management System");

        jLabel2.setFont(new java.awt.Font("Eras Bold ITC", 1, 36)); // NOI18N
        jLabel2.setText("Airline Management System");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lpassno1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        lpassno1.setText("Passport No");

        lpnr.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        lpnr.setText("PNR No");

        laddress.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        laddress.setText("Address");

        rmale.setText("male");

        lnat.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        lnat.setText("Nationality");

        rfemale.setText("female");

        lname.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        lname.setText("Name");

        lgender.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        lgender.setText("Gender");

        btnsubmit.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        btnsubmit.setText("Submit");
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });

        lph.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        lph.setText("Ph No");

        tnat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnatActionPerformed(evt);
            }
        });

        tfcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfcodeActionPerformed(evt);
            }
        });

        lfcode.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        lfcode.setText("Flight Code");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel3.setText("Passenger Information");

        jPanel2.setBackground(new java.awt.Color(40, 139, 168));

        achome.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        achome.setText("HOME");
        achome.setMargin(new java.awt.Insets(6, 10, 6, 10));
        achome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                achomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(achome)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(achome)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lpnr)
                                .addGap(18, 18, 18)
                                .addComponent(tpassno, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lfcode)
                                .addGap(18, 18, 18)
                                .addComponent(tnat, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lpassno1)
                                .addGap(18, 18, 18)
                                .addComponent(tfcode, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lnat)
                                    .addComponent(laddress)
                                    .addComponent(lname)
                                    .addComponent(lph)
                                    .addComponent(lgender))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tpnr, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(taddress, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tname, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tph, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnsubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(rmale)
                                                .addGap(18, 18, 18)
                                                .addComponent(rfemale, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lfcode)
                            .addComponent(tnat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lpassno1))
                    .addComponent(tfcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lpnr)
                    .addComponent(tpassno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tpnr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(laddress))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lnat)
                    .addComponent(taddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lname)
                    .addComponent(tname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tph, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lph))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rfemale)
                    .addComponent(rmale)
                    .addComponent(lgender))
                .addGap(11, 11, 11)
                .addComponent(btnsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        // TODO add your handling code here:
        String passport_No = tpassno.getText();
        String pnr_no = tpnr.getText();
        String address =  taddress.getText();
        String nationality = tnat.getText();
        String name = tname.getText();
        String fl_code = tfcode.getText();

        String gender = null;
        String ph_no = tph.getText();

        if(rmale.isSelected()){
            gender = "male";

        }else if(rfemale.isSelected()){
            gender = "female";
        }

        try {
            conn c = new conn();
            String str = "INSERT INTO passenger values( '"+pnr_no+"', '"+address+"', '"+nationality+"','"+name+"', '"+gender+"', '"+ph_no+"','"+passport_No+"', '"+fl_code+"')";

            c.s.executeUpdate(str);
            JOptionPane.showMessageDialog(null,"Customer Added");
            setVisible(false);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnsubmitActionPerformed

    private void tfcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfcodeActionPerformed

    private void achomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_achomeActionPerformed
        // TODO add your handling code here:
        mainframe achome=new mainframe();
        achome.setVisible(true);
    }//GEN-LAST:event_achomeActionPerformed

    private void tnatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnatActionPerformed

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
            java.util.logging.Logger.getLogger(add_customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton achome;
    private javax.swing.JButton btnsubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel laddress;
    private javax.swing.JLabel lfcode;
    private javax.swing.JLabel lgender;
    private javax.swing.JLabel lname;
    private javax.swing.JLabel lnat;
    private javax.swing.JLabel lpassno1;
    private javax.swing.JLabel lph;
    private javax.swing.JLabel lpnr;
    private javax.swing.JRadioButton rfemale;
    private javax.swing.JRadioButton rmale;
    private javax.swing.JTextField taddress;
    private javax.swing.JTextField tfcode;
    private javax.swing.JTextField tname;
    private javax.swing.JTextField tnat;
    private javax.swing.JTextField tpassno;
    private javax.swing.JTextField tph;
    private javax.swing.JTextField tpnr;
    // End of variables declaration//GEN-END:variables
}
