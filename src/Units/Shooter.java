package Units;

import java.util.ArrayList;

public abstract class Shooter extends Unit implements UnitsInterface {

    protected int arrows;

    public Shooter(int hp, int speed, int hit, int arrows, String name) {
        super(hp, speed, hit, name);
        this.arrows = arrows;
    }

    public int getArrows() {
        return arrows;
    }

    @Override
    public void attack(ArrayList<Unit> attackers, ArrayList<Unit> targets) {
        for (Unit attacker: attackers) {
            if ((arrows > 0) && attacker.isAlive()) {
                System.out.println("Attacker > " + attacker);
                for (Unit target : targets) {
                    if (target.isAlive()) {
                        int temp = target.getHp();
                        System.out.println("Target > " + target);
                        target.getDamage(hit);
                        arrows--;
                        System.out.println("Result:\nattacker > " + attacker + "\ntarget > " + target);
                        if ((target.getHp() - temp) < 0) break;
                    }
                }
            }
            for (Unit unit : attackers) {
                if (unit.getInfo().equals("Peasant")) {
                    arrows++;
                    System.out.println(attacker);
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

    @Override
    public String toString() {
        return String.format("Name: %s HP: %d/%d Arrows: %d.", NAME, hp, maxHp, arrows);
    }

}
