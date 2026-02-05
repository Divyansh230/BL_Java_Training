package Methods.Level2;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter coefficient a: ");
        double a=sc.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b=sc.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c=sc.nextDouble();
        double[] roots=calculateRoots(a, b, c);
        if(roots==null) {
            System.out.println("The equation has no real roots.");
        } else if(roots.length==1) {
            System.out.println("The equation has one real root: " + roots[0]);
        } else {
            System.out.println("The equation has two real roots: " + roots[0] + " and " + roots[1]);
        }
    }
    public static double[] calculateRoots(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            return null; // No real roots
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            return new double[]{root}; // One real root
        } else {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            return new double[]{root1, root2}; // Two real roots
        }
    }

    
}
