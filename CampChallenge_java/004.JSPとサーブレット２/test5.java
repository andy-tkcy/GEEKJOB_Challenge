/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jspservlet2;

/**
 *
 * @author andoutakashi
 */
public class test5 {
    public static void main(String[] args){

    boolean type1 = true;
    boolean type2 = false;
    boolean type3 = false;
    boolean type4 = false;
    
    type1 = id();
    type2 = name();
    type3 = birth();
    type4 = introduce();
    
   
    }

   public static boolean id(){
       
       int id = 10;
       return true;
   }
    
    
    
    public static boolean name(){
        System.out.println("安藤　貴史" + "\r\n");

        return false;
    }
    public static boolean birth(){
        System.out.println("1994年1月25日生まれ" + "\r\n");
        
        return true;
    }
    public static boolean introduce(){
        System.out.println("よろしくお願いします！！" + "\r\n" + "\r\n");
        
        return true;

    }
     }

