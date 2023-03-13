package Units;

public abstract class Magician extends Unit {

    protected boolean mana;
    protected int getDamage;

    public Magician(int hp, int speed, int armor, int hit, int getDamage, String name) {
        super(hp, speed, armor, hit, name);
        this.mana = true;
        this.getDamage = getDamage;
    }

    public boolean isMana() {
        return mana;
    }

    public int getGetDamage() {
        return getDamage;
    }

    public void healHero(Unit target) {
        if (mana) {
            target.healing(hit);
            mana = false;
        }
    }

}
