package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.ExamBean;
import com.bean.QuestionBean;
import com.bean.UserExamBean;
import com.bean.UserExamListBean;
import com.bean.UserResultBean;

@Repository
public class UserExamDao
{

	@Autowired
	SessionFactory factory;

	public UserResultBean insertQuestions(UserExamListBean userExams)
	{
		Session session = factory.openSession();
		int trueCount = 0;
		Transaction tx = session.beginTransaction();
		int examId = userExams.getUserExam().get(0).getExam().getExamId();
		ExamBean exam = session.get(ExamBean.class, examId);
		for (UserExamBean bean : userExams.getUserExam())
		{
			QuestionBean qb = session.get(QuestionBean.class, bean.getQuestion().getQuestionId());
			if (qb.getCorrectAnswer().equals(bean.getUserAnswer()))
			{
				bean.setAnsStatus(1);
				trueCount++;
			}
			session.save(bean);// 1 2
		}
		UserResultBean result = new UserResultBean();
		result.setStudentId(1);
		result.setExamId(examId);
		result.setMarks(trueCount);
		int passing = exam.getMarks() * exam.getPassingPercentage() / 100;
		if (trueCount >= passing)
		{
			result.setStatus(1);
		}
		session.save(result);
		tx.commit();
		session.close();
		return result;
	}

}