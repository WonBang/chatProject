<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>����Ʈ</title>
</head>
<body>
	<table>
		<tr>
			<td>�̸�</td>
			<td>���̵�</td>
			<td>��й�ȣ</td>
			<td>�̸���</td>
			<td>��ȭ��ȣ</td>
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