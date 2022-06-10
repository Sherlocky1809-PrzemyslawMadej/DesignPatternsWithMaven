package dekoratorWzorzec;

public class LuxuryCar extends Car {

    @Override
    void startEngine() {
        super.startEngine();
        System.out.println("check air condition");
    }
}
