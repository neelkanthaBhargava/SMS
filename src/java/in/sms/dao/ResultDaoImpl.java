/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.sms.dao;

import in.sms.command.ResultCommand;
import in.sms.rm.ResultRowMapper;
import java.util.List;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

/**
 *
 * @author windows 8
 */
@Repository
public class ResultDaoImpl extends BaseNamedParameterJdbcTemplate implements ResultDao {

    @Override
    public List<ResultCommand> findAllForAStudentForASem(String student_id, Integer Semester) {
        String sql = "SELECT * FROM result WHERE student_id=:sid AND semester=:sem";
        //List<ResultCommand> gradelist=new ArrayList<ResultCommand>();
        MapSqlParameterSource param = new MapSqlParameterSource();
        param.addValue("sid", student_id);
        param.addValue("sem", Semester);
        return getNamedParameterJdbcTemplate().query(sql, param, new ResultRowMapper());
    }

    @Override
    public void save(ResultCommand rc) {
        String sql = "insert into result ("
                + "student_id,"
                + "course_id,"
                + "grade,"
                + "semester,"
                + "year,"
                + "course_name,"
                + "credits,"
                + "status) VALUES ("
                + ":sid,"
                + ":cid,"
                + ":grade,"
                + ":sem,"
                + ":year,"
                + ":cname,"
                + ":credits,"
                + ":status)";
        MapSqlParameterSource param = new MapSqlParameterSource();
        param.addValue("sid", rc.getStudent_id());
        param.addValue("cid", rc.getCourse_id());
        param.addValue("grade", rc.getGrade());
        param.addValue("sem", rc.getSemester());
        param.addValue("year", rc.getYear());
        param.addValue("cname", rc.getCourse_name());
        param.addValue("credits", rc.getCredits());
        param.addValue("status", rc.getStatus());
        getNamedParameterJdbcTemplate().update(sql, param);
    }

    @Override
    public ResultCommand findById(String student_id, String course_id) {
         ResultCommand rc=new ResultCommand();
         String sql="select * from result where student_id=:sid and course_id=:cid";
         MapSqlParameterSource param=new MapSqlParameterSource();
         param.addValue("sid", student_id);
         param.addValue("cid", course_id);
         try{
         rc=getNamedParameterJdbcTemplate().queryForObject(sql, param, new ResultRowMapper());
         return rc;
         }catch(Exception e){
             e.printStackTrace();
             return null;
         }
    }

    @Override
    public void update(ResultCommand rc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(ResultCommand rc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteByStudentIdAndCourseId(String sutdent_id, String course_id) {
        String sql = "delete from result where student_id=:sid and course_id=:cid";
        MapSqlParameterSource param = new MapSqlParameterSource();
        param.addValue("sid", sutdent_id);
        param.addValue("cid", course_id);
        getNamedParameterJdbcTemplate().update(sql, param);
    }

    @Override
    public List<ResultCommand> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
