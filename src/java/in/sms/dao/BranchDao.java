/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.sms.dao;

import in.sms.command.Branch;
import java.util.List;

/**
 *
 * @author windows 8
 */
public interface BranchDao {
    void save(Branch b);

    void update(Branch b);

    void delete(Branch b);

    void delete(String branch_id);

    Branch findById(String branch_id);
    
    List<Branch> findAll();
}
