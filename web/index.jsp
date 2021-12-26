<%--
  Created by IntelliJ IDEA.
  User: sinosoft-2021
  Date: 2021/12/21
  Time: 13:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Bootstrap 101 Template</title>
  <style>
    a{
      color: black;
      text-decoration: none;
      font-size: 18px;
    }
    h3{
      width: 180px;
      height: 38px;
      margin: 100px auto;
      text-align: center;
      line-height: 38px;
      background: deepskyblue ;
      border-radius: 5px;
    }
  </style>
</head>
<body>
<h3>
  <a href="${pageContext.request.contextPath}/book/allbook">跳转到书籍页面</a>
</h3>
</body>
</html>
