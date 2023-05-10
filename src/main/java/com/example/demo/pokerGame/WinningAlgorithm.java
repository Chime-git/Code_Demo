package com.example.demo.pokerGame;

import com.example.demo.pokerGame.entity.CardInHand;

/**
 * Giving 12 cards which match <m*AAA+n*ABC, m+n=4> then win
 * AAA means three cards have the same number，Three of kind
 * ABC means straight
 * m or n can equal to 0
 * <p>
 * Using recursion to do this job
 */
public class WinningAlgorithm {

    private CardInHand[] cards;
    private int successMeldedCount = 0;

    private static final int FIXED_COUNT_OF_MELDED = 4;

    public boolean isWinTheGame() {
        return tryBuildAnThreeMeldedUnit(null);
    }


    private boolean tryBuildAnThreeMeldedUnit(MixCardsUnit lastSuccessMeldUnit) {
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
                MixCardsUnit newSuccessMeldedUnit = findThirdCardToMeld(j + 1, cards[i], cards[j]);
                if (newSuccessMeldedUnit == null) {
                    continue;
                }
                addMeldedCountForSuccess();
                setMeldedUnitForSuccess(newSuccessMeldedUnit);
                boolean recursionOneMoreMeld = tryBuildAnThreeMeldedUnit(newSuccessMeldedUnit);
                if (recursionOneMoreMeld) {
                    return true;
                }
            }
        }
        rollBackForFailedOneMoreMeldUnit(lastSuccessMeldUnit);
        return false;
    }

    private void rollBackForFailedOneMoreMeldUnit(MixCardsUnit lastSuccessMeldUnit) {
        rollBackMeldedCount();
        rollBackMeldedUnit(lastSuccessMeldUnit);
    }

    private void rollBackMeldedUnit(MixCardsUnit mixCardsUnit) {
        if (mixCardsUnit != null) {
            mixCardsUnit.setMixCardsAllNotMelded();
        }
    }

    private void setMeldedUnitForSuccess(MixCardsUnit successMeldedUnit) {
        successMeldedUnit.setMixCardsAllMelded();
    }

    private void rollBackMeldedCount() {
        successMeldedCount -= 1;
    }

    private MixCardsUnit findThirdCardToMeld(int startIndex, CardInHand card1, CardInHand card2) {
        for (int k = startIndex; k < cards.length; k++) {
            if (hasMeldedWithOthers(cards[k])) {
                continue;
            }
            MixCardsUnit mixThreeCards = new MixThreeCardsUnit(card1, card2, cards[k]);
            boolean successBeAnUnit = isSuccessBeMeldedUnit(mixThreeCards);
            if (successBeAnUnit) {
                return mixThreeCards;
            }
        }
        return null;
    }

    private void addMeldedCountForSuccess() {
        successMeldedCount += 1;
    }


    private boolean hasMeldedWithOthers(CardInHand card) {
        return card.isHasMelded();
    }

    private boolean isSuccessBeMeldedUnit(MixCardsUnit mix) {
        return mix.isStraightOrKind();
    }

    public void setCards(CardInHand[] cards) {
        this.cards = cards;
    }
}
