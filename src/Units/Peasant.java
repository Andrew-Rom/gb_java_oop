package Units;

import java.util.ArrayList;

public class Peasant extends Unit {

    public Peasant(String name) {
        super(100, 1, 1, name);
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
