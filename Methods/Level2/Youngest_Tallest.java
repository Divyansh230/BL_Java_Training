package Methods.Level2;

import java.util.Scanner;

public class Youngest_Tallest {
    public static String findYoungest(int age1, int age2, int age3) {
        if (age1 <= age2 && age1 <= age3) {
            return "Person 1 is the youngest.";
        } else if (age2 <= age1 && age2 <= age3) {
            return "Person 2 is the youngest.";
        } else {
            return "Person 3 is the youngest.";
        }
    }
    public static String findTallest(int height1, int height2, int height3) {
        if (height1 >= height2 && height1 >= height3) {
            return "Person 1 is the tallest.";
        } else if (height2 >= height1 && height2 >= height3) {
            return "Person 2 is the tallest.";
        } else {
            return "Person 3 is the tallest.";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age of Person 1: ");
        int age1 = sc.nextInt();
        System.out.print("Enter age of Person 2: ");
        int age2 = sc.nextInt();
        System.out.print("Enter age of Person 3: ");
        int age3 = sc.nextInt();
        System.out.print("Enter height of Person 1 (in cm): ");
        int height1 = sc.nextInt();
        System.out.print("Enter height of Person 2 (in cm): ");
        int height2 = sc.nextInt();
        System.out.print("Enter height of Person 3 (in cm): ");
        int height3 = sc.nextInt();
        String youngest = findYoungest(age1, age2, age3);
        String tallest = findTallest(height1, height2, height3);
        System.out.println(youngest);
        System.out.println(tallest);
    }
    
}
