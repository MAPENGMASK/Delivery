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
    <title>登录</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

  </head>
  
  <body>
    <s:form action="login" method="post" namespace="/">    	
		<s:textfield name="delivery.delivery_id" label="id号" />			  
		<s:textfield name="delivery.password" label="密码" />			 			  
		<s:submit value="登录" align = "left"/>                 
	</s:form>
	<form action="delivery/register.jsp" method="post">
		<input type="submit" value="注册" align="middle">
	</form>
  </body>
</html>
