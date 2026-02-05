package Methods;

import java.util.Scanner;

public class Smallest_Largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int large=largest(n1,n2,n3);
        int small=smallest(n1,n2,n3);
        System.out.println("Largest digit: "+large);
        System.out.println("Smallest digit: "+small);
    }
    public static int largest(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
    public static int smallest(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }
}
