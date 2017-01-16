<%-- 
    Document   : javakiso2-2
    Created on : 2017/01/16, 17:30:10
    Author     : andoutakashi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
   char langage = 'A';
   String message ="";
   
switch(langage){
    case 'A':
        message="英語";
       break;
        
    case 'あ':
        message="日本語";
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
