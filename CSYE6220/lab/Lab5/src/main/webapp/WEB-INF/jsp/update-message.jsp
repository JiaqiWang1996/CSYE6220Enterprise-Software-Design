<%-- 
    Document   : update-message
    Created on : Mar 4, 2021, 8:55:04 PM
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
        <h3>Update Message</h3><hr>
        <form action="message.htm" method="POST">
            Message id: <input type="text" name="messageId" readonly value="${requestScope.message.messageId}"/><br/><br/>
            User name: <input type="text" name="fromUser" value="${requestScope.message.fromUser}"/><br/><br/>
            Message: <input type="text" name="message" value="${requestScope.message.message}"/><br/><br/>
            Date <input type="text" name="date" value="${requestScope.message.messageDate}" readonly/><br/><br/>
            <input type="hidden" name="option" value="update"/>
            <input type="submit" value="Update message"/>
        </form>
    </body>
</html>
