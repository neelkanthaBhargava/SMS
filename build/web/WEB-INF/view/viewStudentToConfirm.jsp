<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<%@include file="common/adminheadermanagestudent.jsp" %>
<div class="col-lg-12">
    <h1 class="page-header">
        <font style="text-transform: capitalize;">Student Registration Page</font>
    </h1>
    <ol class="breadcrumb">
        <li class="active">
            <i class="fa fa-database"></i>Student Details
        </li>
    </ol>
</div>
<table class="table-striped">
    <tr>
        <td>Student Id</td>
        <td>${student.getStudent_id()}</td>
    </tr>
    <tr>
        <td>Student Name</td>
        <td>${student.getFirst_name()} ${student.getLast_name()}</td>
    </tr>
    <tr>
        <td>Gender</td>
        <td>${student.getGender()}</td>
    </tr>
    <tr>
        <td>Father's Name</td>
        <td>${student.getFather_name()}</td>
    </tr>
    <tr>
        <td>Program</td>
        <td>${student.getProgram()}</td>
    </tr>
    <tr>
        <td>Branch</td>
        <td>${student.getBranch()}</td>
    </tr>
    <tr>
        <td>DOB</td>
        <td>${student.getDOB()}</td>
    </tr>
    <tr>
        <td>Email</td>
        <td>${student.getEmail()}</td>
    </tr>
    <tr>
        <td>Contact Number</td>
        <td>${student.getContact_number()}</td>
    </tr>
    <tr>
        <td>Address</td>
        <td>${student.getAddress()} ${student.getCity()} ${student.getState()}</td>
    </tr>
    <tr>
        <td><a href="confirmStudent.htm?student_id=${student.getStudent_id()}"><button class="btn-success">Confirm</button></a></td>
        <td><a href="rejectStudentConfirmation.htm?student_id=${student.getStudent_id()}"><button class="btn-danger">Reject</button></a></td>
    </tr>
</table>
<%@include file="common/adminfootermanagestudent.jsp" %>