package Units;

public class Shooter extends Unit {

    protected int arrows;

    public Shooter(int hp, int move, int hit, int arrows) {
        super(hp, move, hit);
        this.arrows = arrows;
    }

    public void shooting(Unit target) {
        if (arrows > 0) target.getDamage(hit);
    }

}
