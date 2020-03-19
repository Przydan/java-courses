<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <title>Leaders page</title>
</head>
<body>
<div>
    <hr>
    <h1> SPRING SECURITY DEMO </h1>
    <hr>
</div>

<hr>
<div>
    <p> Message only for leaders </p>
</div>
<hr>
<div>
    <a href="${pageContext.request.contextPath}/employees">Back to home page</a>
</div>

</body>
</html>
