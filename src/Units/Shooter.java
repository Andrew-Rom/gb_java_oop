package Units;

import java.util.ArrayList;

public abstract class Shooter extends Unit implements UnitsInterface {

    protected int arrows;
    public int causeDamage;
    protected int getDamage;

    public Shooter(int hp, int speed, int armor, int hit, String name, int arrows, int causeDamage, int getDamage) {
        super(hp, speed, armor, hit, name);
        this.arrows = arrows;
        this.causeDamage = causeDamage;
        this.getDamage = getDamage;
    }


    public int getArrows() {
        return arrows;
    }

    @Override
    public void step(ArrayList<Unit> attackers, ArrayList<Unit> targets) {
        if ((arrows > 0) && isAlive) {
            for (Unit target : targets) {
                if (target.isAlive()) {
                    System.out.println("Attacker > " + this);
                    System.out.println("Target > " + target + " - " + target.getInfo());
                    if (target.getArmor() < hit) target.getDamage(hit - target.getArmor());
                    arrows--;
                    for (Unit unit : attackers) {
                        if (unit.getInfo().equals("Peasant")) {
                            Peasant deliver = (Peasant) unit;
                            if (deliver.getDelivery()) {
                                arrows++;
                                System.out.println("Recharged successfully by " + deliver.getNAME());
                                deliver.hasDelivery = false;
                                break;
                            }
                        }
                    }
                    if (target.isAlive()) {
                        System.out.println("Result: attacker > " + this + " target > " + target + "\n");
                    } else {
                        System.out.println("Result: attacker > " + this + " target > " + target.getNAME() + " was killed.\n");
                    }
                    break;
                }
            }
        }
    }

    @Override
    public String toString() {
        return String.format("Name: %s (HP: %d/%d; attack: %d; armor: %d; arrows: %d)", NAME, hp, maxHp, hit, armor, arrows);
    }

}
