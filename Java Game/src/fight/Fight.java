package fight;

import Artifacts.AK47;
import Artifacts.M4A1;
import Heroes.CounterTerorist;
import Heroes.CtTypes;
import Heroes.TeroTypes;
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
        int teroLife = terorist.getLife(), counterLife = terorist.getLife(), ak47Bullets, m4a1Bullets;
        AK47 ak47 = new AK47();
        ak47Bullets = ak47.getBullets();
        M4A1 m4a1 = new M4A1();
        m4a1Bullets = m4a1.getBullets();
        while (teroLife > 0 && counterLife > 0  && (ak47Bullets > 0 || m4a1Bullets > 0)) {
            int turn = random.nextInt(3);
            if (turn == 1 && ak47Bullets > 0) {
                counterLife -= ak47.getDamage();
                Thread.sleep(4000);
                System.out.println(counterTero + " was shooted" + "\n");
            } else if (turn == 2 && m4a1Bullets > 0) {
                teroLife -= m4a1.getDamage();
                Thread.sleep(4000);
                System.out.println(tero + " was shooted" + "\n");
            } else if (turn == 3) {
                if (m4a1Bullets > 0) {
                    Thread.sleep(4000);
                    teroLife -= m4a1.getDamage();
                }
                if (ak47Bullets > 0){
                    Thread.sleep(4000);
                    counterLife -= ak47.getDamage();
                }
            }
            Thread.sleep(4000);
            System.out.println(tero + " life " + teroLife + "\n" + counterTero + " life " + counterLife + "\n");
            ak47Bullets -= 3;
            m4a1Bullets -= 3;
        }
        if (teroLife > 0)
            System.out.println(tero + " WIN");
        else if (counterLife > 0)
            System.out.println(counterTero + " WIN");
        else
            System.out.println("DRAW");
    }
}
