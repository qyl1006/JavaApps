<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table align="center" border="1" width="80%" cellpadding="0" cellspacing="0">
	<tr align="center">
		<td colspan="9">
			<a href="/product?cmd=edit">添加商品</a>
		</td>
	</tr>
	<tr align="center">
		<th>编号</th>
		<th>商品名</th>
		<th>商品类型</th>
		<th>销售价</th>
		<th>供应商</th>
		<th>品牌</th>
		<th>折扣</th>
		<th>成本价</th>
		<th>操作</th>
	</tr>
	
<C:forEach items="${products}" var="p" varStatus="ps">
	<tr align="center" style="background-color: ${ps.count % 2 == 0 ? '' : 'yellow'}" %>
		<td>${p.uid}</td>
		<td>${p.uproductName}</td>
		<td>
			<C:choose>
				<C:when test="${p.udir_id == 1}">鼠标</C:when>
				<C:when test="${p.udir_id == 2}">无线鼠标</C:when>
				<C:when test="${p.udir_id == 3}">有线鼠标</C:when>
				<C:when test="${p.udir_id == 4}">游戏鼠标</C:when>
			</C:choose>
		</td>
		<td>${p.usalePrice}</td>
		<td>${p.usupplier}</td>
		<td>${p.ubrand}</td>
		<td>${p.ucutoff}</td>
		<td>${p.ucostPrice}</td>
		<td>
			<a href="/product?cmd=edit&id=${p.uid}">编辑</a>
			<a href="/product?cmd=delete&id=${p.uid}">删除</a>
		</td>
	</tr>
</C:forEach>
</table>
</body>
</html>