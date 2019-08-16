package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.StudentBean;

@Repository
public class StudentDao
{

	@Autowired
	SessionFactory factory;

	public boolean insertStudent(StudentBean student)
	{
		Session session = factory.openSession();
		session.save(student);
		session.close();
		return true;
	}
}