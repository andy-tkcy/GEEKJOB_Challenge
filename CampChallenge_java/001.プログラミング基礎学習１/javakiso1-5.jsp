<%-- 
    Document   : javakiso1-5
    Created on : 2017/01/13, 16:18:58
    Author     : andoutakashi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% 
  int camp = 1;
  
        if(camp==1){
            out.print("1です！");
        }else if(camp==2){
            out.print("プログラミングキャンプ！");
        }else{
            out.print("その他です！");
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
