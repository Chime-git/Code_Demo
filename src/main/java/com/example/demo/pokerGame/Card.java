package com.example.demo.pokerGame;

import lombok.Getter;

@Getter
public class Card {
    private final int number;
    private final Suits suit;

    public Card(int number, Suits suit) {
        this.number = number;
        this.suit = suit;
    }
}
