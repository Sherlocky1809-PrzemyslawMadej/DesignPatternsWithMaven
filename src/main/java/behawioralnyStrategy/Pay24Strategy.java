package behawioralnyStrategy;

public class Pay24Strategy implements IPaymentStrategy {

    @Override
    public void pay(int amount) {
        System.out.println("Payment using Pay24 amount: " + amount);
    }
}
