<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>회원가입</title>
</head>
<body>
    <form action="/user/join" method="post">
        <input type="text" name="uid" placeholder="아디">
        <input type="password" name="upw" placeholder="비번">
        <input type="text" name="nm" placeholder="이름">
        <div>
            <input type="submit" value="가입">
        </div>
        <div>${requestScope.msg}</div>
    </form>
</body>
</html>