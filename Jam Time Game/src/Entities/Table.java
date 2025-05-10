package Entities;

import Enumerations.Type;
import Events.Game;
import Rules.RuleSetConfig;

import java.util.Scanner;
public class Table {
    private int picks = 0;
    private Card[] playerSet;

    /**
     *
     * @param length
     */
    public Table(int length) {
        this.playerSet = new Card[length];
    }

    /**
     *
     * @return
     */
    public int countPoints() {
        int points = 0;
        for (int i = 0; i < playerSet.length; i++) {
            if(playerSet[i] != null) {
                if (playerSet[i].getCardType().isCompatibleWithPick() && picks > 0) {
                    points += Game.getRuleConfig().getPoints(playerSet[i].getCardType()) * Game.getRuleConfig().getPoints(Type.GUITAR_PICK);
                } else {
                    points += Game.getRuleConfig().getPoints(playerSet[i].getCardType());
                }
            }
        }
        return points;
    }

    /**
     *
     * @param card
     */
    public void placeCard(Card card) {
        for (int i = 0; i < playerSet.length; i++) {
            if(playerSet[i] == null && card.getCardType() != Type.GUITAR_PICK && card.getCardType() != Type.JAM_TIME) {
                playerSet[i] = card;
                i = playerSet.length;
            } else if(playerSet[i] == null && card.getCardType() == Type.GUITAR_PICK) {
                this.picks++;
                i = playerSet.length;
            }
        }
    }
}
