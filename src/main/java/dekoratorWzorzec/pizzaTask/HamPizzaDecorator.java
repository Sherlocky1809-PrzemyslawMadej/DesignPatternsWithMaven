package dekoratorWzorzec.pizzaTask;

public class HamPizzaDecorator extends BasicDecoratorOfPizza {

    private static final int HAM_PRICE = 15;

    public HamPizzaDecorator(IPizza basicPizza) {
        super(basicPizza);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + HAM_PRICE;
    }

    @Override
    public void printPrice() {
        System.out.println(getPrice() + " PLN");
    }
}
