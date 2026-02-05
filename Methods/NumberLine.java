package Methods;

import java.util.Scanner;

public class NumberLine {
    public int numline(int n){
        if(n<0)return -1;
        if(n==0)return 0;
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        NumberLine obj=new NumberLine();
        int result=obj.numline(n);
        System.out.println(result);
    }
    
}
