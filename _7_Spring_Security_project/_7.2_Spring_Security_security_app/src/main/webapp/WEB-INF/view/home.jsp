<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Home page</title>

</head>
<body>

<div>
    <hr>
    <h1> SIEMA </h1>
    <hr>
</div>
<div>
    <form:form action="${pageContext.request.contextPath}/logout"
               method="POST">
            <input type="submit" value="Logout">
    </form:form>
</div>


</body>
</html>
