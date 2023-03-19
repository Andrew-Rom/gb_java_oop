package Units;

import java.util.ArrayList;

public abstract class Infantry extends Unit {

    public int[] causeDamage;

    public Infantry(String name, String type, int hp, int speed, int armor, int hit, int x, int y, int[] causeDamage) {
        super(name, type, hp, speed, armor, hit, x, y);
        this.causeDamage = causeDamage;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\t☠️%-3d        ", (causeDamage[0] + causeDamage[1])/2);
    }

    @Override
    public void step(ArrayList<Unit> attackers, ArrayList<Unit> targets) {
        if (isAlive) {
            Unit target = findTarget(targets);
            if (target.getArmor() < this.hit) {
                target.getDamage(this.hitPower(target));
            } else {
                target.getDamage(this.hitPower(target) / 2);
            }
        }
    }

    public int hitPower (Unit target) {
        int attackPower;
        if (this.position.getDist(target.position) <= 1) {
            attackPower = this.causeDamage[1];
        } else if (this.position.getDist(target.position) == 2) {
            attackPower = this.causeDamage[0];
        } else {
            attackPower = (this.causeDamage[0] + this.causeDamage[1]) / 2;
        }
        return attackPower;
    }

}
