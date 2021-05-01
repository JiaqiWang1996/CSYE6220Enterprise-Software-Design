<%-- 
    Document   : student-form
    Created on : Mar 13, 2021, 10:22:41 AM
    Author     : dedhi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Student Form</h1>
        <form:form commandName="student">
            First Name: <form:input path="fname"/>
            <br/><br/>
            Last Name: <form:input path="lname"/>
            <br/><br/>
            Id: <form:input path="id"/>
            <br/><br/>
            <input type="submit" value="ADD"/>
        </form:form>
    </body>
</html>
