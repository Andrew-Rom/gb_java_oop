package Units;

import java.util.ArrayList;

public class Peasant extends Unit {

    protected boolean hasDelivery;
    protected int causeDamage;

    public Peasant(int hp, int speed, int armor, int hit, int causeDamage, String name, boolean hasDelivery) {
        super(hp, speed, armor, hit, name);
        this.hasDelivery = hasDelivery;
        this.causeDamage = causeDamage;
    }

    public Peasant(String name) {
        this(1, 3, 1, 1, 1,name,true);
    }



    public boolean getDelivery() {
        return hasDelivery;
    }

    @Override
    public void step(ArrayList<Unit> attackers, ArrayList<Unit> targets) {
        System.out.println("The Peasant made a step.");
    }

    @Override
    public String getInfo() {
        return "Peasant";
    }

}
