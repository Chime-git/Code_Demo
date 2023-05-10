package com.example.demo.pokerGame;

import com.example.demo.pokerGame.entity.Card;

public interface Comparator {
    boolean isEqual(Card card1, Card card2) ;

    boolean isAscendingAdjacent(Card smaller, Card bigger) ;

    boolean isPreBiggerThanNext(Card pre, Card next) ;
}
