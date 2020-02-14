<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Homepage</title>
</head>
<body>
	<h1>Home 페이지입니다.</h1>

	<table>
		<tr>
			<td>#</td>
			<td>title</td>
			<td>content</td>
		</tr>
		<c:forEach var="board" items="${boards}" varStatus="status">
			<tr>
				<td>${status.count}</td>
				<td>${board.title}</td>
				<td>${board.content}</td>
			</tr>
		</c:forEach>
	</table>


</body>
</html>