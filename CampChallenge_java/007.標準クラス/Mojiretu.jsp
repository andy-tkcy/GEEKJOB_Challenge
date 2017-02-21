<%-- 
    Document   : Mojiretu
    Created on : 2017/02/21, 18:36:20
    Author     : andoutakashi
--%>

<%@page import="java.nio.charset.Charset"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    String moji = "安藤貴史";
    out.print(moji +"<br>");
    
    out.print("文字数：" +moji.length() +"<br>");
    
    out.print("バイト数：" +moji.getBytes("UTF-8").length);




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
