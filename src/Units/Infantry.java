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
        for (Unit attacker:attackers) {
            if (attacker.isAlive()) {
                System.out.println("Attacker > " + attacker);
                for (Unit target : targets) {
                    if (target.isAlive()) {
                        int temp = target.getHp();
                        System.out.println("Target > " + target);
                        target.getDamage(hit + weaponPower);
                        System.out.println("Result:\nattacker > " + attacker + "\ntarget > " + target);
                        if ((target.getHp() - temp) < 0) break;
                    }
                }
            }
        }
    }

}
