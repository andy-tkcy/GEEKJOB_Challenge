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
public class test1 {
    
    public static void main(String[] args){
        for(int i=0; i<10; i++){
            name();
            birth();
            introduce();
                
    }
}
   
    
    public static void name(){
        System.out.print("安藤　貴史" + "\r\n");
    }
    public static void birth(){
        System.out.print("1994年1月25日生まれ" + "\r\n");
    }
    public static void introduce(){
        System.out.print("よろしくお願いします！！" + "\r\n" + "\r\n");
    }
}