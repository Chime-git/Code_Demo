package com.example.demo.pokerGame;

import com.example.demo.pokerGame.entity.Card;

public class ComparatorBaseNumber implements Comparator {

    @Override
    public  boolean isEqual(Card card1, Card card2) {
        return card1.getNumber() == card2.getNumber();

    }
    @Override
    public  boolean isAscendingAdjacent(Card smaller, Card bigger) {
        return smaller.getNumber() + 1 == bigger.getNumber();
    }
    @Override
    public  boolean isPreBiggerThanNext(Card pre, Card next) {
        return pre.getNumber() > next.getNumber();
    }
}
