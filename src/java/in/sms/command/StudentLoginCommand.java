/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.sms.command;

/**
 *
 * @author windows 8
 */
public class StudentLoginCommand {
    private String user_name;
    private String password;
    private String student_id;
    private String email;
    private Integer status;

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }

    public StudentLoginCommand() {
    }

    public String getUser_name() {
        return user_name;
    }

    public String getPassword() {
        return password;
    }

    public String getStudent_id() {
        return student_id;
    }

    public String getEmail() {
        return email;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
