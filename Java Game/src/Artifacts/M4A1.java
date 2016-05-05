package Artifacts;

/**
 * Created by Andrei on 04.05.2016.
 */
public class M4A1 extends Artifact{
    private int bullets = 30;

    public M4A1() {
        super("M4A1", 30, 24);
    }

    public int getM4a1Bullets(){
        return bullets;
    }
}
