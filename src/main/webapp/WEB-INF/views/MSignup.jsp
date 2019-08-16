<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
.error {
	color: red;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Signup</title>
</head>
<body>
	<f:form action="msignupdata" method="post" commandName="sl">


		<c:forEach items="${sl.students}" var="s" varStatus="status">
	
			FirstName: <input type="text"
				name="students[${status.index}].firstName" value="${s.firstName}" />
			<br>
			LastName: <input type="text"
				name="students[${status.index}].lastName" value="${s.lastName}" />
			<br>

		</c:forEach>


		<input type="submit" value="Signup" />


	</f:form>

</body>
</html>




