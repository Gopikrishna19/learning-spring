<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<h1>Add minutes exercised</h1>
<form:form modelAttribute="exercise">
    <table>
        <tr>
            <td>Minutes exercised for today:</td>
            <td><form:input path="minutes"/></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Save minutes"></td>
        </tr>
    </table>
</form:form>
