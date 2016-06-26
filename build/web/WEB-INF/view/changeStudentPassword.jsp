<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<%@include file="common/studentheader.jsp" %>
<div class="col-lg-12">
    <h1 class="page-header">
        <font style="text-transform: capitalize;">Password Management </font>
    </h1>
    <ol class="breadcrumb">
        <li class="active">
            <i class="fa fa-dashboard"></i>  Update Your Password
        </li>
    </ol>
</div>
<f:form action="updateStudentPassword.htm" commandName="stdlc">
    <table>
        <tr>
            <td><label>Old Password:</label></td>
            <td><input type="password" name="old_password" required="true"/></td>
        </tr>
        <tr>
            <td>
                <label>New Password:</label>
            </td>
            <td>
                <f:input type="password" path="password" required="true"/>
            </td>
        </tr>
        <tr>
            <td>
                <label>Confirm Password:</label>
            </td>
            <td>
                <input type="password" required="true"/>
            </td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="update password"/></td>
        </tr>
    </table>
</f:form>
<%@include file="common/studentfooter.jsp" %>