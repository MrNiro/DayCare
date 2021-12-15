/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.view.ui.admin;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author nagashreeseshadri
 */
public class StudentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form Student
     */
    
    private JPanel userProcessContainer;
    
    public StudentJPanel(JPanel userProcessContainer) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblStudentInfoHeading = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        txtFirstName1 = new javax.swing.JTextField();
        lblStudentAge = new javax.swing.JLabel();
        txtFirstName2 = new javax.swing.JTextField();
        lblStudentAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblPhoneNumber = new javax.swing.JLabel();
        txtFirstName4 = new javax.swing.JTextField();
        lblStudentInfoHeading1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudentInfo = new javax.swing.JTable();
        lblStudentParentName = new javax.swing.JLabel();
        txtFirstName5 = new javax.swing.JTextField();
        btnView = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        lblRegistrationDate = new javax.swing.JLabel();
        txtFirstName6 = new javax.swing.JTextField();
        lblImmunizationDate = new javax.swing.JLabel();
        txtFirstName7 = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lblStudentInfoHeading2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblStudentInfoHeading3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        lblSelectVaccName = new javax.swing.JLabel();
        comboBoxVaccineName = new javax.swing.JComboBox<>();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnUploadCSV = new javax.swing.JButton();

        lblStudentInfoHeading.setText("Student Information");

        lblFirstName.setText("First Name:");

        lblLastName.setText("Last Name:");

        lblStudentAge.setText("Age in Months:");

        lblStudentAddress.setText("Address:");

        lblPhoneNumber.setText("Phone Number:");

        lblStudentInfoHeading1.setText("Student Parent Information");

        tblStudentInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "StudentID", "First Name", "Last Name", "Age in Months", "Phone Number", "Parent Name", "Address", "Group ID", "Classroom ID"
            }
        ));
        jScrollPane1.setViewportView(tblStudentInfo);

        lblStudentParentName.setText("Parent Name:");

        btnView.setText("View");

        btnUpdate.setText("Update");

        btnAdd.setText("Add");

        lblRegistrationDate.setText("Registration Date:");

        lblImmunizationDate.setText("Last Immunization Date:");

        btnDelete.setText("Delete");

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jButton1.setText("Track");

        lblStudentInfoHeading2.setText("Track Student Enrollment History");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Student ID", "Vaccine Dose", "Immunization Date"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        lblStudentInfoHeading3.setText("Track Student Immunization History");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Student ID", "Enrollment History"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        lblSelectVaccName.setText("Select Vaccine Name:");

        comboBoxVaccineName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblEmail.setText("Email:");

        btnUploadCSV.setText("Upload CSV");
        btnUploadCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadCSVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnBack)
                .addGap(238, 238, 238)
                .addComponent(lblStudentInfoHeading))
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(lblFirstName)
                .addGap(6, 6, 6)
                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(lblLastName)
                .addGap(6, 6, 6)
                .addComponent(txtFirstName1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(lblStudentAge)
                .addGap(6, 6, 6)
                .addComponent(txtFirstName2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(lblStudentAddress)
                .addGap(6, 6, 6)
                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(lblRegistrationDate)
                .addGap(6, 6, 6)
                .addComponent(txtFirstName6, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(lblImmunizationDate)
                .addGap(6, 6, 6)
                .addComponent(txtFirstName7, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblStudentInfoHeading1))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblStudentParentName)
                .addGap(6, 6, 6)
                .addComponent(txtFirstName5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(lblPhoneNumber)
                .addGap(6, 6, 6)
                .addComponent(txtFirstName4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143)
                .addComponent(lblEmail)
                .addGap(6, 6, 6)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1064, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(btnUploadCSV, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnUpdate)
                .addGap(64, 64, 64)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jButton1))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblStudentInfoHeading2)
                .addGap(380, 380, 380)
                .addComponent(lblStudentInfoHeading3))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(219, 219, 219)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSelectVaccName)
                        .addGap(6, 6, 6)
                        .addComponent(comboBoxVaccineName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnBack))
                    .addComponent(lblStudentInfoHeading))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFirstName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFirstName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFirstName)
                            .addComponent(lblLastName)
                            .addComponent(lblStudentAge))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFirstName6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFirstName7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblStudentAddress)
                            .addComponent(lblRegistrationDate)
                            .addComponent(lblImmunizationDate))))
                .addGap(83, 83, 83)
                .addComponent(lblStudentInfoHeading1)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFirstName5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFirstName4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblStudentParentName)
                            .addComponent(lblPhoneNumber)
                            .addComponent(lblEmail))))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUploadCSV)
                    .addComponent(btnView)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(jButton1))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStudentInfoHeading2)
                    .addComponent(lblStudentInfoHeading3))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(lblSelectVaccName))
                            .addComponent(comboBoxVaccineName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUploadCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadCSVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUploadCSVActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUploadCSV;
    private javax.swing.JButton btnView;
    private javax.swing.JComboBox<String> comboBoxVaccineName;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblImmunizationDate;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblRegistrationDate;
    private javax.swing.JLabel lblSelectVaccName;
    private javax.swing.JLabel lblStudentAddress;
    private javax.swing.JLabel lblStudentAge;
    private javax.swing.JLabel lblStudentInfoHeading;
    private javax.swing.JLabel lblStudentInfoHeading1;
    private javax.swing.JLabel lblStudentInfoHeading2;
    private javax.swing.JLabel lblStudentInfoHeading3;
    private javax.swing.JLabel lblStudentParentName;
    private javax.swing.JTable tblStudentInfo;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtFirstName1;
    private javax.swing.JTextField txtFirstName2;
    private javax.swing.JTextField txtFirstName4;
    private javax.swing.JTextField txtFirstName5;
    private javax.swing.JTextField txtFirstName6;
    private javax.swing.JTextField txtFirstName7;
    // End of variables declaration//GEN-END:variables
}
