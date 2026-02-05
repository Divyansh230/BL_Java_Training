package Arrays;
import java.util.Scanner;
public class Mean_height {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int height[]=new int[11];
        for(int i=0;i<height.length;i++){
            height[i]=sc.nextInt();
        }
        int sum=0;
        for(int i: height){
            sum+=i;
        }
        System.out.println("Mean height: "+(sum/height.length));
    }
    
}
