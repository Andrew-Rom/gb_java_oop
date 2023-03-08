package Units;

public class Spearman extends Infantry{
    public Spearman(String name) {
        super(100, 1, 5, 15, name);
    }

    @Override
    public void step() {
        System.out.println("The Spearman made a step.");
    }

    @Override
    public String getInfo() {
        return "Spearman";
    }
}
