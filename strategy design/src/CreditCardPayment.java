public class CreditCardPayment implements  PaymentStrategy{
    private String cardNumber;
    private String cvv;
    private String expiryDate;

    public CreditCardPayment(String cardNumber, String cvv, String expiryDate) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    @Override
    public void pay(int amount) {
        // Logic for processing credit card payment
        System.out.println(amount + " paid using credit card.");
    }
}
