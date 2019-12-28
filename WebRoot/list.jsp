<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="cn.edu.dao.*,cn.edu.bean.User"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>  
    <title>显示用户信息</title>
	<style type="text/css">
		a:link, a:visited { color:#000; text-decoration:none; }
		a:hover, a:active { color:#000; text-decoration:underline; }
		a:HOVER{color:red;}		
		.br_TR{
 			background-color:expression(this.rowIndex%2==0?"#CCFFFF":"#FFFFCC");
 			cursor:hand;
		}
		.br_head{
			background-color:#DDFFCC;
		}			
	</style>
  </head>  
  <body>
  
<script type="text/javascript">
    function test(e) {
        var x=e;
        var a = confirm("确定接受此订单吗？");
         
        if (a) {
            alert("订单提交成功");
            
            javascript:window.location='userToAdd?user.order_id='+x;
        }
      
    }
</script>

  <div align="center">
   	 <h3><font color="blue">订单信息列表</font></h3>
     <table width="620"> 
     	<tr>
     	  
     		<td align="right"><a href="userToList">刷新</a></td>
 		</tr>     	
     </table>
     <table width="640" border="1" align="center" bordercolor="#99CCFF">
     <tr class="br_head">
     	<td>订单编号</td>        
        <td>价格</td>
        <td>取货点</td>
        <td>目的地</td> 
        <td>取货时间</td>                     
        <td>最晚送达时间</td>
        <td>详情</td>
        <td>接受</td>
     </tr>
   <s:iterator value="list" >
      <tr class="br_TR" >    
      	<td><s:property value="order_id"/></td>
        <td><s:property value="price"/></a></td>
        <td><s:property value="starting_point"/></td>
        <td><s:property value="destination"/></td>
        <td><s:property value="latest_take_time"/></td>
        <td><s:property value="latest_arrive_time"/></td>
<%--         <td><a href="javascript:if(confirm('确定要删除吗？')) --%>
<%--         window.location.reload('userDelete?user.id=<s:property value='id'/>')">删除</a></td> --%>
        <td><input type="button" value="查看"  
        onclick="javascript:window.location='userToDetail?user.order_id=<s:property value='order_id'/>'"></td>
 
      
      <td width="50"><input type="button" value="接受"  
      onclick="javascript:window.location='userUpdate?user.order_id=<s:property value='order_id'/>'"></td>
      </tr>
    </s:iterator> 
<%--  <s:forEach items="${list}" var="post"> --%>
<!--       <tr class="br_TR" >     -->
<%--       	<td>${post.order_id}</td> --%>
<%--         <td>${post.starting_point}</td> --%>
<%--         <td>${post.destination}</td> --%>
<!--         <td>${post.price}</td> -->
<!--         <td>${post.latest_take_time}</td> -->
<!--         <td>${post.latest_arrive_time}</td> -->
<%-- <%--         <td><a href="javascript:if(confirm('确定要删除吗？')) --%> 
<%-- <%--         window.location.reload('userDelete?user.id=<s:property value='id'/>')">删除</a></td> --%> 
<%--         onclick="javascript:location.replace('userToDetail?user.id=<s:property value='id'/>")"></td>  --%>
<!--       </tr> -->
<%--     </s:forEach> --%>
    </table>
   </div>
 
  </body>
</html>