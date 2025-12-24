package com.mycompany.main2.GUI;
import com.mycompany.main2.Beneficiary;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane; // لو مش موجود قبل كده

public class kafr extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(kafr.class.getName());

    
    public kafr() {
        initComponents();
           loadDataFromDatabase();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        backPanel = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        backButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        caseLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        jobLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        numberLabel = new javax.swing.JLabel();
        manyLabel = new javax.swing.JLabel();
        caseTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        ageTextField = new javax.swing.JTextField();
        jobTextField = new javax.swing.JTextField();
        manyTextField = new javax.swing.JTextField();
        numberTextField = new javax.swing.JTextField();
        deletButton = new javax.swing.JButton();
        houseLabel = new javax.swing.JLabel();
        hLabel = new javax.swing.JLabel();
        houseTextField = new javax.swing.JTextField();
        hTextField = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("كفر مليط");
        getContentPane().setLayout(null);

        backPanel.setBackground(new java.awt.Color(255, 255, 255));

        logoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("وزاره التضامن الاجنماعي");

        jTable1.setBackground(new java.awt.Color(0, 102, 153));
        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "منطقه", "نوع مسكن", "الداخل", "التليفون", "الوظيفه", "السن", "الحاله", "الاسم"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        backButton.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        backButton.setForeground(new java.awt.Color(0, 102, 153));
        backButton.setText("back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        addButton.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        addButton.setForeground(new java.awt.Color(0, 102, 153));
        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        caseLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        caseLabel.setForeground(new java.awt.Color(0, 102, 153));
        caseLabel.setText("الحاله");

        ageLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ageLabel.setForeground(new java.awt.Color(0, 102, 153));
        ageLabel.setText("السن");

        jobLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jobLabel.setForeground(new java.awt.Color(0, 102, 153));
        jobLabel.setText("الوظيفه");

        nameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(0, 102, 153));
        nameLabel.setText("الاسم");

        numberLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        numberLabel.setForeground(new java.awt.Color(0, 102, 153));
        numberLabel.setText("تليفون");

        manyLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        manyLabel.setForeground(new java.awt.Color(0, 102, 153));
        manyLabel.setText("الداخل");

        caseTextField.setBackground(new java.awt.Color(0, 102, 153));
        caseTextField.setForeground(new java.awt.Color(255, 255, 255));
        caseTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        nameTextField.setBackground(new java.awt.Color(0, 102, 153));
        nameTextField.setForeground(new java.awt.Color(255, 255, 255));
        nameTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        ageTextField.setBackground(new java.awt.Color(0, 102, 153));
        ageTextField.setForeground(new java.awt.Color(255, 255, 255));
        ageTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ageTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTextFieldActionPerformed(evt);
            }
        });

        jobTextField.setBackground(new java.awt.Color(0, 102, 153));
        jobTextField.setForeground(new java.awt.Color(255, 255, 255));
        jobTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        manyTextField.setBackground(new java.awt.Color(0, 102, 153));
        manyTextField.setForeground(new java.awt.Color(255, 255, 255));
        manyTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        numberTextField.setBackground(new java.awt.Color(0, 102, 153));
        numberTextField.setForeground(new java.awt.Color(255, 255, 255));
        numberTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        deletButton.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        deletButton.setForeground(new java.awt.Color(0, 102, 153));
        deletButton.setText("delet");
        deletButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletButtonActionPerformed(evt);
            }
        });

        houseLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        houseLabel.setForeground(new java.awt.Color(0, 102, 153));
        houseLabel.setText("نوع المسكن");

        hLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        hLabel.setForeground(new java.awt.Color(0, 102, 153));
        hLabel.setText("منطقه");
        hLabel.setToolTipText("");

        houseTextField.setBackground(new java.awt.Color(0, 102, 153));
        houseTextField.setForeground(new java.awt.Color(255, 255, 255));
        houseTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        hTextField.setBackground(new java.awt.Color(0, 102, 153));
        hTextField.setForeground(new java.awt.Color(255, 255, 255));
        hTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        hTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backPanelLayout = new javax.swing.GroupLayout(backPanel);
        backPanel.setLayout(backPanelLayout);
        backPanelLayout.setHorizontalGroup(
            backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backPanelLayout.createSequentialGroup()
                .addComponent(logoLabel)
                .addGap(773, 773, 773)
                .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backPanelLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(backButton))
                    .addComponent(jLabel1)))
            .addGroup(backPanelLayout.createSequentialGroup()
                .addComponent(addButton)
                .addGap(56, 56, 56)
                .addComponent(hLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(houseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(manyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(numberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jobLabel)
                .addGap(53, 53, 53)
                .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(caseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(backPanelLayout.createSequentialGroup()
                .addComponent(deletButton)
                .addGap(30, 30, 30)
                .addComponent(hTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(houseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(manyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(numberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jobTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(caseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1060, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        backPanelLayout.setVerticalGroup(
            backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoLabel)
                    .addGroup(backPanelLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(backButton)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)))
                .addGap(6, 6, 6)
                .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(hLabel)
                        .addComponent(addButton))
                    .addComponent(houseLabel)
                    .addComponent(manyLabel)
                    .addComponent(numberLabel)
                    .addComponent(jobLabel)
                    .addComponent(ageLabel)
                    .addComponent(caseLabel)
                    .addGroup(backPanelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(houseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jobTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletButton))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(backPanel);
        backPanel.setBounds(0, 0, 1060, 580);

        setBounds(0, 0, 1072, 592);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        location locationPage = new location();   // افتح صفحة next
       locationPage.setVisible(true);    
       this.dispose(); 
    }//GEN-LAST:event_backButtonActionPerformed

    private void ageTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTextFieldActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
       
       DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
           String inside = manyTextField.getText();
           String phone = numberTextField.getText();
           String job = jobTextField.getText();
           String age = ageTextField.getText();
           String status = caseTextField.getText();
           String name = nameTextField.getText();
           String house = houseTextField.getText();
           String h = hTextField.getText();
           
            if(inside.isEmpty() || phone.isEmpty() || job.isEmpty() || age.isEmpty() || status.isEmpty() || name.isEmpty() || h.isEmpty()|| house.isEmpty() ) {
          JOptionPane.showMessageDialog(null, "اكمل كل البيانات قبل الإضافة");
        return;
            } 
          model.addRow(new Object[]{h,house,inside,phone, job, age, status,name});
      

    // مسح الحقول بعد الإضافة
    manyTextField.setText("");
    numberTextField.setText("");
    jobTextField.setText("");
    ageTextField.setText("");
    caseTextField.setText("");
    nameTextField.setText("");
    houseTextField.setText("");
    hTextField.setText("");
    
       
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

    private void hTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hTextFieldActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> new kafr().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JButton backButton;
    private javax.swing.JPanel backPanel;
    private javax.swing.JLabel caseLabel;
    private javax.swing.JTextField caseTextField;
    private javax.swing.JButton deletButton;
    private javax.swing.JLabel hLabel;
    private javax.swing.JTextField hTextField;
    private javax.swing.JLabel houseLabel;
    private javax.swing.JTextField houseTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jobLabel;
    private javax.swing.JTextField jobTextField;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel manyLabel;
    private javax.swing.JTextField manyTextField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel numberLabel;
    private javax.swing.JTextField numberTextField;
    // End of variables declaration//GEN-END:variables

private void loadDataFromDatabase() {
    try {
        // جلب البيانات (أنت تأكدتِ أنها 50)
        java.util.ArrayList<com.mycompany.main2.Beneficiary> list = 
                com.mycompany.main2.BeneficiaryDAO.getAllBeneficiaries();

        // الوصول للموديل
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) jTable1.getModel();
        
        // مسح أي صفوف وهمية (مهم جداً)
        model.setRowCount(0); 

        for (com.mycompany.main2.Beneficiary b : list) {
            // يجب أن يكون ترتيب البيانات هنا مطابق تماماً لترتيب الأعمدة في الصورة الثانية
            model.addRow(new Object[]{
                b.getStreet(),       // احتياج
                b.getHousingType(),  // نوع مسكن
                b.getIncome(),       // الداخل
                b.getPhone(),        // التليفون
                b.getJob(),          // الوظيفه
                b.getAge(),          // السن
                b.getStatus(),       // الحاله
                b.getFullName()      // الاسم
            });
        }
        
        // إخطار الجدول بأن البيانات تغيرت ليقوم برسمها
        model.fireTableDataChanged();
       
       
    } catch (Exception e) {
        System.err.println("❌ خطأ في عرض الجدول: " + e.getMessage());
        e.printStackTrace();
    }
}




}
