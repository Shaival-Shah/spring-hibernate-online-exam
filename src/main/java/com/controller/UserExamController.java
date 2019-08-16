package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.UserExamListBean;
import com.dao.UserExamDao;

@Controller
public class UserExamController
{

	@Autowired
	UserExamDao userExamDao;

	@RequestMapping(value = "/addusertest", method = RequestMethod.POST)
	public String addTest(UserExamListBean userExams, Model model)
	{
		System.out.println("size ==> " + userExams.getUserExam().size());
		userExamDao.insertQuestions(userExams);
		model.addAttribute("userExams", userExams);
		return "ExamResult";
	}
	
}