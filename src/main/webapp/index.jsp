<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<form action="controller" method="post">
    <input type="hidden" name="command" value="AddUserCommand">
    <input type="text" name="name">
    <input type="text" name="email">
    <input type="submit" value="Submit">
</form>
<h1>${sessionScope.get("user").name}'s</h1>
<h1>${sessionScope.get("user").email}'s</h1>
</body>
</html>