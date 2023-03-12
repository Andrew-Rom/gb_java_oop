package Units;

public abstract class Infantry extends Unit {

    protected int weaponPower;

    public Infantry(int hp, int speed, int hit, int weaponPower, String name) {
        super(hp, speed, hit, name);
        this.weaponPower = weaponPower;
    }

    @Override
    public void attack(Unit target) {
        target.getDamage(hit + weaponPower);
    }

}
