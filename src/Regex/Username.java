package Regex;

import java.util.Scanner;

public class Username {
    public static boolean isValidUserName(String name){
        String regex="^[a-zA-z][a-zA-Z0-9_]{4,14}$";
        return name.matches(regex);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String username = sc.nextLine();
        if(isValidUserName(username)){
            System.out.println("Your username is valid");
        }
        else{
            System.out.println("Your username is not valid");
        }
    }
}
