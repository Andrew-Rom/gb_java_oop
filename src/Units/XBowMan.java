package Units;

public class XBowMan extends Shooter {

    public XBowMan(String name) {
        super(100, 2, 10, 30, name);
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
