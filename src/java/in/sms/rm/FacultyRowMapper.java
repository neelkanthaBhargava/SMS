/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.sms.rm;

import in.sms.command.FacultyCommand;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author windows 8
 */
public class FacultyRowMapper implements RowMapper<FacultyCommand>{

    @Override
    public FacultyCommand mapRow(ResultSet rs, int i) throws SQLException {
        FacultyCommand fc=new FacultyCommand();
        fc.setContact_number(rs.getString("contact_number"));
        fc.setDesignation(rs.getString("designation"));
        fc.setEmail_primary(rs.getString("email_primary"));
        fc.setEmail_secondary(rs.getString("email_secondary"));
        fc.setFaculty_id(rs.getString("faculty_id"));
        fc.setFirst_name(rs.getString("first_name"));
        fc.setLand_line_number(rs.getString("land_line_number"));
        fc.setLast_name(rs.getString("last_name"));
        fc.setResearch_area(rs.getString("research_area"));
        fc.setTitle(rs.getString("title"));
        return fc;
    }
    
}
