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
public class test3 {
    public static void main(String[] args) {
        
        num(100,5,true);
    }
    
 public static void num(Integer AAA,Integer BBB,boolean type){
     Integer kake =AAA * BBB;
     
     if(type){
         kake=kake*kake;
         System.out.print(kake);
     }else{
         System.out.print(kake);
     }
 }
    
}
