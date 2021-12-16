/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.view.ui.admin;

import edu.neu.csye6200.controller.TeacherController;
import edu.neu.csye6200.model.Teacher;
import edu.neu.csye6200.utils.ConvertUtil;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nagashreeseshadri
 */
public class TeacherJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TeacherJPanel
     */
    private JPanel userProcessContainer;

    public TeacherJPanel(JPanel userProcessContainer) {
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

        lblTeacherInfoHeading = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblFirstName1 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        btnView = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnPopulateTable = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblFirstName2 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblPhoneNumber = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        lblFirstName3 = new javax.swing.JLabel();
        txtParentName = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        btnRefresh = new javax.swing.JButton();

        lblTeacherInfoHeading.setText("Teacher Information");

        lblFirstName.setText("First Name:");

        lblFirstName1.setText("Last Name:");

        lblAge.setText("Date of Birth:");

        lblAddress.setText("Address:");

        btnView.setText("View");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");

        btnDelete.setText("Delete");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null}
                },
                new String [] {
                        "Teacher ID", "First Name", "Last Name", "Date of Birth", "Email", "Address", "Phone Number", "Rating"
                }
        ));
        jScrollPane2.setViewportView(jTable2);

        btnPopulateTable.setText("Populate Table");
        btnPopulateTable.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnPopulateTableActionPerformed(e);
            }
        });
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblFirstName2.setText("Email:");

        lblPhoneNumber.setText("Phone Number:");

        lblFirstName3.setText("Parent Name:");

        btnRefresh.setText("Refresh");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnRefresh)
                                .addGap(291, 291, 291))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(btnBack)
                                                .addGap(285, 285, 285)
                                                .addComponent(lblTeacherInfoHeading))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(94, 94, 94)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 992, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(lblFirstName3)
                                                                                .addGap(6, 6, 6)
                                                                                .addComponent(txtParentName, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(lblFirstName1)
                                                                                        .addComponent(lblFirstName))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                .addGap(88, 88, 88)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(lblPhoneNumber)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(lblAge)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(23, 23, 23)))
                                                                .addGap(67, 67, 67)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(lblFirstName2)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(lblAddress)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(132, 132, 132)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(172, 172, 172)
                                                                .addComponent(btnView)
                                                                .addGap(63, 63, 63)
                                                                .addComponent(btnAdd)
                                                                .addGap(75, 75, 75)
                                                                .addComponent(btnUpdate)
                                                                .addGap(69, 69, 69)
                                                                .addComponent(btnDelete))
                                                        .addComponent(btnPopulateTable))))
                                .addContainerGap(255, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdd, btnPopulateTable, btnDelete, btnUpdate, btnView});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtFirstName, txtLastName, txtParentName});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtEmail, txtPhoneNumber});

        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addComponent(btnBack))
                                        .addComponent(lblTeacherInfoHeading))
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(lblAge)
                                                                .addComponent(lblAddress)
                                                                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(lblFirstName)
                                                                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(5, 5, 5)
                                                                .addComponent(lblFirstName1))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(lblPhoneNumber)
                                                                .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(lblFirstName2)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtParentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(5, 5, 5)
                                                                .addComponent(lblFirstName3))))
                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnPopulateTable)
                                        .addComponent(btnView)
                                        .addComponent(btnAdd)
                                        .addComponent(btnUpdate)
                                        .addComponent(btnDelete))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRefresh)
                                .addContainerGap(131, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:

        String firstName = txtFirstName.getText();
        String lastName = txtLastName.getText();
        String address = txtAddress.getText();
        String email = txtEmail.getText();
        String parentName = txtParentName.getText();
        String phoneNumber = txtPhoneNumber.getText();

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
            if(phoneNumber == null || phoneNumber.isEmpty()){
                throw new NullPointerException("Parent Phone Number field cannot be Empty !!!");
            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Parent Phone Number field cannot be Empty !!!");
            return;
        }

    }

    private void btnPopulateTableActionPerformed(ActionEvent evt){
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        TeacherController controller = new TeacherController();
        List<Teacher> teacherList = controller.getAllTeachers();
            for(Teacher teacher: teacherList){
                String studentId = ConvertUtil.longToString(teacher.getTeacherId());
                String firstName = teacher.getFirstName();
                String lastName = teacher.getFirstName();
                String parentName = teacher.getParentName();
                String phoneNumber = ConvertUtil.longToString(teacher.getPhoneNum());
                String email = teacher.getEmail();
                String address = teacher.getAddress();
                Object[] row = {studentId, firstName, lastName, parentName, phoneNumber, email, address};
                model.addRow(row);
            }
    }
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        String firstName = txtFirstName.getText();
        String lastName = txtLastName.getText();
        String address = txtAddress.getText();
        String email = txtEmail.getText();
        String parentName = txtParentName.getText();
        String phoneNumber = txtPhoneNumber.getText();

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
            if(phoneNumber == null || phoneNumber.isEmpty()){
                throw new NullPointerException("Parent Phone Number field cannot be Empty !!!");
            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Parent Phone Number field cannot be Empty !!!");
            return;
        }
    }//GEN-LAST:event_btnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnPopulateTable;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblFirstName1;
    private javax.swing.JLabel lblFirstName2;
    private javax.swing.JLabel lblFirstName3;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblTeacherInfoHeading;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtParentName;
    private javax.swing.JTextField txtPhoneNumber;
    // End of variables declaration//GEN-END:variables
}
