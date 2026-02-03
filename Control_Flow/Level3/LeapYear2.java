package Control_Flow.Level3;

import java.util.Scanner;

public class LeapYear2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        System.out.println(year + (((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ? " is a Leap Year" : " is not a Leap Year"));
    }
    
}
