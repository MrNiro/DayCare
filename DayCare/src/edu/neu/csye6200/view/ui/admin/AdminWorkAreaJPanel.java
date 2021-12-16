/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.view.ui.admin;

import edu.neu.csye6200.view.ui.MainJFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author nagashreeseshadri
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SchoolJPanel
     */
    
    private JPanel userProcessContainer;
    
    public AdminWorkAreaJPanel(JPanel userProcessContainer) {
        initComponents();
        
        this.userProcessContainer=userProcessContainer;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManageStudents = new javax.swing.JButton();
        lblStudentInfoHeading = new javax.swing.JLabel();
        lblStudentInfoHeading1 = new javax.swing.JLabel();
        btnManageTeachers = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        btnManageStudents.setText("Manage Students");
        btnManageStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageStudentsActionPerformed(evt);
            }
        });

        lblStudentInfoHeading.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblStudentInfoHeading.setText("Administration ");

        lblStudentInfoHeading1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblStudentInfoHeading1.setText("Welcome to the Day Care");

        btnManageTeachers.setText("Manage Teachers");
        btnManageTeachers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageTeachersActionPerformed(evt);
            }
        });

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(btnManageStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(btnManageTeachers, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnBack)
                        .addGap(82, 82, 82)
                        .addComponent(lblStudentInfoHeading1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lblStudentInfoHeading)))
                .addContainerGap(310, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStudentInfoHeading1)
                    .addComponent(btnBack))
                .addGap(18, 18, 18)
                .addComponent(lblStudentInfoHeading)
                .addGap(11, 11, 11)
                .addComponent(btnManageStudents)
                .addGap(18, 18, 18)
                .addComponent(btnManageTeachers)
                .addContainerGap(620, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageStudentsActionPerformed
        // TODO add your handling code here:
        
    StudentJPanel studentJPanel = new StudentJPanel(userProcessContainer);
    userProcessContainer.add("Student Panel Opening", studentJPanel);
    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
    layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageStudentsActionPerformed

    private void btnManageTeachersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageTeachersActionPerformed
        // TODO add your handling code here:
    TeacherJPanel teacherJPanel = new TeacherJPanel(userProcessContainer);
    userProcessContainer.add("Teacher Panel Opening", teacherJPanel);
    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
    layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageTeachersActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnManageStudents;
    private javax.swing.JButton btnManageTeachers;
    private javax.swing.JLabel lblStudentInfoHeading;
    private javax.swing.JLabel lblStudentInfoHeading1;
    // End of variables declaration//GEN-END:variables
}
