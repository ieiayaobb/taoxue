package com.collegeInfo.dao;



import java.util.List;
import javax.persistence.Entity;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.collegeInfo.model.College;
import com.collegeInfo.model.UnionDetail;
import com.collegeInfo.model.UnionInfo;
import com.util.BaseDAO;
import com.util.HibernateSessionFactory;

public class UnionInfoDAO extends BaseDAO {
	public List<UnionInfo> getAllUnionInfo() {
		session=HibernateSessionFactory.getSession();
		String hql = "FROM UnionInfo WHERE type = " + 1;
		tx = session.beginTransaction();
		List<UnionInfo> unionInfos = null;
		try {
			unionInfos = session.createQuery(hql).list();
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
		return this.setUnionInfosName(unionInfos, allColleges);
	}
	public List<UnionInfo> getAllCouncils(){
		session=HibernateSessionFactory.getSession();
		String hql = "FROM UnionInfo WHERE type = " + 2;
		tx = session.beginTransaction();
		List<UnionInfo> unionInfos = null;
		try {
			unionInfos = session.createQuery(hql).list();
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
		return this.setUnionInfosName(unionInfos, allColleges);
	}
	private List<UnionInfo> setUnionInfosName(List<UnionInfo> unionInfos,
			List<College> colleges) {
		for (UnionInfo u : unionInfos) {
			for (College c : colleges) {
				if (c.getId() == u.getCollegeId()) {
					u.setName(c.getName());
				}
			}
		}
		return unionInfos;
	}

	public List<UnionInfo> getUnionInfos(int unionId) {
		session=HibernateSessionFactory.getSession();
		String hql = "FROM UnionInfo WHERE unionid = " + unionId;
		tx = session.beginTransaction();
		List<UnionInfo> unionInfos = null;
		try {
			unionInfos = session.createQuery(hql).list();
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
		return this.setUnionInfosName(unionInfos, allColleges);

	}

	public UnionDetail getDetailImg(int unionId, int collegeId) {
		session=HibernateSessionFactory.getSession();
		String hql = "FROM UnionDetail WHERE unionInfoId = " + unionId + ""
				+ collegeId;
		tx = session.beginTransaction();
		List<UnionDetail> unionDetails = null;
		try {
			unionDetails = session.createQuery(hql).list();
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
		return unionDetails.get(0);
	}
}
