package Enumerations;

public enum Type {
    GUITAR(
        1,
        true,
        3, "single",
            Color.YELLOW_BOLD + " _______________ ." +
                    Color.YELLOW_BOLD + "/ S             \\." +
                    Color.YELLOW_BOLD + "|      '&`      |." +
                    Color.YELLOW_BOLD + "|       #       |." +
                    Color.YELLOW_BOLD + "|       #       |." +
                    Color.YELLOW_BOLD + "|      _#_      |." +
                    Color.YELLOW_BOLD + "|     ( # )     |." +
                    Color.YELLOW_BOLD + "|     / 0 \\     |." +
                    Color.YELLOW_BOLD + "|    ( === )    |." +
                    Color.YELLOW_BOLD + "|     `---'     |." +
                    Color.YELLOW_BOLD + "|               |." +
                    Color.YELLOW_BOLD + "\\____GUITAR ____/." + Color.RESET
    ),
    DRUMS(
        2,
        false,
        -1, "pair_only",
            Color.BLACK_BRIGHT + " _______________ ." +
                    Color.BLACK_BRIGHT + "/ P             \\." +
                    Color.BLACK_BRIGHT + "|               |." +
                    Color.BLACK_BRIGHT + "|               |." +
                    Color.BLACK_BRIGHT + "|-^-_  _        |." +
                    Color.BLACK_BRIGHT + "|  / [_][_]_:_  |." +
                    Color.BLACK_BRIGHT + "| /|  _||_  v   |." +
                    Color.BLACK_BRIGHT + "|  | /    \\ |   |." +
                    Color.BLACK_BRIGHT + "|=/=\\\\____//=\\= |." +
                    Color.BLACK_BRIGHT + "|               |." +
                    Color.BLACK_BRIGHT + "|               |." +
                    Color.BLACK_BRIGHT + "\\_____DRUMS_____/." + Color.RESET
        ),
    BASS(
        3,
        true, 
        1, "single",
            Color.MAGENTA_BOLD + " _______________ ." +
                    Color.MAGENTA_BOLD + "/ S             \\." +
                    Color.MAGENTA_BOLD + "|      _        |." +
                    Color.MAGENTA_BOLD + "|    /   )      |." +
                    Color.MAGENTA_BOLD + "|    @| ?\\      |." +
                    Color.MAGENTA_BOLD + "|    @| ?\\\\     |." +
                    Color.MAGENTA_BOLD + "|    @| ?\\\\\\    |." +
                    Color.MAGENTA_BOLD + "|    @| ?\\\\\\\\   |." +
                    Color.MAGENTA_BOLD + "|     -- ====   |." +
                    Color.MAGENTA_BOLD + "|      ||\\ \\\\\\  |." +
                    Color.MAGENTA_BOLD + "|       | \\ \\\\\\ |." +
                    Color.MAGENTA_BOLD + "\\_____BASS______/." + Color.RESET
        ),
    KEYBOARD(
        4,
        false,
        2, "most",
            Color.BLUE_BOLD + " _______________ ." +
                    Color.BLUE_BOLD + "/ K             \\." +
                    Color.BLUE_BOLD + "|   __          |." +
                    Color.BLUE_BOLD + "|  |--|      __ |." +
                    Color.BLUE_BOLD + "|  |  |     |~' |." +
                    Color.BLUE_BOLD + "| () ()     |   |." +
                    Color.BLUE_BOLD + "|      |\\  ()   |." +
                    Color.BLUE_BOLD + "|      | \\      |." +
                    Color.BLUE_BOLD + "|    ()   |     |." +
                    Color.BLUE_BOLD + "|         |     |." +
                    Color.BLUE_BOLD + "|       ()      |." +
                    Color.BLUE_BOLD + "\\____KEYBOARD___/." + Color.RESET
        ), 
    STRING_IN(
        5,
        true, 
        4, "single",
            Color.YELLOW_BRIGHT + " _______________ ." +
                    Color.YELLOW_BRIGHT + "/ S          4* \\." +
                    Color.YELLOW_BRIGHT + "|               |." +
                    Color.YELLOW_BRIGHT + "|     ||        |." +
                    Color.YELLOW_BRIGHT + "|    _||_       |." +
                    Color.YELLOW_BRIGHT + "|   ' || `     ~|." +
                    Color.YELLOW_BRIGHT + "|   ) || (    //|." +
                    Color.YELLOW_BRIGHT + "|   _)::(_   // |." +
                    Color.YELLOW_BRIGHT + "|   ) || (  //  |." +
                    Color.YELLOW_BRIGHT + "|  (  \\/  )//   |." +
                    Color.YELLOW_BRIGHT + "|   `-,,-'/'    |." +
                    Color.YELLOW_BRIGHT + "\\____STRINGS____/." + Color.RESET
        ),
    WIND_IN(
        6,
        false, 
        3,"trinomial",
            Color.WHITE_BOLD + " _______________ ." +
                    Color.WHITE_BOLD + "/ W          5* \\." +
                    Color.WHITE_BOLD + "|               |." +
                    Color.WHITE_BOLD + "|               |." +
                    Color.WHITE_BOLD + "|    ___0~      |." +
                    Color.WHITE_BOLD + "|     \\ \\/      |." +
                    Color.WHITE_BOLD + "|       |       |." +
                    Color.WHITE_BOLD + "|      / \\      |." +
                    Color.WHITE_BOLD + "|      \\  \\     |." +
                    Color.WHITE_BOLD + "|      ~  ~     |." +
                    Color.WHITE_BOLD + "|               |." +
                    Color.WHITE_BOLD + "\\_____WINDS_____/." + Color.RESET
        ),
    JAM_TIME(
        7,
        false, -1, "endgame_most",
            Color.GREEN_BOLD + " _______________ ." +
                    Color.GREEN_BOLD + "/ W          5* \\." +
                    Color.GREEN_BOLD + "|               |." +
                    Color.GREEN_BOLD + "|               |." +
                    Color.GREEN_BOLD + "|               |." +
                    Color.GREEN_BOLD + "|      +6       |." +
                    Color.GREEN_BOLD + "|     TIME      |." +
                    Color.GREEN_BOLD + "|               |." +
                    Color.GREEN_BOLD + "|               |." +
                    Color.GREEN_BOLD + "|               |." +
                    Color.GREEN_BOLD + "|               |." +
                    Color.GREEN_BOLD + "\\___JAM TIME!___/." + Color.RESET
    ),
    GUITAR_PICK(
        8,
        false, 
        4, "pick",
            Color.RED_BOLD + " _______________ ." +
                    Color.RED_BOLD + "/ R          5* \\." +
                    Color.RED_BOLD + "|               |." +
                    Color.RED_BOLD + "|               |." +
                    Color.RED_BOLD + "|   --------,   |." +
                    Color.RED_BOLD + "| (  Dunlop  )) |." +
                    Color.RED_BOLD + "|  \\  U,S,A //  |." +
                    Color.RED_BOLD + "|   \\1,14mm//   |." +
                    Color.RED_BOLD + "|    \\    //    |." +
                    Color.RED_BOLD + "|      ``       |." +
                    Color.RED_BOLD + "|               |." +
                    Color.RED_BOLD + "\\_____PICK _____/." + Color.RESET
        );

