package Methods.Level2;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        //int number = scanner.nextInt();
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=scanner.nextInt();
        }
        for(int i:arr){
            System.out.println("Number: " + i);
            System.out.println("Is Even: " + isEven(i));
            System.out.println("Is Positive: " + isPositive(i));
        }

    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static boolean isPositive(int number) {
        return number >= 0;
    }
    
}
