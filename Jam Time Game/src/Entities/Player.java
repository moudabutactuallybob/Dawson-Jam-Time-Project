package Entities;

public class Player{
    private int jamTime = 0;
    private Table table;

    private int score;

    private String playerName;

    private Hand currentHand;

    /**
     *
     * @param name
     * @param table
     */
    public Player(String name, Table table){
        this.playerName = name;
        this.table = table;
    }

    /**
     *
     * @return
     */
    public int addPoints(){
        score += table.countPoints();
        return score;
    }

    /**
     *
     * @return
     */
    public int addJamTime(){
        jamTime ++;

        return jamTime;
    }

    /**
     *
     * @return
     */
    public int getJamTime(){
        return jamTime;
    }

    /**
     *
     * @return
     */
    public int getScore(){
        return score;
    }

    /**
     *
     * @return
     */
    public Table getTable(){
        return table;
    }

    /**
     *
     * @param newHand
     * @return
     */
    public Hand swapHands(Hand newHand){
        Hand tempHand = this.currentHand;
        this.currentHand = newHand;

        return tempHand;
    }

    public void clearTable(){
        this.table = new Table(10);
    }

    /**
     *
     * @return
     */
    public Hand getCurrentHand(){
        return this.currentHand;
    }

    /**
     *
     * @return
     */
    public String getPlayerName(){ return playerName; }

    public void reward(){
        score += 6;
    }

    public void penalize(){
        score -= 6;
    }

    /**
     *
     * @return
     */
    public String toString(){
        String str = "";
        return str;
    }
}