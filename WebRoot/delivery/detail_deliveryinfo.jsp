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
    <title>我的主页</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  <body>
    <div>
		<h3><font color="green">显示用户详细信息</font></h3> 
		<table>
			<tr>
				<td>ID号：</td>
				<td><s:property value="delivery.delivery_id"/></td>
			</tr>
			<tr>
				<td>身份证号：</td>
				<td><s:property value="delivery.id_number"/></td>
			</tr>
			<tr>
				<td>电话号：</td>
				<td><s:property value="delivery.phone_number" /></td>
			</tr>
			<tr>
				<td>准时率：</td>
				<td><s:property value="delivery.punctuality_rate" /></td>
			</tr>
			<tr>
				<td>注册时间：</td>
				<td><s:property value="delivery.login_time" /></td>
			</tr>
			<tr>
				<td><input type="button" value="修改"
        onclick="javascript:location.replace('deliveryToUpdate?delivery.delivery_id=<s:property value='delivery.delivery_id'/>')"></td>
			</tr>
		</table>
    </div>
  </body>
</html>
