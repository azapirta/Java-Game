package game;

import Artifacts.Artifact;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Andrei on 06.05.2016.
 */
public  class Character {
    protected static final AtomicInteger idGenerator = new AtomicInteger(0);
    protected final int id;

    public int getId() {
        return id;
    }

    protected int life;
    protected int budget;
    protected Artifact artifact;

    public Character() {
        this.id = idGenerator.incrementAndGet();
    }


    public Artifact getWeapon() {
        if (artifact != null) {
            return artifact;
            }
        System.err.println("You don't have an item with that name");
        return null;
    }
}
