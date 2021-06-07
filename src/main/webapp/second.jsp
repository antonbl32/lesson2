<%--<%@ page import="it.free.Serv1" %>--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Second file</title>
</head>
<body>
<p><h2>Default page</h2></p>
<p>Name: <%=request.getParameter("name") %></p>
<p><%if (request.getAttribute("name1") != null) {
    out.println("<p>" + request.getAttribute("name1") + "</p>");
}%></p>
</body>
</html>
