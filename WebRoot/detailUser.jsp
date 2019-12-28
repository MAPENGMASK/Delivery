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
    
    <title>显示用户信息</title>
    
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
		<h3><font color="green">订单详细信息</font></h3>
		<table width="380"> 
     	<tr>
     	
     		<td align="right"><a href="userToList">返回</a></td>
 		</tr>     	
     </table>
		<table align="center" border=1 bordercolor="#99CCFF">
			<tr>
				<td>订单号：</td>
				<td style="width: 120px; "><s:property value="user.order_id"/></td>
			</tr>
			<tr>
				<td>订单价格：</td>
				<td><s:property value="user.price"/></td>
			</tr>
			<tr>
				<td>送货起点：</td>
				<td><s:property value="user.starting_point"/></td>
			</tr>
			<tr>
				<td>送货终点：</td>
				<td><s:property value="user.destination"/></td>
			</tr>
			<tr>
				<td>取货时间：</td>
				<td><s:property value="user.latest_take_time" /></td>
			</tr>
			<tr>
				<td>最晚送达时间：</td>
				<td><s:property value="user.latest_arrive_time" /></td>
			</tr>
			<tr>
				<td>用户电话：</td>
				<td><s:property value="user.phone" /></td>
			</tr>
			<tr style="height: 180px; ">
				<td>详细说明：</td>
				<td><s:property value="user.notes" /></td>
			</tr>
<!-- 			<tr  style="height: 64px; "> -->
<!-- 				<td >专业：</td> -->
<%-- 				<td ><s:property value="user.specialty" /></td> --%>
<!-- 			</tr> -->
<!-- 			<tr> -->
<!-- 				<td>学校：</td> -->
<%-- 				<td><s:property value="user.school"  /></td> --%>
<!-- 			</tr> -->
<!-- 			<tr> -->
<!-- 				<td>地址：</td> -->
<%-- 				<td><s:property value="user.address" /></td> --%>
<!-- 			</tr> -->
		</table>
    </div>
  </body>
</html>
