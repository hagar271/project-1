
public class next extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(next.class.getName());

    
    public next() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nextButton = new javax.swing.JButton();
        bLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("صناع حياه");
        getContentPane().setLayout(null);

        nextButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nextButton.setForeground(new java.awt.Color(0, 102, 153));
        nextButton.setText("NEXT");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });
        getContentPane().add(nextButton);
        nextButton.setBounds(110, 570, 140, 30);

        bLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/next.jpg"))); // NOI18N
        getContentPane().add(bLabel);
        bLabel.setBounds(-20, 0, 390, 630);

        setBounds(0, 0, 374, 649);
    }// </editor-fold>//GEN-END:initComponents

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
       login loginPage = new login();   // افتح صفحة login
     loginPage.setVisible(true);      // خليها تظهر
     this.dispose();   
    }//GEN-LAST:event_nextButtonActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> new next().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bLabel;
    private javax.swing.JButton nextButton;
    // End of variables declaration//GEN-END:variables
}
