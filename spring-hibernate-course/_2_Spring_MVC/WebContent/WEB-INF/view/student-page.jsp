<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 01.02.2020
  Time: 11:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Student page</title>
</head>
<body>
<div>
    <p>Student first name: ${param.firstName}</p>
    <p>Student last name: ${param.lastName}</p>
    <p>Student country: ${param.country}</p>
    <p>Student favorite lang: ${param.favoriteLang}</p>
    <c:forEach var="temp" items="${student.OS}">
        <li> ${temp} </li>
    </c:forEach>
</div>
</body>
</html>
