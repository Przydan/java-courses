<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 01.02.2020
  Time: 11:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%--<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<html>
<head>
    <title>Customer page</title>
</head>
<body>
<div>
    <p>Customer first name: ${param.firstName}</p>
    <p>Customer last name: ${param.lastName}</p>
    <p>Customer free passes: ${param.freePasses}</p>
    <p>Customer postalCode: ${param.postalCode}</p>
    <p>Customer Course code: ${param.courseCode}</p>
    <p>Customer password: ${param.password}</p>
</div>
</body>
</html>
