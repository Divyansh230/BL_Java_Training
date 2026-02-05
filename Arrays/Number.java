package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        int arr[]=new int[10];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            int x=sc.nextInt();
            if(x==0)break;
            arr[i]=x;
            
        }
        System.out.println(Arrays.toString(arr));
        int sum=0;
        for(int i: arr){
            sum+=i;
        }
        System.out.println("Sum: "+sum);

    }
    
}
