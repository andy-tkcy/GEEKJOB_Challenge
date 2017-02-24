<%-- 
    Document   : Cookie
    Created on : 2017/02/24, 16:53:07
    Author     : andoutakashi
--%>

<%@page import="java.util.Date"%>
<%@page import="javax.servlet.http.Cookie" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CookieTest</title>
    </head>
    <body>
        
        <%
          Date time = new Date();
          Cookie c = new Cookie("LastLogin",time.toString());
          response.addCookie(c);
          

          Cookie cs[] = request.getCookies();
          if(cs !=null){
              for(int i=0; i<cs.length; i++){
                  if(cs[i].getName().equals("LastLogin")){
                      
                  out.print("最後のログインは"+cs[i].getValue());
                  break;
              }
          }
          }
        
        %>
        
        
        
    </body>
</html>
