<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<html>
<head>
    <title>Home page</title>

</head>
<body>

<div>
    <hr>
    <h1> SPRING SECURITY DEMO </h1>
    <hr>
</div>

<div>
    <h1> WELCOME!! </h1>
</div>

<div>
    <a href="${pageContext.request.contextPath}/employees">Employee login</a>
</div>
<div>
    <a href="${pageContext.request.contextPath}/register/showRegistrationForm">Registration form</a>
</div>


</body>
</html>
