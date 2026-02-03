package Control_Flow.Level1;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0;
        int s=0;
        while(true){
            a=sc.nextInt();
            if(a==0){
                break;
            }
            s+=a;
        }
        System.out.println("Sum: "+s);
    }
    
}
