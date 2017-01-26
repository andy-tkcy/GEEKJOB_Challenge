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
public class object1 {
    
//パブリックな2つの変数を用意
      public static String sex;
      public static String job; 
      
     //2つの変数に値を設定するパブリックなメソッド
      public void set(){
          String s = "漢";  sex = s;
          String j = "将軍";    job = j;
      }
      
      //2つの変数の中身をprintするパブリックなメソッド
      public void print(){
      
         System.out.print(sex);
         System.out.print(job);
      }
}
        
