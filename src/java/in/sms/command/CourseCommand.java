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
public class CourseCommand {
    private String course_id;
    private String course_name;
    private String faculty_id1;
    private String faculty_id2;
    private Integer credits;
    private String branch;
    private Integer semester;

    public CourseCommand() {
    }

    
    
    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getFaculty_id1() {
        return faculty_id1;
    }

    public void setFaculty_id1(String faculty_id1) {
        this.faculty_id1 = faculty_id1;
    }

    public String getFaculty_id2() {
        return faculty_id2;
    }

    public void setFaculty_id2(String faculty_id2) {
        this.faculty_id2 = faculty_id2;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public Integer getSemester() {
        return semester;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }
    
}
