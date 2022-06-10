package dekoratorWzorzec.pizzaTask;

public class BasicDecoratorOfPizza implements IPizza {

    private final IPizza basicPizza;

    public BasicDecoratorOfPizza(IPizza basicPizza) {
        this.basicPizza = basicPizza;
    }

    @Override
    public int getPrice() {
        return basicPizza.getPrice();
    }

    @Override
    public void printPrice() {
        System.out.println(basicPizza);
    }

    @Override
    public String toString() {
        return "BasicDecoratorOfPizza{" +
                "basicPizza=" + basicPizza +
                '}';
    }
}
