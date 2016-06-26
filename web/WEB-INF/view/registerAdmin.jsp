<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
    <head>
        <title>Admin Registration Form</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
        <spring:url value="/resources/css/adminregist.css" var="mainCss" />
        <link href="${mainCss}" rel="stylesheet" />
        <!--<link rel="stylesheet" type="text/css" href=""/>-->
    </head>
    <body>    
        <f:form action="registerAdminSave.htm" commandName="adminlc" class="register">
            <h1>Registration</h1>
            <fieldset class="row1">
                <legend>Account Details
                </legend>
                <p>
                    <label>User Name *
                    </label>
                    <f:input path="user_name" class="long" required="true"/>
                </p>                
                <p>
                    <label>Email *
                    </label>
                    <f:input type="text" path= "email" required="true"/>
                </p>
                <p>
                    <label>Admin Id *
                    </label>
                    <f:input type="text" path="admin_id" required="true"/>
                </p>
                <p>
                    <label>Password*
                    </label>
                    <f:input id="pass1" type="password" path= "password" placeholder="password"/>
                    <label>Confirm Password*
                    </label>
                    <input id="pass2" type="password" placeholder="password" />
                    <label class="obinfo"> * obligatory fields
                    </label>
                </p>

                <script>
                    function myFunction() {
                        var pass1 = document.getElementById("pass1").value;
                        var pass2 = document.getElementById("pass2").value;
                        if (pass1 != pass2) {
                            alert("Passwords Do not match");
                            document.getElementById("pass1").style.borderColor = "#E34234";
                            document.getElementById("pass2").style.borderColor = "#E34234";
                        }
//                        else {
//                            alert("Passwords Match!!!");
//                        }
                    }
                </script>

                <div><button class="button" onclick="myFunction()">Register &raquo;</button></div>
            </f:form>
                <p><a href="adminLoginSuccess.htm"/>Cancel</p>
    </body>
</html>