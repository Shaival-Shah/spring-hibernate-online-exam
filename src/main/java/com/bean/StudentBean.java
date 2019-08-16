package com.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class StudentBean
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int studentId;
	
	String firstName;
	
	String lastName;
	
	String email;
	
	String password;

	@OneToMany(mappedBy = "studentId")
	List<UserResultBean> exams;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public List<UserResultBean> getExams() {
		return exams;
	}

	public void setExams(List<UserResultBean> exams) {
		this.exams = exams;
	}

}