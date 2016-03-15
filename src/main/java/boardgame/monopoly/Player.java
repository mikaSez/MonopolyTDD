package boardgame.monopoly;

/**
 * Created by MikaSez on 15/03/2016.
 */
public interface Player {
    boolean move(int nbCases);

    boolean deduct(long money);

    void reward(long money);

    int getPosition();
}
