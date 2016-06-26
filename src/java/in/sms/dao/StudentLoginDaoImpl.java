/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.sms.dao;

import in.sms.command.StudentLoginCommand;
import in.sms.rm.StudentLoginRowMapper;
import java.util.ArrayList;
import java.util.List;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

/**
 *
 * @author windows 8
 */
@Repository
public class StudentLoginDaoImpl extends BaseNamedParameterJdbcTemplate implements StudentLoginDao {

    @Override
    public List<StudentLoginCommand> findAllUnconfirmed() {
        String sql = "select * from loginstudent where status = 0";
        MapSqlParameterSource param = new MapSqlParameterSource();
        List<StudentLoginCommand> students = new ArrayList<StudentLoginCommand>();
        try {
            students = getNamedParameterJdbcTemplate().query(sql, param, new StudentLoginRowMapper());
            return students;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public StudentLoginCommand findByStudent_id(String student_id) {
        String sql = "select * from loginstudent where student_id=:stdid";
        MapSqlParameterSource param = new MapSqlParameterSource();
        param.addValue("stdid", student_id);
        StudentLoginCommand stdlc = new StudentLoginCommand();
        try {
            stdlc = getNamedParameterJdbcTemplate().queryForObject(sql, param, new StudentLoginRowMapper());
            return stdlc;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void save(StudentLoginCommand studentlc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(StudentLoginCommand studentlc) {
        String sql="update loginstudent set "
                + "user_name=:uname ,"
                + "password=:pass ,"
                + "student_id=:sid ,"
                + "email=:email ,"
                + "status=:status where student_id=:sid";
        MapSqlParameterSource param=new MapSqlParameterSource();
        param.addValue("uname", studentlc.getUser_name());
        param.addValue("pass", studentlc.getPassword());
        param.addValue("sid", studentlc.getStudent_id());
        param.addValue("email", studentlc.getEmail());
        param.addValue("status",studentlc.getStatus());
        try{
            getNamedParameterJdbcTemplate().update(sql, param);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void delete(StudentLoginCommand studentlc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String user_name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteByStudent_id(String student_id) {
        String sql="delete from loginstudent where student_id=:sid";
        MapSqlParameterSource param=new MapSqlParameterSource();
        param.addValue("sid",student_id);
        try{
            getNamedParameterJdbcTemplate().update(sql,param);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    @Override
    public StudentLoginCommand findByUser_name(String user_name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<StudentLoginCommand> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
