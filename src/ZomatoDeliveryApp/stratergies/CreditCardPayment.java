package ZomatoDeliveryApp.stratergies;

public class CreditCardPayment implements PaymentStratergy {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " of credit card (" + cardNumber + ")");
    }
}
