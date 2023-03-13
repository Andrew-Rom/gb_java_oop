package Units;

public class XBowMan extends Shooter {

    public XBowMan(String name) {
        super(100, 2, 10, 30, name);
    }


    @Override
    public String getInfo() {
        return "XBowMan";
    }
}
