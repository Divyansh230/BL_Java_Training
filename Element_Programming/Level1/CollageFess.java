public class CollageFess {
    public static void main(String args[]){
        int annualFee=125000,discount=10;
        int discountAmount=(annualFee*discount)/100;
        int finalFee=annualFee-discountAmount;
        System.out.println("Final Collage Fee after discount: "+finalFee+"and Discount Amount: "+discountAmount);

    }
}
