<%--
  Created by IntelliJ IDEA.
  User: 777
  Date: 2019/11/27
  Time: 9:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/adduser" method="post">
    用户ID<input type="text" name="userid"><br><br><br>
    用户名<input type="text" name="username"><br><br><br>
    密码<input type="text" name="password"><br><br><br>
    <input type="submit" value="注册">
</form>
</body>
</html>
