<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<%@include file="common/studentheader.jsp" %>
<script type="text/javascript">
    function deleteConfirm(del_url) {
        var status = confirm("Are you sure you want to drop out this course?");
        if (status) {
            window.location = del_url;
        }
    }
</script>
<div class="col-lg-12">
    <h1 class="page-header">
        <font style="text-transform: capitalize;">Add And/Or Drop Courses </font>
    </h1>
    <ol class="breadcrumb">
        <li class="active">
            <i class="fa fa-dashboard"></i>  Manage Your Courses
        </li>
    </ol>
</div>
<table class="table-bordered" align="center" width="1000px">
    <thead>
    <th>Sr. No.</th>
    <th>Course Id</th>
    <th>Course Name</th>
    <th>Faculty</th>
    <th>Action</th>
</thead>
<tbody>
    <tr><td colspan="5"><strong>Already Registered Courses</strong></td></tr>
    <c:forEach items="${alreadyRegistred}" var="ar" varStatus="status">
        <tr>
            <td>${status.count}</td>
            <td>${ar.getCourse_id()}</td>
            <td colspan="2">${ar.getCourse_name()}</td>
            <td><f:form action="dropCourse.htm?courseId=${ar.getCourse_id()}"><button class="btn-danger" type="submit">Drop</button></f:form></td>
</tr>
</c:forEach>
<tr><td colspan="5"><strong>All Courses</strong></td></tr>
<c:forEach items="${courses}" var="c" varStatus="status">
    <tr>
        <td>${status.count}</td>
        <td>${c.getCourse_id()}</td>
        <td>${c.getCourse_name()}</td>
        <td>${c.getFaculty_id1()}</td>
        <td><f:form action="addCourse.htm?courseId=${c.getCourse_id()}"><button class="btn-success">Add</button></f:form></td>
</tr>
</c:forEach>
</tbody>
</table>
<%@include file="common/studentfooter.jsp" %>