package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.ExamBean;
import com.bean.QuestionBean;
import com.bean.StudentBean;
import com.bean.UserExamBean;
import com.bean.UserExamListBean;
import com.dao.ExamDao;

@Controller
public class ExamController
{

	@Autowired
	ExamDao examDao;

	@RequestMapping(value = "searchexam", method = RequestMethod.GET)
	public String searchExam(Model model)
	{
		model.addAttribute("exam", new ExamBean());
		return "ExamCode";
	}

	@RequestMapping(value = "addexam", method = RequestMethod.POST)
	public String addExam(ExamBean examBean)
	{
		examDao.insertExam(examBean);
		return "ListExam";
	}

	@RequestMapping(value = "newexam", method = RequestMethod.GET)
	public String newExam(Model model)
	{
		model.addAttribute("exam", new ExamBean());
		return "NewExam";
	}

	@RequestMapping(value = "listexam", method = RequestMethod.POST)
	public String listExam(ExamBean examBean, Model model)
	{
		ExamBean exam = examDao.getExam(examBean.getCode());
		if (exam == null)
		{
			model.addAttribute("exam", examBean);
			return "ExamCode";
		}
		else
		{
			UserExamListBean userExamList = new UserExamListBean();
			List<UserExamBean> userExams = new ArrayList<UserExamBean>();
			StudentBean student = new StudentBean();
			student.setStudentId(1);// session
			for (QuestionBean q : exam.getQuestions())
			{
				UserExamBean userExam = new UserExamBean();
				userExam.setExam(exam);
				userExam.setQuestion(q);
				userExam.setStudent(student);
				userExams.add(userExam);

			}
			userExamList.setUserExam(userExams);
			model.addAttribute("exams", userExamList);
			return "Exam";
		}
	}
	
}