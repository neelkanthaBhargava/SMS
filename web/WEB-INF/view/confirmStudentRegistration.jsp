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
            <i class="fa fa-database"></i>Various unconfirmed students are
        </li>
    </ol>
</div>
<table class="table-bordered">
    <thead>
    <th>Sr. No.</th>
    <th>Student Id</th>
    <th>Email</th>
    <th>Action</th>
</thead>
<tbody>
    <c:forEach items="${students}" var="s" varStatus="status">
        <tr>
            <td>
                ${status.count}
            </td>
            <td>
                ${s.getStudent_id()}
            </td>
            <td>
                ${s.getEmail()}
            </td>
            <td>
                <a href="viewStudentToConfirm.htm?student_id=${s.getStudent_id()}"><button  class="btn-info">View</button></a>
                <a href="confirmStudent.htm?student_id=${s.getStudent_id()}"><button  class="btn-success">Confirm</button></a>
                <a href="rejectStudentConfirmation.htm?student_id=${s.getStudent_id()}"><button  class="btn-danger">Reject</button></a>
            </td>
            
        </tr>
    </c:forEach>
</tbody>
</table>
<%@include file="common/adminfootermanagestudent.jsp" %>