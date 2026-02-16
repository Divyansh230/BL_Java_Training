package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        //list.stream().
        System.out.println(list.stream().filter(x->x%2==0).count());

        //Creating Streams
        //1.Collections
        List<Integer> list2= Arrays.asList(1,2,3,4,5);
        Stream<Integer> stream=list2.stream();

        //2.Arrays
        String []arrays={"a","b","c","d","e","f"};
        Stream<String> stream1=Arrays.stream(arrays);

        //3.Using Stream.of
        Stream<String> stream2=Stream.of("A","B","C","D","E","F");

        //4.Infinite Streams
        Stream<Integer> stream3=Stream.generate(()->1);
        Stream.iterate(0,x->x+1).limit(10).collect(Collectors.toList());
    }
}
