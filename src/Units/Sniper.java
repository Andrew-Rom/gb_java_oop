package Units;

public class Sniper extends Shooter {

    public Sniper(String name, int x, int y) {
        super(15, 9, 10, 12, name, 32, 2, 4, x, y);
    }

    @Override
    public String getInfo() {
        return "Sniper";
    }
}
