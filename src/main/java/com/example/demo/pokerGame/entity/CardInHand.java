package com.example.demo.pokerGame.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CardInHand extends Card {

    private boolean hasMelded;

    public CardInHand(int number, Suits suit) {
        super(number, suit);
    }
}
