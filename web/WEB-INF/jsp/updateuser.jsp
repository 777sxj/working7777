<%--
  Created by IntelliJ IDEA.
  User: 777
  Date: 2019/11/30
  Time: 17:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/updateuser" method="post">
    <input type="hidden" name="userid" value="${user.getUserid()}"/>
    用户名<input type="text" name="username" value="${user.getUsername()}"/>
    密码<input type="text" name="password" value="${user.getPassword()}"/>
    电话<input type="text" name="telephone" value="${user.getTelephone()}"/>
    邮箱<input type="text" name="email" value="${user.getEmail()}"/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
