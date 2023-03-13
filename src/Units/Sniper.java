package Units;

public class Sniper extends Shooter {

    public Sniper(String name) {
        super(100, 2, 15, 10, name);
    }


    @Override
    public String getInfo() {
        return "Sniper";
    }
}
