<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


<table align="center" border="1" cellpadding="0" cellspacing="0" width="77%">
	<tr>
		<td align="center" colspan="6">
		<a href="/student?cmd=edit">增加</a>
		</td>
	</tr>
	<tr>
		<th>编号</th>
		<th>姓名</th>
		<th>年龄</th>
		<th>薪酬</th>
		<th>入职日期</th>
		<th>操作</th>
	</tr>
	
<c:forEach items="${students}" var="stu">
	<tr align="center">
		<td>${stu.id}</td>
		<td>${stu.name}</td>
		<td>${stu.age}</td>
		<td>${stu.salary}</td>
		<td>${stu.hiredate}</td>
		<td>
			<a href="/student?cmd=edit&id=${stu.id}">编辑</a>
			<a href="/student?cmd=delete&id=${stu.id}">删除</a>
		</td>
	</tr>
</c:forEach>
</table>
</body>
</html>