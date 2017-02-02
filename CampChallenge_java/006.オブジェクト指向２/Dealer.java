/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJack;


import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author andoutakashi
 */


public class Dealer extends Human{
    
    //cardsというArrayListの変数を用意
    static ArrayList<Integer> dCards = new ArrayList<>();
    
    //手持ちのカード
    int sum = 0;
    
    //playerのカードをセットする
    @Override
    public ArrayList setCards (ArrayList <Integer> dCards){
        
        for( int i=0; i < dCards.size(); i++){
            
            myCards.add(dCards.get(i));
            
        }   
        return myCards;
    }
    
    
    //引いたカードを足す
    //17以下だった場合はもう一度引く
    @Override
    public boolean checkSum(){
        
        for(int i=0; i<myCards.size(); i++){
            
            sum = sum + myCards.get(i);
        }
        
        if( sum >17){
            
            flg = true;
            
        }
        
            return flg;
    }
    
    
    //上から二枚カードを引く
    public ArrayList deal(ArrayList<Integer> cards){
        
        Collections.shuffle(cards);
        
        dCards.add(cards.get(0));
        dCards.add(cards.get(1));
        
        
        //System.out.print(dCards);
        
        return dCards;
    }
    
    //17以下だった時、もう一枚引く
    public ArrayList hit(){
        
        Collections.shuffle(cards);
        
        if(flg){
            
            dCards.add(0);
        }
        
        return dCards;
    }
    
    
    //結果を表示
    @Override
    public void open(){
        
        int num = 0;
        
        for(int i=0; i<myCards.size(); i++){
            
            sum = sum + myCards.get(i);
            
        }
        System.out.print(myCards);
        System.out.print(num);
          
    }
    
    
    
       
        }
       
    
    
