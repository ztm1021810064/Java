<%@ page  pageEncoding="UTF-8" contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"  %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>登录</h2>
<form action="/user/loginList" method="post">
    用户名:<input name="username">
    密码:<input name="password">
    车1：<input name="car.brand">
    美女1：<input name="girlList[0].cool">
    美女2：<input name="girlList[1].cool">
    <input type="submit" value="登录"/>
</form>
</body>
</html>
