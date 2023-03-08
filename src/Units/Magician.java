package Units;

public abstract class Magician extends Unit {

    protected int mana;
    protected int magicForce;

    public Magician(int hp, int move, int hit, int mana, int magicForce, String name) {
        super(hp, move, hit, name);
        this.mana = mana;
        this.magicForce = magicForce;
    }


    public void selfHealing() {
        if (hp < maxHp && (maxHp - hp) <= mana) {
            healing(mana - (maxHp - hp));
            mana = mana - (maxHp - hp);
        } else if (hp < maxHp && (maxHp - hp) > mana) {
            healing(mana);
            mana = 0;
        }
    }

}
