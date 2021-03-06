<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Login Page</title>

    <style>
        .failedLoginMsg {
            color: red;
        }
    </style>
</head>
<body>
<div>
    <hr>
    <h1> SPRING SECURITY DEMO </h1>
    <hr>
</div>
<h3>Login page</h3>

<form action="${pageContext.request.contextPath}/authenticateUser"
      method="POST">

    <c:if test="${param.error != null}">
        <i class="failedLoginMsg">Sorry! You entered invalid username/password.</i>
    </c:if>

    <p> User name: <input type="text" name="username"/></p>
    <p> Password: <input type="password" name="password"/></p>

    <input type="submit" value="Login"/>

    <%-- Add CSRF token --%>
    <input type="hidden"
           name="${_csrf.parameterName}"
           value="${_csrf.token}"/>
</form>

</body>
</html>
