package Villains;

import Artifacts.AK47;
import Artifacts.Deagle;
import game.Character;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Andrei on 04.05.2016.
 */
public class Terorist extends Character{

    public Terorist() {
    }

    public int getLife() {
        return life;
    }

    public TeroTypes teroName() {
        int i;
        TeroTypes[] team = TeroTypes.values();
        i = random(4);
        return team[i];
    }
    public void initiateEquipement(AK47 firstChoice, Deagle secondChoice) {
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

    private int random(int i){
        Random dice = new Random();
        int number = dice.nextInt(i);
        return (number);
    }
}
