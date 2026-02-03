package Element_Programming.Level2;
import java.util.*;
public class Division {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int dividend=sc.nextInt();
        int divisor=sc.nextInt();
        if(divisor!=0) {
            int quotient=dividend/divisor;
            System.out.println("Quotient: "+quotient);
            int reminder=dividend%divisor;
            System.out.println("Reminder: "+reminder);
        } else {
            System.out.println("Error: Division by zero");
        }
    }
    
}
