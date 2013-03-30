<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
%><%@include file="/top.jsp" %>
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>点击链接,进行体会</title>
<style type="text/css">
body{background: #E2E9E6;}
</style>
<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="js/public.js"></script>
</head>
<body>
<hr>
<span style="color:red">${requestScope.opmsg} ${param.opmsg}</span><br><br>

<div>通过传统html方式提示:</div>
<a href="memo/doSomeThing_c.spr">没权限,操作错误</a><br>
<a href="memo/doSomeThing_d.spr">有权限,操作成功</a><br>

<br>

<div>通过ajax方式提示:</div>
<a href="memo/doSomeThing_e.spr" onclick="return doSomeThing(this)">没权限,操作错误</a><br>
<a href="memo/doSomeThing_f.spr" onclick="return doSomeThing(this)">有权限,操作成功</a><br>
</body>
</html>