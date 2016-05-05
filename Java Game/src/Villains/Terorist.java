package Villains;

import Artifacts.AK47;
import Artifacts.Artifact;
import Artifacts.Deagle;
import Heroes.CounterTerorist;
import Heroes.CtTypes;
import Heroes.Hero;
import Heroes.TeroTypes;

import java.util.Random;

/**
 * Created by Andrei on 04.05.2016.
 */
public class Terorist {

    private int life = 100;

    Deagle deagle = new Deagle();
    AK47 ak47 = new AK47();

    public Terorist(int life) {
        this.life = life;
    }

    public int getLife() {
        return life;
    }

    public Terorist() {
    }

    public TeroTypes TeroName() {
        int i;
        TeroTypes[] team = TeroTypes.values();
        i = Random(4);
        return team[i];
    }

    public int shoot(CtTypes types){
        int damage = deagle.getDamage();
        int bullets = deagle.getBullets();
        int i;
        CounterTerorist enemy = new CounterTerorist();
        int life = enemy.getLife();
        while (life > 0 && bullets > 0){
            i = 1 + Random(2);
            if (i == 1){
                life -= damage;
            }
            else
                System.out.println("Missed");
            if (life > 0)
                System.out.println(life);
            bullets--;
        }
        if (life < 0)
            System.out.println(types + " IS DEAD");
        else
            System.out.println(types + " SURVIVED");
        return life;
    }

    private int Random(int i){
        Random dice = new Random();
        int number = dice.nextInt(i);
        return (number);
    }
}
