/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.sms.dao;

import in.sms.command.FacultyCommand;
import java.util.List;

/**
 *
 * @author windows 8
 */
public interface FacultyDao {
    void save(FacultyCommand fc);

    void update(FacultyCommand fc);

    void delete(FacultyCommand fc);

    void deleteByFacultyId(String faculty_id);

    FacultyCommand findById(String faculty_id);
    
    List<FacultyCommand> findAllForABranch(String branch);
    
    List<FacultyCommand> findAll();
    
    List<FacultyCommand> findByName(String name1);
}
