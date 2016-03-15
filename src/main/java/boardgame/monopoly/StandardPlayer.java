package boardgame.monopoly;

/**
 * This class represents a player of a board game.
 */
public class StandardPlayer implements Player {

    private int position;
    private int board;
    private long money;

    public StandardPlayer(int boardSize){
        board = boardSize;
        money = 1500;

    }

    public boolean move(int nbCases) {
        boolean turned = false;
        int raw = position + nbCases;
        if(raw > board){
            raw = raw - board;
            position = raw;
            turned = true;
        } else {
            position += nbCases;
        }


        return turned;
    }

    public int getPosition() {
        return position;
    }

    public long getMoney() {
        return money;
    }

    /**
     * Deducts money from players portemonnaie
     * @return true : money is sufficient
     * @return false : money need to be lended
     * */
    public boolean deduct(long money) {
        this.money -= money;
        if(this.money >=0l){
            return true;
        }
        return false;
    }

    /**
     * Adds money to the player's current portemonnaie
     * */
    public void reward(long money) {
        this.money += money;
    }
}
