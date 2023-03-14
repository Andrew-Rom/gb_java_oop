package Units;

import java.util.ArrayList;

public class Monk extends Magician {

    public Monk(String name, int x, int y) {
        super(30, 5, 7, 12, 4, name, x, y);
    }


    @Override
    public void step(ArrayList<Unit> attackers, ArrayList<Unit> targets) {
        System.out.println("The Monk made a step.");
    }

    @Override
    public String getInfo() {
        return "Monk";
    }
}
