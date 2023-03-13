package Units;

import java.util.ArrayList;

public class Spearman extends Infantry {

    public Spearman(String name) {
        super(10, 4, 5, 4, name, 1, 3);
    }


    @Override
    public String getInfo() {
        return "Spearman";
    }

    @Override
    public void step(ArrayList<Unit> attackers, ArrayList<Unit> target) {
        System.out.println("The Spearman made a step.");
    }
}
