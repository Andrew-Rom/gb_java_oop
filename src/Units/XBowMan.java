package Units;

public class XBowMan extends Shooter {

    public XBowMan() {
        super(100, 2, 10, 30);
    }

    @Override
    public void step() {
        System.out.println("The XBowMan made a step.");
    }

    @Override
    public String getInfo() {
        return "XBowMan";
    }
}
