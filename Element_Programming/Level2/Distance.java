package Element_Programming.Level2;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int feet=sc.nextInt();
        int yard= feet/3;
        System.out.println("Distance in yards: "+yard);
        int miles= yard/1760;
        System.out.println("Distance in miles: "+miles);
    }
    
}
