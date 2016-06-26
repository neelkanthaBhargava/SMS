/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.sms.command;

import java.sql.Date;

/**
 *
 * @author windows 8
 */
public class Student {
    private String student_id;
    private String first_name;
    private String last_name;
    private Integer year;
    private Integer section;
    private Date DOB;
    private Integer age;
    private Date admission_date;
    private Float cgpa;
    private String email;
    private String contact_number;
    private String address;
    private String city;
    private String state;
    private String father_name;
    private String program;
    private String gender;
    private String branch;
    private Integer semester;

    public Integer getSemester() {
        return semester;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }
    
    
    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getGender() {
        return gender;
    }

    public String getBranch() {
        return branch;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setSection(Integer section) {
        this.section = section;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setAdmission_date(Date admission_date) {
        this.admission_date = admission_date;
    }

    public void setCgpa(Float cgpa) {
        this.cgpa = cgpa;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setFather_name(String father_name) {
        this.father_name = father_name;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public Student() {
    }

    public String getStudent_id() {
        return student_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public Integer getYear() {
        return year;
    }

    public Integer getSection() {
        return section;
    }

    public Date getDOB() {
        return DOB;
    }

    public Integer getAge() {
        return age;
    }

    public Date getAdmission_date() {
        return admission_date;
    }

    public Float getCgpa() {
        return cgpa;
    }

    public String getEmail() {
        return email;
    }

    public String getContact_number() {
        return contact_number;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getFather_name() {
        return father_name;
    }

    public String getProgram() {
        return program;
    }
    
    
}
