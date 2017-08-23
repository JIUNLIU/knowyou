<%--
  Created by IntelliJ IDEA.
  User: JIUN
  Date: 2017/8/23
  Time: 21:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" pageEncoding="UTF-8" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<html>
<head>
    <title>懂你网小说</title>
</head>
<script>
    function search() {
        var bookName = document.getElementById("bookName")
        if (bookName == "" || bookName == null) {
            alert("请填写书名")
        }
    }
</script>
<body>
<div>
    <form method="post" name="searchBook" action="/story/search">
        <input class="searchBookName" id="bookName" type="search">

        <button type="submit" onclick="search()">搜索</button>
    </form>

</div>
<div>
    在搜索框中写入书名，点击搜索进行搜索
</div>
</body>
</html>


