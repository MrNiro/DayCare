/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.view.ui.admin;

import edu.neu.csye6200.controller.StudentController;
import edu.neu.csye6200.model.Student;
import edu.neu.csye6200.utils.ConvertUtil;

import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


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
        txtLastName = new javax.swing.JTextField();
        lblStudentAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblPhoneNumber = new javax.swing.JLabel();
        txtParentPhoneNumber = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudentInfo = new javax.swing.JTable();
        lblStudentParentName = new javax.swing.JLabel();
        txtParentName = new javax.swing.JTextField();
        btnRefresh = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        lblRegistrationDate = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnTrackImmunization = new javax.swing.JButton();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnTrackEnrollment = new javax.swing.JButton();
        jDateRegistrationDate = new com.toedter.calendar.JDateChooser();
        jDateBirthday = new com.toedter.calendar.JDateChooser();
        lblRegistrationDate1 = new javax.swing.JLabel();
        btnPopulateTable = new javax.swing.JButton();

        lblStudentInfoHeading.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblStudentInfoHeading.setText("Student Information");

        lblFirstName.setText("First Name:");

        lblLastName.setText("Last Name:");

        lblStudentAddress.setText("Address:");

        lblPhoneNumber.setText("Parent Phone Number:");

        tblStudentInfo.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null}
                },
                new String [] {
                        "StudentID", "First Name", "Last Name", "Parent Name", "Phone Number", "Email", "Address"
                }
        ));
        jScrollPane1.setViewportView(tblStudentInfo);

        lblStudentParentName.setText("Parent Name:");

        btnRefresh.setText("Refresh");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        lblRegistrationDate.setText("Registration Date:");

        btnDelete.setText("Delete");

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnTrackImmunization.setText("Track Immunization");
        btnTrackImmunization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrackImmunizationActionPerformed(evt);
            }
        });

        lblEmail.setText("Email:");

        btnTrackEnrollment.setText("Track Enrollment");
        btnTrackEnrollment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrackEnrollmentActionPerformed(evt);
            }
        });

        lblRegistrationDate1.setText("Date of Birth");

        btnPopulateTable.setText("Populate Table");
        btnPopulateTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopulateTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(34, 34, 34))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(99, 99, 99))))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblLastName)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblFirstName)
                                                .addGap(6, 6, 6)
                                                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblStudentParentName)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtParentName, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(btnBack)
                                                .addGap(478, 478, 478)
                                                .addComponent(lblStudentInfoHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(214, 214, 214)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(lblRegistrationDate)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jDateRegistrationDate, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(lblRegistrationDate1)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jDateBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(lblPhoneNumber)
                                                                                .addGap(1, 1, 1)
                                                                                .addComponent(txtParentPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(133, 133, 133)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                .addComponent(lblStudentAddress)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                .addComponent(lblEmail)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btnPopulateTable)
                                                                .addGap(63, 63, 63)
                                                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(37, 37, 37)
                                                                .addComponent(btnUpdate)
                                                                .addGap(49, 49, 49)
                                                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(31, 31, 31)
                                                                .addComponent(btnTrackEnrollment)))
                                                .addGap(31, 31, 31)
                                                .addComponent(btnTrackImmunization)))
                                .addGap(0, 15, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdd, btnDelete, btnTrackEnrollment, btnTrackImmunization, btnUpdate});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jDateBirthday, jDateRegistrationDate, txtParentPhoneNumber});

        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnBack)
                                        .addComponent(lblStudentInfoHeading))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(5, 5, 5)
                                                                .addComponent(lblStudentAddress)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblEmail)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(6, 6, 6)
                                                                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(11, 11, 11)
                                                                .addComponent(lblFirstName))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(lblRegistrationDate1)
                                                                        .addComponent(jDateBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(18, 18, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(lblLastName)
                                                                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(lblRegistrationDate)
                                                                .addComponent(jDateRegistrationDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(lblStudentParentName)
                                                .addComponent(txtParentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(lblPhoneNumber)
                                                .addComponent(txtParentPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(73, 73, 73)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnAdd)
                                        .addComponent(btnUpdate)
                                        .addComponent(btnDelete)
                                        .addComponent(btnTrackEnrollment)
                                        .addComponent(btnTrackImmunization)
                                        .addComponent(btnPopulateTable))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRefresh)
                                .addContainerGap(350, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnTrackEnrollmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrackEnrollmentActionPerformed
        // TODO add your handling code here:

        int selectedRowIndex = tblStudentInfo.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tblStudentInfo.getModel();

        Student selectedStudent = (Student)model.getValueAt(selectedRowIndex, 0);

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a student to view Immunization.");
            return;
        }

//        TrackStudentEnrollmentJPanel trackStudentEnrollmentJPanel = new TrackStudentEnrollmentJPanel(userProcessContainer, selectedStudent);
//        userProcessContainer.add("Tracking student Enrollment", trackStudentEnrollmentJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);


    }//GEN-LAST:event_btnTrackEnrollmentActionPerformed

    private void btnTrackImmunizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrackImmunizationActionPerformed
        // TODO add your handling code here:
//        TrackImmunizationJPanel trackImmunizationJPanel = new TrackImmunizationJPanel(userProcessContainer);
//        userProcessContainer.add("Tracking student Immunization", trackImmunizationJPanel);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);

        int selectedRowIndex = tblStudentInfo.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tblStudentInfo.getModel();

        long studentId = ConvertUtil.stringToLong(tblStudentInfo.getModel().getValueAt(selectedRowIndex, 0).toString());

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a student to view Immunization.");
            return;
        }

        TrackImmunizationJPanel trackImmunizationJPanel = new TrackImmunizationJPanel(userProcessContainer, studentId);
        userProcessContainer.add("Tracking student Immunization", trackImmunizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnTrackImmunizationActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String firstName = txtFirstName.getText();
        String lastName = txtLastName.getText();
        String address = txtAddress.getText();
        String email = txtEmail.getText();
        String parentName = txtParentName.getText();
        String parentPhoneNumber = txtParentPhoneNumber.getText();

        try {
            if(firstName == null || firstName.isEmpty()){
                throw new NullPointerException("First Name field cannot be Empty !!!");
            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "First Name field cannot be Empty !!!");
            return;
        }

        try {
            if(lastName == null || lastName.isEmpty()){
                throw new NullPointerException("Last Name field cannot be Empty !!!");
            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Last Name field cannot be Empty !!!");
            return;
        }

        try {
            if(address == null || address.isEmpty()){
                throw new NullPointerException("Address field cannot be Empty !!!");
            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Address field cannot be Empty !!!");
            return;
        }

        try {
            if(email == null || email.isEmpty()){
                throw new NullPointerException("Email field cannot be Empty !!!");
            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Email field cannot be Empty !!!");
            return;
        }

        try {
            if(parentName == null || parentName.isEmpty()){
                throw new NullPointerException("Parent Name field cannot be Empty !!!");
            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Parent Name field cannot be Empty !!!");
            return;
        }

        try {
            if(parentPhoneNumber == null || parentPhoneNumber.isEmpty()){
                throw new NullPointerException("Parent Phone Number field cannot be Empty !!!");
            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Parent Phone Number field cannot be Empty !!!");
            return;
        }

        Student student = new Student(firstName, lastName, email, address, parentName, ConvertUtil.stringToLong(parentPhoneNumber));
        DefaultTableModel model = (DefaultTableModel) tblStudentInfo.getModel();
        StudentController studentController = new StudentController();
        studentController.addStudent(student);

//        String studentId = ConvertUtil.longToString(student.getStudentId());
        populateTable();



    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String firstName = txtFirstName.getText();
        String lastName = txtLastName.getText();
        String address = txtAddress.getText();
        String email = txtEmail.getText();
        String parentName = txtParentName.getText();
        String parentPhoneNumber = txtParentPhoneNumber.getText();

        try {
            if(firstName == null || firstName.isEmpty()){
                throw new NullPointerException("First Name field cannot be Empty !!!");
            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "First Name field cannot be Empty !!!");
            return;
        }

        try {
            if(lastName == null || lastName.isEmpty()){
                throw new NullPointerException("Last Name field cannot be Empty !!!");
            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Last Name field cannot be Empty !!!");
            return;
        }

        try {
            if(address == null || address.isEmpty()){
                throw new NullPointerException("Address field cannot be Empty !!!");
            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Address field cannot be Empty !!!");
            return;
        }

        try {
            if(email == null || email.isEmpty()){
                throw new NullPointerException("Email field cannot be Empty !!!");
            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Email field cannot be Empty !!!");
            return;
        }

        try {
            if(parentName == null || parentName.isEmpty()){
                throw new NullPointerException("Parent Name field cannot be Empty !!!");
            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Parent Name field cannot be Empty !!!");
            return;
        }

        try {
            if(parentPhoneNumber == null || parentPhoneNumber.isEmpty()){
                throw new NullPointerException("Parent Phone Number field cannot be Empty !!!");
            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Parent Phone Number field cannot be Empty !!!");
            return;
        }


    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnPopulateTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopulateTableActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_btnPopulateTableActionPerformed

    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) tblStudentInfo.getModel();
        StudentController controller = new StudentController();
        List<Student> studentList = controller.getAllStudents();
        for(Student student: studentList){
            String studentId = ConvertUtil.longToString(student.getStudentId());
            String firstName = student.getFirstName();
            String lastName = student.getFirstName();
            String parentName = student.getParentName();
            String phoneNumber = ConvertUtil.longToString(student.getPhoneNum());
            String email = student.getEmail();
            String address = student.getAddress();
            Object[] row = {studentId, firstName, lastName, parentName, phoneNumber, email, address};
            model.addRow(row);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnPopulateTable;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnTrackEnrollment;
    private javax.swing.JButton btnTrackImmunization;
    private javax.swing.JButton btnUpdate;
    private com.toedter.calendar.JDateChooser jDateBirthday;
    private com.toedter.calendar.JDateChooser jDateRegistrationDate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblRegistrationDate;
    private javax.swing.JLabel lblRegistrationDate1;
    private javax.swing.JLabel lblStudentAddress;
    private javax.swing.JLabel lblStudentInfoHeading;
    private javax.swing.JLabel lblStudentParentName;
    private javax.swing.JTable tblStudentInfo;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtParentName;
    private javax.swing.JTextField txtParentPhoneNumber;
    // End of variables declaration//GEN-END:variables
}
