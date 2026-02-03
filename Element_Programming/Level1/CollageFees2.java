import java.util.Scanner;

public class CollageFees2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter annual fee: ");
        int annualFee=sc.nextInt();
        System.out.print("Enter discount percentage: ");
        int discount=sc.nextInt();
        int discountAmount=(annualFee*discount)/100;
        int finalFee=annualFee-discountAmount;
        System.out.println("Final College Fee after discount: "+finalFee+" and Discount Amount: "+discountAmount);
        sc.close();
    }
    
}
