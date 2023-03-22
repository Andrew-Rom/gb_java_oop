import Units.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Init {

    public static void createTeams() {

        Main.teamWhite = new ArrayList<>();
        for (int i = 1; i < Main.GANG_SIZE + 1; i++) {
            switch (new Random().nextInt(4)) {
                case 0 -> {
                    Main.teamWhite.add(new Monk(getName(), 1, i));
                }
                case 1 -> {
                    Main.teamWhite.add(new XBowMan(getName(), 1, i));
                }
                case 2 -> {
                    Main.teamWhite.add(new Spearman(getName(), 1, i));
                }
                default -> {
                    Main.teamWhite.add(new Peasant(getName(), 1, i));
                }
            }
        }

        Main.teamBlack = new ArrayList<>();
        for (int i = 1; i < Main.GANG_SIZE + 1; i++) {
            switch (new Random().nextInt(4)) {
                case 0 -> {
                    Main.teamBlack.add(new Witch(getName(), 10, i));
                }
                case 1 -> {
                    Main.teamBlack.add(new Sniper(getName(), 10, i));
                }
                case 2 -> {
                    Main.teamBlack.add(new Bandit(getName(), 10, i));
                }
                default -> {
                    Main.teamBlack.add(new Peasant(getName(), 10, i));
                }
            }
        }

    }

    public static void makeStep() {

        Main.teamWhite.sort(new Comparator<Unit>() {
            @Override
            public int compare(Unit o1, Unit o2) {
                return o2.getSpeed() - o1.getSpeed();
            }
        });

        Main.teamBlack.sort(new Comparator<Unit>() {
            @Override
            public int compare(Unit o1, Unit o2) {
                return o2.getSpeed() - o1.getSpeed();
            }
        });

        for (int i = 0; i < Main.GANG_SIZE; i++) {
            Main.teamWhite.get(i).step(Main.teamWhite, Main.teamBlack);
            Main.teamBlack.get(i).step(Main.teamBlack, Main.teamWhite);
        }
    }

    private static String getName() {
        return UnitsNames.values()[new Random().nextInt(UnitsNames.values().length)].toString();
    }

}
