package Units;

import java.util.ArrayList;

public abstract class Infantry extends Unit {

    protected int weaponPower;

    public Infantry(int hp, int speed, int hit, int weaponPower, String name) {
        super(hp, speed, hit, name);
        this.weaponPower = weaponPower;
    }

    @Override
    public void attack(ArrayList<Unit> attackers, ArrayList<Unit> targets) {
        if (isAlive) {
            for (Unit target : targets) {
                if (target.isAlive()) {
                    int temp = target.getHp();
                    System.out.println(target.getNAME() + " (Hp = " + target.getHp() + ") is under attack.");
                    target.getDamage(hit + weaponPower);
                    System.out.println("Unit " + NAME + " attacked.");
                    System.out.println(target.getNAME() + " (Hp after attack = " + target.getHp() +").");
                    if ((target.getHp() - temp) < 0) break;
                }
            }
        }
    }

}
