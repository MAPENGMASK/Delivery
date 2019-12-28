package cn.edu.bean;

public class Delivery {
	private int delivery_id;//id
	private int id_number;//身份证号
	private String phone_number;//电话号
	private Double punctuality_rate;//准时率
	private String login_time;//注册时间
	private String password;//密码
	private int status;//状态
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getDelivery_id() {
		return delivery_id;
	}
	public void setDelivery_id(int delivery_id) {
		this.delivery_id = delivery_id;
	}
	public int getId_number() {
		return id_number;
	}
	public void setId_number(int id_number) {
		this.id_number = id_number;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public Double getPunctuality_rate() {
		return punctuality_rate;
	}
	public void setPunctuality_rate(Double punctuality_rate) {
		this.punctuality_rate = punctuality_rate;
	}
	public String getLogin_time() {
		return login_time;
	}
	public void setLogin_time(String login_time) {
		this.login_time = login_time;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + delivery_id;
		result = prime * result + id_number;
		result = prime * result + ((login_time == null) ? 0 : login_time.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((phone_number == null) ? 0 : phone_number.hashCode());
		result = prime * result + ((punctuality_rate == null) ? 0 : punctuality_rate.hashCode());
		result = prime * result + status;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Delivery other = (Delivery) obj;
		if (delivery_id != other.delivery_id)
			return false;
		if (id_number != other.id_number)
			return false;
		if (login_time == null) {
			if (other.login_time != null)
				return false;
		} else if (!login_time.equals(other.login_time))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (phone_number == null) {
			if (other.phone_number != null)
				return false;
		} else if (!phone_number.equals(other.phone_number))
			return false;
		if (punctuality_rate == null) {
			if (other.punctuality_rate != null)
				return false;
		} else if (!punctuality_rate.equals(other.punctuality_rate))
			return false;
		if (status != other.status)
			return false;
		return true;
	}
}
