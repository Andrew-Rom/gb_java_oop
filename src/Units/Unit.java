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
        if (isAlive) {
            for (Unit target : targets) {
                System.out.println(target.getNAME() + " (Hp = " + target.getHp() + ") is under attack.");
                target.getDamage(hit);
                System.out.println("Unit " + NAME + " attacked.");
                System.out.println(target.getNAME() + " (Hp after attack = " + target.getHp() + ").");
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

}
