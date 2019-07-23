<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2019/7/10
  Time: 17:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/todosecurity/login">
用户名<input type="text" id="username" name="username"  placeholder="Username" required autofocus><br>
    密码 <input type="password" id="password" name="password"  placeholder="Password" required>
   记住我 <input type="checkbox" name="remember-me" >
    <input name="_csrf" type="hidden" value="a958ad60-f066-4722-84fc-3d58552d7f17" />
    <button type="submit">提交</button>
</form>
</body>
</html>
