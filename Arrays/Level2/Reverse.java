package Arrays.Level2;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int originalNum=n;
        int c=0;
        while(n!=0){
            n=n/10;
            c++;
        }
        int arr[]=new int[c];
        for(int i=0;i<c;i++){
            arr[i]=originalNum%10;
            originalNum=originalNum/10;
        }
        System.out.println("Reversed Number: ");
        for(int i: arr){
            System.out.print(i);
        }
    }
    
}
