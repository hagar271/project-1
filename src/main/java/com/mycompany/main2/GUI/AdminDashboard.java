package com.mycompany.main2.GUI;

import com.mycompany.main2.Admin;

import javax.swing.table.DefaultTableModel;


public class AdminDashboard extends javax.swing.JFrame {
      
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(AdminDashboard.class.getName());
private javax.swing.JTable beneficiaryTable;
    private Admin currentUser;

  
    public AdminDashboard() {
        
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sButton = new javax.swing.JButton();
        nonsButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        bgLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("الصفحه الرئيسه");
        setMaximumSize(new java.awt.Dimension(300, 600));
        setMinimumSize(new java.awt.Dimension(300, 600));
        setPreferredSize(new java.awt.Dimension(300, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        sButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sButton.setForeground(new java.awt.Color(0, 102, 153));
        sButton.setText("مشروعات ثابته ");
        sButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sButtonActionPerformed(evt);
            }
        });
        getContentPane().add(sButton);
        sButton.setBounds(20, 230, 170, 40);

        nonsButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nonsButton.setForeground(new java.awt.Color(0, 102, 153));
        nonsButton.setText("مشروعات غير ثابته");
        nonsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nonsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(nonsButton);
        nonsButton.setBounds(160, 300, 190, 40);

        backButton.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(0, 102, 153));
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton);
        backButton.setBounds(230, 520, 110, 32);

        bgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin.jpg"))); // NOI18N
        getContentPane().add(bgLabel);
        bgLabel.setBounds(-10, -10, 370, 700);

        setBounds(0, 0, 374, 664);
    }// </editor-fold>//GEN-END:initComponents

    private void sButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sButtonActionPerformed
        NonFixedProjectsPage locationPage = new  NonFixedProjectsPage();
         locationPage.setVisible(true);
           this.dispose();
    }//GEN-LAST:event_sButtonActionPerformed

    private void nonsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nonsButtonActionPerformed
         location locationPage = new  location();
         locationPage.setVisible(true);
           this.dispose();
    }//GEN-LAST:event_nonsButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
      login loginPage = new  login();
         loginPage.setVisible(true);
           this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed




    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> new AdminDashboard().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel bgLabel;
    private javax.swing.JButton nonsButton;
    private javax.swing.JButton sButton;
    // End of variables declaration//GEN-END:variables
}
