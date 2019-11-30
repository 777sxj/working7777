<%--
  Created by IntelliJ IDEA.
  User: 777
  Date: 2019/11/27
  Time: 9:51
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户界面</title>
</head>
<body>
<table class="table table-hover table-striped">
    <thead>
<tr>
    <th>用户ID</th>
    <th>用户名</th>
    <th>电话号码</th>
    <th>邮箱</th>
</tr>
    </thead>
    <tbody>
<c:forEach var="user" items="${sessionScope.list}">
    <tr>
        <td>${user.userid}</td>
        <td>${user.username}</td>
        <td>${user.telephone}</td>
        <td>${user.email}</td>
        <td>
            <a >更改个人信息</a> |

        </td>
    </tr>
    </tbody>
</table>
</c:forEach>
</body>
</html>
