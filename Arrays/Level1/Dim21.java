package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class Dim21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int a[]=new int[m*n];
        int k=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[k++]=arr[i][j];
            }
        }
        System.out.println("1D array: "+Arrays.toString(a));

    }
    
}
