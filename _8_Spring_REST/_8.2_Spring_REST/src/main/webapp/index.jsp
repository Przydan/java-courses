<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SPRING REST APP</title>
</head>
<body>
<div>
    <h3>Endpoints: </h3>
    <hr>

    <a href="${pageContext.request.contextPath}/test/hello">Say hallo</a>
    <a href="${pageContext.request.contextPath}/api/students">api/students</a>

</div>
</body>
</html>
