package cn.edu.biz;
import cn.edu.bean.Delivery;;

public interface DeliveryBiz {
	public Delivery getUserById(int id);
	public void deleteUser(int id);
	public void addUser(Delivery user);
	public void updateUser(Delivery u);
}