package Units;

import java.util.ArrayList;

public interface UnitsInterface {
    void step(ArrayList<Unit> attackers, ArrayList<Unit> target);

    String getInfo();

    void healing(int addHp);

    int compare(Unit o1, Unit o2);
}
