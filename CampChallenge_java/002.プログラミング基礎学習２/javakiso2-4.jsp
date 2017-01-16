<%-- 
    Document   : javakiso2-4
    Created on : 2017/01/16, 18:00:58
    Author     : andoutakashi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    
    int num =0;
    int count =100;
    
    for(int i=0; i<count; i++){
        
    num=num+num;
    out.print(num+"<br>");
    
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
