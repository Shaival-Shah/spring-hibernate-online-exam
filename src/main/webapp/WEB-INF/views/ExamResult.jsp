<%@ page language="java" isELIgnored="false"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<b>ExamResult</b>
	<br>
	<c:forEach items="${userExams.userExam}" var="exam">
	 Question : ${exam.question.questionId}
	<br> UserAnswer :${exam.userAnswer}
	<br> AnswerStatus :${exam.ansStatus}
	<br>
	</c:forEach>
</body>
</html>