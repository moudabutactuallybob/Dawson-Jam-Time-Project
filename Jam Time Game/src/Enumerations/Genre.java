package Enumerations;

public enum Genre {
    ROCK(1, 3, 5, 2, 4, 1, 8, 6, 3),
    JAZZ(2, 2, 5, 3, 6, 1, 12, 6, 3),
    ELECTRONIC(3, 2, 6, 3, 5, 1, 8, 6, 3),
    CLASSICAL(4, 1, 4, 2, 6, 3, 12, 6, 2),
    METAL(5, 3, 5, 2, 4, 1, 8, 6, 4),
    ALTERNATIVE(6, 3, 5, 2, 6, 1, 10, 6, 2);

    private final int GENRE_ID;
    private final int GUITAR_POINTS;
    private final int DRUMS_POINTS;
    private final int BASS_POINTS;
    private final int KEYBOARD_POINTS;
    private final int STRING_IN_POINTS;
    private final int WIND_IN_POINTS;
    private final int JAM_TIME_POINTS;
    private final int PICK_MULTIPLIER;

    Genre(int genreId, int guitar, int drums, int bass, int keyboard, int stringIn, int wind, int jamTime, int pickMultiplier) {
        this.GENRE_ID = genreId;
        this.GUITAR_POINTS = guitar;
        this.DRUMS_POINTS = drums;
        this.BASS_POINTS = bass;
        this.KEYBOARD_POINTS = keyboard;
        this.STRING_IN_POINTS = stringIn;
        this.WIND_IN_POINTS = wind;
        this.JAM_TIME_POINTS = jamTime;
        this.PICK_MULTIPLIER = pickMultiplier;
    }

    public int getId() {
        return this.GENRE_ID;
    }

    public int getGUITAR_POINTS() {
        return this.GUITAR_POINTS;
    }
    public int getDRUMS_POINTS() {
        return this.DRUMS_POINTS;
    }
    public int getBASS_POINTS() {
        return this.BASS_POINTS;
    }
    public int getKEYBOARD_POINTS() {
        return this.KEYBOARD_POINTS;
    }
    public int getSTRING_IN_POINTS() {
        return this.STRING_IN_POINTS;
    }
    public int getWIND_IN_POINTS() {
        return this.WIND_IN_POINTS;
    }
    public int getJAM_TIME_POINTS() {
        return this.JAM_TIME_POINTS;
    }
    public int getPICK_MULTIPLIER() {
        return this.PICK_MULTIPLIER;
    }

    public Genre getGenre() {
        return this;
    }
}
