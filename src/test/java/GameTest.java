import boardgame.monopoly.Game;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by MikaSez on 15/03/2016.
 */
public class GameTest {

    Game game;

    @Before
    public void setUp(){
        game = new Game(2, 11);
    }
    @Test
    public void playerCreation(){
        game = new Game(2, 11);
        int players = game.getPlayerCount();
        Assert.assertEquals(2, players);
    }

    @Test
    public void playerCurrentPlayer(){
        int one = game.getCurrentPlayerId();
        Assert.assertEquals(1, one);
    }

    @Test
    public void turns(){
        game.nextPlayer();
        int current = game.getCurrentPlayerId();
        Assert.assertEquals(2, current);
    }

    @Test
    public void playersTurns(){
        game.nextPlayer();
        game.nextPlayer();
        int current = game.getCurrentPlayerId();
        Assert.assertEquals(1, current);
    }

    @Test
    public void playerHavePosition(){
        int pos = game.getPosition();

        Assert.assertEquals(0, pos);
    }

    @Test
    public void playerCanMove(){
        game.movePlayer(5);
        int pos   = game.getPosition();
        Assert.assertEquals(5, pos);
    }



}



