package dekoratorWzorzec.demo;

public class DekoratorApp {

    public static void main(String[] args) {

        ICar carImpl = new CarImpl();
        carImpl.startEngine();
        System.out.println("*****************");

        ICar decorator = new BasicDekorator(carImpl);
        decorator.startEngine();

        System.out.println("****************");
// ponizej uzycie dekoratorow
        ICar car = new PoliceCarDecorator(
                new LuxuryCarDecorator
                        (new PoliceCarDecorator(new CarImpl())));

        car.startEngine();
        System.out.println("************");


    }
}
