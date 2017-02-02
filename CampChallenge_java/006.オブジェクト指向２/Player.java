/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJack;

import java.util.ArrayList;

/**
 *
 * @author andoutakashi
 */

public class Player extends Human{
    
    //引いたカードをmyCardsに格納する
    @Override
    public ArrayList setCards(ArrayList<Integer> cards){
        for(int i=0;i<cards.size(); i++){
        myCards.add(cards.get(i));
}
        return myCards;
}
    //引いたカードを足して21以下になっているか確認
    @Override
    public boolean checkSum(){
        int sum =0;
        for(int i=0; i<myCards.size(); i++){
            sum = sum + myCards.get(i);
}
        return flg;
    
}
    //Playerのカードを合計する
    @Override
    public void open(){
        int sum =0;
        for(int i=0; i<myCards.size(); i++){
            sum = sum + myCards.get(i);
        }
        
    }
}