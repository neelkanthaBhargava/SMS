/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.sms.studentservice;

import in.sms.command.StudentLoginCommand;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author windows 8
 */
public class LoginService{
    
    public String authenticate(String user_name,String password){
        StudentLoginCommand student=new StudentLoginCommand();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection myConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sms_db","root","mysql");
            Statement myStmt=myConn.createStatement();
            ResultSet myRs=myStmt.executeQuery("select * from loginstudent where user_name='"+user_name+"' and password='"+password+"' and status=1");
            String student_id = null;
            //student_id=myRs.getString("student_id");
            while(myRs.next()){
                student_id=myRs.getString("student_id");
            }
            return student_id;
        }catch(Exception ex){
            ex.printStackTrace();
            return null;
        }
    }
}
