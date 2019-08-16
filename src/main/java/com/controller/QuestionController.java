package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.QuestionBean;
import com.dao.QuestionDao;

@Controller
public class QuestionController
{

	@Autowired
	QuestionDao questionDao;

	@RequestMapping(name = "/newquestion", method = RequestMethod.GET)
	public String newQuestion(Model model)
	{
		model.addAttribute("question", new QuestionBean());
		return "NewQuestion";
	}

	@RequestMapping(name = "/addquestion", method = RequestMethod.POST)
	public String addQuestion(QuestionBean question, Model model)
	{
		model.addAttribute("question", question);
		questionDao.insertQuestion(question);
		return "ListQuestion";
	}

}