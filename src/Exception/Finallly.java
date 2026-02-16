package Exception;

public class Finallly {
    public static void main(String[] args) {

    }
    public static void div(int a,int b){
        try{
            System.out.println(a/b);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic EXCEPTION");
        }
        finally{
            System.out.println("finally");
        }
    }

}
