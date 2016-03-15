package boardgame.monopoly;

import java.util.Random;

/**
 * Created by MikaSez on 15/03/2016.
 */
public class Dice {
    int faces;
    Random r;
    public Dice(int i) {
        faces = i;
        r = new Random();

    }



    public int trow(int nb) {
        int count=0;
        for(int i=0; i<nb; i++){
            count+=trow();
        }
        return count;
    }

    public int getFaces() {
        return faces;
    }

    public int trow() {
        return r.nextInt(faces)+1;
    }
}
