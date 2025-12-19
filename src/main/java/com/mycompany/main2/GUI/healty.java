package com.mycompany.main2.GUI;

import com.mycompany.main2.HelpCase;
import com.mycompany.main2.HelpDAO;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
public class healty extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(healty.class.getName());

    
    public healty() {
        initComponents();
        loadData();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        healtyPanel = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        adwayLabel = new javax.swing.JLabel();
        casLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        casfLabel = new javax.swing.JLabel();
        locaLabel = new javax.swing.JLabel();
        malyaLabel = new javax.swing.JLabel();
        ashuLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        deletButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("صحه");
        getContentPane().setLayout(null);

        healtyPanel.setBackground(new java.awt.Color(255, 255, 255));

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/لوجو.jpg"))); // NOI18N

        jTable1.setBackground(new java.awt.Color(0, 102, 153));
        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "عمليه", "اشعه", "تحاليل", "ادويه", "كشف", "منطقه", "الاسم"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        adwayLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        adwayLabel.setForeground(new java.awt.Color(0, 102, 153));
        adwayLabel.setText("ادويه");

        casLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        casLabel.setForeground(new java.awt.Color(0, 102, 153));
        casLabel.setText("تحليل");

        nameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(0, 102, 153));
        nameLabel.setText("الاسم");

        casfLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        casfLabel.setForeground(new java.awt.Color(0, 102, 153));
        casfLabel.setText("كشف");

        locaLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        locaLabel.setForeground(new java.awt.Color(0, 102, 153));
        locaLabel.setText("مكان");

        malyaLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        malyaLabel.setForeground(new java.awt.Color(0, 102, 153));
        malyaLabel.setText("عمليه");

        ashuLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ashuLabel.setForeground(new java.awt.Color(0, 102, 153));
        ashuLabel.setText("اشعه");

        backButton.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        backButton.setForeground(new java.awt.Color(0, 102, 153));
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        addButton.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        addButton.setForeground(new java.awt.Color(0, 102, 153));
        addButton.setText("add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(0, 102, 153));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));

        jTextField2.setBackground(new java.awt.Color(0, 102, 153));
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));

        jTextField3.setBackground(new java.awt.Color(0, 102, 153));
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));

        jTextField4.setBackground(new java.awt.Color(0, 102, 153));
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));

        jTextField5.setBackground(new java.awt.Color(0, 102, 153));
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));

        jTextField6.setBackground(new java.awt.Color(0, 102, 153));
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));

        jTextField7.setBackground(new java.awt.Color(0, 102, 153));
        jTextField7.setForeground(new java.awt.Color(255, 255, 255));

        deletButton.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        deletButton.setForeground(new java.awt.Color(0, 102, 153));
        deletButton.setText("delet");
        deletButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout healtyPanelLayout = new javax.swing.GroupLayout(healtyPanel);
        healtyPanel.setLayout(healtyPanelLayout);
        healtyPanelLayout.setHorizontalGroup(
            healtyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(healtyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, healtyPanelLayout.createSequentialGroup()
                .addGroup(healtyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(healtyPanelLayout.createSequentialGroup()
                        .addComponent(logoLabel)
                        .addGap(211, 530, Short.MAX_VALUE))
                    .addGroup(healtyPanelLayout.createSequentialGroup()
                        .addGroup(healtyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(deletButton)
                            .addComponent(addButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(healtyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, healtyPanelLayout.createSequentialGroup()
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, healtyPanelLayout.createSequentialGroup()
                                .addComponent(ashuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(malyaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(casLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)))))
                .addGroup(healtyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, healtyPanelLayout.createSequentialGroup()
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(healtyPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(healtyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(backButton)
                            .addGroup(healtyPanelLayout.createSequentialGroup()
                                .addComponent(adwayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(casfLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(locaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(242, 242, 242))))))
        );
        healtyPanelLayout.setVerticalGroup(
            healtyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(healtyPanelLayout.createSequentialGroup()
                .addGroup(healtyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(healtyPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(healtyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logoLabel)
                            .addComponent(backButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addButton)
                        .addGap(18, 18, 18)
                        .addComponent(deletButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, healtyPanelLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(healtyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(casfLabel)
                            .addComponent(locaLabel)
                            .addComponent(nameLabel)
                            .addComponent(casLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(malyaLabel)
                            .addComponent(ashuLabel)
                            .addComponent(adwayLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(healtyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(healtyPanel);
        healtyPanel.setBounds(0, 0, 1198, 668);

        setBounds(0, 0, 1212, 657);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        NonFixedProjectsPage nonfiPage = new NonFixedProjectsPage();   
       nonfiPage.setVisible(true);    
       this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
           String name = jTextField1.getText();
           String location = jTextField2.getText();
           String casf = jTextField3.getText();
           String adway = jTextField4.getText();
           String cas = jTextField5.getText();
           String awaly = jTextField6.getText();
           String asah = jTextField7.getText();
          
           
            if(location.isEmpty() || casf.isEmpty() ||adway.isEmpty() || cas.isEmpty() || awaly.isEmpty() || name.isEmpty() || asah.isEmpty() ) {
          JOptionPane.showMessageDialog(null, "اكمل كل البيانات قبل الإضافة");
        return;
            }
          model.addRow(new Object[]{asah,awaly,cas, adway, casf, location,name});

    // مسح الحقول بعد الإضافة
    jTextField1.setText("");
   jTextField2.setText("");
    jTextField3.setText("");
   jTextField4.setText("");
    jTextField5.setText("");
   jTextField6.setText("");
    jTextField7.setText("");

    }//GEN-LAST:event_addButtonActionPerformed

    private void deletButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletButtonActionPerformed
             DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    int selectedRow = jTable1.getSelectedRow();  // الصف المحدد

    if(selectedRow >= 0){  // لو فيه صف محدد
        model.removeRow(selectedRow);  // نحذف الصف
    } else {
        JOptionPane.showMessageDialog(null, "اختر الصف الذي تريد حذفه"); // لو مفيش صف محدد
    }
    }//GEN-LAST:event_deletButtonActionPerformed

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new healty().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel adwayLabel;
    private javax.swing.JLabel ashuLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel casLabel;
    private javax.swing.JLabel casfLabel;
    private javax.swing.JButton deletButton;
    private javax.swing.JPanel healtyPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel locaLabel;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel malyaLabel;
    private javax.swing.JLabel nameLabel;
    // End of variables declaration//GEN-END:variables

    
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {
    HelpCase h = new HelpCase();
    h.name = jTextField1.getText();
    h.projectName = jTextField2.getText();
    // نملأ بيانات الصحة فقط والباقي يذهب Null
    h.examinationType = jTextField3.getText();
    h.medications = jTextField4.getText();
    h.medicalAnalysis = jTextField5.getText();
    h.surgery = jTextField6.getText();
    h.xRay = jTextField7.getText();

    if (HelpDAO.addHelpCase(h)) {
        JOptionPane.showMessageDialog(this, "تمت الإضافة");
        loadData(); // لتحديث الجدول
    }
}
    
    
    
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {
    int selectedRow = jTable1.getSelectedRow();
    
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "من فضلك اختاري الصف اللي عاوزه تمسحيه");
        return;
    }

    // بناخد الاسم من آخر عمود في الجدول (عمود الاسم)
    int lastColumn = jTable1.getColumnCount() - 1;
    String nameToDelete = jTable1.getValueAt(selectedRow, lastColumn).toString();

    int confirm = JOptionPane.showConfirmDialog(this, "هل أنتِ متأكدة من حذف: " + nameToDelete + "؟");
    
    if (confirm == JOptionPane.YES_OPTION) {
        if (HelpDAO.deleteHelpCase(nameToDelete)) {
            JOptionPane.showMessageDialog(this, "تم الحذف بنجاح");
            loadData(); // تحديث الجدول بعد الحذف
        } else {
            JOptionPane.showMessageDialog(this, "حدث خطأ أثناء الحذف");
        }
    }
}
 public void loadData() {
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0);
    ArrayList<HelpCase> list = HelpDAO.getAllHelpCases();

    for (HelpCase h : list) {
        // شرط: لو الحالة دي ليها بيانات في أعمدة الصحة (مش فاضية) اعرضها
        if (h.examinationType != null || h.surgery != null) {
            Object[] row = {
                h.xRay, h.surgery, h.medicalAnalysis, h.medications, 
                h.examinationType, h.getProjectName(), h.getName()
            };
            model.addRow(row);
        }
    }
}
}