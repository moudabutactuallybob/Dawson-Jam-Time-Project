package Printer;

import Entities.Card;
import Entities.Hand;
import Entities.Player;
import Enumerations.Color;
import Enumerations.Genre;
import Enumerations.Type;

public class Printer {
    public static final int NB_OF_LINES_PER_CARD = 12;

    /**
     *
     * @param strArrays
     * @return
     */
    public static String makeStr(String[][] strArrays){
        String str = "";
        for (String[] strArr : strArrays) {
            for (String line : strArr){
                str += line + "    ";
            }
            str += "\n";
        }
        return str;
    }

    public static void printTitle() {
        System.out.println("                                                                                                                      \n" +
                Color.MAGENTA_BOLD + "        ____        ____        ______  _______          _________________  ____      ______  _______        ______   \n" +
                "       |    |  ____|\\   \\      |      \\/       \\        /                 \\|    |    |      \\/       \\   ___|\\     \\  \n" +
                "       |    | /    /\\    \\    /          /\\     \\       \\______     ______/|    |   /          /\\     \\ |     \\     \\ \n" +
                "       |    ||    |  |    |  /     /\\   / /\\     |         \\( /    /  )/   |    |  /     /\\   / /\\     ||     ,_____/|\n" +
                " ____  |    ||    |__|    | /     /\\ \\_/ / /    /|          ' |   |   '    |    | /     /\\ \\_/ / /    /||     \\--'\\_|/\n" +
                "|    | |    ||    .--.    ||     |  \\|_|/ /    / |            |   |        |    ||     |  \\|_|/ /    / ||     /___/|  \n" +
                "|    | |    ||    |  |    ||     |       |    |  |           /   //        |    ||     |       |    |  ||     \\____|\\ \n" +
                "|\\____\\|____||____|  |____||\\____\\       |____|  /          /___//         |____||\\____\\       |____|  /|____ '     /|\n" +
                "| |    |    ||    |  |    || |    |      |    | /          |`   |          |    || |    |      |    | / |    /_____/ |\n" +
                " \\|____|____||____|  |____| \\|____|      |____|/           |____|          |____| \\|____|      |____|/  |____|     | /\n" +
                "    \\(   )/    \\(      )/      \\(          )/                \\(              \\(      \\(          )/       \\( |_____|/ \n" +
                "     '   '      '      '        '          '                  '               '       '          '         '    )/    \n" +
                "                                                                                                                '  "); //Fix inside later
    }

    /**
     *
     * @return
     */
    public static String getString() {
        String tempString = "";
        int tempInt = 1;
        for(Genre genre : Genre.values()) {
            tempString += genre.toString() + " " + tempInt + ";" + "\n";
            tempInt ++;
        }
        return tempString;
    }

    public static void printRules() {
        System.out.print(Color.RESET + "" + Color.WHITE_BOLD + "A musical take on Sushigo! Jam Time consists of a deck of 32 cards split over 3 hands for the duration of 3 rounds. \nEach player will get a deck and will have to decide to pick only ONE of the cards and swap hands with the next player. \nEach round is played until the hands are exhausted. After a round, all cards are discarded and put back into the deck except \"Jam Time\" \n(more on that in the section below). Each card in this game help you score points differently!\n\n" + Color.RESET);
    }

    /**
     *
     * @param hand
     */
    public static void displayHand(Hand hand){
        Card[] cards = hand.getHand().getCards();
        String cardsString = "";

        int cardIndex = 0;
        int MAX_IN_ROW = 5;
        int LAST_ROW = cards.length%MAX_IN_ROW;

        if((hand.getHand().getRealLength()) > 1){
            for (int row = 0; row < cards.length / MAX_IN_ROW; row++) {
                for (int index = 0; index < NB_OF_LINES_PER_CARD; index++) {
                    for (int j = 0; j < MAX_IN_ROW; j++) {
                        if (cards[j] != null) {

                            if (cards[cardIndex + j] != null) {
                                cardsString += cards[cardIndex + j].getCardType().getDrawCard()[index]; //="" or null?
                                cardsString += "    ";
                            }
                        }
                    }
                    cardsString += "\n";
                }
                cardIndex += MAX_IN_ROW;
                cardsString += "\n";
            }
        } else {
            for (int index = 0; index < NB_OF_LINES_PER_CARD; index++) {
                    if (cards[0] != null){
                        cardsString += cards[0].getCardType().getDrawCard()[index]; //="" or null?
                    }
                    cardsString += "\n";
            }
        }


        System.out.println(cardsString);
    }

    /**
     *
     * @param points
     * @param jam
     * @param player
     */
    public static void printStats(int points, int jam, Player player){
        System.out.println(Color.RED_BRIGHT + player.getPlayerName() + ", your score is: " + points + "\n" + "You have " + jam + " Jam Time!" + Color.RESET);
    }

    public static void printWinner(Player winner){
        System.out.println(Color.GREEN_BOLD_BRIGHT +  "__      ___                     _ \n" +
                " \\ \\    / (_)_ _  _ _  ___ _ _  (_)\n" +
                "  \\ \\/\\/ /| | ' \\| ' \\/ -_) '_|  _ " + "       " + winner.getPlayerName() + "\n" +
                "   \\_/\\_/ |_|_||_|_||_\\___|_|   (_)\n" +
                "                                   " + Color.RESET);
    }

    public static void printEnd(){
        System.out.println(Color.RESET + "" + Color.MAGENTA_BOLD_BRIGHT + "       _                 _                                ___                     _              _             _ \n" +
                "   _  | |               | |                              / __)                   | |            (_)           | |\n" +
                " _| |_| |__  _____ ____ | |  _    _   _  ___  _   _    _| |__ ___   ____    ____ | | _____ _   _ _ ____   ____| |\n" +
                "(_   _)  _ \\(____ |  _ \\| |_/ )  | | | |/ _ \\| | | |  (_   __) _ \\ / ___)  |  _ \\| |(____ | | | | |  _ \\ / _  |_|\n" +
                "  | |_| | | / ___ | | | |  _ (   | |_| | |_| | |_| |    | | | |_| | |      | |_| | |/ ___ | |_| | | | | ( (_| |_ \n" +
                "   \\__)_| |_\\_____|_| |_|_| \\_)   \\__  |\\___/|____/     |_|  \\___/|_|      |  __/ \\_)_____|\\__  |_|_| |_|\\___ |_|\n" +
                "                                 (____/                                    |_|            (____/        (_____|  ");
    }
}


