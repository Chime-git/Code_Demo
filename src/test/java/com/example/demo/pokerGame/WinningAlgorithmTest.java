package com.example.demo.pokerGame;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WinningAlgorithmTest {

    private final WinningAlgorithm winningAlgorithm = new WinningAlgorithm();

    @Test
    void includeOneThreeKindIsWin() {
        winningAlgorithm.setCards(includeThreeKindWinExample());
        Assertions.assertTrue(winningAlgorithm.isWinTheGame());
    }

    @Test
    void includeChaosCardsIsFail(){
        winningAlgorithm.setCards(includeChaosCardsFailedExample());
        Assertions.assertFalse( winningAlgorithm.isWinTheGame());
    }

    @Test
    void allAreStraightIsWin(){
        winningAlgorithm.setCards(allAreStraightWinExample());
        Assertions.assertTrue(winningAlgorithm.isWinTheGame());
    }
    @Test
    void includeChaosCardsIsWin(){
        winningAlgorithm.setCards(includeChaosWinExample());
        Assertions.assertTrue( winningAlgorithm.isWinTheGame());
    }

    private CardInHand[] allAreStraightWinExample() {
        CardInHand[] cards = new CardInHand[12];
        cards[0] = new CardInHand(10, Suits.SPADE    )  ;
        cards[1] = new CardInHand(11, Suits.DIAMOND  )  ;
        cards[2] = new CardInHand(12, Suits.HEART    )  ;

        cards[3] = new CardInHand(9, Suits.HEART  )  ;
        cards[4] = new CardInHand(10, Suits.HEART  )  ;
        cards[5] = new CardInHand(2, Suits.HEART  )  ;

        cards[6] = new CardInHand(3, Suits.HEART  )  ;
        cards[7] = new CardInHand(4, Suits.HEART  )  ;
        cards[8] = new CardInHand(5, Suits.HEART  )  ;

        cards[9] = new CardInHand(3, Suits.DIAMOND  )  ;
        cards[10] = new CardInHand(4, Suits.DIAMOND  )  ;
        cards[11] = new CardInHand(11, Suits.HEART  )  ;
        return cards;
    }

    private CardInHand[] includeChaosCardsFailedExample() {
        CardInHand[] cards = new CardInHand[12];
        cards[0] = new CardInHand(7, Suits.SPADE    )  ;
        cards[1] = new CardInHand(7, Suits.DIAMOND  )  ;
        cards[2] = new CardInHand(7, Suits.HEART    )  ;

        cards[3] = new CardInHand(9, Suits.HEART  )  ;
        cards[4] = new CardInHand(10, Suits.HEART  )  ;
        cards[5] = new CardInHand(6, Suits.HEART  )  ;

        cards[6] = new CardInHand(3, Suits.HEART  )  ;
        cards[7] = new CardInHand(4, Suits.HEART  )  ;
        cards[8] = new CardInHand(5, Suits.HEART  )  ;

        cards[9] = new CardInHand(3, Suits.DIAMOND  )  ;
        cards[10] = new CardInHand(4, Suits.DIAMOND  )  ;
        cards[11] = new CardInHand(11, Suits.DIAMOND  )  ;
        return cards;
    }
    private CardInHand[] includeThreeKindWinExample(){
        CardInHand[] cards = new CardInHand[12];
        cards[0] = new CardInHand(7, Suits.SPADE    )  ;
        cards[1] = new CardInHand(7, Suits.DIAMOND  )  ;
        cards[2] = new CardInHand(7, Suits.HEART    )  ;

        cards[3] = new CardInHand(9, Suits.HEART  )  ;
        cards[4] = new CardInHand(10, Suits.HEART  )  ;
        cards[5] = new CardInHand(5, Suits.HEART  )  ;

        cards[6] = new CardInHand(3, Suits.HEART  )  ;
        cards[7] = new CardInHand(4, Suits.HEART  )  ;
        cards[8] = new CardInHand(5, Suits.HEART  )  ;

        cards[9] = new CardInHand(3, Suits.DIAMOND  )  ;
        cards[10] = new CardInHand(4, Suits.DIAMOND  )  ;
        cards[11] = new CardInHand(11, Suits.DIAMOND  )  ;
        return cards;
    }

    private CardInHand[] includeChaosWinExample(){
        CardInHand[] cards = new CardInHand[12];
        cards[0] = new CardInHand(7, Suits.SPADE    )  ;
        cards[1] = new CardInHand(7, Suits.DIAMOND  )  ;
        cards[2] = new CardInHand(7, Suits.HEART    )  ;

        cards[3] = new CardInHand(8, Suits.HEART  )  ;
        cards[4] = new CardInHand(9, Suits.HEART  )  ;
        cards[5] = new CardInHand(5, Suits.HEART  )  ;

        cards[6] = new CardInHand(6, Suits.HEART  )  ;
        cards[7] = new CardInHand(4, Suits.HEART  )  ;
        cards[8] = new CardInHand(5, Suits.DIAMOND  )  ;

        cards[9] = new CardInHand(3, Suits.DIAMOND  )  ;
        cards[10] = new CardInHand(8, Suits.DIAMOND  )  ;
        cards[11] = new CardInHand(9, Suits.DIAMOND  )  ;
        return cards;
    }
}