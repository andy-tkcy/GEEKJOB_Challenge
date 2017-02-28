<%-- 
    Document   : Jibun
    Created on : 2017/02/24, 18:00:47
    Author     : andoutakashi
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>自己紹介</title>
    </head>
    <body>
        
        <%
            HttpSession hs = request.getSession(true);
            String[] info;
            
            if(hs.getAttribute("Login")==null){
            String[] test =  {"あんどう","男","ランニング"};
            info =(String[])test.clone();
            }else{
                info= (String[])hs.getAttribute("Login");
            }
        
        
        %>
        
        <form action="Jibun2.jsp" method="post">
            
            名前
            <input type="text" name="name" <% out.print("value="+info[0]);%>>
            
            <br><br>
            
            性別<br>
            男<input type="radio" name="gender" value="男"<%if(info[1].equals("男")){out.print("checked");}%>>
            女<input type="radio" name="gender" value="女"<%if(info[1].equals("女")){out.print("checked");}%>>
            
            <br><br>
            
            趣味
            
            <br>
            
            <textarea name="hobby" cols="50" rows="3"> <% out.print(info[2]);%></textarea>
            
            <br><br>
            
            
            <input type="submit" value="送信">
            
            
            
        </form>
        
        
    </body>
</html>
