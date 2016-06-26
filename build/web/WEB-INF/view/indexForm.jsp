<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<head>
<meta charset="utf-8">
<title>SMS</title>
<spring:url value="/resources/css/style.css" var="mainCss" />
<link href="${mainCss}" rel="stylesheet" />
</head>
<body bgcolor="#E6E6FA">
<div class="container">
	<section id="content">
		<f:form action="studentLogin.htm">
			<h1>SMS</h1>
			<div>
                            <input type="submit" href="studentLogin.htm" value="Student Login" />
				<!--<a href="registerStudent.htm">Register</a>-->
			</div>
		</f:form>
                <f:form action="adminLogin.htm">
			<div align="center">
                            <input type="submit" href="adminLogin.htm" value="Admin Login" />
				<!--<a href="registerStudent.htm">Register</a>-->
			</div>
		</f:form>
                
	</section>
</div>
</body>
</html>

