package Exception;

public class InsufficientFundsException extends Exception{
    private double amount;
    public InsufficientFundsException(int amount){
        super("What do you want to do?, You don't have money");
        this.amount=amount;
    }
    public double getAmount(){
        return amount;
    }
}
