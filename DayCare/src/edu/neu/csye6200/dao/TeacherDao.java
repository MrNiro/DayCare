package edu.neu.csye6200.dao;

import edu.neu.csye6200.model.Teacher;
import edu.neu.csye6200.utils.DatabaseUtil;

import java.sql.ResultSet;
import java.util.List;

public class TeacherDao {
    public List<Teacher> getAllTeachersDao() {
        return null;
    }

    public int getNumOfTeachersDao() {
        return 0;
    }

    public List<Teacher> getAllTeachersInClassroomDao(int classroomId) {
        return null;
    }

    public List<Teacher> getTeacherInGroupDao(int classroomId, int groupId) {
        return null;
    }

    public void addTeacherDao(Teacher teacher) {

    }

    public void updateTeacherDao(Teacher teacher) {

    }

    public void deleteTeacherDao(Teacher teacher) {

    }

    public void deleteTeacherDao(int teacherId) {

    }

    public double getRatingDao(int teacherId) {
        return 0;
    }

//    public void addTeacher(Teacher teacher) {
//        String sql = "INSERT into TEACHER (classroom_id, group_id, first_name, last_name, date_of_birth, address, email " +
//                "parent_name, phone_no, rating) " +
//                "VALUES('"+teacher.getFirstName()
//                +"','"+teacher.getLastName()
//                +"','"+teacher.getDateOfBirth()
//                +"','"+teacher.getAddress()
//                +"','"+teacher.getEmail()
//                +"','"+teacher.getParentName()
//                +"','"+teacher.getPhoneNum()
//                +"','"+teacher.getRating()+"');";
//        DatabaseUtil.executeSQL(sql);
//    }
//
//    public void updateTeacher(Teacher teacher) {
//        String sql = "UPDATE teacher SET" +
//                "  first_name = '" + teacher.getFirstName() +
//                "', last_name = '" + teacher.getLastName() +
//                "', address = '" + teacher.getAddress() +
//                "', email = '" + teacher.getEmail() +
//                "', parent_name = '" + teacher.getParentName() +
//                "', date_of_birth = '" + teacher.getDateOfBirth() +
//                "', phone_no = '" + teacher.getPhoneNum() +
//                "', rating = '" + teacher.getRating() +
//                " WHERE teacher_id = " + teacher.getTeacherId();
//        DatabaseUtil.executeSQL(sql);
//    }
//
//    public ResultSet getTeacherById(Long teacherId) {
//        String sql = "SELECT * FROM teacher WHERE teacher_id = " + teacherId;
//        return DatabaseUtil.getSQLResult(sql);
//    }
//
//    public ResultSet getTeacherRatingById(long teacherId) {
//        String sql = "SELECT rating FROM teacher WHERE teacher_id = " + teacherId;
//        return DatabaseUtil.getSQLResult(sql);
//    }
//
//    public void deleteTeacherFromDb(Teacher teacher){
//        DatabaseUtil.deleteRecord("teacher", "teacher_id", String.valueOf(teacher.getTeacherId()));
//    }
//
//    public void deleteTeacherFromDb(long teacherId){
//        DatabaseUtil.deleteRecord("teacher", "teacher_id", String.valueOf(teacherId));
//    }
}
