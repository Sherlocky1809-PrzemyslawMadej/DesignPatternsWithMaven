package dekoratorWzorzec.warriorDeko;

public class TerminatorWarriorDekorator extends WarriorBasicDekorator {

    public TerminatorWarriorDekorator(IWarrior warrior) {
        super(warrior);
    }

    @Override
    public int getPower() {
        return super.getPower() + 100;
    }
}
