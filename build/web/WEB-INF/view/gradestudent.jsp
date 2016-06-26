<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<%@include file="common/studentheader.jsp" %>
<div class="col-lg-12">
    <h1 class="page-header">
        <font style="text-transform: capitalize;">${student.getFirst_name()}'s Grades </font>
    </h1>
    <ol class="breadcrumb">
        <li class="active">
            <i class="fa fa-dashboard"></i>  Result of sem ${semester}
        </li>
    </ol>
</div>
<table border="2" width="1000px" class="table-striped" align="center">
    <thead>
    <th colspan="2"><strong>Basic Information</strong></th>
</thead>
<tbody>
    <tr>
        <td><strong>Student Name:<font style="text-transform: capitalize;">${student.getFirst_name()} ${student.getLast_name()}</font></strong></td>
        <td><strong>Student Id:<font style="text-transform: capitalize;">${student.getStudent_id()}</font></strong></td>
    </tr>
    <tr>
        <td><strong>Semester:<font style="text-transform: capitalize;">${semester}</font></strong></td>
        <td><strong>Current Year:<font style="text-transform: capitalize;">${student.getYear()}</font></strong></td>
    </tr>
    <tr>
        <td><strong>Branch:<font style="text-transform: capitalize;">${student.getBranch()}</font></strong></td>
        <td><strong>Program:<font style="text-transform: capitalize;">${student.getProgram()}</font></strong></td>
    </tr>
    <tr>
        <td><strong>DOB:<font style="text-transform: capitalize;">${student.getDOB()}</font></strong></td>
        <td><strong>Father's Name:<font style="text-transform: capitalize;">${student.getFather_name()}</font></strong></td>
    </tr>
</tbody>
</table>
<table border="2" width="1000px" class="table-striped" align="center">
    <thead>
        <th width="60px">Sr. No.</th>
        <th ><strong>Course Id</strong></th>
        <th><strong>Course Name</strong></th>
        <th><strong>Credits</strong></th>
        <th><strong>Grade</strong></th>
    </thead>
<tbody>
    <c:forEach items="${gradelist}" var="gl" varStatus="status">
    <tr>
        <td>${status.count}</td>
        <td>${gl.getCourse_id()}</td>
        <td>${gl.getCourse_name()}</td>
        <td>${gl.getCredits()}</td>
        <td>${gl.getGrade()}</td>
        <!--sum(gl.getCredits(),gl.getGrade());-->
    </tr>
    </c:forEach>
    <tr>
        <td  colspan="5"><strong>SGPA=${sgpa}</strong></td>
    <tr>
</tbody>
</table>
<%@include file="common/studentfooter.jsp" %>