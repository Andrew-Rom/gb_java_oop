import Units.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

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
                    teamWhite.add(new Sniper(getName()));
                    teamBlack.add(new XBowMan(getName()));
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

//        System.out.println("White team:");
//        for (Unit unit : teamWhite) System.out.println(unit.getInfo());
//        System.out.println("\nBlack team:");
//        for (Unit unit : teamBlack) System.out.println(unit.getInfo());

        ArrayList<Unit> teams = new ArrayList<>();
        teams.addAll(teamBlack);
        teams.addAll(teamWhite);

        for (Unit unit:teams) System.out.println(unit.getNAME() + " - " + unit.getSpeed());

        teams.sort(new Comparator<Unit>() {
            @Override
            public int compare(Unit o1, Unit o2) {
                return o1.getSpeed() - o2.getSpeed();
            }
        });

        for (Unit unit:teams) System.out.println(unit.getNAME() + " - " + unit.getSpeed());


        System.out.println("Attacks");
        System.out.println("White team:");
        teamWhite.forEach(unit -> unit.attack(teamWhite, teamBlack));
        System.out.println("White team:");
        teamBlack.forEach(unit -> unit.attack(teamBlack, teamWhite));

    }

    private static String getName() {
        return UnitsNames.values()[new Random().nextInt(UnitsNames.values().length)].toString();
    }

}