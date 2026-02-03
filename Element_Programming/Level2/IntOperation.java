package Element_Programming.Level2;

import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int res1=a+b*c;
        System.out.println("a + b * c = "+res1);
        int res2=a*b+c;
        System.out.println("a * b + c = "+res2);
        int res3=c+a/b;
        System.out.println("c + a / b = "+res3);
        int res4=a%b+c;
        System.out.println("a % b + c = "+res4);
    }
    
}
