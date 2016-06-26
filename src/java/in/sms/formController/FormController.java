/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.sms.formController;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author windows 8
 */
@Controller
public class FormController {
    @RequestMapping("/indexForm")
    public String getwelcomeForm(){
        return "indexForm";
    }
    @RequestMapping("/adminLogin")
    public String getAdminLoginForm(){
        return "adminLogin";
    }
    @RequestMapping("/studentLogin")
    public String getStudentLoginForm(){
        return "studentLogin";
    }
}
