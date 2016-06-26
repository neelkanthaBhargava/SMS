/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.sms.dao;

import in.sms.command.ResultCommand;
import java.util.List;

/**
 *
 * @author windows 8
 */
public interface ResultDao {
    void save(ResultCommand rc);

    void update(ResultCommand rc);

    void delete(ResultCommand rc);

    void deleteByStudentIdAndCourseId(String sutdent_id,String course_id);

    ResultCommand findById(String student_id,String course_id);
    
    List<ResultCommand> findAllForAStudentForASem(String student_id,Integer Semester);
    
    List<ResultCommand> findAll();
}
