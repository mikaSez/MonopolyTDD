package mocks;

import boardgame.monopoly.Player;

/**
 *
 */
public class PlayerMock implements Player {
    public boolean move(int nbCases) {
        return false;
    }


    /**
     * this player has lost
     * */
    public boolean deduct(long money) {
        return false;
    }

    public void reward(long money) {

    }

    public int getPosition() {
        return 0;
    }
}
