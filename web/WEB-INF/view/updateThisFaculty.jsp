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
<f:form action="updateThisFacultySave.htm" commandName="faculty">
    <table>
        <tr>
            <td><strong>Faculty Title:</strong></td><td><f:input path="title"></f:input></td>
            </tr>
            <tr>
                <td><strong>First Name:</strong></td><td><f:input path="first_name"></f:input></td>
            </tr>
            <tr>
                <td><strong>Last Name:</strong></td><td><f:input path="last_name"></f:input></td>
            </tr>
            <tr>
                <td><strong>Faculty Id:</strong></td><td><f:input path="faculty_id"></f:input></td>
            </tr>
            <tr>
                <td><strong>Designation:</strong></td><td><f:input path="designation"></f:input></td>
        </tr>
        <tr>
            <td><strong>Research Area:</strong></td><td><f:input path="research_area"></f:input></td>
        </tr>
        <tr>
            <td><strong>Contact Number:</strong></td><td><f:input path="contact_number"></f:input></td>
        </tr>
        <tr>
            <td><strong>Email Primary:</strong></td><td><f:input path="email_primary"></f:input></td>
        </tr>
        <tr>
            <td><strong>Email Secondary:</strong></td><td><f:input path="email_secondary"></f:input></td>
        </tr>
        <tr>
            <td><strong>Land Line Number:</strong></td><td><f:input path="land_line_number"></f:input></td>
        </tr>
        <tr><td><button type="submit" class="btn-success">Update</button></td></f:form>
        <f:form action="updateFacultyInformation.htm"><td><button class="btn-success">Cancel</button></td></tr></f:form>
    </table>
<%@include file="common/adminfooter.jsp" %>