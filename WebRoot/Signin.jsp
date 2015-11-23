<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Signin.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body bgcolor=cyan>
     <img src =user.jpeg border=2 width=200 height=200 />
  <form action="ExamServlet" method="post">
    <table><tr><td></td><td><a href='register.jsp'>New user..?</a></td></tr>
    <tr><td></td></tr>
    <tr><td>Select language</td><td><select name="exam"><option>select</option><option value="java">JAVA</option><option value="net">.Net</option><option value="html">HTML</option></select></td></tr>
    <tr><td>UserName</td><td><input type="text" name="uname"/></td></tr>
    <tr><td>Password</td><td><input type="password" name="pwd"/></td></tr>
    <tr><td><input type="submit" value="login"/></td></tr>
    </table>
    </form>
  </body>
</html>
