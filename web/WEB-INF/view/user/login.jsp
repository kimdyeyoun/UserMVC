<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>로그인</title>
</head>
<body>
    <form action="/user/login" method="post">
        <input type="text" name="uid" placeholder="아디">
        <input type="password" name="upw" placeholder="비번">
        <div>
            <input type="submit" value="로그인">
        </div>
        <div>${requestScope.msg}</div>
    </form>
</body>
</html>