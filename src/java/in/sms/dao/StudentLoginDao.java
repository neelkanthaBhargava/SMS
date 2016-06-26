/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.sms.dao;

import in.sms.command.StudentLoginCommand;
import java.util.List;

/**
 *
 * @author windows 8
 */
public interface StudentLoginDao {
    void save(StudentLoginCommand studentlc);

    void update(StudentLoginCommand studentlc);

    void delete(StudentLoginCommand studentlc);

    void delete(String user_name);
    
    void deleteByStudent_id(String student_id);

    StudentLoginCommand findByUser_name(String user_name);
    
    StudentLoginCommand findByStudent_id(String student_id);

    List<StudentLoginCommand> findAll();
    
    List<StudentLoginCommand> findAllUnconfirmed();
}
