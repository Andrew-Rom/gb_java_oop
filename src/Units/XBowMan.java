package Units;

public class XBowMan extends Shooter {

    public XBowMan(String name, int x, int y) {
        super(10, 4, 3, 6, name,16, new int[]{2, 3}, x, y);
    }

    @Override
    public String getInfo() {
        return "Crossbowman";
    }

    @Override
    public String toString() {
        return super.toString() + "; type: Crossbowman";
    }

}
