<%-- 
    Document   : Session
    Created on : 2017/02/24, 17:35:52
    Author     : andoutakashi
--%>

<%@page import="javax.servlet.http.HttpSession"%>
<%@page import="java.util.Date" %>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Session</title>
    </head>
    <body>
        
        <%
        Date time = new Date();
        HttpSession hs = request.getSession(true);
        hs.setAttribute("LastLogin", time.toString());
        
        
        
        if((hs.getAttribute("LastLogin")) !=null){
            
        out.print("最後のログインは" + hs.getAttribute("LastLogin"));
            
            
        }
        %>
        
        
    </body>
</html>
