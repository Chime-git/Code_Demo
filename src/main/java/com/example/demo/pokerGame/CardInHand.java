package com.example.demo.pokerGame;

import lombok.Setter;

@Setter
public class CardInHand extends Card{


    private boolean hasMelded;

    public CardInHand(int number, Suits suit) {
        super(number, suit);
        this.hasMelded = false;
    }

    public boolean isHasMelded() {
        return hasMelded;
    }
    public void setHasMelded(boolean hasMelded) {
        this.hasMelded = hasMelded;
    }

}
