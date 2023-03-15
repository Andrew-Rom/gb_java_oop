package Units;

import java.util.ArrayList;

public abstract class Shooter extends Unit implements UnitsInterface {

    protected int arrows;
    public int[] causeDamage;

    public Shooter(int hp, int speed, int armor, int hit, String name, int arrows, int[] causeDamage, int x, int y) {
        super(hp, speed, armor, hit, name, x, y);
        this.arrows = arrows;
        this.causeDamage = causeDamage;
    }


    public int getArrows() {
        return arrows;
    }

    @Override
    public void step(ArrayList<Unit> attackers, ArrayList<Unit> targets) {
        if ((arrows > 0) && isAlive) {
            Unit target = findNearest(targets);
            if (target.isAlive()) {
                System.out.println("Attacker > " + this + " - can cause damage " + this.hitPower(target));
                System.out.println("Target > " + target);
                if (target.getArmor() < this.hitPower(target)) {
                    target.getDamage(this.hitPower(target) - target.getArmor());
                    System.out.println("<attack was successful>");
                } else {
                    System.out.println("<attack was unsuccessful - armor was unbroken>");
                }
                arrows--;
                for (Unit unit : attackers) {
                    if (unit.getInfo().equals("Peasant")) {
                        Peasant deliver = (Peasant) unit;
                        if (deliver.getDelivery()) {
                            arrows++;
                            System.out.println("<recharged successfully by " + deliver.getNAME());
                            deliver.hasDelivery = false;
                            break;
                        }
                    }
                }
                if (target.isAlive()) {
                    System.out.println("Result:\n\tattacker > " + this + "\n\ttarget > " + target + "\n");
                } else {
                    System.out.println("Result:\n\tattacker > " + this + "\n\ttarget > " + target + " was killed.\n");
                }
            }
        }
    }

    public int[] getCauseDamage() {
        return causeDamage;
    }

    public int hitPower (Unit target) {
        int attackPower = 0;
        if (this.position.getDist(target.position) < 5) {
            attackPower = this.causeDamage[1];
        } else if (this.position.getDist(target.position) >= 5) {
            attackPower = this.causeDamage[0];
        } else {
            attackPower = (this.causeDamage[0] + this.causeDamage[1]) / 2;
        }
        return attackPower;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("; arrows: %d", arrows);
    }

}
