package cn.edu.dao;

import org.hibernate.Session;

import cn.edu.factory.HibernateSessionFactory;

public class DeliveryDao  implements BaseDao{
	public Session getSession() {
		//FIXME: Implement this method
		return HibernateSessionFactory.getSession();
	}
}
