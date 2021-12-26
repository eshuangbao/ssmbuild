<%--
  Created by IntelliJ IDEA.
  User: 93793
  Date: 2021/12/26
  Time: 21:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>更新</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-head">
                <h1>
                    <small>新增书籍</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/book/updatebook" method="post">
        <input type="hidden" value="${book.bookID}" name="bookID">
        <div class="form-group">
            <label for="bookName">书籍名称</label>
            <input type="text" class="form-control" id="bookName"   name="bookName" value="${book.bookName}" required>
        </div>
        <div class="form-group">
            <label for="bookCounts">书籍数量</label>
            <input type="text" class="form-control" id="bookCounts" name="bookCounts" value="${book.bookCounts}" required>
        </div>
        <div class="form-group">
            <label for="detail">书籍描述</label>
            <input type="text" class="form-control" id="detail" name="detail" value="${book.detail}" required>
        </div>
        <div class="form-group">
            <input type="submit"  class="form-control" value="修改">
        </div>
    </form>

</div>
</body>
</html>
