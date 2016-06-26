/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.sms.rm;

import in.sms.command.ResultCommand;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author windows 8
 */
public class ResultRowMapper implements RowMapper<ResultCommand>{

    @Override
    public ResultCommand mapRow(ResultSet rs, int i) throws SQLException {
        ResultCommand rescmd=new ResultCommand();
        rescmd.setCourse_id(rs.getString("course_id"));
        rescmd.setGrade(rs.getString("grade"));
        rescmd.setSemester(rs.getInt("semester"));
        rescmd.setStudent_id(rs.getString("student_id"));
        rescmd.setYear(rs.getString("year"));
        rescmd.setCourse_name(rs.getString("course_name"));
        rescmd.setCredits(rs.getInt("credits"));
        rescmd.setStatus(rs.getInt("status"));
        return rescmd;
    }
    
}
