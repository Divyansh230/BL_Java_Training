package Control_Flow.Level1;
import java.util.Scanner;
public class FactorialWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f=1;
        int i=1;
        while(i<=n){
            f*=i;
            i++;
        }
        System.out.println("Factorial: "+f);
    }
    
}
