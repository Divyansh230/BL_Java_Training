package Methods.Level2;

import java.util.Arrays;
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to find its factors: ");
        int n=sc.nextInt();
        int factor[]=findFactors(n);
        System.out.println("Factors of " + n + " are: "+Arrays.toString(factor));
        int sum=0;
        for(int i:factor){
            sum+=i;
        }
        System.out.println("Sum of factors: "+sum);
        int p=1;
        for(int i:factor){
            p*=i;
        }
        System.out.println("Product of factors: "+p);
    }
    public static int[] findFactors(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        int factors[]=new int[count];
        int index=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                factors[index]=i;
                System.out.println(i);
                index++;
            }
        }
        return factors;
    }
    
}
