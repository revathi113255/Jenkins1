<%@ page session="true"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Student Registartion Page</title>
</head>
<body>
	<h1>Student Registration Form</h1>
	<p></p>
	<form:form action="saveStudent" modelAttribute="addform" >
		<table>
		  <tr>
            <td>Name:</td>
            <td><form:input path="name" /><form:errors path="name"></form:errors></td>
        </tr>
		
		 <tr>
            <td>Age:</td>
            <td><form:input path="age" /><form:errors path="age"></form:errors></td>
        </tr>
		 <tr>
            <td>Address:</td>
            <td><form:input path="address" /><form:errors path="address"></form:errors></td>
        </tr>
		
		
		
			<p></p>
			<tr>
				<td colspan="2"><input type="submit" value="Save Changes" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>



