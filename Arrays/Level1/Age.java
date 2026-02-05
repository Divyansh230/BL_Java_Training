package Arrays;
import java.util.Scanner;
public class Age {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int age[]=new int[n];
        for(int i=0;i<n;i++){
            age[i]=sc.nextInt();
        }

        for(int i: age){
            if(i>=18){
                System.out.println("Adult");
            }
            else{
                System.out.println("Minor");
            }
        }
    }
    
}
