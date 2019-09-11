<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<html>  
<head>  
<style>  
.error{color:red}  
</style>  
</head>  
<body>  
<form:form action="a2" modelAttribute="emp">  
UserName(*): <form:input path="Name"/> <br><br>  
Password(*): <form:password path="password"/>    
<form:errors path="password" cssClass="error"/><br><br> 
Age: <form:input path="age"/>   
<form:errors path="age" cssClass="error"/><br><br>  
<input type="submit" value="submit">  
</form:form>  
</body>  
</html> 