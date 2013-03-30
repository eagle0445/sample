<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
%><%@include file="/top.jsp" %>
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
<style type="text/css">
body{background: #E2E9E6;}
.login_table{border:1px solid gray;border-collapse: collapse;background:#ECFFF8}
.login_table th{text-align:right;border:1px solid gray;padding: 5px;}
.login_table td{text-align:left;border:1px solid gray;padding: 5px;}
.login_table input{width:140px;}
</style>
<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="js/public.js"></script>
</head>
<body>

<form action="login/login.spr" method="post">

 <table class="login_table">
    <tr><th colspan="2" style="text-align:center;">登录</th></tr>
    <tr><th>登录名：</th><td><input type="text" name="loginName"/></td></tr>
    <tr><th>密码：</th><td><input type="password" name="pswd" /></td></tr>
    <tr><td colspan="2" style="text-align:center;">
    <button type="submit">登录</button></td></tr>
 </table>
</form>
<hr>
<span style="color:red">${requestScope.opmsg} ${param.opmsg}
<% String opmsg = request.getParameter("opmsg");
if(opmsg != null){
opmsg = URLDecoder.decode(opmsg, "utf-8");
out.println(opmsg);}%></span><br>
<a href="memo/doSomeThing_a.spr">未登录错误提示: 传统html方式</a>
<br>
<a href="memo/doSomeThing_b.spr" onclick="return doSomeThing(this)">未登录错误提示: ajax方式:</a>
</body>
</html>