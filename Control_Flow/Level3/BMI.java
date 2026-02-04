package Control_Flow.Level3;
import java.util.*;
public class BMI {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int height=sc.nextInt();
        int weight=sc.nextInt();
        double bmi=(weight*10000.0)/(height*height);
        if(bmi<18.5){
            System.out.println("Underweight");
        }
        else if(bmi>=18.5 && bmi<24.9){
            System.out.println("Normal weight");
        }
        else if(bmi>=25 && bmi<29.9){
            System.out.println("Overweight");
        }
        else{
            System.out.println("Obesity");
        }
    }
    
}
