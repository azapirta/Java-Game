package Artifacts;

/**
 * Created by Andrei on 04.05.2016.
 */
public class AK47 extends Artifact {
    private int bullets = 30;

    public AK47() {
        super("AK-47", 30, 24);
    }

    public int getAk47Bullets(){
        return bullets;
    }

}
