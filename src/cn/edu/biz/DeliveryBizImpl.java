package cn.edu.biz;
import cn.edu.dao.DeliveryinfoDao;
import cn.edu.bean.Delivery;


public class DeliveryBizImpl implements DeliveryBiz {
	
	DeliveryinfoDao deliveryDao=new DeliveryinfoDao();

	@Override
	public void deleteUser(int id) {
		System.out.println("已注销：" + id);
		deliveryDao.deleteUser(id);
	}
	@Override
	public Delivery getUserById(int id) {
		// TODO Auto-generated method stub
		return deliveryDao.getUserById(id);
	}
	@Override
	public void addUser(Delivery user) {
		// TODO Auto-generated method stub
		System.out.println("新用户：" + user);
		deliveryDao.addUser(user);
	}
	@Override
	public void updateUser(Delivery user) {
		// TODO Auto-generated method stub
		System.out.println("修改个人信息：" + user);
		deliveryDao.updateUser(user);
		//userDao.merge(u);
	}
}