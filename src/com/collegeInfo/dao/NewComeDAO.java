package com.collegeInfo.dao;

import java.util.List;
import com.collegeInfo.model.NewComeDetail;
import com.collegeInfo.model.NewComeInfo;
import com.util.BaseDAO;
import com.util.HibernateSessionFactory;

public class NewComeDAO extends BaseDAO{
	public List<NewComeInfo> getAllNewComes(){
		session=HibernateSessionFactory.getSession();
		String hql="FROM NewComeInfo";
		List<NewComeInfo> newcomeInfos = session.createQuery(hql).list();
		return newcomeInfos;
	}
	public NewComeDetail getDetailImg(int id){
		session=HibernateSessionFactory.getSession();
		String hql="FROM NewComeDetail WHERE id = " + id;
		tx = session.beginTransaction();
		List<NewComeDetail> newcomeDetails = null;
		try {
			newcomeDetails = session.createQuery(hql).list();
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
		return newcomeDetails.get(0);
	}
}
