package Units;

public class Peasant extends Unit{

    public Peasant() {
        super(100, 1, 1);
    }

    @Override
    public void step() {
        System.out.println("The Peasant made a step.");
    }

    @Override
    public String getInfo() {
        return "Peasant";
    }
}
