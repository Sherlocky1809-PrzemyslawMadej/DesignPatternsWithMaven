package dekoratorWzorzec.demo;

public class PoliceCarDecorator extends BasicDekorator {

    public PoliceCarDecorator(ICar basicCar) {
        super(basicCar);
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Start police system");
    }
}
