package ZomatoDeliveryApp.stratergies;

public class UPI implements PaymentStratergy {
    String UPI_ID;

    public UPI(String UPI_ID) {
        this.UPI_ID = UPI_ID;
    }
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " of UPI (" + UPI_ID + ")");
    }
}
