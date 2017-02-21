<%-- 
    Document   : WordsReplace
    Created on : 2017/02/21, 19:15:38
    Author     : andoutakashi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    String kadai = "きょUはぴ|え|ちぴ|のくみこいかんすUのがくしゅUをしてます";
    
    String kadai2 = (kadai.replace("U", "う"));
    out.print(kadai2.replace("|", "い"));
    
    
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
