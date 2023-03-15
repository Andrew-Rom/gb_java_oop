package Units;

import java.util.ArrayList;

public class Bandit extends Infantry {


    public Bandit(String name, int x, int y) {
        super(10, 6, 3, 8, name, 2, x, y);
    }


    @Override
    public void step(ArrayList<Unit> attackers, ArrayList<Unit> target) {
        System.out.println("The Bandit made a step.");
    }

    @Override
    public String getInfo() {
        return "Bandit";
    }

    @Override
    public String toString() {
        return super.toString() + "; type: Bandit";
    }

}
