<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="cn.edu.dao.*,cn.edu.bean.*"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>修改用户信息</title>
  </head>
  
  <body>
  <h3><font color="green">修改用户信息</font></h3> 
	<s:form action="deliveryUpdate" method="post" namespace="/">
		<s:textfield name="delivery.delivery_id" label="配送员id"/>			  
		<s:textfield name="delivery.id_number" label="身份证号" />			 
		<s:textfield name="delivery.phone_number" label="电话号" />			 
		<s:textfield name="delivery.punctuality_rate" label="准时率" />			
		<s:textfield name="delivery.login_time" label="注册时间" />	
		<s:textfield name="delivery.password" label="密码"/>
		<s:textfield name="delivery.status" label="状态"/>		
		<s:submit value="保存" align="center" />    		             
	</s:form>
  </body>
</html>
