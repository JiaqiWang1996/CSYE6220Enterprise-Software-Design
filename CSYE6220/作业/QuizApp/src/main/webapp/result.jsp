<%-- 
    Document   : result
    Created on : Mar 7, 2021, 6:35:43 AM
    Author     : User
--%>
<%@page session="false"%>//false means session not exist,create;exist ,reuse
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Session ID:<jsp:expression>session.getId()</jsp:expression></h1>
        <h1>Your Results</h1>
        Answer 1:<jsp:expression>session.getAttribute("a1") </jsp:expression><br/>
                 Answer 2:<jsp:expression>session.getAttribute("a2") </jsp:expression><br/>
                          Answer 3:<jsp:expression>session.getAttribute("a3") </jsp:expression><br/>
                          <a href="quizservlet?qn=logout">Logout</a>/ 
    </body>
</html>
