package com.mycompany.main2.GUI;

import com.mycompany.main2.HelpCase;
import com.mycompany.main2.HelpDAO;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
public class duon extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(duon.class.getName());

    
    public duon() {
        initComponents();
        loadData();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        duonPanel = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        ADDButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("غارمات");
        getContentPane().setLayout(null);

        duonPanel.setBackground(new java.awt.Color(255, 255, 255));

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/لوجو.jpg"))); // NOI18N

        jTable1.setBackground(new java.awt.Color(0, 102, 153));
        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "اوراق الرسميه", "قيمه الدين", "سبب الدين", "منطقه", "الاسم"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setBackground(new java.awt.Color(0, 102, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setText("الاسم");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 153));
        jLabel2.setText("منطقه");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 153));
        jLabel3.setText("سبب الدين");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setText("قيمه الدين");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 153));
        jLabel5.setText("اوراق الرسميه");

        jTextField1.setBackground(new java.awt.Color(0, 102, 153));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));

        jTextField2.setBackground(new java.awt.Color(0, 102, 153));
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));

        jTextField3.setBackground(new java.awt.Color(0, 102, 153));
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.setBackground(new java.awt.Color(0, 102, 153));
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));

        jTextField5.setBackground(new java.awt.Color(0, 102, 153));
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));

        ADDButton.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        ADDButton.setForeground(new java.awt.Color(0, 102, 153));
        ADDButton.setText("ADD");
        ADDButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDButtonActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 153));
        jButton2.setText("Delet");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backButton.setForeground(new java.awt.Color(0, 102, 153));
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout duonPanelLayout = new javax.swing.GroupLayout(duonPanel);
        duonPanel.setLayout(duonPanelLayout);
        duonPanelLayout.setHorizontalGroup(
            duonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(duonPanelLayout.createSequentialGroup()
                .addComponent(logoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backButton))
            .addGroup(duonPanelLayout.createSequentialGroup()
                .addGroup(duonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ADDButton)
                    .addComponent(jButton2))
                .addGap(337, 337, 337)
                .addGroup(duonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(duonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(duonPanelLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(duonPanelLayout.createSequentialGroup()
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 197, Short.MAX_VALUE))
        );
        duonPanelLayout.setVerticalGroup(
            duonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(duonPanelLayout.createSequentialGroup()
                .addGroup(duonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(duonPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logoLabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, duonPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(backButton)))
                .addGroup(duonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(duonPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(ADDButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, duonPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(duonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(duonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(duonPanel);
        duonPanel.setBounds(0, 0, 1200, 650);

        setBounds(0, 0, 1212, 657);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
         NonFixedProjectsPage nonfiPage = new NonFixedProjectsPage();   
          nonfiPage.setVisible(true);    
         this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void ADDButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDButtonActionPerformed
         DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
           String name = jTextField1.getText();
           String location = jTextField2.getText();
           String bacu = jTextField3.getText();
           String value = jTextField4.getText();
           String paper = jTextField5.getText();
           
          
           
            if(location.isEmpty() || bacu.isEmpty() ||value.isEmpty() || paper.isEmpty() ) {
          JOptionPane.showMessageDialog(null, "اكمل كل البيانات قبل الإضافة");
        return;
            }
          model.addRow(new Object[]{paper, value, bacu, location,name});

    // مسح الحقول بعد الإضافة
    jTextField1.setText("");
   jTextField2.setText("");
    jTextField3.setText("");
   jTextField4.setText("");
    jTextField5.setText("");
  
    }//GEN-LAST:event_ADDButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                 DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    int selectedRow = jTable1.getSelectedRow();  // الصف المحدد

    if(selectedRow >= 0){  // لو فيه صف محدد
        model.removeRow(selectedRow);  // نحذف الصف
    } else {
        JOptionPane.showMessageDialog(null, "اختر الصف الذي تريد حذفه"); // لو مفيش صف محدد
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(() -> new duon().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADDButton;
    private javax.swing.JButton backButton;
    private javax.swing.JPanel duonPanel;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel logoLabel;
    // End of variables declaration//GEN-END:variables

    
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {
    HelpCase h = new HelpCase();
    h.name = jTextField1.getText();
    h.projectName = jTextField2.getText();
    
    // بيانات الديون/الغارمات
    h.debtReason = jTextField3.getText();
    h.debtValue = jTextField4.getText();
    h.officialDocuments = jTextField5.getText();

    if (HelpDAO.addHelpCase(h)) {
        JOptionPane.showMessageDialog(this, "تمت إضافة بيانات الغارمات بنجاح");
        loadData();
    } else {
        JOptionPane.showMessageDialog(this, "حدث خطأ أثناء الحفظ");
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
        if (h.debtReason != null) {
            Object[] row = {
                h.officialDocuments, h.debtValue, h.debtReason, 
                h.getProjectName(), h.getName()
            };
            model.addRow(row);
        }
    }
}

}
