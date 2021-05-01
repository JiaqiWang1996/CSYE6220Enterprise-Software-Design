<%-- 
    Document   : user-view
    Created on : Feb 24, 2021, 2:26:55 PM
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
        User: ${requestScope.user.first} ${requestScope.user.last}
        <br/>
        Message: ${requestScope.msg}
    </body>
</html>
