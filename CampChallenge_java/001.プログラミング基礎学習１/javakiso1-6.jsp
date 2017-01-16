<%-- 
    Document   : javakiso1-6
    Created on : 2017/01/13, 16:29:36
    Author     : andoutakashi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
// http://localhost:8080/quest.jsp?a=2&b=10000&c=5
String product = request.getParameter("a");
String price = request.getParameter("b");
String point = request.getParameter("c");
int reqA = Integer.parseInt(product);
int reqB = Integer.parseInt(price);
int reqC = Integer.parseInt(point);
// no.1
if(reqA == 1){
    out.println("雑貨");
    
}else if(reqA == 2){
    out.println("生鮮食品");
            
}else{
    out.println("その他");
    
    
}
//no.2
int tannka =reqB/6;   
out.println("総額"+reqB+"円　"+"単価"+tannka+"円");
//no.3
if(reqC >=5000){
    out.println("ポイント５％付与");
}else if(reqC >=3000){
    out.println("ポイント４％付与");
          
}
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        
    </body>
</html>
