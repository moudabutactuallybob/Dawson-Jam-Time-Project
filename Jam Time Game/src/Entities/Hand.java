package Entities;

import Events.Game;

public class Hand {
    
    private CardArray hand;

    private final int MAX_SIZE;

    /**
     *
     * @param numOfPlayers
     */
    public Hand(int numOfPlayers) {

        this.MAX_SIZE = 32/numOfPlayers;    //to do: fix magic number

        this.hand = new CardArray(this.MAX_SIZE);

        for(int i = 0; i < this.MAX_SIZE; i++){
            Card randCard = Game.getDeck().getDeck().dealCard();
            this.hand.add(randCard);
        }
    }

    /**
     *
     * @return
     */
    public CardArray getHand() {
        return this.hand;
    }

    public String toString(){
        return "";
    }
}
