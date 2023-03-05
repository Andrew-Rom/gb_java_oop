package Units;

public class Infantry extends Unit{

    protected int weaponPower;

    public Infantry(int hp, int move, int hit, int weaponPower) {
        super(hp, move, hit);
        this.weaponPower = weaponPower;
    }

    public void armedAttack(Unit target) {
        target.getDamage(hit + weaponPower);
    }

}
