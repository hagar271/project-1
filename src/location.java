
import javax.swing.JFrame;


public class location extends javax.swing.JFrame {
      

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(location.class.getName());


    
    
    public location() {
   
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manLabel = new javax.swing.JLabel();
        kaflButton = new javax.swing.JButton();
        altfButton = new javax.swing.JButton();
        zouhrButton = new javax.swing.JButton();
        saftyButton = new javax.swing.JButton();
        mansButton = new javax.swing.JButton();
        sorhButton = new javax.swing.JButton();
        ahmedmButton = new javax.swing.JButton();
        kathButton = new javax.swing.JButton();
        marButton = new javax.swing.JButton();
        outButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        locationLabel = new javax.swing.JLabel();
        bLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("منطقه");
        getContentPane().setLayout(null);

        manLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        manLabel.setForeground(new java.awt.Color(0, 102, 153));
        manLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manLabel.setText("اختار المنطقه");
        getContentPane().add(manLabel);
        manLabel.setBounds(100, 220, 160, 40);

        kaflButton.setBackground(new java.awt.Color(0, 102, 153));
        kaflButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        kaflButton.setForeground(new java.awt.Color(255, 255, 255));
        kaflButton.setText("كفر مليط ");
        kaflButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaflButtonActionPerformed(evt);
            }
        });
        getContentPane().add(kaflButton);
        kaflButton.setBounds(20, 260, 110, 40);

        altfButton.setBackground(new java.awt.Color(0, 102, 153));
        altfButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        altfButton.setForeground(new java.awt.Color(255, 255, 255));
        altfButton.setText("العطف");
        altfButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altfButtonActionPerformed(evt);
            }
        });
        getContentPane().add(altfButton);
        altfButton.setBounds(140, 420, 100, 40);

        zouhrButton.setBackground(new java.awt.Color(0, 102, 153));
        zouhrButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        zouhrButton.setForeground(new java.awt.Color(255, 255, 255));
        zouhrButton.setText("الزهور");
        zouhrButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zouhrButtonActionPerformed(evt);
            }
        });
        getContentPane().add(zouhrButton);
        zouhrButton.setBounds(130, 290, 100, 40);

        saftyButton.setBackground(new java.awt.Color(0, 102, 153));
        saftyButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        saftyButton.setForeground(new java.awt.Color(255, 255, 255));
        saftyButton.setText("الصفتى ");
        saftyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saftyButtonActionPerformed(evt);
            }
        });
        getContentPane().add(saftyButton);
        saftyButton.setBounds(230, 250, 100, 40);

        mansButton.setBackground(new java.awt.Color(0, 102, 153));
        mansButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mansButton.setForeground(new java.awt.Color(255, 255, 255));
        mansButton.setText("المنشية");
        mansButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mansButtonActionPerformed(evt);
            }
        });
        getContentPane().add(mansButton);
        mansButton.setBounds(240, 380, 100, 40);

        sorhButton.setBackground(new java.awt.Color(0, 102, 153));
        sorhButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sorhButton.setForeground(new java.awt.Color(255, 255, 255));
        sorhButton.setText("شارع الثورة");
        sorhButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sorhButtonActionPerformed(evt);
            }
        });
        getContentPane().add(sorhButton);
        sorhButton.setBounds(220, 330, 120, 40);

        ahmedmButton.setBackground(new java.awt.Color(0, 102, 153));
        ahmedmButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ahmedmButton.setForeground(new java.awt.Color(255, 255, 255));
        ahmedmButton.setText("شارع احمد ماهر  ");
        ahmedmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ahmedmButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ahmedmButton);
        ahmedmButton.setBounds(20, 330, 200, 40);

        kathButton.setBackground(new java.awt.Color(0, 102, 153));
        kathButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        kathButton.setForeground(new java.awt.Color(255, 255, 255));
        kathButton.setText("القطعة  ");
        kathButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kathButtonActionPerformed(evt);
            }
        });
        getContentPane().add(kathButton);
        kathButton.setBounds(210, 460, 120, 40);

        marButton.setBackground(new java.awt.Color(0, 102, 153));
        marButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        marButton.setForeground(new java.awt.Color(255, 255, 255));
        marButton.setText("شارع البحر  ");
        marButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marButtonActionPerformed(evt);
            }
        });
        getContentPane().add(marButton);
        marButton.setBounds(20, 380, 120, 40);

        outButton.setBackground(new java.awt.Color(0, 102, 153));
        outButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        outButton.setForeground(new java.awt.Color(255, 255, 255));
        outButton.setText("خارج المحمودية");
        outButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outButtonActionPerformed(evt);
            }
        });
        getContentPane().add(outButton);
        outButton.setBounds(30, 460, 180, 40);

        backButton.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(0, 102, 153));
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton);
        backButton.setBounds(150, 520, 90, 30);

        locationLabel.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        locationLabel.setForeground(new java.awt.Color(255, 255, 255));
        locationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        locationLabel.setText("Location");
        getContentPane().add(locationLabel);
        locationLabel.setBounds(90, 80, 170, 110);

        bLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/location.jpg"))); // NOI18N
        getContentPane().add(bLabel);
        bLabel.setBounds(-20, -80, 380, 790);

        setBounds(0, 0, 374, 674);
    }// </editor-fold>//GEN-END:initComponents

    private void altfButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altfButtonActionPerformed
        comp comp = new comp();
         comp.setVisible(true);
           this.dispose(); 
    }//GEN-LAST:event_altfButtonActionPerformed

    private void kaflButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaflButtonActionPerformed
       kafr category = new kafr();
         category.setVisible(true);
           this.dispose();
    }//GEN-LAST:event_kaflButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
          AdminDashboard adminPage = new  AdminDashboard();
         adminPage.setVisible(true);
           this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void zouhrButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zouhrButtonActionPerformed
        zouher zouherPage = new zouher();
         zouherPage.setVisible(true);
           this.dispose();
    }//GEN-LAST:event_zouhrButtonActionPerformed

    private void saftyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saftyButtonActionPerformed
       safty saftyPage = new safty();
        saftyPage.setVisible(true);
           this.dispose();
    }//GEN-LAST:event_saftyButtonActionPerformed

    private void ahmedmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ahmedmButtonActionPerformed
          Ahmedma AhmedmaPage = new Ahmedma();
        AhmedmaPage.setVisible(true);
           this.dispose();
    }//GEN-LAST:event_ahmedmButtonActionPerformed

    private void sorhButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sorhButtonActionPerformed
       stersor stersorPage = new stersor();
        stersorPage.setVisible(true);
           this.dispose();
    }//GEN-LAST:event_sorhButtonActionPerformed

    private void marButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marButtonActionPerformed
        mar marPage = new mar();
        marPage.setVisible(true);
           this.dispose();
    }//GEN-LAST:event_marButtonActionPerformed

    private void mansButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mansButtonActionPerformed
        manshiyya marPage = new  manshiyya ();
        marPage.setVisible(true);
           this.dispose();
    }//GEN-LAST:event_mansButtonActionPerformed

    private void outButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outButtonActionPerformed
          out outPage = new  out ();
       outPage.setVisible(true);
           this.dispose();
    }//GEN-LAST:event_outButtonActionPerformed

    private void kathButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kathButtonActionPerformed
          kat katPage = new kat();
      katPage.setVisible(true);
           this.dispose();
    }//GEN-LAST:event_kathButtonActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new location().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ahmedmButton;
    private javax.swing.JButton altfButton;
    private javax.swing.JLabel bLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JButton kaflButton;
    private javax.swing.JButton kathButton;
    private javax.swing.JLabel locationLabel;
    private javax.swing.JLabel manLabel;
    private javax.swing.JButton mansButton;
    private javax.swing.JButton marButton;
    private javax.swing.JButton outButton;
    private javax.swing.JButton saftyButton;
    private javax.swing.JButton sorhButton;
    private javax.swing.JButton zouhrButton;
    // End of variables declaration//GEN-END:variables
}
