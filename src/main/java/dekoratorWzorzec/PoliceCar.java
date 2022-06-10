package dekoratorWzorzec;

public class PoliceCar extends Car {

    @Override
    void startEngine() {
        super.startEngine();
        System.out.println("Start police system");
    }
}
