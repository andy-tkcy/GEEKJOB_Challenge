/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jspservlet2;

import java.util.*;
import java.text.*;

/**
 *
 * @author andoutakashi
 */
public class NowTime {
    
    public static void main(String args[]){
    
    Date date = new Date();
    
    //取得したいデータを指定(これを呼び出したいという命令)
    SimpleDateFormat sdf = 
            new SimpleDateFormat("yyyy年MM月dd日E曜日kk時mm分ss秒");
    
    //指定されたデータを実際にdateから取ってくる
    //取ってきたデータをsdateに代入
    String sdate = sdf.format(date);
    System.out.print(sdate);
    
    
}
}
