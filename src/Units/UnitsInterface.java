package Units;

public interface UnitsInterface {
    void step();

    String getInfo();

    void healing(int addHp);

    void attack(Unit target);
}
