<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <form:form action="register" modelAttribute="student" method="post">
  <table>
  <tr>
    <td>Name:</td>
    <td><form:input path="name"/></td>
  </tr>
   <tr>
    <td>Address:</td>
    <td><form:input path="address"/></td>
  </tr>
   <tr>
    <td>Phoneno:</td>
    <td><form:input path="phoneno"/></td>
  </tr>
   <tr>
    <td>Gender:</td>
    <td><form:radiobutton path="gender" value="M"/>Male
    <td><form:radiobutton path="gender" value="F"/>Fe-Male
    </td>
  </tr>
   <tr>
    <td>City:</td>
    <td>
    <form:select path="city">
    <form:option  value="">-select-</form:option>
    <form:option  value="banglore">banglore</form:option>
    <form:option  value="chennai">chennai</form:option>
    <form:option  value="pune">pune</form:option>
    <form:option  value="bhubaneswar">bhubaneswar</form:option>
    <form:option  value="hyderabad">hyderabad</form:option>
    </form:select>
    </td>
  </tr>
    <tr>
    <td>Hobbies:</td>
    <td>
    <form:checkbox path="hobbies" value="reading book"/>reading book
   <form:checkbox path="hobbies" value="playing cricket"/>playing cricket
   <form:checkbox path="hobbies" value="watching movie"/>watching movie
    </td>
  </tr>
   <tr>
    <td>Gender:</td>
    <td><input type="reset" value="reset"/></td>
    <td><input type="submit" value="register"/></td>
      
  </tr>
  </table>
  </form:form>
</body>
</html>