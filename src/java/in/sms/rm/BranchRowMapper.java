/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.sms.rm;

import in.sms.command.Branch;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author windows 8
 */
public class BranchRowMapper implements RowMapper<Branch>{

    @Override
    public Branch mapRow(ResultSet rs, int i) throws SQLException {
        Branch b=new Branch();
        b.setBranch_id(rs.getString("branch_id"));
        b.setBranch_name(rs.getString("branch_name"));
        return b;
    }
    
}
