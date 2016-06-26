/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.sms.dao;

import in.sms.command.Student;
import in.sms.command.StudentLoginCommand;
import in.sms.rm.StudentLoginRowMapper;
import in.sms.rm.StudentRowMapper;
import java.util.ArrayList;
import java.util.List;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

/**
 *
 * @author windows 8
 */
@Repository
public class StudentDaoImpl extends BaseNamedParameterJdbcTemplate implements StudentDao {

    @Override
    public void updateStudentPassword(StudentLoginCommand stdlc, String old_password) {
        String sql = "SELECT * from loginstudent WHERE student_id=:stdid and password=:pwd";
        MapSqlParameterSource param = new MapSqlParameterSource();
        param.addValue("stdid", stdlc.getStudent_id());
        param.addValue("pwd", old_password);
        try {
            StudentLoginCommand stdlctemp = getNamedParameterJdbcTemplate().queryForObject(sql, param, new StudentLoginRowMapper());
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
        String sql2 = "UPDATE loginstudent SET password=:pwd WHERE student_id=:stdid";
        MapSqlParameterSource param2 = new MapSqlParameterSource();
        param2.addValue("pwd", stdlc.getPassword());
        param2.addValue("stdid", stdlc.getStudent_id());
        try {
            getNamedParameterJdbcTemplate().update(sql2, param2);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
    }

    @Override
    public Student findById(String student_id) {
        Student student = null;
        String sql = "SELECT * FROM student where student_id=:sid";
        MapSqlParameterSource param = new MapSqlParameterSource();
        param.addValue("sid", student_id);
        try {
            student = getNamedParameterJdbcTemplate().queryForObject(sql, param, new StudentRowMapper());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return student;
    }

    @Override
    public void save(Student student
    ) {
        String sql = "INSERT INTO student ("
                + "student_id,"
                + "first_name,"
                + "last_name,"
                + "section,"
                + "email,"
                + "contact_number,"
                + "address,"
                + "city,"
                + "state,"
                + "father_name,"
                + "program,"
                + "gender,"
                + "branch)"
                + " VALUES ("
                + ":student_id,"
                + ":first_name,"
                + ":last_name,"
                + ":section,"
                + ":email,"
                + ":contact_number,"
                + ":address,"
                + ":city,"
                + ":state,"
                + ":father_name,"
                + ":program,"
                + ":gender,"
                + ":branch)";
        MapSqlParameterSource param = new MapSqlParameterSource();
        param.addValue("student_id", student.getStudent_id());
        param.addValue("first_name", student.getFirst_name());
        param.addValue("last_name", student.getLast_name());
        param.addValue("section", student.getSection());
        param.addValue("email", student.getEmail());
        param.addValue("contact_number", student.getContact_number());
        param.addValue("address", student.getAddress());
        param.addValue("city", student.getCity());
        param.addValue("state", student.getState());
        param.addValue("father_name", student.getFather_name());
        param.addValue("program", student.getProgram());
        param.addValue("gender", student.getGender());
        param.addValue("branch", student.getBranch());
        try {
            getNamedParameterJdbcTemplate().update(sql, param);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void saveInLogin(StudentLoginCommand student
    ) {
        String sql = "INSERT INTO loginstudent ("
                + "user_name,"
                + "password,"
                + "student_id,"
                + "email) VALUES ("
                + ":user_name,"
                + ":password,"
                + ":student_id,"
                + ":email)";
        MapSqlParameterSource param = new MapSqlParameterSource();
        param.addValue("user_name", student.getUser_name());
        param.addValue("password", student.getPassword());
        param.addValue("student_id", student.getStudent_id());
        param.addValue("email", student.getEmail());
        try {
            getNamedParameterJdbcTemplate().update(sql, param);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public List<Student> findAllUnconfirmed() {
        List<Student> students = new ArrayList<Student>();
        String sql = "select * from student where status=:status";
        MapSqlParameterSource param = new MapSqlParameterSource();
        param.addValue("status", 0);
        try {
            students = getNamedParameterJdbcTemplate().query(sql, param, new StudentRowMapper());
            return students;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void update(Student student
    ) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Student student
    ) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String sutdent_id) {
        String sql="delete from student where student_id=:sid";
        MapSqlParameterSource param=new MapSqlParameterSource();
        param.addValue("sid",sutdent_id);
        try{
            getNamedParameterJdbcTemplate().update(sql,param);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public List<Student> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
