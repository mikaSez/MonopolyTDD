package boardgame.monopoly;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MikaSez on 15/03/2016.
 */
public class Game {
    private List<Player> players;
    private Player currentPlayer;
    private int currentPlayerId;

    public Game(int nbPlayers, int boardSize) {
        players = new ArrayList<Player>(nbPlayers);
        currentPlayerId = 0;
        for(int i=0; i<nbPlayers; i++){
            players.add(new Player(boardSize));
        }
        currentPlayer = players.get(currentPlayerId);

    }

    public int getPlayerCount() {
        return players.size();
    }


    public void nextPlayer() {
        if(getCurrentPlayerId() == players.size()){
            currentPlayerId = 0;
            currentPlayer = players.get(currentPlayerId);
        }else {
            currentPlayer = players.get(++currentPlayerId);
        }
    }


    public int getPosition() {
        return currentPlayer.getPosition();
    }

    public void movePlayer(int nbCases) {
        currentPlayer.move(nbCases);
    }

    public int getCurrentPlayerId() {
        return currentPlayerId+1;
    }
}

