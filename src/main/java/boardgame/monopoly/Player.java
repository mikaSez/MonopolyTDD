package boardgame.monopoly;

/**
 * This class represents a player of a board game.
 */
public class Player {

    private int position;
    private int board;
    private long money;

    public Player(int boardSize){
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
}
