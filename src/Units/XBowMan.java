package Units;

public class XBowMan extends Shooter {

    public XBowMan(String name) {
        super(10, 4, 3, 6, name,16, 2, 3);
    }

    @Override
    public String getInfo() {
        return "XBowMan";
    }
}
