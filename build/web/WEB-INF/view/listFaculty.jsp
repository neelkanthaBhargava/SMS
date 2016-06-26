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
<table class="table-bordered" width="1000px" align="center">
    <thead>
    <th>Sr. No.</th>
    <th>Brach Name</th>
    <th>Choose</th>
</thead>
<tbody>
    <c:forEach items="${branches}" var="b" varStatus="status">
        <tr>
            <td>${status.count}</td>
            <td>${b.getBranch_name()}</td>
            <!--<td>button</td>-->
            <!--<td colspan="2">${ar.getCourse_name()}</td>-->
            <td><f:form action="listFacultyForBranch.htm?branch_id=${b.getBranch_id()}"><button class="btn-group" type="submit">Choose</button></f:form></td>
        </tr>
    </c:forEach>
</tbody>
</table>
<%@include file="common/adminfooter.jsp" %>