package dekoratorWzorzec.pizzaTask;

public class MushroomsPizzaDecorator extends BasicDecoratorOfPizza {

    private static final int MUSHROOMS_PRICE = 10;

    public MushroomsPizzaDecorator(IPizza basicPizza) {
        super(basicPizza);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + MUSHROOMS_PRICE;
    }

    @Override
    public void printPrice() {
        System.out.println(getPrice() + " PLN");
    }
}
