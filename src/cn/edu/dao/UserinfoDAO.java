package cn.edu.dao;

import cn.edu.factory.HibernateSessionFactory;
import cn.edu.bean.User;
import cn.edu.bean.id;

import java.util.List;
import java.util.Map;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserinfoDAO extends UserDao {
	private static final Logger log = LoggerFactory
			.getLogger(UserinfoDAO.class);
	// property constants
	public static final String NAME = "name";
	public static final String SEX = "sex";
	public static final String AGE = "age";
	public static final String TELEPHONE = "telephone";
	public static final String EMAIL = "email";
	public static final String SPECIALTY = "specialty";
	public static final String SCHOOL = "school";
	public static final String ADDRESS = "address";

//	public void addUser(Userinfo transientInstance) {
//		Session session = getSession();
//		Transaction tx = null;
//		log.debug("saving Userinfo instance");
//		try {
//			tx = session.beginTransaction();
//			getSession().save(transientInstance);
//			 tx.commit();
//			log.debug("save successful");
//		} catch (RuntimeException re) {
//			log.error("save failed", re);
//			throw re;
//		}finally{
//			session.close();
//		}
//	}
//
//	public void deleteUser(int id) {
//		Session session = getSession();
//		Transaction tx = null;
//		System.out.println("dao:" + id);
//		Userinfo user = getUserById(id);
//		System.out.println("dao:" + user);
//		log.debug("deleting Userinfo instance" + user);
//		try {
//			tx = session.beginTransaction();
//			session.delete(user);
//			tx.commit();
//			log.debug("delete successful");
//		} catch (RuntimeException re) {
//			if(tx!=null){
//				tx.rollback();
//			}
//			log.error("delete failed", re);
//			throw re;
//		}finally{
//			session.close();
//		}
//	}

	public User getUserById(int id) {
		Session session = getSession();
		log.debug("getting Userinfo instance with id: " + id);
		try {
			User instance = (User) session.get(
					User.class, id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public  List getAllUser() {
		Session session = getSession();
		
		log.debug("finding all User instances");
		try {
			
			String queryString = "from User  where status='未被接单'";
			Query queryObject =session.createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public void updateUser(User user){
		Session session = getSession();
		User u = (User) session.get(User.class, user.getOrder_id());
		session.evict(u);//删除缓存相同对象
		Transaction tx = null;
		
		u.setStatus("已接单");
		u.setDelivery_id(id.getId());
		System.out.println("dao:" + user);
		try {
			tx=session.beginTransaction();
			session.saveOrUpdate(u);
			//session.update(user);
			tx.commit();
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}finally{
			session.close();
		}
	}
	public User merge(User user) {
		Session session = getSession();
		Transaction tx = null;
		System.out.println("dao:" + user);
		log.debug("merging Userinfo instance");
		try {
			tx=session.beginTransaction();
			User result = (User) session.merge(user);
			tx.commit();
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}finally{
			session.close();
		}
	}

	

	public int getmine(int i) {
		Session session = getSession();
		Query queryObject;
		log.debug("finding all User instances");
		try {
			
			String queryString = " from User  where (status ='已接单' or status ='运送中') and delivery_id="+id.getId();
			queryObject =session.createQuery(queryString);
			if(!queryObject.list().isEmpty()){	
				List<User> a=queryObject.list();
				int f = 10;
				for(User b:a){
					 f= b.getOrder_id();
					 break;
					 }

				return f;
			}else{
				return 0;
			}
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
		
	}

	
}