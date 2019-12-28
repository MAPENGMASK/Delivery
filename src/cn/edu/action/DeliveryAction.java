package cn.edu.action;

import com.opensymphony.xwork2.ActionSupport;

import cn.edu.bean.Delivery;
import cn.edu.bean.id;
import cn.edu.biz.*;

public class DeliveryAction extends ActionSupport {
	private Delivery delivery;
	public Delivery getDelivery() {
		return delivery;
	}
	public void setDelivery(Delivery delivery) {
		this.delivery = delivery;
	}
	//跳转到修改页面逻辑
	public String toUpdate() throws Exception{
		DeliveryBiz deliveryBiz=new DeliveryBizImpl();
		delivery= deliveryBiz.getUserById(delivery.getDelivery_id());
		return "toUpdate";
	}
	//修改用户信息
	public String update() throws Exception{
		DeliveryBiz deliveryBiz=new DeliveryBizImpl();
		deliveryBiz.updateUser(delivery);
		return "update";
	}
	//跳转到显示用户详情页面
	public String toDetail() throws Exception{
		DeliveryBiz deliveryBiz=new DeliveryBizImpl();
		delivery=deliveryBiz.getUserById(delivery.getDelivery_id());
		return "toDetail";
	}
	
	public String add() throws Exception{
		
		DeliveryBiz deliveryBiz=new DeliveryBizImpl();
		deliveryBiz.addUser(delivery);
		return "add"; 
	}
	//登录界面
	public String login() throws Exception{
		DeliveryBiz deliveryBiz=new DeliveryBizImpl();
		delivery=deliveryBiz.getUserById(delivery.getDelivery_id());
		if(delivery==null){
		return "fail";	
		}
		
		id.setId(delivery.getDelivery_id());
		return "login";
	}
	
	public String getmine() throws Exception{
		
		if(id.getId()<0){
			return "fail";
		}
		DeliveryBiz deliveryBiz=new DeliveryBizImpl();
		delivery=deliveryBiz.getUserById(id.getId());
		
		return "success";	
		}
		
		
	
}
