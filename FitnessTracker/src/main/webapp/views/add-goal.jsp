<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<h2>Add goal</h2>
<form:form modelAttribute="goal">
    <table>
        <tr>
            <td><spring:message code="goal.text"/></td>
            <td><form:input path="minutes"/></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Save minutes"></td>
        </tr>
    </table>
</form:form>
