<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<head>
<meta charset="utf-8">
<title>Admin Login</title>
<spring:url value="/resources/css/style.css" var="mainCss" />
<link href="${mainCss}" rel="stylesheet" />
</head>
<body bgcolor="#E6E6FA">
<div class="container">
	<section id="content">
		<f:form action="confirmAdminLogin.htm" commandName="adminCommand">
			<h1>Admin Login</h1>
			<div>
				<input type="text" placeholder="Username" required="true" name="user_name" />
			</div>
			<div>
				<input type="password" placeholder="Password" required="true" name="password" />
			</div>
			<div>
				<input type="submit" value="Log in" />
			</div>
                        <strong>${err}</strong>
		</f:form>
	</section>
</div>
</body>
</html>

