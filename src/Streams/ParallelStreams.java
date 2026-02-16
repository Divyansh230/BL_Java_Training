package Streams;

import java.util.List;
import java.util.stream.Stream;

public class ParallelStreams {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        List<Integer> ls= Stream.iterate(1,x->x+1).limit(20000).toList();
        List<Long> factorial = ls.stream().map(ParallelStreams::factorial).toList();
        long endTime=System.currentTimeMillis();
        System.out.println("Total time taken with sequential Stream: "+(endTime-startTime)+"ms");

         startTime=System.currentTimeMillis();
       // List<Integer> ls= Stream.iterate(1,x->x+1).limit(20000).toList();
      factorial = ls.parallelStream().map(ParallelStreams::factorial).toList();
         endTime=System.currentTimeMillis();
        System.out.println("Total time taken with Parallel Stream: "+(endTime-startTime)+"ms");
    }
    private static long factorial(int n){
        int f=1;
        for(int i=2;i<=n;i++){
            f=f*i;
        }
        return f;
    }

}
