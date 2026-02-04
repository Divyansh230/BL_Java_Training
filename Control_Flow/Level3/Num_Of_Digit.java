package Control_Flow.Level3;

import java.util.Scanner;

public class Num_Of_Digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.print("Enter a number: ");
        int num=sc.nextInt();

        while(num!=0){
            num/=10;
            count++;
        }
        System.out.println("Number of digits: " + count);
    }
    
}
