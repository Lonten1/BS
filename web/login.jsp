<%--
  Created by IntelliJ IDEA.
  User: Lonten
  Date: 2023/3/27
  Time: 9:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  errorPage="error.jsp" %>

<html>
<head>
    <title>登录界面</title>
</head>
<body>
<form action="login"  method="post">
    用户名：<input type="text" name="loginname"/> <br/>
    密码：  <input type="text" name="password"/> <br/>
    <input type="submit"  value="提交">
    <%  for(int i=0;i<=4;i++){   %>
    <h4>*******************************</h4>
    <%  }    %>

    <%!  int l=244444;  %>

</form>

<%
    int j=371;
    out.write(j);
    out.println(j);

%>
<%=j+28%>
<%!
    int x=24;
    public void test(){
        System.out.println("你好啊");

    }
%>
<%
    if(x>=24)
    out.println(x+1);
    test();
%>
</body>
</html>
