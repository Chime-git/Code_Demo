package com.example.demo.pokerGame.controller;

import com.example.demo.pokerGame.WinningAlgorithm;
import com.example.demo.pokerGame.entity.CardInHand;
import com.example.demo.pokerGame.entity.Suits;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController()
@RequestMapping("/game")
public class GameController {

    @GetMapping("/win")
    public String includeChaosCardsIsWin(){
        WinningAlgorithm one = new WinningAlgorithm();
        CardInHand[] cards = includeChaosWinExample();
        one.setCards(cards);
        boolean isWin = one.isWinTheGame();
        String result = isWin?"WIN":"FAIL";
        return Arrays.toString(cards) + "/n this array is " + result +" the game";
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
