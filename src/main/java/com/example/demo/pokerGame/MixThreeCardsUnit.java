package com.example.demo.pokerGame;


public class MixThreeCardsUnit extends MixCardsUnit {

    public MixThreeCardsUnit(CardInHand card0, CardInHand card1, CardInHand card2) {
        this.mixCards = new CardInHand[]{card0, card1, card2};
        this.comparator = new ComparatorBaseNumber();
    }
}
