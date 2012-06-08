package com.collegeInfo.dao;

import java.util.List;
import com.collegeInfo.model.ActivityDetail;
import com.collegeInfo.model.ActivityInfo;
import com.util.BaseDAO;
import com.util.HibernateSessionFactory;

public class ActivityInfoDAO extends BaseDAO {
	public List<ActivityInfo> getAllActivityInfo() {
		session=HibernateSessionFactory.getSession();
		String hql = "FROM ActivityInfo";
		tx = session.beginTransaction();
		List<ActivityInfo> activityInfos = null;
		try {
			activityInfos = session.createQuery(hql).list();
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
		return activityInfos;
	}
	public List<ActivityInfo> getActivityInfos(int type){
		session=HibernateSessionFactory.getSession();
		String hql = "FROM ActivityInfo WHERE type=" + type;
		tx = session.beginTransaction();
		List<ActivityInfo> activityInfos = null;
		try {
			activityInfos = session.createQuery(hql).list();
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
		return activityInfos;
	}
	public ActivityDetail getDetailImg(int id){
		session=HibernateSessionFactory.getSession();
		String hql="FROM ActivityDetail WHERE id = " + id;
		tx = session.beginTransaction();
		List<ActivityDetail> activityDetails = null;
		try {
			activityDetails = session.createQuery(hql).list();
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
		return activityDetails.get(0);
	}
}
