<%-- 
    Document   : show
    Created on : 2021年2月18日, 下午4:08:17
    Author     : Jiaqi Wang
--%>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.io.IOException" %>
<%@ page contentType="  text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
    <head>
    <title>Show part9 Result</title>
</head>

    <body>
        <%
        Map<String,String[]> map = request.getParameterMap();

        for(Map.Entry<String,String[]> en : map.entrySet()){
            String name = en.getKey();
            String[] value = en.getValue();
            out.println("<h3>");
            out.println(name);
            out.println("</h3>");
            for(String s: value){
                out.println(s);
                out.println("&#9");//&#09;     Horizontal tab
            }
            out.println("<br>");
        }
    %>
    </body>
</html>