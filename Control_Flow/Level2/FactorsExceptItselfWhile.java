package Control_Flow.Level2;

import java.util.Scanner;

public class FactorsExceptItselfWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int greates=0;
        int i=1;
        while(i<n){
            if(n%i==0){
                //System.out.println(i);
                greates=i;
            }
            i++;
        }
        System.out.println(greates);
    }
    
}
