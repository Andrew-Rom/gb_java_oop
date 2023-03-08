package Units;

public class Bandit extends Infantry {

    public Bandit(String name) {
        super(100, 2, 5, 10, name);
    }

    @Override
    public void step() {
        System.out.println("The Bandit made a step.");
    }

    @Override
    public String getInfo() {
        return "Bandit";
    }
}
