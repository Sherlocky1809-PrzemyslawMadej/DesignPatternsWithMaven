package dekoratorWzorzec;

public class CarApp {

    public static void main(String[] args) {

        Car car = new Car();
        car.startEngine();
        System.out.println("*********");

        PoliceCar policeCar = new PoliceCar();
        policeCar.startEngine();
    }
}
