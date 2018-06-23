<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<style>
    .error {
        color: red;
    }

    .error-block {
        color: black;
        background-color: #fee;
        border: 1px solid red;
        padding: 10px;
        margin: 10px 0;
    }
</style>
<h2>Add goal</h2>
<form:form modelAttribute="goal">
    <form:errors path="*" cssClass="error-block" element="div"/>
    <table>
        <tr>
            <td><spring:message code="goal.text"/></td>
            <td>
                <form:input path="minutes" cssErrorClass="error"/>
                <form:errors path="minutes" cssClass="error"/>
            </td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Save goal"></td>
        </tr>
    </table>
</form:form>
