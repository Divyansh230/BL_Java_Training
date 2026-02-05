package Methods.Level2;

public class BMI {
    public static void main(String[] args) {
        double weightInKg = 70; // example weight
        double heightInMeters = 1.75; // example height
        double bmi = calculateBMI(weightInKg, heightInMeters);
        if(bmi < 18.5) {
            System.out.println("Underweight");
        } else if(bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Normal weight");
        } else if(bmi >= 25 && bmi < 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obesity");
        }
    }
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }
    
}
