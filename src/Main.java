import Units.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Unit> teamWhite = new ArrayList<>();
        ArrayList<Unit> teamBlack = new ArrayList<>();
        int teamSize = 10;

        for (int i = 0; i < teamSize; i++) {
            switch (new Random().nextInt(4)) {
                case 0 -> {
                    teamWhite.add(new Monk(getName()));
                    teamBlack.add(new Witch(getName()));
                }
                case 1 -> {
                    teamWhite.add(new XBowMan(getName()));
                    teamBlack.add(new Sniper(getName()));
                }
                case 2 -> {
                    teamWhite.add(new Spearman(getName()));
                    teamBlack.add(new Bandit(getName()));
                }
                default -> {
                    teamWhite.add(new Peasant(getName()));
                    teamBlack.add(new Peasant(getName()));
                }
            }
        }

        ArrayList<Unit> teams = new ArrayList<>();
        teams.addAll(teamBlack);
        teams.addAll(teamWhite);
        for (Unit unit:teams) System.out.println(unit + " - " + unit.getInfo() + " > speed: " + unit.getSpeed());
        teams.sort(new Comparator<Unit>() {
            @Override
            public int compare(Unit o1, Unit o2) {
                return o1.getSpeed() - o2.getSpeed();
            }
        });
        System.out.println("\nSorted");
        for (Unit unit:teams) System.out.println(unit + " - " + unit.getInfo() + " > speed: " + unit.getSpeed());

        System.out.println("\nBattlefield");
        System.out.println("\nWhite team is attacking:");
        for (Unit unitWhite:teamWhite) {
            unitWhite.step(teamWhite, teamBlack);
        }
        System.out.println("\nBlack team is attacking:");
        for (Unit unitBlack:teamBlack) {
            unitBlack.step(teamBlack, teamWhite);
        }

    }

    private static String getName() {
        return UnitsNames.values()[new Random().nextInt(UnitsNames.values().length)].toString();
    }

}