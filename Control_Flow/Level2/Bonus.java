package Control_Flow.Level2;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int years=sc.nextInt();
        double salary=sc.nextDouble();
        double bonus=5;
        double totalBonus=(bonus/100)*salary*years;
        System.out.println("Bonus: "+totalBonus);
    }
    
}
