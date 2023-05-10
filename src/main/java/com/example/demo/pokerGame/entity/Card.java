package com.example.demo.pokerGame.entity;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Card {
    private final int number;
    private final Suits suit;

    public Card(int number, Suits suit) {
        this.number = number;
        this.suit = suit;
    }
}
