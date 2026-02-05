package Arrays;
import java.util.*;
public class Factor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int factors[]=new int[n];
        for(int i=0;i<n;i++){
            if(i%n==0){
                factors[i]=i;
            }
        }
        System.out.println("Factors of "+n+": "+Arrays.toString(factors));
    }
    
}
