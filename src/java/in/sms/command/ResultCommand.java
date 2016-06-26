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
public class ResultCommand {
    private String student_id;
    private String course_id;
    private String grade;
    private Integer semester;
    private String year;
    private String course_name;
    private Integer credits;
    private Integer status;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }
    

    public ResultCommand() {
    }

    public String getStudent_id() {
        return student_id;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getGrade() {
        return grade;
    }

    public Integer getSemester() {
        return semester;
    }

    public String getYear() {
        return year;
    }
    
}
