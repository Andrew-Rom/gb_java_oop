package Units;

import java.util.ArrayList;

public class Witch extends Magician {

    public Witch(String name) {
        super(100, 1, 5, 50, 10, name);
    }

    @Override
    public void attack(ArrayList<Unit> attackers, ArrayList<Unit> targets) {
        if ((mana >= magicForce) && isAlive) {
            for (Unit target : targets) {
                if (target.isAlive()) {
                    int temp = target.getHp();
                    System.out.println(target.getNAME() + " (Hp = " + target.getHp() + ") is under attack.");
                    target.getDamage(hit + magicForce);
                    mana = mana - magicForce;
                    System.out.println("Unit " + NAME + " attacked.");
                    System.out.println(target.getNAME() + " (Hp after attack = " + target.getHp() + ").");
                    if ((target.getHp() - temp) < 0) break;
                }
            }
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
