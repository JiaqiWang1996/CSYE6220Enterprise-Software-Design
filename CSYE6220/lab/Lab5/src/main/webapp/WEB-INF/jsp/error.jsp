<%-- 
    Document   : error
    Created on : Mar 4, 2021, 7:40:01 PM
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
        <h1>${requestScope.errorMsg}</h1>
        <a href="index.htm">[Go back to home page]</a>
    </body>
</html>