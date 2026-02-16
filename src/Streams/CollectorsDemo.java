package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        //Collecting to List
        List<String> names= Arrays.asList("Jack","Jill","James","John","Teena","Oggy","Oliviya");
        List<String> ls = names.stream()
                .filter(x -> x.startsWith("J"))
                .collect(Collectors.toList());

        //Collecting to Set
        List<Integer> number=Arrays.asList(1,2,3,4,5,5,6,6,6,6,7,8,8,9);
        Set<Integer> set=number.stream().collect(Collectors.toSet());


        //Collecting to Specified Collection
       ArrayDeque<String> ad=names.stream().collect(Collectors.toCollection(()->new ArrayDeque<>()));
       //Joining Strings
        String concat_names=names.stream().map(String::toUpperCase).collect(Collectors.joining(","));



        //Summarizing Data
        //Generates the Statistical Summarry
        List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,6,6,6,7,8,8,9);
        IntSummaryStatistics collect = numbers.stream().collect(Collectors.summarizingInt(x -> x));


        //Grouping Elements
        List<String> text=Arrays.asList("java","python","Go","Rust","Ruby");
        System.out.println( text.stream().collect(Collectors.groupingBy(x->x.length())));


    }
}
