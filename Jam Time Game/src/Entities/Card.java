package Entities;

import Enumerations.Type;

public class Card {

    private Type cardType;

    /**
     *
     * @param card
     */
    Card(Type card) {
        this.cardType = card;
    }

    public Type getCardType() {
        return cardType;
    }

}
