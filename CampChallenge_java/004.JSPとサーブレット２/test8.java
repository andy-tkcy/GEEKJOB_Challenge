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
public class test8 {


    //ArrayListから新しくオブジェクトをつくる
    static ArrayList<String> profile = new ArrayList<String>();
    
    
        //入力するid
        static int id = 0;
        
        
        
        static ArrayList getprofile(int id){
            
            
            
            //入力されたidから合う値を指定する
            switch(id){
                
                
                case 0:
                   profile.add("福山雅治"); 
                   profile.add("1969年02月06日生");
                   profile.add("長崎県出身");
                   profile.add(null);
                
                break;
                
                case 1:
                   profile.add("山田孝之"); 
                   profile.add("1983年10月20日生");
                   profile.add("鹿児島県出身");
                   profile.add("鹿児島県鹿児島市山田家");
                
                break;
                
                case 2:
                   profile.add ("瑛太"); 
                   profile.add("1982年12月13日");
                   profile.add("新潟県生　東京育ち");
                   profile.add("東京都豊島区瑛太家");
                
                break;
                
            }
            return profile;
            
        }
        
        public static void main(String[] args){
            
            
            
            for(id=0; id<3; id++){
            
            profile.clear();
            profile = getprofile(id);
            profile.remove(null);
            
            if(id==3){
                break;
            }
            
            System.out.print(profile + "\n\r");
            
            
            }
            
            
            
            
        }   
}
   

