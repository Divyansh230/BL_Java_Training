package Methods;

import java.util.Scanner;

public class Natural {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n=sc.nextInt();
        int sum=calculateSum(n);
        System.out.println("Sum of first " + n + " natural numbers: " + sum);
    }
    public static int calculateSum(int n) {
        return (n * (n + 1)) / 2;
    }
    
}
