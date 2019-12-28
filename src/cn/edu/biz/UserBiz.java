package cn.edu.biz;

import java.util.List;

import cn.edu.bean.User;
public interface UserBiz {
	public List<User> getAllUser();
//	public List<User> getBySchoolUser(String likeSchool);
//	public List<User> getByNameUser(String likeName);
	public User getUserById(int id);
//	public int deleteUser(int id);
//	public int addUser(User u);
	public void updateUser(User u);
	public int getmine(int i);
}
