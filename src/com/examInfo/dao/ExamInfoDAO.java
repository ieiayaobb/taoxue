package com.examInfo.dao;

import java.util.List;

import com.examInfo.model.ExamDetail;
import com.examInfo.model.ExamInfo;
import com.collegeInfo.model.College;
import com.util.BaseDAO;
import com.util.HibernateSessionFactory;
import javax.persistence.Entity;

@Entity
public class ExamInfoDAO extends BaseDAO {
	public List<ExamInfo> getAllExamInfo() {
		session=HibernateSessionFactory.getSession();
		String hql = "FROM ExamInfo";
		tx = session.beginTransaction();
		List<ExamInfo> examInfos = null;
		try {
			examInfos = session.createQuery(hql).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			if (session != null) {
				if (session.isOpen()) {
					session.close();
				}
			}
		}
		return this.setExamInfosName(examInfos, allColleges);
	}
	private List<ExamInfo> setExamInfosName(List<ExamInfo> examInfos,
			List<College> colleges) {
		for (ExamInfo e : examInfos) {
			for (College c : colleges) {
				if (c.getId() == e.getCollegeId()) {
					e.setName(c.getName());
				}
			}
		}
		return examInfos;
	}

	public List<ExamInfo> getExamInfos(int examId) {
		session=HibernateSessionFactory.getSession();
		String hql = "FROM ExamInfo WHERE examid = " + examId;
		tx = session.beginTransaction();
		List<ExamInfo> examInfos = null;
		try {
			examInfos = session.createQuery(hql).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			if (session != null) {
				if (session.isOpen()) {
					session.close();
				}
			}
		}
		return this.setExamInfosName(examInfos, allColleges);

	}

	public ExamDetail getDetailImg(int examId, int collegeId) {
		session=HibernateSessionFactory.getSession();
		String hql = "FROM ExamDetail WHERE examInfoId = " + examId + ""
				+ collegeId;
		tx = session.beginTransaction();
		List<ExamDetail> examDetails = null;
		try {
			examDetails = session.createQuery(hql).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			if (session != null) {
				if (session.isOpen()) {
					session.close();
				}
			}
		}
		return examDetails.get(0);
	}
}
