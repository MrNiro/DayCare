/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.view.ui.school;

import edu.neu.csye6200.view.ui.admin.AdminWorkAreaJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author nagashreeseshadri
 */
public class SchoolWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SchoolJPanel
     */
    
    private JPanel userProcessContainer;
    
    public SchoolWorkAreaJPanel(JPanel userProcessContainer) {
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

        lblStudentInfoHeading1 = new javax.swing.JLabel();
        btnListClassRooms = new javax.swing.JButton();
        btnAdmin = new javax.swing.JButton();
        lblStudentInfoHeading2 = new javax.swing.JLabel();

        lblStudentInfoHeading1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblStudentInfoHeading1.setText("Welcome to the Day Care");

        btnListClassRooms.setText("List Classrooms");
        btnListClassRooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListClassRoomsActionPerformed(evt);
            }
        });

        btnAdmin.setText("Enter as Admin");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        lblStudentInfoHeading2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblStudentInfoHeading2.setText("What do you want to do?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(lblStudentInfoHeading1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblStudentInfoHeading2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAdmin)
                            .addComponent(btnListClassRooms))))
                .addContainerGap(227, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdmin, btnListClassRooms});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblStudentInfoHeading1)
                .addGap(32, 32, 32)
                .addComponent(lblStudentInfoHeading2)
                .addGap(68, 68, 68)
                .addComponent(btnAdmin)
                .addGap(18, 18, 18)
                .addComponent(btnListClassRooms)
                .addContainerGap(189, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        // TODO add your handling code here:
        
        AdminWorkAreaJPanel awajp = new AdminWorkAreaJPanel(userProcessContainer);
        userProcessContainer.add("AdminWorkAreaJPanel",awajp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnListClassRoomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListClassRoomsActionPerformed
        // TODO add your handling code here:
        
        ViewClassroomJPanel vcjp = new ViewClassroomJPanel(userProcessContainer);
        userProcessContainer.add("View Classroom JPanel",vcjp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnListClassRoomsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnListClassRooms;
    private javax.swing.JLabel lblStudentInfoHeading1;
    private javax.swing.JLabel lblStudentInfoHeading2;
    // End of variables declaration//GEN-END:variables
}
