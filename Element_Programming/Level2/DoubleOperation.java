package Element_Programming.Level2;
import java.util.*;
public class DoubleOperation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double res1=a+b*c;
        System.out.println("a + b * c = "+res1);    
        double res2=a*b+c;
        System.out.println("a * b + c = "+res2);
        double res3=c+a/b;
        System.out.println("c + a / b = "+res3);
        double res4=a%b+c;
        System.out.println("a % b + c = "+res4);
    }
}
