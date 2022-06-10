package dekoratorWzorzec.pizzaTask;

public class MozzarellaPizzaDecorator extends BasicDecoratorOfPizza {

    private static final int MOZZARELLA_PRICE = 10;

    public MozzarellaPizzaDecorator(IPizza basicPizza) {
        super(basicPizza);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + MOZZARELLA_PRICE;
    }

    @Override
    public void printPrice() {
        System.out.println(getPrice() + " PLN");
    }
}
