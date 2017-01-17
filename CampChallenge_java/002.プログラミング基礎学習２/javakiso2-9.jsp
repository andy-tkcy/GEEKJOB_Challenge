<%-- 
    Document   : javakiso2-9
    Created on : 2017/01/17, 14:52:01
    Author     : andoutakashi
--%>

<%@ page import="java.util.HashMap"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%

    HashMap<String,String> hMap =
    new HashMap<String,String>();

    hMap.put("1", "AAA");
    hMap.put("hello", "world");
    hMap.put("soeda", "33");
    hMap.put("20", "20");
    
out.print(hMap.get("1"));
    

%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1></h1>
    </body>
</html>
