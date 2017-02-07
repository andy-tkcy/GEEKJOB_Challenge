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
    
    Calendar cal = Calendar.getInstance();
    cal.setTime(date);
    
    SimpleDateFormat sdf = 
            new SimpleDateFormat("yyy年MM月dd日kk時mm分ss秒");
    
    String sdate = sdf.format(date);
    System.out.print(sdate);
    
    
}
}
