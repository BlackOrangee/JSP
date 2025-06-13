<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.itstep.academy.demo2.entity.User" %><%--
  Created by IntelliJ IDEA.
  User: svyry
  Date: 13/06/2025
  Time: 20:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User List</title>
</head>
<body>
<H1><%= "User List" %>
</H1>
    <c:forEach items="${requestScope.users}" var="user">
        <p>Name: ${user.name}</p>
        <p>Email: ${user.email}</p>
    </c:forEach>
</body>
</html>
