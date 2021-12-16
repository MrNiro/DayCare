/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.view.ui.admin;

import edu.neu.csye6200.controller.StudentController;
import edu.neu.csye6200.model.Student;
import edu.neu.csye6200.utils.AutoAssignUtil;
import edu.neu.csye6200.utils.ConvertUtil;

import java.awt.CardLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
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
     * Creates new form StudentJPanel
     * @param userProcessContainer
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
        btnPopulateTable = new javax.swing.JButton();
        jDateRegistrationDate = new com.toedter.calendar.JDateChooser();
        lblRegistrationDate1 = new javax.swing.JLabel();
        jDateBirthday = new com.toedter.calendar.JDateChooser();

        lblStudentInfoHeading.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblStudentInfoHeading.setText("Student Information");

        lblFirstName.setText("First Name:");

        lblLastName.setText("Last Name:");

        lblStudentAddress.setText("Address:");

        lblPhoneNumber.setText("Parent Phone Number:");

        tblStudentInfo.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "StudentID", "First Name", "Last Name", "Parent Name", "Phone Number", "Email", "Address"
                }
        ));
        jScrollPane1.setViewportView(tblStudentInfo);

        lblStudentParentName.setText("Parent Name:");

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

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
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

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

        btnPopulateTable.setText("Populate Table");
        btnPopulateTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopulateTableActionPerformed(evt);
            }
        });

        lblRegistrationDate1.setText("Date of Birth:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(371, 371, 371)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lblRegistrationDate)
                                                .addComponent(lblRegistrationDate1)
                                                .addComponent(lblPhoneNumber))
                                        .addGap(36, 36, 36)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jDateRegistrationDate, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jDateBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                        .addComponent(lblStudentAddress)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                        .addComponent(lblEmail)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGap(92, 92, 92))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(txtParentPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, Short.MAX_VALUE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(102, 102, 102)
                                        .addComponent(btnPopulateTable, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(47, 47, 47)
                                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(61, 61, 61)
                                        .addComponent(btnUpdate)
                                        .addGap(49, 49, 49)
                                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(51, 51, 51)
                                        .addComponent(btnTrackImmunization)
                                        .addGap(457, 457, 457)))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(57, 57, 57)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(lblLastName)
                                                                .addGap(6, 6, 6)
                                                                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(lblFirstName)
                                                                .addGap(6, 6, 6)
                                                                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(lblStudentParentName)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(txtParentName, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(47, 47, 47)
                                                .addComponent(btnBack)
                                                .addGap(478, 478, 478)
                                                .addComponent(lblStudentInfoHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(441, 441, 441))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(275, 275, 275))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(17, 17, 17))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 7, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnBack)
                                        .addComponent(lblStudentInfoHeading))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(lblRegistrationDate1))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(5, 5, 5)
                                                                .addComponent(lblFirstName)))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(lblRegistrationDate, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                                                                .addGap(27, 27, 27))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(5, 5, 5)
                                                                                .addComponent(lblLastName)))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lblStudentParentName)
                                                        .addComponent(txtParentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(78, 78, 78))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
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
                                                                .addGap(5, 5, 5)
                                                                .addComponent(jDateRegistrationDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jDateBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(17, 17, 17)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtParentPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblPhoneNumber))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnPopulateTable)
                                        .addComponent(btnAdd)
                                        .addComponent(btnUpdate)
                                        .addComponent(btnDelete)
                                        .addComponent(btnTrackImmunization))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRefresh))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here
        DefaultTableModel model = (DefaultTableModel) tblStudentInfo.getModel();
        model.setRowCount(0);
        model.fireTableDataChanged();
        populateTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String firstName = txtFirstName.getText();
        String lastName = txtLastName.getText();
        String parentName = txtParentName.getText();
        String parentPhoneNumber = txtParentPhoneNumber.getText();
        String address = txtAddress.getText();
        String email = txtEmail.getText();
        Date dob = jDateBirthday.getDate();
        Date reg_date = jDateRegistrationDate.getDate();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        LocalDate dateOfBirth = ConvertUtil.stringtoLocalDate(dateFormat.format(dob));
        java.sql.Date registrationDate = ConvertUtil.stringToDate(dateFormat.format(reg_date));

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
        Student student = new Student(firstName, lastName, email, address, parentName, ConvertUtil.stringToLong(parentPhoneNumber), dateOfBirth, registrationDate);
//        DefaultTableModel model = (DefaultTableModel) tblStudentInfo.getModel();
        StudentController studentController = new StudentController();
        List<Student> students = studentController.getAllStudents();
        long lastStudId = students.get(students.size() - 1).getStudentId();
        student.setStudentId(lastStudId + 1);
        studentController.updateStudent(student);
        btnRefreshActionPerformed(evt);

        //update student with following parameters
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String firstName = txtFirstName.getText();
        String lastName = txtLastName.getText();
        String parentName = txtParentName.getText();
        String parentPhoneNumber = txtParentPhoneNumber.getText();
        String address = txtAddress.getText();
        String email = txtEmail.getText();
        Date dob = jDateBirthday.getDate();
        Date reg_date = jDateRegistrationDate.getDate();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        LocalDate dateOfBirth = ConvertUtil.stringtoLocalDate(dateFormat.format(dob));
        java.sql.Date registrationDate = ConvertUtil.stringToDate(dateFormat.format(reg_date));
//        LocalDate dob = ConvertUtil.dateToLocalDate(jDateBirthday.getDate());
//        Date reg_date = jDateRegistrationDate.getDate();

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

        Student student = new Student(firstName, lastName, email, address, parentName, ConvertUtil.stringToLong(parentPhoneNumber), dateOfBirth, registrationDate);
//        DefaultTableModel model = (DefaultTableModel) tblStudentInfo.getModel();
        StudentController studentController = new StudentController();
        List<Student> students = studentController.getAllStudents();
        long lastStudId = students.get(students.size() - 1).getStudentId();
        student.setStudentId(lastStudId + 1);
        AutoAssignUtil.groupingLogicForSingleStudent(student);
        studentController.addStudent(student);
        btnRefreshActionPerformed(evt);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblStudentInfo.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tblStudentInfo.getModel();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }

        long studentId = ConvertUtil.stringToLong(model.getValueAt(selectedRowIndex, 0).toString());
        StudentController studentController = new StudentController();
        studentController.deleteStudent(studentId);
        ((DefaultTableModel) tblStudentInfo.getModel()).fireTableDataChanged();
        btnRefreshActionPerformed(evt);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnTrackImmunizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrackImmunizationActionPerformed
        int selectedRowIndex = tblStudentInfo.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tblStudentInfo.getModel();

        long studentId = ConvertUtil.stringToLong(tblStudentInfo.getModel().getValueAt(selectedRowIndex, 0).toString());

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a student to view Immunization.");
            return;
        }

        TrackImmunizationJPanel trackImmunizationJPanel = new edu.neu.csye6200.view.ui.admin.TrackImmunizationJPanel(userProcessContainer, studentId);
        userProcessContainer.add("Tracking student Immunization", trackImmunizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnTrackImmunizationActionPerformed

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
            String lastName = student.getLastName();
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


