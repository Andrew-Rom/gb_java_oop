package Units;

public abstract class Shooter extends Unit {

    protected int arrows;

    public Shooter(int hp, int move, int hit, int arrows) {
        super(hp, move, hit);
        this.arrows = arrows;
    }

    @Override
    public void attack(Unit target) {
        if (arrows > 0) target.getDamage(hit);
    }

}
