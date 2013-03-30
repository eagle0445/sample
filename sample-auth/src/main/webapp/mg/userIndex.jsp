<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
%><%@include file="/top.jsp" %>
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户首页</title>
<style type="text/css">
body{background: #E2E9E6;}
</style>
<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="js/public.js"></script>
</head>
<body>
<hr>
<span style="color:red">${requestScope.opmsg} ${param.opmsg}</span><br><br>
<a href="memo/doSomeThing_c.spr">没权限错误提示: 传统html方式</a><br>
<a href="memo/doSomeThing_d.spr">操作成功: 传统html方式</a><br>
<a href="memo/doSomeThing_e.spr" onclick="return doSomeThing(this)">没权限错误提示: ajax方式:</a><br>
<a href="memo/doSomeThing_f.spr" onclick="return doSomeThing(this)">操作成功提示: ajax方式:</a><br>
</body>
</html>