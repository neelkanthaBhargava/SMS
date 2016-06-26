/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.sms.admincontroller;

import in.sms.command.Student;
import in.sms.command.StudentLoginCommand;
import in.sms.dao.StudentDaoImpl;
import in.sms.dao.StudentLoginDaoImpl;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author windows 8
 */
@Controller
public class manageStudentServices {

    @Autowired
    StudentLoginDaoImpl stdldao;
    @Autowired
    StudentDaoImpl stddao;

    @RequestMapping("manageStudent")
    public ModelAndView manageStudentFunction(HttpSession session) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("manageStudent");
        return mav;
    }

    @RequestMapping("confirmStudentRegistration")
    public ModelAndView confirmStudentRegistrationFunction() {
        ModelAndView mav = new ModelAndView();
        List<StudentLoginCommand> students = new ArrayList<StudentLoginCommand>();
        students = stdldao.findAllUnconfirmed();
        for (StudentLoginCommand s : students) {
            System.out.println("student id=" + s.getStudent_id());
            System.out.println("student id=" + s.getEmail());
        }
        mav.addObject("students", students);
        mav.setViewName("confirmStudentRegistration");
        return mav;
    }

    @RequestMapping("viewStudentToConfirm")
    public ModelAndView viewStudentToConfirmFunction(@RequestParam("student_id") String student_id) {
        ModelAndView mav = new ModelAndView();
        Student student = new Student();
        try {
            student = stddao.findById(student_id);
            mav.addObject("student", student);
            mav.setViewName("viewStudentToConfirm");
            return mav;
        } catch (Exception e) {
            e.printStackTrace();
            mav.setViewName("redirect:/confirmStudentRegistration");
            return mav;
        }
    }

    @RequestMapping("confirmStudent")
    public ModelAndView confirmStudentFucntion(@RequestParam("student_id") String student_id) {
        ModelAndView mav = new ModelAndView();
        StudentLoginCommand studentLoginCommand = new StudentLoginCommand();
        try {
            studentLoginCommand = stdldao.findByStudent_id(student_id);
            studentLoginCommand.setStatus(1);
            stdldao.update(studentLoginCommand);
            mav.setViewName("manageStudent");
            mav.addObject("info","student with student id="+student_id+" was confirmed successfully");
            return mav;
        }catch(Exception e){
            e.printStackTrace();
            mav.setViewName("manageStudent");
            mav.addObject("info","student with student id="+student_id+" was not confirmed");
            return mav;
        }
    }
    @RequestMapping("rejectStudentConfirmation")
    public ModelAndView rejectStudentConfirmationFunction(@RequestParam("student_id") String student_id){
        ModelAndView mav=new ModelAndView();
        try{
            stdldao.deleteByStudent_id(student_id);
            stddao.delete(student_id);
            mav.setViewName("manageStudent");
            mav.addObject("info","Student was rejected successfully");
            return mav;
        }catch(Exception e){
            e.printStackTrace();
            mav.setViewName("manageStudent");
            mav.addObject("info","Student was not rejected");
            return mav;
        }
    }
    @RequestMapping("updateStudentsGrades")
    public ModelAndView updateStudentsGradesFunction() {
        ModelAndView mav = new ModelAndView();
        Student student = new Student();
        mav.addObject("student", student);
        mav.setViewName("updateStudentsGrades");
        return mav;
    }
}
