<%@ page import="com.jxnu.pojo.Goods" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主界面</title>
</head>
<body>
<a class="btn btn-primary" href="${pageContext.request.contextPath}/alluser?username=${sessionScope.userid}">个人信息</a>
<table>
    <%List<Goods> list = (List<Goods>) request.getSession().getAttribute("showAllGoodList");
        if (list!=null){
            for (int i=0;i<list.size();i++){
    %>

    <thead>
    <tr>
        <th><%=list.get(i).getGoodname()%></th>
    </tr>
    </thead>

    <tbody>
    <tr>
        <td><a href="#"><img src="http://localhost:8080/whh<%=list.get(i).getImgroad()%>"></a></td>
    </tr>
    </tbody>
    <%
            } }
    %>
</table>
</body>
</html>
