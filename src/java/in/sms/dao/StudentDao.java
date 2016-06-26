/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.sms.dao;

import in.sms.command.Student;
import in.sms.command.StudentLoginCommand;
import java.util.List;

/**
 *
 * @author windows 8
 */
public interface StudentDao {
    void save(Student student);

    void update(Student student );

    void delete(Student student);

    void delete(String sutdent_id);

    Student findById(String student_id);

    List<Student> findAll();
    
    void saveInLogin(StudentLoginCommand student);
    
    void updateStudentPassword(StudentLoginCommand stdlc,String old_password);
    
    List<Student> findAllUnconfirmed();
}
