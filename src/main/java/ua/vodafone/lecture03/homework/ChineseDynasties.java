package main.java.ua.vodafone.lecture03.homework;

public class ChineseDynasties {
    public static void main(String[] args) {
        int liSoldiersQty = 860;
        int mingSoldiersQty = (int) (liSoldiersQty * 1.5);
        System.out.println("The Li Dynasty had " + liSoldiersQty + " and the Ming Dynasty had "
                + mingSoldiersQty + " soldiers of each type.");
        int liWarriorDmg = 13;
        int liArcherDmg = 24;
        int liHorsemanDmg = 46;
        int mingWarriorDmg = 9;
        int mingArcherDmg = 35;
        int mingHorsemanDmg = 12;
        System.out.println("Li Dynasty soldier damage by type: warriors = " + liWarriorDmg + ", archers = "
                + liArcherDmg + ", horseman = " + liHorsemanDmg + "." + " Ming Dynasty: " + mingWarriorDmg + ", "
                + mingArcherDmg + " and " + mingHorsemanDmg + " accordingly.");
        int liTotalArmyDmg = liSoldiersQty * (liWarriorDmg + liArcherDmg + liHorsemanDmg);
        int mingTotalArmyDmg = mingSoldiersQty * (mingWarriorDmg + mingArcherDmg + mingHorsemanDmg);
        System.out.println("Total damage of Li Dynasty army = " + liTotalArmyDmg + " and Ming Dynasty = "
                + mingTotalArmyDmg + ".");
    }
}
