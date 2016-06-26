<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<%@include file="common/adminheader.jsp" %>
<div class="col-lg-12">
    <h1 class="page-header">
        <font style="text-transform: capitalize;">List of faculty</font>
    </h1>
    <ol class="breadcrumb">
        <li class="active">
            <i class="fa fa-database"></i>Please choose the branch of which you want to find list faculty
        </li>
    </ol>
</div>
<table class="table-bordered">
    <thead>
    <th>Sr. No.</th>
    <th>Faculty Id</th>
    <th>Name</th>
    <th>Designation</th>
    <th>Research Area</th>
    <th>Contact Number</th>
    <th>Email Primary</th>
    <th>Email Secondary</th>
    <th>Land Line</th>
    <th>Action</th>
</thead>
<tbody>
    <c:forEach items="${faculties}" var="f" varStatus="status">
        <tr>
            <td>${status.count}</td>
            <td>${f.getFaculty_id()}</td>
            <td>${f.getTitle()}&nbsp;${f.getFirst_name()}&nbsp;${f.getLast_name()}</td>
            <td>${f.getDesignation()}</td>
            <td>${f.getResearch_area()}</td>
            <td>${f.getContact_number()}</td>
            <td>${f.getEmail_primary()}</td>
            <td>${f.getEmail_secondary()}</td>
            <td>${f.getLand_line_number()}</td>
            <td><a href="facultyToBeUpdatedById2.htm?faculty_id=${f.getFaculty_id()}">Update</a></td>
        </tr>
    </c:forEach>
</tbody>
</table>
<%@include file="common/adminfooter.jsp" %>