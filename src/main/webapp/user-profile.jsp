<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - User Profile</title>
</head>
<body>
<h1><%= "User Profile" %>
</h1>
<p>Name: ${requestScope.get("name")}</p>
<p>Email: ${requestScope.get("email")}</p>
<a href="controller?command=GetUserListCommand">User List</a>
<br/>
</body>
</html>