package Methods;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tempratue=sc.nextInt();
        int windspeed=sc.nextInt();
        double windChill=calculateWindChill(tempratue,windspeed);
        System.out.println("Wind Chill: " + windChill);

    }
    public static double calculateWindChill(int t,int v) {
        if (t > 50 || v <= 3) {
            throw new IllegalArgumentException("Temperature must be less than or equal to 50°F and wind speed must be greater than 3 mph.");
        }
        return 35.74 + (0.6215 * t) - (35.75 * Math.pow(v, 0.16)) + (0.4275 * t * Math.pow(v, 0.16));
    }
    
}
