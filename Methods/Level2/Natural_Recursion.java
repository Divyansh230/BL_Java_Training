package Methods.Level2;
import java.util.*;
public class Natural_Recursion {
    public int sum(int n){
        if(n==0)return 0;
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        Natural_Recursion obj=new Natural_Recursion();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=obj.sum(n);
        System.out.println("Sum of first " + n + " natural numbers: " + result);
    }
}
