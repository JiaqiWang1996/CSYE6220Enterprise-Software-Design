<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<%@taglib prefix="sh" uri="tag" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Display CSV</title>
</head>
<body>
<sh:show fileName="${requestScope.fileName}" filePath="${requestScope.path}"/>
</body>
</html>
