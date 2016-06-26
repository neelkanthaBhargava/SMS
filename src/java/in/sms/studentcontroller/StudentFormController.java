/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.sms.studentcontroller;

import in.sms.command.CourseCommand;
import in.sms.command.ResultCommand;
import in.sms.command.Student;
import in.sms.command.StudentLoginCommand;
import in.sms.dao.BaseNamedParameterJdbcTemplate;
import in.sms.dao.CourseDaoImpl;
import in.sms.dao.ResultDaoImpl;
import in.sms.dao.StudentDaoImpl;
import in.sms.studentservice.LoginService;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import sun.security.pkcs11.wrapper.Functions;

/**
 *
 * @author windows 8
 */
@Controller
public class StudentFormController extends BaseNamedParameterJdbcTemplate {

    @Autowired
    StudentDaoImpl stdimpl = new StudentDaoImpl();
    @Autowired
    ResultDaoImpl resultdao;
    @Autowired
    CourseDaoImpl cdaoimpl;

    private Object DateTimeFormatter;

    @RequestMapping("/confirmStudentLogin")
    public ModelAndView confirmStudentLogin(@RequestParam("user_name") String user_name, @RequestParam("password") String password, ModelAndView mav, HttpSession session) {
        LoginService loginservice = new LoginService();
        mav.setViewName("studentLogin");
        String student_id = loginservice.authenticate(user_name, password);
        if (null == student_id) {
            return mav;
        }
        mav.setViewName("studentLoginSuccess");
        //System.out.println("\nId of student is:"+student_id);
        Student student = stdimpl.findById(student_id);
        mav.addObject("student", student);
        //System.out.println("student city is:"+student.getCity());
        session.setAttribute("student", student);
        return mav;
    }

    @RequestMapping("/studentLoginSuccess")
    public String studentLoginSuccessFunction() {
        return "studentLoginSuccess";
    }

