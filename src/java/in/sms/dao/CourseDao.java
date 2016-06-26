/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.sms.dao;

import in.sms.command.CourseCommand;
import java.util.List;

/**
 *
 * @author windows 8
 */
public interface CourseDao {
    void save(CourseCommand cc);

    void update(CourseCommand cc);

    void delete(CourseCommand cc);

    void delete(String course_id);

    CourseCommand findById(String course_id);
    
    List<CourseCommand> findAllForSem(Integer sem);
    
    List<CourseCommand> findAll();
}
