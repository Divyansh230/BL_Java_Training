package Methods;
import java.util.*;
public class Triangular {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt(); 
        int triangularNumber=calculateTriangularNumber(n1,n2,n3);
        System.out.println("Number of Rounds covered:"+triangularNumber);
    }
    public static int calculateTriangularNumber(int a,int b,int c) {
        int perimeter=(a+b+c)/1000;
        return 5/perimeter;
    }
    
}
