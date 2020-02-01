<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 01.02.2020
  Time: 18:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Customer form</title>

    <link rel="stylesheet" href="https://unpkg.com/purecss@1.0.1/build/pure-min.css"
          integrity="sha384-oAOxQR6DkCoMliIh8yFnu25d7Eq/PHS21PClpwjOTeU2jRSq11vu66rf90/cZr47" crossorigin="anonymous">
    <style>
        .error {color:red}
    </style>
</head>
<body>

<div>
    <%--@elvariable id="customer" type="pl.przydan._1_Spring_MVC.model.Customer"--%>
    <form:form action="processForm" modelAttribute="customer" cssClass="pure-form pure-form-stacked">
        <fieldset style="text-align: -webkit-center;">
            <legend>

            </legend>
            <form:label path="firstName" for="firstName">First name</form:label>
            <form:input path="firstName" type="text" id="text" placeholder="First name"/>


            <form:label path="lastName" for="lastName">LastName (*)</form:label>
            <form:input path="lastName" id="lastName" type="text" placeholder="Last name"/>
            <form:errors path="lastName" cssClass="error" />

            <form:label path="freePasses" for="freePasses">FreePasses</form:label>
            <form:input path="freePasses" id="freePasses" type="text" placeholder="freePasses" />
            <form:errors path="freePasses" cssClass="error" />

            <form:label path="postalCode" for="postalCode">Postal code</form:label>
            <form:input path="postalCode" id="postalCode" type="text" placeholder="Postal code" />
            <form:errors path="postalCode" cssClass="error" />

            <form:label path="courseCode" for="courseCode">Course code</form:label>
            <form:input path="courseCode" id="courseCode" type="text" placeholder="Course code" />
            <form:errors path="courseCode" cssClass="error" />

            <form:label path="password" for="password">Password</form:label>
            <form:input path="password" id="password" type="password" placeholder="Password" />
            <form:errors path="password" cssClass="error" />

            <form:button type="submit" class="pure-button pure-button-primary">Submit!</form:button>
        </fieldset>
    </form:form>
</div>

</body>
</html>
