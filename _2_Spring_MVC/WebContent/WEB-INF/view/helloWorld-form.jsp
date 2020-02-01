<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 22.01.2020
  Time: 13:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello World - Input Form</title>

    <link crossorigin="anonymous" href="https://unpkg.com/purecss@1.0.1/build/pure-min.css"
          integrity="sha384-oAOxQR6DkCoMliIh8yFnu25d7Eq/PHS21PClpwjOTeU2jRSq11vu66rf90/cZr47" rel="stylesheet">
</head>
<body style="align-content: center">
<div>
    <form action="processForm" method="get">

        <input type="text" name="studentName" placeholder="What's your name?">
        <input type="submit">
    </form>
</div>
<br>
<br>
<br>
<div>
    <form action="processForm_ver2" method="get">

        <input type="text" name="studentName" placeholder="What's your name?">
        <input type="submit">
    </form>
</div>
<br>
<br>
<br>
<div>
    <form action="processForm_ver3" method="get">

        <input type="text" name="studentName" placeholder="What's your name?">
        <input type="submit">
    </form>
</div>
</body>
</html>
