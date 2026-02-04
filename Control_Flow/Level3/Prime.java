package Control_Flow.Level3;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=scanner.nextInt();
        boolean isPrime=true;
        if(num<=1){
            isPrime=false;
        } else {
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        System.out.println(isPrime ? "Prime" : "Not Prime");
    }
    
}
