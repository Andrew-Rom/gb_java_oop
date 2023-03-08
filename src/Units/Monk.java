package Units;

public class Monk extends Magician {

    public Monk(String name) {
        super(100, 1, 7, 100, 10, name);
    }

    public void healHero(Unit target) {
        if (mana >= magicForce) {
            target.healing(magicForce);
            mana = mana - magicForce;
        } else {
            target.healing(mana);
            mana = 0;
        }
    }

    @Override
    public void step() {
        System.out.println("The Monk made a step.");
    }

    @Override
    public String getInfo() {
        return "Monk";
    }
}
