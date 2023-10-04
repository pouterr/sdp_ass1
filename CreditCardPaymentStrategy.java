public class CreditCardPaymentStrategy implements PaymentStrategy {
    private String cardNumber;
    private String cardHolder;

    public CreditCardPaymentStrategy(String cardNumber, String cardHolder) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount + " with card number " + cardNumber);
    }
}
