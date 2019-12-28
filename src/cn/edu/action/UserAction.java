package cn.edu.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.edu.bean.User;
import cn.edu.bean.id;
import cn.edu.biz.UserBiz;
import cn.edu.biz.UserBizImpl;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	private List<User> 	list;
	private User user;

	public List<User> getList() {
		return list;
	}	
	public void setList(List<User> list) {
		this.list = list;
	}

	public String toList() throws Exception{
		UserBiz userBiz=new UserBizImpl();
		list=userBiz.getAllUser();
		return "toList";
	}
	


	public String toAdd() throws Exception{
		return "toAdd";
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

//	public String add() throws Exception{
//		
//		UserBiz userBiz=new UserBizImpl();
//	
//		user=userBiz.getUserById(user.getOrder_id());
//		userBiz.addUser(user);
//		System.out.println(user.getNotes());
//		//return this.toList(); 
//		return "input";
//	}
	
//	//��ת���޸�ҳ����߼���ͼ
//	public String toUpdate() throws Exception{
//		UserBiz userBiz=new UserBizImpl();
//		user=userBiz.getUserById(user.getId());
//		return "toUpdate";
//	}
//	//�޸��û���Ϣ
	public String update() throws Exception{
		UserBiz userBiz=new UserBizImpl();
		userBiz.updateUser(user);
		return "toList";
	}
	public String mine() throws Exception{
		UserBiz userBiz=new UserBizImpl();
		//当前用户的id
		//当前用户的id
		//当前用户的id
		//当前用户的id
		
	
		if(id.getId()<0){
			return "None";
		}
		int x=userBiz.getmine(id.getId());
		if(x==0){
		return "NO";
		}else{
			user=userBiz.getUserById(x);
			return "YES";
			}
	}
//	
//	//ɾ���û�
//	public String delete() throws Exception{
//		UserBiz userBiz=new UserBizImpl();
//		userBiz.deleteUser(user.getId());
//		return this.toList();
//	}
//	
	//��ת����ʾ�û�����ҳ��
	public String toDetail() throws Exception{
		UserBiz userBiz=new UserBizImpl();
		user=userBiz.getUserById(user.getOrder_id());
		return "toDetail";
	}
}
