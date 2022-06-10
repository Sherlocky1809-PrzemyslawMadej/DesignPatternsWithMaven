package builder.task1;

public class Car {

    private Engine engine;
    private boolean isElectric;
    private int vin;
    private String owner;
    private int maxSpeed;

    private Car() {
    }

    public Car(Engine engine, boolean isElectric, int vin, String owner, int maxSpeed) {
        this.engine = engine;
        this.isElectric = isElectric;
        this.vin = vin;
        this.owner = owner;
        this.maxSpeed = maxSpeed;
    }

    public Engine getEngine() {
        return engine;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public int getVin() {
        return vin;
    }

    public String getOwner() {
        return owner;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", isElectric=" + isElectric +
                ", vin=" + vin +
                ", owner='" + owner + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public static class Builder {

        private Engine engine;
        private boolean isElectric;
        private int vin;
        private String owner;
        private int maxSpeed;

        public Builder engine (Engine engine) {
            this.engine = engine;
            return this;
        }

        public Builder isElectric (boolean isElectric) {
            this.isElectric = isElectric;
            return this;
        }

        public Builder vin (int vin) {
            this.vin = vin;
            return this;
        }

        public Builder owner (String owner) {
            this.owner = owner;
            return this;
        }

        public Builder maxSpeed (int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Car build () {

            Car car = new Car();

            car.engine = this.engine;
            car.vin = this.vin;
            car.isElectric = this.isElectric;
            car.owner = this.owner;
            car.maxSpeed = this.maxSpeed;

            return car;
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "engine=" + engine +
                    ", isElectric=" + isElectric +
                    ", vin=" + vin +
                    ", owner='" + owner + '\'' +
                    ", maxSpeed=" + maxSpeed +
                    '}';
        }
    }
}
