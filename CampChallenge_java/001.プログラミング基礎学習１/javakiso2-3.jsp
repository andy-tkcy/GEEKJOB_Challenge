<%-- 
    Document   : javakiso2-3
    Created on : 2017/01/16, 17:41:09
    Author     : andoutakashi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    int a = 1;
    int b = 20;
    
    for(int i=0; i<b; i++){
        a=a*8;
    out.print( a +"<br>");
}


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
