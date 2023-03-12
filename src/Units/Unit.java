package Units;

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
    public void attack(Unit target) {
        target.getDamage(hit);
    }

    public int[] getPosition() {
        return position;
    }

    public void setPosition(int x, int y) {
        position[0] = x;
        position[1] = y;
    }

    public boolean getStatus() {
        return isAlive;
    }

    public int getSpeed() {
        return speed;
    }

    public String getNAME() {
        return NAME;
    }
}
