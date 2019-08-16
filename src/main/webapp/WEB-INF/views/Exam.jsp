<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Exam</title>
</head>
<body>
	ExamTitle: ${exams.userExam[0].exam.title}<br>
	<f:form action="addusertest" modelAttribute="exams">

		<table>
			<%
				int i = 1;
			%>
			<c:forEach items="${exams.userExam}" var="exam" varStatus="status">
				<tr>
					<td>Q${status.index+1}:</td>
					<td colspan="3">${exam.question.question}</td>
				</tr>
				<tr>
					<input type="hidden" name="userExam[${status.index}].question.questionId" value="${exam.question.questionId}" />
					<input type="hidden" name="userExam[${status.index}].student.studentId" value="1" />
					<input type="hidden" name="userExam[${status.index}].exam.examId" value="${exam.exam.examId}" />
					<td>${exam.question.o1}<input type="radio"
						name="userExam[${status.index}].userAnswer"
						value="${exam.question.o1}" /></td>
					<td>${exam.question.o2}<input type="radio"
						name="userExam[${status.index}].userAnswer"
						value="${exam.question.o2}" /></td>
					<td>${exam.question.o3}<input type="radio"
						name="userExam[${status.index}].userAnswer"
						value="${exam.question.o3}" /></td>
					<td>${exam.question.o4}<input type="radio"
						name="userExam[${status.index}].userAnswer"
						value="${exam.question.o4}" /></td>
				</tr>

			</c:forEach>
			<tr>
				<td colspan="4"><input type="submit" value="FinishExam" /></td>
			</tr>
		</table>
	</f:form>
</body>
</html>