
public class NonFixedProjectsPage extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(NonFixedProjectsPage.class.getName());

    
    public NonFixedProjectsPage() {
        initComponents();
         
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fielLabel = new javax.swing.JLabel();
        healtyButton = new javax.swing.JButton();
        educButton = new javax.swing.JButton();
        eatButton = new javax.swing.JButton();
        pairButton = new javax.swing.JButton();
        duonButton = new javax.swing.JButton();
        banadmButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ملفاات");
        getContentPane().setLayout(null);

        fielLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        fielLabel.setForeground(new java.awt.Color(255, 255, 255));
        fielLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fielLabel.setText("ملفات");
        getContentPane().add(fielLabel);
        fielLabel.setBounds(60, 100, 230, 80);

        healtyButton.setBackground(new java.awt.Color(0, 102, 153));
        healtyButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        healtyButton.setForeground(new java.awt.Color(255, 255, 255));
        healtyButton.setText("صحه");
        healtyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                healtyButtonActionPerformed(evt);
            }
        });
        getContentPane().add(healtyButton);
        healtyButton.setBounds(30, 250, 100, 40);

        educButton.setBackground(new java.awt.Color(0, 102, 153));
        educButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        educButton.setForeground(new java.awt.Color(255, 255, 255));
        educButton.setText("تعليم");
        educButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                educButtonActionPerformed(evt);
            }
        });
        getContentPane().add(educButton);
        educButton.setBounds(130, 360, 90, 40);

        eatButton.setBackground(new java.awt.Color(0, 102, 153));
        eatButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        eatButton.setForeground(new java.awt.Color(255, 255, 255));
        eatButton.setText("اطعام");
        eatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eatButtonActionPerformed(evt);
            }
        });
        getContentPane().add(eatButton);
        eatButton.setBounds(30, 400, 100, 40);

        pairButton.setBackground(new java.awt.Color(0, 102, 153));
        pairButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pairButton.setForeground(new java.awt.Color(255, 255, 255));
        pairButton.setText("عرايس");
        pairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pairButtonActionPerformed(evt);
            }
        });
        getContentPane().add(pairButton);
        pairButton.setBounds(220, 320, 100, 40);

        duonButton.setBackground(new java.awt.Color(0, 102, 153));
        duonButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        duonButton.setForeground(new java.awt.Color(255, 255, 255));
        duonButton.setText("غارمات");
        duonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duonButtonActionPerformed(evt);
            }
        });
        getContentPane().add(duonButton);
        duonButton.setBounds(130, 290, 90, 32);

        banadmButton.setBackground(new java.awt.Color(0, 102, 153));
        banadmButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        banadmButton.setForeground(new java.awt.Color(255, 255, 255));
        banadmButton.setText("انسان");
        banadmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                banadmButtonActionPerformed(evt);
            }
        });
        getContentPane().add(banadmButton);
        banadmButton.setBounds(40, 320, 90, 32);

        backButton.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(0, 102, 153));
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton);
        backButton.setBounds(220, 510, 130, 32);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/location.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-10, -40, 390, 730);

        setBounds(0, 0, 374, 653);
    }// </editor-fold>//GEN-END:initComponents

    private void educButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_educButtonActionPerformed
        educ educPage = new  educ();
         educPage.setVisible(true);
           this.dispose();
    }//GEN-LAST:event_educButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
             AdminDashboard adminPage = new  AdminDashboard();
         adminPage.setVisible(true);
           this.dispose();       
    }//GEN-LAST:event_backButtonActionPerformed

    private void healtyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_healtyButtonActionPerformed
        healty healtyPage = new  healty();
         healtyPage.setVisible(true);
           this.dispose();
    }//GEN-LAST:event_healtyButtonActionPerformed

    private void duonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duonButtonActionPerformed
         duon duonPage = new  duon();
         duonPage.setVisible(true);
           this.dispose();
    }//GEN-LAST:event_duonButtonActionPerformed

    private void pairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pairButtonActionPerformed
         pair  pairPage = new   pair();
          pairPage.setVisible(true);
           this.dispose();
    }//GEN-LAST:event_pairButtonActionPerformed

    private void eatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eatButtonActionPerformed
         eat   eatPage = new  eat();
           eatPage.setVisible(true);
           this.dispose();
    }//GEN-LAST:event_eatButtonActionPerformed

    private void banadmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_banadmButtonActionPerformed
         ban  banPage = new  ban();
            banPage.setVisible(true);
           this.dispose();
    }//GEN-LAST:event_banadmButtonActionPerformed


    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> new NonFixedProjectsPage().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton banadmButton;
    private javax.swing.JButton duonButton;
    private javax.swing.JButton eatButton;
    private javax.swing.JButton educButton;
    private javax.swing.JLabel fielLabel;
    private javax.swing.JButton healtyButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton pairButton;
    // End of variables declaration//GEN-END:variables
}
