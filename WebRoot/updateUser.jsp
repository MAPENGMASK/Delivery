<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="cn.edu.dao.*"%>
<%@page import="cn.edu.bean.User"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>修改用户信息</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
	<div align="center">
		<h3><font color="green">修改用户信息</font></h3> 
		<s:form action="userUpdate" method="post">
        	<table width="300" border="1" bordercolor="#99CCFF" bgcolor="#FFFFEE">
			  <s:textfield name="user.id" label="ID号" />			  
			  <s:textfield name="user.name" label="姓名" />			 
			  <s:select list="sexs" name="user.sex" label="性别" />			 
			  <s:textfield name="user.age" label="年龄" />			
			  <s:textfield name="user.telephone" label="电话" />			
			  <s:textfield name="user.email" label="邮箱" />	
              <s:textfield name="user.specialty" label="专业" />			  
			  <s:textfield name="user.school" label="学校" />			  
			  <s:textarea name="user.address" label="地址"/>
			  <s:submit value="修改" align="center" />    		  
            </table>                
		</s:form>
    </div>
  </body>
</html>
