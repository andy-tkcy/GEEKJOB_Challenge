<%-- 
    Document   : FileReader
    Created on : 2017/02/21, 17:17:43
    Author     : andoutakashi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"
        import="java.util.*,java.text.*,java.io.*"%>

<%
   File txt = new File("test.rtf"); 
   
   //追記モードでオブジェクト生成
   FileWriter fw = new FileWriter(txt);
   
   
   //追記書き込み
   fw.write("私は安藤貴史です。\r");
   fw.write("23歳\r");
   fw.write("独身\r");
   
   
   //追記クローズ
   fw.close();
   
   
   //読み込みモード
   FileReader fr = new FileReader(txt);
   
   
   BufferedReader br = new BufferedReader(fr);

   out.print(br.readLine());
   out.print("<br>");
   
   out.print(br.readLine());
   out.print("<br>");
   
   out.print(br.readLine());
   out.print("<br>");
   
   //クローズ
   fr.close();
   
   
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
