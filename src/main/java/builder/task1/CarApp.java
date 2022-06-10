package builder.task1;

public class CarApp {

    public static void main(String[] args) {

        Car.Builder car1 = new Car.Builder();
        Engine engine = new Engine();

        car1.engine(engine)
                .vin(123345)
                .owner("Przemek")
                .isElectric(true)
                .build();

        System.out.println(car1);

        Car car2 = new Car.Builder()
        .engine(engine)
                .isElectric(true)
                .maxSpeed(250)
                .owner("Jacek")
                .vin(98765)
                .build();

        System.out.println(car2);

        Car car3 = new Car.Builder()
                .maxSpeed(220)
                .owner("Nosek")
                .vin(12390)
                .build();

        System.out.println(car3);
    }
}
