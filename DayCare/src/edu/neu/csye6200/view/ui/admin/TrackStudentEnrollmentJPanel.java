/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.view.ui.admin;

import edu.neu.csye6200.controller.StudentController;
import edu.neu.csye6200.model.Student;
import edu.neu.csye6200.utils.ConvertUtil;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

/**
 *
 * @author nagashreeseshadri
 */
public class TrackStudentEnrollmentJPanel extends JPanel {

    /**
     * Creates new form StudentEnrollmentJPanel
     */
    private JPanel userProcessContainer;
    private List<Student> studentList;

    public TrackStudentEnrollmentJPanel(JPanel userProcessContainer) {
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
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnEmail = new javax.swing.JButton();

        lblStudentInfoHeading.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        lblStudentInfoHeading.setText("Student Enrollment Information");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
//                        {null, null, null, null, null, null},
//                        {null, null, null, null, null, null},
//                        {null, null, null, null, null, null},
//                        {null, null, null, null, null, null}
                },
                new String [] {
                        "Student ID", "First Name", "Last Name", "Email", "Last Registration Date", "Next Registration Date"
                }
        ));
        jScrollPane3.setViewportView(jTable2);

        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        StudentController studentController = new StudentController();
        List<Student> studentList = studentController.getAllStudents();
        for(Student student: studentList){
            String studentId = String.valueOf(student.getStudentId());
            String firstName = String.valueOf(student.getFirstName());
            String lastName = String.valueOf(student.getLastName());
            String email = String.valueOf(student.getEmail());
            String lastRegDate = String.valueOf(student.getRegistrationDate());
//            String nextRegDate = ;
            Object[] row = {studentId, firstName, lastName, email, lastRegDate};
            model.addRow(row);
        }

        this.studentList = studentList;
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnEmail.setText("Send Email");
        btnEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnEmail)
                                .addGap(63, 63, 63))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addComponent(btnBack)
                                                .addGap(274, 274, 274)
                                                .addComponent(lblStudentInfoHeading))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(77, 77, 77)
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 853, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnBack)
                                        .addComponent(lblStudentInfoHeading))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                                .addComponent(btnEmail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmailActionPerformed
        // TODO add your handling code here:
//        int selectedRowIndex = jTable2.getSelectedRow();
//        if (selectedRowIndex < 0){
//            selectedRowIndex = 0;
//        }
//        StudentController controller = new StudentController();
//        controller.sendEmail(this.studentList.get(selectedRowIndex));
    }//GEN-LAST:event_btnEmailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEmail;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblStudentInfoHeading;
    // End of variables declaration//GEN-END:variables
}