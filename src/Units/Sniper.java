package Units;

public class Sniper extends Shooter {

    public Sniper(String name, int x, int y) {
        super(15, 9, 10, 12, name, 32, new int[]{8, 10}, x, y);
    }

    @Override
    public String getInfo() {
        return "Sniper";
    }

    @Override
    public String toString() {
        return super.toString() + "; type: Sniper";
    }

}
