package Units;

public class Monk extends Magician{

    public Monk() {
        super(100, 1, 7, 100, 10);
    }

    public void healHero (Unit target) {
        if (mana >= magicForce) {
            target.healing(magicForce);
            mana = mana-magicForce;
        } else {
            target.healing(mana);
            mana = 0;
        }
    }

}
