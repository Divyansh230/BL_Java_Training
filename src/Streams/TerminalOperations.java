package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperations {
    public static void main(String[] args) {

        List<Integer> ls = Arrays.asList(1,2,3,4,5,6,7,8,9);

        // skip
        ls.stream().skip(1).collect(Collectors.toList());

        // limit
        ls.stream().limit(6).toList();

        // forEach
        ls.stream().forEach(System.out::println);

        // reduce
        System.out.println(ls.stream().reduce((a,b)->a+b).get());

        // Get the names whose length is greater than 3
        List<String> names = Arrays.asList("Ram","Shyam","Ghanshyam","Salman","Rohit","Raghavan","Tom");
        List<String> ans = names.stream().filter(x -> x.length() > 3).toList();
        System.out.println(ans);

        // Squaring and Sorting Numbers
        System.out.println(ls.stream().map(x -> x*x).sorted().toList());

        // Counting Occurrence of 'l'
        String s = "Hello World";
        System.out.println(s.chars().filter(x -> x == 'l').count());

        // toArray
        Object[] arr = Stream.of(1,2,3,4).toArray();

        // min max
        System.out.println(Stream.of(2,4,69,100).max((o1,o2)->o1-o2));
        System.out.println(Stream.of(2,4,69,100).min((o1,o2)->o1-o2));

        // flatMap (Flatten Nested List)
        List<List<String>> list = Arrays.asList(
                Arrays.asList("Banana","Grapes","Oranges"),
                Arrays.asList("Idli","Dosa","Sambhar"),
                Arrays.asList("Aloo Paratha","Chhole Bhature","Kulche paneer")
        );

        list.stream()
                .flatMap(x -> x.stream())
                .map(String::toUpperCase)
                .forEach(System.out::println);

        List<String> sentences = Arrays.asList(
                "Hello World",
                "Hum Tumme Itne Chhed krenge ki tum confuse ho jaaoge ki saans kaha se le aur paade kaha se",
                "Ek baar jo maine commitment krdi to uske baad mai apne aap ki bhi nhi sunta"
        );

        sentences.stream()
                .flatMap(x -> Arrays.stream(x.split(" ")))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
