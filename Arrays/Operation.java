package Arrays;

import java.util.Scanner;

public class Operation {
    static boolean isPositive(int n){
        return n>=0;
    }
    static boolean isEven(int n){
        return n%2==0;
    }
    public static void main(String[] args) {
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i: arr){
            if(isPositive(i)){
                System.out.print(i+" is Positive ");
            }
            else{
                System.out.print(i+" is Negative ");
            }

            if(isEven(i)){
                System.out.println("and Even");
            }
            else{
                System.out.println("and Odd");
            }
        }
        System.out.println((arr[0]==arr[4])?"First and Last elements are equal":(arr[0]>arr[4])?"First element is greater":"Last element is greater");
    }
    
}
