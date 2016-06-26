/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.sms.dao;

import in.sms.command.FacultyCommand;
import in.sms.rm.FacultyRowMapper;
import java.util.ArrayList;
import java.util.List;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

/**
 *
 * @author windows 8
 */
@Repository
public class FacultyDaoImpl extends BaseNamedParameterJdbcTemplate implements FacultyDao {

    @Override
    public FacultyCommand findById(String faculty_id) {
        String sql = "select * from faculty where faculty_id=:fid";
        MapSqlParameterSource param = new MapSqlParameterSource();
        param.addValue("fid", faculty_id);
        FacultyCommand fc = new FacultyCommand();
        try {
            fc = getNamedParameterJdbcTemplate().queryForObject(sql, param, new FacultyRowMapper());
            return fc;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<FacultyCommand> findAllForABranch(String fid) {
        String sql = "select * from faculty where faculty_id like :fid";
        MapSqlParameterSource param = new MapSqlParameterSource();
        param.addValue("fid", fid);
        List<FacultyCommand> fc = new ArrayList<FacultyCommand>();
        try {
            fc = getNamedParameterJdbcTemplate().query(sql, param, new FacultyRowMapper());
            return fc;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void save(FacultyCommand fc) {
        String sql = "insert into faculty ("
                + "faculty_id,"
                + "first_name,"
                + "contact_number,"
                + "last_name,"
                + "designation,"
                + "research_area,"
                + "email_primary,"
                + "email_secondary,"
                + "land_line_number,"
                + "title) Values ("
                + ":faculty_id,"
                + ":first_name,"
                + ":contact_number,"
                + ":last_name,"
                + ":designation,"
                + ":research_area,"
                + ":email_primary,"
                + ":email_secondary,"
                + ":land_line_number,"
                + ":title)";
        MapSqlParameterSource param = new MapSqlParameterSource();
        param.addValue("faculty_id", fc.getFaculty_id());
        param.addValue("first_name", fc.getFirst_name());
        param.addValue("contact_number", fc.getContact_number());
        param.addValue("last_name", fc.getLast_name());
        param.addValue("designation", fc.getDesignation());
        param.addValue("research_area", fc.getResearch_area());
        param.addValue("email_primary", fc.getEmail_primary());
        param.addValue("email_secondary", fc.getEmail_secondary());
        param.addValue("land_line_number", fc.getLand_line_number());
        param.addValue("title", fc.getTitle());
        try {
            getNamedParameterJdbcTemplate().update(sql, param);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(FacultyCommand fc) {
        String sql = "update faculty set "
                + "first_name=:first_name,"
                + "contact_number=:contact_number,"
                + "last_name=:last_name,"
                + "designation=:designation,"
                + "research_area=:research_area,"
                + "email_primary=:email_primary,"
                + "email_secondary=:email_secondary,"
                + "land_line_number=:land_line_number,"
                + "title=:title"
                + " where faculty_id=:faculty_id";
        MapSqlParameterSource param = new MapSqlParameterSource();
        param.addValue("faculty_id", fc.getFaculty_id());
        param.addValue("first_name", fc.getFirst_name());
        param.addValue("contact_number", fc.getContact_number());
        param.addValue("last_name", fc.getLast_name());
        param.addValue("designation", fc.getDesignation());
        param.addValue("research_area", fc.getResearch_area());
        param.addValue("email_primary", fc.getEmail_primary());
        param.addValue("email_secondary", fc.getEmail_secondary());
        param.addValue("land_line_number", fc.getLand_line_number());
        param.addValue("title", fc.getTitle());
        try {
            getNamedParameterJdbcTemplate().update(sql, param);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<FacultyCommand> findByName(String name1) {
        List<FacultyCommand> faculties = new ArrayList<FacultyCommand>();
        String name[] = name1.split(" ");
        Integer len = name.length;
        String sql="";
        MapSqlParameterSource param = new MapSqlParameterSource();
        Integer i=0;
        if (len == 2) {
            sql = "select * from faculty where first_name RLIKE :name0 union "
                    + "select * from faculty where first_name RLIKE :name1 union "
                    + "select * from faculty where last_name RLIKE :name0 union "
                    + "select * from faculty where last_name RLIKE :name1";
            param.addValue("name0", name[0]);
            param.addValue("name1", name[1]);
        } else {
            sql = "select * from faculty where first_name RLIKE :name0 union "
                    + "select * from faculty where last_name RLIKE :name0";
            param.addValue("name0", name[0]);
        }
        try {
            faculties = getNamedParameterJdbcTemplate().query(sql, param, new FacultyRowMapper());
            return faculties;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void delete(FacultyCommand fc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteByFacultyId(String faculty_id) {
        String sql="delete from faculty where faculty_id=:fid";
        MapSqlParameterSource param=new MapSqlParameterSource();
        param.addValue("fid",faculty_id);
        try{
            getNamedParameterJdbcTemplate().update(sql, param);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public List<FacultyCommand> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
