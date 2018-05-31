<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
${horror}怖い話
<form action="/application/CalcForm" method="post">
身長<input type="text" name="tall"/>m<br>
体重<input type="text" name="heavy"/>kg<br>
<input type="submit" value="計算"/>
</form>
</body>
</html>