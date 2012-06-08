package com.communityPlate.dao;

import java.util.List;

import com.communityPlate.model.CommunityDetail;
import com.communityPlate.model.CommunityInfo;
import com.util.BaseDAO;
import com.util.HibernateSessionFactory;

public class CommunityPlateDAO extends BaseDAO {
	public List<CommunityInfo> getAllCommunityInfo() {
		session=HibernateSessionFactory.getSession();
		String hql = "FROM CommunityInfo";
		tx = session.beginTransaction();
		List<CommunityInfo> communityInfos = null;
		try {
			communityInfos = session.createQuery(hql).list();
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
		return communityInfos;
	}
	public List<CommunityInfo> geCommunityInfos(int type){
		session=HibernateSessionFactory.getSession();
		String hql = "FROM CommunityInfo WHERE type=" + type;
		tx = session.beginTransaction();
		List<CommunityInfo> communityInfos = null;
		try {
			communityInfos = session.createQuery(hql).list();
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
		return communityInfos;
	}
	public CommunityDetail getDetailImg(int id){
		session=HibernateSessionFactory.getSession();
		String hql="FROM CommunityDetail WHERE id = " + id;
		tx = session.beginTransaction();
		List<CommunityDetail> communityDetails = null;
		try {
			communityDetails = session.createQuery(hql).list();
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
		return communityDetails.get(0);
	}
}
