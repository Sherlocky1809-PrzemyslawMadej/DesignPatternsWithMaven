package dekoratorWzorzec.demo;

public class CarImpl implements ICar {

    @Override
    public void startEngine() {
        System.out.println("Car impl start engine");
    }
}
