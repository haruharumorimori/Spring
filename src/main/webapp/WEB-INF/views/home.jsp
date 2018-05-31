<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>じゃかじゃかじゃんけん</h1><br>
最初はグーじゃんけん<br>
<form action="/application/RSPForm" method="get">
グー<input type="radio" name="rsp" value="rock"/><br>
チョキ<input type="radio" name="rsp" value="scissors"/><br>
パー<input type="radio" name="rsp" value="paper"/>
<input type="submit" value="Let's go!!"/>
</form>
</body>
</html>