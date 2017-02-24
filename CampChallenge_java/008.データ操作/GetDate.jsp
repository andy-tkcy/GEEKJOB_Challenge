<%-- 
    Document   : GetDate
    Created on : 2017/02/24, 15:28:59
    Author     : andoutakashi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
    <h1>結果</h1>
        
        <%
            request.setCharacterEncoding("UTF-8");
        %>

        名前
        <%
            String a = request.getParameter("name");
             out.print(a);
        %>
        
        <br>
        性別
        <%
            String b = request.getParameter("gender");
            out.print(b);
        %>
        
        <br>
        趣味
        <%
            String c = request.getParameter("hobby");
            out.print(c);

        %>
        
        <br>
        <br>
        
        <a href="Input.html">戻る</a>
  
        
    </body>
</html>
