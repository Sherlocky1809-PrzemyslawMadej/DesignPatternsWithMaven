package dekoratorWzorzec.warriorDeko;

public class RamboWarriorDekorator extends WarriorBasicDekorator {

    public RamboWarriorDekorator(IWarrior warrior) {
        super(warrior);
    }

    @Override
    public int getPower() {
        return super.getPower() + 20;
    }
}
