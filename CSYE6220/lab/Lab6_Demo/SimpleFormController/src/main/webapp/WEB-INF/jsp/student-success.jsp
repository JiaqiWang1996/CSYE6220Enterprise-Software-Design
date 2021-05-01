<%-- 
    Document   : student-success
    Created on : Mar 13, 2021, 10:31:23 AM
    Author     : dedhi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Student Details</h1>
        First Name: ${requestScope.student.fname}
        <br/>
        Last Name: ${requestScope.student.lname}
        <br/>
        Id: ${requestScope.student.id}
    </body>
</html>
