<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<%@include file="common/adminheader.jsp" %>
<div class="col-lg-12">
    <h1 class="page-header">
        <font style="text-transform: capitalize;">Faculty Information</font>
    </h1>
    <ol class="breadcrumb">
        <li class="active">
            <i class="fa fa-database"></i>Details about the selected faculty
        </li>
    </ol>
</div>
<f:form action="updateThisFaculty.htm?faculty_id=${faculty.getFaculty_id()}" commandName="faculty">
    <table>
        <tr>
            <td><strong>Faculty Name:</strong></td><td>${faculty.getTitle()} ${faculty.getFirst_name()} ${faculty.getLast_name()}</td>
        </tr>
        <tr>
            <td><strong>Faculty Id:</strong></td><td>${faculty.getFaculty_id()}</td>
        </tr>
        <tr>
            <td><strong>Designation:</strong></td><td>${faculty.getDesignation()}</td>
        </tr>
        <tr>
            <td><strong>Research Area:</strong></td><td>${faculty.getResearch_area()}</td>
        </tr>
        <tr>
            <td><strong>Contact Number:</strong></td><td>${faculty.getContact_number()}</td>
        </tr>
        <tr>
            <td><strong>Email Primary:</strong></td><td>${faculty.getEmail_primary()}</td>
        </tr>
        <tr>
            <td><strong>Email Secondary:</strong></td><td>${faculty.getEmail_secondary()}</td>
        </tr>
        <tr>
            <td><strong>Land Line Number:</strong></td><td>${faculty.getLand_line_number()}</td>
        </tr>
        <tr><td colspan="2"><button type="submit" class="btn-success">Update</button></td></tr>
    </table>
</f:form>
<%@include file="common/adminfooter.jsp" %>