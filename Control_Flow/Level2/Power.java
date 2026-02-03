package Control_Flow.Level2;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int exponent=sc.nextInt();  
        int result=1;
        for(int i=1;i<=exponent;i++){
            result=result*base;
        }
        System.out.println(result);
    }
    
}
