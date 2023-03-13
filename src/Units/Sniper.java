package Units;

public class Sniper extends Shooter {

    public Sniper(String name) {
        super(15, 9, 10, 12, name, 32, 2, 4);
    }

    @Override
    public String getInfo() {
        return "Sniper";
    }
}
