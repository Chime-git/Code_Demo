package com.example.demo.pokerGame;

import org.springframework.beans.factory.InitializingBean;

public class MixThreeCardsUnit extends MixCardsUnit {

    public MixThreeCardsUnit(CardInHand card0, CardInHand card1, CardInHand card2){
        mixCards = new CardInHand[3];
        mixCards[0] = card0;
        mixCards[1] = card1;
        mixCards[2] = card2;
    }
}
