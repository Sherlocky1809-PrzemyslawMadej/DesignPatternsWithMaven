package behawioralnyStrategy;

import behawioralnyStrategy.task2.CalculationStrategy;
import behawioralnyStrategy.task2.Country;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

//    Tu jest strategia
    public void pay(IPaymentStrategy strategy) {
        int amount = calculateTotal();
        strategy.pay(amount);
    }

    public int calculateTotal() {
        int total = 0;

            for (Item item : items) {
                total = total + item.getPrice();
            }
        return total;
    }
}
