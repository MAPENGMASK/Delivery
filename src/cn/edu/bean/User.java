package cn.edu.bean;


public class User  implements java.io.Serializable{
	private  int delivery_id;
	private int order_id;
	private String starting_point;
	private String destination;
	private Double price;
	private String latest_take_time;
	private String latest_arrive_time;
	private String notes;
	private String phone;
	private String status;
	private String comment;
	// Constructors
	/** default constructor */
	public User(){
		
	}
	public User(int delivery_id,int order_id,String starting_point,
			String destination,Double price,String latest_take_time,
			String latest_arrive_time,String notes,
			String phone,String status,String comment){
		this.delivery_id=delivery_id;
		this.destination=destination;
		this.latest_arrive_time=latest_arrive_time;
		this.latest_take_time=latest_take_time;
		this.notes=notes;
		this.order_id=order_id;
		this.phone=phone;
		this.price=price;
		this.starting_point=starting_point;
		this.comment=comment;
		this.status=status;
	}
	// Property accessors
	public  int getDelivery_id() {
		return delivery_id;
	}
	public void setDelivery_id(int delivery_id) {
		this.delivery_id = delivery_id;
	}
	public int getOrder_id() {
		return order_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public String getStarting_point() {
		return starting_point;
	}
	public void setStarting_point(String starting_point) {
		this.starting_point = starting_point;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getLatest_take_time() {
		return latest_take_time;
	}
	public void setLatest_take_time(String latest_take_time) {
		this.latest_take_time = latest_take_time;
	}
	public String getLatest_arrive_time() {
		return latest_arrive_time;
	}
	public void setLatest_arrive_time(String latest_arrive_time) {
		this.latest_arrive_time = latest_arrive_time;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	
	
}
