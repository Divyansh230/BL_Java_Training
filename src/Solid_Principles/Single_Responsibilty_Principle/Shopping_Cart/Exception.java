package Solid_Principles.Single_Responsibilty_Principle.Shopping_Cart;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Exception {
    public static double divide(int a, int b) {
        return 0;

    }

    public static void main(String[] args)  {
        //FileReader fr=new FileReader("abc.txt");

//        List<Integer> ls= Arrays.asList(1,2,3,4,5,10,20,55,1008);
//
//        long count=ls.stream().filter(x->x%2==0).count();
//        System.out.println(count);
        String email="divyansh@yahoo.com";
        String regex="^[a-z0-9]+@[a-z0-9]+.[a-z]$";

        Pattern pattern = Pattern.compile(regex);
        System.out.println(pattern.matcher(email).replaceAll("%"));
        System.out.println(regex);
    }
}
