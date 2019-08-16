package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.ExamBean;

@Repository
public class ExamDao
{

	@Autowired
	SessionFactory factory;

	public ExamBean getExam(String code)
	{
		Session session = factory.openSession();
		List<ExamBean> bean = session.createQuery("from ExamBean where code like '" + code + "'").list();
		if (bean.size() == 0)
		{
			return null;
		}
		else
		{
			return bean.get(0);
		}
	}

	public boolean insertExam(ExamBean examBean)
	{
		Session session = factory.openSession();
		session.save(examBean);
		session.close();
		return true;
	}

}