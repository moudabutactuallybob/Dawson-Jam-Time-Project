package Events;

import Entities.Player;
import Enumerations.Color;
import Printer.Printer;
import Rules.RuleSetConfig;
import Printer.Printer;

import java.util.Scanner;

public class Menu {
    /**
     *
     * @param usrInput
     * @return
     */
    public static int getMenu(Scanner usrInput) {
        Scanner userInput = new Scanner(System.in);
        String menuString = "";
        int menu;
        while (true) {
            try {
                menuString = usrInput.nextLine();
                menu = Integer.parseInt(menuString);
                break;
            } catch (NumberFormatException e) {
                if(!menuString.equals("R")){
                    System.out.println("Invalid input");
                } else {
                    return 3;
                }
            }
        }
        return menu;
    }

    /**
     *
     * @param menu
     * @param usrInput
     * @return
     */
    public static boolean checkMenuInput(int menu, Scanner usrInput) {
        while (true) {
            try {
                if (menu == 1) {
                    return false;
                } else if (menu == 2) {
                    return true;
                } else if (menu == 3) {
                    Printer.printRules();
                    System.out.println(Color.RESET + "1 to start a game \n2 to exit");
                    menu = Integer.parseInt(usrInput.nextLine());
                } else {
                    throw new IllegalArgumentException();
                }
            } catch (IllegalArgumentException e) {
                System.out.println(Color.RESET + "Invalid menu selection, please try again");
                menu = Integer.parseInt(usrInput.nextLine());
            }
            System.out.println("Input 1 to START game\n2 to EXIT");
        }
    }

    /**
     *
     */
    public static void runMenu() {
        Scanner usrInput = new Scanner(System.in);
        int ruleSetId;
        int NbOfPlayer;
        RuleSetConfig rules;

        Printer.printTitle();

        //Choose between show rules and start game
        System.out.println(Color.CYAN_UNDERLINED + "Start Game: 1\nCheck Rules: 3\nExit Game: 2"); //Fix with ascii later
        int menu = 0;
        menu = Menu.getMenu(usrInput);

        if (Menu.checkMenuInput(menu, usrInput)) return;

        System.out.println("Input how many players would like to play: ");
        while(true) {
            String temp = usrInput.nextLine();
            try {
                Game.createPlayers(Integer.parseInt(temp));
                break;
            } catch (NumberFormatException e) {
                System.out.println(Color.RESET + "Please enter a valid number");
            }
        }

        String tempString = Printer.getString();

        System.out.println("Choose a genre as a rule set. Input value corresponding to the genre desired:\n" + tempString);

        while(true){
            try {
                ruleSetId = Integer.parseInt(usrInput.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println(Color.RESET + "Please enter a valid number");
            }
        }

        Game.GetRulesFromId(ruleSetId);

        Game.runGame();
    }
}
