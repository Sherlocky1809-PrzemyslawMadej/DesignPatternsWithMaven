package dekoratorWzorzec.demo;

public class BasicDekorator implements ICar {

    private ICar basicCar;

    public BasicDekorator(ICar basicCar) {
        this.basicCar = basicCar;
    }

    @Override
    public void startEngine() {
        basicCar.startEngine();
    }
}
