import boardgame.monopoly.Dice;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Some test for classical dices
 */
public class DiceTest {

    public  Dice dice;

    @Before
    public void setUp(){
        dice = new Dice(6);
    }

    @Test
    public void trow(){
        int nb = dice.trow();
        Assert.assertTrue(nb >0);
        Assert.assertTrue(nb<=dice.getFaces());
    }

    @Test
    public void trowIsFair(){
        int result = dice.trow(1000);
        double fin = result/1000;
        Assert.assertEquals(3.0d, fin, 0.2d);
    }

}
