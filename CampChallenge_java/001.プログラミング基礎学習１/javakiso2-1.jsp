<%-- 
    Document   : javakiso2-1
    Created on : 2017/01/16, 17:14:15
    Author     : andoutakashi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
   int number = 1;
   String message ="";
   
switch(number){
    case 1:
        message="one";
        break;
    case 2:
        message="two";
        break;
    case 3:
        message="想定外";
        break;
}

out.print(message);

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
