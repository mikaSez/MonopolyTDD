import boardgame.monopoly.StandardPlayer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by MikaSez on 15/03/2016.
 */
public class PlayerTest {

    private StandardPlayer player;


    @Before
    public void setUp(){
        player = new StandardPlayer(10);
    }


    @Test
    public void startsAtZero(){
        int pos = player.getPosition();
        Assert.assertEquals(0, pos);
    }

    @Test
    public void moves(){
        player.move(5);
        int pos = player.getPosition();
        Assert.assertEquals(5, pos);
    }

    @Test
    public void turnsOnBoardLimits(){
        player.move(11);
        int pos = player.getPosition();
        Assert.assertEquals(1, pos);
    }

   @Test
    public void tellsWennTurns(){
       boolean noTurn = player.move(4);
       boolean turn = player.move(11);

       Assert.assertFalse(noTurn);
       Assert.assertTrue(turn);
   }

    @Test
    public void startMoney(){
        long money = player.getMoney();
        Assert.assertEquals(1500, money);
    }

   @Test
    public void reduceMoney(){
       player.deduct(1000l);
       Assert.assertEquals(500l, player.getMoney());
   }
    @Test
    public void addMoney(){
        player.reward(1000l);

        Assert.assertEquals(2500l, player.getMoney());
    }

    @Test
    public void moneyIsInsufficient(){
        boolean sufficient = player.deduct(1000l);
        boolean insufficient = player.deduct(1000l);

        Assert.assertTrue(sufficient);
        Assert.assertFalse(insufficient);

    }

}
