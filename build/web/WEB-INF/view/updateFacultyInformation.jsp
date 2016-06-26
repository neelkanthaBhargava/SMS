<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<%@include file="common/adminheader.jsp" %>
<div class="col-lg-12">
    <h1 class="page-header">
        <font style="text-transform: capitalize;">Update faculty information</font>
    </h1>
    <ol class="breadcrumb">
        <li class="active">
            <i class="fa fa-database"></i>Please enter the faculty id or faculty name
        </li>
    </ol>
</div>
<f:form commandName="faculty" action="facultyToBeUpdatedById.htm">
    <table class="table-bordered">
        <tr>
            <td><strong>Search by Faculty id</strong></td>
            <td><f:input path="faculty_id"/></td>
            <td><button class="btn-info" type="submit">Search</button></td></f:form>
        </tr>
        <tr>
            <f:form commandName="faculty" action="listFacultyToBeUpdatedByName.htm">
            <td><strong>Search by Faculty Name</strong></td>
            <td><f:input path="first_name"/>
            <td><button class="btn-info" type="submit">Search</button></td>
        </tr>
    </table>
</f:form>
<%@include file="common/adminfooter.jsp" %>