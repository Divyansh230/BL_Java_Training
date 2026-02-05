package Methods.Level2;
import java.util.*;
//import java.util.Random;
public class Randm {
    public static void main(String[] args) {
    }
    public int[] generate4DigitRandomArray(int size){
        int arr[]=new int[size];
        Random rand = new Random();
        for(int i=0;i<size;i++){
            arr[i]=rand.nextInt(9000)+1000; 
        }
        return arr;
    }
    public double[] generateRandomDoubleArray(int size){
        double arr[]=new double[size];
        Random rand = new Random();
        for(int i=0;i<size;i++){
            arr[i]=rand.nextDouble()*100;
        }
        return arr;
    }
}
