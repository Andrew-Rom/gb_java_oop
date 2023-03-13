package Units;

import java.util.ArrayList;

public abstract class Unit implements UnitsInterface {

    protected int hp;
    protected int maxHp;
    protected int speed;
    protected int hit;
    protected boolean isAlive = true;
    protected int[] position;
    protected final String NAME;


    public Unit(int hp, int speed, int hit, String name) {
        this.hp = hp;
        this.maxHp = hp;
        this.speed = speed;
        this.hit = hit;
        NAME = name;
    }

    public void getDamage(int damage) {
        if (hp > damage) {
            hp = hp - damage;
        } else {
            isAlive = false;
        }
    }

    @Override
    public void healing(int addHp) {
        hp = Math.min(hp + addHp, maxHp);
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
                        target.getDamage(hit);
                        System.out.println("Result:\nattacker > " + attacker + "\ntarget > " + target);
                        if ((target.getHp() - temp) < 0) break;
                    }
                }
            }
        }
    }

    public int[] getPosition() {
        return position;
    }

    public void setPosition(int x, int y) {
        position[0] = x;
        position[1] = y;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public int getSpeed() {
        return speed;
    }

    public String getNAME() {
        return NAME;
    }

    public int getHp() {
        return hp;
    }

    @Override
    public String toString() {
        return String.format("Name: %s HP: %d/%d.", NAME, hp, maxHp);
    }

    @Override
    public int compare(Unit o1, Unit o2) {
        return o1.getSpeed() - o2.getSpeed();
    }


}
