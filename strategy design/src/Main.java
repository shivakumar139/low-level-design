public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Selecting credit card payment strategy
        cart.setPaymentStrategy(new CreditCardPayment("1234 5678 9012 3456", "123", "12/25"));
        cart.checkout(100);

        // Selecting PayPal payment strategy
        cart.setPaymentStrategy(new PayPalPayment("example@example.com", "password"));
        cart.checkout(200);
    }
}