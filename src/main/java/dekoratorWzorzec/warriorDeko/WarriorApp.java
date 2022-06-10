package dekoratorWzorzec.warriorDeko;

import dekoratorWzorzec.warriorDeko.IWarrior;
import dekoratorWzorzec.warriorDeko.TerminatorWarriorDekorator;
import dekoratorWzorzec.warriorDeko.Warrior;

public class WarriorApp {

    public static void main(String[] args) {

        IWarrior warrior = new Warrior();
        System.out.println(warrior.getPower());

        IWarrior randomWarrior = new TerminatorWarriorDekorator(new Warrior());
        System.out.println(randomWarrior.getPower());

    }
}
