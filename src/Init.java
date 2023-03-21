import Units.*;

import java.util.ArrayList;
import java.util.Random;

public class Init {

    public static void createTeams() {
        Main.teamWhite = new ArrayList<>();
        Main.teamBlack = new ArrayList<>();

        for (int i = 1; i < Main.GANG_SIZE + 1; i++) {
            switch (new Random().nextInt(4)) {
                case 0 -> {
                    Main.teamWhite.add(new Monk(getName(), 1, i));
                    Main.teamBlack.add(new Witch(getName(), 10, i));
                }
                case 1 -> {
//                    Main.teamWhite.add(new XBowMan(getName(), 1, i));
//                    Main.teamBlack.add(new Sniper(getName(), 10, i));
                    Main.teamWhite.add(new Spearman(getName(), 1, i));
                    Main.teamBlack.add(new Bandit(getName(), 10, i));
                }
                case 2 -> {
                    Main.teamWhite.add(new Spearman(getName(), 1, i));
                    Main.teamBlack.add(new Bandit(getName(), 10, i));
                }
                default -> {
                    Main.teamWhite.add(new Peasant(getName(), 1, i));
                    Main.teamBlack.add(new Peasant(getName(), 10, i));
                }
            }
        }
    }

    public static void makeStep() {
        for (int i = 0; i < Main.GANG_SIZE; i++) {
            Main.teamWhite.get(i).step(Main.teamWhite, Main.teamBlack);
            Main.teamBlack.get(i).step(Main.teamBlack, Main.teamWhite);
        }
    }

    private static String getName() {
        return UnitsNames.values()[new Random().nextInt(UnitsNames.values().length)].toString();
    }

}
