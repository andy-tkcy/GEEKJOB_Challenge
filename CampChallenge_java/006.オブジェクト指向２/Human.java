package BlackJack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Arrays;



/**
 *
 * @author andoutakashi
 */

//1/31(火)　ブラックジャックの作成


//Human抽象クラスの作成
abstract class Human {
    
    //もう一枚カードが必要かどうか確認
    boolean flg = false;
    
    
    static ArrayList<Integer> cards 
            = new ArrayList<>();
    
    //myCardsというArrayListの変数を用意
    static ArrayList<Integer> myCards
            = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
    
    //setCardというArrayListを引数とした、abstractなメソッドを用意
    //二枚のカードを引く
    public abstract ArrayList<Integer> setCards( ArrayList<Integer> cards);
    
    //checkSumというabstractなメソッドを用意
    //カードを合計する
    public abstract boolean checkSum();
    
    //openというabstractな公開メソッドを用意
    //オープンする
    public abstract void open();
    

}