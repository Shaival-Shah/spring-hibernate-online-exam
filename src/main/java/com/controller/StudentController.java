package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.ListStudentBean;
import com.bean.StudentBean;
import com.dao.StudentDao;

@Controller
public class StudentController
{
	
	@Autowired
	StudentDao studentDao;

	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signup(Model model)
	{
		System.out.println("student signup...");
//		StudentBean student = new StudentBean();
//		model.addAttribute("student", student);
		return "Signup";
	}

	@RequestMapping(value = "/msignup", method = RequestMethod.GET)
	public String msignup(Model model,ListStudentBean s1)
	{
		System.out.println("student signup...");
		List<StudentBean> students = new ArrayList<StudentBean>();
		students.add(new StudentBean());
		students.add(new StudentBean());
		students.add(new StudentBean());
		s1.setStudents(students);
		model.addAttribute("s1",s1);
		return "MSignup";
	}

	@RequestMapping(value = "signupdata", method = RequestMethod.POST)
	public String signupdata(StudentBean student)
	{
		studentDao.insertStudent(student);
		return "redirect:/searchexam";
	}

	@RequestMapping(value = "msignupdata", method = RequestMethod.POST)
	public String msignupdata(ListStudentBean beans)
	{
		System.out.println(beans.getStudents().size());
		for (StudentBean b : beans.getStudents())
		{
			System.out.println(b.getFirstName());
		}
		return "redirect:/searchexam";
	}

}