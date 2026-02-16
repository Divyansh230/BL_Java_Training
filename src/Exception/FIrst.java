package Exception;

public class FIrst {
    int id=0;
    public static void main(String[] args) {
        int number[]={10,20,30,40,40};
        int arr[]={1,2,3,0,4};

        for(int i=0;i<8;i++){
            try{
                System.out.println(div(number[i],arr[i]));
            }catch (Exception e){
                System.out.println(e);
            }

        }
    }

    public static int div(int a,int b){
        try{
            FIrst fi=null;
            fi.id=5;
            return a/b;
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException");
            return -1;
        }catch(NullPointerException e){
            System.out.println("Null Pointer Exception");
            return -1;
        }
   }


}
