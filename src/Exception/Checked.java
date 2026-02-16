package Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Checked {
    public static void main(String[] args)throws IOException  {
    method2();
    }
    public static void  method2() throws FileNotFoundException {
        method1();
    }
    public static void method1()  {
        try{
            FileReader fr=new FileReader("a.txt");
        }
        catch(FileNotFoundException e){
            System.out.println("FILE NOT FOUND");
            throw new RuntimeException(e);
        }
    }
    public static int div(int a,int b){
        try{
            return a/b;
        }catch(ArithmeticException e){
            System.out.println("ARITHMETIC EXCEPTION");
            return -1;
        }
    }
}
