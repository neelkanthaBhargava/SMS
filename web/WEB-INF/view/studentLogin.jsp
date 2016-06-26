<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<head>
<meta charset="utf-8">
<title>Student Login</title>
<spring:url value="/resources/css/style.css" var="mainCss" />
<link href="${mainCss}" rel="stylesheet" />
</head>
<body bgcolor="#E6E6FA">
<div class="container">
	<section id="content">
		<f:form action="confirmStudentLogin.htm" commandName="student">
			<h1>Student Login</h1>
			<div>
				<input type="text" placeholder="Username" required="true" name="user_name" />
			</div>
			<div>
				<input type="password" placeholder="Password" required="true" name="password" />
			</div>
			<div>
				<input type="submit" value="Log in" />
				<a href="registerStudent.htm">Register</a>
			</div>
		</f:form>
	</section>
</div>
</body>
</html>

