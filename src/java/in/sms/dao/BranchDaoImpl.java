/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.sms.dao;

import in.sms.command.Branch;
import in.sms.rm.BranchRowMapper;
import java.util.ArrayList;
import java.util.List;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

/**
 *
 * @author windows 8
 */
@Repository
public class BranchDaoImpl extends BaseNamedParameterJdbcTemplate implements BranchDao {

    @Override
    public List<Branch> findAll() {
        String sql = "select * from branch";
        List<Branch> branches = new ArrayList<Branch>();
        MapSqlParameterSource param = new MapSqlParameterSource();
        try {
            branches = getNamedParameterJdbcTemplate().query(sql, param, new BranchRowMapper());
            return branches;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Branch findById(String branch_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void save(Branch b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Branch b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Branch b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String branch_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}
