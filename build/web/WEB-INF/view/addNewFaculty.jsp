<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<%@include file="common/adminheader.jsp" %>
<div class="col-lg-12">
    <h1 class="page-header">
        <font style="text-transform: capitalize;">Faculty Registration</font>
    </h1>
    <ol class="breadcrumb">
        <li class="active">
            <i class="fa fa-database"></i>Please fill out the below given details
        </li>
    </ol>
</div>
<f:form action="saveNewFaculty.htm" commandName="faculty">
    <table class="table-condensed">
        <tr>
            <td>Faculty Id:</td>
            <td><f:input path="faculty_id"></f:input></td>
            </tr>
            <tr>
                <td>Title:</td>
                <td>
                <f:select path="title">
                    <f:option value="Dr.">Dr.</f:option>
                    <f:option value="Mr.">Mr.</f:option>
                    <f:option value="Miss.">Miss.</f:option>
                </f:select>
                </td>
            </tr>
            <tr>
                <td>First Name:</td>
                <td><f:input path="first_name"></f:input></td>
            </tr>
            <tr>
                <td>Last Name:</td>
                <td><f:input path="last_name"></f:input></td>
            </tr>
            <tr>
                <td>Contact Number:</td>
                <td><f:input path="contact_number"></f:input></td>
            </tr>
            <tr>
                <td>Designation:</td>
                <td><f:input path="designation"></f:input></td>
            </tr>
            <tr>
                <td>Research Area:</td>
                <td><f:input path="research_area"></f:input></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><f:input path="email_primary"></f:input></td>
            </tr>
            <tr>
                <td>Email(Secondary):</td>
                <td><f:input path="email_secondary"></f:input></td>
            </tr>
            <tr>
                <td>Land Line Number:</td>
                <td><f:input path="land_line_number"></f:input></td>
            </tr>
            <tr>
                <td><button type="submit" class="register">Register</button></td></f:form>
                <td><f:form action="manageFaculty.htm">
                <button type="submit">Cancel</button>
                </f:form></td>
    </tr>
</table>
<%@include file="common/adminfooter.jsp" %>