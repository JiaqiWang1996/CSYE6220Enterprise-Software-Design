<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show</title>
</head>
<body>
    <%
        response.setContentType("text/html");
        Enumeration<String> em = request.getParameterNames();
        PrintWriter print = response.getWriter();
        while(em.hasMoreElements()){
            String name = em.nextElement();
            print.println(name+" is: ");
            print.println(request.getParameter(name));
            print.println("<br>");
        }
    %>
</body>
</html>

