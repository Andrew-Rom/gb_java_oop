package Units;

public abstract class Unit implements UnitsInterface {

    protected int hp;
    protected int maxHp;
    protected int speed;
    protected int armor;
    protected int hit;
    protected boolean isAlive = true;
    protected final String NAME;


    public Unit(int hp, int speed, int armor, int hit, String name) {
        this.hp = hp;
        this.maxHp = hp;
        this.speed = speed;
        this.armor = armor;
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

    @Override
    public String toString() {
        return String.format("Name: %s (HP: %d/%d; attack: %d; armor: %d)", NAME, hp, maxHp, hit, armor);
    }

    @Override
    public int compare(Unit o1, Unit o2) {
        return o1.getSpeed() - o2.getSpeed();
    }

}
