/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.sms.dao;

import in.sms.command.AdminLoginCommand;
import java.util.List;

/**
 *
 * @author windows 8
 */
public interface adminLoginDao {
    void save(AdminLoginCommand adminlc);

    void update(AdminLoginCommand adminlc);

    void delete(AdminLoginCommand adminlc);

    void delete(String admin_id);

    AdminLoginCommand findById(String admin_id);

    List<AdminLoginCommand> findAll();
}