    @RequestMapping("/studentGrades")
    public ModelAndView studentGradesFunction(HttpSession session) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("gradestudent");
        return mav;
    }

    @RequestMapping("/registerStudent")
    public ModelAndView registerStudent(ModelAndView mav) {
        //ModelAndView mav=new ModelAndView();
        Student student = new Student();
        mav.addObject("student", student);
        mav.setViewName("registerStudent");
        return mav;
    }

    @RequestMapping("/updateStudentProfile")
    public ModelAndView updateStudentProfileFunction(HttpSession session) {
        ModelAndView mav = new ModelAndView();
        Student student_update = new Student();
        mav.addObject("student_update", student_update);
        mav.setViewName("updateStudentProfile");
        return mav;
    }

    @RequestMapping("/studentLogout")
    public String studentLogoutFunction(HttpSession session) {
        session.invalidate();
        return "indexForm";
    }

    @RequestMapping("dropCourse")
    public String dropCoursesFunction(@RequestParam("courseId") String course_id, HttpSession session) {
        //ModelAndView mav=new ModelAndView();
        //mav.setViewName("");
        Student student = (Student) session.getAttribute("student");
        resultdao.deleteByStudentIdAndCourseId(student.getStudent_id(), course_id);
        return "redirect:/addAndDrop.htm";
    }

    @RequestMapping("addCourse")
    public String addCoursesFunction(@RequestParam("courseId") String course_id, HttpSession session) {
        //ModelAndView mav=new ModelAndView();
        //mav.setViewName("");
        Student student = (Student) session.getAttribute("student");
        ResultCommand rctemp = new ResultCommand();
        rctemp = resultdao.findById(student.getStudent_id(), course_id);
        if (null == rctemp) {
            CourseCommand cc = new CourseCommand();
            cc = cdaoimpl.findById(course_id);
            ResultCommand rc = new ResultCommand();
            rc.setCourse_id(cc.getCourse_id());
            rc.setCourse_name(cc.getCourse_name());
            rc.setCredits(cc.getCredits());
            rc.setSemester(cc.getSemester());
            rc.setStatus(0);
            rc.setStudent_id(student.getStudent_id());
            rc.setYear("2013-17");                      //CORRECT IT AFTERWARDS
            try {
                resultdao.save(rc);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "redirect:/addAndDrop.htm";
    }

    @RequestMapping("/addAndDrop")
    public ModelAndView addAndDropFunction(HttpSession session) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("addAndDrop");
        Student student = (Student) session.getAttribute("student");
        List<CourseCommand> courses = new ArrayList<CourseCommand>();
        courses = cdaoimpl.findAllForSem(student.getSemester());
        List<ResultCommand> alreadyRegistred = new ArrayList<ResultCommand>();
        alreadyRegistred = resultdao.findAllForAStudentForASem(student.getStudent_id(), student.getSemester());
        mav.addObject("courses", courses);
        mav.addObject("alreadyRegistred", alreadyRegistred);
        return mav;
    }

    @RequestMapping("/fetchResultOfSem")
    public ModelAndView fetchResultOfSemFunction(@RequestParam("semester") String semester, HttpSession session) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("gradestudent");
        mav.addObject("semester", semester);
        Student student = (Student) session.getAttribute("student");
        //System.out.println("semester recived="+semester);
        List<ResultCommand> gradeList = new ArrayList<ResultCommand>();
        try {
            gradeList = resultdao.findAllForAStudentForASem(student.getStudent_id(), Integer.parseInt(semester));
            mav.addObject("gradelist", gradeList);
            float mul = 0;
            float sum = 0;
            for (ResultCommand rc : gradeList) {
                mul = mul + toNumeric(rc.getGrade()) * rc.getCredits();
                sum = sum + rc.getCredits();
            }
            mav.addObject("sgpa", mul / sum);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mav;
    }

    private int toNumeric(String gr) {
        switch (gr) {
            case "AA":
                return 10;
            case "aa":
                return 10;
            case "AB":
                return 9;
            case "ab":
                return 9;
            case "bb":
                return 8;
            case "BB":
                return 8;
            case "bc":
                return 7;
            case "BC":
                return 7;
            case "CC":
                return 6;
            case "cc":
                return 6;
            case "cd":
                return 5;
            case "CD":
                return 5;
            case "d":
                return 4;
            case "D":
                return 4;
            case "F":
                return 0;
            case "f":
                return 0;
        }
        return 0;
    }

    @RequestMapping("/viewStudentProfile")
    public String viewStudentProfileFunction(HttpSession session) {
        return "viewStudentProfile";
    }

    @RequestMapping("/updateStudentPassword")
    public ModelAndView updateStudentPasswordFunction(@ModelAttribute("stdlc") StudentLoginCommand stdlc, @RequestParam("old_password") String old_password, HttpSession session) {
        ModelAndView mav = new ModelAndView();
        Student student = (Student) session.getAttribute("student");
        stdlc.setStudent_id(student.getStudent_id());
        stdlc.setEmail(student.getEmail());
        System.out.println("old_password=" + old_password);
        System.out.println("new password is:" + stdlc.getPassword());
        stdimpl.updateStudentPassword(stdlc, old_password);
        mav.setViewName("studentLoginSuccess");
        return mav;
    }

    @RequestMapping("/changeStudentPassword")
    public ModelAndView changeStudentPassword(HttpSession session) {
        ModelAndView mav = new ModelAndView();
        Student student = (Student) session.getAttribute("student");
        //System.out.println("student is:"+student.getFirst_name()+student.getLast_name());
        //session.setAttribute("student", student);
        StudentLoginCommand stdlc = new StudentLoginCommand();
        mav.addObject("stdlc", stdlc);
        mav.setViewName("changeStudentPassword");
        return mav;
    }

    @RequestMapping("/registerStudentSave")
    public String registerStudentSave(@ModelAttribute("student") Student student, @RequestParam("password") String password, ModelAndView mav) {
        Student s = new Student();
        StudentLoginCommand stdlc = new StudentLoginCommand();
        stdlc.setEmail(student.getEmail());
        stdlc.setPassword(password);
        stdlc.setStudent_id(student.getStudent_id());
        stdlc.setUser_name(student.getStudent_id());
        System.out.println("\nPASSWORD RECIVED IS:" + password);

        System.out.println("This is the data recevied from student registration form");
        s.setAddress(student.getAddress());
        System.out.println("address=" + s.getAddress());
        //s.setAdmission_date(null);
        //=-------------------------------------------------------
//        String admission_date=admission_date_year+"-"+admission_date_month+"-"+admission_date_day;
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        java.util.Date convertedDateAdmission = sdf.parse(admission_date);
        //String date=sdf.format(convertedCurrentDate );
        //System.out.println(date);
//        System.out.println("Admission date is");
//        System.out.print(convertedDateAdmission);
        //--------------------------------------------------------
        //s.setAge(Integer.SIZE);
        s.setBranch(student.getBranch());
        System.out.println("branch=" + s.getBranch());
        s.setCgpa(student.getCgpa());
        s.setCity(student.getCity());
        s.setContact_number(student.getContact_number());
        //s.setDOB(null);
        s.setEmail(student.getEmail());
        s.setFather_name(student.getFather_name());
        s.setFirst_name(student.getFirst_name());
        s.setGender(student.getGender());
        s.setLast_name(student.getLast_name());
        s.setProgram(student.getProgram());
        s.setSection(student.getSection());
        s.setState(student.getState());
        s.setStudent_id(student.getStudent_id());
        stdimpl.save(s);
        stdimpl.saveInLogin(stdlc);
        return "redirect:/studentLogin.htm";
    }
}
