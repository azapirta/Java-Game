package Artifacts;

/**
 * Created by Andrei on 04.05.2016.
 */
public class Artifact {
    private String name;
    private int bullets;
    private int damage;

    public Artifact(String name, int bullets, int damage) {
        this.name = name;
        this.bullets = bullets;
        this.damage = damage;
    }

    public Artifact() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBullets() {
        this.bullets = bullets;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getBullets() {
        return bullets;
    }

    public int getDamage() {
        return damage;
    }
}
