import java.util.Scanner;

public class Store {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter item price: ");
        double unitPrice=sc.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity=sc.nextInt();
        double totalPrice=unitPrice*quantity;
        System.out.println("Total Price: "+totalPrice);
    }
}