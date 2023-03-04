package Units;

public class Unit {

    protected String name;
    protected float hp;
    protected float maxHp;
    protected int move;
    protected int hit;
    protected boolean isAlive = true;

    public Unit(String name, float hp, float maxHp, int move, int hit) {
        this.name = name;
        this.hp = hp;
        this.maxHp = maxHp;
        this.move = move;
        this.hit = hit;
    }

    public void getDamage(int damage) {
        if (hp > damage) {
            hp = hp - damage;
        } else {
            isAlive = false;
        }
    }

    public void healing(float addHp) {
        hp = Math.min(hp + addHp, maxHp);
    }

    public void attack(Unit target) {
        target.getDamage(hit);
    }

}
