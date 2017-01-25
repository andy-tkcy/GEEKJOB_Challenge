/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jspservlet2;

import java.util.HashMap;

/**
 *
 * @author andoutakashi
 */
public class test7 {
    
    
    //HashMapを使い、文字列でのキーと値をつなげる
    static HashMap<String,String> profile = new HashMap<String,String>(3);
    
    
        //入力するid
        static int id = 0;      
        
        
        //入力されたidから値を指定する
        static HashMap getprofile(int id){
            
            
            
            //入力されたidから合う値を指定する
            switch(id){
                
                
                case 0:
                   profile.put("name","福山雅治"+"\r\n"); 
                   profile.put("birth","1969年02月06日生"+"\r\n");
                   profile.put("from","長崎県出身"+"\r\n");
                break;
                
                
                case 1:
                   profile.put ("name","山田孝之"+"\r\n"); 
                   profile.put("birth","1983年10月20日生"+"\r\n");
                   profile.put("from","鹿児島県出身"+"\r\n");
                break;
                
                
                case 2:
                   profile.put ("name","瑛太"+"\r\n"); 
                   profile.put("birth","1982年12月13日"+"\r\n");
                   profile.put("from","新潟県生　東京育ち"+"\r\n");
                break;
                
            }
            return profile;
            
        }
        
        public static void main(String[] args){
            
            
            profile = getprofile(id);
            
            System.out.print(profile.get("name"));
            System.out.print(profile.get("birth"));
            System.out.print(profile.get("from"));
            
        }   
}
    
