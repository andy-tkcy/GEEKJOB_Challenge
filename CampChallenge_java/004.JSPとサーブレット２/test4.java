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
public class test4 {
    
    public static void main(String[] args){

    
    boolean type1 = false;
    boolean type2 = false;
    boolean type3 = false;
    
    type1 = name();
    type2 = birth();
    type3 = introduce();
    
   
        
        if(type1&&type2&&type3){
            System.out.println("この処理は正しく実行できました！");
        }else{
            System.out.println("正しく実行できませんでした。。");
        }
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
