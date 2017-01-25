/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jspservlet2;

import java.util.ArrayList;

/**
 *
 * @author andoutakashi
 */
public class test6 {
    
        static ArrayList<String> data = new ArrayList<String>();
        
        static int id =22;
        static String name ="安藤貴史";
        static String birth ="1994年1月25日生";
        static String age ="23歳";
        
        
        static ArrayList<String> getdata(int id, String name, String birth, String age){
            String ids = String.valueOf(id);
            
            data.add(ids);
            data.add(name);
            data.add(birth);
            data.add(age);
            
            return data;
        
    }
        
        public static void main(String[] args){
            
            data = getdata(id,name,birth,age);
            data.remove(0);
            for(String val : data){
                
                System.out.println(val);
            }
        }
    
}
