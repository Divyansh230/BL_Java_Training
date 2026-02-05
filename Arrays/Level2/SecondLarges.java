package Arrays.Level2;

import java.util.Scanner;

public class SecondLarges {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i: arr){
            if(i>largest){
                secondLargest=largest;
                largest=i;
            }
            else if(i>secondLargest && i!=largest){
                secondLargest=i;
            }
        }

        System.out.println("Second largest element: "+secondLargest);
        System.out.println("Largest element: "+largest);
    }
    
}
