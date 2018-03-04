
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
<!-- 测试上下文路径 -->
上下文: ${pageContext.request.contextPath}<br>

<%-- 选择标签--%>
<%
	int num = 4;
	request.setAttribute("num", num);
%>
<c:choose>
	<c:when test="${num > 5}">num 大于5</c:when>
	<c:when test="${num < 5}">num 小于 5</c:when>
	<c:when test="${num == 5}">num等于5</c:when>
</c:choose>

<br>
<%--- 循环标签 --%>
<c:forEach begin="66" end="100" step="1" var="i" varStatus="vs">
	i: ${i}-------vs: ${vs.count}<br>
</c:forEach>

<br>

<%
	
%>

</html>