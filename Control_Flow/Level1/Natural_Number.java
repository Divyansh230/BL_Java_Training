package Control_Flow.Level1;
import java.util.*;
public class Natural_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num<=0){
            System.out.println("Not a Natural Number");
        }
        else{
            int sum=num*(num+1)/2;
            System.out.println("Sum of Natural Numbers: "+sum);
        }
    }
    
}
