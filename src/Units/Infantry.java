package Units;

import java.util.ArrayList;

public abstract class Infantry extends Unit {

    public int causeDamage;
    protected int getDamage;

    public Infantry(int hp, int speed, int armor, int hit, String name, int causeDamage, int getDamage) {
        super(hp, speed, armor, hit, name);
        this.causeDamage = causeDamage;
        this.getDamage = getDamage;
    }

//    @Override
//    public void step(ArrayList<Unit> attackers, ArrayList<Unit> targets) {
//        for (Unit attacker:attackers) {
//            if (attacker.isAlive()) {
//                for (Unit target : targets) {
//                    if (target.isAlive()) {
//                        int temp = target.getHp();
//                        System.out.println("Attacker > " + attacker);
//                        System.out.println("Target > " + target);
//                        target.getDamage(hit);
//                        System.out.println("Result:\nattacker > " + attacker + "\ntarget > " + target);
//                        if ((target.getHp() - temp) < 0) break;
//                    }
//                }
//            }
//        }
//    }

}
