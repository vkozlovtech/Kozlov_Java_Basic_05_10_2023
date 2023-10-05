package ua.vodafone.lecture03.homework;

public class ChineseDynastiesAdvanced {
    public static void main(String[] args) {
        int liWarriorsQty = 860;
        int mingWarriorsQty = (int) (liWarriorsQty * 1.5);
        System.out.println("The Li Dynasty had " + liWarriorsQty + " and the Ming Dynasty had "
                + mingWarriorsQty + " soldiers of each type.");
        int liWarriorDmg = 13;
        int liArcherDmg = 24;
        int liHorsemanDmg = 46;
        int mingWarriorDmg = 9;
        int mingArcherDmg = 35;
        int mingHorsemanDmg = 12;
        System.out.println("Li Dynasty soldier damage by type: warriors = " + liWarriorDmg + ", archers = "
                + liArcherDmg + ", horseman = " + liHorsemanDmg + "." + " Ming Dynasty: " + mingWarriorDmg + ", "
                + mingArcherDmg + " and " + mingHorsemanDmg + " accordingly.");
        int liTotalArmyDmg = (liWarriorDmg * liWarriorsQty) + (liArcherDmg * liWarriorsQty)
                + (liHorsemanDmg * liWarriorsQty);
        int mingTotalArmyDmg = (mingWarriorDmg * mingWarriorsQty) + (mingArcherDmg * mingWarriorsQty)
                + (mingHorsemanDmg * mingWarriorsQty);
        System.out.println("Total damage of Li Dynasty army = " + liTotalArmyDmg + " and Ming Dynasty = "
                + mingTotalArmyDmg + ".");
        topArmyDamage(liTotalArmyDmg, mingTotalArmyDmg);
    }

    private static void topArmyDamage(int liTotalArmyDmg, int mingTotalArmyDmg) {
        if (liTotalArmyDmg > mingTotalArmyDmg) {
            System.out.println("As a result, the Li Dynasty won, due to the fact that it has a higher army damage. "
                    + liTotalArmyDmg + " against " + mingTotalArmyDmg + ".");
        } else {
            System.out.println("As a result, the Ming Dynasty won, due to the fact that it has a higher army damage: "
                    + mingTotalArmyDmg + " against " + liTotalArmyDmg + ".");
        }
    }
}
