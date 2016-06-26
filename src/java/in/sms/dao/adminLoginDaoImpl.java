/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.sms.dao;

import in.sms.command.AdminLoginCommand;
import java.util.List;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

/**
 *
 * @author windows 8
 */
@Repository
public class adminLoginDaoImpl extends BaseNamedParameterJdbcTemplate implements adminLoginDao{

    @Override
    public void save(AdminLoginCommand adminlc) {
        String sql="INSERT INTO adminlogin("
                + "user_name,"
                + "password,"
                + "email,"
                + "admin_id) VALUES("
                + ":user_name,"
                + ":password,"
                + ":email,"
                + ":admin_id)";
        MapSqlParameterSource param=new MapSqlParameterSource();
        param.addValue("admin_id", adminlc.getAdmin_id());
        param.addValue("email", adminlc.getEmail());
        param.addValue("password", adminlc.getPassword());
        param.addValue("user_name", adminlc.getUser_name());
        try{
            getNamedParameterJdbcTemplate().update(sql, param);    
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    @Override
    public void update(AdminLoginCommand adminlc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(AdminLoginCommand adminlc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String admin_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AdminLoginCommand findById(String admin_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<AdminLoginCommand> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
