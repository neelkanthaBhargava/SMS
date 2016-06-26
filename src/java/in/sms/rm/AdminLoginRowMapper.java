/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.sms.rm;

import in.sms.command.AdminLoginCommand;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author windows 8
 */
public class AdminLoginRowMapper implements RowMapper<AdminLoginCommand>{

    @Override
    public AdminLoginCommand mapRow(ResultSet rs, int i) throws SQLException {
        AdminLoginCommand adminlc=new AdminLoginCommand();
        adminlc.setAdmin_id(rs.getString("admin_id"));
        adminlc.setEmail(rs.getString("email"));
        adminlc.setPassword(rs.getString("password"));
        adminlc.setUser_name(rs.getString("user_name"));
        adminlc.setStatus(rs.getInt("status"));
        return adminlc;
    }
    
    
}
