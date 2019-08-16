package com.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Exam")
public class ExamBean
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int examId;
	
	String title, code;
	
	int marks, passingPercentage;
	
	@OneToMany(mappedBy = "examId")
	List<QuestionBean> questions;

	@OneToMany(mappedBy = "examId")
	List<UserResultBean> result;

	public int getExamId() {
		return examId;
	}

	public void setExamId(int examId) {
		this.examId = examId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int getPassingPercentage() {
		return passingPercentage;
	}

	public void setPassingPercentage(int passingPercentage) {
		this.passingPercentage = passingPercentage;
	}

	public List<QuestionBean> getQuestions() {
		return questions;
	}

	public void setQuestions(List<QuestionBean> questions) {
		this.questions = questions;
	}

	public List<UserResultBean> getResult() {
		return result;
	}

	public void setResult(List<UserResultBean> result) {
		this.result = result;
	}
	
}