package cn.edu.biz;
import java.util.List;
import cn.edu.dao.UserinfoDAO;
import cn.edu.bean.User;
public  class UserBizImpl implements UserBiz {
	UserinfoDAO userDao=new UserinfoDAO();
	@Override
	public List<User> getAllUser() {
		return userDao.getAllUser();
	}
	@Override
	public User getUserById(int id) {
		return userDao.getUserById(id);
	}

//	@Override
//	public void deleteUser(int id) {
//		System.out.println("service:" + id);
//		userDao.deleteUser(id);
//	}
//
//	@Override
//	public void addUser(User u) {
//		System.out.println("service before:not null!" + u);
//		userDao.addUser(u);
//		System.out.println("service after:not null!" + u);
//	}

	@Override
	public void updateUser(User u) {
		System.out.println("service update:" + u);
		userDao.updateUser(u);
		//userDao.merge(u);
	}

@Override
public int getmine(int i) {
	int j=userDao.getmine(i);
	return j;
}
}