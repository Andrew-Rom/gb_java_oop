package Units;

public class Sniper extends Shooter {

    public Sniper() {
        super(100, 2, 15, 10);
    }

    @Override
    public void step() {
        System.out.println("The Sniper made a step.");
    }

    @Override
    public String getInfo() {
        return "Sniper";
    }
}