    private final int CARD_ID;
    private final boolean PICK_COMP; //indicates pick compatibility
    private final int MAX_PER_SET;
    private final String POINTING_SYS;
    private final String[] DRAW_CARD;

    private final int CARD_HEIGHT = 11;

    Type(int cardId, boolean pickComp, int maxPerSet, String pointing, String drawCard) {
        this.CARD_ID = cardId;
        this.PICK_COMP = pickComp;
        this.MAX_PER_SET = maxPerSet;
        this.POINTING_SYS = pointing;
        this.DRAW_CARD = cardStrArr(drawCard);

        //Initialize points depending on genre
        //Genre ruleSet = getGenre();
    }

    private String[] cardStrArr(String drawCard){
        String[] card = drawCard.split("\\.");

        return card;
    }

    public int getId() {
        return this.CARD_ID;
    }

    public boolean isCompatibleWithPick() {
        return this.PICK_COMP;
    }

    public int getMax() {
        return this.MAX_PER_SET;
    }

    public Type getType() {
        return this;
    }

    public String[] getDrawCard() {
        return this.DRAW_CARD;
    }

    public String toString() {
        String[] strArr = {
            "Guitar",
            "Drums",
            "Bass",
            "Keyboard",
            "String instrument",
            "Wind instrument",
            "Jam time",
            "Guitar pick",
        };

        return strArr[this.CARD_ID - 1];
    }
}
