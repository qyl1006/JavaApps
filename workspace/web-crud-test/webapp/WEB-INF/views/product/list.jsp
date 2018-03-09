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

<table align="center" border="1" width="80%" cellpadding="0" cellspacing="0">
	<tr>
		<td colspan="4" align="center">
			<a href="/product?cmd=edit">添加商品</a>
		</td>
	</tr>
	<tr>
		<td colspan="4" align="center">商品列表</td>
	</tr>
	<tr>
		<th>商品名</th>
		<th>商品分类</th>
		<th colspan="2">操作</th>
	</tr>
	
<c:forEach items="${products}" var="p" varStatus="vs">
	<tr align="center" style="background-color: ${vs.count % 2 == 0 ? "" : "yellow"}">
		<td>${p.name}</td>
		<td>${p.dirname}</td>
		<td>
			<a href="/product?cmd=delete&&id=${p.id}">删除</a>
		</td>
		<td>
			<a href="/product?cmd=edit&&id=${p.id}">编辑</a>
		</td>
	</tr>
	</tr>
</c:forEach>
</table>
</body>
</html>