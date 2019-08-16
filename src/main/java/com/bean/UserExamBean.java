package com.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "UserExams")
public class UserExamBean
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int userExamId;

	@ManyToOne
	ExamBean exam;

	@ManyToOne
	StudentBean student;

	@ManyToOne
	QuestionBean question;

	String userAnswer;

	int ansStatus;

	public int getUserExamId() {
		return userExamId;
	}

	public void setUserExamId(int userExamId) {
		this.userExamId = userExamId;
	}

	public ExamBean getExam() {
		return exam;
	}

	public void setExam(ExamBean exam) {
		this.exam = exam;
	}

	public StudentBean getStudent() {
		return student;
	}

	public void setStudent(StudentBean student) {
		this.student = student;
	}

	public QuestionBean getQuestion() {
		return question;
	}

	public void setQuestion(QuestionBean question) {
		this.question = question;
	}

	public String getUserAnswer() {
		return userAnswer;
	}

	public void setUserAnswer(String userAnswer) {
		this.userAnswer = userAnswer;
	}

	public int getAnsStatus() {
		return ansStatus;
	}

	public void setAnsStatus(int ansStatus) {
		this.ansStatus = ansStatus;
	}

}