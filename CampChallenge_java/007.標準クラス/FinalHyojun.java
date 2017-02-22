/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jspservlet2;

import java.io.FileReader;
import java.text.SimpleDateFormat;

import java.util.*;
import java.io.*;


/**
 *
 * @author andoutakashi
 */
public class FinalHyojun {
    
    public static void main(String args[])throws Exception{
        
        String str = "あんどうたかし";
        
        //ファイルの場所指定
        String filename1 = "/Users/andoutakashi/NetBeansProjects/test/src/java/jspservlet2/test.rtf";
        
        //上書きモード
        FileWriter fw = new FileWriter(filename1);
        
        //処理開始時間を取得
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日　HH:mm:ss");
        String sdate = sdf.format(date);
        
        fw.write(sdate.toString()+"\n");
        fw.write("処理開始\n\n");
        
        fw.write("日本人かどうか識別する！\n\n");
        
        
        for(int i=0;i<1;i++){
                char ch = str.charAt(i);
                
                //ひらがな判定
                if(Character.UnicodeBlock.of(ch) == Character.UnicodeBlock.HIRAGANA ){
                    
                    fw.write("この人は日本人です！\n\n");
        }else{
            fw.write("Here is foreigner!\n\n");
        }
        }
        
    
        //処理終了時間の取得
        Date date2 = new Date();
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日　HH:mm:ss");
        String sdate2 = sdf2.format(date);
        
        fw.write(sdate2.toString()+"\n");
        fw.write("処理終了\n");
   
        //上書きクローズ
        fw.close();
        
        
       String filename = "/Users/andoutakashi/NetBeansProjects/test/src/java/jspservlet2/test.rtf";
       
       //ファイル読み取りモード
       FileReader fr = new FileReader(filename);
       
       BufferedReader br = new BufferedReader(fr);
       
       
       String str2;
   while((str2 = br.readLine()) !=null){
       System.out.print(str2);
   }
       //ファイナルクローズ
       fr.close();
    }  

    
}
