package dekoratorWzorzec.warriorDeko;

import dekoratorWzorzec.warriorDeko.IWarrior;

public class WarriorBasicDekorator implements IWarrior {

    private IWarrior warrior;

    public WarriorBasicDekorator(IWarrior warrior) {
        this.warrior = warrior;
    }


    @Override
    public int getPower() {
        return warrior.getPower();
    }
}
