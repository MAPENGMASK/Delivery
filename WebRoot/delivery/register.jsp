<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="cn.edu.dao.*, cn.edu.bean.Delivery"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'register.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
  </head>
  
  <body>
		<h3><font color="green">注册</font></h3> 
		<s:form action="deliveryAdd" method="post" namespace="/">    	
			  <s:textfield name="delivery.delivery_id" label="id号" />			  
			  <s:textfield name="delivery.id_number" label="身份证号" />			 
			  <s:textfield name="delivery.phone_number" label="电话号" />			
			  <s:textfield name="delivery.punctuality_rate" label="准时率" />			
			  <s:textfield name="delivery.login_time" label="注册时间" />	
			  <s:textfield name="delivery.password" label="密码" />			  
			  <s:submit value="注册" align="center" />   	               
		</s:form>
  </body>
</html>
