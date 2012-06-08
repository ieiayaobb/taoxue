package com.collegeServe.dao;

import java.util.List;

import com.collegeServe.model.ServeDetail;
import com.collegeServe.model.ServeInfo;
import com.util.BaseDAO;
import com.util.HibernateSessionFactory;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class CollegeServeDAO extends BaseDAO {
	public List<ServeInfo> getAllServeInfo() {
		session=HibernateSessionFactory.getSession();
		String hql = "FROM ServeInfo";
		tx = session.beginTransaction();
		List<ServeInfo> serveInfos = null;
		try {
			serveInfos = session.createQuery(hql).list();
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
		return serveInfos;
	}
	public List<ServeInfo> geServeInfos(int type){
		session=HibernateSessionFactory.getSession();
		String hql = "FROM ServeInfo WHERE type=" + type;
		tx = session.beginTransaction();
		List<ServeInfo> serveInfos = null;
		try {
			serveInfos = session.createQuery(hql).list();
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
		return serveInfos;
	}
	public ServeDetail getDetailImg(int id){
		session=HibernateSessionFactory.getSession();
		String hql="FROM ServeDetail WHERE id = " + id;
		tx = session.beginTransaction();
		List<ServeDetail> serveDetails = null;
		try {
			serveDetails = session.createQuery(hql).list();
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
		return serveDetails.get(0);
	}
}
