<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport"
              content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>
            Fitness Tracker
            <core:if test="${not empty pageTitle}">
                <core:out value=" | ${pageTitle}"/>
            </core:if>
        </title>
        <link rel="stylesheet" href="<spring:url value="/assets/base.css"/>">
    </head>
    <body>
        <h1><a href="<spring:url value="/"/>">Fitness Tracker</a></h1>
        Language: <a href="<spring:url value="?lang=en"/>">en</a> | <a href="?lang=es">es</a>
        <core:if test="${not empty view}">
            <jsp:include page="${view}.jsp"/>
        </core:if>
    </body>
</html>
