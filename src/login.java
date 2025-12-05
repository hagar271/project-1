import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(login.class.getName());

   
    public login() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new javax.swing.JButton();
        idLabel = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        forpasslabel = new javax.swing.JLabel();
        logButton = new javax.swing.JButton();
        bakelabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("تسجيل الدخول");
        getContentPane().setLayout(null);

        backButton.setBackground(new java.awt.Color(0, 102, 153));
        backButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton);
        backButton.setBounds(280, 10, 75, 23);

        idLabel.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        idLabel.setForeground(new java.awt.Color(0, 102, 153));
        idLabel.setText("ID");
        getContentPane().add(idLabel);
        idLabel.setBounds(80, 340, 40, 70);

        idField.setBackground(new java.awt.Color(0, 102, 153));
        idField.setForeground(new java.awt.Color(255, 255, 255));
        idField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFieldActionPerformed(evt);
            }
        });
        getContentPane().add(idField);
        idField.setBounds(100, 400, 160, 30);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setText("Password");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 430, 110, 40);

        PasswordField.setBackground(new java.awt.Color(0, 102, 153));
        PasswordField.setForeground(new java.awt.Color(255, 255, 255));
        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });
        getContentPane().add(PasswordField);
        PasswordField.setBounds(100, 480, 160, 30);

        forpasslabel.setBackground(new java.awt.Color(0, 51, 102));
        forpasslabel.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        forpasslabel.setForeground(new java.awt.Color(0, 102, 153));
        forpasslabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        forpasslabel.setText("Forget password ?");
        getContentPane().add(forpasslabel);
        forpasslabel.setBounds(110, 520, 140, 30);

        logButton.setBackground(new java.awt.Color(0, 102, 153));
        logButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logButton.setForeground(new java.awt.Color(255, 255, 255));
        logButton.setText("login");
        logButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logButtonActionPerformed(evt);
            }
        });
        getContentPane().add(logButton);
        logButton.setBounds(140, 560, 75, 23);

        bakelabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/تسجيل.jpg"))); // NOI18N
        getContentPane().add(bakelabel);
        bakelabel.setBounds(-10, 0, 370, 630);

        setBounds(0, 0, 376, 635);
    }// </editor-fold>//GEN-END:initComponents

    private void idFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idFieldActionPerformed

    private void logButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logButtonActionPerformed

         String id = idField.getText();
        String pass = new String(PasswordField.getPassword());

       if(id.equals("Leader")&& pass.equals("122026")) {  
    // افتح صفحة الاختيارات
    AdminDashboard loc = new AdminDashboard(); // ممكن تخلي userType ثابت أو تحطي أي اسم
    loc.setVisible(true);
    this.dispose();
        } else {
    JOptionPane.showMessageDialog(this, "Password غير صحيح");
          }
            
        
    }//GEN-LAST:event_logButtonActionPerformed

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        next nextPage = new next();   // افتح صفحة next
       nextPage.setVisible(true);    
       this.dispose(); 
    }//GEN-LAST:event_backButtonActionPerformed

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new login().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel bakelabel;
    private javax.swing.JLabel forpasslabel;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logButton;
    // End of variables declaration//GEN-END:variables
}
