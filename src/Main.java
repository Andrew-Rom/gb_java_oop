import Units.*;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Peasant peasant = new Peasant(getName());

        Monk monk = new Monk(getName());

        Witch witch = new Witch(getName());

        Sniper sniper = new Sniper(getName());

        XBowMan xBowMan = new XBowMan(getName());

        Bandit bandit = new Bandit(getName());

        Spearman spearman = new Spearman(getName());

    }

    private static String getName(){
        return UnitsNames.values()[new Random().nextInt(UnitsNames.values().length)].toString();
    }

}