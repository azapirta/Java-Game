package Heroes;

import Artifacts.AK47;
import Artifacts.Artifact;
import Artifacts.Deagle;

import java.util.Random;

/**
 * Created by Andrei on 04.05.2016.
 */
public class Hero {
    private int life;
    private String name;
    Artifact artifact;

    public Hero(int life, String name, Artifact artifact) {
        this.life = life;
        this.name = name;
        this.artifact = artifact;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArtifact(Artifact artifact) {
        this.artifact = artifact;
    }

    public double getLife() {
        return life;
    }

    public String getName() {
        return name;
    }

    public Artifact getArtifact() {
        return artifact;
    }

    private int Random(int i){
        Random dice = new Random();
        int number = dice.nextInt(i);
        return (number);
    }
}
