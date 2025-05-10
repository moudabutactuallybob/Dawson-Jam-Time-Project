package Events;

import Entities.Deck;
import Entities.Hand;
import Entities.Player;
import Entities.Table;
import Enumerations.Color;
import Enumerations.Genre;
import Rules.RuleSetConfig;
import Printer.Printer;

import java.util.Scanner;

public class Game {
    private static RuleSetConfig ruleConfig;
    private static Player[] players = new Player[]{};
    private static Deck deck = new Deck();

    /**
     *
     * @param ruleSetId
     */
    public static void GetRulesFromId(int ruleSetId) {
        RuleSetConfig rules = null;

        checkRules(ruleSetId);
        while(true) {
            for (Genre ruleSet : Genre.values()) {
                if(ruleSet.getId() == ruleSetId) {
                    rules = new RuleSetConfig(ruleSet);
                    ruleConfig = rules;
                    return;
                }
            }
        }
    }

    public static RuleSetConfig getRuleConfig() {
        return ruleConfig;
    }

    /**
     *
     * @param nbOfPlayers
     * @return
     */
    public static int checkNbOfPlayers(int nbOfPlayers){
        Scanner usrInput = new Scanner(System.in);
        while(true){
            try {
                if(nbOfPlayers < 3) {
                    throw new Exception();
                }
                return nbOfPlayers;
            } catch (Exception e) {
                System.out.println("Try again! This is a game for 3 players or more:");
                nbOfPlayers = Integer.parseInt(usrInput.nextLine());
            }
        }
    }

    /**
     *
     * @param rStId
     */
    public static void checkRules(int rStId){
        Scanner usrInput = new Scanner(System.in);
        while(true){
            try {
                if(rStId >= 0 && rStId <= 6) {
                    return;
                }
                throw new Exception();
            } catch(Exception e) {
                System.out.println("Try again! Invalid rule input, please try again:");
                rStId = Integer.parseInt(usrInput.nextLine());
            }
        }
    }

    /**
     *
     * @param nbOfPlayers
     */
    public static void createPlayers(int nbOfPlayers) {
        Scanner usrInput = new Scanner(System.in);
        // Validate user input
        nbOfPlayers = checkNbOfPlayers(nbOfPlayers);

        players = new Player[nbOfPlayers];

        for (int i = 0; i < nbOfPlayers; i++) {
            System.out.println("Input player " + (i + 1) + "'s name: ");
            Table table = new Table(10);
            players[i] = new Player(usrInput.nextLine(), table);
        }
    }

    public static void runGame() {
        System.out.println(Color.BLACK_BOLD + "" + Color.WHITE_BACKGROUND +  "GAME STARTED!" + Color.RESET);


        for(int i = 0; i < 3; i++) {
            deck.makeDeck();
            Round.runRound(players);
        }
        Player temp = players[0];

        for(int i = 0; i < players.length; i++) {
            if (players[i].getJamTime() > temp.addJamTime()){
                temp = players[i];
            }
        }

        temp.reward();

        for(int i = 0; i < players.length; i++) {
            if (players[i].getJamTime() < temp.addJamTime()){
                temp = players[i];
            }
        }

        temp.penalize();

        for(int i = 0; i < players.length; i++) {
            if (players[i].getScore() > temp.addJamTime()){
                temp = players[i];
            }
        }

        Printer.printWinner(temp);
    }

    public static Deck getDeck() {
        return deck;
    }
}

