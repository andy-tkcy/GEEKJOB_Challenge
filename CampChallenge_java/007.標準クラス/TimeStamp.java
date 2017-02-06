/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jspservlet2;


import java.util.*;
import java.util.Calendar;


/**
 *
 * @author andoutakashi
 */
public class TimeStamp {
    
    public static void main(String[] args){
        
        Calendar cal = Calendar.getInstance();
        cal.set(2016,01,01);
        Date date = cal.getTime();
        
        System.out.print(date.getTime());
    }
    
    
}
