//package Arrays;
import java.util.*;
public class Odd_Even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int odd[]=new int[n];
        int even[]=new int[n];
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            if(x%2==0){
                even[i]=x;
            }
            else{
                odd[i]=x;
            }
        }
        System.out.println("Even numbers: "+Arrays.toString(even));
        System.out.println("Odd numbers: "+Arrays.toString(odd));
    }
    
}
