/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.sms.rm;

import in.sms.command.CourseCommand;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author windows 8
 */
public class CourseRowMapper implements RowMapper<CourseCommand>{

    @Override
    public CourseCommand mapRow(ResultSet rs, int i) throws SQLException {
        CourseCommand cc=new CourseCommand();
        cc.setBranch(rs.getString("branch"));
        cc.setCourse_id(rs.getString("course_id"));
        cc.setCourse_name(rs.getString("course_name"));
        cc.setCredits(rs.getInt("credits"));
        cc.setFaculty_id1(rs.getString("faculty_id1"));
        cc.setFaculty_id2(rs.getString("faculty_id2"));
        cc.setSemester(rs.getInt("semester"));
        return cc;
    }
    
}
