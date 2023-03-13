package Units;

import java.util.ArrayList;

public interface UnitsInterface {
    void step();

    String getInfo();

    void healing(int addHp);

    void attack(ArrayList<Unit> attackers, ArrayList<Unit> target);

    int compare(Unit o1, Unit o2);
}
