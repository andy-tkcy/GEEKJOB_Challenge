<%-- 
    Document   : javakiso2-10
    Created on : 2017/01/18, 10:31:44
    Author     : andoutakashi
--%>

<%@page import ="java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    String origin = request.getParameter("a");
   
    int reqA = Integer.parseInt(origin);
    
    out.print( origin +"　");

  while(reqA%2==0){
        out.print("2"+"　");
        reqA/=2;    
    }
  
    for(int i=3;i<13;i+=2){
        while(reqA % i ==0){  
            
    if(i>10){
        
    out.print("その他");
    break;
    
}
        reqA/=i;
        
}
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
