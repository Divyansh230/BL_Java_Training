package Arrays.Level2;

import java.util.Scanner;

 
public class Bonus {
   static class Initial{
    int salary;
    int years;
    public Initial(int salary, int years) {
        this.salary = salary;
        this.years = years;
    }
}
 static class Final{
    int totalAmount;
    int bonus;
    public Final(int totalAmount, int bonus) {
        this.totalAmount = totalAmount;
        this.bonus = bonus;
    }
}
    public static void main(String[] args) {
        Initial arr[]=new Initial[10];
        Final arr2[]=new Final[10];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            int salary=sc.nextInt();
            int years=sc.nextInt();
            arr[i]=new Initial(salary, years);
        }
        int index=0;
        for(Initial i:arr){
            int bonus=0;
            int totalAmount=0;
            if(i.years>5){
                 bonus=(i.salary*5)/100;
                 totalAmount=i.salary+bonus;
            }
            else{
                 bonus=(i.salary*2)/100;
                 totalAmount=i.salary+bonus;
            }
                arr2[index++]=new Final(totalAmount, bonus);
        }
        for(Final i:arr2){
            System.out.println("Total amount: "+i.totalAmount+" Bonus: "+i.bonus);
        }

    }
}
