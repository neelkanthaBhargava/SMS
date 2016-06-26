<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<%@include file="common/studentheader.jsp" %>
<style>
    tr{
        height :30px;
    }
</style>
<div class="col-lg-12">
    <h1 class="page-header">
        <font style="text-transform: capitalize;">${student.getFirst_name()}'s Profile </font>
    </h1>
    <ol class="breadcrumb">
        <li class="active">
            <i class="fa fa-dashboard"></i>  Your Profile
        </li>
    </ol>
</div>
<f:form action="updateStudentProfile.htm">
    <table>
        <tr>
            <td><label>Student Name</label></td>
            <td><strong>:  <font style="text-transform: capitalize;">${student.getFirst_name()} ${student.getLast_name()}</font></strong></td>	
        </tr>
        <tr>
            <td><label> Student ID</label></td>
            <td><strong>:  ${student.getStudent_id()}</strong></td>	
        </tr>

        <tr class="spaceUnder">
            <td><label>E-mail</label></td>
            <td><strong>:  ${student.getEmail()}</strong></td>	
        </tr>

        <tr>
            <td><label>Date of Birth</label></td>
            <td><strong>:  ${student.getDOB()}</strong></td>	
        </tr>

        <tr>
            <td><label>Age</label></td>
            <td><strong>:  ${student.getAge()}</strong></td>	
        </tr>

        <tr>
            <td><label>Year</label></td>
            <td><strong>:  ${student.getYear()}</strong></td>	
        </tr>

        <tr>
            <td><label> CGPA</label></td>
            <td><strong>:  ${student.getCgpa()}</strong></td>	
        </tr>

        <tr>
            <td><label>Contact Number</label></td>
            <td><strong>:  ${student.getContact_number()}</strong></td>	
        </tr>

        <tr>
            <td><label>Address</label></td>
            <td><strong>:  ${student.getAddress()}, ${student.getCity()}, ${student.getState()}</strong></td>	
        </tr>


        <tr>
            <td><label>Program</label></td>
            <td><strong>:  ${student.getProgram()}</strong></td>	
        </tr>

        <tr>
            <td><label>Branch</label></td>
            <td><strong>:  ${student.getBranch()}</strong></td>	
        </tr>

        <tr>
            <td><label>Father's Name</label></td>
            <td><strong>:  ${student.getFather_name()}</strong></td>	
        </tr>


    </table>
<input type="submit" value="Update Profile"/>
</f:form>
<%@include file="common/studentfooter.jsp" %>