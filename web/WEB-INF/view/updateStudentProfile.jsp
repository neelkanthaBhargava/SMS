<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<%@include file="common/studentheader.jsp" %>
<div class="col-lg-12">
    <h1 class="page-header">
        <font style="text-transform: capitalize;">${student.getFirst_name()}'s Profile </font>
    </h1>
    <ol class="breadcrumb">
        <li class="active">
            <i class="fa fa-dashboard"></i>  Update Your Profile
        </li>
    </ol>
</div>
<f:form action="updateStudentProfileSave.htm" commandName="student_update">
    <table>
        <tr>
            <td><label>First Name</label></td>
            <td><f:input type="text" path= "first_name"/></td>	
        </tr>
        <tr>
            <td><label>Last Name</label></td>
            <td><f:input type="text" path= "last_name"/></td>	
        </tr>

        <tr class="spaceUnder">
            <td><label>E-mail</label></td>
            <td><f:input type="text" path="email"/></td>	
        </tr>

        <tr>
            <td><label> Student_ID</label></td>
            <td><f:input type="text" path= "student_id"/></td>	
        </tr>

        <tr>
            <td><label>Section</label></td>
            <td><f:input type="text" path= "section"/></td>	
        </tr>

        <tr>
            <td><label>Date of Birth(dd/mm/yyyy)</label></td>
            <td><f:input type="text" path= "DOB"/></td>	
        </tr>

        <tr>
            <td><label>Age</label></td>
            <td><f:input type="text" path= "age"/></td>	
        </tr>

        <tr>
            <td><label>Year</label></td>
            <td><f:input type="text" path= "year"/></td>	
        </tr>

        <tr>
            <td><label> CGPA</label></td>
            <td><f:input type="text" path= "cgpa"/></td>	
        </tr>

        <tr>
            <td><label>Contact Number</label></td>
            <td><f:input type="text" path= "contact_number"/></td>	
        </tr>

        <tr>
            <td><label>Address</label></td>
            <td><f:input type="text" path= "address"/></td>	
        </tr>

        <tr>
            <td><label>City</label></td>
            <td><f:input type="text" path= "city"/></td>	
        </tr>

        <tr>
            <td><label>State</label></td>
            <td><f:input type="text" path= "state"/></td>	
        </tr>
        <tr>
            <td><label>Program</label></td>
            <td><f:input type="text" path= "program"/></td>	
        </tr>

        <tr>
            <td><label>Branch</label></td>
            <td><f:input type="text" path= "branch"/></td>	
        </tr>

        <tr>
            <td><label>Father's Name</label></td>
            <td><f:input type="text" path= "father_name"/></td>	
        </tr>

        <tr>
            <td><input type="submit" value="Save"/></td></f:form>
            <td>
            <f:form action="viewStudentProfile.htm">
                <button type="submit"/>Cancel</button>
            </f:form>

        </td>
    </tr>
</table>


<%@include file="common/studentfooter.jsp" %>