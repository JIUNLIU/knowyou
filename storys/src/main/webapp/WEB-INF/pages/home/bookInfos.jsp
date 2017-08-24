<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: JIUN
  Date: 2017/8/23
  Time: 23:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍信息</title>
</head>
<body>
<table >
    <c:forEach items="${bookInfos}" var="book">
        <tr>
            <td><img src="${book.bookPicURL}"></img></td>
            <td>${book.bookName}</td>
            <td>${book.bookDesc}</td>
            <td>${book.bookAuthor}</td>
            <td>${book.bookType}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
