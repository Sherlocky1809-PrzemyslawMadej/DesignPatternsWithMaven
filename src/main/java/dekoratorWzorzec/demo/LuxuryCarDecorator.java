package dekoratorWzorzec.demo;

public class LuxuryCarDecorator extends BasicDekorator {


    public LuxuryCarDecorator(ICar basicCar) {
        super(basicCar);
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("check air condition");
    }
}
