<%--
  Created by IntelliJ IDEA.
  User: Lonten
  Date: 2023/3/27
  Time: 15:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>test</title>
</head>
<%
    String bgcolor=null;
    bgcolor=request.getParameter("color");
    if(bgcolor==null)
    {
     bgcolor="red";
    }
%>
<body  bgcolor=<%=bgcolor%>>
<h1>nihao</h1>

</body>
</html>
