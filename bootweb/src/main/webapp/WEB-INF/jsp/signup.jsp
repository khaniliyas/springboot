<!DOCTYPE html>
<html lang="en" xmlns:form="http://www.w3.org/1999/html">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<head>
    <meta charset="UTF-8">
    <title>Sign Up Form</title>
</head>
<body>

  <h2>sign up</h2>
  <form:form modelAttribute="signupForm">
  <div style="color:red;">
     <form:errors path="*"/>
  </div>
Email : <form:input path="email"/> <br/>
password : <form:password path="password"/> <br/>
re-type password : <form:password path="reTypedPassword"/><br/>
Full Name : <form:input path="fullName"/><br/>
<form:radiobutton path="gender" value="Male"/> Male
<form:radiobutton path="gender" value="Female"/> Female
age : <form:input path="age"/>
<input type="submit" value="sign up"/>

  </form:form>

</body>
</html>