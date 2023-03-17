import Units.*;
import java.util.*;

public class Main {

    public static final int GANG_SIZE = 10;
    public static ArrayList<Unit> teamWhite = new ArrayList<>();
    public static ArrayList<Unit> teamBlack = new ArrayList<>();

    public static void main(String[] args) {


        for (int i = 1; i < GANG_SIZE + 1; i++) {
            switch (new Random().nextInt(4)) {
                case 0 -> {
                    teamWhite.add(new Monk(getName(), 10, i));
                    teamBlack.add(new Witch(getName(), 1, i));
                }
                case 1 -> {
                    teamWhite.add(new XBowMan(getName(), 10, i));
                    teamBlack.add(new Sniper(getName(),1,i));
                }
                case 2 -> {
                    teamWhite.add(new Spearman(getName(),10, i));
                    teamBlack.add(new Bandit(getName(), 1, i));
                }
                default -> {
                    teamWhite.add(new Peasant(getName(), 10, i));
                    teamBlack.add(new Peasant(getName(), 1, i));
                }
            }
        }

//        ArrayList<Unit> teams = new ArrayList<>();
//        teams.addAll(teamBlack);
//        teams.addAll(teamWhite);
////        for (Unit unit : teams) System.out.println(unit + " - " + unit.getInfo() + " > speed: " + unit.getSpeed());
//        teams.sort(new Comparator<Unit>() {
//            @Override
//            public int compare(Unit o1, Unit o2) {
//                return o1.getSpeed() - o2.getSpeed();
//            }
//        });
//        System.out.println("\nSorted");
//        for (Unit unit : teams) System.out.println(unit + " - " + unit.getInfo() + " > speed: " + unit.getSpeed() + unit.getPosition());


//
//

        while (ConsoleView.step < 10) {
            ConsoleView.view();
            for (Unit unitWhite : teamWhite) {
                unitWhite.step(teamWhite, teamBlack);
            }
            for (Unit unitBlack : teamBlack) {
                unitBlack.step(teamBlack, teamWhite);
            }
        }

    }

    private static String getName() {
        return UnitsNames.values()[new Random().nextInt(UnitsNames.values().length)].toString();
    }



}