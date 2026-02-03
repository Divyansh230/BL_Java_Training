package Control_Flow.Level2;

import java.util.Scanner;

public class AmarAkbarAnthonay {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age_amar=sc.nextInt();
        int age_akbar=sc.nextInt();
        int age_anthonay=sc.nextInt();

        System.out.println("Youngest Age: "+Math.min(age_amar, Math.min(age_akbar, age_anthonay)));
        int amar_hieght=sc.nextInt();
        int akbar_hieght=sc.nextInt();
        int anthonay_hieght=sc.nextInt();
        System.out.println("Tallest Hieght: "+Math.max(amar_hieght, Math.max(akbar_hieght, anthonay_hieght)));
    }
    
}
