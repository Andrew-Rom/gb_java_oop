package Units;

import java.util.ArrayList;

public class Bandit extends Infantry {


    public Bandit (String name) {
        super(10, 6, 3, 8, name, 2, 4);
    }


    @Override
    public void step(ArrayList<Unit> attackers, ArrayList<Unit> target) {
        System.out.println("The Bandit made a step.");
    }

    @Override
    public String getInfo() {
        return "Bandit";
    }
}
