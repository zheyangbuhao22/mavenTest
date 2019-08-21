<%--
  Created by IntelliJ IDEA.
  User: win
  Date: 2019/8/19
  Time: 14:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>成功了！</h1>
<c:forEach items="${list}" var="items" >
    ${items.name}
</c:forEach>

</body>
</html>
