package com.example.demo.pokerGame;

public class Relationship {

   public static boolean isEqual(Card card1, Card card2){
       return card1.getNumber() == card2.getNumber();

   }

    public static boolean isAscendingAdjacent(Card smaller, Card bigger){
        return smaller.getNumber() + 1 == bigger.getNumber();
    }

    public static boolean isPreBiggerThanNext(Card pre, Card next){
        return pre.getNumber() > next.getNumber();
    }
}
