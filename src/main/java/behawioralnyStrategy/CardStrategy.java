package behawioralnyStrategy;

public class CardStrategy implements IPaymentStrategy {

    private final int cardNumber;
    private final int cvv;

    public CardStrategy(int cardNumber, int cvv) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Payment using " + cardNumber);
    }

}
