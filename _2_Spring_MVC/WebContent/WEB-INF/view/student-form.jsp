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
    <%--@elvariable id="student" type="pl.przydan._1_Spring_MVC.model.Student"--%>
    <form:form action="processForm" modelAttribute="student" cssClass="pure-form pure-form-stacked">
        <fieldset style="text-align: -webkit-center;">

            <legend>
                A Stacked form from purecss.io
                Data loaded from java class
            </legend>
            <form:label path="firstName" for="firstName">First name</form:label>
            <form:input path="firstName" type="text" id="text" placeholder="First name"/>


            <form:label path="lastName" for="lastName">LastName</form:label>
            <form:input path="lastName" id="lastName" type="text" placeholder="Last name"/>

            <form:label path="country" for="country">Country</form:label>
            <form:select path="country" id="country">
                <form:options items="${student.countryOptions}"/>
            </form:select>

            <form:label path="favoriteLang" for="favoriteLang">Favorite Language</form:label>
            <form:radiobuttons path="favoriteLang" items="${student.langOptions}" />

            <form:label path="OS" for="OS">With os you using?</form:label>
            <form:checkboxes path="OS" items="${student.OS_options}"/>

<%--            Java <form:radiobutton path="favoriteLang" value="Java"/>--%>
<%--            C# <form:radiobutton path="favoriteLang" value="C#"/>--%>
<%--            Python <form:radiobutton path="favoriteLang" value="Python"/>--%>
<%--            JavaScript <form:radiobutton path="favoriteLang" value="JavaScript"/>--%>


            <form:button type="submit" class="pure-button pure-button-primary">Submit!</form:button>
        </fieldset>
    </form:form>
</div>

<div>
    <%--@elvariable id="student" type="pl.przydan._1_Spring_MVC.model.Student"--%>
    <form:form action="processForm" modelAttribute="student">

        First name: <form:input path="firstName"/>

        <br>
        <br>

        Last name: <form:input path="lastName"/>

        <%--    <br>--%>
        <%--    <br>--%>

        <%--    <form:select path="country">--%>
        <%--        <form:option value="Germany" label="Germany" />--%>
        <%--        <form:option value="Poland" label="Poland" />--%>
        <%--        <form:option value="England" label="England" />--%>
        <%--        <form:option value="Switzerland" label="Switzerland" />--%>
        <%--        <form:option value="France" label="France" />--%>
        <%--        <form:option value="USA" label="USA" />--%>
        <%--        <form:option value="India" label="India" />--%>
        <%--    </form:select>--%>
        <br>
        <form:select path="country">
            <form:options items="${student.countryOptions}"/>
        </form:select>

        <br>
        <br>

        <input type="submit" value="Submit"/>

    </form:form>
</div>


</body>
</html>
