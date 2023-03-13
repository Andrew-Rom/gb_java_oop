package Units;

import java.util.ArrayList;

public abstract class Shooter extends Unit implements UnitsInterface {

    protected int arrows;

    public Shooter(int hp, int speed, int hit, int arrows, String name) {
        super(hp, speed, hit, name);
        this.arrows = arrows;
    }

    @Override
    public void attack(ArrayList<Unit> attackers, ArrayList<Unit> targets) {
        if ((arrows > 0) && isAlive) {
            for (Unit target : targets) {
                if (target.isAlive()) {
                    int temp = target.getHp();
                    System.out.println(target.getNAME() + " (Hp = " + target.getHp() + ") is under attack.");
                    target.getDamage(hit);
                    arrows--;
                    System.out.println("Unit " + NAME + " attacked.");
                    System.out.println(target.getNAME() + " (Hp after attack = " + target.getHp() + ").");
                    if ((target.getHp() - temp) < 0) break;
                }
            }
            for (Unit attacker : attackers) {
                if (attacker.getInfo().equals("Peasant")) {
                    arrows++;
                    break;
                }
            }
        }
    }

    @Override
    public void step() {
        if (arrows > 0 && isAlive) {
            System.out.println(NAME + " ready to shoot");
        }
    }
}
