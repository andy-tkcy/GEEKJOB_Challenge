<%-- 
    Document   : Jibun2
    Created on : 2017/02/28, 14:51:30
    Author     : andoutakashi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>入力結果</h1>
        
        <%
            request.setCharacterEncoding("UTF-8");
            
        %>
        
        名前:
        <%
            String a = request.getParameter("name");
            out.print(a);
        %>
        
        <br><br>
        
        性別:
        <%        
            String b = request.getParameter("gender");
            out.print(b);
        %>
        
        <br><br>
        
        趣味:
        <%
            String c = request.getParameter("hobby");
            out.print(c);
        %>
        
        <br><br>
              
        <%
            HttpSession hs = request.getSession(true);
            String[] info = {request.getParameter("name"),request.getParameter("gender"),request.getParameter("hobby")};
            hs.setAttribute("Login", info);
        %>
        
        <a href="Jibun.jsp">戻る</a>
    </body>
</html>
