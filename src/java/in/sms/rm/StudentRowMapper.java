/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.sms.rm;

import in.sms.command.Student;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author windows 8
 */
public class StudentRowMapper implements RowMapper<Student>{

    @Override
    public Student mapRow(ResultSet rs, int i) throws SQLException {
        Student student=new Student();
        student.setAddress(rs.getString("address"));
        student.setAdmission_date(rs.getDate("admission_date"));
        student.setAge(rs.getInt("age"));
        student.setCgpa(rs.getFloat("cgpa"));
        student.setCity(rs.getString("city"));
        student.setContact_number(rs.getString("contact_number"));
        student.setDOB(rs.getDate("dob"));
        student.setEmail(rs.getString("email"));
        student.setFather_name(rs.getString("father_name"));
        student.setFirst_name(rs.getString("first_name"));
        student.setLast_name(rs.getString("last_name"));
        student.setProgram(rs.getString("program"));
        student.setSection(rs.getInt("section"));
        student.setState(rs.getString("state"));
        student.setStudent_id(rs.getString("student_id"));
        student.setYear(rs.getInt("year"));
        student.setBranch(rs.getString("branch"));
        student.setGender(rs.getString("gender"));
        student.setSemester(rs.getInt("semester"));
        return student;
    }
    
}
