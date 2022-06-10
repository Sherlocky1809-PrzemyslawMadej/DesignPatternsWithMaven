package dekoratorWzorzec.pizzaTask;

public class Pizza implements IPizza {

    private int price;

        @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void printPrice() {
        System.out.println(getPrice());
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "price=" + price +
                '}';
    }
}
