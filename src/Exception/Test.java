package Exception;

public class Test {
    public static void main(String[] args) {
        BankAccount ba=new BankAccount(5000);
        try{
            ba.withdraw(10000);
        }catch(InsufficientFundsException e){
            e.getAmount();
            System.out.println(e);
        }
    }
}
