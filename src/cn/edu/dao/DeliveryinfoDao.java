package cn.edu.dao;
import cn.edu.bean.Delivery;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class DeliveryinfoDao extends DeliveryDao {
	private static final Logger log = LoggerFactory
			.getLogger(Delivery.class);
	// property constants
	public static final String ID = "delivery_id";
	public static final String NUMBER = "id_number";
	public static final String PHONE = "phone_number";
	public static final String RATE = "punctuality_rate";
	public static final String TIME = "login_time";
	public static final String PASSWORD = "password";
	public static final String STATUS = "status";

	public void addUser(Delivery transientInstance) {
		Session session = getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			getSession().save(transientInstance);
			 tx.commit();
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}finally{
			session.close();
		}
	}

	public void deleteUser(int id) {
		Session session = getSession();
		Transaction tx = null;
		System.out.println("dao:" + id);
		Delivery user = getUserById(id);
		System.out.println("dao:" + user);
		log.debug("deleting Delivery instance" + user);
		try {
			tx = session.beginTransaction();
			session.delete(user);
			tx.commit();
			log.debug("delete successful");
		} catch (RuntimeException re) {
			if(tx!=null){
				tx.rollback();
			}
			log.error("delete failed", re);
			throw re;
		}finally{
			session.close();
		}
	}

	public Delivery getUserById(int id) {
		Session session = getSession();
		log.debug("getting Userinfo instance with id: " + id);
		try {
			Delivery instance = (Delivery) session.get(
					Delivery.class, id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public void updateUser(Delivery user){
		Session session = getSession();
		Delivery u = (Delivery) session.get(Delivery.class, user.getDelivery_id());
		session.evict(u);//删除缓存相同对象
		Transaction tx = null;
		System.out.println("dao:" + user);
		try {
			tx=session.beginTransaction();
			session.saveOrUpdate(user);
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
	
	public Delivery merge(Delivery user) {
		Session session = getSession();
		Transaction tx = null;
		System.out.println("dao:" + user);
		log.debug("merging Userinfo instance");
		try {
			tx=session.beginTransaction();
			Delivery result = (Delivery) session.merge(user);
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
}