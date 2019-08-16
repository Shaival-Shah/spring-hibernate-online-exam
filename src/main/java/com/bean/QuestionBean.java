package com.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Question")
public class QuestionBean
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int questionId;

	String question;
	
	String o1, o2, o3, o4;
	
	String correctAnswer;
	
	int examId;
	
	public int getQuestionId() {
		return questionId;
	}
	
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	
	public String getQuestion() {
		return question;
	}
	
	public void setQuestion(String question) {
		this.question = question;
	}
	
	public String getO1() {
		return o1;
	}
	
	public void setO1(String o1) {
		this.o1 = o1;
	}
	
	public String getO2() {
		return o2;
	}
	
	public void setO2(String o2) {
		this.o2 = o2;
	}
	
	public String getO3() {
		return o3;
	}
	
	public void setO3(String o3) {
		this.o3 = o3;
	}
	
	public String getO4() {
		return o4;
	}
	
	public void setO4(String o4) {
		this.o4 = o4;
	}
	
	public String getCorrectAnswer() {
		return correctAnswer;
	}
	
	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
	
	public int getExamId() {
		return examId;
	}
	
	public void setExamId(int examId) {
		this.examId = examId;
	}
	
}