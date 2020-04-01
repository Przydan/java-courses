<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 01.02.2020
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Student form</title>

    <link rel="stylesheet" href="https://unpkg.com/purecss@1.0.1/build/pure-min.css"
          integrity="sha384-oAOxQR6DkCoMliIh8yFnu25d7Eq/PHS21PClpwjOTeU2jRSq11vu66rf90/cZr47" crossorigin="anonymous">
</head>
<body>

<div>
    <%--@elvariable id="student_2" type="pl.przydan._1_Spring_MVC.model.Student_2"--%>
    <form:form action="processForm" modelAttribute="student_2" cssClass="pure-form pure-form-stacked">
        <fieldset style="text-align: -webkit-center;">

            <legend>
                A Stacked form from purecss.io
                Data loaded from properties file
            </legend>
            <form:label path="firstName" for="firstName">First name</form:label>
            <form:input path="firstName" type="text" id="text" placeholder="First name"/>
            <span class="pure-form-message">This is required field.</span>

            <form:label path="lastName" for="lastName">LastName</form:label>
            <form:input path="lastName" id="lastName" type="text" placeholder="Last name"/>

            <form:label path="country" for="country">Country</form:label>
            <form:select path="country" id="country">
                <form:options items="${theCountryOptions}"/>
            </form:select>


            <form:button type="submit" class="pure-button pure-button-primary">Submit!</form:button>
        </fieldset>
    </form:form>
</div>

</body>
</html>
