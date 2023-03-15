package Units;

import java.util.ArrayList;

public class Witch extends Magician {

    public Witch(String name, int x, int y) {
        super(30, 9, 12, 17, 5, name, x, y);
    }


    @Override
    public void step(ArrayList<Unit> attackers, ArrayList<Unit> targets) {
        if (isAlive) System.out.println("The Witch made a step.");
    }

    @Override
    public String getInfo() {
        return "Witch";
    }

    @Override
    public String toString() {
        return super.toString() + "; type: Witch";
    }

}
