import Units.*;

import java.util.*;

public class Main {

    public static final int GANG_SIZE = 10;
    public static ArrayList<Unit> teamWhite;
    public static ArrayList<Unit> teamBlack;

    public static void main(String[] args) {

        Init.createTeams();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            ConsoleView.view();
            Init.makeStep();
            scanner.nextLine();
        }

    }

}