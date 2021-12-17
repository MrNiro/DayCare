/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.view.ui.groups;

import edu.neu.csye6200.controller.GroupController;
import edu.neu.csye6200.controller.StudentController;
import edu.neu.csye6200.controller.TeacherController;
import edu.neu.csye6200.model.Group;
import edu.neu.csye6200.model.Student;
import edu.neu.csye6200.model.Teacher;
import edu.neu.csye6200.utils.ConvertUtil;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

/**
 *
 * @author nagashreeseshadri
 */
public class GroupJPanel extends JPanel {
    private int classroomId;
    private int groupId;

    /**
     * Creates new form GroupJPanel
     */
    private JPanel userProcessContainer;
    
    public GroupJPanel(JPanel userProcessContainer, int classroomId, int groupId) {
        this.classroomId = classroomId;
        this.groupId = groupId;
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

        lblStudentInfoHeading1 = new javax.swing.JLabel();
        lblGroupID = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblGroupInfoStudent = new javax.swing.JTable();
        lblFirstName1 = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        lblEmployeeID = new javax.swing.JLabel();
        lblTeacherInfoHeading = new javax.swing.JLabel();
        lblTeacherID = new javax.swing.JLabel();
        lblFNameTeacher = new javax.swing.JLabel();
        lblLastNameTeacher = new javax.swing.JLabel();
        btnViewStudentInfo = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        lblStudentInfoHeading1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblStudentInfoHeading1.setText("Hello, you are viewing the Group");

        lblGroupID.setText("jLabel1");

        tblGroupInfoStudent.setBackground(new java.awt.Color(153, 255, 255));
        tblGroupInfoStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Student First Name", "Student Last Name"
            }
        ));
        jScrollPane2.setViewportView(tblGroupInfoStudent);

        lblFirstName1.setText("Last Name:");

        lblFirstName.setText("First Name:");

        lblEmployeeID.setText("Teacher ID:");

        lblTeacherInfoHeading.setText("Teacher Information for this group");

        TeacherController controller = new TeacherController();
        Teacher teacher = controller.getTeacherInGroup(classroomId, groupId);
        lblTeacherID.setText(String.valueOf(teacher.getTeacherId()));
        lblFNameTeacher.setText(teacher.getFirstName());
        lblLastNameTeacher.setText(teacher.getLastName());

        btnViewStudentInfo.setBackground(new java.awt.Color(153, 255, 255));
        btnViewStudentInfo.setText("View Student Info");
        btnViewStudentInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewStudentInfoActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(153, 255, 255));
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/neu/csye6200/view/ui/Images/istockphoto-639573662-612x612.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/neu/csye6200/view/ui/Images/banner-enrollment-1.jpeg"))); // NOI18N
        jLabel2.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnBack)
                                        .addGap(217, 217, 217)
                                        .addComponent(lblStudentInfoHeading1))
                                    .addComponent(lblTeacherInfoHeading)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblFirstName)
                                                .addGap(18, 18, 18)
                                                .addComponent(lblFNameTeacher)
                                                .addGap(189, 189, 189)
                                                .addComponent(lblFirstName1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblLastNameTeacher))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblEmployeeID)
                                                .addGap(18, 18, 18)
                                                .addComponent(lblTeacherID))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(439, 439, 439)
                                        .addComponent(lblGroupID, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(214, 214, 214)
                                .addComponent(btnViewStudentInfo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblStudentInfoHeading1)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblGroupID)
                        .addGap(44, 44, 44)
                        .addComponent(lblTeacherInfoHeading)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmployeeID)
                            .addComponent(lblTeacherID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFirstName)
                            .addComponent(lblFirstName1)
                            .addComponent(lblFNameTeacher)
                            .addComponent(lblLastNameTeacher))
                        .addGap(63, 63, 63)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnViewStudentInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        DefaultTableModel model = (DefaultTableModel) tblGroupInfoStudent.getModel();
        StudentController controller_2 = new StudentController();
        List<Student> studentList =
                controller_2.getAllStudentsInGroup(classroomId, groupId);
        for(Student student: studentList){
            String stuID = String.valueOf(student.getStudentId());
            String stuFName = student.getFirstName();
            String stuLName = student.getLastName();
            Object[] row = {stuID, stuFName, stuLName};
            model.addRow(row);
        }
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewStudentInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewStudentInfoActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblGroupInfoStudent.getSelectedRow();
        if (selectedRowIndex < 0){
            selectedRowIndex = 0;
        }
        long studentId = ConvertUtil.stringToLong(tblGroupInfoStudent.getModel().getValueAt(selectedRowIndex, 0).toString());
        StudentFromGroupJPanel studentFromGroupJPanel = new StudentFromGroupJPanel(userProcessContainer, studentId);
        userProcessContainer.add("Student Information From Group ", studentFromGroupJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnViewStudentInfoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnViewStudentInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblEmployeeID;
    private javax.swing.JLabel lblFNameTeacher;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblFirstName1;
    private javax.swing.JLabel lblGroupID;
    private javax.swing.JLabel lblLastNameTeacher;
    private javax.swing.JLabel lblStudentInfoHeading1;
    private javax.swing.JLabel lblTeacherID;
    private javax.swing.JLabel lblTeacherInfoHeading;
    private javax.swing.JTable tblGroupInfoStudent;
    // End of variables declaration//GEN-END:variables
}
