package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.QuestionBean;

@Repository
public class QuestionDao
{
	
	@Autowired
	SessionFactory factory;

	public boolean insertQuestion(QuestionBean question)
	{
		Session session = factory.openSession();
		session.save(question);
		session.close();
		return true;
	}
	
}