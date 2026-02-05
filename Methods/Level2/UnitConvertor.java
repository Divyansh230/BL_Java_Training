package Methods.Level2;

import java.util.Scanner;

public class UnitConvertor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value in meters: ");
        double meters=sc.nextDouble();
        double km=meters/1000;
        double miles=convertKmToMiles(km);
        System.out.println(meters + " meters = " + miles + " miles");
    }
    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }
    
}
