package com.company;

import Heroes.CounterTerorist;
import Heroes.CtTypes;
import Heroes.TeroTypes;
import Villains.Terorist;
import fight.Fight;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.print("COUNTER-TERORIST: ");
        CounterTerorist ct = new CounterTerorist();
        CtTypes nameCt = ct.getCtName();
        System.out.println(nameCt + "\n" + "VS");
        Terorist tero = new Terorist();
        TeroTypes nameTero = tero.TeroName();
        System.out.println("TERORIST: " + nameTero);
        Fight.startFight(nameCt, nameTero);

    }
}
