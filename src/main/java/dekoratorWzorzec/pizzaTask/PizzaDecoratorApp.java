package dekoratorWzorzec.pizzaTask;

public class PizzaDecoratorApp {

    public static void main(String[] args) {

        IPizza pizza = new Pizza();
        pizza.getPrice();
        System.out.println("Cena bazowa pizzy: ");
        pizza.printPrice();

        IPizza decoratorOfPizza = new BasicDecoratorOfPizza(pizza);
        decoratorOfPizza.getPrice();

        System.out.println("*****************DEKORATORY: ");

        System.out.println("Pizza z szynka: ");
        IPizza pizzaWithHam = new HamPizzaDecorator(new BasicDecoratorOfPizza(new Pizza()));
        pizzaWithHam.printPrice();

        System.out.println("Pizza z szynka i serem: ");
        IPizza pizzaWithHamAndMozzarella = new MozzarellaPizzaDecorator(pizzaWithHam);
        pizzaWithHamAndMozzarella.printPrice();

        System.out.println("Pizza z szynka, mozzarella i pieczzarkami: ");
        IPizza pizzaWithAllIngredients = new MushroomsPizzaDecorator(pizzaWithHamAndMozzarella);
        pizzaWithAllIngredients.printPrice();
    }
}
