/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jspservlet2;

import java.util.*;
import java.text.*;
import java.util.Calendar;

/**
 *
 * @author andoutakashi
 */
public class PastTime {
    
    public static void main(String args[]){
        
        Date date = new Date();
        
        SimpleDateFormat sdf = 
                new SimpleDateFormat("2016年11月04日10時00分00秒");
        
        String pdate = sdf.format(date);
        System.out.print(pdate);
    }
    
}
