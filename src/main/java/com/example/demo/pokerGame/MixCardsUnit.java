package com.example.demo.pokerGame;

public abstract class MixCardsUnit {

    protected CardInHand[] mixCards;

    protected Comparator comparator;


    protected void setMixCardsAllMelded() {
        setMixCardsMeldedStatus(true);
    }

    protected void setMixCardsAllNotMelded() {
        setMixCardsMeldedStatus(false);
    }

    private void setMixCardsMeldedStatus(boolean isMelded) {
        for (CardInHand mixCard : mixCards) {
            mixCard.setHasMelded(isMelded);
        }
    }

    public boolean isStraightOrKind() {
        bubbleAscending();
        boolean isStraight = isStraight();
        boolean isKind = isKind();
        return isStraight || isKind;
    }

    private void bubbleAscending() {
        int n = mixCards.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                boolean isPreBiggerThanNext = comparator.isPreBiggerThanNext(mixCards[j], mixCards[j + 1]);
                if (isPreBiggerThanNext) {
                    CardInHand temp = mixCards[j];
                    mixCards[j] = mixCards[j + 1];
                    mixCards[j + 1] = temp;
                }
            }
        }
    }

    private boolean isKind() {
        for (int i = 0; i < mixCards.length - 1; i++) {
            boolean isSameKind = comparator.isEqual(mixCards[i], mixCards[i + 1]);
            if (!isSameKind) {
                return false;
            }
        }
        return true;
    }

    private boolean isStraight() {
        for (int i = 0; i < mixCards.length - 1; i++) {
            boolean isAdjacent = comparator.isAscendingAdjacent(mixCards[i], mixCards[i + 1]);
            if (!isAdjacent) {
                return false;
            }
        }
        return true;
    }

}
