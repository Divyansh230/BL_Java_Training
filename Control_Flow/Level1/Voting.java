package Control_Flow.Level1;

import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("Eligible to Vote");
        }
        else{
            System.out.println("Not Eligible to Vote");
        }
    }
    
}
