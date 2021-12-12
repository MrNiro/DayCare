package edu.neu.csye6200.api;

import edu.neu.csye6200.api.abstractClass.AbstractTeacher;
import edu.neu.csye6200.dao.TeacherDao;
import edu.neu.csye6200.model.Teacher;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class TeacherApi extends AbstractTeacher {

    private final TeacherDao dao = new TeacherDao();

    @Override
    public int getNumOfTeachers() {
        return 0;
    }

    @Override
    public double getRating(long teacherId) {
        ResultSet rs = dao.getTeacherRatingById(teacherId);
        if(rs!= null) {
            try {
                return rs.getDouble(0);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        System.out.println("No record found");
        return 0.0;
    }

    @Override
    public List<Teacher> getAllTeachers() {
        return null;
    }

    /**
     * add a teacher to classroom
     * @param teacher
     *
     */
    @Override
    public void addTeacher(Teacher teacher) {
        //Todo check for teacherId for the record in db
        ResultSet rs = dao.getTeacherById(teacher.getTeacherId());
        if(rs == null) {
            dao.addTeacher(teacher);
        } else {
            System.out.println("Record already exists");
        }
    }

    @Override
    public void updateTeacher(Teacher teacher) {
        ResultSet rs = dao.getTeacherById(teacher.getTeacherId());
        if(rs == null) {
            dao.addTeacher(teacher);
        } else {
            dao.updateTeacher(teacher);
        }
    }

    public void updateClassroomIdGroupIdByTeacherId(Teacher teacher) {
        ResultSet rs = dao.getTeacherById(teacher.getTeacherId());
        if(rs == null) {
            System.out.println("Record already exists");
        } else {
            dao.updateClassroomAndGroupByTeacherId(teacher);
        }
    }

    @Override
    public void delTeacher(Teacher teacher) {

    }

    @Override
    public void delTeacher(long teacherId) {

    }

}
