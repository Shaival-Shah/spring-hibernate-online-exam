<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AddQuestion</title>
</head>
<body>
	<f:form action="addquestion" method="post" modelAttribute="question">
		ExamId : <f:input path="examId" /><br>
		Question: <f:input path="question" /><br>
		Option1:<f:input path="o1" /><br>
		Option2:<f:input path="o2" /><br>
		Option3:<f:input path="o3" /><br>
		Option4:<f:input path="o4" /><br>
		Answer:<f:input path="correctAnswer" /><br>
		<input type="submit" value="Save Question" />
	</f:form>
</body>
</html>