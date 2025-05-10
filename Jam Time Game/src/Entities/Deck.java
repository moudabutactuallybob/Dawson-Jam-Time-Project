package Entities;

import Enumerations.Type;

public class Deck {
    private CardArray deck;
    private int DECK_SIZE;

    public void makeDeck(){
        int count = 0;
        for(Type type : Enumerations.Type.values()){
            count++;
        }

        DECK_SIZE = count*4;

        deck = new CardArray(DECK_SIZE);

        for(int i = 0; i<DECK_SIZE/count; i++){
            for (Type type : Enumerations.Type.values()) {
                deck.add(new Card(type));
            }
        }

        deck.shuffle();
    }

    /**
     *
     * @param playerCount
     * @return
     */
    public CardArray dealHand(int playerCount){
        int cardsPerHand = DECK_SIZE/playerCount;
        CardArray hand = new CardArray(cardsPerHand);

        for(int i = 0; i < cardsPerHand; i++){
            hand.add(deck.dealCard());
        }
        return hand;
    }

    /**
     *
     * @return
     */
    public CardArray getDeck(){
        return deck;
    }
}
