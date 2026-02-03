import java.util.Scanner;

public class Height {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter height in centimeters: ");
        double heightCm=sc.nextDouble();
        double inch=heightCm/2.54;
        double feet=inch/12;
        double remainingInch=inch%12;
        System.out.println("Height: "+(int)feet+" feet and "+remainingInch+" inches");
    }
    
}
