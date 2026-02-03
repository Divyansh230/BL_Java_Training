package Element_Programming.Level2;

import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int price=sc.nextInt();
        int quantity=sc.nextInt();
        int total=price*quantity;
        System.out.println("Total Amount: "+total);
    }
    
}
