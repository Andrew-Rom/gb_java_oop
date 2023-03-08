package Units;

public abstract class Infantry extends Unit {

    protected int weaponPower;

    public Infantry(int hp, int move, int hit, int weaponPower, String name) {
        super(hp, move, hit, name);
        this.weaponPower = weaponPower;
    }

    @Override
    public void attack(Unit target) {
        target.getDamage(hit + weaponPower);
    }

}
