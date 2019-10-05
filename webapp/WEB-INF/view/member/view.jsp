<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>리스트</title>
</head>
<body>
	<table>
		<tr>
			<td>이름</td>
			<td>아이디</td>
			<td>비밀번호</td>
			<td>이메일</td>
			<td>전화번호</td>
		</tr>
		<c:foreach items="${list }" var="list">
			<tr>
				<td>${list.user_nm }</td>
				<td>${list.user_id }</td>
				<td>${list.user_pw }</td>
				<td>${list.email }</td>
				<td>${list.phone }</td>
			</tr>
		</c:foreach>
	</table>
</body>
</html>