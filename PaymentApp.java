public class PaymentApp {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = PaymentProcessor.getInstance();

        PaymentStrategy creditCardPayment = new CreditCardPaymentStrategy("1234567890", "John Doe");
        PaymentStrategy paypalPayment = new PayPalPaymentStrategy("john.doe@example.com");

        paymentProcessor.processPayment(100.0);
        paymentProcessor.processPayment(200.0);
        paymentProcessor.processPayment(150.0);
    }
}
