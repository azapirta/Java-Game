package Heroes;

import Artifacts.Artifact;
import Artifacts.Deagle;
import Artifacts.M4A1;
import game.Character;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Andrei on 04.05.2016.
 */
public class CounterTerorist extends Character{

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

    public void initiateEquipement(M4A1 firstChoice, Deagle secondChoice) {
        System.out.println("Choose a weapon: 1 for " + firstChoice.getName() + "\n" + "2 for " + secondChoice.getName());
        int choice = new Scanner(System.in).nextInt();
        switch (choice) {
            case 1:
                artifact = firstChoice;
                break;
            case 2:
                artifact = secondChoice;
                break;
            default:
                System.err.println("Your number is wrong. Chose 1 or 2");
                break;
        }
    }

    private int Random(int i){
        Random dice = new Random();
        int number = dice.nextInt(i);
        return (number);
    }
}
