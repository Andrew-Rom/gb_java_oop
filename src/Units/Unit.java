package Units;

public class Unit {

    protected int hp;
    protected int maxHp;
    protected int move;
    protected int hit;
    protected boolean isAlive = true;
    protected int[] position;

    public Unit(int hp, int move, int hit) {
        this.hp = hp;
        this.maxHp = hp;
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

    public void healing(int addHp) {
        hp = Math.min(hp + addHp, maxHp);
    }

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

}
