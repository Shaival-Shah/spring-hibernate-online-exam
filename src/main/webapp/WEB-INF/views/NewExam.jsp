<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AddExam</title>
</head>
<body>
	<f:form action="addexam" method="post" modelAttribute="exam">
		Title: <f:input path="title" />
		<br>
		Code : <f:input path="code" />
		<br>
		TotalMarks:<f:input path="marks" />
		<br>
		PassingPercentage:<f:input path="passingPercentage" />
		<br>
		<input type="submit" value="SaveExam" />
	</f:form>
</body>
</html>