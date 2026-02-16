package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperations {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Ram","Shyam","Ghanshyam","Akshat","Akshat");
        //filter
        Stream<String> filteredStream=names.stream().filter(x->x.startsWith("A"));//No filtering at this point
        long res=filteredStream.count();
        System.out.println(res);

        //map
        names.stream().map(String::toUpperCase);

        //sorted
        Stream<String> sorted = names.stream().sorted((a,b)->a.length()-b.length());

        //Distinct
        names.stream().filter(x->x.startsWith("A")).distinct().count();

        //limit
        Stream.iterate(1,x->x+1).limit(100);

        //skip
        Stream.iterate(1,x->x+1).skip(10).limit(100);

        //peak
        //Performs action on every element as it is consumed
        Stream.iterate(1,x->x+1).skip(10).limit(100).peek(System.out::println).count();

    }
}
