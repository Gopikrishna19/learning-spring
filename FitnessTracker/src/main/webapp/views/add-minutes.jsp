<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<h2>Add minutes exercised</h2>
<form:form modelAttribute="exercise">
    <table>
        <tr>
            <td><spring:message code="minutes.text"/></td>
            <td><form:input path="minutes"/></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Save minutes"></td>
        </tr>
    </table>
</form:form>

<h3><spring:message code="minutes.goalForTheDay"/> ${goal.minutes}</h3>
