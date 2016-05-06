package fight;

import Artifacts.AK47;
import Artifacts.Artifact;
import Artifacts.Deagle;
import Artifacts.M4A1;
import Heroes.CounterTerorist;
import Heroes.CtTypes;
import Villains.TeroTypes;
import Villains.Terorist;

import java.util.Random;

/**
 * Created by Andrei on 05.05.2016.
 */
public class Fight {
    public static void startFight(CtTypes counterTero, TeroTypes tero) throws InterruptedException {
        Random random = new Random();

        Terorist terorist = new Terorist();
        CounterTerorist counterTerorist = new CounterTerorist();

        terorist.initiateEquipement(new AK47(), new Deagle());
        counterTerorist.initiateEquipement(new M4A1(), new Deagle());

        int teroLife = counterTerorist.getLife(), counterLife = counterTerorist.getLife(), TeroBullets, CounterBullets;
        Artifact teroWeapon = terorist.getWeapon();
        Artifact counterTeroWeapon = counterTerorist.getWeapon();

        System.out.println("Tero weapon = " + teroWeapon.getName());
        System.out.println("ct WEAPON = " + counterTeroWeapon.getName());

        TeroBullets = teroWeapon.getBullets();
        CounterBullets = counterTeroWeapon.getBullets();

       while (teroLife > 0 && counterLife > 0  && (TeroBullets > 0 || CounterBullets > 0)) {
            int turn = random.nextInt(3);
            if (turn == 1 && TeroBullets > 0) {
                counterLife -= teroWeapon.getDamage();
                Thread.sleep(2000);
                System.out.println(counterTero + " was shooted" + "\n");
            } else if (turn == 2 && CounterBullets > 0) {
                teroLife -= counterTeroWeapon.getDamage();
                Thread.sleep(2000);
                System.out.println(tero + " was shooted" + "\n");
            } else if (turn == 3) {
                if (CounterBullets > 0) {
                    Thread.sleep(2000);
                    teroLife -= teroWeapon.getDamage();
                }
                if (TeroBullets > 0){
                    Thread.sleep(2000);
                    counterLife -= counterTeroWeapon.getDamage();
                }
                System.out.println("MISSED");
            }
            Thread.sleep(2000);
            System.out.println(tero + " life " + teroLife + "\n" + counterTero + " life " + counterLife + "\n");
           TeroBullets -= 3;
           CounterBullets -= 3;
        }
        Thread.sleep(1000);
        if (teroLife > 0)
            System.out.println(tero + " WIN");
        else if (counterLife > 0)
            System.out.println(counterTero + " WIN");
        else
            System.out.println("DRAW");
    }
}
