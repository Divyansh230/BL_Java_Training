package Control_Flow.Level1;

import java.util.Scanner;

public class Nat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        int sum2=n*(n+1)/2;
        System.out.println("Comparison: "+(sum==sum2));
    }
    
}
