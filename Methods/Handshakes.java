package Methods;

import java.util.Scanner;

public class Handshakes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of people: ");   
        int n=sc.nextInt();
        int handshakes=calculateHandshakes(n);
        System.out.println("Total handshakes: " + handshakes);
    }
    public static int calculateHandshakes(int n) {
        if (n < 2) {
            return 0; 
        }
        return (n * (n - 1)) / 2; 
    }
    
}
