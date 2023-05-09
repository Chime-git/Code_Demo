package com.example.demo.pokerGame;

/**
 * Giving 12 cards which match <m*AAA+n*ABC, m+n=4> then win
 * AAA means three cards have the same number，Three of kind
 * ABC means straight
 * m or n can equal to 0
 *
 * using recursion to do this job
 */
public class WinningAlgorithm {

    private CardInHand[] cards;
    private static final int FIXED_COUNT_OF_MELDED = 4;


    private int successMeldedCount = 0;

    public boolean isWinTheGame() {
        return tryBuildAnTripleMeldUnit( null);
    }


    private boolean tryBuildAnTripleMeldUnit(MixCardsUnit lastSuccessMeldUnit) {
        if (successMeldedCount == FIXED_COUNT_OF_MELDED) {
            return true;
        }
        for (int i = 0; i < cards.length; i++) {
            if (hasMeldedWithOthers(cards[i])) {
                continue;
            }
            for (int j = i + 1; j < cards.length; j++) {
                if (hasMeldedWithOthers(cards[j])) {
                    continue;
                }
                MixCardsUnit thisSuccessMeldedUnit = findThirdCardToMeld(j+1, cards[i], cards[j]);
                if (thisSuccessMeldedUnit == null){
                    continue;
                }
                setAfterSuccessMelded(thisSuccessMeldedUnit);
                boolean  recursionOneMoreMeld  = tryBuildAnTripleMeldUnit(thisSuccessMeldedUnit);
                if (recursionOneMoreMeld){
                    return true;
                }
            }
        }
        rollBackAfterFailedMelded(lastSuccessMeldUnit);
        return false;
    }

    private void rollBackAfterFailedMelded(MixCardsUnit lastSuccessMeldUnit){
        successMeldedCount -= 1;
        if (lastSuccessMeldUnit != null){
            lastSuccessMeldUnit.setMixCardsAllNotMelded();
        }
    }

    private MixCardsUnit findThirdCardToMeld(int startIndex, CardInHand firstCard, CardInHand secondCard){
        for (int k = startIndex; k < cards.length; k++) {
            if (hasMeldedWithOthers(cards[k])) {
                continue;
            }
            MixCardsUnit mixThreeCards = new MixThreeCardsUnit(firstCard, secondCard, cards[k]);
            boolean isSuccessBeAnUnit = isSuccessBeAnUnit(mixThreeCards);
            if (isSuccessBeAnUnit) {
                return mixThreeCards;
            }
        }
        return null;
    }

    private void setAfterSuccessMelded(MixCardsUnit melded){
        successMeldedCount += 1;
        melded.setMixCardsAllMelded();
    }


    private boolean hasMeldedWithOthers(CardInHand card) {
        return card.isHasMelded();
    }

    private boolean isSuccessBeAnUnit(MixCardsUnit mix) {
        return mix.isStraightOrKind();
    }

    public void setCards(CardInHand[] cards) {
        this.cards = cards;
    }
}
