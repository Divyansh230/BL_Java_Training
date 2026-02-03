package Control_Flow.Level2;
import java.util.Scanner;
public class MultipleWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0){
            int i=100;
            while(i>=1){
                if(i%n==0){
                    System.out.println(i);
                }
                i--;
            }
        }   
    }
    
}
