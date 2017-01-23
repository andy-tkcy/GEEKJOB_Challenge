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
public class test2 {
    static String process(int i){
        if(i % 2 ==0){
            return "偶数です!";       //偶数か奇数か判別する
        }else{
            return "奇数です!";
        }
    }
    
    public static void main(String[] args) {
        
        int i = 2;  //元の数字
        
        String result = process(i);
        System.out.println(result);  //結果を表示
    }
    
}