<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport"
              content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>
            Fitness Tracker
            <c:if test="${not empty pageTitle}">
                <c:out value=" | ${pageTitle}"/>
            </c:if>
        </title>
        <link rel="stylesheet" href="/assets/base.css">
    </head>
    <body>
        <c:if test="${not empty view}">
            <jsp:include page="${view}.jsp"/>
        </c:if>
    </body>
</html>
