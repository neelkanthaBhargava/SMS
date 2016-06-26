/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.sms.dao;

import in.sms.command.CourseCommand;
import in.sms.rm.CourseRowMapper;
import java.util.ArrayList;
import java.util.List;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

/**
 *
 * @author windows 8
 */
@Repository
public class CourseDaoImpl extends BaseNamedParameterJdbcTemplate implements CourseDao{

    @Override
    public List<CourseCommand> findAllForSem(Integer sem) {
        String sql="select * from course where semester=:sem";
        MapSqlParameterSource param=new MapSqlParameterSource();
        param.addValue("sem", sem);
        System.out.println("semester="+sem);
        List<CourseCommand> courses=new ArrayList<CourseCommand>();
        courses=getNamedParameterJdbcTemplate().query(sql, param, new CourseRowMapper());
        return courses;
    }
    
    @Override
    public CourseCommand findById(String course_id) {
        String sql="select * from course where course_id=:cid";
        MapSqlParameterSource param=new MapSqlParameterSource();
        param.addValue("cid", course_id);
        return getNamedParameterJdbcTemplate().queryForObject(sql, param, new CourseRowMapper());
    }
    
    @Override
    public void save(CourseCommand cc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(CourseCommand cc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(CourseCommand cc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String course_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CourseCommand> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
