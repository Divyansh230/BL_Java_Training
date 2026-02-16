package Exception;

public class BankAccount {
    private double amount;

    public BankAccount(double amount){
        this.amount = amount;

    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if(amount > this.amount){
            throw new InsufficientFundsException(5000);
        }
        this.amount -= amount;
    }
}
