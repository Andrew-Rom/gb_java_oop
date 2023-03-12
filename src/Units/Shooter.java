package Units;

public abstract class Shooter extends Unit {

    protected int arrows;

    public Shooter(int hp, int speed, int hit, int arrows, String name) {
        super(hp, speed, hit, name);
        this.arrows = arrows;
    }

    @Override
    public void attack(Unit target) {
        if (arrows > 0) target.getDamage(hit);
    }

}
