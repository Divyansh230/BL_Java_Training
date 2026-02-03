package Control_Flow.Level2;

import java.util.Scanner;

public class FactorExceptItself {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //System.out.println("Factors of "+n+" except itself are:");
        int greatest=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                if(i>greatest){
                    greatest=i;
                }
            }
        }
        System.out.println(greatest);
    }
    
}
