<%-- 
    Document   : view-messages
    Created on : Mar 4, 2021, 8:09:20 PM
    Author     : dedhi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            table,th,td {border:1px solid black;}
        </style>
    </head>
    <body>
        <h3>Message List</h3><hr>
        <table>
            <thead>
                <tr>
                <th>Message ID</th>
                <th>From</th>
                <th>Message</th>
                <th>Date</th>
                </tr>
            <thead>
            <tbody>
            <c:forEach items="${requestScope.list}" var="message">
                <tr>
                    <td><c:out value="${message.messageId}" /></td>
                    <td><c:out value="${message.fromUser}" /></td>
                    <td><c:out value="${message.message}" /></td>
                    <td><c:out value="${message.messageDate}" /></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        <hr>
        <form action="message.htm" method="POST">
            Message Id: <input type="text" name="messageId"/>
            <input type="hidden" name="option" value="getMessage"/>
            <input type="submit" value="Update Message"/>
        </form>
        <hr>
        <form action="message.htm" method="POST">
            Message Id: <input type="text" name="messageId"/>
            <input type="hidden" name="option" value="delete"/>
            <input type="submit" value="Delete Message"/>
        </form>
    </body>
</html>
