package Units;

public class Witch extends Magician{

    public Witch(String name) {
        super(100, 1, 5, 50, 10, name);
    }

    @Override
    public void attack(Unit target) {
        if (mana >= magicForce) {
            target.getDamage(hit + magicForce);
            mana = mana - magicForce;
        } else {
            super.attack(target);
        }
    }

    @Override
    public void step() {
        System.out.println("The Witch made a step.");
    }

    @Override
    public String getInfo() {
        return "Witch";
    }
}
