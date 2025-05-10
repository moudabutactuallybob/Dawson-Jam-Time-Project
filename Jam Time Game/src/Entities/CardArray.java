package Entities;

import Events.Round;

import java.util.Random;
import java.util.Scanner;

public class CardArray {
    private int size = 0;
    private int capacity = 10;
    private Card[] cards;

    private Scanner usrInput = new Scanner(System.in);

    public CardArray() {
        this.cards = new Card[capacity];
    }

    /**
     *
     * @param capacity
     */
    public CardArray(int capacity) {
        this.cards = new Card[capacity];
    }

    /**
     *
     * @param index
     * @return
     */
    public Card pickCard(int index) {
        while(true){
            try {
                Card card = cards[index];
                delete(cards[index]);

                return card;
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Please only entre a number on screen!");
                index = Round.validateCard(usrInput.nextLine());
            }
        }
    }

    /**
     *
     * @param card
     */
    public void add(Card card) {
        if (size >= capacity) {
            grow();
        }

        cards[size] = card;
        size++;
    }

    /**
     *
     * @param card
     * @param index
     */
    public void insert(Card card, int index) {
        if(size > capacity) {
            grow();
        }
        for (int i = size; i < index; i--) {
            cards[i] = cards[i - 1];
        }

        cards[index] = card;
        size++;
    }

    /**
     *
     * @param card
     */
    public void delete(Card card) {
        for (int i = 0; i < size; i++) {
            if (cards[i] == card) {
                for(int j = i + 1; j < (size - i - 1); j++){
                    cards[i] = cards[i + j + 1];
                }
                cards[size - 1] = null;
                size--;
                if(size <= (int) (capacity/3)){
                    shrink();
                }
                break;
            }
        }
    }

    /**
     *
     * @param card
     * @return
     */
    public int search(Card card) {
        for (int i = 0; i < size; i++) {
            if (cards[i] == card) {
                return i;
            }
        }
        return -1;
    }

    private void grow(){
        int newCapacity = capacity * 2;
        Card[] newCards = new Card[newCapacity];

        for (int i = 0; i < size; i++) {
            newCards[i] = cards[i];
        }
        capacity = newCapacity;
        cards = newCards;
    }

    private void shrink(){
        int newCapacity = capacity/2;
        Card[] newCards = new Card[newCapacity];

        for (int i = 0; i < size; i++) {
            newCards[i] = cards[i];
        }
        capacity = newCapacity;
        cards = newCards;
    }

    /**
     *
     * @return
     */
    public boolean isEmpty() {
        return this.size == 0;
    }

    public void shuffle() {
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            int index = rand.nextInt(size);
            Card temp = cards[index];
            cards[index] = cards[i];
            cards[i] = temp;
        }
    }

    /**
     *
     * @return
     */
    public Card dealCard(){
        try {
            Card temp = cards[size - 1];
            cards[size - 1] = null;
            size--;

            return temp;
        } catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException("Game is broken! [Trying to pick a card from an empty deck </3]");
        }
    }

    /**
     *
     * @param index
     * @return
     */
    public Card getCard(int index) {
        return this.cards[index];
    }

    /**
     *
     * @return
     */
    public String toString() {
        return "This card array exists";
    }

    /**
     *
     * @return
     */
    public int getRealLength() {
        int length = 0;
        for(Card card : cards){
            if(card != null){
                length++;
            }
        }
        return length;
    }

    /**
     *
     * @return
     */
    public Card[] getCards() {
        return cards;
    }
}
