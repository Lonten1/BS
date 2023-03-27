<%--
  Created by IntelliJ IDEA.
  User: Lonten
  Date: 2023/3/27
  Time: 9:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  errorPage="error.html" %>
<%@include file="error.jsp"%>
<html>
<head>
    <title>登录界面</title>
</head>
<body>
<form action="login"  method="post">
    用户名：<input type="text" name="loginname"/> <br/>
    密码：  <input type="text" name="password"/> <br/>
  <%  for(int i=0;i<=4;i++){   %>
    <h1>nihao</h1>
  <%  }    %>
    <%=k%>
    <%!  int l=244444;  %>
    <input type="submit"  value="提交">

</form>
</body>
</html>
