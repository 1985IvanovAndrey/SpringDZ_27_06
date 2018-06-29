<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Main</title>
</head>
<body>
<%--<h3>${message}</h3>--%>
<table border="4" cellpadding="5" cellspacing="4">
    <tr>
        <td>id</td>
        <td>name</td>
        <td>sec_name</td>
        <td>sex</td>
    </tr>
    <c:forEach var="student" items="${studentsList}">
        <tr>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.phone}</td>
            <td>${student.sex}</td>
        </tr>
    </c:forEach>
</table>
<br>
<form action="/add" method="get" modelAttribute="student">
    ID: <input type="text" name="id">
    <br>
    Name: <input type="text" name="name" >
    <br>
    Phone: <input type="text" name="phone" >
    <br>
    Sex:<input type="text" name="sex">
    <br>
    <input type="submit" value="add">
</form>

</body>
</html>
