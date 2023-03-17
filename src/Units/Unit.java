package Units;

import java.util.ArrayList;

public abstract class Unit implements UnitsInterface {

    protected int hp;
    protected int maxHp;
    protected int speed;
    protected int armor;
    protected int hit;
    protected boolean isAlive = true;
    protected final String NAME;
    protected Position position;
    protected String type = "Type";


    public Unit(int hp, int speed, int armor, int hit, String name, int x, int y) {
        this.hp = hp;
        this.maxHp = hp;
        this.speed = speed;
        this.armor = armor;
        this.hit = hit;
        NAME = name;
        position = new Position(x, y);
    }

    public void getDamage(int damage) {
        if (hp > damage) {
            hp = hp - damage;
        } else {
            isAlive = false;
        }
    }

    public Position getPos() {
        return position;
    }

    @Override
    public void healing(int addHp) {
        hp = Math.min(hp + addHp, maxHp);
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

    public int getArmor() {
        return armor;
    }

    public String getPosition() {
        return String.format("x = % d, y = %d", position.getX(), position.getY());
    }


    @Override
    public String toString() {
        //return String.format("Name: %s = HP: %d/%d; armor: %d", NAME, hp, maxHp, armor);
        String outStr = String.format("\t%-3s\t⚔️ %-3d\t\uD83D\uDEE1 %-3d\t♥️%-3d%%\t☠️%-3d\t        ", type, hit,armor,(int) hp * 100/maxHp,(5 + 3)/2);
        return outStr;
    }

    @Override
    public int compare(Unit o1, Unit o2) {
        return o1.getSpeed() - o2.getSpeed();
    }

    protected Unit findNearest(ArrayList<Unit> team) {
        float minDist = 10;
        int index = 0;
        for (int i = 0; i < team.size(); i++) {
            float dist = team.get(i).position.getDist(team.get(i).position);
            if (dist < minDist) {
                minDist = dist;
                index = i;
            }
        }
        return team.get(index);
    }



}
