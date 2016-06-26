package in.sms.adminservice;

import in.sms.command.AdminLoginCommand;
import in.sms.dao.BaseNamedParameterJdbcTemplate;
import in.sms.rm.AdminLoginRowMapper;
import javax.servlet.http.HttpSession;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author windows 8
 */
@Controller
public class LoginService extends BaseNamedParameterJdbcTemplate{
    @RequestMapping("/confirmAdminLogin")
    public ModelAndView confirmAdminLogin(@ModelAttribute("adminCommand") AdminLoginCommand adminCommand, ModelAndView mav, HttpSession session){
        try{
            //System.out.println("user_name is:"+adminCommand.getUser_name());
            //System.out.println("password is:"+adminCommand.getPassword());
            String sql="select * from adminlogin where user_name=:uid and password=:pwd and status='1'";
            MapSqlParameterSource param=new MapSqlParameterSource();
            param.addValue("uid", adminCommand.getUser_name());
            param.addValue("pwd", adminCommand.getPassword());
            AdminLoginCommand adminlc=getNamedParameterJdbcTemplate().queryForObject(sql, param, new AdminLoginRowMapper());
            mav.addObject(adminlc);
            session.setAttribute("admin", adminlc);
            mav.setViewName("adminLoginSuccess");
            return mav;
        }catch(Exception ex){
            String err = "Wrong Username or password";
            ex.printStackTrace();
            mav.addObject("err",err);
            mav.setViewName("adminLogin");
            return mav;
        }
    }
    @RequestMapping("/adminLoginSuccess")
    public String adminLoginSuccessFunction(HttpSession session){
        return "adminLoginSuccess";
    }
}
