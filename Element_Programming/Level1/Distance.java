import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int feets=sc.nextInt();
        int yards=(int)(feets/3.0);
        System.out.println("Distance in yards: "+yards);
        int mile=(int)(feets/5280.0);
        System.out.println("Distance in miles: "+mile);
    }
    
}
