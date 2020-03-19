<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<html>
<head>
    <title>User info</title>

</head>
<body>

<div>
    <hr>
    <h1> SPRING SECURITY DEMO </h1>
    <hr>
</div>

<div>
    <hr>

    <p>USER: <security:authentication property="principal.username"/></p>
    <br>
    <p>ROLE(s): <security:authentication property="principal.authorities"/></p>
    <br>

    <hr>

    <security:authorize access="hasRole('ROLE_MANAGER')">
        <p>
            <a href="${pageContext.request.contextPath}/leaders">Leadership</a>
        </p>
        <hr>
    </security:authorize>

    <security:authorize access="hasRole('ROLE_ADMIN')">
        <p>
            <a href="${pageContext.request.contextPath}/systems">Admin tools</a>
        </p>
        <hr>
    </security:authorize>

    <form:form action="${pageContext.request.contextPath}/logout"
               method="POST">
        <input type="submit" value="Logout">
    </form:form>
</div>


</body>
</html>
