package Control_Flow.Level1;

import java.util.Scanner;

public class Smallest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("Smallest Number: "+Math.min(a, Math.min(b, c)));
    }
    
}
