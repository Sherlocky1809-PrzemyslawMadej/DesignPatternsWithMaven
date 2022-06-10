package behawioralnyStrategy;

public class StrategyDemo {

    public static void main(String[] args) {

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(new Item("kaszanka", "423423", 15));
        shoppingCart.addItem(new Item("szynka", "423000", 20));

        IPaymentStrategy cardStrategy = new CardStrategy(123456, 888);

        shoppingCart.pay(cardStrategy);
        shoppingCart.pay(new Pay24Strategy());

    }
}
