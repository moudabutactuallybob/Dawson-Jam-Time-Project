package Events;

import Entities.Card;
import Entities.Hand;
import Entities.Player;
import Enumerations.Type;
import Printer.Printer;

import Enumerations.Color;

import java.util.Scanner;

public class Round {
    private static Player[] players;
    private static int round = 1;

    private static Player currentPlayer;
    private static Hand[] hands;

    private static Scanner usrInput = new Scanner(System.in);

    /**
     *
     * @param currentPlayers
     */
    public static void runRound(Player[] currentPlayers) {
        players = currentPlayers;

        System.out.println("Round " + round);

        System.out.println(players.length);

        hands = new Hand[players.length];

        for(int i = 0; i < players.length; i++) {
            hands[i] = new Hand(players.length);
        }

        while (!(hands[0].getHand().isEmpty())){
            for (int i = 0; i < players.length; i++) {
                currentPlayer = players[i];

                if(i > 0){
                    currentPlayer.swapHands(hands[i - 1]);
                } else {
                    currentPlayer.swapHands(hands[hands.length - 1]);
                }

                Printer.displayHand(currentPlayer.getCurrentHand());
                System.out.println(Color.WHITE_BOLD + currentPlayer.getPlayerName() + Color.CYAN_UNDERLINED + "\n" + "Select one of the cards above" + Color.RESET);

                int pickedCardId = validateCard(usrInput.nextLine());
                Card pickedCard = chooseCard(currentPlayer, pickedCardId);

                if (pickedCard.getCardType() == Type.JAM_TIME) {
                    currentPlayer.addJamTime();
                    hands[i].getHand().delete(pickedCard);
                    System.out.println(Color.RED + "You invested in Jam time!" + Color.RESET);
                } else {
                    currentPlayer.getTable().placeCard(pickedCard);
                    System.out.println(Color.RED_BRIGHT + "Card added to table: " + pickedCard.getCardType() + Color.RESET);
                }
            }
        }

        for (int i = 0; i < players.length; i++) {
            currentPlayer = players[i];

            int points = currentPlayer.addPoints();
            int jamTime = currentPlayer.getJamTime();

            Printer.printStats(points, jamTime, currentPlayer);

            currentPlayer.clearTable();
        }


        round++;
    }

    /**
     *
     * @param card
     * @return
     */
    public static int validateCard(String card) {
        while (true) {
            try {
                int cardIndex = Integer.parseInt(card);
                if(cardIndex >= 0 || cardIndex <= currentPlayer.getCurrentHand().getHand().getRealLength()) {
                    return cardIndex - 1;
                }   else{
                    throw new IllegalArgumentException();
                }
            } catch(NumberFormatException e){
                System.out.println("Not a number! Try again.");
                card = usrInput.nextLine();
            } catch (IllegalStateException e) {
                System.out.println("Please enter a valid number");
                card = usrInput.nextLine();
            }
        }
    }

    /**
     *
     * @param player
     * @param index
     * @return
     */
    public static Card chooseCard(Player player, int index){
        Card pickedCard = player.getCurrentHand().getHand().pickCard(index);

        return pickedCard;
    }
}
