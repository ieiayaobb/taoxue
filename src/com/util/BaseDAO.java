package com.util;



import java.util.ArrayList;
import java.util.List;


import javax.persistence.Entity;
import javax.persistence.OneToMany;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.collegeInfo.model.College;

@Entity
public class BaseDAO {
	
	protected Session session;
	
	protected Transaction tx;
	
	@OneToMany
	protected List<College> allColleges = this.getCollegeDictionary();
	
	protected List<College> getCollegeDictionary(){
		session=HibernateSessionFactory.getSession();
		String hql="FROM College";
		List<College> list=session.createQuery(hql).list();
		return list;
	}
	public static void main(String args[]){
		int[] arr = {1,1,1,2,6,7,3,3,3,3,4,4,5};
		ArrayList result = new ArrayList();
		for(int i = 0;i < arr.length - 1;){
			for(int j = i + 1;j < arr.length;j++){
				if(arr[i] != arr[j]){
					//存在一样的数>2
					if(j - i != 1){
						result.add(i);
						result.add(i+1);
					//只存在一个
					}
					i = j;
					break;
				}
			}
		}
		System.out.println(result);
	}
}
