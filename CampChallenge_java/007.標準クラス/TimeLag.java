/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jspservlet2;

import java.util.*;
import java.util.Calendar;
import java.text.*;

/**
 *
 * @author andoutakashi
 */
public class TimeLag {
    
    public static void main(String args[])throws ParseException{
        
        
        Calendar cal1 = Calendar.getInstance();
        cal1.set(2015,01,01,00,00,00);
        Date calpast1 = cal1.getTime();
        
        Calendar cal2 = Calendar.getInstance();
        cal2.set(2015,12,31,23,59,59);
        Date calpast2 = cal2.getTime();
        
        long dateA = calpast1.getTime();
        long dateB = calpast2.getTime();
        
        System.out.print(dateA-dateB);
        
        
    }
    
}
