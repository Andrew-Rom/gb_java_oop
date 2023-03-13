package Units;

import java.util.ArrayList;

public class Witch extends Magician {

    public Witch (String name) {
        super(30, 9, 12, 17, 5, name);
    }


    @Override
    public void step(ArrayList<Unit> attackers, ArrayList<Unit> targets) {
        System.out.println("The Witch made a step.");
    }

    @Override
    public String getInfo() {
        return "Witch";
    }
}
