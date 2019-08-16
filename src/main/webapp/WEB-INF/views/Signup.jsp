<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
.error {
	color: red;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SignUp</title>
</head>
<body>
	<f:form action="signupdata" method="post" commandName="student">
		FirstName : <f:input path="firstName" />
		<f:errors path="firstName" cssClass="error"></f:errors><br> 
		LastName : <f:input path="lastName" />
		<f:errors cssClass="error" path="lastName"></f:errors><br>
		Email : <f:input path="email" />
		<f:errors cssClass="error" path="email"></f:errors><br>
		Password : <f:input path="password" />
		<f:errors cssClass="error" path="password"></f:errors><br>
		<input type="submit" value="Signup" />
	</f:form>
</body>
</html>