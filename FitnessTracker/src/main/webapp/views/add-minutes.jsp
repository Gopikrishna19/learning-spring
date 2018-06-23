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
            <td><spring:message code="minutes.activityText"/></td>
            <td><form:select id="activities" path="activity"/></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Save minutes"></td>
        </tr>
    </table>
</form:form>

<h3><spring:message code="minutes.goalForTheDay"/> ${goal.minutes}</h3>

<script>
    window.onload = () => {
        const activitiesSelect = document.getElementById("activities");

        const createOption = (value, text = value) => {
            const option = document.createElement('option');
            option.value = value;
            option.innerHTML = text;
            return option;
        };

        const defaultOption = createOption(null, 'Select an activity');
        defaultOption.disabled = true;

        activitiesSelect.appendChild(defaultOption);

        fetch('<spring:url value="/activities"/>')
            .then(response => response.json())
            .then(activites => activites.forEach(activity => activitiesSelect.appendChild(createOption(activity.description))))
    }
</script>
