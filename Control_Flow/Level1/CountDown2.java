package Control_Flow.Level1;

import java.util.Scanner;

public class CountDown2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int counter=n;counter>=0;counter--){
            System.out.println(counter);
        }
    }
    
}
