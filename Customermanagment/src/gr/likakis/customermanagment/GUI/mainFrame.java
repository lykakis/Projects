package gr.likakis.customermanagment.GUI;

import java.io.File;
import jxl.Workbook;
import jxl.write.*;

import gr.likakis.customermanagment.action.customer;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class mainFrame extends javax.swing.JFrame {

    ArrayList<String> values;
    customer currentView;

    public mainFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMainPanel = new javax.swing.JPanel();
        jButtonsPanel = new javax.swing.JPanel();
        jSearchBtn = new javax.swing.JButton();
        jAddBtn = new javax.swing.JButton();
        jPanels = new javax.swing.JPanel();
        jAddPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPhoneText = new javax.swing.JTextField();
        jNameText = new javax.swing.JTextField();
        jLasteNameText = new javax.swing.JTextField();
        jAddressText = new javax.swing.JTextField();
        jProfessiontext = new javax.swing.JTextField();
        jEmailtext = new javax.swing.JTextField();
        jSaveCustomer = new javax.swing.JButton();
        jSearchPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSearchText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSaveChanges = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jShowAllBtn1 = new javax.swing.JButton();
        jDeleteBtn = new javax.swing.JButton();
        jExportToExcel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMainPanel.setBackground(new java.awt.Color(51, 51, 51));
        jMainPanel.setForeground(new java.awt.Color(51, 51, 51));

        jButtonsPanel.setBackground(new java.awt.Color(51, 51, 51));
        jButtonsPanel.setForeground(new java.awt.Color(51, 51, 51));

        jSearchBtn.setBackground(new java.awt.Color(51, 51, 51));
        jSearchBtn.setForeground(new java.awt.Color(51, 51, 51));
        jSearchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gr/likakis/customermanagment/icons/search-user-button.png"))); // NOI18N
        jSearchBtn.setBorder(null);
        jSearchBtn.setBorderPainted(false);
        jSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSearchBtnActionPerformed(evt);
            }
        });

        jAddBtn.setBackground(new java.awt.Color(51, 51, 51));
        jAddBtn.setForeground(new java.awt.Color(51, 51, 51));
        jAddBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gr/likakis/customermanagment/icons/add-user-button.png"))); // NOI18N
        jAddBtn.setToolTipText("");
        jAddBtn.setBorder(null);
        jAddBtn.setBorderPainted(false);
        jAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jButtonsPanelLayout = new javax.swing.GroupLayout(jButtonsPanel);
        jButtonsPanel.setLayout(jButtonsPanelLayout);
        jButtonsPanelLayout.setHorizontalGroup(
            jButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jButtonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSearchBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(jAddBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jButtonsPanelLayout.setVerticalGroup(
            jButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jButtonsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jAddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156)
                .addComponent(jSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        jPanels.setBackground(new java.awt.Color(255, 153, 0));
        jPanels.setForeground(new java.awt.Color(204, 153, 0));
        jPanels.setLayout(new java.awt.CardLayout());

        jAddPanel.setBackground(new java.awt.Color(255, 153, 0));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Όνομα");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Τηλέφωνο");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Επίθετο");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("e-mail");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Διεύθυνση");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Επάγγελμα");

        jPhoneText.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jPhoneText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPhoneTextActionPerformed(evt);
            }
        });

        jNameText.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNameTextActionPerformed(evt);
            }
        });

        jLasteNameText.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLasteNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLasteNameTextActionPerformed(evt);
            }
        });

        jAddressText.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jAddressText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddressTextActionPerformed(evt);
            }
        });

        jProfessiontext.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jProfessiontext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jProfessiontextActionPerformed(evt);
            }
        });

        jEmailtext.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jEmailtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEmailtextActionPerformed(evt);
            }
        });

        jSaveCustomer.setBackground(new java.awt.Color(51, 51, 51));
        jSaveCustomer.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jSaveCustomer.setForeground(new java.awt.Color(255, 153, 0));
        jSaveCustomer.setText("Αποθήκευση");
        jSaveCustomer.setBorder(null);
        jSaveCustomer.setBorderPainted(false);
        jSaveCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSaveCustomerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jAddPanelLayout = new javax.swing.GroupLayout(jAddPanel);
        jAddPanel.setLayout(jAddPanelLayout);
        jAddPanelLayout.setHorizontalGroup(
            jAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jAddPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(48, 48, 48)
                .addGroup(jAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jProfessiontext, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                    .addComponent(jAddressText, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                    .addComponent(jPhoneText)
                    .addComponent(jNameText, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                    .addComponent(jLasteNameText, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                    .addComponent(jEmailtext, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                    .addComponent(jSaveCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(564, Short.MAX_VALUE))
        );
        jAddPanelLayout.setVerticalGroup(
            jAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jAddPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLasteNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jPhoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jEmailtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jAddressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jProfessiontext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addComponent(jSaveCustomer)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        jPanels.add(jAddPanel, "card2");

        jSearchPanel.setBackground(new java.awt.Color(255, 153, 0));
        jSearchPanel.setForeground(new java.awt.Color(255, 153, 0));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Αναζήτηση");

        jSearchText.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jSearchText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSearchTextActionPerformed(evt);
            }
        });

        jTable1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTable1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTable1.setForeground(new java.awt.Color(51, 51, 51));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Όνομα", "Επίθετο", "Διεύθυνση", "Τηλέφωνο", "e-mail", "Επάγγελμα"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setRowHeight(20);
        jTable1.setSelectionBackground(new java.awt.Color(255, 153, 0));
        jTable1.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jSaveChanges.setBackground(new java.awt.Color(51, 51, 51));
        jSaveChanges.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jSaveChanges.setForeground(new java.awt.Color(255, 153, 0));
        jSaveChanges.setText("Αποθήκευση αλλαγών");
        jSaveChanges.setBorder(null);
        jSaveChanges.setBorderPainted(false);
        jSaveChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSaveChangesActionPerformed(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Όνομα", "Επίθετο", "Διεύθυνση", "Τηλέφωνο", "e-mail", "Επάγγελμα" }));
        jComboBox1.setBorder(null);

        jShowAllBtn1.setBackground(new java.awt.Color(51, 51, 51));
        jShowAllBtn1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jShowAllBtn1.setForeground(new java.awt.Color(255, 153, 0));
        jShowAllBtn1.setText("Εμφάνιση όλων");
        jShowAllBtn1.setBorder(null);
        jShowAllBtn1.setBorderPainted(false);
        jShowAllBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jShowAllBtn1ActionPerformed(evt);
            }
        });

        jDeleteBtn.setBackground(new java.awt.Color(51, 51, 51));
        jDeleteBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jDeleteBtn.setForeground(new java.awt.Color(255, 153, 0));
        jDeleteBtn.setText("Διαγραφή");
        jDeleteBtn.setBorder(null);
        jDeleteBtn.setBorderPainted(false);
        jDeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteBtnActionPerformed(evt);
            }
        });

        jExportToExcel.setBackground(new java.awt.Color(51, 51, 51));
        jExportToExcel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jExportToExcel.setForeground(new java.awt.Color(255, 153, 0));
        jExportToExcel.setText("Εξαγωγή σε Excel");
        jExportToExcel.setBorder(null);
        jExportToExcel.setBorderPainted(false);
        jExportToExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExportToExcelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jSearchPanelLayout = new javax.swing.GroupLayout(jSearchPanel);
        jSearchPanel.setLayout(jSearchPanelLayout);
        jSearchPanelLayout.setHorizontalGroup(
            jSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jSearchPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jSearchPanelLayout.createSequentialGroup()
                        .addComponent(jDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jShowAllBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jExportToExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSaveChanges, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
                    .addGroup(jSearchPanelLayout.createSequentialGroup()
                        .addGroup(jSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jSearchPanelLayout.createSequentialGroup()
                                .addComponent(jSearchText, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jSearchPanelLayout.setVerticalGroup(
            jSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jSearchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSearchText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSaveChanges, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jShowAllBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jExportToExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jPanels.add(jSearchPanel, "card3");

        javax.swing.GroupLayout jMainPanelLayout = new javax.swing.GroupLayout(jMainPanel);
        jMainPanel.setLayout(jMainPanelLayout);
        jMainPanelLayout.setHorizontalGroup(
            jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanels, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jMainPanelLayout.setVerticalGroup(
            jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanels, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSearchBtnActionPerformed
        jAddPanel.setVisible(false);
        
        jSearchPanel.setVisible(true);
    }//GEN-LAST:event_jSearchBtnActionPerformed

    private void jAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddBtnActionPerformed
        jAddPanel.setVisible(true);
        jSearchPanel.setVisible(false);
       
    }//GEN-LAST:event_jAddBtnActionPerformed

    private void jPhoneTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPhoneTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPhoneTextActionPerformed

    private void jNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNameTextActionPerformed

    private void jLasteNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLasteNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLasteNameTextActionPerformed

    private void jAddressTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddressTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAddressTextActionPerformed

    private void jProfessiontextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jProfessiontextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jProfessiontextActionPerformed

    private void jEmailtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEmailtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jEmailtextActionPerformed

    private void jSaveCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSaveCustomerActionPerformed
        if (jNameText.getText().equals("")
                || jLasteNameText.getText().equals("")
                || jAddressText.getText().equals("")
                || jPhoneText.getText().equals("")
                || jEmailtext.getText().equals("")
                || jProfessiontext.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Παρακαλώ συμπληρώστε όλα τα πεδία");

        } else {
            customer currentCustomer = new customer(
                    jNameText.getText(),
                    jLasteNameText.getText(),
                    jAddressText.getText(),
                    jPhoneText.getText(),
                    jEmailtext.getText(),
                    jProfessiontext.getText()
            );
            currentCustomer.insertToSql(currentCustomer);
            jNameText.setText("");
            jLasteNameText.setText("");
            jAddressText.setText("");
            jPhoneText.setText("");
            jEmailtext.setText("");
            jProfessiontext.setText("");
            JOptionPane.showMessageDialog(null, "Η αποθήκευση ολοκληρώθηκε");
        }
    }//GEN-LAST:event_jSaveCustomerActionPerformed


    private void jSaveChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSaveChangesActionPerformed

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String[] currentId;
        String[] currentValue;
        String tempString;
        Vector data = model.getDataVector();

        for (int i = 0; i < values.size(); i++) {
            tempString = data.get(i).toString();                            //get each  Value from jtable formed [name, lastname, addres 7 phone..]
            tempString = tempString.substring(1, tempString.length() - 1);  //remove first and last bracket
            currentValue = tempString.split(",");                           // get  values from  each linein a String[]

            for (int j = 1; j < currentValue.length; j++) {                 //remove first whitespace (after the first value) 
                currentValue[j] = currentValue[j].substring(1, currentValue[j].length());
            }

            currentId = values.get(i).split("/");                           // Get id from arrayList that has all values

            customer temp = new customer();
            temp.saveChanges(currentValue, Integer.parseInt(currentId[6]));//Update table selected  view (each row)

        }

        JOptionPane.showMessageDialog(null, "Η αποθήκευση ολοκληρώθηκε");
    }//GEN-LAST:event_jSaveChangesActionPerformed

    private void jSearchTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSearchTextActionPerformed
        currentView = new customer();

        switch (jComboBox1.getSelectedIndex()) {                         //search using users input based on combobox selected
            case 0:
                values = currentView.search(0, jSearchText.getText());
                break;
            case 1:
                values = currentView.search(1, jSearchText.getText());
                break;
            case 2:
                values = currentView.search(2, jSearchText.getText());
                break;
            case 3:
                values = currentView.search(3, jSearchText.getText());
                break;
            case 4:
                values = currentView.search(4, jSearchText.getText());
                break;
            case 5:
                values = currentView.search(5, jSearchText.getText());
                break;
            default:
                values = currentView.search(1, "*");
                break;
        }
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();    // gets jTable model 
        model.setRowCount(0);                                               //Clear table 
        for (int i = 0; i < values.size(); i++) {
            String[] currentRow = values.get(i).split("/");
            Object[] row = {currentRow[0], currentRow[1], currentRow[2],
                currentRow[3], currentRow[4], currentRow[5]};
            model.addRow(row);
        }
    }//GEN-LAST:event_jSearchTextActionPerformed

    private void jShowAllBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jShowAllBtn1ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);                                               //Clear table 

        values = new customer().selectAll();                                   //insert all data from sql to Arraylist values
        for (int i = 0; i < values.size(); i++) {
            String[] currentRow = values.get(i).split("/");                 //get each line and break it into attributes
            Object[] row = {currentRow[0], currentRow[1], currentRow[2],
                currentRow[3], currentRow[4], currentRow[5]};
            model.addRow(row);
        }
    }//GEN-LAST:event_jShowAllBtn1ActionPerformed

    private void jDeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteBtnActionPerformed

        if (jTable1.getSelectionModel().isSelectionEmpty()) {               //Check if a customer is selected
            JOptionPane.showMessageDialog(null, "Επιλέξτε πελάτη");
        } else {
            int row = jTable1.getSelectedRow();                             //get wich customer by row number
            String[] currentRow1 = values.get(row).split("/");              //get values of selected customer
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, //Ask if ok to delete this customer
                    "Θέλετε σίγουρα να διαγράψετε τον: " + currentRow1[0]
                    + " " + currentRow1[1], "Διαγραφή", dialogButton);
            if (dialogResult == 0) {
                customer temp = new customer();
                temp.deleteCustomer(new customer(Integer.parseInt(currentRow1[6])));
                JOptionPane.showMessageDialog(null, "Η διαγραφή ολοκληρώθηκε ");
            } else {

            }
        }


    }//GEN-LAST:event_jDeleteBtnActionPerformed

    private void jExportToExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExportToExcelActionPerformed
        WritableWorkbook wworkbook;
        Label label;
        String[] StringCurrentRow;
        try {
            wworkbook = Workbook.createWorkbook(new File("Customers.xls"));
            //Sheet name
            WritableSheet wsheet = wworkbook.createSheet("Customers", 0);
            String[] collumns = {"Όνομα", "Επίθετο", "Διεύθυνση", "Tηλέφωνο", "E-mail", "Επάγγελμα"};

            int firstRow = 0;
            //Labels 
            //row 0
            for (int i = 0; i < collumns.length; i++) {
                label = new Label(i, firstRow, collumns[i]);
                wsheet.addCell(label);
            }

            for (int numberOfRow = 0; numberOfRow < values.size(); numberOfRow++) {
                StringCurrentRow = values.get(numberOfRow).split("/");
                for (int currentCell = 0; currentCell < StringCurrentRow.length - 1; currentCell++) {
                    label = new Label(currentCell, numberOfRow + 1, StringCurrentRow[currentCell]);
                    wsheet.addCell(label);
                }
            }
            
            wworkbook.write();
            wworkbook.close();
           
        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_jExportToExcelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAddBtn;
    private javax.swing.JPanel jAddPanel;
    private javax.swing.JTextField jAddressText;
    private javax.swing.JPanel jButtonsPanel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JButton jDeleteBtn;
    private javax.swing.JTextField jEmailtext;
    private javax.swing.JButton jExportToExcel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jLasteNameText;
    private javax.swing.JPanel jMainPanel;
    private javax.swing.JTextField jNameText;
    private javax.swing.JPanel jPanels;
    private javax.swing.JTextField jPhoneText;
    private javax.swing.JTextField jProfessiontext;
    private javax.swing.JButton jSaveChanges;
    private javax.swing.JButton jSaveCustomer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jSearchBtn;
    private javax.swing.JPanel jSearchPanel;
    private javax.swing.JTextField jSearchText;
    private javax.swing.JButton jShowAllBtn1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
