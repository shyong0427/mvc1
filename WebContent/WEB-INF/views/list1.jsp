<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>VIEW_1</title>
</head>
<body>
	<!-- EL 미사용 -->
	<!-- 
	<% request.getAttribute("result"); %><br>
	 -->
	<!-- EL 사용 -->
	뷰1 결과 : ${requestScope.result }
</body>
</html>