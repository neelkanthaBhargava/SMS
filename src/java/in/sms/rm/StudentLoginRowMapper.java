/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.sms.rm;

import in.sms.command.StudentLoginCommand;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author windows 8
 */
public class StudentLoginRowMapper implements RowMapper<StudentLoginCommand>{

    @Override
    public StudentLoginCommand mapRow(ResultSet rs, int i) throws SQLException {
        StudentLoginCommand studentLogin=new StudentLoginCommand();
        studentLogin.setEmail(rs.getString("email"));
        studentLogin.setPassword(rs.getString("password"));
        studentLogin.setStudent_id(rs.getString("student_id"));
        studentLogin.setUser_name(rs.getString("user_name"));
        studentLogin.setStatus(rs.getInt("status"));
        return studentLogin;
    }
    
}
