/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.sms.admincontroller;

import in.sms.command.AdminLoginCommand;
import in.sms.command.FacultyCommand;
import in.sms.dao.BranchDaoImpl;
import in.sms.dao.FacultyDaoImpl;
import in.sms.dao.adminLoginDaoImpl;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author windows 8
 */
@Controller
public class adminServices {

    @Autowired
    adminLoginDaoImpl adminlcdao;
    @Autowired
    FacultyDaoImpl fdao;
    @Autowired
    BranchDaoImpl bdao;

    @RequestMapping("/adminLogout")
    public String adminLogoutFunction() {
        return "indexForm";
    }

    @RequestMapping("/addOtherAdmin")
    public ModelAndView addOtherAdminFuncion(HttpSession session) {
        AdminLoginCommand adlc = new AdminLoginCommand();
        ModelAndView mav = new ModelAndView();
        mav.addObject("adminlc", adlc);
        mav.setViewName("registerAdmin");
        return mav;
    }

    @RequestMapping("manageFaculty")
    public String manageFacultyFunction(HttpSession session) {
        return "manageFaculty";
    }

    @RequestMapping("addNewFaculty")
    public ModelAndView addNewFacultyFunciton(HttpSession session) {
        ModelAndView mav = new ModelAndView();
        FacultyCommand fc = new FacultyCommand();
        mav.addObject("faculty", fc);
        mav.setViewName("addNewFaculty");
        return mav;
    }

    @RequestMapping("listFaculty")
    public ModelAndView listFacultyFuction(HttpSession session) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("listFaculty");
        mav.addObject("branches", bdao.findAll());
        return mav;
    }

    @RequestMapping("listFacultyForBranch")
    public ModelAndView listFacultyForBranchFuction(@RequestParam("branch_id") String branch_id, HttpSession session) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("listFacultyForBranch");
        String fid = "mnit" + branch_id + "%";
        List<FacultyCommand> faculties = new ArrayList<FacultyCommand>();
        faculties = fdao.findAllForABranch(fid);
        mav.addObject("faculties", faculties);
        return mav;
    }

    @RequestMapping("saveNewFaculty")
    public ModelAndView saveNewFacultyFucntion(@ModelAttribute("faculty") FacultyCommand faculty, HttpSession session) {
        ModelAndView mav = new ModelAndView();
        System.out.println("Faculty id=" + faculty.getFaculty_id());
        mav.setViewName("manageFaculty");
        try {
            fdao.save(faculty);
            mav.addObject("info", "Faculty information added successfully.");
        } catch (Exception e) {
            mav.addObject("info", "Faculty information was not added please retry!!!");
        }
        return mav;
    }

    @RequestMapping("registerAdminSave")
    public ModelAndView registerAdminSaveFunction(@ModelAttribute("adminlc") AdminLoginCommand adminlc, ModelAndView mav, HttpSession session) {
        adminlcdao.save(adminlc);
        mav.setViewName("adminLoginSuccess");
        return mav;
    }

    @RequestMapping("updateFacultyInformation")
    public ModelAndView updateFacutlyInformationFunction(HttpSession session, ModelAndView mav) {
        FacultyCommand fc = new FacultyCommand();
        mav.addObject("faculty", fc);
        mav.setViewName("updateFacultyInformation");
        return mav;
    }

    @RequestMapping("removeFaculty")
    public ModelAndView removeFacultyFunction(HttpSession session) {
        ModelAndView mav = new ModelAndView();
        FacultyCommand fc = new FacultyCommand();
        mav.addObject("faculty", fc);
        mav.setViewName("removeFaculty");
        return mav;
    }

    @RequestMapping("updateThisFaculty")
    public ModelAndView updateThisFacultyFucntion(@RequestParam("faculty_id") String faculty_id, HttpSession session) {
        ModelAndView mav;
        mav = new ModelAndView();
        mav.setViewName("updateThisFaculty");
        System.out.println("Faculty id:=" + faculty_id);
        mav.addObject("faculty", fdao.findById(faculty_id));
        return mav;
    }

    @RequestMapping("updateThisFacultySave")
    public ModelAndView updateThisFacultySaveFucntion(@ModelAttribute("faculty") FacultyCommand faculty, HttpSession session) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("manageFaculty");
        mav.addObject("info", "Faculty information updated successfully");
        fdao.update(faculty);
        return mav;
    }

    @RequestMapping("facultyToBeUpdatedById")
    public ModelAndView listFacultyToBeUpdatedByIdFunction(@ModelAttribute("faculty") FacultyCommand faculty, HttpSession session) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("facultyToBeUpdated");
        mav.addObject("faculty", fdao.findById(faculty.getFaculty_id()));
        return mav;
    }

    @RequestMapping("facultyToBeUpdatedById2")
    public ModelAndView listFacultyToBeUpdatedById2Function(@RequestParam("faculty_id") String faculty_id, HttpSession session) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("facultyToBeUpdated");
        mav.addObject("faculty", fdao.findById(faculty_id));
        return mav;
    }

    @RequestMapping("listFacultyToBeUpdatedByName")
    public ModelAndView listFacultyToBeUpdatedByNameFunction(@ModelAttribute("faculty") FacultyCommand faculty, HttpSession session) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("listOfFacultyToBeUpdated");
        mav.addObject("faculties", fdao.findByName(faculty.getFirst_name()));
        return mav;
    }

    @RequestMapping("facultyToBeRemovedById")
    public ModelAndView listFacultyToBeRemovedByIdFunction(@ModelAttribute("faculty") FacultyCommand faculty, HttpSession session) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("facultyToBeRemoved");
        mav.addObject("faculty", fdao.findById(faculty.getFaculty_id()));
        return mav;
    }

    @RequestMapping("removeThisFaculty")
    public ModelAndView removeThisFacultyFucntion(@RequestParam("faculty_id") String faculty_id, HttpSession session) {
        ModelAndView mav;
        mav = new ModelAndView();
        mav.setViewName("manageFaculty");
        //System.out.println("Faculty id:="+faculty_id);
        try {
            fdao.deleteByFacultyId(faculty_id);
            mav.addObject("info", "Faculty information with faculty id=" + faculty_id + " remove successfully.");
        } catch (Exception e) {
            e.printStackTrace();
            mav.addObject("info", "Faculty information with faculty id=" + faculty_id + " was not removed.");
        }
        return mav;
    }

    @RequestMapping("listFacultyToBeRemovedByName")
    public ModelAndView listFacultyToBeRemovedByNameFunction(@ModelAttribute("faculty") FacultyCommand faculty, HttpSession session) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("listOfFacultyToBeRemoved");
        mav.addObject("faculties", fdao.findByName(faculty.getFirst_name()));
        return mav;
    }

    @RequestMapping("facultyToBeRemovedById2")
    public ModelAndView listFacultyToBeRemovedById2Function(@RequestParam("faculty_id") String faculty_id, HttpSession session) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("manageFaculty");
        try {
            fdao.deleteByFacultyId(faculty_id);
            mav.addObject("info", "Faculty information with faculty id=" + faculty_id + " remove successfully.");
        } catch (Exception e) {
            e.printStackTrace();
            mav.addObject("info", "Faculty information with faculty id=" + faculty_id + " was not removed.");
        }
        return mav;
    }
}
