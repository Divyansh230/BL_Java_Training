package Methods;

import java.util.Scanner;

public class Simple_Intrest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double principal=sc.nextDouble();
        System.out.print("Enter annual interest rate (in %): ");
        double rate=sc.nextDouble();
        System.out.print("Enter time (in years): ");
        double time=sc.nextDouble();
        double interest=calculateSimpleInterest(principal, rate, time); 
        System.out.println("Simple Interest: " + interest);
    }
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
    
}
