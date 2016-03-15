import boardgame.monopoly.Player;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by MikaSez on 15/03/2016.
 */
public class PlayerTest {

    private Player player;


    @Before
    public void setUp(){
        player = new Player(10);
    }


    @Test
    public void playerStartsAtZero(){
        int pos = player.getPosition();
        Assert.assertEquals(0, pos);
    }

    @Test
    public void playerMoves(){
        player.move(5);
        int pos = player.getPosition();
        Assert.assertEquals(5, pos);
    }

    @Test
    public void playerTurnsOnBoardLimits(){
        player.move(11);
        int pos = player.getPosition();
        Assert.assertEquals(1, pos);
    }

   @Test
    public void playerTellsWennTurns(){
       boolean noTurn = player.move(4);
       boolean turn = player.move(11);

       Assert.assertFalse(noTurn);
       Assert.assertTrue(turn);
   }

    @Test
    public void playerStartMoney(){
        long money = player.getMoney();
        Assert.assertEquals(1500, money);
    }



}
