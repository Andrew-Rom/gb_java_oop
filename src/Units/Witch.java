package Units;

public class Witch extends Magician{

    public Witch() {
        super(100, 1, 5, 50, 10);
    }

    public void magicAttack (Unit target) {
        if (mana >= magicForce) {
            target.getDamage(hit + magicForce);
            mana = mana - magicForce;
        } else {
            attack(target);
        }
    }

}
