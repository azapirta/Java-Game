package Heroes;

import java.util.Random;

/**
 * Created by Andrei on 04.05.2016.
 */
public class CounterTerorist {

    private int life;

    public CounterTerorist() {
        this.life = 100;
    }

    public int getLife() {
        return life;
    }

    public CtTypes getCtName() {
        int i;
        CtTypes[] team = CtTypes.values();
        i = Random(4);
        return team[i];
    }

    private int Random(int i){
        Random dice = new Random();
        int number = dice.nextInt(i);
        return (number);
    }
}
