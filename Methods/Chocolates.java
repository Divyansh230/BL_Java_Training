package Methods;

import java.util.Scanner;

public class Chocolates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of chocolates: ");
        int chocolates=sc.nextInt();
        System.out.print("Enter the number of friends: ");
        int friends=sc.nextInt();
        int chocolatesPerFriend[]=calculateChocolatesPerFriend(chocolates, friends);
        System.out.println("Chocolates per friend: " + chocolatesPerFriend[0]);
        System.out.println("Remaining chocolates: " + chocolatesPerFriend[1]);

        
    }

    public static int[] calculateChocolatesPerFriend(int chocolates, int friends) {
        int chocolatesPerFriend = chocolates / friends;
        int remainingChocolates = chocolates % friends;
        return new int[]{chocolatesPerFriend, remainingChocolates};
    }
    
}
