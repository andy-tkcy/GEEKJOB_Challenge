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
public class object2 extends object1{
    
    public void set2(){
        set();
        
        String s ="";  sex = s; //2つの変数の中身をクリアするパブリックなメソッド
        String j = "";  job = j;
    }
    
    public void print2(){
      
         System.out.print(sex);
         System.out.print(job);
      }
    
}
